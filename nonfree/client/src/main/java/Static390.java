import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "Z")
	public static boolean aBoolean507 = false;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIBLjava/awt/Component;Lclient!kd;)Lclient!gq;")
	public static Class89 method6112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) Class123 arg3) {
		if (Static392.anInt7144 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(35) Class89 local35 = (Class89) Class.forName("Class89_Sub1").getDeclaredConstructor().newInstance();
			local35.anInt6779 = arg1;
			local35.anIntArray573 = new int[(Static291.aBoolean399 ? 2 : 1) * 256];
			local35.method5866(arg2);
			local35.anInt6780 = (arg1 & 0xFFFFFC00) + 1024;
			if (local35.anInt6780 > 16384) {
				local35.anInt6780 = 16384;
			}
			local35.method5868(local35.anInt6780);
			if (Static318.anInt5826 > 0 && Static178.aClass46_1 == null) {
				Static178.aClass46_1 = new Class46();
				Static178.aClass46_1.aClass123_1 = arg3;
				arg3.method3251(Static318.anInt5826, Static178.aClass46_1);
			}
			if (Static178.aClass46_1 != null) {
				if (Static178.aClass46_1.aClass89Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static178.aClass46_1.aClass89Array1[arg0] = local35;
			}
			return local35;
		} catch (@Pc(107) Throwable local107) {
			try {
				@Pc(113) Class89_Sub2 local113 = new Class89_Sub2(arg3, arg0);
				local113.anIntArray573 = new int[(Static291.aBoolean399 ? 2 : 1) * 256];
				local113.anInt6779 = arg1;
				local113.method5866(arg2);
				local113.anInt6780 = 16384;
				local113.method5868(local113.anInt6780);
				if (Static318.anInt5826 > 0 && Static178.aClass46_1 == null) {
					Static178.aClass46_1 = new Class46();
					Static178.aClass46_1.aClass123_1 = arg3;
					arg3.method3251(Static318.anInt5826, Static178.aClass46_1);
				}
				if (Static178.aClass46_1 != null) {
					if (Static178.aClass46_1.aClass89Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static178.aClass46_1.aClass89Array1[arg0] = local113;
				}
				return local113;
			} catch (@Pc(175) Throwable local175) {
				return new Class89();
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)I")
	public static int method6113() {
		@Pc(15) Class41 local15 = Static236.aClass41_55;
		synchronized (Static236.aClass41_55) {
			return Static236.aClass41_55.method827();
		}
	}
}
