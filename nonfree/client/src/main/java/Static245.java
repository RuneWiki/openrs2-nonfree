import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!io", name = "H", descriptor = "I")
	public static int anInt4754;

	@OriginalMember(owner = "client!io", name = "D", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_72 = new Class145(7, 6);

	@OriginalMember(owner = "client!io", name = "F", descriptor = "I")
	public static int anInt4753 = 0;

	@OriginalMember(owner = "client!io", name = "G", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_73 = new Class145(64, -1);

	@OriginalMember(owner = "client!io", name = "I", descriptor = "I")
	public static int anInt4755 = 0;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	public static void method4156() {
		Static626.aClass51_11 = null;
		Static178.anInterface18_12 = null;
		Static613.aClass13_82 = null;
		Static612.anInt8415 = -1;
		Static65.anInterface18Array1 = null;
		Static129.anInt2698 = -1;
		Static605.aClass51_10 = null;
		Static518.anInt8368 = -1;
		Static432.aClass51_9 = null;
		Static18.anIntArray38 = null;
		Static595.anInt9885 = -1;
		Static391.aClass25_3.method632();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!eca;")
	public static RuntimeException_Sub1 method4160(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString24 = local12.aString24 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(I)I")
	public static int method4162() {
		return Static417.anIntArray468 == null ? 0 : Static417.anIntArray468.length * 2;
	}
}
