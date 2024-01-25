import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!lda", name = "G", descriptor = "I")
	public static int anInt5298 = -1;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIIIBLclient!qa;I)Lclient!r;")
	public static Class19 method4566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class9 arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg3;
		@Pc(12) Class19 local12 = (Class19) Static59.aClass316_9.method7799(local6);
		if (local12 == null) {
			@Pc(27) Class86 local27 = Static469.method6840(arg3, Static118.aClass160_26);
			if (local27 == null) {
				return null;
			}
			if (local27.anInt3071 < 13) {
				local27.method2795();
			}
			local12 = arg4.method7635(local27, 2055, Static117.anInt2850, 64, 768);
			Static59.aClass316_9.method7792(local6, local12);
		}
		local12 = local12.method7260((byte) 2, 2055, true);
		if (arg0 != 0) {
			local12.OA(arg0);
		}
		if (arg5 != 0) {
			local12.D(arg5);
		}
		if (arg1 != 0) {
			local12.b(arg1);
		}
		if (arg2 != 0) {
			local12.ca(0, arg2, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(III)I")
	public static int method4567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static185.anIntArray300[arg0 & 0x3] : 256;
	}
}
