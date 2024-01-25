import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
	public static int anInt6025 = 0;

	@OriginalMember(owner = "client!mr", name = "o", descriptor = "Z")
	public static boolean aBoolean466 = false;

	@OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
	public static final int anInt6028 = 328;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZI[BLclient!lj;IBII)Lclient!nea;")
	public static Class46_Sub2_Sub1 method4876(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class78_Sub3 arg2, @OriginalArg(6) int arg3) {
		if (arg2.aBoolean412 || Static166.method6223(arg0) && Static166.method6223(arg3)) {
			return new Class46_Sub2_Sub1(arg2, 3553, 6406, arg0, arg3, false, arg1, 6406);
		} else if (arg2.aBoolean436) {
			return new Class46_Sub2_Sub1(arg2, 34037, 6406, arg0, arg3, false, arg1, 6406);
		} else {
			return new Class46_Sub2_Sub1(arg2, 6406, arg0, arg3, Static122.method2187(arg0), Static122.method2187(arg3), arg1, 6406);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II[B)I")
	public static int method4877(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static420.method5960(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZLclient!ac;)Lclient!su;")
	public static Class62_Sub4 method4879(@OriginalArg(1) Class1_Sub3 arg0) {
		return new Class62_Sub4(arg0.method7975(), arg0.method7975(), arg0.method7975(), arg0.method7975(), arg0.method7975(), arg0.method7975(), arg0.method7975(), arg0.method7975(), arg0.method7919(), arg0.method7974());
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILclient!in;II)V")
	public static void method4880(@OriginalArg(0) int arg0, @OriginalArg(1) Class160 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray9 != null) {
			@Pc(13) Class1_Sub22 local13 = new Class1_Sub22();
			local13.anObjectArray1 = arg1.anObjectArray9;
			local13.aClass160_10 = arg1;
			Static451.method6311(local13);
		}
		Static422.anInt7430 = arg1.anInt4163;
		Static306.anInt4907 = arg0;
		Static299.anInt5617 = arg1.anInt4146;
		Static563.aBoolean697 = true;
		Static594.anInt9808 = arg1.anInt4199;
		Static420.anInt7401 = arg2;
		Static253.anInt4623 = arg1.anInt4205;
		Static385.anInt6906 = arg1.anInt4210;
		Static415.method5900(arg1);
	}
}
