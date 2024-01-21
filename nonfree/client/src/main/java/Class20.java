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

@OriginalClass("client!dc")
public final class Class20 implements Interface4 {

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
	public int anInt712;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
	private int anInt729;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "Z")
	private boolean aBoolean46 = true;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III[BI)I")
	public int method548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		Static220.method51(this.aByteArray10, 0, arg2, arg0, arg1);
		return arg1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)Lclient!dc;")
	public Class20 method549(@OriginalArg(1) int arg0) {
		return this.method559(this.anInt712, arg0);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!dc;I)Z")
	public boolean method551(@OriginalArg(0) Class20 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt712 == this.anInt712) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt712; local18++) {
				@Pc(25) byte local25 = arg0.aByteArray10[local18];
				if (local25 >= 65 && local25 <= 90 || local25 >= -64 && local25 <= -34 && local25 != -41) {
					local25 = (byte) (local25 + 32);
				}
				@Pc(56) byte local56 = this.aByteArray10[local18];
				if (local56 >= 65 && local56 <= 90 || local56 >= -64 && local56 <= -34 && local56 != -41) {
					local56 = (byte) (local56 + 32);
				}
				if (local56 != local25) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method552(@OriginalArg(0) FontMetrics arg0) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray10, 0, this.anInt712, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray10, 0, this.anInt712);
		}
		return arg0.stringWidth(local18);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)I")
	public int method553() {
		return this.method570(10);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/applet/Applet;)V")
	public void method554(@OriginalArg(1) Applet arg0) throws Throwable {
		@Pc(12) String local12 = new String(this.aByteArray10, 0, this.anInt712);
		Static226.method2330(local12, arg0);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)Lclient!dc;")
	public Class20 method556() {
		@Pc(14) Class20 local14 = Static160.method2438(this.method595());
		return local14 == null ? Static193.aClass20_1420 : local14;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)I")
	public int method557() {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt712; local12++) {
			local10 = (this.aByteArray10[local12] & 0xFF) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)[B")
	public byte[] method558() {
		@Pc(7) byte[] local7 = new byte[this.anInt712];
		Static220.method51(this.aByteArray10, 0, local7, 0, this.anInt712);
		return local7;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIZ)Lclient!dc;")
	public Class20 method559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class20 local14 = new Class20();
		local14.anInt712 = arg0 - arg1;
		local14.aByteArray10 = new byte[arg0 - arg1];
		Static220.method51(this.aByteArray10, arg1, local14.aByteArray10, 0, local14.anInt712);
		return local14;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)Lclient!dc;")
	public Class20 method560() {
		@Pc(9) Class20 local9 = new Class20();
		local9.anInt712 = this.anInt712;
		local9.aByteArray10 = new byte[this.anInt712];
		@Pc(25) byte local25 = 2;
		for (@Pc(27) int local27 = 0; local27 < this.anInt712; local27++) {
			@Pc(34) byte local34 = this.aByteArray10[local27];
			if (local34 >= 97 && local34 <= 122 || local34 >= -32 && local34 <= -2 && local34 != -9) {
				if (local25 == 2) {
					local34 = (byte) (local34 - 32);
				}
				local25 = 0;
			} else if (local34 >= 65 && local34 <= 90 || !(local34 < -64 || local34 > -34 || local34 == -41)) {
				if (local25 == 0) {
					local34 = (byte) (local34 + 32);
				}
				local25 = 0;
			} else if (local34 == 46 || local34 == 33 || local34 == 63) {
				local25 = 2;
			} else if (local34 != 32) {
				local25 = 1;
			} else if (local25 != 2) {
				local25 = 1;
			}
			local9.aByteArray10[local27] = local34;
		}
		return local9;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Lclient!dc;I)Z")
	public boolean method561(@OriginalArg(0) Class20 arg0) {
		if (arg0.anInt712 > this.anInt712) {
			return false;
		}
		for (@Pc(26) int local26 = 0; local26 < arg0.anInt712; local26++) {
			@Pc(33) byte local33 = arg0.aByteArray10[local26];
			@Pc(38) byte local38 = this.aByteArray10[local26];
			if (local33 >= 65 && local33 <= 90 || local33 >= -64 && local33 <= -34 && local33 != -41) {
				local33 = (byte) (local33 + 32);
			}
			if (local38 >= 65 && local38 <= 90 || local38 >= -64 && local38 <= -34 && local38 != -41) {
				local38 = (byte) (local38 + 32);
			}
			if (local38 != local33) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLclient!dc;)I")
	public int method562(@OriginalArg(1) Class20 arg0) {
		@Pc(13) int local13;
		if (this.anInt712 <= arg0.anInt712) {
			local13 = this.anInt712;
		} else {
			local13 = arg0.anInt712;
		}
		for (@Pc(33) int local33 = 0; local33 < local13; local33++) {
			if ((this.aByteArray10[local33] & 0xFF) < (arg0.aByteArray10[local33] & 0xFF)) {
				return -1;
			}
			if ((arg0.aByteArray10[local33] & 0xFF) < (this.aByteArray10[local33] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.anInt712 > this.anInt712) {
			return -1;
		} else if (this.anInt712 > arg0.anInt712) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)Lclient!dc;")
	public Class20 method563() {
		@Pc(13) Class20 local13 = new Class20();
		local13.anInt712 = this.anInt712;
		local13.aByteArray10 = new byte[this.anInt712];
		for (@Pc(28) int local28 = 0; local28 < this.anInt712; local28++) {
			@Pc(35) byte local35 = this.aByteArray10[local28];
			if (local35 >= 65 && local35 <= 90 || local35 >= -64 && local35 <= -34 && local35 != -41) {
				local35 = (byte) (local35 + 32);
			}
			local13.aByteArray10[local28] = local35;
		}
		return local13;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)Ljava/net/URL;")
	public URL method564() throws MalformedURLException {
		return new URL(new String(this.aByteArray10, 0, this.anInt712));
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)Lclient!dc;")
	public Class20 method565() {
		@Pc(5) Class20 local5 = new Class20();
		local5.anInt712 = this.anInt712;
		@Pc(15) boolean local15 = true;
		local5.aByteArray10 = new byte[this.anInt712];
		for (@Pc(22) int local22 = 0; local22 < this.anInt712; local22++) {
			@Pc(29) byte local29 = this.aByteArray10[local22];
			if (local29 == 95) {
				local5.aByteArray10[local22] = 32;
				local15 = true;
			} else if (local29 >= 97 && local29 <= 122 && local15) {
				local5.aByteArray10[local22] = (byte) (local29 - 32);
				local15 = false;
			} else {
				local15 = false;
				local5.aByteArray10[local22] = local29;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(B)Lclient!dc;")
	public Class20 method566() {
		@Pc(9) Class20 local9 = new Class20();
		local9.anInt712 = this.anInt712;
		local9.aByteArray10 = new byte[this.anInt712];
		for (@Pc(28) int local28 = 0; local28 < this.anInt712; local28++) {
			local9.aByteArray10[local28] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Lclient!dc;")
	public Class20 method567(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean46) {
			this.anInt729 = 0;
			if (this.aByteArray10.length == this.anInt712) {
				@Pc(41) int local41;
				for (local41 = 1; local41 <= this.anInt712; local41 += local41) {
				}
				@Pc(58) byte[] local58 = new byte[local41];
				Static220.method51(this.aByteArray10, 0, local58, 0, this.anInt712);
				this.aByteArray10 = local58;
			}
			this.aByteArray10[this.anInt712++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!dc;B)Lclient!dc;")
	public Class20 method568(@OriginalArg(0) Class20 arg0) {
		if (!this.aBoolean46) {
			throw new IllegalArgumentException();
		}
		this.anInt729 = 0;
		if (this.aByteArray10.length < this.anInt712 + arg0.anInt712) {
			@Pc(32) int local32;
			for (local32 = 1; local32 < this.anInt712 + arg0.anInt712; local32 += local32) {
			}
			@Pc(48) byte[] local48 = new byte[local32];
			Static220.method51(this.aByteArray10, 0, local48, 0, this.anInt712);
			this.aByteArray10 = local48;
		}
		Static220.method51(arg0.aByteArray10, 0, this.aByteArray10, this.anInt712, arg0.anInt712);
		this.anInt712 += arg0.anInt712;
		return this;
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
	public void method569() {
		@Pc(14) String local14;
		try {
			local14 = new String(this.aByteArray10, 0, this.anInt712, "ISO-8859-1");
		} catch (@Pc(16) UnsupportedEncodingException local16) {
			local14 = new String(this.aByteArray10, 0, this.anInt712);
		}
		System.out.println(local14);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(BI)I")
	public int method570(@OriginalArg(1) int arg0) {
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt712; local28++) {
			@Pc(37) int local37 = this.aByteArray10[local28] & 0xFF;
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
			if (arg0 <= local37) {
				throw new NumberFormatException();
			}
			if (local22) {
				local37 = -local37;
			}
			@Pc(107) int local107 = local37 + local26 * arg0;
			if (local26 != local107 / arg0) {
				throw new NumberFormatException();
			}
			local26 = local107;
			local24 = true;
		}
		if (!local24) {
			throw new NumberFormatException();
		}
		return local26;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!dc;)I")
	public int method572(@OriginalArg(1) int arg0, @OriginalArg(2) Class20 arg1) {
		@Pc(9) int[] local9 = new int[arg1.anInt712];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg1.anInt712];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg1.anInt712;
		}
		for (@Pc(32) int local32 = 1; local32 <= arg1.anInt712; local32++) {
			local9[local32 - 1] = (arg1.anInt712 << 1) - local32;
			local12[arg1.aByteArray10[local32 - 1] & 0xFF] = arg1.anInt712 - local32;
		}
		@Pc(75) int local75 = arg1.anInt712 + 1;
		@Pc(78) int local78 = arg1.anInt712;
		while (local78 > 0) {
			local16[local78 - 1] = local75;
			while (local75 <= arg1.anInt712 && arg1.aByteArray10[local75 - 1] != arg1.aByteArray10[local78 - 1]) {
				if (arg1.anInt712 - local78 <= local9[local75 + -1]) {
					local9[local75 - 1] = arg1.anInt712 - local78;
				}
				local75 = local16[local75 - 1];
			}
			local78--;
			local75--;
		}
		@Pc(144) int local144 = 1;
		@Pc(146) int local146 = local75;
		local75 = arg1.anInt712 + 1 - local75;
		@Pc(156) int local156 = 0;
		for (@Pc(158) int local158 = 1; local158 <= local75; local158++) {
			local16[local158 - 1] = local156;
			while (local156 >= 1 && arg1.aByteArray10[local158 - 1] != arg1.aByteArray10[local156 - 1]) {
				local156 = local16[local156 - 1];
			}
			local156++;
		}
		@Pc(208) int local208;
		while (local146 < arg1.anInt712) {
			for (local208 = local144; local208 <= local146; local208++) {
				if (arg1.anInt712 + local146 - local208 <= local9[local208 + -1]) {
					local9[local208 - 1] = local146 + arg1.anInt712 - local208;
				}
			}
			local144 = local146 + 1;
			local146 = local75 + local146 - local16[local75 - 1];
			local75 = local16[local75 - 1];
		}
		@Pc(287) int local287;
		for (local208 = arg1.anInt712 + arg0 - 1; local208 < this.anInt712; local208 += Math.max(local12[this.aByteArray10[local208] & 0xFF], local9[local287])) {
			for (local287 = arg1.anInt712 - 1; local287 >= 0 && arg1.aByteArray10[local287] == this.aByteArray10[local208]; local287--) {
				local208--;
			}
			if (local287 == -1) {
				return local208 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(Lclient!dc;I)Z")
	public boolean method573(@OriginalArg(0) Class20 arg0) {
		if (this.anInt712 < arg0.anInt712) {
			return false;
		}
		@Pc(19) int local19 = this.anInt712 - arg0.anInt712;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt712; local21++) {
			if (arg0.aByteArray10[local21] != this.aByteArray10[local19 + local21]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)Z")
	private boolean method574() {
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = 0; local33 < this.anInt712; local33++) {
			@Pc(42) int local42 = this.aByteArray10[local33] & 0xFF;
			if (local33 == 0) {
				if (local42 == 45) {
					local29 = true;
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
			if (local29) {
				local42 = -local42;
			}
			@Pc(113) int local113 = local42 + local31 * 10;
			if (local113 / 10 != local31) {
				return false;
			}
			local27 = true;
			local31 = local113;
		}
		return local27;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method575(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray10, 0, this.anInt712, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray10, 0, this.anInt712);
		}
		arg1.drawString(local13, arg2, arg0);
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)Lclient!dc;")
	public Class20 method576(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(22) Class20 local22 = new Class20();
		local22.aByteArray10 = new byte[this.anInt712 + 1];
		local22.anInt712 = this.anInt712 + 1;
		Static220.method51(this.aByteArray10, 0, local22.aByteArray10, 0, this.anInt712);
		local22.aByteArray10[this.anInt712] = (byte) arg0;
		return local22;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(BI)I")
	public int method577(@OriginalArg(1) int arg0) {
		return this.aByteArray10[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(Lclient!dc;I)I")
	public int method578(@OriginalArg(0) Class20 arg0) {
		@Pc(13) int local13;
		if (arg0.anInt712 < this.anInt712) {
			local13 = arg0.anInt712;
		} else {
			local13 = this.anInt712;
		}
		for (@Pc(25) int local25 = 0; local25 < local13; local25++) {
			if (Static98.anIntArray207[this.aByteArray10[local25] & 0xFF] < Static98.anIntArray207[arg0.aByteArray10[local25] & 0xFF]) {
				return -1;
			}
			if (Static98.anIntArray207[arg0.aByteArray10[local25] & 0xFF] < Static98.anIntArray207[this.aByteArray10[local25] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt712 > this.anInt712) {
			return -1;
		} else if (arg0.anInt712 < this.anInt712) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)[Lclient!dc;")
	public Class20[] method579(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt712; local9++) {
			if (this.aByteArray10[local9] == arg0) {
				local7++;
			}
		}
		@Pc(37) Class20[] local37 = new Class20[local7 + 1];
		if (local7 == 0) {
			local37[0] = this;
			return local37;
		}
		@Pc(50) int local50 = 0;
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local7; local54++) {
			@Pc(58) int local58;
			for (local58 = 0; this.aByteArray10[local52 + local58] != arg0; local58++) {
			}
			local37[local50++] = this.method559(local52 + local58, local52);
			local52 += local58 + 1;
		}
		local37[local7] = this.method559(this.anInt712, local52);
		return local37;
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)Lclient!dc;")
	public Class20 method580() {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = this.anInt712;
		while (this.anInt712 > local7 && (this.aByteArray10[local7] >= 0 && this.aByteArray10[local7] <= 32 || (this.aByteArray10[local7] & 0xFF) == 160)) {
			local7++;
		}
		while (local7 < local10 && (this.aByteArray10[local10 - 1] >= 0 && this.aByteArray10[local10 - 1] <= 32 || (this.aByteArray10[local10 - 1] & 0xFF) == 160)) {
			local10--;
		}
		if (local7 == 0 && this.anInt712 == local10) {
			return this;
		}
		@Pc(92) Class20 local92 = new Class20();
		local92.anInt712 = local10 - local7;
		local92.aByteArray10 = new byte[local92.anInt712];
		for (@Pc(105) int local105 = 0; local105 < local92.anInt712; local105++) {
			local92.aByteArray10[local105] = this.aByteArray10[local7 + local105];
		}
		return local92;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(Z)Z")
	public boolean method581() {
		return this.method574();
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)I")
	public int method582() {
		return this.anInt712;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(ILjava/applet/Applet;)Lclient!dc;")
	public Class20 method583(@OriginalArg(1) Applet arg0) {
		@Pc(12) String local12 = new String(this.aByteArray10, 0, this.anInt712);
		@Pc(23) String local23 = arg0.getParameter(local12);
		return local23 == null ? null : Static16.method278(local23);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!dc;)I")
	public int method584(@OriginalArg(1) Class20 arg0) {
		return this.method572(0, arg0);
	}

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)J")
	private long method585() {
		@Pc(11) long local11 = 0L;
		for (@Pc(13) int local13 = 0; local13 < this.anInt712; local13++) {
			local11 = (long) (this.aByteArray10[local13] & 0xFF) + (local11 << 5) - local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "(I)Lclient!dc;")
	public Class20 method586() {
		@Pc(3) long local3 = this.method585();
		@Pc(16) Class local16 = dc.class;
		synchronized (dc.class) {
			@Pc(32) Class5_Sub26 local32;
			if (Static75.aClass75_8 == null) {
				Static75.aClass75_8 = new Class75(4096);
			} else {
				for (local32 = (Class5_Sub26) Static75.aClass75_8.method2072(local3); local32 != null; local32 = (Class5_Sub26) Static75.aClass75_8.method2070()) {
					if (this.method594(local32.aClass20_1432)) {
						return local32.aClass20_1432;
					}
				}
			}
			local32 = new Class5_Sub26();
			local32.aClass20_1432 = this;
			this.aBoolean46 = false;
			Static75.aClass75_8.method2069(local32, local3);
			return this;
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Lclient!dc;B)Z")
	public boolean method587(@OriginalArg(0) Class20 arg0) {
		if (arg0.anInt712 > this.anInt712) {
			return false;
		}
		for (@Pc(23) int local23 = 0; local23 < arg0.anInt712; local23++) {
			if (this.aByteArray10[local23] != arg0.aByteArray10[local23]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)Lclient!dc;")
	public Class20 method588() {
		@Pc(15) Class20 local15 = new Class20();
		local15.anInt712 = this.anInt712;
		local15.aByteArray10 = new byte[this.anInt712];
		for (@Pc(26) int local26 = 0; local26 < this.anInt712; local26++) {
			@Pc(33) byte local33 = this.aByteArray10[local26];
			if (local33 == 47) {
				local15.aByteArray10[local26] = 32;
			} else {
				local15.aByteArray10[local26] = local33;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!dc", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method557();
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(B)Lclient!dc;")
	public Class20 method589() {
		if (!this.aBoolean46) {
			throw new IllegalArgumentException();
		}
		this.anInt729 = 0;
		if (this.anInt712 != this.aByteArray10.length) {
			@Pc(23) byte[] local23 = new byte[this.anInt712];
			Static220.method51(this.aByteArray10, 0, local23, 0, this.anInt712);
			this.aByteArray10 = local23;
		}
		return this;
	}

	@OriginalMember(owner = "client!dc", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class20)) {
			throw new IllegalArgumentException();
		}
		return this.method594((Class20) arg0);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BII)I")
	public int method590(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte local8 = (byte) arg1;
		for (@Pc(10) int local10 = arg0; local10 < this.anInt712; local10++) {
			if (this.aByteArray10[local10] == local8) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/net/URL;I)Ljava/net/URL;")
	public URL method592(@OriginalArg(0) URL arg0) throws MalformedURLException {
		return new URL(arg0, new String(this.aByteArray10, 0, this.anInt712));
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(Lclient!dc;B)Z")
	public boolean method594(@OriginalArg(0) Class20 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt712 == arg0.anInt712) {
			if (!this.aBoolean46 || !arg0.aBoolean46) {
				if (this.anInt729 == 0) {
					this.anInt729 = this.method557();
					if (this.anInt729 == 0) {
						this.anInt729 = 1;
					}
				}
				if (arg0.anInt729 == 0) {
					arg0.anInt729 = arg0.method557();
					if (arg0.anInt729 == 0) {
						arg0.anInt729 = 1;
					}
				}
				if (arg0.anInt729 != this.anInt729) {
					return false;
				}
			}
			for (@Pc(83) int local83 = 0; local83 < this.anInt712; local83++) {
				if (arg0.aByteArray10[local83] != this.aByteArray10[local83]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "(I)J")
	public long method595() {
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < this.anInt712 && local17 < 12; local17++) {
			local15 *= 37L;
			@Pc(28) byte local28 = this.aByteArray10[local17];
			if (local28 >= 65 && local28 <= 90) {
				local15 += local28 + 1 - 65;
			} else if (local28 >= 97 && local28 <= 122) {
				local15 += local28 + 1 - 97;
			} else if (local28 >= 48 && local28 <= 57) {
				local15 += local28 - 21;
			}
		}
		while (local15 % 37L == 0L && local15 != 0L) {
			local15 /= 37L;
		}
		return local15;
	}

	@OriginalMember(owner = "client!dc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}
}
