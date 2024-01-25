import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class1_Sub2_Sub37 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
	private int anInt6057 = 1;

	@OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
	private int anInt6058 = 204;

	@OriginalMember(owner = "client!ug", name = "W", descriptor = "I")
	private int anInt6066 = 1;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			for (@Pc(17) int local17 = 0; local17 < Static251.anInt6509; local17++) {
				@Pc(23) int local23 = Static7.anIntArray23[local17];
				@Pc(27) int local27 = Static66.anIntArray158[arg0];
				@Pc(34) int local34 = local23 * this.anInt6057 >> 12;
				@Pc(41) int local41 = local27 * this.anInt6066 >> 12;
				@Pc(51) int local51 = local23 % (4096 / this.anInt6057) * this.anInt6057;
				@Pc(61) int local61 = local27 % (4096 / this.anInt6066) * this.anInt6066;
				if (local61 < this.anInt6058) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (this.anInt6058 > local51) {
						local11[local17] = 0;
						continue;
					}
				}
				if (this.anInt6058 > local51) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 > 0) {
						local11[local17] = 0;
						continue;
					}
				}
				local11[local17] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6057 = arg1.method3141();
		} else if (arg0 == 1) {
			this.anInt6066 = arg1.method3141();
		} else if (arg0 == 2) {
			this.anInt6058 = arg1.method3115();
		}
	}
}
