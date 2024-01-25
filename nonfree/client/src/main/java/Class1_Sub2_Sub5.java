import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!br", name = "H", descriptor = "I")
	private int anInt703 = 0;

	@OriginalMember(owner = "client!br", name = "L", descriptor = "I")
	private int anInt707 = 4096;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(28) int[] local28 = this.method5510(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static158.anInt2658; local30++) {
				@Pc(36) int local36 = local28[local30];
				if (local36 < this.anInt703) {
					local16[local30] = this.anInt703;
				} else if (this.anInt707 >= local36) {
					local16[local30] = local36;
				} else {
					local16[local30] = this.anInt707;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5504(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass228_41.method4874(arg0);
		if (super.aClass228_41.aBoolean523) {
			@Pc(25) int[][] local25 = this.method5514(arg0, 0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local25[2];
			@Pc(41) int[] local41 = local15[0];
			@Pc(45) int[] local45 = local15[1];
			@Pc(49) int[] local49 = local15[2];
			for (@Pc(51) int local51 = 0; local51 < Static158.anInt2658; local51++) {
				@Pc(57) int local57 = local29[local51];
				@Pc(61) int local61 = local33[local51];
				@Pc(65) int local65 = local37[local51];
				if (local57 < this.anInt703) {
					local41[local51] = this.anInt703;
				} else if (this.anInt707 < local57) {
					local41[local51] = this.anInt707;
				} else {
					local41[local51] = local57;
				}
				if (local61 < this.anInt703) {
					local45[local51] = this.anInt703;
				} else if (local61 > this.anInt707) {
					local45[local51] = this.anInt707;
				} else {
					local45[local51] = local61;
				}
				if (local65 < this.anInt703) {
					local49[local51] = this.anInt703;
				} else if (this.anInt707 < local65) {
					local49[local51] = this.anInt707;
				} else {
					local49[local51] = local65;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt703 = arg1.method5177();
		} else if (arg0 == 1) {
			this.anInt707 = arg1.method5177();
		} else if (arg0 == 2) {
			super.aBoolean586 = arg1.method5174() == 1;
		}
	}
}
