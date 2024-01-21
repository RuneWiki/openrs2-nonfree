import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class63 implements Interface2 {

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
	public int anInt2746;

	@OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
	private int anInt2763;

	@OriginalMember(owner = "client!rd", name = "X", descriptor = "Z")
	private boolean aBoolean149 = true;

	@OriginalMember(owner = "client!rd", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class63)) {
			throw new IllegalArgumentException();
		}
		return this.method1819((Class63) arg0);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Lclient!rd;")
	public Class63 method1793() {
		@Pc(9) Class63 local9 = new Class63();
		local9.anInt2746 = this.anInt2746;
		local9.aByteArray33 = new byte[this.anInt2746];
		for (@Pc(20) int local20 = 0; local20 < this.anInt2746; local20++) {
			local9.aByteArray33[local20] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)Z")
	private boolean method1794() {
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		for (@Pc(33) int local33 = 0; local33 < this.anInt2746; local33++) {
			@Pc(42) int local42 = this.aByteArray33[local33] & 0xFF;
			if (local33 == 0) {
				if (local42 == 45) {
					local21 = true;
					continue;
				}
				if (local42 == 43) {
					continue;
				}
			}
			if (local42 >= 48 && local42 <= 57) {
				local42 -= 48;
			} else if (local42 >= 65 && local42 <= 90) {
				local42 -= 55;
			} else if (local42 >= 97 && local42 <= 122) {
				local42 -= 87;
			} else {
				return false;
			}
			if (local42 >= 10) {
				return false;
			}
			if (local21) {
				local42 = -local42;
			}
			@Pc(105) int local105 = local23 * 10 + local42;
			if (local105 / 10 != local23) {
				return false;
			}
			local23 = local105;
			local19 = true;
		}
		return local19;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method1795(@OriginalArg(0) FontMetrics arg0) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray33, 0, this.anInt2746, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray33, 0, this.anInt2746);
		}
		return arg0.stringWidth(local9);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)I")
	public int method1796() {
		return this.method1799();
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)I")
	public int method1798() {
		@Pc(5) int local5 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2746; local12++) {
			local5 = (this.aByteArray33[local12] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)I")
	private int method1799() {
		@Pc(7) boolean local7 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		for (@Pc(30) int local30 = 0; local30 < this.anInt2746; local30++) {
			@Pc(39) int local39 = this.aByteArray33[local30] & 0xFF;
			if (local30 == 0) {
				if (local39 == 45) {
					local7 = true;
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
			if (local7) {
				local39 = -local39;
			}
			@Pc(117) int local117 = local23 * 10 + local39;
			if (local23 != local117 / 10) {
				throw new NumberFormatException();
			}
			local23 = local117;
			local21 = true;
		}
		if (!local21) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)Lclient!rd;")
	public Class63 method1800() {
		if (!this.aBoolean149) {
			throw new IllegalArgumentException();
		}
		this.anInt2763 = 0;
		if (this.anInt2746 != this.aByteArray33.length) {
			@Pc(31) byte[] local31 = new byte[this.anInt2746];
			Static129.method1440(this.aByteArray33, 0, local31, 0, this.anInt2746);
			this.aByteArray33 = local31;
		}
		return this;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)J")
	private long method1801() {
		@Pc(5) long local5 = 0L;
		for (@Pc(14) int local14 = 0; local14 < this.anInt2746; local14++) {
			local5 = (local5 << 5) + (long) (this.aByteArray33[local14] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!rd", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1798();
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)Lclient!rd;")
	public Class63 method1802() {
		@Pc(7) Class63 local7 = new Class63();
		local7.aByteArray33 = new byte[12];
		local7.anInt2746 = 0;
		@Pc(16) int local16 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2746; local23++) {
			if (this.aByteArray33[local23] >= 65 && this.aByteArray33[local23] <= 90) {
				local7.aByteArray33[local16++] = (byte) (this.aByteArray33[local23] + 97 - 65);
				local7.anInt2746 = local16;
			} else if (this.aByteArray33[local23] >= 97 && this.aByteArray33[local23] <= 122 || this.aByteArray33[local23] >= 48 && this.aByteArray33[local23] <= 57) {
				local7.aByteArray33[local16++] = this.aByteArray33[local23];
				local7.anInt2746 = local16;
			} else if (local16 > 0) {
				local7.aByteArray33[local16++] = 95;
			}
			if (local16 == 12) {
				break;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLclient!rd;)Z")
	public boolean method1803(@OriginalArg(1) Class63 arg0) {
		if (this.anInt2746 < arg0.anInt2746) {
			return false;
		}
		for (@Pc(23) int local23 = 0; local23 < arg0.anInt2746; local23++) {
			if (this.aByteArray33[local23] != arg0.aByteArray33[local23]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!rd;B)I")
	public int method1804(@OriginalArg(0) Class63 arg0) {
		@Pc(13) int local13;
		if (this.anInt2746 <= arg0.anInt2746) {
			local13 = this.anInt2746;
		} else {
			local13 = arg0.anInt2746;
		}
		for (@Pc(27) int local27 = 0; local27 < local13; local27++) {
			if (Static111.anIntArray353[this.aByteArray33[local27] & 0xFF] < Static111.anIntArray353[arg0.aByteArray33[local27] & 0xFF]) {
				return -1;
			}
			if (Static111.anIntArray353[this.aByteArray33[local27] & 0xFF] > Static111.anIntArray353[arg0.aByteArray33[local27] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt2746 > this.anInt2746) {
			return -1;
		} else if (this.anInt2746 > arg0.anInt2746) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(BLclient!rd;)I")
	public int method1805(@OriginalArg(1) Class63 arg0) {
		return this.method1826(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)Lclient!rd;")
	public Class63 method1806(@OriginalArg(0) int arg0) {
		return this.method1820(this.anInt2746, arg0);
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)Z")
	public boolean method1807() {
		return this.method1794();
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)I")
	public int method1808() {
		return this.method1824();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLjava/awt/Graphics;II)V")
	public void method1809(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray33, 0, this.anInt2746, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray33, 0, this.anInt2746);
		}
		arg0.drawString(local13, arg2, arg1);
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(II)I")
	public int method1810(@OriginalArg(0) int arg0) {
		return this.aByteArray33[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)I")
	public int method1811() {
		return this.anInt2746;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!rd;I)Lclient!rd;")
	public Class63 method1813(@OriginalArg(0) Class63 arg0) {
		if (!this.aBoolean149) {
			throw new IllegalArgumentException();
		}
		this.anInt2763 = 0;
		if (this.anInt2746 + arg0.anInt2746 > this.aByteArray33.length) {
			@Pc(30) int local30;
			for (local30 = 1; local30 < arg0.anInt2746 + this.anInt2746; local30 += local30) {
			}
			@Pc(50) byte[] local50 = new byte[local30];
			Static129.method1440(this.aByteArray33, 0, local50, 0, this.anInt2746);
			this.aByteArray33 = local50;
		}
		Static129.method1440(arg0.aByteArray33, 0, this.aByteArray33, this.anInt2746, arg0.anInt2746);
		this.anInt2746 += arg0.anInt2746;
		return this;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)Lclient!rd;")
	public Class63 method1814() {
		@Pc(5) Class63 local5 = new Class63();
		@Pc(11) boolean local11 = true;
		local5.anInt2746 = this.anInt2746;
		local5.aByteArray33 = new byte[this.anInt2746];
		for (@Pc(22) int local22 = 0; local22 < this.anInt2746; local22++) {
			@Pc(29) byte local29 = this.aByteArray33[local22];
			if (local29 == 95) {
				local5.aByteArray33[local22] = 32;
				local11 = true;
			} else if (local29 >= 97 && local29 <= 122 && local11) {
				local5.aByteArray33[local22] = (byte) (local29 - 32);
				local11 = false;
			} else {
				local11 = false;
				local5.aByteArray33[local22] = local29;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(II)Lclient!rd;")
	public Class63 method1815(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		} else if (this.aBoolean149) {
			this.anInt2763 = 0;
			if (this.aByteArray33.length == this.anInt2746) {
				@Pc(48) int local48;
				for (local48 = 1; local48 <= this.anInt2746; local48 += local48) {
				}
				@Pc(61) byte[] local61 = new byte[local48];
				Static129.method1440(this.aByteArray33, 0, local61, 0, this.anInt2746);
				this.aByteArray33 = local61;
			}
			this.aByteArray33[this.anInt2746++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBLclient!rd;)Lclient!rd;")
	public Class63 method1817(@OriginalArg(0) int arg0, @OriginalArg(2) Class63 arg1) {
		if (!this.aBoolean149) {
			throw new IllegalArgumentException();
		} else if (arg0 > this.anInt2746) {
			throw new IllegalArgumentException();
		} else {
			this.anInt2763 = 0;
			if (this.aByteArray33.length < arg0 + arg1.anInt2746) {
				@Pc(34) int local34;
				for (local34 = 1; local34 < arg0 + arg1.anInt2746; local34 += local34) {
				}
				@Pc(49) byte[] local49 = new byte[local34];
				Static129.method1440(this.aByteArray33, 0, local49, 0, this.anInt2746);
				this.aByteArray33 = local49;
			}
			Static129.method1440(arg1.aByteArray33, 0, this.aByteArray33, arg0, arg1.anInt2746);
			if (this.anInt2746 < arg1.anInt2746 + arg0) {
				this.anInt2746 = arg1.anInt2746 + arg0;
			}
			return this;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)Lclient!rd;")
	public Class63 method1818(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(17) Class63 local17 = new Class63();
		local17.aByteArray33 = new byte[this.anInt2746 + 1];
		local17.anInt2746 = this.anInt2746 + 1;
		Static129.method1440(this.aByteArray33, 0, local17.aByteArray33, 0, this.anInt2746);
		local17.aByteArray33[this.anInt2746] = (byte) arg0;
		return local17;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!rd;Z)Z")
	public boolean method1819(@OriginalArg(0) Class63 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt2746 == this.anInt2746) {
			if (!this.aBoolean149 || !arg0.aBoolean149) {
				if (this.anInt2763 == 0) {
					this.anInt2763 = this.method1798();
					if (this.anInt2763 == 0) {
						this.anInt2763 = 1;
					}
				}
				if (arg0.anInt2763 == 0) {
					arg0.anInt2763 = arg0.method1798();
					if (arg0.anInt2763 == 0) {
						arg0.anInt2763 = 1;
					}
				}
				if (this.anInt2763 != arg0.anInt2763) {
					return false;
				}
			}
			for (@Pc(68) int local68 = 0; local68 < this.anInt2746; local68++) {
				if (arg0.aByteArray33[local68] != this.aByteArray33[local68]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIB)Lclient!rd;")
	public Class63 method1820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class63 local3 = new Class63();
		local3.aByteArray33 = new byte[arg0 - arg1];
		local3.anInt2746 = arg0 - arg1;
		Static129.method1440(this.aByteArray33, arg1, local3.aByteArray33, 0, local3.anInt2746);
		return local3;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!rd;)Z")
	public boolean method1821(@OriginalArg(1) Class63 arg0) {
		if (this.anInt2746 < arg0.anInt2746) {
			return false;
		}
		@Pc(28) int local28 = this.anInt2746 - arg0.anInt2746;
		for (@Pc(30) int local30 = 0; local30 < arg0.anInt2746; local30++) {
			if (arg0.aByteArray33[local30] != this.aByteArray33[local30 + local28]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Lclient!rd;Z)Z")
	public boolean method1822(@OriginalArg(0) Class63 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2746 == arg0.anInt2746) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt2746; local26++) {
				@Pc(33) byte local33 = this.aByteArray33[local26];
				if (local33 >= 65 && local33 <= 90 || local33 >= -64 && local33 <= -34 && local33 != -41) {
					local33 = (byte) (local33 + 32);
				}
				@Pc(62) byte local62 = arg0.aByteArray33[local26];
				if (local62 >= 65 && local62 <= 90 || local62 >= -64 && local62 <= -34 && local62 != -41) {
					local62 = (byte) (local62 + 32);
				}
				if (local62 != local33) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)J")
	public long method1823() {
		@Pc(12) long local12 = 0L;
		for (@Pc(14) int local14 = 0; local14 < this.anInt2746 && local14 < 12; local14++) {
			@Pc(21) byte local21 = this.aByteArray33[local14];
			local12 *= 37L;
			if (local21 >= 65 && local21 <= 90) {
				local12 += local21 + 1 - 65;
			} else if (local21 >= 97 && local21 <= 122) {
				local12 += local21 - 96;
			} else if (local21 >= 48 && local21 <= 57) {
				local12 += local21 - 21;
			}
		}
		while (local12 % 37L == 0L && local12 != 0L) {
			local12 /= 37L;
		}
		return local12;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IIB)I")
	private int method1824() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt2746; local15++) {
			if (this.aByteArray33[local15] == 32) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BILclient!rd;)I")
	private int method1826(@OriginalArg(2) Class63 arg0) {
		@Pc(9) int[] local9 = new int[arg0.anInt2746];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg0.anInt2746];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg0.anInt2746;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg0.anInt2746; local36++) {
			local9[local36 - 1] = (arg0.anInt2746 << 1) - local36;
			local12[arg0.aByteArray33[local36 - 1] & 0xFF] = arg0.anInt2746 - local36;
		}
		@Pc(78) int local78 = arg0.anInt2746 + 1;
		for (@Pc(81) int local81 = arg0.anInt2746; local81 > 0; local81--) {
			local16[local81 - 1] = local78;
			while (local78 <= arg0.anInt2746 && arg0.aByteArray33[local81 - 1] != arg0.aByteArray33[local78 - 1]) {
				if (local9[local78 - 1] >= arg0.anInt2746 - local81) {
					local9[local78 - 1] = arg0.anInt2746 - local81;
				}
				local78 = local16[local78 - 1];
			}
			local78--;
		}
		@Pc(151) int local151 = 0;
		@Pc(153) int local153 = 1;
		@Pc(155) int local155 = local78;
		local78 = arg0.anInt2746 + 1 - local78;
		for (@Pc(165) int local165 = 1; local165 <= local78; local165++) {
			local16[local165 - 1] = local151;
			while (local151 >= 1 && arg0.aByteArray33[local165 - 1] != arg0.aByteArray33[local151 - 1]) {
				local151 = local16[local151 - 1];
			}
			local151++;
		}
		@Pc(212) int local212;
		while (local155 < arg0.anInt2746) {
			for (local212 = local153; local212 <= local155; local212++) {
				if (arg0.anInt2746 + local155 - local212 <= local9[local212 + -1]) {
					local9[local212 - 1] = local155 + arg0.anInt2746 - local212;
				}
			}
			local153 = local155 + 1;
			local155 = local155 + local78 - local16[local78 + -1];
			local78 = local16[local78 - 1];
		}
		@Pc(290) int local290;
		for (local212 = arg0.anInt2746 - 1; local212 < this.anInt2746; local212 += Math.max(local12[this.aByteArray33[local212] & 0xFF], local9[local290])) {
			for (local290 = arg0.anInt2746 - 1; local290 >= 0 && arg0.aByteArray33[local290] == this.aByteArray33[local212]; local290--) {
				local212--;
			}
			if (local290 == -1) {
				return local212 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)Lclient!rd;")
	public Class63 method1827() {
		@Pc(15) Class63 local15 = new Class63();
		local15.anInt2746 = this.anInt2746;
		local15.aByteArray33 = new byte[this.anInt2746];
		@Pc(26) byte local26 = 2;
		for (@Pc(28) int local28 = 0; local28 < this.anInt2746; local28++) {
			@Pc(35) byte local35 = this.aByteArray33[local28];
			if (local35 >= 97 && local35 <= 122 || local35 >= -32 && local35 <= -2 && local35 != -9) {
				if (local26 == 2) {
					local35 = (byte) (local35 - 32);
				}
				local26 = 0;
			} else if (local35 >= 65 && local35 <= 90 || !(local35 < -64 || local35 > -34 || local35 == -41)) {
				if (local26 == 0) {
					local35 = (byte) (local35 + 32);
				}
				local26 = 0;
			} else if (local35 == 46 || local35 == 33 || local35 == 63) {
				local26 = 2;
			} else if (local35 != 32) {
				local26 = 1;
			} else if (local26 != 2) {
				local26 = 1;
			}
			local15.aByteArray33[local28] = local35;
		}
		return local15;
	}

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "(I)Lclient!rd;")
	public Class63 method1829() {
		@Pc(9) Class63 local9 = new Class63();
		local9.anInt2746 = this.anInt2746;
		local9.aByteArray33 = new byte[this.anInt2746];
		for (@Pc(28) int local28 = 0; local28 < this.anInt2746; local28++) {
			@Pc(35) byte local35 = this.aByteArray33[local28];
			if (local35 >= 65 && local35 <= 90 || local35 >= -64 && local35 <= -34 && local35 != -41) {
				local35 = (byte) (local35 + 32);
			}
			local9.aByteArray33[local28] = local35;
		}
		return local9;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)[B")
	public byte[] method1830() {
		@Pc(14) byte[] local14 = new byte[this.anInt2746];
		Static129.method1440(this.aByteArray33, 0, local14, 0, this.anInt2746);
		return local14;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[BIII)I")
	public int method1831(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(4) int arg2) {
		Static129.method1440(this.aByteArray33, 0, arg1, arg2, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(B)Lclient!rd;")
	public Class63 method1832() {
		@Pc(8) long local8 = this.method1801();
		@Pc(21) Class local21 = rd.class;
		synchronized (rd.class) {
			@Pc(37) Class6_Sub1 local37;
			if (Static65.aClass2_7 == null) {
				Static65.aClass2_7 = new Class2(4096);
			} else {
				for (local37 = (Class6_Sub1) Static65.aClass2_7.method20(local8); local37 != null; local37 = (Class6_Sub1) Static65.aClass2_7.method22()) {
					if (this.method1819(local37.aClass63_60)) {
						return local37.aClass63_60;
					}
				}
			}
			local37 = new Class6_Sub1();
			local37.aClass63_60 = this;
			this.aBoolean149 = false;
			Static65.aClass2_7.method18(local37, local8);
			return this;
		}
	}

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "(I)Lclient!rd;")
	public Class63 method1833() {
		@Pc(12) int local12;
		for (local12 = 0; local12 < this.anInt2746 && (this.aByteArray33[local12] >= 0 && this.aByteArray33[local12] <= 32 || (this.aByteArray33[local12] & 0xFF) == 160); local12++) {
		}
		@Pc(52) int local52;
		for (local52 = this.anInt2746; local52 > local12 && (this.aByteArray33[local52 - 1] >= 0 && this.aByteArray33[local52 - 1] <= 32 || (this.aByteArray33[local52 - 1] & 0xFF) == 160); local52--) {
		}
		if (local12 == 0 && this.anInt2746 == local52) {
			return this;
		}
		@Pc(103) Class63 local103 = new Class63();
		local103.anInt2746 = local52 - local12;
		local103.aByteArray33 = new byte[local103.anInt2746];
		for (@Pc(116) int local116 = 0; local116 < local103.anInt2746; local116++) {
			local103.aByteArray33[local116] = this.aByteArray33[local116 + local12];
		}
		return local103;
	}
}
