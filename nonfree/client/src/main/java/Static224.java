import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!iq", name = "A", descriptor = "Lclient!jn;")
	public static Class176 aClass176_61;

	@OriginalMember(owner = "client!iq", name = "J", descriptor = "F")
	public static float aFloat132;

	@OriginalMember(owner = "client!iq", name = "M", descriptor = "Lclient!kb;")
	public static Class183 aClass183_2;

	@OriginalMember(owner = "client!iq", name = "B", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_70 = new Class173(18, 12);

	@OriginalMember(owner = "client!iq", name = "K", descriptor = "I")
	public static int anInt4124 = 2;

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(III)Z")
	public static boolean method3664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "([BZI)V")
	public static void method3665(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (Static165.aClass4_Sub11_2 == null) {
			Static165.aClass4_Sub11_2 = new Class4_Sub11(20000);
		}
		Static165.aClass4_Sub11_2.method4929(arg0, arg0.length);
		if (!arg1) {
			return;
		}
		Static582.method8265(Static165.aClass4_Sub11_2.aByteArray68);
		Static5.aClass158_Sub1Array1 = new Class158_Sub1[Static401.anInt7652];
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = Static364.anInt7050; local33 <= Static505.anInt9067; local33++) {
			@Pc(39) Class158_Sub1 local39 = Static1.method62(local33);
			if (local39 != null) {
				Static5.aClass158_Sub1Array1[local31++] = local39;
			}
		}
		Static21.aBoolean19 = false;
		Static394.aLong192 = Static574.method8210();
		Static165.aClass4_Sub11_2 = null;
	}

	@OriginalMember(owner = "client!iq", name = "i", descriptor = "(I)V")
	public static void method3666() {
		@Pc(10) Class4_Sub5_Sub16 local10 = Static219.method3587(0, 15);
		local10.method7134();
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "([BIB)[B")
	public static byte[] method3667(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) byte[] local11 = new byte[arg1];
		Static597.method3730(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!iq", name = "j", descriptor = "(I)V")
	public static void method3668() {
		if (Static203.anInt3855 == 9) {
			Static285.method5604(5);
		} else if (Static203.anInt3855 == 5 || Static203.anInt3855 == 6) {
			Static285.method5604(3);
		} else if (Static203.anInt3855 == 12) {
			Static285.method5604(3);
			return;
		}
	}
}
