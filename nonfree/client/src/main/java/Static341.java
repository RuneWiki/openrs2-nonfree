import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "Lclient!gga;")
	public static final Class117 aClass117_4 = new Class117();

	@OriginalMember(owner = "client!nca", name = "e", descriptor = "I")
	public static int anInt6623 = 0;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)V")
	public static void method5551() {
		Static430.aClient1.method1153();
		Static145.method2782();
		Static454.anInt8310 = 0;
		Static401.aClass362_169 = null;
		Static395.anInt7584 = 0;
		Static370.aClass362_153 = null;
		Static319.aClass4_Sub11_Sub1_2.anInt5831 = 0;
		Static400.aClass362_168 = null;
		Static197.method3385();
		Static493.anInt8959 = 0;
		Static247.anInt4517 = 0;
		Static238.anInt4334 = 0;
		Static517.aString89 = null;
		Static126.aClass181Array1 = null;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IB)I")
	public static int method5553(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!lt;B)V")
	public static void method5554(@OriginalArg(0) Class1_Sub8 arg0) {
		arg0.aClass1_Sub4_2 = null;
		@Pc(16) int local16 = arg0.aClass1_Sub9Array1.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			arg0.aClass1_Sub9Array1[local18].aBoolean461 = false;
		}
		@Pc(32) Class136[] local32 = Class34.aClass136Array1;
		synchronized (Class34.aClass136Array1) {
			if (Class34.aClass136Array1.length > local16 && Static212.anIntArray191[local16] < 200) {
				Class34.aClass136Array1[local16].method3289(arg0);
				@Pc(55) int local55 = Static212.anIntArray191[local16]++;
			}
		}
	}
}
