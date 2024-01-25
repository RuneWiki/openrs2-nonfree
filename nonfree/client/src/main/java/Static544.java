import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!th", name = "g", descriptor = "[I")
	public static int[] anIntArray571;

	@OriginalMember(owner = "client!th", name = "u", descriptor = "Lclient!mba;")
	public static final Class216 aClass216_66 = new Class216();

	@OriginalMember(owner = "client!th", name = "w", descriptor = "I")
	public static int anInt9130 = 0;

	@OriginalMember(owner = "client!th", name = "y", descriptor = "[I")
	public static final int[] anIntArray572 = new int[6];

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IILclient!wn;I)Lclient!fi;")
	public static Class3_Sub7_Sub10 method7822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class379 arg2) {
		@Pc(10) int local10 = arg0 << 10 | arg2.anInt10126;
		@Pc(19) Class3_Sub7_Sub10 local19 = (Class3_Sub7_Sub10) Static219.aClass282_2.method6855((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(33) byte[] local33 = Static22.aClass343_17.method8143(Static22.aClass343_17.method8136(local10));
		if (local33 == null) {
			local10 = arg2.anInt10126 | arg1 + 65536 << 10;
			local19 = (Class3_Sub7_Sub10) Static219.aClass282_2.method6855((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local33 = Static22.aClass343_17.method8143(Static22.aClass343_17.method8136(local10));
			if (local33 == null) {
				local10 = arg2.anInt10126 | 0x3FFFC00;
				local19 = (Class3_Sub7_Sub10) Static219.aClass282_2.method6855((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local33 = Static22.aClass343_17.method8143(Static22.aClass343_17.method8136(local10));
				if (local33 == null) {
					return null;
				} else if (local33.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static280.method4570(local33);
					} catch (@Pc(198) Exception local198) {
						throw new RuntimeException(local198.getMessage() + " S: " + local10);
					}
					local19.aClass379_3 = arg2;
					Static219.aClass282_2.method6850(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local33.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static280.method4570(local33);
				} catch (@Pc(123) Exception local123) {
					throw new RuntimeException(local123.getMessage() + " S: " + local10);
				}
				local19.aClass379_3 = arg2;
				Static219.aClass282_2.method6850(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local33.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static280.method4570(local33);
			} catch (@Pc(47) Exception local47) {
				throw new RuntimeException(local47.getMessage() + " S: " + local10);
			}
			local19.aClass379_3 = arg2;
			Static219.aClass282_2.method6850(local19, (long) local10 << 16);
			return local19;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(B)Z")
	public static boolean method7828() {
		@Pc(10) Class3_Sub19 local10 = (Class3_Sub19) Static541.aClass216_65.method5457();
		if (local10 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < local10.anInt3284; local16++) {
			if (local10.aClass174Array2[local16] != null && local10.aClass174Array2[local16].anInt5121 == 0) {
				return false;
			}
			if (local10.aClass174Array1[local16] != null && local10.aClass174Array1[local16].anInt5121 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V")
	public static void method7829(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 != 8 && arg3 != 16) {
			@Pc(23) Class351 local23 = Static567.aClass351ArrayArrayArray4[arg1][arg2][arg0];
			if (local23 != null) {
				if (arg3 == 1) {
					local23.aShort116 = 0;
				} else if (arg3 == 2) {
					local23.aShort119 = 0;
				}
			}
			Static405.method6309();
			return;
		}
		for (@Pc(44) int local44 = 0; local44 < Static23.anInt340; local44++) {
			@Pc(50) Class153 local50 = Static129.aClass153Array1[local44];
			if (local50.aByte61 == arg3 && arg2 == local50.aShort50 && local50.aShort53 == arg0 || arg2 == local50.aShort51 && local50.aShort53 == arg0) {
				if (local44 != Static23.anInt340) {
					Static651.method752(Static129.aClass153Array1, local44 + 1, Static129.aClass153Array1, local44, Static129.aClass153Array1.length - local44 - 1);
				}
				Static23.anInt340--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
	public static void method7831(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub7_Sub5 local12 = Static138.method2377(4, arg0);
		local12.method1473();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;IIZLjava/lang/String;)V")
	public static void method7835(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		Static514.method7502(arg2, true, arg3, -1, arg0, arg1);
	}
}
