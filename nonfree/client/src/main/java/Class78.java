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

@OriginalClass("client!qe")
public final class Class78 implements Interface3 {

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
	public int anInt3831;

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
	private int anInt3842;

	@OriginalMember(owner = "client!qe", name = "W", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!qe", name = "H", descriptor = "Z")
	private boolean aBoolean167 = true;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/applet/Applet;)Ljava/lang/Object;")
	public Object method3001(@OriginalArg(1) Applet arg0) throws Throwable {
		@Pc(17) String local17 = new String(this.aByteArray48, 0, this.anInt3831);
		@Pc(23) Object local23 = Static236.method3109(arg0, null, local17);
		if (local23 instanceof String) {
			@Pc(30) byte[] local30 = ((String) local23).getBytes();
			local23 = Static48.method629(local30.length, 0, local30);
		}
		return local23;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Lclient!qe;")
	public Class78 method3002() {
		if (!this.aBoolean167) {
			throw new IllegalArgumentException();
		}
		this.anInt3842 = 0;
		if (this.aByteArray48.length != this.anInt3831) {
			@Pc(32) byte[] local32 = new byte[this.anInt3831];
			Static231.method2214(this.aByteArray48, 0, local32, 0, this.anInt3831);
			this.aByteArray48 = local32;
		}
		return this;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)Ljava/net/URL;")
	public URL method3003() throws MalformedURLException {
		return new URL(new String(this.aByteArray48, 0, this.anInt3831));
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!qe;B)I")
	public int method3004(@OriginalArg(0) Class78 arg0) {
		@Pc(11) int local11;
		if (arg0.anInt3831 >= this.anInt3831) {
			local11 = this.anInt3831;
		} else {
			local11 = arg0.anInt3831;
		}
		for (@Pc(17) int local17 = 0; local17 < local11; local17++) {
			if (Static216.anIntArray751[arg0.aByteArray48[local17] & 0xFF] > Static216.anIntArray751[this.aByteArray48[local17] & 0xFF]) {
				return -1;
			}
			if (Static216.anIntArray751[arg0.aByteArray48[local17] & 0xFF] < Static216.anIntArray751[this.aByteArray48[local17] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt3831 < arg0.anInt3831) {
			return -1;
		} else if (this.anInt3831 > arg0.anInt3831) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)Lclient!qe;")
	public Class78 method3005() {
		@Pc(7) Class78 local7 = new Class78();
		local7.anInt3831 = this.anInt3831;
		local7.aByteArray48 = new byte[this.anInt3831];
		for (@Pc(23) int local23 = 0; local23 < this.anInt3831; local23++) {
			@Pc(29) byte local29 = this.aByteArray48[local23];
			if (local29 >= 65 && local29 <= 90 || local29 >= -64 && local29 <= -34 && local29 != -41) {
				local29 = (byte) (local29 + 32);
			}
			local7.aByteArray48[local23] = local29;
		}
		return local7;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!qe;BI)I")
	public int method3006(@OriginalArg(0) Class78 arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int[] local6 = new int[256];
		@Pc(10) int[] local10 = new int[arg0.anInt3831];
		@Pc(14) int[] local14 = new int[arg0.anInt3831];
		for (@Pc(16) int local16 = 0; local16 < local6.length; local16++) {
			local6[local16] = arg0.anInt3831;
		}
		for (@Pc(33) int local33 = 1; local33 <= arg0.anInt3831; local33++) {
			local10[local33 - 1] = (arg0.anInt3831 << 1) - local33;
			local6[arg0.aByteArray48[local33 - 1] & 0xFF] = arg0.anInt3831 - local33;
		}
		@Pc(75) int local75 = arg0.anInt3831 + 1;
		for (@Pc(78) int local78 = arg0.anInt3831; local78 > 0; local78--) {
			local14[local78 - 1] = local75;
			while (arg0.anInt3831 >= local75 && arg0.aByteArray48[local78 - 1] != arg0.aByteArray48[local75 - 1]) {
				if (arg0.anInt3831 - local78 <= local10[local75 + -1]) {
					local10[local75 - 1] = arg0.anInt3831 - local78;
				}
				local75 = local14[local75 - 1];
			}
			local75--;
		}
		@Pc(150) int local150 = 1;
		@Pc(152) int local152 = local75;
		@Pc(154) int local154 = 0;
		local75 = arg0.anInt3831 + 1 - local75;
		@Pc(164) int local164 = 1;
		while (local75 >= local164) {
			local14[local164 - 1] = local154;
			while (local154 >= 1 && arg0.aByteArray48[local164 - 1] != arg0.aByteArray48[local154 - 1]) {
				local154 = local14[local154 - 1];
			}
			local164++;
			local154++;
		}
		@Pc(206) int local206;
		while (arg0.anInt3831 > local152) {
			for (local206 = local150; local206 <= local152; local206++) {
				if (arg0.anInt3831 + local152 - local206 <= local10[local206 + -1]) {
					local10[local206 - 1] = local152 + arg0.anInt3831 - local206;
				}
			}
			local150 = local152 + 1;
			local152 = local75 + local152 - local14[local75 - 1];
			local75 = local14[local75 - 1];
		}
		@Pc(278) int local278;
		for (local206 = arg1 + arg0.anInt3831 - 1; local206 < this.anInt3831; local206 += Math.max(local6[this.aByteArray48[local206] & 0xFF], local10[local278])) {
			for (local278 = arg0.anInt3831 - 1; local278 >= 0 && arg0.aByteArray48[local278] == this.aByteArray48[local206]; local278--) {
				local206--;
			}
			if (local278 == -1) {
				return local206 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)Z")
	public boolean method3007() {
		return this.method3050();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lclient!qe;")
	public Class78 method3008(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean167) {
			this.anInt3842 = 0;
			if (this.aByteArray48.length == this.anInt3831) {
				@Pc(48) int local48;
				for (local48 = 1; local48 <= this.anInt3831; local48 += local48) {
				}
				@Pc(60) byte[] local60 = new byte[local48];
				Static231.method2214(this.aByteArray48, 0, local60, 0, this.anInt3831);
				this.aByteArray48 = local60;
			}
			this.aByteArray48[this.anInt3831++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!qe;)Z")
	public boolean method3009(@OriginalArg(1) Class78 arg0) {
		if (this.anInt3831 < arg0.anInt3831) {
			return false;
		}
		@Pc(27) int local27 = this.anInt3831 - arg0.anInt3831;
		for (@Pc(29) int local29 = 0; local29 < arg0.anInt3831; local29++) {
			if (this.aByteArray48[local27 + local29] != arg0.aByteArray48[local29]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBI)Lclient!qe;")
	public Class78 method3010(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class78 local3 = new Class78();
		local3.aByteArray48 = new byte[arg1 - arg0];
		local3.anInt3831 = arg1 - arg0;
		Static231.method2214(this.aByteArray48, arg0, local3.aByteArray48, 0, local3.anInt3831);
		return local3;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)J")
	private long method3011() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt3831; local7++) {
			local5 = (long) (this.aByteArray48[local7] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)I")
	public int method3012() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt3831; local7++) {
			local5 = (this.aByteArray48[local7] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)[B")
	public byte[] method3013() {
		@Pc(11) byte[] local11 = new byte[this.anInt3831];
		Static231.method2214(this.aByteArray48, 0, local11, 0, this.anInt3831);
		return local11;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method3014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2) {
		@Pc(19) String local19;
		try {
			local19 = new String(this.aByteArray48, 0, this.anInt3831, "ISO-8859-1");
		} catch (@Pc(21) UnsupportedEncodingException local21) {
			local19 = new String(this.aByteArray48, 0, this.anInt3831);
		}
		arg2.drawString(local19, arg0, arg1);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!qe;III)Lclient!qe;")
	public Class78 method3015(@OriginalArg(0) Class78 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.aBoolean167) {
			throw new IllegalArgumentException();
		} else if (arg1 >= 0 && arg1 <= arg2 && arg0.anInt3831 >= arg2) {
			this.anInt3842 = 0;
			if (this.aByteArray48.length < this.anInt3831 + arg2 - arg1) {
				@Pc(56) int local56;
				for (local56 = 1; local56 < this.anInt3831 + arg0.anInt3831; local56 += local56) {
				}
				@Pc(76) byte[] local76 = new byte[local56];
				Static231.method2214(this.aByteArray48, 0, local76, 0, this.anInt3831);
				this.aByteArray48 = local76;
			}
			Static231.method2214(arg0.aByteArray48, arg1, this.aByteArray48, this.anInt3831, arg2 - arg1);
			this.anInt3831 += arg2 - arg1;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)J")
	public long method3016() {
		@Pc(5) long local5 = 0L;
		for (@Pc(12) int local12 = 0; this.anInt3831 > local12 && local12 < 12; local12++) {
			@Pc(18) byte local18 = this.aByteArray48[local12];
			local5 *= 37L;
			if (local18 >= 65 && local18 <= 90) {
				local5 += local18 - 64;
			} else if (local18 >= 97 && local18 <= 122) {
				local5 += local18 - 96;
			} else if (local18 >= 48 && local18 <= 57) {
				local5 += local18 + 27 - 48;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)I")
	public int method3017() {
		return this.method3044(10);
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)Lclient!qe;")
	public Class78 method3018() {
		@Pc(5) int local5;
		for (local5 = 0; this.anInt3831 > local5 && (this.aByteArray48[local5] >= 0 && this.aByteArray48[local5] <= 32 || (this.aByteArray48[local5] & 0xFF) == 160); local5++) {
		}
		@Pc(38) int local38;
		for (local38 = this.anInt3831; local38 > local5 && (this.aByteArray48[local38 - 1] >= 0 && this.aByteArray48[local38 - 1] <= 32 || (this.aByteArray48[local38 - 1] & 0xFF) == 160); local38--) {
		}
		if (local5 == 0 && this.anInt3831 == local38) {
			return this;
		}
		@Pc(96) Class78 local96 = new Class78();
		local96.anInt3831 = local38 - local5;
		local96.aByteArray48 = new byte[local96.anInt3831];
		for (@Pc(108) int local108 = 0; local108 < local96.anInt3831; local108++) {
			local96.aByteArray48[local108] = this.aByteArray48[local5 + local108];
		}
		return local96;
	}

	@OriginalMember(owner = "client!qe", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class78)) {
			throw new IllegalArgumentException();
		}
		return this.method3043((Class78) arg0);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/applet/Applet;B)Lclient!qe;")
	public Class78 method3019(@OriginalArg(0) Applet arg0) {
		@Pc(8) String local8 = new String(this.aByteArray48, 0, this.anInt3831);
		@Pc(21) String local21 = arg0.getParameter(local8);
		return local21 == null ? null : Static168.method3776(local21);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(IBI)I")
	public int method3021(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte local6 = (byte) arg0;
		for (@Pc(8) int local8 = arg1; local8 < this.anInt3831; local8++) {
			if (local6 == this.aByteArray48[local8]) {
				return local8;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!qe;I)Lclient!qe;")
	public Class78 method3022(@OriginalArg(0) Class78 arg0) {
		if (!this.aBoolean167) {
			throw new IllegalArgumentException();
		}
		this.anInt3842 = 0;
		if (this.aByteArray48.length < arg0.anInt3831 + this.anInt3831) {
			@Pc(35) int local35;
			for (local35 = 1; local35 < this.anInt3831 + arg0.anInt3831; local35 += local35) {
			}
			@Pc(54) byte[] local54 = new byte[local35];
			Static231.method2214(this.aByteArray48, 0, local54, 0, this.anInt3831);
			this.aByteArray48 = local54;
		}
		Static231.method2214(arg0.aByteArray48, 0, this.aByteArray48, this.anInt3831, arg0.anInt3831);
		this.anInt3831 += arg0.anInt3831;
		return this;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)[Lclient!qe;")
	public Class78[] method3023(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt3831; local7++) {
			if (this.aByteArray48[local7] == arg0) {
				local5++;
			}
		}
		@Pc(29) Class78[] local29 = new Class78[local5 + 1];
		if (local5 == 0) {
			local29[0] = this;
			return local29;
		}
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local5; local48++) {
			@Pc(51) int local51;
			for (local51 = 0; this.aByteArray48[local51 + local44] != arg0; local51++) {
			}
			local29[local46++] = this.method3010(local44, local44 + local51);
			local44 += local51 + 1;
		}
		local29[local5] = this.method3010(local44, this.anInt3831);
		return local29;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/net/URL;B)Ljava/net/URL;")
	public URL method3024(@OriginalArg(0) URL arg0) throws MalformedURLException {
		return new URL(arg0, new String(this.aByteArray48, 0, this.anInt3831));
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)Lclient!qe;")
	public Class78 method3025() {
		@Pc(9) Class78 local9 = Static103.method1785(this.method3016());
		return local9 == null ? Static10.aClass78_37 : local9;
	}

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)V")
	public void method3026() {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray48, 0, this.anInt3831, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray48, 0, this.anInt3831);
		}
		System.out.println(local18);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!qe;Z)Z")
	public boolean method3027(@OriginalArg(0) Class78 arg0) {
		if (arg0.anInt3831 > this.anInt3831) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt3831; local16++) {
			if (this.aByteArray48[local16] != arg0.aByteArray48[local16]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "(I)[B")
	public byte[] method3028() {
		if (this.anInt3831 == 0) {
			return new byte[0];
		}
		@Pc(24) int local24 = this.anInt3831 + 3 & 0xFFFFFFFC;
		@Pc(30) int local30 = local24 / 4 * 3;
		if (this.anInt3831 <= local24 - 2 || Static15.method244(this.aByteArray48[local24 - 2]) == -1) {
			local30 -= 2;
		} else if (this.anInt3831 <= local24 - 1 || Static15.method244(this.aByteArray48[local24 - 1]) == -1) {
			local30--;
		}
		@Pc(78) byte[] local78 = new byte[local30];
		this.method3029(0, local78);
		return local78;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[BI)I")
	private int method3029(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < this.anInt3831; local12 += 4) {
			@Pc(22) int local22 = Static15.method244(this.aByteArray48[local12]);
			@Pc(45) int local45 = local12 + 1 < this.anInt3831 ? Static15.method244(this.aByteArray48[local12 + 1]) : -1;
			@Pc(62) int local62 = this.anInt3831 <= local12 + 2 ? -1 : Static15.method244(this.aByteArray48[local12 + 2]);
			@Pc(83) int local83 = this.anInt3831 <= local12 + 3 ? -1 : Static15.method244(this.aByteArray48[local12 + 3]);
			arg1[arg0++] = (byte) (local22 << 2 | local45 >>> 4);
			if (local62 == -1) {
				break;
			}
			arg1[arg0++] = (byte) ((local45 & 0xF) << 4 | local62 >>> 2);
			if (local83 == -1) {
				break;
			}
			arg1[arg0++] = (byte) ((local62 & 0x3) << 6 | local83);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(II)I")
	public int method3030() {
		return this.method3021(44, 0);
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(II)Lclient!qe;")
	public Class78 method3031(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(22) Class78 local22 = new Class78();
		local22.aByteArray48 = new byte[this.anInt3831 + 1];
		local22.anInt3831 = this.anInt3831 + 1;
		Static231.method2214(this.aByteArray48, 0, local22.aByteArray48, 0, this.anInt3831);
		local22.aByteArray48[this.anInt3831] = (byte) arg0;
		return local22;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(IBI)Lclient!qe;")
	public Class78 method3032() {
		@Pc(20) Class78 local20 = new Class78();
		local20.anInt3831 = this.anInt3831;
		local20.aByteArray48 = new byte[this.anInt3831];
		for (@Pc(31) int local31 = 0; local31 < this.anInt3831; local31++) {
			@Pc(38) byte local38 = this.aByteArray48[local31];
			if (local38 == 47) {
				local20.aByteArray48[local31] = 32;
			} else {
				local20.aByteArray48[local31] = local38;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLclient!qe;)Z")
	public boolean method3033(@OriginalArg(1) Class78 arg0) {
		if (arg0.anInt3831 > this.anInt3831) {
			return false;
		}
		for (@Pc(22) int local22 = 0; local22 < arg0.anInt3831; local22++) {
			@Pc(28) byte local28 = this.aByteArray48[local22];
			if (local28 >= 65 && local28 <= 90 || local28 >= -64 && local28 <= -34 && local28 != -41) {
				local28 = (byte) (local28 + 32);
			}
			@Pc(61) byte local61 = arg0.aByteArray48[local22];
			if (local61 >= 65 && local61 <= 90 || local61 >= -64 && local61 <= -34 && local61 != -41) {
				local61 = (byte) (local61 + 32);
			}
			if (local61 != local28) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qe", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
	public int method3034(@OriginalArg(1) FontMetrics arg0) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray48, 0, this.anInt3831, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray48, 0, this.anInt3831);
		}
		return arg0.stringWidth(local18);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)Lclient!qe;")
	public Class78 method3035() {
		@Pc(9) Class78 local9 = new Class78();
		local9.anInt3831 = this.anInt3831;
		@Pc(15) byte local15 = 2;
		local9.aByteArray48 = new byte[this.anInt3831];
		for (@Pc(27) int local27 = 0; local27 < this.anInt3831; local27++) {
			@Pc(34) byte local34 = this.aByteArray48[local27];
			if (local34 >= 97 && local34 <= 122 || local34 >= -32 && local34 <= -2 && local34 != -9) {
				if (local15 == 2) {
					local34 = (byte) (local34 - 32);
				}
				local15 = 0;
			} else if (local34 >= 65 && local34 <= 90 || !(local34 < -64 || local34 > -34 || local34 == -41)) {
				if (local15 == 0) {
					local34 = (byte) (local34 + 32);
				}
				local15 = 0;
			} else if (local34 == 46 || local34 == 33 || local34 == 63) {
				local15 = 2;
			} else if (local34 != 32) {
				local15 = 1;
			} else if (local15 != 2) {
				local15 = 1;
			}
			local9.aByteArray48[local27] = local34;
		}
		return local9;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Lclient!qe;Z)I")
	public int method3036(@OriginalArg(0) Class78 arg0) {
		return this.method3006(arg0, 0);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(ILclient!qe;)Z")
	public boolean method3038(@OriginalArg(1) Class78 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt3831 == this.anInt3831) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt3831; local20++) {
				@Pc(26) byte local26 = arg0.aByteArray48[local20];
				@Pc(31) byte local31 = this.aByteArray48[local20];
				if (local26 >= 65 && local26 <= 90 || local26 >= -64 && local26 <= -34 && local26 != -41) {
					local26 = (byte) (local26 + 32);
				}
				if (local31 >= 65 && local31 <= 90 || local31 >= -64 && local31 <= -34 && local31 != -41) {
					local31 = (byte) (local31 + 32);
				}
				if (local31 != local26) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "(I)Lclient!qe;")
	public Class78 method3039() {
		@Pc(7) long local7 = this.method3011();
		@Pc(16) Class local16 = qe.class;
		synchronized (qe.class) {
			@Pc(32) Class2_Sub15 local32;
			if (Static225.aClass103_23 == null) {
				Static225.aClass103_23 = new Class103(4096);
			} else {
				for (local32 = (Class2_Sub15) Static225.aClass103_23.method3659(local7); local32 != null; local32 = (Class2_Sub15) Static225.aClass103_23.method3664()) {
					if (this.method3043(local32.aClass78_305)) {
						return local32.aClass78_305;
					}
				}
			}
			local32 = new Class2_Sub15();
			this.aBoolean167 = false;
			local32.aClass78_305 = this;
			Static225.aClass103_23.method3665(local7, local32);
			return this;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)V")
	public void method3040() {
		this.anInt3842 = 0;
		if (!this.aBoolean167) {
			throw new IllegalArgumentException();
		}
		@Pc(29) int local29;
		if (this.aByteArray48.length < 0) {
			for (local29 = 1; local29 < 0; local29 += local29) {
			}
			@Pc(40) byte[] local40 = new byte[local29];
			Static231.method2214(this.aByteArray48, 0, local40, 0, this.anInt3831);
			this.aByteArray48 = local40;
		}
		for (local29 = this.anInt3831; local29 < 0; local29++) {
			this.aByteArray48[local29] = 32;
		}
		this.anInt3831 = 0;
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(B)I")
	public int method3041() {
		return this.anInt3831;
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(II)I")
	public int method3042(@OriginalArg(1) int arg0) {
		return this.aByteArray48[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(ILclient!qe;)Z")
	public boolean method3043(@OriginalArg(1) Class78 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt3831 == this.anInt3831) {
			if (!this.aBoolean167 || !arg0.aBoolean167) {
				if (this.anInt3842 == 0) {
					this.anInt3842 = this.method3012();
					if (this.anInt3842 == 0) {
						this.anInt3842 = 1;
					}
				}
				if (arg0.anInt3842 == 0) {
					arg0.anInt3842 = arg0.method3012();
					if (arg0.anInt3842 == 0) {
						arg0.anInt3842 = 1;
					}
				}
				if (arg0.anInt3842 != this.anInt3842) {
					return false;
				}
			}
			for (@Pc(73) int local73 = 0; local73 < this.anInt3831; local73++) {
				if (this.aByteArray48[local73] != arg0.aByteArray48[local73]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "(II)I")
	public int method3044(@OriginalArg(0) int arg0) {
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt3831; local27++) {
			@Pc(35) int local35 = this.aByteArray48[local27] & 0xFF;
			if (local27 == 0) {
				if (local35 == 45) {
					local21 = true;
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
			if (local35 >= arg0) {
				throw new NumberFormatException();
			}
			if (local21) {
				local35 = -local35;
			}
			@Pc(98) int local98 = local25 * arg0 + local35;
			if (local25 != local98 / arg0) {
				throw new NumberFormatException();
			}
			local25 = local98;
			local23 = true;
		}
		if (!local23) {
			throw new NumberFormatException();
		}
		return local25;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BII[BI)I")
	public int method3045(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		Static231.method2214(this.aByteArray48, 0, arg2, arg0, arg1);
		return arg1;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Lclient!qe;I)I")
	public int method3047(@OriginalArg(0) Class78 arg0) {
		@Pc(21) int local21;
		if (this.anInt3831 <= arg0.anInt3831) {
			local21 = this.anInt3831;
		} else {
			local21 = arg0.anInt3831;
		}
		for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
			if ((arg0.aByteArray48[local27] & 0xFF) > (this.aByteArray48[local27] & 0xFF)) {
				return -1;
			}
			if ((arg0.aByteArray48[local27] & 0xFF) < (this.aByteArray48[local27] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.anInt3831 > this.anInt3831) {
			return -1;
		} else if (this.anInt3831 > arg0.anInt3831) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "(I)Lclient!qe;")
	public Class78 method3048() {
		@Pc(3) Class78 local3 = new Class78();
		@Pc(9) boolean local9 = true;
		local3.anInt3831 = this.anInt3831;
		local3.aByteArray48 = new byte[this.anInt3831];
		for (@Pc(20) int local20 = 0; local20 < this.anInt3831; local20++) {
			@Pc(26) byte local26 = this.aByteArray48[local20];
			if (local26 == 95) {
				local3.aByteArray48[local20] = 32;
				local9 = true;
			} else if (local26 >= 97 && local26 <= 122 && local9) {
				local3.aByteArray48[local20] = (byte) (local26 - 32);
				local9 = false;
			} else {
				local3.aByteArray48[local20] = local26;
				local9 = false;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "(II)Z")
	private boolean method3050() {
		@Pc(11) boolean local11 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt3831; local27++) {
			@Pc(35) int local35 = this.aByteArray48[local27] & 0xFF;
			if (local27 == 0) {
				if (local35 == 45) {
					local17 = true;
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
			if (local17) {
				local35 = -local35;
			}
			@Pc(107) int local107 = local19 * 10 + local35;
			if (local107 / 10 != local19) {
				return false;
			}
			local19 = local107;
			local11 = true;
		}
		return local11;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/applet/Applet;I)V")
	public void method3051(@OriginalArg(0) Applet arg0) throws Throwable {
		@Pc(12) String local12 = new String(this.aByteArray48, 0, this.anInt3831);
		Static236.method3110(local12, arg0);
	}

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "(II)Lclient!qe;")
	public Class78 method3052(@OriginalArg(0) int arg0) {
		return this.method3010(arg0, this.anInt3831);
	}

	@OriginalMember(owner = "client!qe", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method3012();
	}
}
