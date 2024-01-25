import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
	public static int anInt3707;

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "Lclient!mb;")
	public static Class132 aClass132_13;

	@OriginalMember(owner = "client!mp", name = "n", descriptor = "Lclient!dj;")
	public static Class49 aClass49_7;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString157 = "Loading sprites - ";

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "Z")
	public static final boolean aBoolean283 = false;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
	public static int anInt3712 = 0;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
	public static void method3638() {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = -1; local7 < anInt3712; local7++) {
			if (local7 == -1) {
				local15 = 2047;
			} else {
				local15 = Static183.anIntArray400[local7];
			}
			@Pc(25) Class44_Sub4_Sub4_Sub1 local25 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local15];
			if (local25 != null && local25.anInt5106 > 0) {
				local25.anInt5106--;
				if (local25.anInt5106 == 0) {
					local25.aString219 = null;
				}
			}
		}
		for (local15 = 0; local15 < Static149.anInt2759; local15++) {
			@Pc(65) int local65 = Static191.anIntArray428[local15];
			@Pc(69) Class44_Sub4_Sub4_Sub2 local69 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local65];
			if (local69 != null && local69.anInt5106 > 0) {
				local69.anInt5106--;
				if (local69.anInt5106 == 0) {
					local69.aString219 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(B)V")
	public static void method3639() {
		for (@Pc(10) Class6_Sub39 local10 = (Class6_Sub39) Static264.aClass211_31.method5594(); local10 != null; local10 = (Class6_Sub39) Static264.aClass211_31.method5582()) {
			if (local10.aBoolean396) {
				local10.method5319();
			}
		}
		for (@Pc(30) Class6_Sub39 local30 = (Class6_Sub39) Static113.aClass211_17.method5594(); local30 != null; local30 = (Class6_Sub39) Static113.aClass211_17.method5582()) {
			if (local30.aBoolean396) {
				local30.method5319();
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
	public static void method3640() {
		Static239.aClass70_109.method1399();
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZLclient!ja;)V")
	public static void method3641(@OriginalArg(1) Class81 arg0) {
		if (Static10.aBoolean19) {
			Static21.method305(arg0);
		} else {
			Static289.method4942(arg0);
		}
	}
}
