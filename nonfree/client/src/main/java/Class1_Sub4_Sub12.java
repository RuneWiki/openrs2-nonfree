import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class1_Sub4_Sub12 extends Class1_Sub4 {

	@OriginalMember(owner = "client!go", name = "H", descriptor = "I")
	private int anInt1979 = 1;

	@OriginalMember(owner = "client!go", name = "L", descriptor = "I")
	private int anInt1983 = 1;

	@OriginalMember(owner = "client!go", name = "O", descriptor = "I")
	private int anInt1985 = 204;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1983 = arg0.method1378();
		} else if (arg1 == 1) {
			this.anInt1979 = arg0.method1378();
		} else if (arg1 == 2) {
			this.anInt1985 = arg0.method1386();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			for (@Pc(26) int local26 = 0; local26 < Static182.anInt3492; local26++) {
				@Pc(33) int local33 = Static250.anIntArray398[arg0];
				@Pc(40) int local40 = this.anInt1979 * local33 >> 12;
				@Pc(50) int local50 = this.anInt1979 * (local33 % (4096 / this.anInt1979));
				@Pc(54) int local54 = Static279.anIntArray454[local26];
				@Pc(61) int local61 = this.anInt1983 * local54 >> 12;
				@Pc(71) int local71 = local54 % (4096 / this.anInt1983) * this.anInt1983;
				if (this.anInt1985 > local50) {
					for (local61 -= local40; local61 < 0; local61 += 4) {
					}
					while (local61 > 3) {
						local61 -= 4;
					}
					if (local61 != 1) {
						local19[local26] = 0;
						continue;
					}
					if (local71 < this.anInt1985) {
						local19[local26] = 0;
						continue;
					}
				}
				if (this.anInt1985 > local71) {
					for (local61 -= local40; local61 < 0; local61 += 4) {
					}
					while (local61 > 3) {
						local61 -= 4;
					}
					if (local61 > 0) {
						local19[local26] = 0;
						continue;
					}
				}
				local19[local26] = 4096;
			}
		}
		return local19;
	}
}
