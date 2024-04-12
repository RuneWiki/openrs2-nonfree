import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class41 {

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Lclient!o;")
	public static Class40 aClass40_512 = Static12.method257("Earlier today");

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray27 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false };

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
	public static int anInt1801 = 0;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "Lclient!o;")
	public static Class40 aClass40_515 = Static12.method257("earlier today");

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "Z")
	public static boolean aBoolean144 = false;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "Lclient!o;")
	public static Class40 aClass40_513 = Static12.method257("Loaded textures");

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
	public static int anInt1800 = 0;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "Lclient!o;")
	public static Class40 aClass40_516 = Static12.method257("Loaded title screen");

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "Lclient!o;")
	public static Class40 aClass40_517 = Static12.method257("Loaded interfaces");

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "Lclient!o;")
	public static Class40 aClass40_514 = Static12.method257("@yel@Classic");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "Lclient!o;")
	public static Class40 aClass40_511 = Static12.method257("*6nin your message centre)3");

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "Lclient!o;")
	public static Class40 aClass40_518 = Static12.method257("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "Lclient!o;")
	public static Class40 aClass40_519 = Static12.method257("slide:");

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "Lclient!ka;")
	public static Class30 aClass30_1 = new Class30();

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "Lclient!o;")
	public static Class40 aClass40_520 = Static12.method257("mapscene");

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "Lclient!o;")
	public static Class40 aClass40_521 = Static12.method257("logo");

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "[I")
	public static int[] anIntArray408 = new int[2048];

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Lclient!ja;")
	private final Class2_Sub2 aClass2_Sub2_43 = new Class2_Sub2();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ja;B)V", line = 3)
	public void method1201(@OriginalArg(0) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub2_60 != null) {
			arg0.method1637();
		}
		arg0.aClass2_Sub2_59 = this.aClass2_Sub2_43;
		arg0.aClass2_Sub2_60 = this.aClass2_Sub2_43.aClass2_Sub2_60;
		arg0.aClass2_Sub2_60.aClass2_Sub2_59 = arg0;
		arg0.aClass2_Sub2_59.aClass2_Sub2_60 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)Lclient!ja;", line = 22)
	public Class2_Sub2 method1202() {
		@Pc(7) Class2_Sub2 local7 = this.aClass2_Sub2_43.aClass2_Sub2_59;
		if (this.aClass2_Sub2_43 == local7) {
			return null;
		} else {
			local7.method1637();
			return local7;
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)Lclient!ja;", line = 59)
	public Class2_Sub2 method1203() {
		@Pc(12) Class2_Sub2 local12 = this.aClass2_Sub2_43.aClass2_Sub2_59;
		return local12 == this.aClass2_Sub2_43 ? null : local12;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLclient!ja;)V", line = 113)
	public void method1204(@OriginalArg(1) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub2_60 != null) {
			arg0.method1637();
		}
		arg0.aClass2_Sub2_60 = this.aClass2_Sub2_43;
		arg0.aClass2_Sub2_59 = this.aClass2_Sub2_43.aClass2_Sub2_59;
		arg0.aClass2_Sub2_60.aClass2_Sub2_59 = arg0;
		arg0.aClass2_Sub2_59.aClass2_Sub2_60 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V", line = 129)
	public Class41() {
		this.aClass2_Sub2_43.aClass2_Sub2_59 = this.aClass2_Sub2_43;
		this.aClass2_Sub2_43.aClass2_Sub2_60 = this.aClass2_Sub2_43;
	}
}
