import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!ru", name = "J", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!ru", name = "O", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!ru", name = "F", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_81 = new Class269(21, 4);

	@OriginalMember(owner = "client!ru", name = "M", descriptor = "Z")
	public static boolean aBoolean631 = false;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZLjava/io/File;)[B")
	public static byte[] method7130(@OriginalArg(1) File arg0) {
		return Static16.method325((int) arg0.length(), arg0);
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)I")
	public static int method7132() {
		if (Static275.aFrame2 == null) {
			return Static402.aBoolean478 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)I")
	public static int method7133(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "([BIIB)[B")
	public static byte[] method7134(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static649.method4863(arg0, arg1, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(II)I")
	public static int method7135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static588.aShortArrayArray31 == null ? 0 : Static588.aShortArrayArray31[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method7136(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(25) String local25 = Static70.method1355(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static449.anInt7920; local30++) {
			@Pc(35) String local35 = Static7.aStringArray3[local30];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static70.method1355(local35);
			if (local35 != null && local35.equals(local25)) {
				Static449.anInt7920--;
				for (@Pc(59) int local59 = local30; local59 < Static449.anInt7920; local59++) {
					Static7.aStringArray3[local59] = Static7.aStringArray3[local59 + 1];
					Static17.aStringArray4[local59] = Static17.aStringArray4[local59 + 1];
					Static525.aStringArray38[local59] = Static525.aStringArray38[local59 + 1];
					Static417.aStringArray29[local59] = Static417.aStringArray29[local59 + 1];
					Static575.aBooleanArray48[local59] = Static575.aBooleanArray48[local59 + 1];
				}
				Static207.anInt4343 = Static44.anInt975;
				@Pc(115) Class2_Sub50 local115 = Static595.method8194(Static610.aClass310_2, Static115.aClass269_26);
				local115.aClass2_Sub34_Sub2_2.method6894(Static163.method3038(arg0));
				local115.aClass2_Sub34_Sub2_2.method6918(arg0);
				Static311.method4754(local115);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "(B)V")
	public static void method7137() {
		@Pc(17) Class2_Sub50 local17 = Static595.method8194(Static610.aClass310_2, Static265.aClass269_53);
		local17.aClass2_Sub34_Sub2_2.method6894(method7132());
		local17.aClass2_Sub34_Sub2_2.method6854(Static571.anInt9399);
		local17.aClass2_Sub34_Sub2_2.method6854(Static585.anInt9606);
		local17.aClass2_Sub34_Sub2_2.method6894(Static404.aClass2_Sub13_2.aClass33_Sub9_2.method3852());
		Static311.method4754(local17);
	}
}
