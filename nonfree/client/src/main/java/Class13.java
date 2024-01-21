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

@OriginalClass("client!dd")
public final class Class13 implements Interface1 {

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!dd", name = "ab", descriptor = "I")
	public int anInt1080;

	@OriginalMember(owner = "client!dd", name = "pb", descriptor = "I")
	private int anInt1092;

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "Z")
	private boolean aBoolean71 = true;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!dd;)Z")
	public boolean method874(@OriginalArg(1) Class13 arg0) {
		if (arg0.anInt1080 > this.anInt1080) {
			return false;
		}
		@Pc(30) int local30 = this.anInt1080 - arg0.anInt1080;
		for (@Pc(32) int local32 = 0; local32 < arg0.anInt1080; local32++) {
			if (arg0.aByteArray19[local32] != this.aByteArray19[local32 + local30]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dd", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method885();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Lclient!dd;")
	public Class13 method875() {
		if (!this.aBoolean71) {
			throw new IllegalArgumentException();
		}
		this.anInt1092 = 0;
		if (this.anInt1080 != this.aByteArray19.length) {
			@Pc(27) byte[] local27 = new byte[this.anInt1080];
			Static193.method2480(this.aByteArray19, 0, local27, 0, this.anInt1080);
			this.aByteArray19 = local27;
		}
		return this;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)Lclient!dd;")
	public Class13 method876() {
		@Pc(5) Class13 local5 = new Class13();
		local5.anInt1080 = this.anInt1080;
		local5.aByteArray19 = new byte[this.anInt1080];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1080; local25++) {
			@Pc(32) byte local32 = this.aByteArray19[local25];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local5.aByteArray19[local25] = local32;
		}
		return local5;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)Ljava/net/URL;")
	public URL method877() throws MalformedURLException {
		return new URL(new String(this.aByteArray19, 0, this.anInt1080));
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)J")
	public long method878() {
		@Pc(3) long local3 = 0L;
		for (@Pc(9) int local9 = 0; local9 < this.anInt1080 && local9 < 12; local9++) {
			@Pc(19) byte local19 = this.aByteArray19[local9];
			local3 *= 37L;
			if (local19 >= 65 && local19 <= 90) {
				local3 += local19 + 1 - 65;
			} else if (local19 >= 97 && local19 <= 122) {
				local3 += local19 - 96;
			} else if (local19 >= 48 && local19 <= 57) {
				local3 += local19 - 21;
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)Lclient!dd;")
	public Class13 method880() {
		@Pc(14) Class13 local14 = Static43.method1141(this.method878());
		return local14 == null ? Static86.aClass13_810 : local14;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)Z")
	private boolean method881() {
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt1080; local23++) {
			@Pc(32) int local32 = this.aByteArray19[local23] & 0xFF;
			if (local23 == 0) {
				if (local32 == 45) {
					local13 = true;
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
				return false;
			}
			if (local32 >= 10) {
				return false;
			}
			if (local13) {
				local32 = -local32;
			}
			@Pc(105) int local105 = local32 + local21 * 10;
			if (local105 / 10 != local21) {
				return false;
			}
			local21 = local105;
			local15 = true;
		}
		return local15;
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)[B")
	public byte[] method882() {
		@Pc(12) byte[] local12 = new byte[this.anInt1080];
		Static193.method2480(this.aByteArray19, 0, local12, 0, this.anInt1080);
		return local12;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)Lclient!dd;")
	public Class13 method883(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class13 local7 = new Class13();
		local7.aByteArray19 = new byte[arg1 - arg0];
		local7.anInt1080 = arg1 - arg0;
		Static193.method2480(this.aByteArray19, arg0, local7.aByteArray19, 0, local7.anInt1080);
		return local7;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(BLclient!dd;)I")
	public int method884(@OriginalArg(1) Class13 arg0) {
		return this.method893(0, arg0);
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)I")
	public int method885() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1080; local7++) {
			local5 = (this.aByteArray19[local7] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([BBIII)I")
	public int method886(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		Static193.method2480(this.aByteArray19, 0, arg0, arg1, arg2);
		return arg2;
	}

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)I")
	public int method887() {
		return this.method912(10);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public void method888(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) String local14;
		try {
			local14 = new String(this.aByteArray19, 0, this.anInt1080, "ISO-8859-1");
		} catch (@Pc(16) UnsupportedEncodingException local16) {
			local14 = new String(this.aByteArray19, 0, this.anInt1080);
		}
		arg0.drawString(local14, arg2, arg1);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!dd;)Z")
	public boolean method889(@OriginalArg(1) Class13 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt1080 == this.anInt1080) {
			if (!this.aBoolean71 || !arg0.aBoolean71) {
				if (this.anInt1092 == 0) {
					this.anInt1092 = this.method885();
					if (this.anInt1092 == 0) {
						this.anInt1092 = 1;
					}
				}
				if (arg0.anInt1092 == 0) {
					arg0.anInt1092 = arg0.method885();
					if (arg0.anInt1092 == 0) {
						arg0.anInt1092 = 1;
					}
				}
				if (this.anInt1092 != arg0.anInt1092) {
					return false;
				}
			}
			for (@Pc(75) int local75 = 0; local75 < this.anInt1080; local75++) {
				if (arg0.aByteArray19[local75] != this.aByteArray19[local75]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)Lclient!dd;")
	public Class13 method890() {
		@Pc(7) long local7 = this.method906();
		@Pc(16) Class local16 = dd.class;
		synchronized (dd.class) {
			@Pc(26) Class1_Sub15 local26;
			if (Static49.aClass45_7 == null) {
				Static49.aClass45_7 = new Class45(4096);
			} else {
				for (local26 = (Class1_Sub15) Static49.aClass45_7.method1988(local7); local26 != null; local26 = (Class1_Sub15) Static49.aClass45_7.method1987()) {
					if (this.method889(local26.aClass13_1026)) {
						return local26.aClass13_1026;
					}
				}
			}
			local26 = new Class1_Sub15();
			local26.aClass13_1026 = this;
			this.aBoolean71 = false;
			Static49.aClass45_7.method1981(local26, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Lclient!dd;")
	public Class13 method891(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean71) {
			this.anInt1092 = 0;
			if (this.anInt1080 == this.aByteArray19.length) {
				@Pc(54) int local54;
				for (local54 = 1; local54 <= this.anInt1080; local54 += local54) {
				}
				@Pc(71) byte[] local71 = new byte[local54];
				Static193.method2480(this.aByteArray19, 0, local71, 0, this.anInt1080);
				this.aByteArray19 = local71;
			}
			this.aByteArray19[this.anInt1080++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!dd;I)Z")
	public boolean method892(@OriginalArg(0) Class13 arg0) {
		if (arg0.anInt1080 > this.anInt1080) {
			return false;
		}
		for (@Pc(20) int local20 = 0; local20 < arg0.anInt1080; local20++) {
			if (arg0.aByteArray19[local20] != this.aByteArray19[local20]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZILclient!dd;)I")
	public int method893(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(12) int[] local12 = new int[arg1.anInt1080];
		@Pc(16) int[] local16 = new int[arg1.anInt1080];
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			local8[local18] = arg1.anInt1080;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg1.anInt1080; local36++) {
			local12[local36 - 1] = (arg1.anInt1080 << 1) - local36;
			local8[arg1.aByteArray19[local36 - 1] & 0xFF] = arg1.anInt1080 - local36;
		}
		@Pc(78) int local78 = arg1.anInt1080 + 1;
		for (@Pc(81) int local81 = arg1.anInt1080; local81 > 0; local81--) {
			local16[local81 - 1] = local78;
			while (arg1.anInt1080 >= local78 && arg1.aByteArray19[local78 - 1] != arg1.aByteArray19[local81 - 1]) {
				if (arg1.anInt1080 - local81 <= local12[local78 + -1]) {
					local12[local78 - 1] = arg1.anInt1080 - local81;
				}
				local78 = local16[local78 - 1];
			}
			local78--;
		}
		@Pc(147) int local147 = local78;
		local78 = arg1.anInt1080 + 1 - local78;
		@Pc(157) int local157 = 0;
		@Pc(159) int local159 = 1;
		while (local159 <= local78) {
			local16[local159 - 1] = local157;
			while (local157 >= 1 && arg1.aByteArray19[local157 - 1] != arg1.aByteArray19[local159 - 1]) {
				local157 = local16[local157 - 1];
			}
			local159++;
			local157++;
		}
		@Pc(204) int local204 = 1;
		@Pc(208) int local208;
		while (local147 < arg1.anInt1080) {
			for (local208 = local204; local208 <= local147; local208++) {
				if (local12[local208 - 1] >= arg1.anInt1080 + local147 - local208) {
					local12[local208 - 1] = local147 + arg1.anInt1080 - local208;
				}
			}
			local204 = local147 + 1;
			local147 = local147 + local78 - local16[local78 - 1];
			local78 = local16[local78 - 1];
		}
		@Pc(288) int local288;
		for (local208 = arg0 + arg1.anInt1080 - 1; local208 < this.anInt1080; local208 += Math.max(local8[this.aByteArray19[local208] & 0xFF], local12[local288])) {
			for (local288 = arg1.anInt1080 - 1; local288 >= 0 && arg1.aByteArray19[local288] == this.aByteArray19[local208]; local288--) {
				local208--;
			}
			if (local288 == -1) {
				return local208 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!dd", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class13)) {
			throw new IllegalArgumentException();
		}
		return this.method889((Class13) arg0);
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(ILclient!dd;)Z")
	public boolean method894(@OriginalArg(1) Class13 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1080 == arg0.anInt1080) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt1080; local26++) {
				@Pc(33) byte local33 = this.aByteArray19[local26];
				@Pc(38) byte local38 = arg0.aByteArray19[local26];
				if (local38 >= 65 && local38 <= 90 || local38 >= -64 && local38 <= -34 && local38 != -41) {
					local38 = (byte) (local38 + 32);
				}
				if (local33 >= 65 && local33 <= 90 || local33 >= -64 && local33 <= -34 && local33 != -41) {
					local33 = (byte) (local33 + 32);
				}
				if (local38 != local33) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!dd;B)I")
	public int method896(@OriginalArg(0) Class13 arg0) {
		@Pc(17) int local17;
		if (this.anInt1080 <= arg0.anInt1080) {
			local17 = this.anInt1080;
		} else {
			local17 = arg0.anInt1080;
		}
		for (@Pc(24) int local24 = 0; local24 < local17; local24++) {
			if ((this.aByteArray19[local24] & 0xFF) < (arg0.aByteArray19[local24] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray19[local24] & 0xFF) > (arg0.aByteArray19[local24] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt1080 < arg0.anInt1080) {
			return -1;
		} else if (this.anInt1080 > arg0.anInt1080) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "(I)Lclient!dd;")
	public Class13 method897() {
		@Pc(3) int local3;
		for (local3 = 0; this.anInt1080 > local3 && (this.aByteArray19[local3] >= 0 && this.aByteArray19[local3] <= 32 || (this.aByteArray19[local3] & 0xFF) == 160); local3++) {
		}
		@Pc(40) int local40;
		for (local40 = this.anInt1080; local40 > local3 && (this.aByteArray19[local40 - 1] >= 0 && this.aByteArray19[local40 - 1] <= 32 || (this.aByteArray19[local40 - 1] & 0xFF) == 160); local40--) {
		}
		if (local3 == 0 && local40 == this.anInt1080) {
			return this;
		}
		@Pc(98) Class13 local98 = new Class13();
		local98.anInt1080 = local40 - local3;
		local98.aByteArray19 = new byte[local98.anInt1080];
		for (@Pc(111) int local111 = 0; local111 < local98.anInt1080; local111++) {
			local98.aByteArray19[local111] = this.aByteArray19[local111 + local3];
		}
		return local98;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)I")
	public int method898(@OriginalArg(0) int arg0) {
		return this.aByteArray19[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)Lclient!dd;")
	public Class13 method899(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(25) Class13 local25 = new Class13();
		local25.aByteArray19 = new byte[this.anInt1080 + 1];
		local25.anInt1080 = this.anInt1080 + 1;
		Static193.method2480(this.aByteArray19, 0, local25.aByteArray19, 0, this.anInt1080);
		local25.aByteArray19[this.anInt1080] = (byte) arg0;
		return local25;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLclient!dd;)Lclient!dd;")
	public Class13 method900(@OriginalArg(1) Class13 arg0) {
		if (!this.aBoolean71) {
			throw new IllegalArgumentException();
		}
		this.anInt1092 = 0;
		if (this.anInt1080 + arg0.anInt1080 > this.aByteArray19.length) {
			@Pc(26) int local26;
			for (local26 = 1; local26 < this.anInt1080 + arg0.anInt1080; local26 += local26) {
			}
			@Pc(47) byte[] local47 = new byte[local26];
			Static193.method2480(this.aByteArray19, 0, local47, 0, this.anInt1080);
			this.aByteArray19 = local47;
		}
		Static193.method2480(arg0.aByteArray19, 0, this.aByteArray19, this.anInt1080, arg0.anInt1080);
		this.anInt1080 += arg0.anInt1080;
		return this;
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(II)Lclient!dd;")
	public Class13 method901(@OriginalArg(0) int arg0) {
		return this.method883(arg0, this.anInt1080);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/awt/FontMetrics;B)I")
	public int method902(@OriginalArg(0) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray19, 0, this.anInt1080, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray19, 0, this.anInt1080);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "(I)Lclient!dd;")
	public Class13 method903() {
		@Pc(5) Class13 local5 = new Class13();
		local5.anInt1080 = this.anInt1080;
		@Pc(15) boolean local15 = true;
		local5.aByteArray19 = new byte[this.anInt1080];
		for (@Pc(27) int local27 = 0; local27 < this.anInt1080; local27++) {
			@Pc(34) byte local34 = this.aByteArray19[local27];
			if (local34 == 95) {
				local5.aByteArray19[local27] = 32;
				local15 = true;
			} else if (local34 >= 97 && local34 <= 122 && local15) {
				local5.aByteArray19[local27] = (byte) (local34 - 32);
				local15 = false;
			} else {
				local15 = false;
				local5.aByteArray19[local27] = local34;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)I")
	public int method904() {
		return this.anInt1080;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)Z")
	public boolean method905() {
		return this.method881();
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(Z)J")
	private long method906() {
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1080; local12++) {
			local10 = (long) (this.aByteArray19[local12] & 0xFF) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLjava/applet/Applet;)V")
	public void method907(@OriginalArg(1) Applet arg0) throws Throwable {
		@Pc(12) String local12 = new String(this.aByteArray19, 0, this.anInt1080);
		Static191.method1582(local12, arg0);
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)I")
	public int method908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte local8 = (byte) arg1;
		for (@Pc(10) int local10 = arg0; local10 < this.anInt1080; local10++) {
			if (this.aByteArray19[local10] == local8) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(BLjava/applet/Applet;)Lclient!dd;")
	public Class13 method909(@OriginalArg(1) Applet arg0) {
		@Pc(12) String local12 = new String(this.aByteArray19, 0, this.anInt1080);
		@Pc(16) String local16 = arg0.getParameter(local12);
		return local16 == null ? null : Static126.method2305(local16);
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(Lclient!dd;I)I")
	public int method911(@OriginalArg(0) Class13 arg0) {
		@Pc(22) int local22;
		if (arg0.anInt1080 >= this.anInt1080) {
			local22 = this.anInt1080;
		} else {
			local22 = arg0.anInt1080;
		}
		for (@Pc(29) int local29 = 0; local29 < local22; local29++) {
			if (Static141.anIntArray336[this.aByteArray19[local29] & 0xFF] < Static141.anIntArray336[arg0.aByteArray19[local29] & 0xFF]) {
				return -1;
			}
			if (Static141.anIntArray336[arg0.aByteArray19[local29] & 0xFF] < Static141.anIntArray336[this.aByteArray19[local29] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt1080 > this.anInt1080) {
			return -1;
		} else if (this.anInt1080 > arg0.anInt1080) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)I")
	public int method912(@OriginalArg(0) int arg0) {
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt1080; local23++) {
			@Pc(32) int local32 = this.aByteArray19[local23] & 0xFF;
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
			if (local32 >= arg0) {
				throw new NumberFormatException();
			}
			if (local17) {
				local32 = -local32;
			}
			@Pc(109) int local109 = local32 + local21 * arg0;
			if (local109 / arg0 != local21) {
				throw new NumberFormatException();
			}
			local21 = local109;
			local19 = true;
		}
		if (!local19) {
			throw new NumberFormatException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)Lclient!dd;")
	public Class13 method913() {
		@Pc(9) Class13 local9 = new Class13();
		local9.anInt1080 = this.anInt1080;
		local9.aByteArray19 = new byte[this.anInt1080];
		for (@Pc(28) int local28 = 0; local28 < this.anInt1080; local28++) {
			local9.aByteArray19[local28] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)Lclient!dd;")
	public Class13 method914() {
		@Pc(5) Class13 local5 = new Class13();
		local5.anInt1080 = this.anInt1080;
		local5.aByteArray19 = new byte[this.anInt1080];
		@Pc(20) byte local20 = 2;
		for (@Pc(22) int local22 = 0; local22 < this.anInt1080; local22++) {
			@Pc(40) byte local40 = this.aByteArray19[local22];
			if (local40 >= 97 && local40 <= 122 || local40 >= -32 && local40 <= -2 && local40 != -9) {
				if (local20 == 2) {
					local40 = (byte) (local40 - 32);
				}
				local20 = 0;
			} else if (local40 >= 65 && local40 <= 90 || !(local40 < -64 || local40 > -34 || local40 == -41)) {
				if (local20 == 0) {
					local40 = (byte) (local40 + 32);
				}
				local20 = 0;
			} else if (local40 == 46 || local40 == 33 || local40 == 63) {
				local20 = 2;
			} else if (local40 != 32) {
				local20 = 1;
			} else if (local20 != 2) {
				local20 = 1;
			}
			local5.aByteArray19[local22] = local40;
		}
		return local5;
	}
}
