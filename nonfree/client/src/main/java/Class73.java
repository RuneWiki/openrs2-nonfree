import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class73 implements Interface2 {

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
	public int anInt3356;

	@OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
	private int anInt3359;

	@OriginalMember(owner = "client!sd", name = "Y", descriptor = "Z")
	private boolean aBoolean222 = true;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!sd;I)I")
	public int method2408(@OriginalArg(0) Class73 arg0) {
		@Pc(14) int local14;
		if (this.anInt3356 > arg0.anInt3356) {
			local14 = arg0.anInt3356;
		} else {
			local14 = this.anInt3356;
		}
		for (@Pc(25) int local25 = 0; local25 < local14; local25++) {
			if ((arg0.aByteArray36[local25] & 0xFF) > (this.aByteArray36[local25] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray36[local25] & 0xFF) > (arg0.aByteArray36[local25] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt3356 < arg0.anInt3356) {
			return -1;
		} else if (arg0.anInt3356 < this.anInt3356) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)Lclient!sd;")
	public Class73 method2409() {
		if (!this.aBoolean222) {
			throw new IllegalArgumentException();
		}
		this.anInt3359 = 0;
		if (this.aByteArray36.length != this.anInt3356) {
			@Pc(31) byte[] local31 = new byte[this.anInt3356];
			Static184.method1123(this.aByteArray36, 0, local31, 0, this.anInt3356);
			this.aByteArray36 = local31;
		}
		return this;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILclient!sd;)I")
	public int method2410(@OriginalArg(1) int arg0, @OriginalArg(2) Class73 arg1) {
		@Pc(9) int[] local9 = new int[arg1.anInt3356];
		@Pc(13) int[] local13 = new int[arg1.anInt3356];
		@Pc(16) int[] local16 = new int[256];
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			local16[local18] = arg1.anInt3356;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg1.anInt3356; local36++) {
			local9[local36 - 1] = (arg1.anInt3356 << 1) - local36;
			local16[arg1.aByteArray36[local36 - 1] & 0xFF] = arg1.anInt3356 - local36;
		}
		@Pc(75) int local75 = arg1.anInt3356 + 1;
		for (@Pc(78) int local78 = arg1.anInt3356; local78 > 0; local78--) {
			local13[local78 - 1] = local75;
			while (local75 <= arg1.anInt3356 && arg1.aByteArray36[local78 - 1] != arg1.aByteArray36[local75 - 1]) {
				if (arg1.anInt3356 - local78 <= local9[local75 - 1]) {
					local9[local75 - 1] = arg1.anInt3356 - local78;
				}
				local75 = local13[local75 - 1];
			}
			local75--;
		}
		@Pc(149) int local149 = local75;
		local75 = arg1.anInt3356 + 1 - local75;
		@Pc(159) int local159 = 1;
		@Pc(167) int local167 = 0;
		for (@Pc(169) int local169 = 1; local169 <= local75; local169++) {
			local13[local169 - 1] = local167;
			while (local167 >= 1 && arg1.aByteArray36[local167 - 1] != arg1.aByteArray36[local169 - 1]) {
				local167 = local13[local167 - 1];
			}
			local167++;
		}
		@Pc(216) int local216;
		while (local149 < arg1.anInt3356) {
			for (local216 = local159; local216 <= local149; local216++) {
				if (local9[local216 - 1] >= arg1.anInt3356 + local149 - local216) {
					local9[local216 - 1] = arg1.anInt3356 + local149 - local216;
				}
			}
			local159 = local149 + 1;
			local149 = local149 + local75 - local13[local75 + -1];
			local75 = local13[local75 - 1];
		}
		@Pc(287) int local287;
		for (local216 = arg1.anInt3356 + arg0 - 1; local216 < this.anInt3356; local216 += Math.max(local16[this.aByteArray36[local216] & 0xFF], local9[local287])) {
			for (local287 = arg1.anInt3356 - 1; local287 >= 0 && this.aByteArray36[local216] == arg1.aByteArray36[local287]; local287--) {
				local216--;
			}
			if (local287 == -1) {
				return local216 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)I")
	public int method2411() {
		@Pc(5) int local5 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt3356; local14++) {
			local5 = (this.aByteArray36[local14] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)Lclient!sd;")
	public Class73 method2413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class73 local7 = new Class73();
		local7.anInt3356 = arg0 - arg1;
		local7.aByteArray36 = new byte[arg0 - arg1];
		Static184.method1123(this.aByteArray36, arg1, local7.aByteArray36, 0, local7.anInt3356);
		return local7;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(III)I")
	public int method2415(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte local16 = (byte) arg1;
		for (@Pc(18) int local18 = arg0; local18 < this.anInt3356; local18++) {
			if (this.aByteArray36[local18] == local16) {
				return local18;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)[B")
	public byte[] method2416() {
		@Pc(7) byte[] local7 = new byte[this.anInt3356];
		Static184.method1123(this.aByteArray36, 0, local7, 0, this.anInt3356);
		return local7;
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)Z")
	public boolean method2417() {
		return this.method2440();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)Lclient!sd;")
	public Class73 method2419() {
		@Pc(7) Class73 local7 = new Class73();
		local7.anInt3356 = this.anInt3356;
		local7.aByteArray36 = new byte[this.anInt3356];
		for (@Pc(18) int local18 = 0; local18 < this.anInt3356; local18++) {
			@Pc(28) byte local28 = this.aByteArray36[local18];
			if (local28 >= 65 && local28 <= 90 || local28 >= -64 && local28 <= -34 && local28 != -41) {
				local28 = (byte) (local28 + 32);
			}
			local7.aByteArray36[local18] = local28;
		}
		return local7;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)Lclient!sd;")
	public Class73 method2420(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean222) {
			this.anInt3359 = 0;
			if (this.aByteArray36.length == this.anInt3356) {
				@Pc(47) int local47;
				for (local47 = 1; local47 <= this.anInt3356; local47 += local47) {
				}
				@Pc(64) byte[] local64 = new byte[local47];
				Static184.method1123(this.aByteArray36, 0, local64, 0, this.anInt3356);
				this.aByteArray36 = local64;
			}
			this.aByteArray36[this.anInt3356++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)J")
	private long method2422() {
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < this.anInt3356; local12++) {
			local10 = (long) (this.aByteArray36[local12] & 0xFF) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)Lclient!sd;")
	public Class73 method2423() {
		@Pc(7) long local7 = this.method2422();
		@Pc(16) Class local16 = sd.class;
		synchronized (sd.class) {
			@Pc(40) Class3_Sub24 local40;
			if (Static77.aClass16_7 == null) {
				Static77.aClass16_7 = new Class16(4096);
			} else {
				for (local40 = (Class3_Sub24) Static77.aClass16_7.method554(local7); local40 != null; local40 = (Class3_Sub24) Static77.aClass16_7.method555()) {
					if (this.method2430(local40.aClass73_1942)) {
						return local40.aClass73_1942;
					}
				}
			}
			local40 = new Class3_Sub24();
			local40.aClass73_1942 = this;
			this.aBoolean222 = false;
			Static77.aClass16_7.method546(local40, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!sd;)I")
	public int method2424(@OriginalArg(1) Class73 arg0) {
		@Pc(22) int local22;
		if (this.anInt3356 > arg0.anInt3356) {
			local22 = arg0.anInt3356;
		} else {
			local22 = this.anInt3356;
		}
		for (@Pc(29) int local29 = 0; local29 < local22; local29++) {
			if (Static92.anIntArray217[arg0.aByteArray36[local29] & 0xFF] > Static92.anIntArray217[this.aByteArray36[local29] & 0xFF]) {
				return -1;
			}
			if (Static92.anIntArray217[arg0.aByteArray36[local29] & 0xFF] < Static92.anIntArray217[this.aByteArray36[local29] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt3356 > this.anInt3356) {
			return -1;
		} else if (arg0.anInt3356 < this.anInt3356) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)J")
	public long method2425() {
		@Pc(12) long local12 = 0L;
		for (@Pc(14) int local14 = 0; local14 < this.anInt3356 && local14 < 12; local14++) {
			local12 *= 37L;
			@Pc(25) byte local25 = this.aByteArray36[local14];
			if (local25 >= 65 && local25 <= 90) {
				local12 += local25 + 1 - 65;
			} else if (local25 >= 97 && local25 <= 122) {
				local12 += local25 - 96;
			} else if (local25 >= 48 && local25 <= 57) {
				local12 += local25 + 27 - 48;
			}
		}
		while (local12 % 37L == 0L && local12 != 0L) {
			local12 /= 37L;
		}
		return local12;
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)Lclient!sd;")
	public Class73 method2428() {
		@Pc(14) Class73 local14 = new Class73();
		local14.anInt3356 = this.anInt3356;
		local14.aByteArray36 = new byte[this.anInt3356];
		for (@Pc(25) int local25 = 0; local25 < this.anInt3356; local25++) {
			local14.aByteArray36[local25] = 42;
		}
		return local14;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(ILclient!sd;)I")
	public int method2429(@OriginalArg(1) Class73 arg0) {
		return this.method2410(0, arg0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!sd;B)Z")
	public boolean method2430(@OriginalArg(0) Class73 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt3356 == this.anInt3356) {
			if (!this.aBoolean222 || !arg0.aBoolean222) {
				if (this.anInt3359 == 0) {
					this.anInt3359 = this.method2411();
					if (this.anInt3359 == 0) {
						this.anInt3359 = 1;
					}
				}
				if (arg0.anInt3359 == 0) {
					arg0.anInt3359 = arg0.method2411();
					if (arg0.anInt3359 == 0) {
						arg0.anInt3359 = 1;
					}
				}
				if (arg0.anInt3359 != this.anInt3359) {
					return false;
				}
			}
			for (@Pc(71) int local71 = 0; local71 < this.anInt3356; local71++) {
				if (arg0.aByteArray36[local71] != this.aByteArray36[local71]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(B)I")
	public int method2431() {
		return this.method2433(10);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)Lclient!sd;")
	public Class73 method2432(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(22) Class73 local22 = new Class73();
		local22.aByteArray36 = new byte[this.anInt3356 + 1];
		local22.anInt3356 = this.anInt3356 + 1;
		Static184.method1123(this.aByteArray36, 0, local22.aByteArray36, 0, this.anInt3356);
		local22.aByteArray36[this.anInt3356] = (byte) arg0;
		return local22;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IB)I")
	public int method2433(@OriginalArg(0) int arg0) {
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt3356; local29++) {
			@Pc(38) int local38 = this.aByteArray36[local29] & 0xFF;
			if (local29 == 0) {
				if (local38 == 45) {
					local19 = true;
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
			if (local19) {
				local38 = -local38;
			}
			@Pc(114) int local114 = arg0 * local21 + local38;
			if (local21 != local114 / arg0) {
				throw new NumberFormatException();
			}
			local21 = local114;
			local17 = true;
		}
		if (!local17) {
			throw new NumberFormatException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(ILclient!sd;)Z")
	public boolean method2434(@OriginalArg(1) Class73 arg0) {
		if (this.anInt3356 < arg0.anInt3356) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < arg0.anInt3356; local18++) {
			if (arg0.aByteArray36[local18] != this.aByteArray36[local18]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)I")
	public int method2435() {
		return this.anInt3356;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([BIIII)I")
	public int method2436(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static184.method1123(this.aByteArray36, 0, arg0, arg2, arg1);
		return arg1;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(Z)Lclient!sd;")
	public Class73 method2437() {
		@Pc(1) byte local1 = 2;
		@Pc(9) Class73 local9 = new Class73();
		local9.anInt3356 = this.anInt3356;
		local9.aByteArray36 = new byte[this.anInt3356];
		for (@Pc(25) int local25 = 0; local25 < this.anInt3356; local25++) {
			@Pc(31) byte local31 = this.aByteArray36[local25];
			if (local31 >= 97 && local31 <= 122 || local31 >= -32 && local31 <= -2 && local31 != -9) {
				if (local1 == 2) {
					local31 = (byte) (local31 - 32);
				}
				local1 = 0;
			} else if (local31 >= 65 && local31 <= 90 || !(local31 < -64 || local31 > -34 || local31 == -41)) {
				if (local1 == 0) {
					local31 = (byte) (local31 + 32);
				}
				local1 = 0;
			} else if (local31 == 46 || local31 == 33 || local31 == 63) {
				local1 = 2;
			} else if (local31 != 32) {
				local1 = 1;
			} else if (local1 != 2) {
				local1 = 1;
			}
			local9.aByteArray36[local25] = local31;
		}
		return local9;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLclient!sd;)Z")
	public boolean method2438(@OriginalArg(1) Class73 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt3356 == arg0.anInt3356) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt3356; local18++) {
				@Pc(30) byte local30 = this.aByteArray36[local18];
				if (local30 >= 65 && local30 <= 90 || local30 >= -64 && local30 <= -34 && local30 != -41) {
					local30 = (byte) (local30 + 32);
				}
				@Pc(61) byte local61 = arg0.aByteArray36[local18];
				if (local61 >= 65 && local61 <= 90 || local61 >= -64 && local61 <= -34 && local61 != -41) {
					local61 = (byte) (local61 + 32);
				}
				if (local61 != local30) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
	public int method2439(@OriginalArg(1) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray36, 0, this.anInt3356, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray36, 0, this.anInt3356);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Z")
	private boolean method2440() {
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt3356; local28++) {
			@Pc(37) int local37 = this.aByteArray36[local28] & 0xFF;
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
				return false;
			}
			if (local37 >= 10) {
				return false;
			}
			if (local22) {
				local37 = -local37;
			}
			@Pc(100) int local100 = local26 * 10 + local37;
			if (local100 / 10 != local26) {
				return false;
			}
			local24 = true;
			local26 = local100;
		}
		return local24;
	}

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "(I)Ljava/net/URL;")
	public URL method2441() throws MalformedURLException {
		return new URL(new String(this.aByteArray36, 0, this.anInt3356));
	}

	@OriginalMember(owner = "client!sd", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class73)) {
			throw new IllegalArgumentException();
		}
		return this.method2430((Class73) arg0);
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(Z)Lclient!sd;")
	public Class73 method2442() {
		@Pc(3) int local3;
		for (local3 = 0; local3 < this.anInt3356 && (this.aByteArray36[local3] >= 0 && this.aByteArray36[local3] <= 32 || (this.aByteArray36[local3] & 0xFF) == 160); local3++) {
		}
		@Pc(38) int local38;
		for (local38 = this.anInt3356; local38 > local3 && (this.aByteArray36[local38 - 1] >= 0 && this.aByteArray36[local38 - 1] <= 32 || (this.aByteArray36[local38 - 1] & 0xFF) == 160); local38--) {
		}
		if (local3 == 0 && this.anInt3356 == local38) {
			return this;
		}
		@Pc(88) Class73 local88 = new Class73();
		local88.anInt3356 = local38 - local3;
		local88.aByteArray36 = new byte[local88.anInt3356];
		for (@Pc(101) int local101 = 0; local101 < local88.anInt3356; local101++) {
			local88.aByteArray36[local101] = this.aByteArray36[local3 + local101];
		}
		return local88;
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(ILclient!sd;)Lclient!sd;")
	public Class73 method2443(@OriginalArg(1) Class73 arg0) {
		if (!this.aBoolean222) {
			throw new IllegalArgumentException();
		}
		this.anInt3359 = 0;
		if (this.anInt3356 + arg0.anInt3356 > this.aByteArray36.length) {
			@Pc(39) int local39;
			for (local39 = 1; local39 < this.anInt3356 + arg0.anInt3356; local39 += local39) {
			}
			@Pc(60) byte[] local60 = new byte[local39];
			Static184.method1123(this.aByteArray36, 0, local60, 0, this.anInt3356);
			this.aByteArray36 = local60;
		}
		Static184.method1123(arg0.aByteArray36, 0, this.aByteArray36, this.anInt3356, arg0.anInt3356);
		this.anInt3356 += arg0.anInt3356;
		return this;
	}

	@OriginalMember(owner = "client!sd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)I")
	public int method2444(@OriginalArg(1) int arg0) {
		return this.aByteArray36[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(Lclient!sd;I)Z")
	public boolean method2445(@OriginalArg(0) Class73 arg0) {
		if (this.anInt3356 < arg0.anInt3356) {
			return false;
		}
		@Pc(19) int local19 = this.anInt3356 - arg0.anInt3356;
		for (@Pc(27) int local27 = 0; local27 < arg0.anInt3356; local27++) {
			if (arg0.aByteArray36[local27] != this.aByteArray36[local19 + local27]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public void method2446(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray36, 0, this.anInt3356, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray36, 0, this.anInt3356);
		}
		arg2.drawString(local13, arg1, arg0);
	}

	@OriginalMember(owner = "client!sd", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method2411();
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(IB)Lclient!sd;")
	public Class73 method2447(@OriginalArg(0) int arg0) {
		return this.method2413(this.anInt3356, arg0);
	}

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "(I)Lclient!sd;")
	public Class73 method2451() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class73 local11 = new Class73();
		local11.anInt3356 = this.anInt3356;
		local11.aByteArray36 = new byte[this.anInt3356];
		for (@Pc(29) int local29 = 0; local29 < this.anInt3356; local29++) {
			@Pc(36) byte local36 = this.aByteArray36[local29];
			if (local36 == 95) {
				local11.aByteArray36[local29] = 32;
				local7 = true;
			} else if (local36 >= 97 && local36 <= 122 && local7) {
				local7 = false;
				local11.aByteArray36[local29] = (byte) (local36 - 32);
			} else {
				local11.aByteArray36[local29] = local36;
				local7 = false;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "(I)Lclient!sd;")
	public Class73 method2452() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class73 local11 = new Class73();
		local11.aByteArray36 = new byte[12];
		local11.anInt3356 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.anInt3356; local20++) {
			if (this.aByteArray36[local20] >= 65 && this.aByteArray36[local20] <= 90) {
				local11.aByteArray36[local7++] = (byte) (this.aByteArray36[local20] + 97 - 65);
				local11.anInt3356 = local7;
			} else if (this.aByteArray36[local20] >= 97 && this.aByteArray36[local20] <= 122 || this.aByteArray36[local20] >= 48 && this.aByteArray36[local20] <= 57) {
				local11.aByteArray36[local7++] = this.aByteArray36[local20];
				local11.anInt3356 = local7;
			} else if (local7 > 0) {
				local11.aByteArray36[local7++] = 95;
			}
			if (local7 == 12) {
				break;
			}
		}
		return local11;
	}
}
