import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!jp", name = "D", descriptor = "J")
	public static long aLong155;

	@OriginalMember(owner = "client!jp", name = "F", descriptor = "Lclient!pe;")
	public static Class254 aClass254_73;

	@OriginalMember(owner = "client!jp", name = "C", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_55 = new Class230(29, 8);

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLclient!cda;IILclient!dg;)V")
	public static void method4534(@OriginalArg(1) Class3_Sub7_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub2_Sub1_Sub1 arg3) {
		if ((arg2 & 0x800) != 0) {
			arg3.aString92 = arg0.method6536();
			if (arg3.aString92.charAt(0) == '~') {
				arg3.aString92 = arg3.aString92.substring(1);
				Static348.method2212(0, arg3.method2042(), 2, arg3.aString22, arg3.aString92, arg3.method2038());
			} else if (Static443.aClass2_Sub2_Sub1_Sub1_2 == arg3) {
				Static348.method2212(0, arg3.method2042(), 2, arg3.aString22, arg3.aString92, arg3.method2038());
			}
			arg3.anInt7610 = 0;
			arg3.anInt7632 = 150;
			arg3.anInt7600 = 0;
		}
		@Pc(74) byte local74 = -1;
		if ((arg2 & 0x20000) != 0) {
			arg3.aByte79 = arg0.method6529();
			arg3.aByte78 = arg0.method6526();
			arg3.aByte80 = arg0.method6517();
			arg3.aByte81 = (byte) arg0.method6505();
			arg3.anInt7593 = Static129.anInt10429 + arg0.method6521();
			arg3.anInt7624 = Static129.anInt10429 + arg0.method6521();
		}
		@Pc(133) int local133;
		@Pc(137) int local137;
		@Pc(141) int local141;
		if ((arg2 & 0x10000) != 0) {
			local133 = Static129.anInt10429;
			local137 = arg0.method6542();
			local141 = arg0.method6538();
			arg3.method6305(local141, local133, local137);
		}
		if ((arg2 & 0x10) != 0) {
			arg3.anInt2218 = arg0.method6521();
			if (arg3.anInt7660 == 0) {
				arg3.method6309(arg3.anInt2218);
				arg3.anInt2218 = -1;
			}
		}
		if ((arg2 & 0x8) != 0) {
			local133 = arg0.method6541();
			if (local133 == 65535) {
				local133 = -1;
			}
			arg3.anInt7634 = local133;
		}
		if ((arg2 & 0x80) != 0) {
			local133 = arg0.method6542();
			local137 = arg0.method6505();
			arg3.method6305(local137, Static129.anInt10429, local133);
			arg3.anInt7647 = Static129.anInt10429 + 300;
			arg3.anInt7630 = arg0.method6538();
		}
		if ((arg2 & 0x20) != 0) {
			Static113.aByteArray38[arg1] = arg0.method6523();
		}
		if ((arg2 & 0x8000) != 0) {
			local133 = arg0.method6555();
			@Pc(241) int[] local241 = new int[local133];
			@Pc(244) int[] local244 = new int[local133];
			@Pc(247) int[] local247 = new int[local133];
			for (@Pc(249) int local249 = 0; local249 < local133; local249++) {
				@Pc(254) int local254 = arg0.method6532();
				if (local254 == 65535) {
					local254 = -1;
				}
				local241[local249] = local254;
				local244[local249] = arg0.method6555();
				local247[local249] = arg0.method6541();
			}
			Static186.method3280(local244, local247, arg3, local241);
		}
		if ((arg2 & 0x2000) != 0) {
			local133 = arg0.method6535();
			arg3.anInt7635 = arg0.method6555();
			arg3.anInt7595 = arg0.method6505();
			arg3.anInt7637 = local133 & 0x7FFF;
			arg3.aBoolean646 = (local133 & 0x8000) != 0;
			arg3.anInt7643 = Static129.anInt10429 + arg3.anInt7637 + arg3.anInt7635;
		}
		if ((arg2 & 0x4000) != 0) {
			arg3.anInt7654 = arg0.method6526();
			arg3.anInt7607 = arg0.method6529();
			arg3.anInt7644 = arg0.method6523();
			arg3.anInt7602 = arg0.method6523();
			arg3.anInt7616 = arg0.method6532() + Static129.anInt10429;
			arg3.anInt7633 = arg0.method6535() + Static129.anInt10429;
			arg3.anInt7597 = arg0.method6555();
			if (arg3.aBoolean172) {
				arg3.anInt7607 += arg3.anInt2223;
				arg3.anInt7654 += arg3.anInt2225;
				arg3.anInt7602 += arg3.anInt2223;
				arg3.anInt7644 += arg3.anInt2225;
				arg3.anInt7660 = 0;
			} else {
				arg3.anInt7602 += arg3.anIntArray488[0];
				arg3.anInt7644 += arg3.anIntArray487[0];
				arg3.anInt7607 += arg3.anIntArray488[0];
				arg3.anInt7654 += arg3.anIntArray487[0];
				arg3.anInt7660 = 1;
			}
			arg3.anInt7659 = 0;
		}
		if ((arg2 & 0x1) != 0) {
			@Pc(466) int[] local466 = new int[4];
			for (local137 = 0; local137 < 4; local137++) {
				local466[local137] = arg0.method6532();
				if (local466[local137] == 65535) {
					local466[local137] = -1;
				}
			}
			local141 = arg0.method6555();
			Static36.method1098(local466, arg3, local141);
		}
		if ((arg2 & 0x400) != 0) {
			local133 = arg0.method6532();
			if (local133 == 65535) {
				local133 = -1;
			}
			local137 = arg0.method6548();
			local141 = arg0.method6555();
			arg3.method6313(true, local133, local141, local137);
		}
		if ((arg2 & 0x100) != 0) {
			local74 = arg0.method6529();
		}
		if ((arg2 & 0x1000) != 0) {
			arg3.aBoolean171 = arg0.method6505() == 1;
		}
		if ((arg2 & 0x40) != 0) {
			local133 = arg0.method6532();
			local137 = arg0.method6544();
			if (local133 == 65535) {
				local133 = -1;
			}
			local141 = arg0.method6547();
			arg3.method6313(false, local133, local141, local137);
		}
		if ((arg2 & 0x4) != 0) {
			local133 = arg0.method6505();
			@Pc(604) byte[] local604 = new byte[local133];
			@Pc(609) Class3_Sub7 local609 = new Class3_Sub7(local604);
			arg0.method6540(local604, local133);
			Static1.aClass3_Sub7Array1[arg1] = local609;
			arg3.method2043(local609);
		}
		if (!arg3.aBoolean172) {
			return;
		}
		if (local74 == 127) {
			arg3.method2033(arg3.anInt2225, arg3.anInt2223);
			return;
		}
		@Pc(644) byte local644;
		if (local74 == -1) {
			local644 = Static113.aByteArray38[arg1];
		} else {
			local644 = local74;
		}
		arg3.method2035(local644, arg3.anInt2223, arg3.anInt2225);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BZ)I")
	public static int method4535(@OriginalArg(1) boolean arg0) {
		if (Static500.anIntArray611 == null) {
			return 0;
		} else if (arg0 || Static269.aClass27Array1 == null) {
			@Pc(18) int local18 = 0;
			for (@Pc(25) int local25 = 0; local25 < Static500.anIntArray611.length; local25++) {
				@Pc(30) int local30 = Static500.anIntArray611[local25];
				if (Static181.aClass254_57.method6417(local30)) {
					local18++;
				}
				if (Static16.aClass254_7.method6417(local30)) {
					local18++;
				}
			}
			return local18;
		} else {
			return Static500.anIntArray611.length * 2;
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(III)Z")
	public static boolean method4536(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) boolean local20 = (arg0 & 0x37) == 0 ? Static141.method2863(arg0, arg1) : Static480.method7350(arg1, arg0);
		return local20 | Static196.method3327(arg0, arg1) | (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "([BILjava/io/File;I)V")
	public static void method4537(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local14.readFully(arg0, 0, arg2);
		} catch (@Pc(29) EOFException local29) {
		}
		local14.close();
	}
}
