import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!ro", name = "K", descriptor = "I")
	public static int anInt5702;

	@OriginalMember(owner = "client!ro", name = "N", descriptor = "[I")
	public static int[] anIntArray461;

	@OriginalMember(owner = "client!ro", name = "V", descriptor = "Lclient!lh;")
	public static Class120 aClass120_5;

	@OriginalMember(owner = "client!ro", name = "L", descriptor = "I")
	public static int anInt5703 = 0;

	@OriginalMember(owner = "client!ro", name = "X", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13] };

	@OriginalMember(owner = "client!ro", name = "Y", descriptor = "[Lclient!om;")
	public static final Class4_Sub1_Sub16[] aClass4_Sub1_Sub16Array9 = new Class4_Sub1_Sub16[14];

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BZ)V")
	public static void method4829(@OriginalArg(1) boolean arg0) {
		Static320.aClass4_Sub7_Sub1_3.method1237(52);
		for (@Pc(18) Class4_Sub8 local18 = (Class4_Sub8) Static38.aClass198_5.method5268(); local18 != null; local18 = (Class4_Sub8) Static38.aClass198_5.method5263()) {
			if (!local18.method5670()) {
				local18 = (Class4_Sub8) Static38.aClass198_5.method5268();
				if (local18 == null) {
					break;
				}
			}
			if (local18.anInt1671 == 0) {
				Static137.method2730(arg0, local18, true);
			}
		}
		if (Static251.aClass72_16 != null) {
			Static238.method4097(Static251.aClass72_16);
			Static251.aClass72_16 = null;
		}
	}

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "(I)Lclient!hq;")
	public static Class17_Sub4 method4830() {
		@Pc(16) Class17_Sub4 local16 = (Class17_Sub4) Static79.aClass204_5.method5356();
		if (local16 == null) {
			return new Class17_Sub4();
		} else {
			Static154.anInt3459--;
			return local16;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4831(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static16.method348(Static327.method5371(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}
}
