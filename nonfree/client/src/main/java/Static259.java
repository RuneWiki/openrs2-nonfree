import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "Z")
	public static boolean aBoolean420 = false;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "J")
	public static long aLong119 = 0L;

	@OriginalMember(owner = "client!jf", name = "C", descriptor = "[Lclient!f;")
	public static final Class102[] aClass102Array1 = new Class102[2048];

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
	public static void method4749() {
		Static443.aClass125Array1 = new Class125[50];
		Static395.anInt7569 = 0;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!kg;")
	public static RuntimeException_Sub1 method4750(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString65 = local12.aString65 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB[ILclient!ff;)V")
	public static void method4752(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class3_Sub1_Sub3_Sub3_Sub1 arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg2.anIntArray349 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg2.anIntArray349.length; local12++) {
				if (arg2.anIntArray349[local12] != arg1[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg2.anInt6079 != -1) {
				@Pc(48) Class130 local48 = Static195.aClass193_1.method5573(arg2.anInt6079);
				@Pc(51) int local51 = local48.anInt4705;
				if (local51 == 1) {
					arg2.anInt6037 = 0;
					arg2.anInt6029 = arg0;
					arg2.anInt6086 = 0;
					arg2.anInt6063 = 0;
					arg2.anInt6046 = 1;
					if (!arg2.aBoolean454) {
						Static609.method8918(arg2, arg2.anInt6063, local48);
					}
				}
				if (local51 == 2) {
					arg2.anInt6086 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg1.length; local12++) {
			if (arg1[local12] != -1) {
				local10 = false;
			}
			if (arg2.anIntArray349 == null || arg2.anIntArray349[local12] == -1 || Static195.aClass193_1.method5573(arg1[local12]).anInt4699 >= Static195.aClass193_1.method5573(arg2.anIntArray349[local12]).anInt4699) {
				arg2.anInt6029 = arg0;
				arg2.anInt6103 = arg2.anInt6102;
				arg2.anIntArray349 = arg1;
			}
		}
		if (local10) {
			arg2.anIntArray349 = arg1;
			arg2.anInt6029 = arg0;
			arg2.anInt6103 = arg2.anInt6102;
		}
	}
}
