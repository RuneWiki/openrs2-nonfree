import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class31 implements Interface4 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
	private int anInt1894;

	@OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
	public int anInt1901;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "Z")
	private boolean aBoolean97 = true;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)J")
	private long method1195() {
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1901; local12++) {
			local10 = (local10 << 5) + ((long) (this.aByteArray17[local12] & 0xFF)) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Lclient!lc;")
	public Class31 method1196() {
		@Pc(9) Class31 local9 = new Class31();
		@Pc(11) boolean local11 = true;
		local9.anInt1901 = this.anInt1901;
		local9.aByteArray17 = new byte[this.anInt1901];
		for (@Pc(22) int local22 = 0; local22 < this.anInt1901; local22++) {
			@Pc(29) byte local29 = this.aByteArray17[local22];
			if (local29 == 95) {
				local9.aByteArray17[local22] = 32;
				local11 = true;
			} else if (local29 >= 97 && local29 <= 122 && local11) {
				local11 = false;
				local9.aByteArray17[local22] = (byte) (local29 - 32);
			} else {
				local11 = false;
				local9.aByteArray17[local22] = local29;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!lc;I)Z")
	public boolean method1197(@OriginalArg(0) Class31 arg0) {
		if (this.anInt1901 < arg0.anInt1901) {
			return false;
		}
		@Pc(22) int local22 = this.anInt1901 - arg0.anInt1901;
		for (@Pc(24) int local24 = 0; local24 < arg0.anInt1901; local24++) {
			if (arg0.aByteArray17[local24] != this.aByteArray17[local22 + local24]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lclient!lc;")
	public Class31 method1198() {
		@Pc(7) long local7 = this.method1195();
		@Pc(16) Class local16 = lc.class;
		synchronized (lc.class) {
			@Pc(26) Class2_Sub12 local26;
			if (Static41.aClass50_2 == null) {
				Static41.aClass50_2 = new Class50(4096);
			} else {
				for (local26 = (Class2_Sub12) Static41.aClass50_2.method1460(local7); local26 != null; local26 = (Class2_Sub12) Static41.aClass50_2.method1455()) {
					if (this.method1199(local26.aClass31_515)) {
						return local26.aClass31_515;
					}
				}
			}
			local26 = new Class2_Sub12();
			local26.aClass31_515 = this;
			this.aBoolean97 = false;
			Static41.aClass50_2.method1461(local26, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!lc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLclient!lc;)Z")
	public boolean method1199(@OriginalArg(1) Class31 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt1901 == this.anInt1901) {
			if (!this.aBoolean97 || !arg0.aBoolean97) {
				if (this.anInt1894 == 0) {
					this.anInt1894 = this.method1225();
					if (this.anInt1894 == 0) {
						this.anInt1894 = 1;
					}
				}
				if (arg0.anInt1894 == 0) {
					arg0.anInt1894 = arg0.method1225();
					if (arg0.anInt1894 == 0) {
						arg0.anInt1894 = 1;
					}
				}
				if (this.anInt1894 != arg0.anInt1894) {
					return false;
				}
			}
			for (@Pc(79) int local79 = 0; local79 < this.anInt1901; local79++) {
				if (arg0.aByteArray17[local79] != this.aByteArray17[local79]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)I")
	public int method1200() {
		return this.method1228();
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)J")
	public long method1201() {
		@Pc(12) long local12 = 0L;
		for (@Pc(14) int local14 = 0; local14 < this.anInt1901 && local14 < 12; local14++) {
			local12 *= 37L;
			@Pc(25) byte local25 = this.aByteArray17[local14];
			if (local25 >= 65 && local25 <= 90) {
				local12 += local25 - 64;
			} else if (local25 >= 97 && local25 <= 122) {
				local12 += local25 + 1 - 97;
			} else if (local25 >= 48 && local25 <= 57) {
				local12 += local25 + 27 - 48;
			}
		}
		while (local12 % 37L == 0L && local12 != 0L) {
			local12 /= 37L;
		}
		return local12;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)Z")
	public boolean method1202() {
		return this.method1219();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
	public void method1203(@OriginalArg(0) int arg0, @OriginalArg(3) Graphics arg1) {
		@Pc(21) String local21;
		try {
			local21 = new String(this.aByteArray17, 0, this.anInt1901, "ISO-8859-1");
		} catch (@Pc(23) UnsupportedEncodingException local23) {
			local21 = new String(this.aByteArray17, 0, this.anInt1901);
		}
		arg1.drawString(local21, arg0, 22);
	}

	@OriginalMember(owner = "client!lc", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)I")
	public int method1204() {
		return this.method1218();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)Lclient!lc;")
	public Class31 method1205(@OriginalArg(0) int arg0) {
		@Pc(12) Class31 local12 = new Class31();
		local12.aByteArray17 = new byte[this.anInt1901 + 1];
		local12.anInt1901 = this.anInt1901 + 1;
		Static112.method991(this.aByteArray17, 0, local12.aByteArray17, 0, this.anInt1901);
		local12.aByteArray17[this.anInt1901] = (byte) arg0;
		return local12;
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)Lclient!lc;")
	public Class31 method1208() {
		@Pc(9) Class31 local9 = new Class31();
		local9.anInt1901 = this.anInt1901;
		local9.aByteArray17 = new byte[this.anInt1901];
		for (@Pc(28) int local28 = 0; local28 < this.anInt1901; local28++) {
			local9.aByteArray17[local28] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(Lclient!lc;I)I")
	public int method1209(@OriginalArg(0) Class31 arg0) {
		return this.method1215(arg0);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLclient!lc;)Z")
	public boolean method1210(@OriginalArg(1) Class31 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1901 == arg0.anInt1901) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt1901; local23++) {
				@Pc(30) byte local30 = this.aByteArray17[local23];
				if (local30 >= 65 && local30 <= 90 || local30 >= -64 && local30 <= -34 && local30 != -41) {
					local30 = (byte) (local30 + 32);
				}
				@Pc(59) byte local59 = arg0.aByteArray17[local23];
				if (local59 >= 65 && local59 <= 90 || local59 >= -64 && local59 <= -34 && local59 != -41) {
					local59 = (byte) (local59 + 32);
				}
				if (local59 != local30) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)Lclient!lc;")
	public Class31 method1211() {
		if (!this.aBoolean97) {
			throw new IllegalArgumentException();
		}
		this.anInt1894 = 0;
		if (this.anInt1901 != this.aByteArray17.length) {
			@Pc(35) byte[] local35 = new byte[this.anInt1901];
			Static112.method991(this.aByteArray17, 0, local35, 0, this.anInt1901);
			this.aByteArray17 = local35;
		}
		return this;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(Z)Lclient!lc;")
	public Class31 method1212() {
		@Pc(16) Class31 local16 = new Class31();
		local16.aByteArray17 = new byte[12];
		local16.anInt1901 = 0;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt1901; local27++) {
			if (this.aByteArray17[local27] >= 65 && this.aByteArray17[local27] <= 90) {
				local16.aByteArray17[local25++] = (byte) (this.aByteArray17[local27] + 97 - 65);
				local16.anInt1901 = local25;
			} else if (this.aByteArray17[local27] >= 97 && this.aByteArray17[local27] <= 122 || this.aByteArray17[local27] >= 48 && this.aByteArray17[local27] <= 57) {
				local16.aByteArray17[local25++] = this.aByteArray17[local27];
				local16.anInt1901 = local25;
			} else if (local25 > 0) {
				local16.aByteArray17[local25++] = 95;
			}
			if (local25 == 12) {
				break;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)Lclient!lc;")
	public Class31 method1213(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class31 local15 = new Class31();
		local15.aByteArray17 = new byte[arg0 - arg1];
		local15.anInt1901 = arg0 - arg1;
		Static112.method991(this.aByteArray17, arg1, local15.aByteArray17, 0, local15.anInt1901);
		return local15;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method1214(@OriginalArg(0) FontMetrics arg0) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray17, 0, this.anInt1901, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray17, 0, this.anInt1901);
		}
		return arg0.stringWidth(local18);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BILclient!lc;)I")
	private int method1215(@OriginalArg(2) Class31 arg0) {
		@Pc(9) int[] local9 = new int[arg0.anInt1901];
		@Pc(13) int[] local13 = new int[arg0.anInt1901];
		@Pc(16) int[] local16 = new int[256];
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			local16[local18] = arg0.anInt1901;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg0.anInt1901; local36++) {
			local9[local36 - 1] = (arg0.anInt1901 << 1) - local36;
			local16[arg0.aByteArray17[local36 - 1] & 0xFF] = arg0.anInt1901 - local36;
		}
		@Pc(77) int local77 = arg0.anInt1901 + 1;
		for (@Pc(85) int local85 = arg0.anInt1901; local85 > 0; local85--) {
			local13[local85 - 1] = local77;
			while (local77 <= arg0.anInt1901 && arg0.aByteArray17[local77 - 1] != arg0.aByteArray17[local85 - 1]) {
				if (arg0.anInt1901 - local85 <= local9[local77 - 1]) {
					local9[local77 - 1] = arg0.anInt1901 - local85;
				}
				local77 = local13[local77 - 1];
			}
			local77--;
		}
		@Pc(148) int local148 = local77;
		local77 = arg0.anInt1901 + 1 - local77;
		@Pc(158) int local158 = 1;
		@Pc(160) int local160 = 0;
		for (@Pc(162) int local162 = 1; local162 <= local77; local162++) {
			local13[local162 - 1] = local160;
			while (local160 >= 1 && arg0.aByteArray17[local160 - 1] != arg0.aByteArray17[local162 - 1]) {
				local160 = local13[local160 - 1];
			}
			local160++;
		}
		@Pc(205) int local205;
		while (arg0.anInt1901 > local148) {
			for (local205 = local158; local205 <= local148; local205++) {
				if (local9[local205 - 1] >= local148 + arg0.anInt1901 - local205) {
					local9[local205 - 1] = arg0.anInt1901 + local148 - local205;
				}
			}
			local158 = local148 + 1;
			local148 = local77 + local148 - local13[local77 - 1];
			local77 = local13[local77 - 1];
		}
		@Pc(286) int local286;
		for (local205 = arg0.anInt1901 - 1; local205 < this.anInt1901; local205 += Math.max(local16[this.aByteArray17[local205] & 0xFF], local9[local286])) {
			for (local286 = arg0.anInt1901 - 1; local286 >= 0 && this.aByteArray17[local205] == arg0.aByteArray17[local286]; local286--) {
				local205--;
			}
			if (local286 == -1) {
				return local205 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)I")
	public int method1216(@OriginalArg(0) int arg0) {
		return this.aByteArray17[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)[B")
	public byte[] method1217() {
		@Pc(13) byte[] local13 = new byte[this.anInt1901];
		Static112.method991(this.aByteArray17, 0, local13, 0, this.anInt1901);
		return local13;
	}

	@OriginalMember(owner = "client!lc", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1225();
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)I")
	private int method1218() {
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt1901; local26++) {
			@Pc(35) int local35 = this.aByteArray17[local26] & 0xFF;
			if (local26 == 0) {
				if (local35 == 45) {
					local20 = true;
					continue;
				}
				if (local35 == 43) {
					continue;
				}
			}
			if (local35 >= 48 && local35 <= 57) {
				local35 -= 48;
			} else if (local35 >= 65 && local35 <= 90) {
				local35 -= 55;
			} else if (local35 >= 97 && local35 <= 122) {
				local35 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (local35 >= 10) {
				throw new NumberFormatException();
			}
			if (local20) {
				local35 = -local35;
			}
			@Pc(115) int local115 = local24 * 10 + local35;
			if (local24 != local115 / 10) {
				throw new NumberFormatException();
			}
			local24 = local115;
			local22 = true;
		}
		if (!local22) {
			throw new NumberFormatException();
		}
		return local24;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(IB)Z")
	private boolean method1219() {
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt1901; local29++) {
			@Pc(38) int local38 = this.aByteArray17[local29] & 0xFF;
			if (local29 == 0) {
				if (local38 == 45) {
					local23 = true;
					continue;
				}
				if (local38 == 43) {
					continue;
				}
			}
			if (local38 >= 48 && local38 <= 57) {
				local38 -= 48;
			} else if (local38 >= 65 && local38 <= 90) {
				local38 -= 55;
			} else if (local38 >= 97 && local38 <= 122) {
				local38 -= 87;
			} else {
				return false;
			}
			if (local38 >= 10) {
				return false;
			}
			if (local23) {
				local38 = -local38;
			}
			@Pc(111) int local111 = local27 * 10 + local38;
			if (local27 != local111 / 10) {
				return false;
			}
			local25 = true;
			local27 = local111;
		}
		return local25;
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(Z)Lclient!lc;")
	public Class31 method1220() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt1901 && this.aByteArray17[local7] >= 0 && this.aByteArray17[local7] <= 32; local7++) {
		}
		@Pc(28) int local28;
		for (local28 = this.anInt1901; local28 > local7 && this.aByteArray17[local28 - 1] >= 0 && this.aByteArray17[local28 - 1] <= 32; local28--) {
		}
		@Pc(56) Class31 local56 = new Class31();
		local56.anInt1901 = local28 - local7;
		local56.aByteArray17 = new byte[local56.anInt1901];
		for (@Pc(68) int local68 = 0; local68 < local56.anInt1901; local68++) {
			local56.aByteArray17[local68] = this.aByteArray17[local68 + local7];
		}
		return local56;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)Lclient!lc;")
	public Class31 method1221() {
		@Pc(9) Class31 local9 = new Class31();
		@Pc(11) boolean local11 = true;
		local9.anInt1901 = this.anInt1901;
		local9.aByteArray17 = new byte[this.anInt1901];
		for (@Pc(22) int local22 = 0; local22 < this.anInt1901; local22++) {
			@Pc(29) byte local29 = this.aByteArray17[local22];
			if (local29 >= 97 && local29 <= 122 || !(local29 < -32 || local29 > -2 || local29 == -9)) {
				if (local11) {
					local29 = (byte) (local29 - 32);
				}
				local11 = false;
			} else if (local29 >= 65 && local29 <= 90 || local29 >= -64 && local29 <= -34 && local29 != -41) {
				if (!local11) {
					local29 = (byte) (local29 + 32);
				}
				local11 = false;
			}
			if (local29 == 46 || local29 == 33 || local29 == 63) {
				local11 = true;
			}
			local9.aByteArray17[local22] = local29;
		}
		return local9;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(IB)Lclient!lc;")
	public Class31 method1222(@OriginalArg(0) int arg0) {
		return this.method1213(this.anInt1901, arg0);
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)I")
	public int method1223() {
		return this.anInt1901;
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)I")
	public int method1225() {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1901; local15++) {
			local13 = (this.aByteArray17[local15] & 0xFF) + (local13 << 5) - local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!lc;)Z")
	public boolean method1226(@OriginalArg(1) Class31 arg0) {
		if (arg0.anInt1901 > this.anInt1901) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < arg0.anInt1901; local19++) {
			if (this.aByteArray17[local19] != arg0.aByteArray17[local19]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIB)I")
	private int method1228() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt1901; local13++) {
			if (this.aByteArray17[local13] == 32) {
				return local13;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "(Z)Lclient!lc;")
	public Class31 method1230() {
		@Pc(14) Class31 local14 = new Class31();
		local14.anInt1901 = this.anInt1901;
		local14.aByteArray17 = new byte[this.anInt1901];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1901; local25++) {
			@Pc(32) byte local32 = this.aByteArray17[local25];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local14.aByteArray17[local25] = local32;
		}
		return local14;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[BII)I")
	public int method1231(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static112.method991(this.aByteArray17, 0, arg0, arg2, arg1);
		return arg1;
	}
}
