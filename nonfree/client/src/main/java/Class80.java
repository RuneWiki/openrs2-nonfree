import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class80 implements Interface3 {

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
	private int anInt3194;

	@OriginalMember(owner = "client!wd", name = "eb", descriptor = "I")
	public int anInt3200;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "Z")
	private boolean aBoolean244 = true;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)[B")
	public byte[] method1995() {
		@Pc(3) byte[] local3 = new byte[this.anInt3200];
		Static131.method1114(this.aByteArray40, 0, local3, 0, this.anInt3200);
		return local3;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)Z")
	private boolean method1996() {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt3200; local21++) {
			@Pc(30) int local30 = this.aByteArray40[local21] & 0xFF;
			if (local21 == 0) {
				if (local30 == 45) {
					local15 = true;
					continue;
				}
				if (local30 == 43) {
					continue;
				}
			}
			if (local30 >= 48 && local30 <= 57) {
				local30 -= 48;
			} else if (local30 >= 65 && local30 <= 90) {
				local30 -= 55;
			} else if (local30 >= 97 && local30 <= 122) {
				local30 -= 87;
			} else {
				return false;
			}
			if (local30 >= 10) {
				return false;
			}
			if (local15) {
				local30 = -local30;
			}
			@Pc(94) int local94 = local19 * 10 + local30;
			if (local19 != local94 / 10) {
				return false;
			}
			local17 = true;
			local19 = local94;
		}
		return local17;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Z")
	public boolean method1997() {
		return this.method1996();
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)Ljava/net/URL;")
	public URL method1998() throws MalformedURLException {
		return new URL(new String(this.aByteArray40, 0, this.anInt3200));
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)I")
	public int method1999() {
		return this.anInt3200;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)Lclient!wd;")
	public Class80 method2000() {
		@Pc(5) Class80 local5 = new Class80();
		local5.anInt3200 = this.anInt3200;
		local5.aByteArray40 = new byte[this.anInt3200];
		@Pc(27) boolean local27 = true;
		for (@Pc(29) int local29 = 0; local29 < this.anInt3200; local29++) {
			@Pc(36) byte local36 = this.aByteArray40[local29];
			if (local36 == 95) {
				local27 = true;
				local5.aByteArray40[local29] = 32;
			} else if (local36 >= 97 && local36 <= 122 && local27) {
				local27 = false;
				local5.aByteArray40[local29] = (byte) (local36 - 32);
			} else {
				local5.aByteArray40[local29] = local36;
				local27 = false;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)J")
	private long method2001() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt3200; local7++) {
			local5 = (local5 << 5) + (long) (this.aByteArray40[local7] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)I")
	private int method2003() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt3200; local8++) {
			if (this.aByteArray40[local8] == 32) {
				return local8;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Lclient!wd;")
	public Class80 method2004() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class80 local11 = new Class80();
		local11.aByteArray40 = new byte[12];
		local11.anInt3200 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anInt3200; local25++) {
			if (this.aByteArray40[local25] >= 65 && this.aByteArray40[local25] <= 90) {
				local11.aByteArray40[local7++] = (byte) (this.aByteArray40[local25] + 32);
				local11.anInt3200 = local7;
			} else if (this.aByteArray40[local25] >= 97 && this.aByteArray40[local25] <= 122 || this.aByteArray40[local25] >= 48 && this.aByteArray40[local25] <= 57) {
				local11.aByteArray40[local7++] = this.aByteArray40[local25];
				local11.anInt3200 = local7;
			} else if (local7 > 0) {
				local11.aByteArray40[local7++] = 95;
			}
			if (local7 == 12) {
				break;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZLclient!wd;)Z")
	public boolean method2006(@OriginalArg(1) Class80 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt3200 == arg0.anInt3200) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt3200; local30++) {
				@Pc(37) byte local37 = this.aByteArray40[local30];
				@Pc(42) byte local42 = arg0.aByteArray40[local30];
				if (local42 >= 65 && local42 <= 90 || local42 >= -64 && local42 <= -34 && local42 != -41) {
					local42 = (byte) (local42 + 32);
				}
				if (local37 >= 65 && local37 <= 90 || local37 >= -64 && local37 <= -34 && local37 != -41) {
					local37 = (byte) (local37 + 32);
				}
				if (local37 != local42) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)I")
	private int method2007() {
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt3200; local28++) {
			@Pc(37) int local37 = this.aByteArray40[local28] & 0xFF;
			if (local28 == 0) {
				if (local37 == 45) {
					local22 = true;
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
			if (local22) {
				local37 = -local37;
			}
			@Pc(111) int local111 = local26 * 10 + local37;
			if (local26 != local111 / 10) {
				throw new NumberFormatException();
			}
			local26 = local111;
			local24 = true;
		}
		if (!local24) {
			throw new NumberFormatException();
		}
		return local26;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLclient!wd;)Lclient!wd;")
	public Class80 method2008(@OriginalArg(1) Class80 arg0) {
		if (!this.aBoolean244) {
			throw new IllegalArgumentException();
		}
		this.anInt3194 = 0;
		if (this.aByteArray40.length < this.anInt3200 + arg0.anInt3200) {
			@Pc(31) int local31;
			for (local31 = 1; local31 < this.anInt3200 + arg0.anInt3200; local31 += local31) {
			}
			@Pc(52) byte[] local52 = new byte[local31];
			Static131.method1114(this.aByteArray40, 0, local52, 0, this.anInt3200);
			this.aByteArray40 = local52;
		}
		Static131.method1114(arg0.aByteArray40, 0, this.aByteArray40, this.anInt3200, arg0.anInt3200);
		this.anInt3200 += arg0.anInt3200;
		return this;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)Lclient!wd;")
	public Class80 method2009() {
		@Pc(18) Class80 local18 = new Class80();
		local18.anInt3200 = this.anInt3200;
		local18.aByteArray40 = new byte[this.anInt3200];
		for (@Pc(29) int local29 = 0; local29 < this.anInt3200; local29++) {
			local18.aByteArray40[local29] = 42;
		}
		return local18;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)Lclient!wd;")
	public Class80 method2010() {
		@Pc(7) byte local7 = 2;
		@Pc(11) Class80 local11 = new Class80();
		local11.anInt3200 = this.anInt3200;
		local11.aByteArray40 = new byte[this.anInt3200];
		for (@Pc(22) int local22 = 0; local22 < this.anInt3200; local22++) {
			@Pc(29) byte local29 = this.aByteArray40[local22];
			if (local29 >= 97 && local29 <= 122 || !(local29 < -32 || local29 > -2 || local29 == -9)) {
				if (local7 == 2) {
					local29 = (byte) (local29 - 32);
				}
				local7 = 0;
			} else if (local29 >= 65 && local29 <= 90 || !(local29 < -64 || local29 > -34 || local29 == -41)) {
				if (local7 == 0) {
					local29 = (byte) (local29 + 32);
				}
				local7 = 0;
			} else if (local29 == 46 || local29 == 33 || local29 == 63) {
				local7 = 2;
			} else if (local29 != 32) {
				local7 = 1;
			} else if (local7 != 2) {
				local7 = 1;
			}
			local11.aByteArray40[local22] = local29;
		}
		return local11;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)Lclient!wd;")
	public Class80 method2011() {
		@Pc(9) Class80 local9 = new Class80();
		local9.anInt3200 = this.anInt3200;
		local9.aByteArray40 = new byte[this.anInt3200];
		for (@Pc(20) int local20 = 0; local20 < this.anInt3200; local20++) {
			@Pc(32) byte local32 = this.aByteArray40[local20];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local9.aByteArray40[local20] = local32;
		}
		return local9;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)Lclient!wd;")
	public Class80 method2012(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(19) Class80 local19 = new Class80();
		local19.aByteArray40 = new byte[this.anInt3200 + 1];
		local19.anInt3200 = this.anInt3200 + 1;
		Static131.method1114(this.aByteArray40, 0, local19.aByteArray40, 0, this.anInt3200);
		local19.aByteArray40[this.anInt3200] = (byte) arg0;
		return local19;
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)I")
	public int method2013() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt3200; local7++) {
			local5 = (this.aByteArray40[local7] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!wd;)Z")
	public boolean method2014(@OriginalArg(1) Class80 arg0) {
		if (arg0.anInt3200 > this.anInt3200) {
			return false;
		}
		@Pc(16) int local16 = this.anInt3200 - arg0.anInt3200;
		for (@Pc(23) int local23 = 0; local23 < arg0.anInt3200; local23++) {
			if (arg0.aByteArray40[local23] != this.aByteArray40[local23 + local16]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(BI)I")
	public int method2015() {
		return this.method2003();
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(Z)Lclient!wd;")
	public Class80 method2016() {
		if (!this.aBoolean244) {
			throw new IllegalArgumentException();
		}
		this.anInt3194 = 0;
		if (this.aByteArray40.length != this.anInt3200) {
			@Pc(30) byte[] local30 = new byte[this.anInt3200];
			Static131.method1114(this.aByteArray40, 0, local30, 0, this.anInt3200);
			this.aByteArray40 = local30;
		}
		return this;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!wd;I)Z")
	public boolean method2017(@OriginalArg(0) Class80 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt3200 == this.anInt3200) {
			if (!this.aBoolean244 || !arg0.aBoolean244) {
				if (this.anInt3194 == 0) {
					this.anInt3194 = this.method2013();
					if (this.anInt3194 == 0) {
						this.anInt3194 = 1;
					}
				}
				if (arg0.anInt3194 == 0) {
					arg0.anInt3194 = arg0.method2013();
					if (arg0.anInt3194 == 0) {
						arg0.anInt3194 = 1;
					}
				}
				if (arg0.anInt3194 != this.anInt3194) {
					return false;
				}
			}
			for (@Pc(60) int local60 = 0; local60 < this.anInt3200; local60++) {
				if (this.aByteArray40[local60] != arg0.aByteArray40[local60]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(ILclient!wd;)I")
	public int method2018(@OriginalArg(1) Class80 arg0) {
		@Pc(17) int local17;
		if (arg0.anInt3200 >= this.anInt3200) {
			local17 = this.anInt3200;
		} else {
			local17 = arg0.anInt3200;
		}
		for (@Pc(35) int local35 = 0; local35 < local17; local35++) {
			if (Static85.anIntArray278[this.aByteArray40[local35] & 0xFF] < Static85.anIntArray278[arg0.aByteArray40[local35] & 0xFF]) {
				return -1;
			}
			if (Static85.anIntArray278[arg0.aByteArray40[local35] & 0xFF] < Static85.anIntArray278[this.aByteArray40[local35] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt3200 > this.anInt3200) {
			return -1;
		} else if (arg0.anInt3200 < this.anInt3200) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(BI)Lclient!wd;")
	public Class80 method2019(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		} else if (this.aBoolean244) {
			this.anInt3194 = 0;
			if (this.aByteArray40.length == this.anInt3200) {
				@Pc(33) int local33;
				for (local33 = 1; local33 <= this.anInt3200; local33 += local33) {
				}
				@Pc(46) byte[] local46 = new byte[local33];
				Static131.method1114(this.aByteArray40, 0, local46, 0, this.anInt3200);
				this.aByteArray40 = local46;
			}
			this.aByteArray40[this.anInt3200++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wd", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class80)) {
			throw new IllegalArgumentException();
		}
		return this.method2017((Class80) arg0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
	public void method2020(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray40, 0, this.anInt3200, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray40, 0, this.anInt3200);
		}
		arg1.drawString(local13, arg0, arg2);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Lclient!wd;")
	public Class80 method2021(@OriginalArg(0) int arg0) {
		return this.method2027(arg0, this.anInt3200);
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(B)I")
	public int method2022() {
		return this.method2007();
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)J")
	public long method2023() {
		@Pc(7) long local7 = 0L;
		for (@Pc(14) int local14 = 0; local14 < this.anInt3200 && local14 < 12; local14++) {
			@Pc(21) byte local21 = this.aByteArray40[local14];
			local7 *= 37L;
			if (local21 >= 65 && local21 <= 90) {
				local7 += local21 + 1 - 65;
			} else if (local21 >= 97 && local21 <= 122) {
				local7 += local21 - 96;
			} else if (local21 >= 48 && local21 <= 57) {
				local7 += local21 + 27 - 48;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)Lclient!wd;")
	public Class80 method2024() {
		@Pc(7) long local7 = this.method2001();
		@Pc(16) Class local16 = wd.class;
		synchronized (wd.class) {
			@Pc(33) Class2_Sub4 local33;
			if (Static40.aClass41_3 == null) {
				Static40.aClass41_3 = new Class41(4096);
			} else {
				for (local33 = (Class2_Sub4) Static40.aClass41_3.method1056(local7); local33 != null; local33 = (Class2_Sub4) Static40.aClass41_3.method1060()) {
					if (this.method2017(local33.aClass80_427)) {
						return local33.aClass80_427;
					}
				}
			}
			local33 = new Class2_Sub4();
			this.aBoolean244 = false;
			local33.aClass80_427 = this;
			Static40.aClass41_3.method1063(local33, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(Lclient!wd;I)I")
	public int method2025(@OriginalArg(0) Class80 arg0) {
		return this.method2035(arg0);
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(Z)Lclient!wd;")
	public Class80 method2026() {
		@Pc(7) int local7;
		for (local7 = 0; this.anInt3200 > local7 && (this.aByteArray40[local7] >= 0 && this.aByteArray40[local7] <= 32 || (this.aByteArray40[local7] & 0xFF) == 160); local7++) {
		}
		@Pc(36) int local36;
		for (local36 = this.anInt3200; local7 < local36 && (this.aByteArray40[local36 - 1] >= 0 && this.aByteArray40[local36 - 1] <= 32 || (this.aByteArray40[local36 - 1] & 0xFF) == 160); local36--) {
		}
		if (local7 == 0 && this.anInt3200 == local36) {
			return this;
		}
		@Pc(88) Class80 local88 = new Class80();
		local88.anInt3200 = local36 - local7;
		local88.aByteArray40 = new byte[local88.anInt3200];
		for (@Pc(105) int local105 = 0; local105 < local88.anInt3200; local105++) {
			local88.aByteArray40[local105] = this.aByteArray40[local105 + local7];
		}
		return local88;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)Lclient!wd;")
	public Class80 method2027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class80 local3 = new Class80();
		local3.anInt3200 = arg1 - arg0;
		local3.aByteArray40 = new byte[arg1 - arg0];
		Static131.method1114(this.aByteArray40, arg0, local3.aByteArray40, 0, local3.anInt3200);
		return local3;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(ZLclient!wd;)Z")
	public boolean method2028(@OriginalArg(1) Class80 arg0) {
		if (this.anInt3200 < arg0.anInt3200) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < arg0.anInt3200; local18++) {
			if (arg0.aByteArray40[local18] != this.aByteArray40[local18]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZILclient!wd;)Lclient!wd;")
	public Class80 method2029(@OriginalArg(1) int arg0, @OriginalArg(2) Class80 arg1) {
		if (!this.aBoolean244) {
			throw new IllegalArgumentException();
		} else if (this.anInt3200 < arg0) {
			throw new IllegalArgumentException();
		} else {
			this.anInt3194 = 0;
			if (arg1.anInt3200 + arg0 > this.aByteArray40.length) {
				@Pc(38) int local38;
				for (local38 = 1; local38 < arg0 + arg1.anInt3200; local38 += local38) {
				}
				@Pc(53) byte[] local53 = new byte[local38];
				Static131.method1114(this.aByteArray40, 0, local53, 0, this.anInt3200);
				this.aByteArray40 = local53;
			}
			Static131.method1114(arg1.aByteArray40, 0, this.aByteArray40, arg0, arg1.anInt3200);
			if (this.anInt3200 < arg0 + arg1.anInt3200) {
				this.anInt3200 = arg1.anInt3200 + arg0;
			}
			return this;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
	public int method2030(@OriginalArg(1) FontMetrics arg0) {
		@Pc(17) String local17;
		try {
			local17 = new String(this.aByteArray40, 0, this.anInt3200, "ISO-8859-1");
		} catch (@Pc(19) UnsupportedEncodingException local19) {
			local17 = new String(this.aByteArray40, 0, this.anInt3200);
		}
		return arg0.stringWidth(local17);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)I")
	public int method2031(@OriginalArg(0) int arg0) {
		return this.aByteArray40[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BII[BI)I")
	public int method2034(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2) {
		Static131.method1114(this.aByteArray40, 0, arg1, arg0, arg2);
		return arg2;
	}

	@OriginalMember(owner = "client!wd", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method2013();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BILclient!wd;)I")
	private int method2035(@OriginalArg(2) Class80 arg0) {
		@Pc(5) int[] local5 = new int[arg0.anInt3200];
		@Pc(13) int[] local13 = new int[arg0.anInt3200];
		@Pc(16) int[] local16 = new int[256];
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			local16[local18] = arg0.anInt3200;
		}
		for (@Pc(32) int local32 = 1; local32 <= arg0.anInt3200; local32++) {
			local5[local32 - 1] = (arg0.anInt3200 << 1) - local32;
			local16[arg0.aByteArray40[local32 - 1] & 0xFF] = arg0.anInt3200 - local32;
		}
		@Pc(74) int local74 = arg0.anInt3200 + 1;
		for (@Pc(77) int local77 = arg0.anInt3200; local77 > 0; local77--) {
			local13[local77 - 1] = local74;
			while (arg0.anInt3200 >= local74 && arg0.aByteArray40[local77 - 1] != arg0.aByteArray40[local74 - 1]) {
				if (arg0.anInt3200 - local77 <= local5[local74 + -1]) {
					local5[local74 - 1] = arg0.anInt3200 - local77;
				}
				local74 = local13[local74 - 1];
			}
			local74--;
		}
		@Pc(149) int local149 = 1;
		@Pc(151) int local151 = 0;
		@Pc(153) int local153 = local74;
		local74 = arg0.anInt3200 + 1 - local74;
		for (@Pc(163) int local163 = 1; local163 <= local74; local163++) {
			local13[local163 - 1] = local151;
			while (local151 >= 1 && arg0.aByteArray40[local163 - 1] != arg0.aByteArray40[local151 - 1]) {
				local151 = local13[local151 - 1];
			}
			local151++;
		}
		@Pc(212) int local212;
		while (local153 < arg0.anInt3200) {
			for (local212 = local149; local212 <= local153; local212++) {
				if (local153 + arg0.anInt3200 - local212 <= local5[local212 - 1]) {
					local5[local212 - 1] = arg0.anInt3200 + local153 - local212;
				}
			}
			local149 = local153 + 1;
			local153 += local74 - local13[local74 - 1];
			local74 = local13[local74 - 1];
		}
		@Pc(285) int local285;
		for (local212 = arg0.anInt3200 - 1; local212 < this.anInt3200; local212 += Math.max(local16[this.aByteArray40[local212] & 0xFF], local5[local285])) {
			for (local285 = arg0.anInt3200 - 1; local285 >= 0 && arg0.aByteArray40[local285] == this.aByteArray40[local212]; local285--) {
				local212--;
			}
			if (local285 == -1) {
				return local212 + 1;
			}
		}
		return -1;
	}
}
