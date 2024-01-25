import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
	public static int anInt5096 = 0;

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "Ljava/lang/String;")
	public static final String aString192 = "glow1:";

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "Z")
	public static boolean aBoolean340 = true;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IB)Lclient!qh;")
	public static Class169 method4558(@OriginalArg(0) int arg0) {
		@Pc(13) Class11 local13 = Static5.aClass11_95;
		@Pc(22) Class169 local22;
		synchronized (Static5.aClass11_95) {
			local22 = (Class169) Static5.aClass11_95.method209((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(42) byte[] local42 = Static7.aClass143_7.method3745(Static336.method5778(arg0), Static351.method5918(arg0));
		local22 = new Class169();
		if (local42 != null) {
			local22.method4483(new Class14_Sub4(local42));
		}
		@Pc(57) Class11 local57 = Static5.aClass11_95;
		synchronized (Static5.aClass11_95) {
			Static5.aClass11_95.method219((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IBI)I")
	public static int method4559(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(32) int local32 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local32;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZI)Lclient!tb;")
	public static Class192 method4561(@OriginalArg(1) int arg0) {
		@Pc(5) Class11 local5 = Static178.aClass11_79;
		@Pc(14) Class192 local14;
		synchronized (Static178.aClass11_79) {
			local14 = (Class192) Static178.aClass11_79.method209((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(39) byte[] local39 = Static129.aClass143_60.method3745(Static247.method4305(arg0), Static99.method2226(arg0));
		local14 = new Class192();
		local14.anInt5817 = arg0;
		if (local39 != null) {
			local14.method5283(new Class14_Sub4(local39));
		}
		local14.method5278();
		@Pc(60) Class11 local60 = Static178.aClass11_79;
		synchronized (Static178.aClass11_79) {
			Static178.aClass11_79.method219((long) arg0, local14);
			return local14;
		}
	}
}
