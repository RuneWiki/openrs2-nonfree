import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class40 implements Interface2 {

	@OriginalMember(owner = "client!o", name = "q", descriptor = "Z")
	public static boolean aBoolean142 = false;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "Lclient!o;")
	public static Class40 aClass40_506 = Static12.method257(" is already on your ignore list");

	@OriginalMember(owner = "client!o", name = "G", descriptor = "Lclient!o;")
	public static Class40 aClass40_508 = Static12.method257("New User");

	@OriginalMember(owner = "client!o", name = "O", descriptor = "Lclient!o;")
	public static Class40 aClass40_509 = Static12.method257("Close");

	@OriginalMember(owner = "client!o", name = "L", descriptor = "I")
	public static int anInt1779 = 2;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "Lclient!o;")
	public static Class40 aClass40_505 = Static12.method257(" has logged in)3");

	@OriginalMember(owner = "client!o", name = "Z", descriptor = "Lclient!o;")
	public static Class40 aClass40_510 = Static12.method257("Accept challenge @whi@");

	@OriginalMember(owner = "client!o", name = "p", descriptor = "Lclient!o;")
	public static Class40 aClass40_507 = Static12.method257("Imported music");

	@OriginalMember(owner = "client!o", name = "C", descriptor = "Z")
	public static boolean aBoolean143 = false;

	@OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
	public static int anInt1792 = 0;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!o", name = "M", descriptor = "I")
	private int anInt1780;

	@OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
	public int anInt1783;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "Z")
	private boolean aBoolean141 = true;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)J", line = 10)
	private long method1164() {
		@Pc(5) long local5 = 0L;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1783; local12++) {
			local5 = (local5 << 5) + (long) (this.aByteArray14[local12] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)Lclient!o;", line = 31)
	public Class40 method1165() {
		@Pc(7) long local7 = this.method1164();
		@Pc(16) Class local16 = o.class;
		synchronized (o.class) {
			@Pc(41) Class2_Sub6 local41;
			if (Static30.aClass6_1 == null) {
				Static30.aClass6_1 = new Class6(4096);
			} else {
				for (local41 = (Class2_Sub6) Static30.aClass6_1.method190(local7); local41 != null; local41 = (Class2_Sub6) Static30.aClass6_1.method182()) {
					if (this.method1184(local41.aClass40_247)) {
						return local41.aClass40_247;
					}
				}
			}
			local41 = new Class2_Sub6();
			this.aBoolean141 = false;
			local41.aClass40_247 = this;
			Static30.aClass6_1.method195(local41, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)Lclient!o;", line = 73)
	public Class40 method1166() {
		@Pc(14) Class40 local14 = new Class40();
		@Pc(16) boolean local16 = true;
		local14.anInt1783 = this.anInt1783;
		local14.aByteArray14 = new byte[this.anInt1783];
		for (@Pc(27) int local27 = 0; local27 < this.anInt1783; local27++) {
			@Pc(34) byte local34 = this.aByteArray14[local27];
			if (local34 >= 97 && local34 <= 122 || !(local34 < -32 || local34 > -2 || local34 == -9)) {
				if (local16) {
					local34 = (byte) (local34 - 32);
				}
				local16 = false;
			} else if (local34 >= 65 && local34 <= 90 || local34 >= -64 && local34 <= -34 && local34 != -41) {
				if (!local16) {
					local34 = (byte) (local34 + 32);
				}
				local16 = false;
			}
			if (local34 == 46 || local34 == 33 || local34 == 63) {
				local16 = true;
			}
			local14.aByteArray14[local27] = local34;
		}
		return local14;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Lclient!o;", line = 126)
	public Class40 method1167() {
		@Pc(9) Class40 local9 = new Class40();
		@Pc(11) boolean local11 = true;
		local9.anInt1783 = this.anInt1783;
		local9.aByteArray14 = new byte[this.anInt1783];
		for (@Pc(22) int local22 = 0; local22 < this.anInt1783; local22++) {
			@Pc(29) byte local29 = this.aByteArray14[local22];
			if (local29 == 95) {
				local11 = true;
				local9.aByteArray14[local22] = 32;
			} else if (local29 >= 97 && local29 <= 122 && local11) {
				local11 = false;
				local9.aByteArray14[local22] = (byte) (local29 - 32);
			} else {
				local11 = false;
				local9.aByteArray14[local22] = local29;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!o;I)Z", line = 173)
	public boolean method1168(@OriginalArg(0) Class40 arg0) {
		if (this.anInt1783 < arg0.anInt1783) {
			return false;
		}
		for (@Pc(23) int local23 = 0; local23 < arg0.anInt1783; local23++) {
			if (this.aByteArray14[local23] != arg0.aByteArray14[local23]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(I)I", line = 198)
	public int method1169() {
		return this.anInt1783;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)Z", line = 229)
	private boolean method1171() {
		@Pc(17) boolean local17 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt1783; local28++) {
			@Pc(37) int local37 = this.aByteArray14[local28] & 0xFF;
			if (local28 == 0) {
				if (local37 == 45) {
					local17 = true;
					continue;
				}
				if (local37 == 43) {
					continue;
				}
			}
			if (local37 >= 48 && local37 <= 57) {
				local37 -= 48;
			} else if (local37 >= 65 && local37 <= 90) {
				local37 -= 55;
			} else if (local37 >= 97 && local37 <= 122) {
				local37 -= 87;
			} else {
				return false;
			}
			if (local37 >= 10) {
				return false;
			}
			if (local17) {
				local37 = -local37;
			}
			@Pc(112) int local112 = local26 * 10 + local37;
			if (local112 / 10 != local26) {
				return false;
			}
			local26 = local112;
			local24 = true;
		}
		return local24;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)I", line = 322)
	private int method1173() {
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		@Pc(28) boolean local28 = false;
		for (@Pc(30) int local30 = 0; local30 < this.anInt1783; local30++) {
			@Pc(39) int local39 = this.aByteArray14[local30] & 0xFF;
			if (local30 == 0) {
				if (local39 == 45) {
					local17 = true;
					continue;
				}
				if (local39 == 43) {
					continue;
				}
			}
			if (local39 >= 48 && local39 <= 57) {
				local39 -= 48;
			} else if (local39 >= 65 && local39 <= 90) {
				local39 -= 55;
			} else if (local39 >= 97 && local39 <= 122) {
				local39 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (local39 >= 10) {
				throw new NumberFormatException();
			}
			if (local17) {
				local39 = -local39;
			}
			@Pc(114) int local114 = local19 * 10 + local39;
			if (local19 != local114 / 10) {
				throw new NumberFormatException();
			}
			local19 = local114;
			local28 = true;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local19;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)I", line = 414)
	public int method1174(@OriginalArg(1) int arg0) {
		return this.aByteArray14[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(I)Lclient!o;", line = 430)
	public Class40 method1175() {
		@Pc(9) Class40 local9 = new Class40();
		@Pc(11) int local11 = 0;
		local9.anInt1783 = 0;
		local9.aByteArray14 = new byte[12];
		for (@Pc(26) int local26 = 0; local26 < this.anInt1783; local26++) {
			if (this.aByteArray14[local26] >= 65 && this.aByteArray14[local26] <= 90) {
				local9.aByteArray14[local11++] = (byte) (this.aByteArray14[local26] + 97 - 65);
				local9.anInt1783 = local11;
			} else if (this.aByteArray14[local26] >= 97 && this.aByteArray14[local26] <= 122 || this.aByteArray14[local26] >= 48 && this.aByteArray14[local26] <= 57) {
				local9.aByteArray14[local11++] = this.aByteArray14[local26];
				local9.anInt1783 = local11;
			} else if (local11 > 0) {
				local9.aByteArray14[local11++] = 95;
			}
			if (local11 == 12) {
				break;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!o", name = "f", descriptor = "(I)Z", line = 477)
	public boolean method1176() {
		return this.method1171();
	}

	@OriginalMember(owner = "client!o", name = "g", descriptor = "(I)Lclient!o;", line = 494)
	public Class40 method1177() {
		@Pc(17) Class40 local17 = new Class40();
		local17.anInt1783 = this.anInt1783;
		local17.aByteArray14 = new byte[this.anInt1783];
		for (@Pc(28) int local28 = 0; local28 < this.anInt1783; local28++) {
			local17.aByteArray14[local28] = 42;
		}
		return local17;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)Lclient!o;", line = 529)
	public Class40 method1178() {
		@Pc(15) int local15 = this.anInt1783;
		@Pc(17) int local17;
		for (local17 = 0; local17 < this.anInt1783 && this.aByteArray14[local17] >= 0 && this.aByteArray14[local17] <= 32; local17++) {
		}
		while (local15 > local17 && this.aByteArray14[local15 - 1] >= 0 && this.aByteArray14[local15 - 1] <= 32) {
			local15--;
		}
		@Pc(70) Class40 local70 = new Class40();
		local70.anInt1783 = local15 - local17;
		local70.aByteArray14 = new byte[local70.anInt1783];
		for (@Pc(83) int local83 = 0; local83 < local70.anInt1783; local83++) {
			local70.aByteArray14[local83] = this.aByteArray14[local17 + local83];
		}
		return local70;
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(B)J", line = 564)
	public long method1179() {
		@Pc(8) long local8 = 0L;
		for (@Pc(10) int local10 = 0; this.anInt1783 > local10 && local10 < 12; local10++) {
			@Pc(17) byte local17 = this.aByteArray14[local10];
			local8 *= 37L;
			if (local17 >= 65 && local17 <= 90) {
				local8 += local17 + 1 - 65;
			} else if (local17 >= 97 && local17 <= 122) {
				local8 += local17 - 96;
			} else if (local17 >= 48 && local17 <= 57) {
				local8 += local17 + 27 - 48;
			}
		}
		while (local8 % 37L == 0L && local8 != 0L) {
			local8 /= 37L;
		}
		return local8;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Lclient!o;", line = 607)
	public Class40 method1180(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class40 local7 = new Class40();
		local7.anInt1783 = arg0 - arg1;
		local7.aByteArray14 = new byte[arg0 - arg1];
		Static107.method993(this.aByteArray14, arg1, local7.aByteArray14, 0, local7.anInt1783);
		return local7;
	}

	@OriginalMember(owner = "client!o", name = "hashCode", descriptor = "()I", line = 624)
	@Override
	public int hashCode() {
		return this.method1190();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I", line = 634)
	public int method1181(@OriginalArg(1) FontMetrics arg0) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray14, 0, this.anInt1783, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray14, 0, this.anInt1783);
		}
		return arg0.stringWidth(local18);
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(II)I", line = 655)
	public int method1182() {
		return this.method1187();
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(B)Lclient!o;", line = 671)
	public Class40 method1183() {
		if (!this.aBoolean141) {
			throw new IllegalArgumentException();
		}
		this.anInt1780 = 0;
		if (this.anInt1783 != this.aByteArray14.length) {
			@Pc(27) byte[] local27 = new byte[this.anInt1783];
			Static107.method993(this.aByteArray14, 0, local27, 0, this.anInt1783);
			this.aByteArray14 = local27;
		}
		return this;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!o;)Z", line = 701)
	public boolean method1184(@OriginalArg(1) Class40 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt1783 == this.anInt1783) {
			if (!this.aBoolean141 || !arg0.aBoolean141) {
				if (this.anInt1780 == 0) {
					this.anInt1780 = this.method1190();
					if (this.anInt1780 == 0) {
						this.anInt1780 = 1;
					}
				}
				if (arg0.anInt1780 == 0) {
					arg0.anInt1780 = arg0.method1190();
					if (arg0.anInt1780 == 0) {
						arg0.anInt1780 = 1;
					}
				}
				if (arg0.anInt1780 != this.anInt1780) {
					return false;
				}
			}
			for (@Pc(57) int local57 = 0; local57 < this.anInt1783; local57++) {
				if (arg0.aByteArray14[local57] != this.aByteArray14[local57]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(II)Lclient!o;", line = 777)
	public Class40 method1185(@OriginalArg(1) int arg0) {
		return this.method1180(this.anInt1783, arg0);
	}

	@OriginalMember(owner = "client!o", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 788)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IILclient!o;)I", line = 802)
	private int method1186(@OriginalArg(2) Class40 arg0) {
		@Pc(5) int[] local5 = new int[arg0.anInt1783];
		@Pc(8) int[] local8 = new int[256];
		@Pc(16) int[] local16 = new int[arg0.anInt1783];
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			local8[local18] = arg0.anInt1783;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg0.anInt1783; local36++) {
			local5[local36 - 1] = (arg0.anInt1783 << 1) - local36;
			local8[arg0.aByteArray14[local36 - 1] & 0xFF] = arg0.anInt1783 - local36;
		}
		@Pc(83) int local83 = arg0.anInt1783 + 1;
		@Pc(86) int local86 = arg0.anInt1783;
		while (local86 > 0) {
			local16[local86 - 1] = local83;
			while (local83 <= arg0.anInt1783 && arg0.aByteArray14[local83 - 1] != arg0.aByteArray14[local86 - 1]) {
				if (arg0.anInt1783 - local86 <= local5[local83 + -1]) {
					local5[local83 - 1] = arg0.anInt1783 - local86;
				}
				local83 = local16[local83 - 1];
			}
			local86--;
			local83--;
		}
		@Pc(149) int local149 = 1;
		@Pc(151) int local151 = 0;
		@Pc(153) int local153 = local83;
		local83 = arg0.anInt1783 + 1 - local83;
		for (@Pc(163) int local163 = 1; local163 <= local83; local163++) {
			local16[local163 - 1] = local151;
			while (local151 >= 1 && arg0.aByteArray14[local163 - 1] != arg0.aByteArray14[local151 - 1]) {
				local151 = local16[local151 - 1];
			}
			local151++;
		}
		@Pc(208) int local208;
		while (local153 < arg0.anInt1783) {
			for (local208 = local149; local208 <= local153; local208++) {
				if (local153 + arg0.anInt1783 - local208 <= local5[local208 + -1]) {
					local5[local208 - 1] = local153 + arg0.anInt1783 - local208;
				}
			}
			local149 = local153 + 1;
			local153 = local83 + local153 - local16[local83 - 1];
			local83 = local16[local83 - 1];
		}
		@Pc(281) int local281;
		for (local208 = arg0.anInt1783 - 1; local208 < this.anInt1783; local208 += Math.max(local8[this.aByteArray14[local208] & 0xFF], local5[local281])) {
			for (local281 = arg0.anInt1783 - 1; local281 >= 0 && arg0.aByteArray14[local281] == this.aByteArray14[local208]; local281--) {
				local208--;
			}
			if (local281 == -1) {
				return local208 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(III)I", line = 921)
	private int method1187() {
		for (@Pc(21) int local21 = 0; local21 < this.anInt1783; local21++) {
			if (this.aByteArray14[local21] == 32) {
				return local21;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)[B", line = 964)
	public byte[] method1189() {
		@Pc(13) byte[] local13 = new byte[this.anInt1783];
		Static107.method993(this.aByteArray14, 0, local13, 0, this.anInt1783);
		return local13;
	}

	@OriginalMember(owner = "client!o", name = "h", descriptor = "(I)I", line = 984)
	public int method1190() {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1783; local15++) {
			local13 = (local13 << 5) + (this.aByteArray14[local15] & 0xFF) - local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "([BIIII)I", line = 1007)
	public int method1191(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static107.method993(this.aByteArray14, 0, arg0, arg2, arg1);
		return arg1;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)Lclient!o;", line = 1023)
	public Class40 method1192(@OriginalArg(1) int arg0) {
		@Pc(14) Class40 local14 = new Class40();
		local14.aByteArray14 = new byte[this.anInt1783 + 1];
		local14.anInt1783 = this.anInt1783 + 1;
		Static107.method993(this.aByteArray14, 0, local14.aByteArray14, 0, this.anInt1783);
		local14.aByteArray14[this.anInt1783] = (byte) arg0;
		return local14;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 1085)
	public void method1194(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray14, 0, this.anInt1783, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray14, 0, this.anInt1783);
		}
		arg1.drawString(local9, arg2, arg0);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!o;Z)Z", line = 1112)
	public boolean method1195(@OriginalArg(0) Class40 arg0) {
		if (this.anInt1783 < arg0.anInt1783) {
			return false;
		}
		@Pc(19) int local19 = this.anInt1783 - arg0.anInt1783;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt1783; local21++) {
			if (this.aByteArray14[local19 + local21] != arg0.aByteArray14[local21]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!o", name = "i", descriptor = "(I)Lclient!o;", line = 1148)
	public Class40 method1196() {
		@Pc(9) Class40 local9 = new Class40();
		local9.anInt1783 = this.anInt1783;
		local9.aByteArray14 = new byte[this.anInt1783];
		for (@Pc(26) int local26 = 0; local26 < this.anInt1783; local26++) {
			@Pc(33) byte local33 = this.aByteArray14[local26];
			if (local33 >= 65 && local33 <= 90 || local33 >= -64 && local33 <= -34 && local33 != -41) {
				local33 = (byte) (local33 + 32);
			}
			local9.aByteArray14[local26] = local33;
		}
		return local9;
	}

	@OriginalMember(owner = "client!o", name = "f", descriptor = "(B)I", line = 1243)
	public int method1198() {
		return this.method1173();
	}

	@OriginalMember(owner = "client!o", name = "toString", descriptor = "()Ljava/lang/String;", line = 1253)
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(Lclient!o;Z)Z", line = 1279)
	public boolean method1199(@OriginalArg(0) Class40 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt1783 == this.anInt1783) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt1783; local26++) {
				@Pc(33) byte local33 = this.aByteArray14[local26];
				if (local33 >= 65 && local33 <= 90 || local33 >= -64 && local33 <= -34 && local33 != -41) {
					local33 = (byte) (local33 + 32);
				}
				@Pc(64) byte local64 = arg0.aByteArray14[local26];
				if (local64 >= 65 && local64 <= 90 || local64 >= -64 && local64 <= -34 && local64 != -41) {
					local64 = (byte) (local64 + 32);
				}
				if (local64 != local33) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!o;B)I", line = 1323)
	public int method1200(@OriginalArg(0) Class40 arg0) {
		return this.method1186(arg0);
	}
}
