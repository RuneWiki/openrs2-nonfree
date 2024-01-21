import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class71 implements Interface2 {

	@OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
	private int anInt2731;

	@OriginalMember(owner = "client!vc", name = "Q", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
	public int anInt2736;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Z")
	private boolean aBoolean121 = true;

	@OriginalMember(owner = "client!vc", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class71)) {
			throw new IllegalArgumentException();
		}
		return this.method1813((Class71) arg0);
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)I")
	public int method1782() {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2736; local12++) {
			local10 = (local10 << 5) + (this.aByteArray28[local12] & 0xFF) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!vc", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1782();
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)I")
	public int method1784() {
		return this.anInt2736;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!vc;)Z")
	public boolean method1785(@OriginalArg(1) Class71 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt2736 == this.anInt2736) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt2736; local23++) {
				@Pc(30) byte local30 = this.aByteArray28[local23];
				if (local30 >= 65 && local30 <= 90 || local30 >= -64 && local30 <= -34 && local30 != -41) {
					local30 = (byte) (local30 + 32);
				}
				@Pc(61) byte local61 = arg0.aByteArray28[local23];
				if (local61 >= 65 && local61 <= 90 || local61 >= -64 && local61 <= -34 && local61 != -41) {
					local61 = (byte) (local61 + 32);
				}
				if (local30 != local61) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)J")
	private long method1786() {
		@Pc(5) long local5 = 0L;
		for (@Pc(14) int local14 = 0; local14 < this.anInt2736; local14++) {
			local5 = (long) (this.aByteArray28[local14] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)Lclient!vc;")
	public Class71 method1787() {
		@Pc(15) Class71 local15 = new Class71();
		local15.anInt2736 = this.anInt2736;
		local15.aByteArray28 = new byte[this.anInt2736];
		for (@Pc(26) int local26 = 0; local26 < this.anInt2736; local26++) {
			local15.aByteArray28[local26] = 42;
		}
		return local15;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!vc;I)Z")
	public boolean method1788(@OriginalArg(0) Class71 arg0) {
		if (this.anInt2736 < arg0.anInt2736) {
			return false;
		}
		@Pc(19) int local19 = this.anInt2736 - arg0.anInt2736;
		for (@Pc(27) int local27 = 0; local27 < arg0.anInt2736; local27++) {
			if (arg0.aByteArray28[local27] != this.aByteArray28[local19 + local27]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)Lclient!vc;")
	public Class71 method1789() {
		@Pc(9) long local9 = this.method1786();
		@Pc(18) Class local18 = vc.class;
		synchronized (vc.class) {
			@Pc(34) Class5_Sub13 local34;
			if (Static76.aClass57_11 == null) {
				Static76.aClass57_11 = new Class57(4096);
			} else {
				for (local34 = (Class5_Sub13) Static76.aClass57_11.method1575(local9); local34 != null; local34 = (Class5_Sub13) Static76.aClass57_11.method1577()) {
					if (this.method1813(local34.aClass71_1173)) {
						return local34.aClass71_1173;
					}
				}
			}
			local34 = new Class5_Sub13();
			this.aBoolean121 = false;
			local34.aClass71_1173 = this;
			Static76.aClass57_11.method1581(local9, local34);
			return this;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!vc;B)I")
	public int method1790(@OriginalArg(0) Class71 arg0) {
		return this.method1799(arg0);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Lclient!vc;")
	public Class71 method1791(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(20) Class71 local20 = new Class71();
		local20.aByteArray28 = new byte[this.anInt2736 + 1];
		local20.anInt2736 = this.anInt2736 + 1;
		Static127.method1745(this.aByteArray28, 0, local20.aByteArray28, 0, this.anInt2736);
		local20.aByteArray28[this.anInt2736] = (byte) arg0;
		return local20;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)Lclient!vc;")
	public Class71 method1792() {
		@Pc(5) Class71 local5 = new Class71();
		local5.anInt2736 = this.anInt2736;
		local5.aByteArray28 = new byte[this.anInt2736];
		for (@Pc(25) int local25 = 0; local25 < this.anInt2736; local25++) {
			@Pc(32) byte local32 = this.aByteArray28[local25];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local5.aByteArray28[local25] = local32;
		}
		return local5;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)[B")
	public byte[] method1793() {
		@Pc(15) byte[] local15 = new byte[this.anInt2736];
		Static127.method1745(this.aByteArray28, 0, local15, 0, this.anInt2736);
		return local15;
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(B)Lclient!vc;")
	public Class71 method1794() {
		if (!this.aBoolean121) {
			throw new IllegalArgumentException();
		}
		this.anInt2731 = 0;
		if (this.anInt2736 != this.aByteArray28.length) {
			@Pc(29) byte[] local29 = new byte[this.anInt2736];
			Static127.method1745(this.aByteArray28, 0, local29, 0, this.anInt2736);
			this.aByteArray28 = local29;
		}
		return this;
	}

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)Lclient!vc;")
	public Class71 method1796() {
		@Pc(9) Class71 local9 = new Class71();
		local9.aByteArray28 = new byte[12];
		@Pc(15) int local15 = 0;
		local9.anInt2736 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anInt2736; local25++) {
			if (this.aByteArray28[local25] >= 65 && this.aByteArray28[local25] <= 90) {
				local9.aByteArray28[local15++] = (byte) (this.aByteArray28[local25] + 97 - 65);
				local9.anInt2736 = local15;
			} else if (this.aByteArray28[local25] >= 97 && this.aByteArray28[local25] <= 122 || this.aByteArray28[local25] >= 48 && this.aByteArray28[local25] <= 57) {
				local9.aByteArray28[local15++] = this.aByteArray28[local25];
				local9.anInt2736 = local15;
			} else if (local15 > 0) {
				local9.aByteArray28[local15++] = 95;
			}
			if (local15 == 12) {
				break;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)Lclient!vc;")
	public Class71 method1797() {
		@Pc(15) boolean local15 = true;
		@Pc(19) Class71 local19 = new Class71();
		local19.anInt2736 = this.anInt2736;
		local19.aByteArray28 = new byte[this.anInt2736];
		for (@Pc(30) int local30 = 0; local30 < this.anInt2736; local30++) {
			@Pc(37) byte local37 = this.aByteArray28[local30];
			if (local37 >= 97 && local37 <= 122 || !(local37 < -32 || local37 > -2 || local37 == -9)) {
				if (local15) {
					local37 = (byte) (local37 - 32);
				}
				local15 = false;
			} else if (local37 >= 65 && local37 <= 90 || local37 >= -64 && local37 <= -34 && local37 != -41) {
				if (!local15) {
					local37 = (byte) (local37 + 32);
				}
				local15 = false;
			}
			if (local37 == 46 || local37 == 33 || local37 == 63) {
				local15 = true;
			}
			local19.aByteArray28[local30] = local37;
		}
		return local19;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!vc;BI)I")
	private int method1799(@OriginalArg(0) Class71 arg0) {
		@Pc(9) int[] local9 = new int[arg0.anInt2736];
		@Pc(13) int[] local13 = new int[arg0.anInt2736];
		@Pc(16) int[] local16 = new int[256];
		for (@Pc(23) int local23 = 0; local23 < local16.length; local23++) {
			local16[local23] = arg0.anInt2736;
		}
		for (@Pc(37) int local37 = 1; local37 <= arg0.anInt2736; local37++) {
			local9[local37 - 1] = (arg0.anInt2736 << 1) - local37;
			local16[arg0.aByteArray28[local37 - 1] & 0xFF] = arg0.anInt2736 - local37;
		}
		@Pc(76) int local76 = arg0.anInt2736 + 1;
		for (@Pc(79) int local79 = arg0.anInt2736; local79 > 0; local79--) {
			local13[local79 - 1] = local76;
			while (local76 <= arg0.anInt2736 && arg0.aByteArray28[local79 - 1] != arg0.aByteArray28[local76 - 1]) {
				if (arg0.anInt2736 - local79 <= local9[local76 + -1]) {
					local9[local76 - 1] = arg0.anInt2736 - local79;
				}
				local76 = local13[local76 - 1];
			}
			local76--;
		}
		@Pc(154) int local154 = local76;
		@Pc(156) int local156 = 1;
		local76 = arg0.anInt2736 + 1 - local76;
		@Pc(165) int local165 = 0;
		for (@Pc(167) int local167 = 1; local167 <= local76; local167++) {
			local13[local167 - 1] = local165;
			while (local165 >= 1 && arg0.aByteArray28[local165 - 1] != arg0.aByteArray28[local167 - 1]) {
				local165 = local13[local165 - 1];
			}
			local165++;
		}
		@Pc(212) int local212;
		while (local154 < arg0.anInt2736) {
			for (local212 = local156; local212 <= local154; local212++) {
				if (local154 + arg0.anInt2736 - local212 <= local9[local212 + -1]) {
					local9[local212 - 1] = local154 + arg0.anInt2736 - local212;
				}
			}
			local156 = local154 + 1;
			local154 = local76 + local154 - local13[local76 + -1];
			local76 = local13[local76 - 1];
		}
		@Pc(285) int local285;
		for (local212 = arg0.anInt2736 - 1; local212 < this.anInt2736; local212 += Math.max(local16[this.aByteArray28[local212] & 0xFF], local9[local285])) {
			for (local285 = arg0.anInt2736 - 1; local285 >= 0 && arg0.aByteArray28[local285] == this.aByteArray28[local212]; local285--) {
				local212--;
			}
			if (local285 == -1) {
				return local212 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIB)Lclient!vc;")
	public Class71 method1800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class71 local7 = new Class71();
		local7.aByteArray28 = new byte[arg0 - arg1];
		local7.anInt2736 = arg0 - arg1;
		Static127.method1745(this.aByteArray28, arg1, local7.aByteArray28, 0, local7.anInt2736);
		return local7;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(Lclient!vc;B)Z")
	public boolean method1801(@OriginalArg(0) Class71 arg0) {
		if (this.anInt2736 < arg0.anInt2736) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < arg0.anInt2736; local19++) {
			if (this.aByteArray28[local19] != arg0.aByteArray28[local19]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(B)Lclient!vc;")
	public Class71 method1803() {
		@Pc(9) Class71 local9 = new Class71();
		local9.anInt2736 = this.anInt2736;
		@Pc(15) boolean local15 = true;
		local9.aByteArray28 = new byte[this.anInt2736];
		for (@Pc(31) int local31 = 0; local31 < this.anInt2736; local31++) {
			@Pc(38) byte local38 = this.aByteArray28[local31];
			if (local38 == 95) {
				local9.aByteArray28[local31] = 32;
				local15 = true;
			} else if (local38 >= 97 && local38 <= 122 && local15) {
				local9.aByteArray28[local31] = (byte) (local38 - 32);
				local15 = false;
			} else {
				local15 = false;
				local9.aByteArray28[local31] = local38;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)I")
	public int method1804(@OriginalArg(0) int arg0) {
		return this.aByteArray28[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([BIIII)I")
	public int method1805(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static127.method1745(this.aByteArray28, 0, arg0, arg2, arg1);
		return arg1;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(II)Z")
	private boolean method1806() {
		@Pc(3) boolean local3 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt2736; local26++) {
			@Pc(35) int local35 = this.aByteArray28[local26] & 0xFF;
			if (local26 == 0) {
				if (local35 == 45) {
					local3 = true;
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
				return false;
			}
			if (local35 >= 10) {
				return false;
			}
			if (local3) {
				local35 = -local35;
			}
			@Pc(103) int local103 = local24 * 10 + local35;
			if (local24 != local103 / 10) {
				return false;
			}
			local22 = true;
			local24 = local103;
		}
		return local22;
	}

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "(I)I")
	public int method1808() {
		return this.method1810();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
	public int method1809(@OriginalArg(1) FontMetrics arg0) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray28, 0, this.anInt2736, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray28, 0, this.anInt2736);
		}
		return arg0.stringWidth(local9);
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(II)I")
	private int method1810() {
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt2736; local28++) {
			@Pc(37) int local37 = this.aByteArray28[local28] & 0xFF;
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
				throw new NumberFormatException();
			}
			if (local37 >= 10) {
				throw new NumberFormatException();
			}
			if (local17) {
				local37 = -local37;
			}
			@Pc(113) int local113 = local37 + local21 * 10;
			if (local113 / 10 != local21) {
				throw new NumberFormatException();
			}
			local21 = local113;
			local19 = true;
		}
		if (!local19) {
			throw new NumberFormatException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(II)Lclient!vc;")
	public Class71 method1811(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		} else if (this.aBoolean121) {
			this.anInt2731 = 0;
			if (this.aByteArray28.length == this.anInt2736) {
				@Pc(37) int local37;
				for (local37 = 1; local37 <= this.anInt2736; local37 += local37) {
				}
				@Pc(54) byte[] local54 = new byte[local37];
				Static127.method1745(this.aByteArray28, 0, local54, 0, this.anInt2736);
				this.aByteArray28 = local54;
			}
			this.aByteArray28[this.anInt2736++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILclient!vc;)Lclient!vc;")
	public Class71 method1812(@OriginalArg(0) int arg0, @OriginalArg(2) Class71 arg1) {
		if (!this.aBoolean121) {
			throw new IllegalArgumentException();
		} else if (this.anInt2736 < arg0) {
			throw new IllegalArgumentException();
		} else {
			this.anInt2731 = 0;
			if (arg0 + arg1.anInt2736 > this.aByteArray28.length) {
				@Pc(41) int local41;
				for (local41 = 1; local41 < arg0 + arg1.anInt2736; local41 += local41) {
				}
				@Pc(61) byte[] local61 = new byte[local41];
				Static127.method1745(this.aByteArray28, 0, local61, 0, this.anInt2736);
				this.aByteArray28 = local61;
			}
			Static127.method1745(arg1.aByteArray28, 0, this.aByteArray28, arg0, arg1.anInt2736);
			if (arg1.anInt2736 + arg0 > this.anInt2736) {
				this.anInt2736 = arg0 + arg1.anInt2736;
			}
			return this;
		}
	}

	@OriginalMember(owner = "client!vc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(ILclient!vc;)Z")
	public boolean method1813(@OriginalArg(1) Class71 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2736 == arg0.anInt2736) {
			if (!this.aBoolean121 || !arg0.aBoolean121) {
				if (this.anInt2731 == 0) {
					this.anInt2731 = this.method1782();
					if (this.anInt2731 == 0) {
						this.anInt2731 = 1;
					}
				}
				if (arg0.anInt2731 == 0) {
					arg0.anInt2731 = arg0.method1782();
					if (arg0.anInt2731 == 0) {
						arg0.anInt2731 = 1;
					}
				}
				if (arg0.anInt2731 != this.anInt2731) {
					return false;
				}
			}
			for (@Pc(73) int local73 = 0; local73 < this.anInt2736; local73++) {
				if (arg0.aByteArray28[local73] != this.aByteArray28[local73]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(Lclient!vc;I)Lclient!vc;")
	public Class71 method1814(@OriginalArg(0) Class71 arg0) {
		if (!this.aBoolean121) {
			throw new IllegalArgumentException();
		}
		this.anInt2731 = 0;
		if (this.aByteArray28.length < arg0.anInt2736 + this.anInt2736) {
			@Pc(24) int local24;
			for (local24 = 1; local24 < this.anInt2736 + arg0.anInt2736; local24 += local24) {
			}
			@Pc(44) byte[] local44 = new byte[local24];
			Static127.method1745(this.aByteArray28, 0, local44, 0, this.anInt2736);
			this.aByteArray28 = local44;
		}
		Static127.method1745(arg0.aByteArray28, 0, this.aByteArray28, this.anInt2736, arg0.anInt2736);
		this.anInt2736 += arg0.anInt2736;
		return this;
	}

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "(I)Z")
	public boolean method1815() {
		return this.method1806();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
	public void method1816(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray28, 0, this.anInt2736, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray28, 0, this.anInt2736);
		}
		arg1.drawString(local9, arg2, arg0);
	}

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "(I)J")
	public long method1817() {
		@Pc(3) long local3 = 0L;
		for (@Pc(10) int local10 = 0; local10 < this.anInt2736 && local10 < 12; local10++) {
			local3 *= 37L;
			@Pc(21) byte local21 = this.aByteArray28[local10];
			if (local21 >= 65 && local21 <= 90) {
				local3 += local21 - 64;
			} else if (local21 >= 97 && local21 <= 122) {
				local3 += local21 - 96;
			} else if (local21 >= 48 && local21 <= 57) {
				local3 += local21 + 27 - 48;
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(II)I")
	public int method1818() {
		return this.method1820();
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(Lclient!vc;B)I")
	public int method1819(@OriginalArg(0) Class71 arg0) {
		@Pc(13) int local13;
		if (this.anInt2736 <= arg0.anInt2736) {
			local13 = this.anInt2736;
		} else {
			local13 = arg0.anInt2736;
		}
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			if (Static26.anIntArray169[arg0.aByteArray28[local20] & 0xFF] > Static26.anIntArray169[this.aByteArray28[local20] & 0xFF]) {
				return -1;
			}
			if (Static26.anIntArray169[arg0.aByteArray28[local20] & 0xFF] < Static26.anIntArray169[this.aByteArray28[local20] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt2736 < arg0.anInt2736) {
			return -1;
		} else if (this.anInt2736 > arg0.anInt2736) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BII)I")
	private int method1820() {
		for (@Pc(18) int local18 = 0; local18 < this.anInt2736; local18++) {
			if (this.aByteArray28[local18] == 32) {
				return local18;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "(I)Lclient!vc;")
	public Class71 method1821() {
		@Pc(8) int local8 = this.anInt2736;
		@Pc(15) int local15;
		for (local15 = 0; local15 < this.anInt2736 && (this.aByteArray28[local15] >= 0 && this.aByteArray28[local15] <= 32 || (this.aByteArray28[local15] & 0xFF) == 160); local15++) {
		}
		while (local15 < local8 && (this.aByteArray28[local8 - 1] >= 0 && this.aByteArray28[local8 - 1] <= 32 || (this.aByteArray28[local8 - 1] & 0xFF) == 160)) {
			local8--;
		}
		if (local15 == 0 && local8 == this.anInt2736) {
			return this;
		}
		@Pc(94) Class71 local94 = new Class71();
		local94.anInt2736 = local8 - local15;
		local94.aByteArray28 = new byte[local94.anInt2736];
		for (@Pc(106) int local106 = 0; local106 < local94.anInt2736; local106++) {
			local94.aByteArray28[local106] = this.aByteArray28[local15 + local106];
		}
		return local94;
	}

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "(II)Lclient!vc;")
	public Class71 method1822(@OriginalArg(1) int arg0) {
		return this.method1800(this.anInt2736, arg0);
	}
}
