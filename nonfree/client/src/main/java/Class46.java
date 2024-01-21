import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class46 implements Interface3 {

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
	private int anInt2135;

	@OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
	public int anInt2141;

	@OriginalMember(owner = "client!jd", name = "U", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "Z")
	private boolean aBoolean95 = true;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Lclient!jd;")
	public Class46 method1641() {
		if (!this.aBoolean95) {
			throw new IllegalArgumentException();
		}
		this.anInt2135 = 0;
		if (this.anInt2141 != this.aByteArray20.length) {
			@Pc(28) byte[] local28 = new byte[this.anInt2141];
			Static189.method187(this.aByteArray20, 0, local28, 0, this.anInt2141);
			this.aByteArray20 = local28;
		}
		return this;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZLclient!jd;)Lclient!jd;")
	public Class46 method1642(@OriginalArg(1) Class46 arg0) {
		if (!this.aBoolean95) {
			throw new IllegalArgumentException();
		}
		this.anInt2135 = 0;
		if (this.anInt2141 + arg0.anInt2141 > this.aByteArray20.length) {
			@Pc(39) int local39;
			for (local39 = 1; local39 < this.anInt2141 + arg0.anInt2141; local39 += local39) {
			}
			@Pc(55) byte[] local55 = new byte[local39];
			Static189.method187(this.aByteArray20, 0, local55, 0, this.anInt2141);
			this.aByteArray20 = local55;
		}
		Static189.method187(arg0.aByteArray20, 0, this.aByteArray20, this.anInt2141, arg0.anInt2141);
		this.anInt2141 += arg0.anInt2141;
		return this;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Lclient!jd;")
	public Class46 method1643(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean95) {
			this.anInt2135 = 0;
			if (this.anInt2141 == this.aByteArray20.length) {
				@Pc(50) int local50;
				for (local50 = 1; local50 <= this.anInt2141; local50 += local50) {
				}
				@Pc(63) byte[] local63 = new byte[local50];
				Static189.method187(this.aByteArray20, 0, local63, 0, this.anInt2141);
				this.aByteArray20 = local63;
			}
			this.aByteArray20[this.anInt2141++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)Lclient!jd;")
	public Class46 method1644() {
		@Pc(7) int local7;
		for (local7 = 0; this.anInt2141 > local7 && (this.aByteArray20[local7] >= 0 && this.aByteArray20[local7] <= 32 || (this.aByteArray20[local7] & 0xFF) == 160); local7++) {
		}
		@Pc(38) int local38;
		for (local38 = this.anInt2141; local38 > local7 && (this.aByteArray20[local38 - 1] >= 0 && this.aByteArray20[local38 - 1] <= 32 || (this.aByteArray20[local38 - 1] & 0xFF) == 160); local38--) {
		}
		if (local7 == 0 && this.anInt2141 == local38) {
			return this;
		}
		@Pc(93) Class46 local93 = new Class46();
		local93.anInt2141 = local38 - local7;
		local93.aByteArray20 = new byte[local93.anInt2141];
		for (@Pc(106) int local106 = 0; local106 < local93.anInt2141; local106++) {
			local93.aByteArray20[local106] = this.aByteArray20[local106 + local7];
		}
		return local93;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!jd;I)I")
	public int method1645(@OriginalArg(0) Class46 arg0) {
		@Pc(13) int local13;
		if (this.anInt2141 <= arg0.anInt2141) {
			local13 = this.anInt2141;
		} else {
			local13 = arg0.anInt2141;
		}
		for (@Pc(25) int local25 = 0; local25 < local13; local25++) {
			if ((arg0.aByteArray20[local25] & 0xFF) > (this.aByteArray20[local25] & 0xFF)) {
				return -1;
			}
			if ((arg0.aByteArray20[local25] & 0xFF) < (this.aByteArray20[local25] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt2141 < arg0.anInt2141) {
			return -1;
		} else if (this.anInt2141 > arg0.anInt2141) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)J")
	public long method1646() {
		@Pc(3) long local3 = 0L;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2141 && local12 < 12; local12++) {
			local3 *= 37L;
			@Pc(23) byte local23 = this.aByteArray20[local12];
			if (local23 >= 65 && local23 <= 90) {
				local3 += local23 + 1 - 65;
			} else if (local23 >= 97 && local23 <= 122) {
				local3 += local23 + 1 - 97;
			} else if (local23 >= 48 && local23 <= 57) {
				local3 += local23 + 27 - 48;
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)Z")
	private boolean method1647() {
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = 0;
		@Pc(21) boolean local21 = false;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2141; local23++) {
			@Pc(31) int local31 = this.aByteArray20[local23] & 0xFF;
			if (local23 == 0) {
				if (local31 == 45) {
					local13 = true;
					continue;
				}
				if (local31 == 43) {
					continue;
				}
			}
			if (local31 >= 48 && local31 <= 57) {
				local31 -= 48;
			} else if (local31 >= 65 && local31 <= 90) {
				local31 -= 55;
			} else if (local31 >= 97 && local31 <= 122) {
				local31 -= 87;
			} else {
				return false;
			}
			if (local31 >= 10) {
				return false;
			}
			if (local13) {
				local31 = -local31;
			}
			@Pc(93) int local93 = local31 + local15 * 10;
			if (local93 / 10 != local15) {
				return false;
			}
			local21 = true;
			local15 = local93;
		}
		return local21;
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)I")
	public int method1648() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2141; local7++) {
			local5 = (this.aByteArray20[local7] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)J")
	private long method1649() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2141; local7++) {
			local5 = (local5 << 5) + (long) (this.aByteArray20[local7] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)Lclient!jd;")
	public Class46 method1650(@OriginalArg(1) int arg0) {
		return this.method1666(this.anInt2141, arg0);
	}

	@OriginalMember(owner = "client!jd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)Lclient!jd;")
	public Class46 method1651() {
		@Pc(13) Class46 local13 = Static116.method2124(this.method1646());
		return local13 == null ? Static100.aClass46_913 : local13;
	}

	@OriginalMember(owner = "client!jd", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1648();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!jd;Z)I")
	public int method1652(@OriginalArg(0) Class46 arg0) {
		return this.method1679(0, arg0);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLclient!jd;)I")
	public int method1653(@OriginalArg(1) Class46 arg0) {
		@Pc(13) int local13;
		if (this.anInt2141 > arg0.anInt2141) {
			local13 = arg0.anInt2141;
		} else {
			local13 = this.anInt2141;
		}
		for (@Pc(30) int local30 = 0; local30 < local13; local30++) {
			if (Static118.anIntArray266[arg0.aByteArray20[local30] & 0xFF] > Static118.anIntArray266[this.aByteArray20[local30] & 0xFF]) {
				return -1;
			}
			if (Static118.anIntArray266[arg0.aByteArray20[local30] & 0xFF] < Static118.anIntArray266[this.aByteArray20[local30] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt2141 < arg0.anInt2141) {
			return -1;
		} else if (this.anInt2141 > arg0.anInt2141) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)Lclient!jd;")
	public Class46 method1654() {
		@Pc(9) Class46 local9 = new Class46();
		@Pc(11) boolean local11 = true;
		local9.anInt2141 = this.anInt2141;
		local9.aByteArray20 = new byte[this.anInt2141];
		for (@Pc(22) int local22 = 0; local22 < this.anInt2141; local22++) {
			@Pc(29) byte local29 = this.aByteArray20[local22];
			if (local29 == 95) {
				local11 = true;
				local9.aByteArray20[local22] = 32;
			} else if (local29 >= 97 && local29 <= 122 && local11) {
				local9.aByteArray20[local22] = (byte) (local29 - 32);
				local11 = false;
			} else {
				local11 = false;
				local9.aByteArray20[local22] = local29;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(II)Lclient!jd;")
	public Class46 method1655(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(19) Class46 local19 = new Class46();
		local19.aByteArray20 = new byte[this.anInt2141 + 1];
		local19.anInt2141 = this.anInt2141 + 1;
		Static189.method187(this.aByteArray20, 0, local19.aByteArray20, 0, this.anInt2141);
		local19.aByteArray20[this.anInt2141] = (byte) arg0;
		return local19;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public void method1657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2) {
		@Pc(21) String local21;
		try {
			local21 = new String(this.aByteArray20, 0, this.anInt2141, "ISO-8859-1");
		} catch (@Pc(23) UnsupportedEncodingException local23) {
			local21 = new String(this.aByteArray20, 0, this.anInt2141);
		}
		arg2.drawString(local21, arg0, arg1);
	}

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)I")
	public int method1658() {
		return this.method1661(10);
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)Z")
	public boolean method1659() {
		return this.method1647();
	}

	@OriginalMember(owner = "client!jd", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class46)) {
			throw new IllegalArgumentException();
		}
		return this.method1668((Class46) arg0);
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)[B")
	public byte[] method1660() {
		@Pc(7) byte[] local7 = new byte[this.anInt2141];
		Static189.method187(this.aByteArray20, 0, local7, 0, this.anInt2141);
		return local7;
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(II)I")
	public int method1661(@OriginalArg(1) int arg0) {
		@Pc(15) boolean local15 = false;
		@Pc(25) int local25 = 0;
		@Pc(27) boolean local27 = false;
		for (@Pc(29) int local29 = 0; local29 < this.anInt2141; local29++) {
			@Pc(38) int local38 = this.aByteArray20[local29] & 0xFF;
			if (local29 == 0) {
				if (local38 == 45) {
					local15 = true;
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
				throw new NumberFormatException();
			}
			if (arg0 <= local38) {
				throw new NumberFormatException();
			}
			if (local15) {
				local38 = -local38;
			}
			@Pc(111) int local111 = arg0 * local25 + local38;
			if (local111 / arg0 != local25) {
				throw new NumberFormatException();
			}
			local25 = local111;
			local27 = true;
		}
		if (!local27) {
			throw new NumberFormatException();
		}
		return local25;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(BLclient!jd;)Z")
	public boolean method1662(@OriginalArg(1) Class46 arg0) {
		if (this.anInt2141 < arg0.anInt2141) {
			return false;
		}
		@Pc(19) int local19 = this.anInt2141 - arg0.anInt2141;
		for (@Pc(26) int local26 = 0; local26 < arg0.anInt2141; local26++) {
			if (this.aByteArray20[local19 + local26] != arg0.aByteArray20[local26]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)Lclient!jd;")
	public Class46 method1664() {
		@Pc(5) Class46 local5 = new Class46();
		local5.anInt2141 = this.anInt2141;
		local5.aByteArray20 = new byte[this.anInt2141];
		for (@Pc(20) int local20 = 0; local20 < this.anInt2141; local20++) {
			local5.aByteArray20[local20] = 42;
		}
		return local5;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/applet/Applet;B)V")
	public void method1665(@OriginalArg(0) Applet arg0) throws Throwable {
		@Pc(20) String local20 = new String(this.aByteArray20, 0, this.anInt2141);
		Static190.method268(local20, arg0);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Lclient!jd;")
	public Class46 method1666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class46 local7 = new Class46();
		local7.aByteArray20 = new byte[arg0 - arg1];
		local7.anInt2141 = arg0 - arg1;
		Static189.method187(this.aByteArray20, arg1, local7.aByteArray20, 0, local7.anInt2141);
		return local7;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(III)I")
	public int method1667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte local8 = (byte) arg1;
		for (@Pc(15) int local15 = arg0; local15 < this.anInt2141; local15++) {
			if (local8 == this.aByteArray20[local15]) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!jd;)Z")
	public boolean method1668(@OriginalArg(1) Class46 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2141 == arg0.anInt2141) {
			if (!this.aBoolean95 || !arg0.aBoolean95) {
				if (this.anInt2135 == 0) {
					this.anInt2135 = this.method1648();
					if (this.anInt2135 == 0) {
						this.anInt2135 = 1;
					}
				}
				if (arg0.anInt2135 == 0) {
					arg0.anInt2135 = arg0.method1648();
					if (arg0.anInt2135 == 0) {
						arg0.anInt2135 = 1;
					}
				}
				if (this.anInt2135 != arg0.anInt2135) {
					return false;
				}
			}
			for (@Pc(69) int local69 = 0; local69 < this.anInt2141; local69++) {
				if (this.aByteArray20[local69] != arg0.aByteArray20[local69]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(Z)Lclient!jd;")
	public Class46 method1669() {
		@Pc(3) Class46 local3 = new Class46();
		local3.anInt2141 = this.anInt2141;
		local3.aByteArray20 = new byte[this.anInt2141];
		for (@Pc(25) int local25 = 0; local25 < this.anInt2141; local25++) {
			@Pc(31) byte local31 = this.aByteArray20[local25];
			if (local31 >= 65 && local31 <= 90 || local31 >= -64 && local31 <= -34 && local31 != -41) {
				local31 = (byte) (local31 + 32);
			}
			local3.aByteArray20[local25] = local31;
		}
		return local3;
	}

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "(B)Lclient!jd;")
	public Class46 method1670() {
		@Pc(9) Class46 local9 = new Class46();
		@Pc(19) byte local19 = 2;
		local9.anInt2141 = this.anInt2141;
		local9.aByteArray20 = new byte[this.anInt2141];
		for (@Pc(30) int local30 = 0; local30 < this.anInt2141; local30++) {
			@Pc(37) byte local37 = this.aByteArray20[local30];
			if (local37 >= 97 && local37 <= 122 || !(local37 < -32 || local37 > -2 || local37 == -9)) {
				if (local19 == 2) {
					local37 = (byte) (local37 - 32);
				}
				local19 = 0;
			} else if (local37 >= 65 && local37 <= 90 || !(local37 < -64 || local37 > -34 || local37 == -41)) {
				if (local19 == 0) {
					local37 = (byte) (local37 + 32);
				}
				local19 = 0;
			} else if (local37 == 46 || local37 == 33 || local37 == 63) {
				local19 = 2;
			} else if (local37 != 32) {
				local19 = 1;
			} else if (local19 != 2) {
				local19 = 1;
			}
			local9.aByteArray20[local30] = local37;
		}
		return local9;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method1671(@OriginalArg(0) FontMetrics arg0) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray20, 0, this.anInt2141, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray20, 0, this.anInt2141);
		}
		return arg0.stringWidth(local18);
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(BI)I")
	public int method1672(@OriginalArg(1) int arg0) {
		return this.aByteArray20[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(Lclient!jd;Z)Z")
	public boolean method1673(@OriginalArg(0) Class46 arg0) {
		if (this.anInt2141 < arg0.anInt2141) {
			return false;
		}
		for (@Pc(23) int local23 = 0; local23 < arg0.anInt2141; local23++) {
			if (this.aByteArray20[local23] != arg0.aByteArray20[local23]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II[BII)I")
	public int method1675(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static189.method187(this.aByteArray20, 0, arg0, arg2, arg1);
		return arg1;
	}

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(B)Ljava/net/URL;")
	public URL method1676() throws MalformedURLException {
		return new URL(new String(this.aByteArray20, 0, this.anInt2141));
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(Z)I")
	public int method1677() {
		return this.anInt2141;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBLclient!jd;)I")
	public int method1679(@OriginalArg(0) int arg0, @OriginalArg(2) Class46 arg1) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(12) int[] local12 = new int[arg1.anInt2141];
		@Pc(16) int[] local16 = new int[arg1.anInt2141];
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			local8[local18] = arg1.anInt2141;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg1.anInt2141; local36++) {
			local16[local36 - 1] = (arg1.anInt2141 << 1) - local36;
			local8[arg1.aByteArray20[local36 - 1] & 0xFF] = arg1.anInt2141 - local36;
		}
		@Pc(74) int local74 = arg1.anInt2141 + 1;
		@Pc(77) int local77 = arg1.anInt2141;
		while (local77 > 0) {
			local12[local77 - 1] = local74;
			while (local74 <= arg1.anInt2141 && arg1.aByteArray20[local77 - 1] != arg1.aByteArray20[local74 - 1]) {
				if (local16[local74 - 1] >= arg1.anInt2141 - local77) {
					local16[local74 - 1] = arg1.anInt2141 - local77;
				}
				local74 = local12[local74 - 1];
			}
			local77--;
			local74--;
		}
		@Pc(149) int local149 = local74;
		@Pc(151) int local151 = 1;
		local74 = arg1.anInt2141 + 1 - local74;
		@Pc(161) int local161 = 0;
		@Pc(163) int local163 = 1;
		while (local163 <= local74) {
			local12[local163 - 1] = local161;
			while (local161 >= 1 && arg1.aByteArray20[local163 - 1] != arg1.aByteArray20[local161 - 1]) {
				local161 = local12[local161 - 1];
			}
			local163++;
			local161++;
		}
		@Pc(210) int local210;
		while (arg1.anInt2141 > local149) {
			for (local210 = local151; local210 <= local149; local210++) {
				if (local16[local210 - 1] >= arg1.anInt2141 + local149 - local210) {
					local16[local210 - 1] = arg1.anInt2141 + local149 - local210;
				}
			}
			local151 = local149 + 1;
			local149 = local74 + local149 - local12[local74 + -1];
			local74 = local12[local74 - 1];
		}
		@Pc(292) int local292;
		for (local210 = arg0 + arg1.anInt2141 - 1; local210 < this.anInt2141; local210 += Math.max(local8[this.aByteArray20[local210] & 0xFF], local16[local292])) {
			for (local292 = arg1.anInt2141 - 1; local292 >= 0 && arg1.aByteArray20[local292] == this.aByteArray20[local210]; local292--) {
				local210--;
			}
			if (local292 == -1) {
				return local210 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "(B)Lclient!jd;")
	public Class46 method1681() {
		@Pc(7) long local7 = this.method1649();
		@Pc(16) Class local16 = jd.class;
		synchronized (jd.class) {
			@Pc(32) Class4_Sub22 local32;
			if (Static27.aClass20_2 == null) {
				Static27.aClass20_2 = new Class20(4096);
			} else {
				for (local32 = (Class4_Sub22) Static27.aClass20_2.method505(local7); local32 != null; local32 = (Class4_Sub22) Static27.aClass20_2.method503()) {
					if (this.method1668(local32.aClass46_1237)) {
						return local32.aClass46_1237;
					}
				}
			}
			local32 = new Class4_Sub22();
			local32.aClass46_1237 = this;
			this.aBoolean95 = false;
			Static27.aClass20_2.method499(local7, local32);
			return this;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZLjava/applet/Applet;)Lclient!jd;")
	public Class46 method1682(@OriginalArg(1) Applet arg0) {
		@Pc(17) String local17 = new String(this.aByteArray20, 0, this.anInt2141);
		@Pc(21) String local21 = arg0.getParameter(local17);
		return local21 == null ? null : Static40.method696(local21);
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(ILclient!jd;)Z")
	public boolean method1683(@OriginalArg(1) Class46 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2141 == arg0.anInt2141) {
			for (@Pc(29) int local29 = 0; local29 < this.anInt2141; local29++) {
				@Pc(36) byte local36 = this.aByteArray20[local29];
				if (local36 >= 65 && local36 <= 90 || local36 >= -64 && local36 <= -34 && local36 != -41) {
					local36 = (byte) (local36 + 32);
				}
				@Pc(67) byte local67 = arg0.aByteArray20[local29];
				if (local67 >= 65 && local67 <= 90 || local67 >= -64 && local67 <= -34 && local67 != -41) {
					local67 = (byte) (local67 + 32);
				}
				if (local67 != local36) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}
