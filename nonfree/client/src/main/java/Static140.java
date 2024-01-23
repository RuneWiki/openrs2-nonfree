import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
	public static int anInt3030;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
	public static int anInt3032;

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
	public static int anInt3034;

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "[S")
	public static short[] aShortArray51;

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "[[[Lclient!pi;")
	public static Class1_Sub26[][][] aClass1_Sub26ArrayArrayArray2;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString175 = "yellow:";

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "J")
	public static volatile long aLong113 = 0L;

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "Lclient!qc;")
	public static Class135 aClass135_14 = new Class135(50);

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
	public static int anInt3033 = 0;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString176 = "Cancel";

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)V")
	public static void method2340(@OriginalArg(1) int arg0) {
		for (@Pc(15) Class1 local15 = Static263.aClass70_19.method2074(); local15 != null; local15 = Static263.aClass70_19.method2079()) {
			if ((long) arg0 == (local15.aLong205 >> 48 & 0xFFFFL)) {
				local15.method4441();
			}
		}
	}
}
