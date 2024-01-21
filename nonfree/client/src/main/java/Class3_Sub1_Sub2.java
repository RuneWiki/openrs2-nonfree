import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public abstract class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!nd", name = "fb", descriptor = "[I")
	public static int[] anIntArray331 = new int[256];

	@OriginalMember(owner = "client!nd", name = "pb", descriptor = "I")
	public int anInt3141 = 1000;

	static {
		for (@Pc(26) int local26 = 0; local26 < 256; local26++) {
			@Pc(29) int local29 = local26;
			for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
				if ((local29 & 0x1) == 1) {
					local29 = local29 >>> 1 ^ 0xEDB88320;
				} else {
					local29 >>>= 0x1;
				}
			}
			anIntArray331[local26] = local29;
		}
	}

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "(B)Lclient!t;")
	public Class3_Sub1_Sub2_Sub6 method2028() {
		return null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class3_Sub1_Sub2_Sub6 local7 = this.method2028();
		if (local7 != null) {
			this.anInt3141 = local7.anInt3141;
			local7.method2029(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}
}
