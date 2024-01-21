import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class74 implements Interface3 {

	@OriginalMember(owner = "client!u", name = "y", descriptor = "I")
	private int anInt2479;

	@OriginalMember(owner = "client!u", name = "B", descriptor = "I")
	public int anInt2481;

	@OriginalMember(owner = "client!u", name = "M", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Z")
	private boolean aBoolean106 = true;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)I")
	public int method1695() {
		return this.anInt2481;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)J")
	public long method1696() {
		@Pc(14) long local14 = 0L;
		for (@Pc(16) int local16 = 0; this.anInt2481 > local16 && local16 < 12; local16++) {
			@Pc(23) byte local23 = this.aByteArray38[local16];
			local14 *= 37L;
			if (local23 >= 65 && local23 <= 90) {
				local14 += local23 + 1 - 65;
			} else if (local23 >= 97 && local23 <= 122) {
				local14 += local23 - 96;
			} else if (local23 >= 48 && local23 <= 57) {
				local14 += local23 - 21;
			}
		}
		while (local14 % 37L == 0L && local14 != 0L) {
			local14 /= 37L;
		}
		return local14;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)Lclient!u;")
	public Class74 method1697(@OriginalArg(1) int arg0) {
		return this.method1706(arg0, this.anInt2481);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)Lclient!u;")
	public Class74 method1698(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		} else if (this.aBoolean106) {
			this.anInt2479 = 0;
			if (this.anInt2481 == this.aByteArray38.length) {
				@Pc(47) int local47;
				for (local47 = 1; local47 <= this.anInt2481; local47 += local47) {
				}
				@Pc(60) byte[] local60 = new byte[local47];
				Static133.method956(this.aByteArray38, 0, local60, 0, this.anInt2481);
				this.aByteArray38 = local60;
			}
			this.aByteArray38[this.anInt2481++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)I")
	private int method1699() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt2481; local15++) {
			if (this.aByteArray38[local15] == 32) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)I")
	public int method1700() {
		return this.method1699();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!u;)Z")
	public boolean method1701(@OriginalArg(1) Class74 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2481 == arg0.anInt2481) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt2481; local26++) {
				@Pc(32) byte local32 = this.aByteArray38[local26];
				if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
					local32 = (byte) (local32 + 32);
				}
				@Pc(61) byte local61 = arg0.aByteArray38[local26];
				if (local61 >= 65 && local61 <= 90 || local61 >= -64 && local61 <= -34 && local61 != -41) {
					local61 = (byte) (local61 + 32);
				}
				if (local32 != local61) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(II)Lclient!u;")
	public Class74 method1702(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(17) Class74 local17 = new Class74();
		local17.aByteArray38 = new byte[this.anInt2481 + 1];
		local17.anInt2481 = this.anInt2481 + 1;
		Static133.method956(this.aByteArray38, 0, local17.aByteArray38, 0, this.anInt2481);
		local17.aByteArray38[this.anInt2481] = (byte) arg0;
		return local17;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(II)I")
	public int method1703(@OriginalArg(1) int arg0) {
		return this.aByteArray38[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)I")
	public int method1704() {
		return this.method1726();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BLclient!u;I)Lclient!u;")
	public Class74 method1705(@OriginalArg(1) Class74 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean106) {
			throw new IllegalArgumentException();
		} else if (arg1 > this.anInt2481) {
			throw new IllegalArgumentException();
		} else {
			this.anInt2479 = 0;
			if (arg1 + arg0.anInt2481 > this.aByteArray38.length) {
				@Pc(39) int local39;
				for (local39 = 1; local39 < arg0.anInt2481 + arg1; local39 += local39) {
				}
				@Pc(58) byte[] local58 = new byte[local39];
				Static133.method956(this.aByteArray38, 0, local58, 0, this.anInt2481);
				this.aByteArray38 = local58;
			}
			Static133.method956(arg0.aByteArray38, 0, this.aByteArray38, arg1, arg0.anInt2481);
			if (this.anInt2481 < arg1 + arg0.anInt2481) {
				this.anInt2481 = arg0.anInt2481 + arg1;
			}
			return this;
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(III)Lclient!u;")
	public Class74 method1706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class74 local7 = new Class74();
		local7.anInt2481 = arg1 - arg0;
		local7.aByteArray38 = new byte[arg1 - arg0];
		Static133.method956(this.aByteArray38, arg0, local7.aByteArray38, 0, local7.anInt2481);
		return local7;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!u;I)Lclient!u;")
	public Class74 method1707(@OriginalArg(0) Class74 arg0) {
		if (!this.aBoolean106) {
			throw new IllegalArgumentException();
		}
		this.anInt2479 = 0;
		if (this.aByteArray38.length < arg0.anInt2481 + this.anInt2481) {
			@Pc(26) int local26;
			for (local26 = 1; local26 < this.anInt2481 + arg0.anInt2481; local26 += local26) {
			}
			@Pc(47) byte[] local47 = new byte[local26];
			Static133.method956(this.aByteArray38, 0, local47, 0, this.anInt2481);
			this.aByteArray38 = local47;
		}
		Static133.method956(arg0.aByteArray38, 0, this.aByteArray38, this.anInt2481, arg0.anInt2481);
		this.anInt2481 += arg0.anInt2481;
		return this;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)I")
	public int method1708() {
		@Pc(5) int local5 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2481; local12++) {
			local5 = (this.aByteArray38[local12] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(I)Lclient!u;")
	public Class74 method1709() {
		@Pc(9) Class74 local9 = new Class74();
		@Pc(11) int local11 = 0;
		local9.anInt2481 = 0;
		local9.aByteArray38 = new byte[12];
		for (@Pc(25) int local25 = 0; local25 < this.anInt2481; local25++) {
			if (this.aByteArray38[local25] >= 65 && this.aByteArray38[local25] <= 90) {
				local9.aByteArray38[local11++] = (byte) (this.aByteArray38[local25] + 32);
				local9.anInt2481 = local11;
			} else if (this.aByteArray38[local25] >= 97 && this.aByteArray38[local25] <= 122 || this.aByteArray38[local25] >= 48 && this.aByteArray38[local25] <= 57) {
				local9.aByteArray38[local11++] = this.aByteArray38[local25];
				local9.anInt2481 = local11;
			} else if (local11 > 0) {
				local9.aByteArray38[local11++] = 95;
			}
			if (local11 == 12) {
				break;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(I)Lclient!u;")
	public Class74 method1710() {
		@Pc(5) Class74 local5 = new Class74();
		local5.anInt2481 = this.anInt2481;
		local5.aByteArray38 = new byte[this.anInt2481];
		@Pc(20) byte local20 = 2;
		for (@Pc(22) int local22 = 0; local22 < this.anInt2481; local22++) {
			@Pc(29) byte local29 = this.aByteArray38[local22];
			if (local29 >= 97 && local29 <= 122 || !(local29 < -32 || local29 > -2 || local29 == -9)) {
				if (local20 == 2) {
					local29 = (byte) (local29 - 32);
				}
				local20 = 0;
			} else if (local29 >= 65 && local29 <= 90 || !(local29 < -64 || local29 > -34 || local29 == -41)) {
				if (local20 == 0) {
					local29 = (byte) (local29 + 32);
				}
				local20 = 0;
			} else if (local29 == 46 || local29 == 33 || local29 == 63) {
				local20 = 2;
			} else if (local29 != 32) {
				local20 = 1;
			} else if (local20 != 2) {
				local20 = 1;
			}
			local5.aByteArray38[local22] = local29;
		}
		return local5;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(B)Ljava/net/URL;")
	public URL method1711() throws MalformedURLException {
		return new URL(new String(this.aByteArray38, 0, this.anInt2481));
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(B)Lclient!u;")
	public Class74 method1712() {
		@Pc(9) Class74 local9 = new Class74();
		local9.anInt2481 = this.anInt2481;
		local9.aByteArray38 = new byte[this.anInt2481];
		for (@Pc(25) int local25 = 0; local25 < this.anInt2481; local25++) {
			local9.aByteArray38[local25] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!u", name = "f", descriptor = "(I)J")
	private long method1714() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2481; local7++) {
			local5 = (local5 << 5) - (local5 - (long) (this.aByteArray38[local7] & 0xFF));
		}
		return local5;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZI[BI)I")
	public int method1715(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2) {
		Static133.method956(this.aByteArray38, 0, arg1, arg0, arg2);
		return arg2;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method1716(@OriginalArg(0) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray38, 0, this.anInt2481, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray38, 0, this.anInt2481);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public void method1717(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) String local21;
		try {
			local21 = new String(this.aByteArray38, 0, this.anInt2481, "ISO-8859-1");
		} catch (@Pc(23) UnsupportedEncodingException local23) {
			local21 = new String(this.aByteArray38, 0, this.anInt2481);
		}
		arg0.drawString(local21, arg1, arg2);
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(B)Lclient!u;")
	public Class74 method1718() {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = this.anInt2481;
		while (local7 < this.anInt2481 && (this.aByteArray38[local7] >= 0 && this.aByteArray38[local7] <= 32 || (this.aByteArray38[local7] & 0xFF) == 160)) {
			local7++;
		}
		while (local7 < local10 && (this.aByteArray38[local10 - 1] >= 0 && this.aByteArray38[local10 - 1] <= 32 || (this.aByteArray38[local10 - 1] & 0xFF) == 160)) {
			local10--;
		}
		if (local7 == 0 && this.anInt2481 == local10) {
			return this;
		}
		@Pc(95) Class74 local95 = new Class74();
		local95.anInt2481 = local10 - local7;
		local95.aByteArray38 = new byte[local95.anInt2481];
		for (@Pc(116) int local116 = 0; local116 < local95.anInt2481; local116++) {
			local95.aByteArray38[local116] = this.aByteArray38[local116 + local7];
		}
		return local95;
	}

	@OriginalMember(owner = "client!u", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class74)) {
			throw new IllegalArgumentException();
		}
		return this.method1733((Class74) arg0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!u;B)Z")
	public boolean method1719(@OriginalArg(0) Class74 arg0) {
		if (this.anInt2481 < arg0.anInt2481) {
			return false;
		}
		for (@Pc(24) int local24 = 0; local24 < arg0.anInt2481; local24++) {
			if (arg0.aByteArray38[local24] != this.aByteArray38[local24]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!u", name = "f", descriptor = "(B)Lclient!u;")
	public Class74 method1720() {
		@Pc(5) Class74 local5 = new Class74();
		local5.anInt2481 = this.anInt2481;
		local5.aByteArray38 = new byte[this.anInt2481];
		@Pc(16) boolean local16 = true;
		for (@Pc(28) int local28 = 0; local28 < this.anInt2481; local28++) {
			@Pc(35) byte local35 = this.aByteArray38[local28];
			if (local35 == 95) {
				local16 = true;
				local5.aByteArray38[local28] = 32;
			} else if (local35 >= 97 && local35 <= 122 && local16) {
				local5.aByteArray38[local28] = (byte) (local35 - 32);
				local16 = false;
			} else {
				local16 = false;
				local5.aByteArray38[local28] = local35;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!u", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1708();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZI)Z")
	private boolean method1721() {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < this.anInt2481; local30++) {
			@Pc(39) int local39 = this.aByteArray38[local30] & 0xFF;
			if (local30 == 0) {
				if (local39 == 45) {
					local15 = true;
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
				return false;
			}
			if (local39 >= 10) {
				return false;
			}
			if (local15) {
				local39 = -local39;
			}
			@Pc(105) int local105 = local28 * 10 + local39;
			if (local105 / 10 != local28) {
				return false;
			}
			local17 = true;
			local28 = local105;
		}
		return local17;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BLclient!u;)I")
	public int method1722(@OriginalArg(1) Class74 arg0) {
		return this.method1732(arg0);
	}

	@OriginalMember(owner = "client!u", name = "g", descriptor = "(B)Lclient!u;")
	public Class74 method1723() {
		@Pc(12) long local12 = this.method1714();
		@Pc(21) Class local21 = u.class;
		synchronized (u.class) {
			@Pc(31) Class2_Sub17 local31;
			if (Static99.aClass58_54 == null) {
				Static99.aClass58_54 = new Class58(4096);
			} else {
				for (local31 = (Class2_Sub17) Static99.aClass58_54.method1307(local12); local31 != null; local31 = (Class2_Sub17) Static99.aClass58_54.method1306()) {
					if (this.method1733(local31.aClass74_1415)) {
						return local31.aClass74_1415;
					}
				}
			}
			local31 = new Class2_Sub17();
			this.aBoolean106 = false;
			local31.aClass74_1415 = this;
			Static99.aClass58_54.method1301(local12, local31);
			return this;
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(Lclient!u;I)Z")
	public boolean method1724(@OriginalArg(0) Class74 arg0) {
		if (arg0.anInt2481 > this.anInt2481) {
			return false;
		}
		@Pc(19) int local19 = this.anInt2481 - arg0.anInt2481;
		for (@Pc(28) int local28 = 0; local28 < arg0.anInt2481; local28++) {
			if (this.aByteArray38[local19 + local28] != arg0.aByteArray38[local28]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!u", name = "g", descriptor = "(I)[B")
	public byte[] method1725() {
		@Pc(12) byte[] local12 = new byte[this.anInt2481];
		Static133.method956(this.aByteArray38, 0, local12, 0, this.anInt2481);
		return local12;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(BI)I")
	private int method1726() {
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2481; local23++) {
			@Pc(32) int local32 = this.aByteArray38[local23] & 0xFF;
			if (local23 == 0) {
				if (local32 == 45) {
					local17 = true;
					continue;
				}
				if (local32 == 43) {
					continue;
				}
			}
			if (local32 >= 48 && local32 <= 57) {
				local32 -= 48;
			} else if (local32 >= 65 && local32 <= 90) {
				local32 -= 55;
			} else if (local32 >= 97 && local32 <= 122) {
				local32 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (local32 >= 10) {
				throw new NumberFormatException();
			}
			if (local17) {
				local32 = -local32;
			}
			@Pc(99) int local99 = local21 * 10 + local32;
			if (local21 != local99 / 10) {
				throw new NumberFormatException();
			}
			local19 = true;
			local21 = local99;
		}
		if (!local19) {
			throw new NumberFormatException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!u", name = "h", descriptor = "(B)Z")
	public boolean method1727() {
		return this.method1721();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)Lclient!u;")
	public Class74 method1728() {
		if (!this.aBoolean106) {
			throw new IllegalArgumentException();
		}
		this.anInt2479 = 0;
		if (this.aByteArray38.length != this.anInt2481) {
			@Pc(28) byte[] local28 = new byte[this.anInt2481];
			Static133.method956(this.aByteArray38, 0, local28, 0, this.anInt2481);
			this.aByteArray38 = local28;
		}
		return this;
	}

	@OriginalMember(owner = "client!u", name = "h", descriptor = "(I)Lclient!u;")
	public Class74 method1729() {
		@Pc(7) Class74 local7 = new Class74();
		local7.anInt2481 = this.anInt2481;
		local7.aByteArray38 = new byte[this.anInt2481];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2481; local18++) {
			@Pc(24) byte local24 = this.aByteArray38[local18];
			if (local24 >= 65 && local24 <= 90 || local24 >= -64 && local24 <= -34 && local24 != -41) {
				local24 = (byte) (local24 + 32);
			}
			local7.aByteArray38[local18] = local24;
		}
		return local7;
	}

	@OriginalMember(owner = "client!u", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(Lclient!u;I)I")
	public int method1731(@OriginalArg(0) Class74 arg0) {
		@Pc(17) int local17;
		if (arg0.anInt2481 >= this.anInt2481) {
			local17 = this.anInt2481;
		} else {
			local17 = arg0.anInt2481;
		}
		for (@Pc(24) int local24 = 0; local24 < local17; local24++) {
			if (Static127.anIntArray412[this.aByteArray38[local24] & 0xFF] < Static127.anIntArray412[arg0.aByteArray38[local24] & 0xFF]) {
				return -1;
			}
			if (Static127.anIntArray412[this.aByteArray38[local24] & 0xFF] > Static127.anIntArray412[arg0.aByteArray38[local24] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt2481 < arg0.anInt2481) {
			return -1;
		} else if (this.anInt2481 > arg0.anInt2481) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IILclient!u;)I")
	private int method1732(@OriginalArg(2) Class74 arg0) {
		@Pc(9) int[] local9 = new int[arg0.anInt2481];
		@Pc(13) int[] local13 = new int[arg0.anInt2481];
		@Pc(16) int[] local16 = new int[256];
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			local16[local18] = arg0.anInt2481;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg0.anInt2481; local36++) {
			local9[local36 - 1] = (arg0.anInt2481 << 1) - local36;
			local16[arg0.aByteArray38[local36 - 1] & 0xFF] = arg0.anInt2481 - local36;
		}
		@Pc(75) int local75 = arg0.anInt2481 + 1;
		for (@Pc(78) int local78 = arg0.anInt2481; local78 > 0; local78--) {
			local13[local78 - 1] = local75;
			while (arg0.anInt2481 >= local75 && arg0.aByteArray38[local78 - 1] != arg0.aByteArray38[local75 - 1]) {
				if (arg0.anInt2481 - local78 <= local9[local75 - 1]) {
					local9[local75 - 1] = arg0.anInt2481 - local78;
				}
				local75 = local13[local75 - 1];
			}
			local75--;
		}
		@Pc(153) int local153 = 1;
		@Pc(155) int local155 = local75;
		local75 = arg0.anInt2481 + 1 - local75;
		@Pc(165) int local165 = 0;
		for (@Pc(167) int local167 = 1; local167 <= local75; local167++) {
			local13[local167 - 1] = local165;
			while (local165 >= 1 && arg0.aByteArray38[local165 - 1] != arg0.aByteArray38[local167 - 1]) {
				local165 = local13[local165 - 1];
			}
			local165++;
		}
		@Pc(216) int local216;
		while (local155 < arg0.anInt2481) {
			for (local216 = local153; local216 <= local155; local216++) {
				if (local9[local216 - 1] >= arg0.anInt2481 + local155 - local216) {
					local9[local216 - 1] = local155 + arg0.anInt2481 - local216;
				}
			}
			local153 = local155 + 1;
			local155 -= local13[local75 - 1] - local75;
			local75 = local13[local75 - 1];
		}
		@Pc(287) int local287;
		for (local216 = arg0.anInt2481 - 1; local216 < this.anInt2481; local216 += Math.max(local16[this.aByteArray38[local216] & 0xFF], local9[local287])) {
			for (local287 = arg0.anInt2481 - 1; local287 >= 0 && this.aByteArray38[local216] == arg0.aByteArray38[local287]; local287--) {
				local216--;
			}
			if (local287 == -1) {
				return local216 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(Lclient!u;B)Z")
	public boolean method1733(@OriginalArg(0) Class74 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2481 == arg0.anInt2481) {
			if (!this.aBoolean106 || !arg0.aBoolean106) {
				if (this.anInt2479 == 0) {
					this.anInt2479 = this.method1708();
					if (this.anInt2479 == 0) {
						this.anInt2479 = 1;
					}
				}
				if (arg0.anInt2479 == 0) {
					arg0.anInt2479 = arg0.method1708();
					if (arg0.anInt2479 == 0) {
						arg0.anInt2479 = 1;
					}
				}
				if (arg0.anInt2479 != this.anInt2479) {
					return false;
				}
			}
			for (@Pc(57) int local57 = 0; local57 < this.anInt2481; local57++) {
				if (arg0.aByteArray38[local57] != this.aByteArray38[local57]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}
