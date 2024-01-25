import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bs", name = "A", descriptor = "Lclient!nq;")
	public static Class144 aClass144_9;

	@OriginalMember(owner = "client!bs", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "client!bs", name = "I", descriptor = "Lclient!nq;")
	public static Class144 aClass144_10;

	@OriginalMember(owner = "client!bs", name = "z", descriptor = "I")
	public static int anInt584 = 20;

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "(B)V")
	public static void method457() {
		if (Static247.anInt4959 < 0) {
			Static307.anInt4795 = -1;
			Static155.anInt2944 = -1;
			Static247.anInt4959 = 0;
		}
		if (Static247.anInt4959 > Static271.anInt4331) {
			Static307.anInt4795 = -1;
			Static247.anInt4959 = Static271.anInt4331;
			Static155.anInt2944 = -1;
		}
		if (Static140.anInt2591 < 0) {
			Static155.anInt2944 = -1;
			Static307.anInt4795 = -1;
			Static140.anInt2591 = 0;
		}
		if (Static271.anInt4338 < Static140.anInt2591) {
			Static140.anInt2591 = Static271.anInt4338;
			Static307.anInt4795 = -1;
			Static155.anInt2944 = -1;
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!ms;B)Lclient!ms;")
	public static Class137 method458(@OriginalArg(0) Class137 arg0) {
		@Pc(6) Class137 local6 = Static42.method642(arg0);
		if (local6 == null) {
			local6 = arg0.aClass137_12;
		}
		return local6;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II[B)I")
	public static int method459(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static55.method826(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(II)Lclient!af;")
	public static Class6 method460(@OriginalArg(0) int arg0) {
		@Pc(5) Class26 local5 = Static276.aClass26_50;
		@Pc(14) Class6 local14;
		synchronized (Static276.aClass26_50) {
			local14 = (Class6) Static276.aClass26_50.method332((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(38) byte[] local38 = Static342.aClass144_111.method3896(arg0, 3);
		local14 = new Class6();
		if (local38 != null) {
			local14.method26(new Class11_Sub25(local38));
		}
		@Pc(53) Class26 local53 = Static276.aClass26_50;
		synchronized (Static276.aClass26_50) {
			Static276.aClass26_50.method330((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "(B)V")
	public static void method461() {
		@Pc(5) Class26 local5 = Static253.aClass26_45;
		synchronized (Static253.aClass26_45) {
			Static253.aClass26_45.method328();
		}
		local5 = Static11.aClass26_1;
		synchronized (Static11.aClass26_1) {
			Static11.aClass26_1.method328();
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IZIIIB)V")
	public static void method462(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1) {
			Static313.method5276();
		}
		if (Static29.aFrame1 != null && (arg0 != 3 || Static9.anInt151 != arg3 || arg2 != Static285.anInt5644)) {
			Static320.method5313(Static29.aFrame1, Static77.aClass118_7);
			Static29.aFrame1 = null;
		}
		if (arg0 == 3 && Static29.aFrame1 == null) {
			Static29.aFrame1 = Static89.method1297(0, arg3, Static77.aClass118_7, arg2);
			if (Static29.aFrame1 != null) {
				Static9.anInt151 = arg3;
				Static285.anInt5644 = arg2;
				Static38.method553(Static77.aClass118_7);
			}
		}
		if (arg0 == 3 && Static29.aFrame1 == null) {
			method462(Static70.anInt1316, true, -1, -1, arg4);
			return;
		}
		@Pc(82) Container local82;
		@Pc(95) Insets local95;
		if (Static29.aFrame1 != null) {
			Static264.anInt5404 = arg3;
			local82 = Static29.aFrame1;
			Static319.anInt6199 = arg2;
		} else if (Static241.aFrame2 == null) {
			local82 = Static77.aClass118_7.anApplet1;
			Static264.anInt5404 = local82.getSize().width;
			Static319.anInt6199 = local82.getSize().height;
		} else {
			local95 = Static241.aFrame2.getInsets();
			Static264.anInt5404 = Static241.aFrame2.getSize().width - local95.right - local95.left;
			@Pc(113) int local113 = local95.bottom + local95.top;
			Static319.anInt6199 = Static241.aFrame2.getSize().height - local113;
			local82 = Static241.aFrame2;
		}
		@Pc(157) int local157;
		if (arg0 == 1) {
			Static54.anInt1024 = 0;
			Static79.anInt5259 = 503;
			Static343.anInt6572 = (Static264.anInt5404 - 765) / 2;
			Static164.anInt3090 = 765;
		} else if (Static355.anInt6753 < 96 && Static74.anInt1413 == 0) {
			local157 = Static264.anInt5404 <= 1024 ? Static264.anInt5404 : 1024;
			Static164.anInt3090 = local157;
			@Pc(168) int local168 = Static319.anInt6199 > 768 ? 768 : Static319.anInt6199;
			Static343.anInt6572 = (Static264.anInt5404 - local157) / 2;
			Static54.anInt1024 = 0;
			Static79.anInt5259 = local168;
		} else {
			Static164.anInt3090 = Static264.anInt5404;
			Static343.anInt6572 = 0;
			Static54.anInt1024 = 0;
			Static79.anInt5259 = Static319.anInt6199;
		}
		if (Static278.anInt6305 != 0) {
			@Pc(204) boolean local204;
			if (Static164.anInt3090 < 1024 && Static79.anInt5259 < 768) {
				local204 = true;
			} else {
				local204 = false;
			}
		}
		if (arg1) {
			Static156.method2520(Static74.anInt1413);
		} else {
			Static34.aCanvas1.setSize(Static164.anInt3090, Static79.anInt5259);
			if (Static107.aClass129_4 != null) {
				Static107.aClass129_4.method4974();
			}
			if (Static241.aFrame2 == local82) {
				local95 = Static241.aFrame2.getInsets();
				Static34.aCanvas1.setLocation(local95.left + Static343.anInt6572, Static54.anInt1024 + local95.top);
			} else {
				Static34.aCanvas1.setLocation(Static343.anInt6572, Static54.anInt1024);
			}
		}
		if (arg0 >= 2) {
			Static320.aBoolean408 = true;
		} else {
			Static320.aBoolean408 = false;
		}
		if (Static270.anInt5491 != -1) {
			Static219.method3921(true);
		}
		if (Static291.aClass156_103 != null && (Static245.anInt6561 == 30 || Static245.anInt6561 == 25)) {
			Static53.method800();
		}
		for (local157 = 0; local157 < 100; local157++) {
			Static292.aBooleanArray22[local157] = true;
		}
		Static153.aBoolean190 = true;
	}

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)V")
	public static void method463() {
		Static34.anIntArray47 = Static89.method1291(0.4F);
	}
}
