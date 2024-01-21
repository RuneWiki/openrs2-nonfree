import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class42 implements Interface2 {

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
	public int anInt1468;

	@OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
	private int anInt1495;

	@OriginalMember(owner = "client!mc", name = "ab", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!mc", name = "U", descriptor = "Z")
	private boolean aBoolean88 = true;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIB)I")
	private int method1026() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt1468; local15++) {
			if (this.aByteArray17[local15] == 32) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)I")
	public int method1027() {
		return this.anInt1468;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILclient!mc;)Lclient!mc;")
	public Class42 method1028(@OriginalArg(0) int arg0, @OriginalArg(2) Class42 arg1) {
		if (!this.aBoolean88) {
			throw new IllegalArgumentException();
		} else if (arg0 > this.anInt1468) {
			throw new IllegalArgumentException();
		} else {
			this.anInt1495 = 0;
			if (arg0 + arg1.anInt1468 > this.aByteArray17.length) {
				@Pc(37) int local37;
				for (local37 = 1; local37 < arg1.anInt1468 + arg0; local37 += local37) {
				}
				@Pc(52) byte[] local52 = new byte[local37];
				Static114.method777(this.aByteArray17, 0, local52, 0, this.anInt1468);
				this.aByteArray17 = local52;
			}
			Static114.method777(arg1.aByteArray17, 0, this.aByteArray17, arg0, arg1.anInt1468);
			if (this.anInt1468 < arg1.anInt1468 + arg0) {
				this.anInt1468 = arg1.anInt1468 + arg0;
			}
			return this;
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Lclient!mc;")
	public Class42 method1029() {
		@Pc(7) long local7 = this.method1048();
		@Pc(16) Class local16 = mc.class;
		synchronized (mc.class) {
			@Pc(34) Class1_Sub2 local34;
			if (Static8.aClass41_1 == null) {
				Static8.aClass41_1 = new Class41(4096);
			} else {
				for (local34 = (Class1_Sub2) Static8.aClass41_1.method1020(local7); local34 != null; local34 = (Class1_Sub2) Static8.aClass41_1.method1017()) {
					if (this.method1041(local34.aClass42_80)) {
						return local34.aClass42_80;
					}
				}
			}
			local34 = new Class1_Sub2();
			local34.aClass42_80 = this;
			this.aBoolean88 = false;
			Static8.aClass41_1.method1019(local7, local34);
			return this;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)I")
	public int method1030() {
		return this.method1026();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)Lclient!mc;")
	public Class42 method1031() {
		@Pc(7) Class42 local7 = new Class42();
		@Pc(9) boolean local9 = true;
		local7.anInt1468 = this.anInt1468;
		local7.aByteArray17 = new byte[this.anInt1468];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1468; local25++) {
			@Pc(31) byte local31 = this.aByteArray17[local25];
			if (local31 >= 97 && local31 <= 122 || local31 >= -32 && local31 <= -2 && local31 != -9) {
				if (local9) {
					local31 = (byte) (local31 - 32);
				}
				local9 = false;
			} else if (local31 >= 65 && local31 <= 90 || local31 >= -64 && local31 <= -34 && local31 != -41) {
				if (!local9) {
					local31 = (byte) (local31 + 32);
				}
				local9 = false;
			}
			if (local31 == 46 || local31 == 33 || local31 == 63) {
				local9 = true;
			}
			local7.aByteArray17[local25] = local31;
		}
		return local7;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!mc;B)Z")
	public boolean method1032(@OriginalArg(0) Class42 arg0) {
		if (arg0.anInt1468 > this.anInt1468) {
			return false;
		}
		@Pc(19) int local19 = this.anInt1468 - arg0.anInt1468;
		for (@Pc(26) int local26 = 0; local26 < arg0.anInt1468; local26++) {
			if (this.aByteArray17[local26 + local19] != arg0.aByteArray17[local26]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Z")
	private boolean method1034() {
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt1468; local29++) {
			@Pc(37) int local37 = this.aByteArray17[local29] & 0xFF;
			if (local29 == 0) {
				if (local37 == 45) {
					local21 = true;
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
			if (local21) {
				local37 = -local37;
			}
			@Pc(100) int local100 = local37 + local27 * 10;
			if (local100 / 10 != local27) {
				return false;
			}
			local27 = local100;
			local19 = true;
		}
		return local19;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)Lclient!mc;")
	public Class42 method1036() {
		@Pc(7) Class42 local7 = new Class42();
		local7.anInt1468 = this.anInt1468;
		local7.aByteArray17 = new byte[this.anInt1468];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1468; local25++) {
			@Pc(31) byte local31 = this.aByteArray17[local25];
			if (local31 >= 65 && local31 <= 90 || local31 >= -64 && local31 <= -34 && local31 != -41) {
				local31 = (byte) (local31 + 32);
			}
			local7.aByteArray17[local25] = local31;
		}
		return local7;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)Lclient!mc;")
	public Class42 method1037() {
		@Pc(3) Class42 local3 = new Class42();
		local3.anInt1468 = this.anInt1468;
		local3.aByteArray17 = new byte[this.anInt1468];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1468; local18++) {
			local3.aByteArray17[local18] = 42;
		}
		return local3;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)Lclient!mc;")
	public Class42 method1038() {
		@Pc(3) Class42 local3 = new Class42();
		local3.anInt1468 = 0;
		local3.aByteArray17 = new byte[12];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt1468; local18++) {
			if (this.aByteArray17[local18] >= 65 && this.aByteArray17[local18] <= 90) {
				local3.aByteArray17[local16++] = (byte) (this.aByteArray17[local18] + 97 - 65);
				local3.anInt1468 = local16;
			} else if (this.aByteArray17[local18] >= 97 && this.aByteArray17[local18] <= 122 || this.aByteArray17[local18] >= 48 && this.aByteArray17[local18] <= 57) {
				local3.aByteArray17[local16++] = this.aByteArray17[local18];
				local3.anInt1468 = local16;
			} else if (local16 > 0) {
				local3.aByteArray17[local16++] = 95;
			}
			if (local16 == 12) {
				break;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)Z")
	public boolean method1039() {
		return this.method1034();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!mc;I)Z")
	public boolean method1040(@OriginalArg(0) Class42 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt1468 == this.anInt1468) {
			for (@Pc(21) int local21 = 0; local21 < this.anInt1468; local21++) {
				@Pc(27) byte local27 = this.aByteArray17[local21];
				if (local27 >= 65 && local27 <= 90 || local27 >= -64 && local27 <= -34 && local27 != -41) {
					local27 = (byte) (local27 + 32);
				}
				@Pc(58) byte local58 = arg0.aByteArray17[local21];
				if (local58 >= 65 && local58 <= 90 || local58 >= -64 && local58 <= -34 && local58 != -41) {
					local58 = (byte) (local58 + 32);
				}
				if (local27 != local58) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(Lclient!mc;I)Z")
	public boolean method1041(@OriginalArg(0) Class42 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1468 == arg0.anInt1468) {
			if (!this.aBoolean88 || !arg0.aBoolean88) {
				if (this.anInt1495 == 0) {
					this.anInt1495 = this.method1047();
					if (this.anInt1495 == 0) {
						this.anInt1495 = 1;
					}
				}
				if (arg0.anInt1495 == 0) {
					arg0.anInt1495 = arg0.method1047();
					if (arg0.anInt1495 == 0) {
						arg0.anInt1495 = 1;
					}
				}
				if (this.anInt1495 != arg0.anInt1495) {
					return false;
				}
			}
			for (@Pc(73) int local73 = 0; local73 < this.anInt1468; local73++) {
				if (arg0.aByteArray17[local73] != this.aByteArray17[local73]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)[B")
	public byte[] method1042() {
		@Pc(12) byte[] local12 = new byte[this.anInt1468];
		Static114.method777(this.aByteArray17, 0, local12, 0, this.anInt1468);
		return local12;
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)Lclient!mc;")
	public Class42 method1043() {
		@Pc(6) int local6 = this.anInt1468;
		@Pc(8) int local8;
		for (local8 = 0; local8 < this.anInt1468 && this.aByteArray17[local8] >= 0 && (this.aByteArray17[local8] <= 32 || this.aByteArray17[local8] == 160); local8++) {
		}
		while (local8 < local6 && this.aByteArray17[local6 - 1] >= 0 && (this.aByteArray17[local6 - 1] <= 32 || this.aByteArray17[local6 - 1] == 160)) {
			local6--;
		}
		if (local8 == 0 && this.anInt1468 == local6) {
			return this;
		}
		@Pc(91) Class42 local91 = new Class42();
		local91.anInt1468 = local6 - local8;
		local91.aByteArray17 = new byte[local91.anInt1468];
		for (@Pc(103) int local103 = 0; local103 < local91.anInt1468; local103++) {
			local91.aByteArray17[local103] = this.aByteArray17[local8 + local103];
		}
		return local91;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!mc;IZ)I")
	private int method1045(@OriginalArg(0) Class42 arg0) {
		@Pc(5) int[] local5 = new int[arg0.anInt1468];
		@Pc(17) int[] local17 = new int[256];
		@Pc(21) int[] local21 = new int[arg0.anInt1468];
		for (@Pc(23) int local23 = 0; local23 < local17.length; local23++) {
			local17[local23] = arg0.anInt1468;
		}
		for (@Pc(37) int local37 = 1; local37 <= arg0.anInt1468; local37++) {
			local5[local37 - 1] = (arg0.anInt1468 << 1) - local37;
			local17[arg0.aByteArray17[local37 - 1] & 0xFF] = arg0.anInt1468 - local37;
		}
		@Pc(76) int local76 = arg0.anInt1468 + 1;
		@Pc(79) int local79 = arg0.anInt1468;
		while (local79 > 0) {
			local21[local79 - 1] = local76;
			while (arg0.anInt1468 >= local76 && arg0.aByteArray17[local76 - 1] != arg0.aByteArray17[local79 - 1]) {
				if (arg0.anInt1468 - local79 <= local5[local76 - 1]) {
					local5[local76 - 1] = arg0.anInt1468 - local79;
				}
				local76 = local21[local76 - 1];
			}
			local79--;
			local76--;
		}
		@Pc(150) int local150 = local76;
		local76 = arg0.anInt1468 + 1 - local76;
		@Pc(159) int local159 = 1;
		@Pc(161) int local161 = 0;
		@Pc(163) int local163 = 1;
		while (local163 <= local76) {
			local21[local163 - 1] = local161;
			while (local161 >= 1 && arg0.aByteArray17[local163 - 1] != arg0.aByteArray17[local161 - 1]) {
				local161 = local21[local161 - 1];
			}
			local163++;
			local161++;
		}
		@Pc(212) int local212;
		while (local150 < arg0.anInt1468) {
			for (local212 = local159; local212 <= local150; local212++) {
				if (local5[local212 - 1] >= local150 + arg0.anInt1468 - local212) {
					local5[local212 - 1] = local150 + arg0.anInt1468 - local212;
				}
			}
			local159 = local150 + 1;
			local150 = local76 + local150 - local21[local76 + -1];
			local76 = local21[local76 - 1];
		}
		@Pc(286) int local286;
		for (local212 = arg0.anInt1468 - 1; local212 < this.anInt1468; local212 += Math.max(local17[this.aByteArray17[local212] & 0xFF], local5[local286])) {
			for (local286 = arg0.anInt1468 - 1; local286 >= 0 && arg0.aByteArray17[local286] == this.aByteArray17[local212]; local286--) {
				local212--;
			}
			if (local286 == -1) {
				return local212 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)I")
	public int method1046() {
		return this.method1054();
	}

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "(I)I")
	public int method1047() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1468; local7++) {
			local5 = (this.aByteArray17[local7] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!mc", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "(I)J")
	private long method1048() {
		@Pc(6) long local6 = (long) 0;
		for (@Pc(8) int local8 = 0; local8 < this.anInt1468; local8++) {
			local6 = (long) (this.aByteArray17[local8] & 0xFF) + (local6 << 5) - local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!mc", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1047();
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(Z)J")
	public long method1049() {
		@Pc(5) long local5 = 0L;
		for (@Pc(13) int local13 = 0; local13 < this.anInt1468 && local13 < 12; local13++) {
			local5 *= 37L;
			@Pc(23) byte local23 = this.aByteArray17[local13];
			if (local23 >= 65 && local23 <= 90) {
				local5 += local23 + 1 - 65;
			} else if (local23 >= 97 && local23 <= 122) {
				local5 += local23 + 1 - 97;
			} else if (local23 >= 48 && local23 <= 57) {
				local5 += local23 - 21;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(Lclient!mc;I)I")
	public int method1050(@OriginalArg(0) Class42 arg0) {
		return this.method1045(arg0);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(IB)Lclient!mc;")
	public Class42 method1051(@OriginalArg(0) int arg0) {
		return this.method1053(arg0, this.anInt1468);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)Lclient!mc;")
	public Class42 method1052(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(19) Class42 local19 = new Class42();
		local19.aByteArray17 = new byte[this.anInt1468 + 1];
		local19.anInt1468 = this.anInt1468 + 1;
		Static114.method777(this.aByteArray17, 0, local19.aByteArray17, 0, this.anInt1468);
		local19.aByteArray17[this.anInt1468] = (byte) arg0;
		return local19;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Lclient!mc;")
	public Class42 method1053(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class42 local10 = new Class42();
		local10.anInt1468 = arg1 - arg0;
		local10.aByteArray17 = new byte[arg1 - arg0];
		Static114.method777(this.aByteArray17, arg0, local10.aByteArray17, 0, local10.anInt1468);
		return local10;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)I")
	private int method1054() {
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt1468; local23++) {
			@Pc(32) int local32 = this.aByteArray17[local23] & 0xFF;
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
			if (local32 >= 10) {
				throw new NumberFormatException();
			}
			if (local17) {
				local32 = -local32;
			}
			@Pc(112) int local112 = local21 * 10 + local32;
			if (local112 / 10 != local21) {
				throw new NumberFormatException();
			}
			local19 = true;
			local21 = local112;
		}
		if (!local19) {
			throw new NumberFormatException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)Lclient!mc;")
	public Class42 method1055(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		} else if (this.aBoolean88) {
			this.anInt1495 = 0;
			if (this.anInt1468 == this.aByteArray17.length) {
				@Pc(37) int local37;
				for (local37 = 1; local37 <= this.anInt1468; local37 += local37) {
				}
				@Pc(49) byte[] local49 = new byte[local37];
				Static114.method777(this.aByteArray17, 0, local49, 0, this.anInt1468);
				this.aByteArray17 = local49;
			}
			this.aByteArray17[this.anInt1468++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "(I)Lclient!mc;")
	public Class42 method1056() {
		if (!this.aBoolean88) {
			throw new IllegalArgumentException();
		}
		this.anInt1495 = 0;
		if (this.aByteArray17.length != this.anInt1468) {
			@Pc(23) byte[] local23 = new byte[this.anInt1468];
			Static114.method777(this.aByteArray17, 0, local23, 0, this.anInt1468);
			this.aByteArray17 = local23;
		}
		return this;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public void method1057(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray17, 0, this.anInt1468, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local9 = new String(this.aByteArray17, 0, this.anInt1468);
		}
		arg0.drawString(local9, arg1, arg2);
	}

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "(I)Lclient!mc;")
	public Class42 method1058() {
		@Pc(10) boolean local10 = true;
		@Pc(14) Class42 local14 = new Class42();
		local14.anInt1468 = this.anInt1468;
		local14.aByteArray17 = new byte[this.anInt1468];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1468; local25++) {
			@Pc(31) byte local31 = this.aByteArray17[local25];
			if (local31 == 95) {
				local10 = true;
				local14.aByteArray17[local25] = 32;
			} else if (local31 >= 97 && local31 <= 122 && local10) {
				local10 = false;
				local14.aByteArray17[local25] = (byte) (local31 - 32);
			} else {
				local14.aByteArray17[local25] = local31;
				local10 = false;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[BIII)I")
	public int method1059(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static114.method777(this.aByteArray17, 0, arg0, arg1, arg2);
		return arg2;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!mc;)Lclient!mc;")
	public Class42 method1060(@OriginalArg(1) Class42 arg0) {
		if (!this.aBoolean88) {
			throw new IllegalArgumentException();
		}
		this.anInt1495 = 0;
		if (arg0.anInt1468 + this.anInt1468 > this.aByteArray17.length) {
			@Pc(30) int local30;
			for (local30 = 1; local30 < arg0.anInt1468 + this.anInt1468; local30 += local30) {
			}
			@Pc(46) byte[] local46 = new byte[local30];
			Static114.method777(this.aByteArray17, 0, local46, 0, this.anInt1468);
			this.aByteArray17 = local46;
		}
		Static114.method777(arg0.aByteArray17, 0, this.aByteArray17, this.anInt1468, arg0.anInt1468);
		this.anInt1468 += arg0.anInt1468;
		return this;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(Lclient!mc;I)Z")
	public boolean method1061(@OriginalArg(0) Class42 arg0) {
		if (this.anInt1468 < arg0.anInt1468) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < arg0.anInt1468; local18++) {
			if (arg0.aByteArray17[local18] != this.aByteArray17[local18]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(ZI)I")
	public int method1062(@OriginalArg(1) int arg0) {
		return this.aByteArray17[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
	public int method1063(@OriginalArg(1) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray17, 0, this.anInt1468, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray17, 0, this.anInt1468);
		}
		return arg0.stringWidth(local13);
	}
}
