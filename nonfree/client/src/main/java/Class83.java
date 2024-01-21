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
public final class Class83 implements Interface2 {

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
	private int anInt3155;

	@OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
	public int anInt3158;

	@OriginalMember(owner = "client!qe", name = "K", descriptor = "Z")
	private boolean aBoolean146 = true;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)I")
	public int method2382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte local8 = (byte) arg1;
		for (@Pc(10) int local10 = arg0; local10 < this.anInt3158; local10++) {
			if (this.aByteArray36[local10] == local8) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!qe;Z)I")
	public int method2384(@OriginalArg(0) Class83 arg0) {
		@Pc(13) int local13;
		if (arg0.anInt3158 >= this.anInt3158) {
			local13 = this.anInt3158;
		} else {
			local13 = arg0.anInt3158;
		}
		for (@Pc(25) int local25 = 0; local25 < local13; local25++) {
			if (Static146.anIntArray300[this.aByteArray36[local25] & 0xFF] < Static146.anIntArray300[arg0.aByteArray36[local25] & 0xFF]) {
				return -1;
			}
			if (Static146.anIntArray300[arg0.aByteArray36[local25] & 0xFF] < Static146.anIntArray300[this.aByteArray36[local25] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt3158 < arg0.anInt3158) {
			return -1;
		} else if (arg0.anInt3158 < this.anInt3158) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!qe;II)I")
	public int method2385(@OriginalArg(0) Class83 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int[] local9 = new int[arg0.anInt3158];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg0.anInt3158];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg0.anInt3158;
		}
		for (@Pc(32) int local32 = 1; local32 <= arg0.anInt3158; local32++) {
			local9[local32 - 1] = (arg0.anInt3158 << 1) - local32;
			local12[arg0.aByteArray36[local32 - 1] & 0xFF] = arg0.anInt3158 - local32;
		}
		@Pc(80) int local80 = arg0.anInt3158 + 1;
		@Pc(83) int local83 = arg0.anInt3158;
		while (local83 > 0) {
			local16[local83 - 1] = local80;
			while (local80 <= arg0.anInt3158 && arg0.aByteArray36[local80 - 1] != arg0.aByteArray36[local83 - 1]) {
				if (arg0.anInt3158 - local83 <= local9[local80 + -1]) {
					local9[local80 - 1] = arg0.anInt3158 - local83;
				}
				local80 = local16[local80 - 1];
			}
			local83--;
			local80--;
		}
		@Pc(152) int local152 = local80;
		local80 = arg0.anInt3158 + 1 - local80;
		@Pc(162) int local162 = 1;
		@Pc(164) int local164 = 0;
		for (@Pc(166) int local166 = 1; local166 <= local80; local166++) {
			local16[local166 - 1] = local164;
			while (local164 >= 1 && arg0.aByteArray36[local164 - 1] != arg0.aByteArray36[local166 - 1]) {
				local164 = local16[local164 - 1];
			}
			local164++;
		}
		@Pc(207) int local207;
		while (local152 < arg0.anInt3158) {
			for (local207 = local162; local207 <= local152; local207++) {
				if (local9[local207 - 1] >= arg0.anInt3158 + local152 - local207) {
					local9[local207 - 1] = local152 + arg0.anInt3158 - local207;
				}
			}
			local162 = local152 + 1;
			local152 += local80 - local16[local80 - 1];
			local80 = local16[local80 - 1];
		}
		@Pc(278) int local278;
		for (local207 = arg1 + arg0.anInt3158 - 1; local207 < this.anInt3158; local207 += Math.max(local12[this.aByteArray36[local207] & 0xFF], local9[local278])) {
			for (local278 = arg0.anInt3158 - 1; local278 >= 0 && this.aByteArray36[local207] == arg0.aByteArray36[local278]; local278--) {
				local207--;
			}
			if (local278 == -1) {
				return local207 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)J")
	private long method2386() {
		@Pc(1) long local1 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt3158; local7++) {
			local1 = (local1 << 5) + (long) (this.aByteArray36[local7] & 0xFF) - local1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZII)Lclient!qe;")
	public Class83 method2387() {
		@Pc(16) Class83 local16 = new Class83();
		local16.anInt3158 = this.anInt3158;
		local16.aByteArray36 = new byte[this.anInt3158];
		for (@Pc(31) int local31 = 0; local31 < this.anInt3158; local31++) {
			@Pc(38) byte local38 = this.aByteArray36[local31];
			if (local38 == 47) {
				local16.aByteArray36[local31] = 32;
			} else {
				local16.aByteArray36[local31] = local38;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!qe;)I")
	public int method2388(@OriginalArg(1) Class83 arg0) {
		return this.method2385(arg0, 0);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method2389(@OriginalArg(0) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray36, 0, this.anInt3158, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray36, 0, this.anInt3158);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
	public void method2390() {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray36, 0, this.anInt3158, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray36, 0, this.anInt3158);
		}
		System.out.println(local9);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)Lclient!qe;")
	public Class83 method2391() {
		@Pc(9) Class83 local9 = new Class83();
		local9.anInt3158 = this.anInt3158;
		local9.aByteArray36 = new byte[this.anInt3158];
		for (@Pc(20) int local20 = 0; local20 < this.anInt3158; local20++) {
			local9.aByteArray36[local20] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!qe;I)I")
	public int method2392(@OriginalArg(0) Class83 arg0) {
		@Pc(17) int local17;
		if (arg0.anInt3158 >= this.anInt3158) {
			local17 = this.anInt3158;
		} else {
			local17 = arg0.anInt3158;
		}
		for (@Pc(32) int local32 = 0; local32 < local17; local32++) {
			if ((this.aByteArray36[local32] & 0xFF) < (arg0.aByteArray36[local32] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray36[local32] & 0xFF) > (arg0.aByteArray36[local32] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt3158 < arg0.anInt3158) {
			return -1;
		} else if (arg0.anInt3158 < this.anInt3158) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLjava/net/URL;)Ljava/net/URL;")
	public URL method2395(@OriginalArg(1) URL arg0) throws MalformedURLException {
		return new URL(arg0, new String(this.aByteArray36, 0, this.anInt3158));
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Lclient!qe;I)Z")
	public boolean method2396(@OriginalArg(0) Class83 arg0) {
		if (arg0.anInt3158 > this.anInt3158) {
			return false;
		}
		@Pc(28) int local28 = this.anInt3158 - arg0.anInt3158;
		for (@Pc(30) int local30 = 0; local30 < arg0.anInt3158; local30++) {
			if (arg0.aByteArray36[local30] != this.aByteArray36[local28 + local30]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)J")
	public long method2397() {
		@Pc(7) long local7 = 0L;
		for (@Pc(14) int local14 = 0; local14 < this.anInt3158 && local14 < 12; local14++) {
			@Pc(21) byte local21 = this.aByteArray36[local14];
			local7 *= 37L;
			if (local21 >= 65 && local21 <= 90) {
				local7 += local21 - 64;
			} else if (local21 >= 97 && local21 <= 122) {
				local7 += local21 + 1 - 97;
			} else if (local21 >= 48 && local21 <= 57) {
				local7 += local21 + 27 - 48;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLclient!qe;)Z")
	public boolean method2398(@OriginalArg(1) Class83 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt3158 == arg0.anInt3158) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt3158; local24++) {
				@Pc(31) byte local31 = this.aByteArray36[local24];
				@Pc(36) byte local36 = arg0.aByteArray36[local24];
				if (local36 >= 65 && local36 <= 90 || local36 >= -64 && local36 <= -34 && local36 != -41) {
					local36 = (byte) (local36 + 32);
				}
				if (local31 >= 65 && local31 <= 90 || local31 >= -64 && local31 <= -34 && local31 != -41) {
					local31 = (byte) (local31 + 32);
				}
				if (local31 != local36) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)I")
	public int method2399() {
		return this.method2412(10);
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)Lclient!qe;")
	public Class83 method2400() {
		@Pc(5) Class83 local5 = new Class83();
		@Pc(7) boolean local7 = true;
		local5.anInt3158 = this.anInt3158;
		local5.aByteArray36 = new byte[this.anInt3158];
		for (@Pc(22) int local22 = 0; local22 < this.anInt3158; local22++) {
			@Pc(29) byte local29 = this.aByteArray36[local22];
			if (local29 == 95) {
				local5.aByteArray36[local22] = 32;
				local7 = true;
			} else if (local29 >= 97 && local29 <= 122 && local7) {
				local7 = false;
				local5.aByteArray36[local22] = (byte) (local29 - 32);
			} else {
				local5.aByteArray36[local22] = local29;
				local7 = false;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)Lclient!qe;")
	public Class83 method2401(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(22) Class83 local22 = new Class83();
		local22.aByteArray36 = new byte[this.anInt3158 + 1];
		local22.anInt3158 = this.anInt3158 + 1;
		Static222.method2224(this.aByteArray36, 0, local22.aByteArray36, 0, this.anInt3158);
		local22.aByteArray36[this.anInt3158] = (byte) arg0;
		return local22;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!qe;B)Z")
	public boolean method2402(@OriginalArg(0) Class83 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt3158 == this.anInt3158) {
			if (!this.aBoolean146 || !arg0.aBoolean146) {
				if (this.anInt3155 == 0) {
					this.anInt3155 = this.method2425();
					if (this.anInt3155 == 0) {
						this.anInt3155 = 1;
					}
				}
				if (arg0.anInt3155 == 0) {
					arg0.anInt3155 = arg0.method2425();
					if (arg0.anInt3155 == 0) {
						arg0.anInt3155 = 1;
					}
				}
				if (this.anInt3155 != arg0.anInt3155) {
					return false;
				}
			}
			for (@Pc(69) int local69 = 0; local69 < this.anInt3158; local69++) {
				if (arg0.aByteArray36[local69] != this.aByteArray36[local69]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)Lclient!qe;")
	public Class83 method2403() {
		@Pc(3) int local3 = 0;
		@Pc(6) int local6 = this.anInt3158;
		while (local3 < this.anInt3158 && (this.aByteArray36[local3] >= 0 && this.aByteArray36[local3] <= 32 || (this.aByteArray36[local3] & 0xFF) == 160)) {
			local3++;
		}
		while (local6 > local3 && (this.aByteArray36[local6 - 1] >= 0 && this.aByteArray36[local6 - 1] <= 32 || (this.aByteArray36[local6 - 1] & 0xFF) == 160)) {
			local6--;
		}
		if (local3 == 0 && this.anInt3158 == local6) {
			return this;
		}
		@Pc(101) Class83 local101 = new Class83();
		local101.anInt3158 = local6 - local3;
		local101.aByteArray36 = new byte[local101.anInt3158];
		for (@Pc(114) int local114 = 0; local114 < local101.anInt3158; local114++) {
			local101.aByteArray36[local114] = this.aByteArray36[local114 + local3];
		}
		return local101;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)[Lclient!qe;")
	public Class83[] method2405(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt3158; local14++) {
			if (arg0 == this.aByteArray36[local14]) {
				local7++;
			}
		}
		@Pc(33) Class83[] local33 = new Class83[local7 + 1];
		if (local7 == 0) {
			local33[0] = this;
			return local33;
		}
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = 0;
		for (@Pc(50) int local50 = 0; local50 < local7; local50++) {
			@Pc(54) int local54;
			for (local54 = 0; this.aByteArray36[local54 + local48] != arg0; local54++) {
			}
			local33[local46++] = this.method2416(local48 + local54, local48);
			local48 += local54 + 1;
		}
		local33[local7] = this.method2416(this.anInt3158, local48);
		return local33;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III[BI)I")
	public int method2406(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2) {
		Static222.method2224(this.aByteArray36, 0, arg1, arg2, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)Z")
	public boolean method2407() {
		return this.method2413();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/applet/Applet;I)V")
	public void method2408(@OriginalArg(0) Applet arg0) throws Throwable {
		@Pc(12) String local12 = new String(this.aByteArray36, 0, this.anInt3158);
		Static223.method2454(arg0, local12);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(BI)Lclient!qe;")
	public Class83 method2409(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean146) {
			this.anInt3155 = 0;
			if (this.aByteArray36.length == this.anInt3158) {
				@Pc(48) int local48;
				for (local48 = 1; local48 <= this.anInt3158; local48 += local48) {
				}
				@Pc(65) byte[] local65 = new byte[local48];
				Static222.method2224(this.aByteArray36, 0, local65, 0, this.anInt3158);
				this.aByteArray36 = local65;
			}
			this.aByteArray36[this.anInt3158++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)Lclient!qe;")
	public Class83 method2410() {
		if (!this.aBoolean146) {
			throw new IllegalArgumentException();
		}
		this.anInt3155 = 0;
		if (this.anInt3158 != this.aByteArray36.length) {
			@Pc(27) byte[] local27 = new byte[this.anInt3158];
			Static222.method2224(this.aByteArray36, 0, local27, 0, this.anInt3158);
			this.aByteArray36 = local27;
		}
		return this;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(BI)I")
	public int method2412(@OriginalArg(1) int arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(29) boolean local29 = false;
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = 0; local33 < this.anInt3158; local33++) {
			@Pc(42) int local42 = this.aByteArray36[local33] & 0xFF;
			if (local33 == 0) {
				if (local42 == 45) {
					local7 = true;
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
				throw new NumberFormatException();
			}
			if (local42 >= arg0) {
				throw new NumberFormatException();
			}
			if (local7) {
				local42 = -local42;
			}
			@Pc(111) int local111 = local42 + local31 * arg0;
			if (local111 / arg0 != local31) {
				throw new NumberFormatException();
			}
			local29 = true;
			local31 = local111;
		}
		if (!local29) {
			throw new NumberFormatException();
		}
		return local31;
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(BI)Z")
	private boolean method2413() {
		@Pc(3) boolean local3 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt3158; local28++) {
			@Pc(37) int local37 = this.aByteArray36[local28] & 0xFF;
			if (local28 == 0) {
				if (local37 == 45) {
					local3 = true;
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
			if (local3) {
				local37 = -local37;
			}
			@Pc(106) int local106 = local26 * 10 + local37;
			if (local106 / 10 != local26) {
				return false;
			}
			local26 = local106;
			local24 = true;
		}
		return local24;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(Lclient!qe;I)Z")
	public boolean method2415(@OriginalArg(0) Class83 arg0) {
		if (arg0.anInt3158 > this.anInt3158) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt3158; local14++) {
			if (this.aByteArray36[local14] != arg0.aByteArray36[local14]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(III)Lclient!qe;")
	public Class83 method2416(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class83 local8 = new Class83();
		local8.anInt3158 = arg0 - arg1;
		local8.aByteArray36 = new byte[arg0 - arg1];
		Static222.method2224(this.aByteArray36, arg1, local8.aByteArray36, 0, local8.anInt3158);
		return local8;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Lclient!qe;B)Lclient!qe;")
	public Class83 method2417(@OriginalArg(0) Class83 arg0) {
		if (!this.aBoolean146) {
			throw new IllegalArgumentException();
		}
		this.anInt3155 = 0;
		if (this.anInt3158 + arg0.anInt3158 > this.aByteArray36.length) {
			@Pc(38) int local38;
			for (local38 = 1; local38 < this.anInt3158 + arg0.anInt3158; local38 += local38) {
			}
			@Pc(55) byte[] local55 = new byte[local38];
			Static222.method2224(this.aByteArray36, 0, local55, 0, this.anInt3158);
			this.aByteArray36 = local55;
		}
		Static222.method2224(arg0.aByteArray36, 0, this.aByteArray36, this.anInt3158, arg0.anInt3158);
		this.anInt3158 += arg0.anInt3158;
		return this;
	}

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)[B")
	public byte[] method2418() {
		@Pc(3) byte[] local3 = new byte[this.anInt3158];
		Static222.method2224(this.aByteArray36, 0, local3, 0, this.anInt3158);
		return local3;
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(B)Lclient!qe;")
	public Class83 method2419() {
		@Pc(7) byte local7 = 2;
		@Pc(11) Class83 local11 = new Class83();
		local11.anInt3158 = this.anInt3158;
		local11.aByteArray36 = new byte[this.anInt3158];
		for (@Pc(27) int local27 = 0; local27 < this.anInt3158; local27++) {
			@Pc(34) byte local34 = this.aByteArray36[local27];
			if (local34 >= 97 && local34 <= 122 || !(local34 < -32 || local34 > -2 || local34 == -9)) {
				if (local7 == 2) {
					local34 = (byte) (local34 - 32);
				}
				local7 = 0;
			} else if (local34 >= 65 && local34 <= 90 || !(local34 < -64 || local34 > -34 || local34 == -41)) {
				if (local7 == 0) {
					local34 = (byte) (local34 + 32);
				}
				local7 = 0;
			} else if (local34 == 46 || local34 == 33 || local34 == 63) {
				local7 = 2;
			} else if (local34 != 32) {
				local7 = 1;
			} else if (local7 != 2) {
				local7 = 1;
			}
			local11.aByteArray36[local27] = local34;
		}
		return local11;
	}

	@OriginalMember(owner = "client!qe", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class83)) {
			throw new IllegalArgumentException();
		}
		return this.method2402((Class83) arg0);
	}

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "(B)Lclient!qe;")
	public Class83 method2420() {
		@Pc(5) Class83 local5 = Static12.method296(this.method2397());
		return local5 == null ? Static148.aClass83_896 : local5;
	}

	@OriginalMember(owner = "client!qe", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method2425();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)I")
	public int method2421(@OriginalArg(0) int arg0) {
		return this.aByteArray36[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(BI)Lclient!qe;")
	public Class83 method2422(@OriginalArg(1) int arg0) {
		return this.method2416(this.anInt3158, arg0);
	}

	@OriginalMember(owner = "client!qe", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/applet/Applet;)Lclient!qe;")
	public Class83 method2424(@OriginalArg(1) Applet arg0) {
		@Pc(17) String local17 = new String(this.aByteArray36, 0, this.anInt3158);
		@Pc(21) String local21 = arg0.getParameter(local17);
		return local21 == null ? null : Static118.method2063(local21);
	}

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "(I)I")
	public int method2425() {
		@Pc(5) int local5 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt3158; local12++) {
			local5 = (this.aByteArray36[local12] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(Lclient!qe;I)Z")
	public boolean method2426(@OriginalArg(0) Class83 arg0) {
		if (arg0.anInt3158 > this.anInt3158) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt3158; local16++) {
			@Pc(26) byte local26 = this.aByteArray36[local16];
			@Pc(31) byte local31 = arg0.aByteArray36[local16];
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
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)Ljava/net/URL;")
	public URL method2427() throws MalformedURLException {
		return new URL(new String(this.aByteArray36, 0, this.anInt3158));
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(Z)I")
	public int method2428() {
		return this.anInt3158;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
	public void method2429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2) {
		@Pc(16) String local16;
		try {
			local16 = new String(this.aByteArray36, 0, this.anInt3158, "ISO-8859-1");
		} catch (@Pc(18) UnsupportedEncodingException local18) {
			local16 = new String(this.aByteArray36, 0, this.anInt3158);
		}
		arg2.drawString(local16, arg1, arg0);
	}

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "(I)Lclient!qe;")
	public Class83 method2430() {
		@Pc(9) Class83 local9 = new Class83();
		local9.anInt3158 = this.anInt3158;
		local9.aByteArray36 = new byte[this.anInt3158];
		for (@Pc(28) int local28 = 0; local28 < this.anInt3158; local28++) {
			@Pc(35) byte local35 = this.aByteArray36[local28];
			if (local35 >= 65 && local35 <= 90 || local35 >= -64 && local35 <= -34 && local35 != -41) {
				local35 = (byte) (local35 + 32);
			}
			local9.aByteArray36[local28] = local35;
		}
		return local9;
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(Z)Lclient!qe;")
	public Class83 method2431() {
		@Pc(11) long local11 = this.method2386();
		@Pc(20) Class local20 = qe.class;
		synchronized (qe.class) {
			@Pc(30) Class2_Sub16 local30;
			if (Static80.aClass63_5 == null) {
				Static80.aClass63_5 = new Class63(4096);
			} else {
				for (local30 = (Class2_Sub16) Static80.aClass63_5.method2110(local11); local30 != null; local30 = (Class2_Sub16) Static80.aClass63_5.method2105()) {
					if (this.method2402(local30.aClass83_709)) {
						return local30.aClass83_709;
					}
				}
			}
			local30 = new Class2_Sub16();
			this.aBoolean146 = false;
			local30.aClass83_709 = this;
			Static80.aClass63_5.method2115(local11, local30);
			return this;
		}
	}
}
