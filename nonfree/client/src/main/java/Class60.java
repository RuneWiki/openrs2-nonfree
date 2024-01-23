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

@OriginalClass("client!kh")
public final class Class60 implements Interface2 {

	@OriginalMember(owner = "client!kh", name = "F", descriptor = "I")
	private int anInt2415;

	@OriginalMember(owner = "client!kh", name = "R", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!kh", name = "ib", descriptor = "I")
	public int anInt2439;

	@OriginalMember(owner = "client!kh", name = "bb", descriptor = "Z")
	private boolean aBoolean135 = true;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)Lclient!kh;")
	public Class60 method1792() {
		@Pc(13) Class60 local13 = Static144.method2484(this.method1829());
		return local13 == null ? Static86.aClass60_660 : local13;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZI)I")
	public int method1793(@OriginalArg(1) int arg0) {
		return this.aByteArray34[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)I")
	public int method1794(@OriginalArg(1) int arg0) {
		@Pc(17) boolean local17 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt2439; local28++) {
			@Pc(37) int local37 = this.aByteArray34[local28] & 0xFF;
			if (local28 == 0) {
				if (local37 == 45) {
					local24 = true;
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
			if (arg0 <= local37) {
				throw new NumberFormatException();
			}
			if (local24) {
				local37 = -local37;
			}
			@Pc(108) int local108 = local37 + arg0 * local26;
			if (local26 != local108 / arg0) {
				throw new NumberFormatException();
			}
			local17 = true;
			local26 = local108;
		}
		if (!local17) {
			throw new NumberFormatException();
		}
		return local26;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)Lclient!kh;")
	public Class60 method1795() {
		if (!this.aBoolean135) {
			throw new IllegalArgumentException();
		}
		this.anInt2415 = 0;
		if (this.anInt2439 != this.aByteArray34.length) {
			@Pc(31) byte[] local31 = new byte[this.anInt2439];
			Static221.method35(this.aByteArray34, 0, local31, 0, this.anInt2439);
			this.aByteArray34 = local31;
		}
		return this;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZII)Lclient!kh;")
	public Class60 method1797(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class60 local8 = new Class60();
		local8.anInt2439 = arg1 - arg0;
		local8.aByteArray34 = new byte[arg1 - arg0];
		Static221.method35(this.aByteArray34, arg0, local8.aByteArray34, 0, local8.anInt2439);
		return local8;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Lclient!kh;")
	public Class60 method1799(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(25) Class60 local25 = new Class60();
		local25.aByteArray34 = new byte[this.anInt2439 + 1];
		local25.anInt2439 = this.anInt2439 + 1;
		Static221.method35(this.aByteArray34, 0, local25.aByteArray34, 0, this.anInt2439);
		local25.aByteArray34[this.anInt2439] = (byte) arg0;
		return local25;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/net/URL;I)Ljava/net/URL;")
	public URL method1800(@OriginalArg(0) URL arg0) throws MalformedURLException {
		return new URL(arg0, new String(this.aByteArray34, 0, this.anInt2439));
	}

	@OriginalMember(owner = "client!kh", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class60)) {
			throw new IllegalArgumentException();
		}
		return this.method1826((Class60) arg0);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III[BI)I")
	public int method1801(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		Static221.method35(this.aByteArray34, 0, arg2, arg1, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)Lclient!kh;")
	public Class60 method1802() {
		@Pc(9) Class60 local9 = new Class60();
		local9.anInt2439 = this.anInt2439;
		local9.aByteArray34 = new byte[this.anInt2439];
		for (@Pc(25) int local25 = 0; local25 < this.anInt2439; local25++) {
			local9.aByteArray34[local25] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/applet/Applet;I)Ljava/lang/Object;")
	public Object method1803(@OriginalArg(0) Applet arg0) throws Throwable {
		@Pc(8) String local8 = new String(this.aByteArray34, 0, this.anInt2439);
		@Pc(14) Object local14 = Static224.method1074(local8, null, arg0);
		if (local14 instanceof String) {
			@Pc(25) byte[] local25 = ((String) local14).getBytes();
			local14 = Static102.method1755(local25.length, 0, local25);
		}
		return local14;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILjava/applet/Applet;)Lclient!kh;")
	public Class60 method1804(@OriginalArg(1) Applet arg0) {
		@Pc(12) String local12 = new String(this.aByteArray34, 0, this.anInt2439);
		@Pc(16) String local16 = arg0.getParameter(local12);
		return local16 == null ? null : Static187.method2924(local16);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!kh;I)Z")
	public boolean method1805(@OriginalArg(0) Class60 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2439 == arg0.anInt2439) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt2439; local23++) {
				@Pc(30) byte local30 = arg0.aByteArray34[local23];
				if (local30 >= 65 && local30 <= 90 || local30 >= -64 && local30 <= -34 && local30 != -41) {
					local30 = (byte) (local30 + 32);
				}
				@Pc(59) byte local59 = this.aByteArray34[local23];
				if (local59 >= 65 && local59 <= 90 || local59 >= -64 && local59 <= -34 && local59 != -41) {
					local59 = (byte) (local59 + 32);
				}
				if (local30 != local59) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(Lclient!kh;I)Z")
	public boolean method1806(@OriginalArg(0) Class60 arg0) {
		if (this.anInt2439 < arg0.anInt2439) {
			return false;
		}
		for (@Pc(26) int local26 = 0; local26 < arg0.anInt2439; local26++) {
			@Pc(33) byte local33 = this.aByteArray34[local26];
			@Pc(38) byte local38 = arg0.aByteArray34[local26];
			if (local38 >= 65 && local38 <= 90 || local38 >= -64 && local38 <= -34 && local38 != -41) {
				local38 = (byte) (local38 + 32);
			}
			if (local33 >= 65 && local33 <= 90 || local33 >= -64 && local33 <= -34 && local33 != -41) {
				local33 = (byte) (local33 + 32);
			}
			if (local33 != local38) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(BI)[Lclient!kh;")
	public Class60[] method1807(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt2439; local9++) {
			if (this.aByteArray34[local9] == arg0) {
				local7++;
			}
		}
		@Pc(40) Class60[] local40 = new Class60[local7 + 1];
		if (local7 == 0) {
			local40[0] = this;
			return local40;
		}
		@Pc(50) int local50 = 0;
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local7; local54++) {
			@Pc(58) int local58;
			for (local58 = 0; this.aByteArray34[local52 + local58] != arg0; local58++) {
			}
			local40[local50++] = this.method1797(local52, local58 + local52);
			local52 += local58 + 1;
		}
		local40[local7] = this.method1797(local52, this.anInt2439);
		return local40;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!kh;B)Z")
	public boolean method1808(@OriginalArg(0) Class60 arg0) {
		if (this.anInt2439 < arg0.anInt2439) {
			return false;
		}
		@Pc(23) int local23 = this.anInt2439 - arg0.anInt2439;
		for (@Pc(30) int local30 = 0; local30 < arg0.anInt2439; local30++) {
			if (this.aByteArray34[local23 + local30] != arg0.aByteArray34[local30]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)Lclient!kh;")
	public Class60 method1809() {
		@Pc(3) long local3 = this.method1820();
		@Pc(16) Class local16 = kh.class;
		synchronized (kh.class) {
			@Pc(34) Class1_Sub6 local34;
			if (Static191.aClass33_16 == null) {
				Static191.aClass33_16 = new Class33(4096);
			} else {
				for (local34 = (Class1_Sub6) Static191.aClass33_16.method1071(local3); local34 != null; local34 = (Class1_Sub6) Static191.aClass33_16.method1069()) {
					if (this.method1826(local34.aClass60_251)) {
						return local34.aClass60_251;
					}
				}
			}
			local34 = new Class1_Sub6();
			this.aBoolean135 = false;
			local34.aClass60_251 = this;
			Static191.aClass33_16.method1072(local3, local34);
			return this;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!kh;)I")
	public int method1810(@OriginalArg(1) Class60 arg0) {
		@Pc(15) int local15;
		if (this.anInt2439 <= arg0.anInt2439) {
			local15 = this.anInt2439;
		} else {
			local15 = arg0.anInt2439;
		}
		for (@Pc(26) int local26 = 0; local26 < local15; local26++) {
			if (Static75.anIntArray213[this.aByteArray34[local26] & 0xFF] < Static75.anIntArray213[arg0.aByteArray34[local26] & 0xFF]) {
				return -1;
			}
			if (Static75.anIntArray213[this.aByteArray34[local26] & 0xFF] > Static75.anIntArray213[arg0.aByteArray34[local26] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt2439 > this.anInt2439) {
			return -1;
		} else if (this.anInt2439 > arg0.anInt2439) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Z")
	public boolean method1811() {
		return this.method1825();
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)Lclient!kh;")
	public Class60 method1812() {
		@Pc(9) Class60 local9 = new Class60();
		local9.anInt2439 = this.anInt2439;
		@Pc(15) boolean local15 = true;
		local9.aByteArray34 = new byte[this.anInt2439];
		for (@Pc(22) int local22 = 0; local22 < this.anInt2439; local22++) {
			@Pc(29) byte local29 = this.aByteArray34[local22];
			if (local29 == 95) {
				local9.aByteArray34[local22] = 32;
				local15 = true;
			} else if (local29 >= 97 && local29 <= 122 && local15) {
				local9.aByteArray34[local22] = (byte) (local29 - 32);
				local15 = false;
			} else {
				local15 = false;
				local9.aByteArray34[local22] = local29;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)Lclient!kh;")
	public Class60 method1813() {
		@Pc(9) Class60 local9 = new Class60();
		local9.anInt2439 = this.anInt2439;
		local9.aByteArray34 = new byte[this.anInt2439];
		for (@Pc(31) int local31 = 0; local31 < this.anInt2439; local31++) {
			@Pc(38) byte local38 = this.aByteArray34[local31];
			if (local38 == 47) {
				local9.aByteArray34[local31] = 32;
			} else {
				local9.aByteArray34[local31] = local38;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)Lclient!kh;")
	public Class60 method1814() {
		@Pc(3) int local3;
		for (local3 = 0; local3 < this.anInt2439 && (this.aByteArray34[local3] >= 0 && this.aByteArray34[local3] <= 32 || (this.aByteArray34[local3] & 0xFF) == 160); local3++) {
		}
		@Pc(47) int local47;
		for (local47 = this.anInt2439; local3 < local47 && (this.aByteArray34[local47 - 1] >= 0 && this.aByteArray34[local47 - 1] <= 32 || (this.aByteArray34[local47 - 1] & 0xFF) == 160); local47--) {
		}
		if (local3 == 0 && local47 == this.anInt2439) {
			return this;
		}
		@Pc(92) Class60 local92 = new Class60();
		local92.anInt2439 = local47 - local3;
		local92.aByteArray34 = new byte[local92.anInt2439];
		for (@Pc(105) int local105 = 0; local105 < local92.anInt2439; local105++) {
			local92.aByteArray34[local105] = this.aByteArray34[local105 + local3];
		}
		return local92;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(Lclient!kh;I)I")
	public int method1815(@OriginalArg(0) Class60 arg0) {
		return this.method1837(arg0, 0);
	}

	@OriginalMember(owner = "client!kh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)Lclient!kh;")
	public Class60 method1816(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean135) {
			this.anInt2415 = 0;
			if (this.aByteArray34.length == this.anInt2439) {
				@Pc(53) int local53;
				for (local53 = 1; local53 <= this.anInt2439; local53 += local53) {
				}
				@Pc(70) byte[] local70 = new byte[local53];
				Static221.method35(this.aByteArray34, 0, local70, 0, this.anInt2439);
				this.aByteArray34 = local70;
			}
			this.aByteArray34[this.anInt2439++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kh", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1834();
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)Lclient!kh;")
	public Class60 method1818(@OriginalArg(0) int arg0) {
		return this.method1797(arg0, this.anInt2439);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/applet/Applet;B)V")
	public void method1819(@OriginalArg(0) Applet arg0) throws Throwable {
		@Pc(12) String local12 = new String(this.aByteArray34, 0, this.anInt2439);
		Static224.method1073(local12, arg0);
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(B)J")
	private long method1820() {
		@Pc(14) long local14 = 0L;
		for (@Pc(16) int local16 = 0; local16 < this.anInt2439; local16++) {
			local14 = (long) (this.aByteArray34[local16] & 0xFF) + (local14 << 5) - local14;
		}
		return local14;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZLclient!kh;)I")
	public int method1821(@OriginalArg(1) Class60 arg0) {
		@Pc(17) int local17;
		if (this.anInt2439 > arg0.anInt2439) {
			local17 = arg0.anInt2439;
		} else {
			local17 = this.anInt2439;
		}
		for (@Pc(24) int local24 = 0; local24 < local17; local24++) {
			if ((this.aByteArray34[local24] & 0xFF) < (arg0.aByteArray34[local24] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray34[local24] & 0xFF) > (arg0.aByteArray34[local24] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt2439 < arg0.anInt2439) {
			return -1;
		} else if (arg0.anInt2439 < this.anInt2439) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLclient!kh;)Lclient!kh;")
	public Class60 method1823(@OriginalArg(1) Class60 arg0) {
		if (!this.aBoolean135) {
			throw new IllegalArgumentException();
		}
		this.anInt2415 = 0;
		if (this.aByteArray34.length < arg0.anInt2439 + this.anInt2439) {
			@Pc(30) int local30;
			for (local30 = 1; local30 < arg0.anInt2439 + this.anInt2439; local30 += local30) {
			}
			@Pc(46) byte[] local46 = new byte[local30];
			Static221.method35(this.aByteArray34, 0, local46, 0, this.anInt2439);
			this.aByteArray34 = local46;
		}
		Static221.method35(arg0.aByteArray34, 0, this.aByteArray34, this.anInt2439, arg0.anInt2439);
		this.anInt2439 += arg0.anInt2439;
		return this;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public void method1824(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		@Pc(20) String local20;
		try {
			local20 = new String(this.aByteArray34, 0, this.anInt2439, "ISO-8859-1");
		} catch (@Pc(22) UnsupportedEncodingException local22) {
			local20 = new String(this.aByteArray34, 0, this.anInt2439);
		}
		arg2.drawString(local20, arg0, arg1);
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(II)Z")
	private boolean method1825() {
		@Pc(25) boolean local25 = false;
		@Pc(27) int local27 = 0;
		@Pc(29) boolean local29 = false;
		for (@Pc(31) int local31 = 0; local31 < this.anInt2439; local31++) {
			@Pc(40) int local40 = this.aByteArray34[local31] & 0xFF;
			if (local31 == 0) {
				if (local40 == 45) {
					local29 = true;
					continue;
				}
				if (local40 == 43) {
					continue;
				}
			}
			if (local40 >= 48 && local40 <= 57) {
				local40 -= 48;
			} else if (local40 >= 65 && local40 <= 90) {
				local40 -= 55;
			} else if (local40 >= 97 && local40 <= 122) {
				local40 -= 87;
			} else {
				return false;
			}
			if (local40 >= 10) {
				return false;
			}
			if (local29) {
				local40 = -local40;
			}
			@Pc(110) int local110 = local40 + local27 * 10;
			if (local27 != local110 / 10) {
				return false;
			}
			local25 = true;
			local27 = local110;
		}
		return local25;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(BLclient!kh;)Z")
	public boolean method1826(@OriginalArg(1) Class60 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2439 == arg0.anInt2439) {
			if (!this.aBoolean135 || !arg0.aBoolean135) {
				if (this.anInt2415 == 0) {
					this.anInt2415 = this.method1834();
					if (this.anInt2415 == 0) {
						this.anInt2415 = 1;
					}
				}
				if (arg0.anInt2415 == 0) {
					arg0.anInt2415 = arg0.method1834();
					if (arg0.anInt2415 == 0) {
						arg0.anInt2415 = 1;
					}
				}
				if (this.anInt2415 != arg0.anInt2415) {
					return false;
				}
			}
			for (@Pc(67) int local67 = 0; local67 < this.anInt2439; local67++) {
				if (arg0.aByteArray34[local67] != this.aByteArray34[local67]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)Lclient!kh;")
	public Class60 method1827() {
		@Pc(9) Class60 local9 = new Class60();
		local9.anInt2439 = this.anInt2439;
		local9.aByteArray34 = new byte[this.anInt2439];
		@Pc(20) byte local20 = 2;
		for (@Pc(22) int local22 = 0; local22 < this.anInt2439; local22++) {
			@Pc(32) byte local32 = this.aByteArray34[local22];
			if (local32 >= 97 && local32 <= 122 || local32 >= -32 && local32 <= -2 && local32 != -9) {
				if (local20 == 2) {
					local32 = (byte) (local32 - 32);
				}
				local20 = 0;
			} else if (local32 >= 65 && local32 <= 90 || !(local32 < -64 || local32 > -34 || local32 == -41)) {
				if (local20 == 0) {
					local32 = (byte) (local32 + 32);
				}
				local20 = 0;
			} else if (local32 == 46 || local32 == 33 || local32 == 63) {
				local20 = 2;
			} else if (local32 != 32) {
				local20 = 1;
			} else if (local20 != 2) {
				local20 = 1;
			}
			local9.aByteArray34[local22] = local32;
		}
		return local9;
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(B)J")
	public long method1829() {
		@Pc(11) long local11 = 0L;
		for (@Pc(13) int local13 = 0; this.anInt2439 > local13 && local13 < 12; local13++) {
			@Pc(20) byte local20 = this.aByteArray34[local13];
			local11 *= 37L;
			if (local20 >= 65 && local20 <= 90) {
				local11 += local20 + 1 - 65;
			} else if (local20 >= 97 && local20 <= 122) {
				local11 += local20 + 1 - 97;
			} else if (local20 >= 48 && local20 <= 57) {
				local11 += local20 + 27 - 48;
			}
		}
		while (local11 % 37L == 0L && local11 != 0L) {
			local11 /= 37L;
		}
		return local11;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
	public int method1830(@OriginalArg(1) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray34, 0, this.anInt2439, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray34, 0, this.anInt2439);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "(B)[B")
	public byte[] method1831() {
		@Pc(12) byte[] local12 = new byte[this.anInt2439];
		Static221.method35(this.aByteArray34, 0, local12, 0, this.anInt2439);
		return local12;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(III)I")
	public int method1832(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte local8 = (byte) arg0;
		for (@Pc(15) int local15 = arg1; local15 < this.anInt2439; local15++) {
			if (local8 == this.aByteArray34[local15]) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "(B)I")
	public int method1834() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2439; local7++) {
			local5 = (local5 << 5) + (this.aByteArray34[local7] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "(B)I")
	public int method1835() {
		return this.anInt2439;
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)Lclient!kh;")
	public Class60 method1836() {
		@Pc(9) Class60 local9 = new Class60();
		local9.anInt2439 = this.anInt2439;
		local9.aByteArray34 = new byte[this.anInt2439];
		for (@Pc(28) int local28 = 0; local28 < this.anInt2439; local28++) {
			@Pc(35) byte local35 = this.aByteArray34[local28];
			if (local35 >= 65 && local35 <= 90 || local35 >= -64 && local35 <= -34 && local35 != -41) {
				local35 = (byte) (local35 + 32);
			}
			local9.aByteArray34[local28] = local35;
		}
		return local9;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!kh;IZ)I")
	public int method1837(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int[] local7 = new int[arg0.anInt2439];
		@Pc(10) int[] local10 = new int[256];
		@Pc(14) int[] local14 = new int[arg0.anInt2439];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			local10[local16] = arg0.anInt2439;
		}
		for (@Pc(29) int local29 = 1; local29 <= arg0.anInt2439; local29++) {
			local7[local29 - 1] = (arg0.anInt2439 << 1) - local29;
			local10[arg0.aByteArray34[local29 - 1] & 0xFF] = arg0.anInt2439 - local29;
		}
		@Pc(66) int local66 = arg0.anInt2439 + 1;
		for (@Pc(69) int local69 = arg0.anInt2439; local69 > 0; local69--) {
			local14[local69 - 1] = local66;
			while (local66 <= arg0.anInt2439 && arg0.aByteArray34[local69 - 1] != arg0.aByteArray34[local66 - 1]) {
				if (local7[local66 - 1] >= arg0.anInt2439 - local69) {
					local7[local66 - 1] = arg0.anInt2439 - local69;
				}
				local66 = local14[local66 - 1];
			}
			local66--;
		}
		@Pc(138) int local138 = 1;
		@Pc(140) int local140 = local66;
		local66 = arg0.anInt2439 + 1 - local66;
		@Pc(150) int local150 = 0;
		for (@Pc(159) int local159 = 1; local159 <= local66; local159++) {
			local14[local159 - 1] = local150;
			while (local150 >= 1 && arg0.aByteArray34[local159 - 1] != arg0.aByteArray34[local150 - 1]) {
				local150 = local14[local150 - 1];
			}
			local150++;
		}
		@Pc(205) int local205;
		while (local140 < arg0.anInt2439) {
			for (local205 = local138; local205 <= local140; local205++) {
				if (local7[local205 - 1] >= local140 + arg0.anInt2439 - local205) {
					local7[local205 - 1] = local140 + arg0.anInt2439 - local205;
				}
			}
			local138 = local140 + 1;
			local140 = local66 + local140 - local14[local66 - 1];
			local66 = local14[local66 - 1];
		}
		@Pc(276) int local276;
		for (local205 = arg0.anInt2439 + arg1 - 1; local205 < this.anInt2439; local205 += Math.max(local10[this.aByteArray34[local205] & 0xFF], local7[local276])) {
			for (local276 = arg0.anInt2439 - 1; local276 >= 0 && arg0.aByteArray34[local276] == this.aByteArray34[local205]; local276--) {
				local205--;
			}
			if (local276 == -1) {
				return local205 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(ILclient!kh;)Z")
	public boolean method1838(@OriginalArg(1) Class60 arg0) {
		if (arg0.anInt2439 > this.anInt2439) {
			return false;
		}
		for (@Pc(23) int local23 = 0; local23 < arg0.anInt2439; local23++) {
			if (this.aByteArray34[local23] != arg0.aByteArray34[local23]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)Ljava/net/URL;")
	public URL method1839() throws MalformedURLException {
		return new URL(new String(this.aByteArray34, 0, this.anInt2439));
	}

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "(B)I")
	public int method1841() {
		return this.method1794(10);
	}

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "(B)V")
	public void method1842() {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray34, 0, this.anInt2439, "ISO-8859-1");
		} catch (@Pc(21) UnsupportedEncodingException local21) {
			local13 = new String(this.aByteArray34, 0, this.anInt2439);
		}
		System.out.println(local13);
	}
}
