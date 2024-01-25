import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class6_Sub3_Sub24 extends Class6_Sub3 {

	@OriginalMember(owner = "client!oc", name = "D", descriptor = "Z")
	private boolean aBoolean425 = true;

	@OriginalMember(owner = "client!oc", name = "F", descriptor = "Z")
	private boolean aBoolean426 = true;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7822(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass103_41.method2141(arg0);
		if (super.aClass103_41.aBoolean172) {
			@Pc(36) int[][] local36 = this.method7823(0, this.aBoolean425 ? Static252.anInt4135 - arg0 : arg0);
			@Pc(40) int[] local40 = local36[0];
			@Pc(44) int[] local44 = local36[1];
			@Pc(48) int[] local48 = local36[2];
			@Pc(52) int[] local52 = local11[0];
			@Pc(56) int[] local56 = local11[1];
			@Pc(60) int[] local60 = local11[2];
			@Pc(65) int local65;
			if (this.aBoolean426) {
				for (local65 = 0; local65 < Static447.anInt8568; local65++) {
					local52[local65] = local40[Static392.anInt6966 - local65];
					local56[local65] = local44[Static392.anInt6966 - local65];
					local60[local65] = local48[Static392.anInt6966 - local65];
				}
			} else {
				for (local65 = 0; local65 < Static447.anInt8568; local65++) {
					local52[local65] = local40[local65];
					local56[local65] = local44[local65];
					local60[local65] = local48[local65];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.aBoolean426 = arg1.method6041() == 1;
		} else if (arg0 == 1) {
			this.aBoolean425 = arg1.method6041() == 1;
		} else if (arg0 == 2) {
			super.aBoolean668 = arg1.method6041() == 1;
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			@Pc(36) int[] local36 = this.method7824(0, this.aBoolean425 ? Static252.anInt4135 - arg0 : arg0);
			if (this.aBoolean426) {
				for (@Pc(49) int local49 = 0; local49 < Static447.anInt8568; local49++) {
					local19[local49] = local36[Static392.anInt6966 - local49];
				}
			} else {
				Static585.method3077(local36, 0, local19, 0, Static447.anInt8568);
			}
		}
		return local19;
	}
}
