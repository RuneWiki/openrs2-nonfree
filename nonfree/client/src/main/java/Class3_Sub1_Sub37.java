import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!waa")
public final class Class3_Sub1_Sub37 extends Class3_Sub1 {

	@OriginalMember(owner = "client!waa", name = "D", descriptor = "I")
	private int anInt10924 = 204;

	@OriginalMember(owner = "client!waa", name = "J", descriptor = "I")
	private int anInt10925 = 1;

	@OriginalMember(owner = "client!waa", name = "H", descriptor = "I")
	private int anInt10929 = 1;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			for (@Pc(25) int local25 = 0; local25 < Static379.anInt5859; local25++) {
				@Pc(31) int local31 = Static497.anIntArray579[local25];
				@Pc(35) int local35 = Static121.anIntArray145[arg0];
				@Pc(42) int local42 = this.anInt10925 * local31 >> 12;
				@Pc(49) int local49 = this.anInt10929 * local35 >> 12;
				@Pc(59) int local59 = local31 % (4096 / this.anInt10925) * this.anInt10925;
				@Pc(69) int local69 = local35 % (4096 / this.anInt10929) * this.anInt10929;
				if (local69 < this.anInt10924) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local19[local25] = 0;
						continue;
					}
					if (local59 < this.anInt10924) {
						local19[local25] = 0;
						continue;
					}
				}
				if (this.anInt10924 > local59) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 > 0) {
						local19[local25] = 0;
						continue;
					}
				}
				local19[local25] = 4096;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt10925 = arg1.method2048(255);
		} else if (arg0 == 1) {
			this.anInt10929 = arg1.method2048(255);
		} else if (arg0 == 2) {
			this.anInt10924 = arg1.method2028(-14795);
		}
	}
}
