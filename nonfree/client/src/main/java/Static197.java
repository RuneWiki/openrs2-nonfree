import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!hu", name = "B", descriptor = "Lclient!tk;")
	public static final Class305 aClass305_3 = new Class305();

	@OriginalMember(owner = "client!hu", name = "J", descriptor = "I")
	public static final int anInt3440 = 1337;

	@OriginalMember(owner = "client!hu", name = "K", descriptor = "I")
	public static int anInt3441 = 1;

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "(I)[Lclient!bc;")
	public static Class24[] method2977() {
		return new Class24[] { Static519.aClass24_4, Static446.aClass24_2, Static171.aClass24_1 };
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!maa;Lclient!lb;BLclient!oa;)V")
	public static void method2978(@OriginalArg(0) Class6_Sub34 arg0, @OriginalArg(1) Class179 arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(10) Class4 local10 = arg1.method3969(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.QA();
		if (local10.b() > local16) {
			local16 = local10.b();
		}
		@Pc(28) int local28 = arg0.anInt4908;
		@Pc(31) int local31 = arg0.anInt4911;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(74) int local74;
		if (arg1.aString63 != null) {
			local33 = Static383.aClass146_9.method3172(arg1.aString63, Static533.aStringArray35, null, null);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static533.aStringArray35[local51];
				if (local51 < local33 - 1) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local74 = Static43.aClass85_2.method1788(local57);
				if (local35 < local74) {
					local35 = local74;
				}
			}
			local37 = Static43.aClass85_2.method1783() * local33 + Static43.aClass85_2.method1786() / 2;
		}
		local51 = arg0.anInt4908 + local16 / 2;
		@Pc(103) int local103 = arg0.anInt4911;
		if (Static349.anInt7459 + local16 > local28) {
			local51 = local35 / 2 + Static349.anInt7459 + local16 / 2 + 5 + 10;
			local28 = Static349.anInt7459;
		} else if (Static349.anInt7460 - local16 < local28) {
			local51 = Static349.anInt7460 - local16 / 2 - local35 / 2 - 10 - 5;
			local28 = Static349.anInt7460 - local16;
		}
		if (local16 + Static349.anInt7464 > local31) {
			local103 = local16 / 2 + Static349.anInt7464 + 10;
			local31 = Static349.anInt7464;
		} else if (local31 > Static349.anInt7456 - local16) {
			local103 = Static349.anInt7456 - local16 / 2 - local37 - 10;
			local31 = Static349.anInt7456 - local16;
		}
		local74 = (int) (Math.atan2((double) (local28 - arg0.anInt4908), (double) (local31 - arg0.anInt4911)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method6512((float) local16 / 2.0F + (float) local28, (float) local31 + (float) local16 / 2.0F, 4096, local74);
		@Pc(253) int local253 = -2;
		@Pc(255) int local255 = -2;
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		if (arg1.aString63 != null) {
			local255 = local103;
			local253 = local51 - local35 / 2 - 5;
			local257 = local253 + local35 + 10;
			local259 = local103 + Static43.aClass85_2.method1783() * local33 + 3;
			if (arg1.anInt4590 != 0) {
				arg2.method7109(local103, local257 - local253, local259 - local103, local253, arg1.anInt4590);
			}
			if (arg1.anInt4589 != 0) {
				arg2.method7160(local257 - local253, local103, arg1.anInt4589, local253, local259 - local103);
			}
			for (@Pc(328) int local328 = 0; local328 < local33; local328++) {
				@Pc(334) String local334 = Static533.aStringArray35[local328];
				if (local328 < local33 - 1) {
					local334 = local334.substring(0, local334.length() - 4);
				}
				Static43.aClass85_2.method1784(arg2, local334, local51, local103, arg1.anInt4575);
				local103 += Static43.aClass85_2.method1783();
			}
		}
		if (arg1.anInt4581 == -1 && arg1.aString63 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(385) Class6_Sub17 local385 = new Class6_Sub17(arg0);
		local385.anInt1865 = local255;
		local385.anInt1867 = local31 - local16;
		local385.anInt1866 = local28 + local16;
		local385.anInt1871 = local253;
		local385.anInt1868 = local31 + local16;
		local385.anInt1870 = local257;
		local385.anInt1860 = local28 - local16;
		local385.anInt1864 = local259;
		Static553.aClass275_194.method6370(local385);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZ)Z")
	public static boolean method2979(@OriginalArg(0) int arg0) {
		if (arg0 == 12 || arg0 == 60 || arg0 == 13 || arg0 == 51 || arg0 == 49) {
			return true;
		} else {
			return arg0 == 57 || arg0 == 1004;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/lang/String;ILjava/io/File;)V")
	public static void method2981(@OriginalArg(0) String arg0, @OriginalArg(2) File arg1) {
		Static144.aHashtable2.put(arg0, arg1);
	}
}
