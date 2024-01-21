import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class5 implements Interface1 {

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
	public int anInt311;

	@OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!ae", name = "P", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "Z")
	private boolean aBoolean12 = true;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)I")
	public int method130() {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt311; local12++) {
			local10 = (this.aByteArray1[local12] & 0xFF) + ((local10 << 5) - local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)Lclient!ae;")
	public Class5 method131() {
		@Pc(7) long local7 = this.method168();
		@Pc(16) Class local16 = ae.class;
		synchronized (ae.class) {
			@Pc(26) Class3_Sub5 local26;
			if (Static9.aClass21_2 == null) {
				Static9.aClass21_2 = new Class21(4096);
			} else {
				for (local26 = (Class3_Sub5) Static9.aClass21_2.method459(local7); local26 != null; local26 = (Class3_Sub5) Static9.aClass21_2.method456()) {
					if (this.method163(local26.aClass5_595)) {
						return local26.aClass5_595;
					}
				}
			}
			local26 = new Class3_Sub5();
			this.aBoolean12 = false;
			local26.aClass5_595 = this;
			Static9.aClass21_2.method452(local7, local26);
			return this;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)Lclient!ae;")
	public Class5 method132() {
		@Pc(5) Class5 local5 = new Class5();
		local5.anInt311 = this.anInt311;
		local5.aByteArray1 = new byte[this.anInt311];
		@Pc(20) boolean local20 = true;
		for (@Pc(22) int local22 = 0; local22 < this.anInt311; local22++) {
			@Pc(29) byte local29 = this.aByteArray1[local22];
			if (local29 >= 97 && local29 <= 122 || !(local29 < -32 || local29 > -2 || local29 == -9)) {
				if (local20) {
					local29 = (byte) (local29 - 32);
				}
				local20 = false;
			} else if (local29 >= 65 && local29 <= 90 || local29 >= -64 && local29 <= -34 && local29 != -41) {
				if (!local20) {
					local29 = (byte) (local29 + 32);
				}
				local20 = false;
			}
			if (local29 == 46 || local29 == 33 || local29 == 63) {
				local20 = true;
			}
			local5.aByteArray1[local22] = local29;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Lclient!ae;")
	public Class5 method133(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class5 local7 = new Class5();
		local7.aByteArray1 = new byte[arg1 - arg0];
		local7.anInt311 = arg1 - arg0;
		Static118.method807(this.aByteArray1, arg0, local7.aByteArray1, 0, local7.anInt311);
		return local7;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)Z")
	private boolean method135() {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		for (@Pc(30) int local30 = 0; local30 < this.anInt311; local30++) {
			@Pc(39) int local39 = this.aByteArray1[local30] & 0xFF;
			if (local30 == 0) {
				if (local39 == 45) {
					local24 = true;
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
				return false;
			}
			if (local39 >= 10) {
				return false;
			}
			if (local24) {
				local39 = -local39;
			}
			@Pc(100) int local100 = local39 + local28 * 10;
			if (local28 != local100 / 10) {
				return false;
			}
			local28 = local100;
			local26 = true;
		}
		return local26;
	}

	@OriginalMember(owner = "client!ae", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBLclient!ae;)Lclient!ae;")
	public Class5 method137(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1) {
		if (!this.aBoolean12) {
			throw new IllegalArgumentException();
		} else if (arg0 > this.anInt311) {
			throw new IllegalArgumentException();
		} else {
			this.anInt318 = 0;
			if (this.aByteArray1.length < arg0 + arg1.anInt311) {
				@Pc(37) int local37;
				for (local37 = 1; local37 < arg1.anInt311 + arg0; local37 += local37) {
				}
				@Pc(56) byte[] local56 = new byte[local37];
				Static118.method807(this.aByteArray1, 0, local56, 0, this.anInt311);
				this.aByteArray1 = local56;
			}
			Static118.method807(arg1.aByteArray1, 0, this.aByteArray1, arg0, arg1.anInt311);
			if (arg0 + arg1.anInt311 > this.anInt311) {
				this.anInt311 = arg0 + arg1.anInt311;
			}
			return this;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!ae;Z)Z")
	public boolean method139(@OriginalArg(0) Class5 arg0) {
		if (arg0.anInt311 > this.anInt311) {
			return false;
		}
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt311; local21++) {
			if (this.aByteArray1[local21] != arg0.aByteArray1[local21]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method140(@OriginalArg(0) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray1, 0, this.anInt311, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray1, 0, this.anInt311);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)I")
	private int method141() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) int local11 = 0;
		for (@Pc(34) int local34 = 0; local34 < this.anInt311; local34++) {
			@Pc(43) int local43 = this.aByteArray1[local34] & 0xFF;
			if (local34 == 0) {
				if (local43 == 45) {
					local9 = true;
					continue;
				}
				if (local43 == 43) {
					continue;
				}
			}
			if (local43 >= 48 && local43 <= 57) {
				local43 -= 48;
			} else if (local43 >= 65 && local43 <= 90) {
				local43 -= 55;
			} else if (local43 >= 97 && local43 <= 122) {
				local43 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (local43 >= 10) {
				throw new NumberFormatException();
			}
			if (local9) {
				local43 = -local43;
			}
			@Pc(115) int local115 = local43 + local11 * 10;
			if (local115 / 10 != local11) {
				throw new NumberFormatException();
			}
			local11 = local115;
			local7 = true;
		}
		if (!local7) {
			throw new NumberFormatException();
		}
		return local11;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZII)I")
	private int method142() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt311; local15++) {
			if (this.aByteArray1[local15] == 32) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)Lclient!ae;")
	public Class5 method143() {
		@Pc(10) int local10 = 0;
		@Pc(13) int local13 = this.anInt311;
		while (this.anInt311 > local10 && (this.aByteArray1[local10] >= 0 && this.aByteArray1[local10] <= 32 || (this.aByteArray1[local10] & 0xFF) == 160)) {
			local10++;
		}
		while (local10 < local13 && (this.aByteArray1[local13 - 1] >= 0 && this.aByteArray1[local13 - 1] <= 32 || (this.aByteArray1[local13 - 1] & 0xFF) == 160)) {
			local13--;
		}
		if (local10 == 0 && this.anInt311 == local13) {
			return this;
		}
		@Pc(98) Class5 local98 = new Class5();
		local98.anInt311 = local13 - local10;
		local98.aByteArray1 = new byte[local98.anInt311];
		for (@Pc(111) int local111 = 0; local111 < local98.anInt311; local111++) {
			local98.aByteArray1[local111] = this.aByteArray1[local111 + local10];
		}
		return local98;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)I")
	public int method144() {
		return this.anInt311;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Lclient!ae;")
	public Class5 method145(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		} else if (this.aBoolean12) {
			this.anInt318 = 0;
			if (this.anInt311 == this.aByteArray1.length) {
				@Pc(36) int local36;
				for (local36 = 1; local36 <= this.anInt311; local36 += local36) {
				}
				@Pc(53) byte[] local53 = new byte[local36];
				Static118.method807(this.aByteArray1, 0, local53, 0, this.anInt311);
				this.aByteArray1 = local53;
			}
			this.aByteArray1[this.anInt311++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(B)J")
	public long method146() {
		@Pc(7) long local7 = 0L;
		for (@Pc(9) int local9 = 0; this.anInt311 > local9 && local9 < 12; local9++) {
			local7 *= 37L;
			@Pc(25) byte local25 = this.aByteArray1[local9];
			if (local25 >= 65 && local25 <= 90) {
				local7 += local25 + 1 - 65;
			} else if (local25 >= 97 && local25 <= 122) {
				local7 += local25 + 1 - 97;
			} else if (local25 >= 48 && local25 <= 57) {
				local7 += local25 - 21;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(B)Lclient!ae;")
	public Class5 method147() {
		@Pc(9) Class5 local9 = new Class5();
		local9.anInt311 = this.anInt311;
		local9.aByteArray1 = new byte[this.anInt311];
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < this.anInt311; local27++) {
			@Pc(34) byte local34 = this.aByteArray1[local27];
			if (local34 == 95) {
				local9.aByteArray1[local27] = 32;
				local25 = true;
			} else if (local34 >= 97 && local34 <= 122 && local25) {
				local9.aByteArray1[local27] = (byte) (local34 - 32);
				local25 = false;
			} else {
				local9.aByteArray1[local27] = local34;
				local25 = false;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)Lclient!ae;")
	public Class5 method148() {
		@Pc(14) Class5 local14 = new Class5();
		local14.anInt311 = this.anInt311;
		local14.aByteArray1 = new byte[this.anInt311];
		for (@Pc(25) int local25 = 0; local25 < this.anInt311; local25++) {
			local14.aByteArray1[local25] = 42;
		}
		return local14;
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)Lclient!ae;")
	public Class5 method149() {
		if (!this.aBoolean12) {
			throw new IllegalArgumentException();
		}
		this.anInt318 = 0;
		if (this.aByteArray1.length != this.anInt311) {
			@Pc(31) byte[] local31 = new byte[this.anInt311];
			Static118.method807(this.aByteArray1, 0, local31, 0, this.anInt311);
			this.aByteArray1 = local31;
		}
		return this;
	}

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "(B)I")
	public int method150() {
		return this.method141();
	}

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)Lclient!ae;")
	public Class5 method151() {
		@Pc(9) Class5 local9 = new Class5();
		local9.anInt311 = this.anInt311;
		local9.aByteArray1 = new byte[this.anInt311];
		for (@Pc(20) int local20 = 0; local20 < this.anInt311; local20++) {
			@Pc(27) byte local27 = this.aByteArray1[local20];
			if (local27 >= 65 && local27 <= 90 || local27 >= -64 && local27 <= -34 && local27 != -41) {
				local27 = (byte) (local27 + 32);
			}
			local9.aByteArray1[local20] = local27;
		}
		return local9;
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)[B")
	public byte[] method152() {
		@Pc(12) byte[] local12 = new byte[this.anInt311];
		Static118.method807(this.aByteArray1, 0, local12, 0, this.anInt311);
		return local12;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
	public void method153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray1, 0, this.anInt311, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray1, 0, this.anInt311);
		}
		arg2.drawString(local13, arg1, arg0);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(ILclient!ae;)I")
	public int method154(@OriginalArg(1) Class5 arg0) {
		return this.method167(arg0);
	}

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "(I)Lclient!ae;")
	public Class5 method155() {
		@Pc(5) Class5 local5 = new Class5();
		local5.aByteArray1 = new byte[12];
		@Pc(11) int local11 = 0;
		local5.anInt311 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt311; local21++) {
			if (this.aByteArray1[local21] >= 65 && this.aByteArray1[local21] <= 90) {
				local5.aByteArray1[local11++] = (byte) (this.aByteArray1[local21] + 97 - 65);
				local5.anInt311 = local11;
			} else if (this.aByteArray1[local21] >= 97 && this.aByteArray1[local21] <= 122 || this.aByteArray1[local21] >= 48 && this.aByteArray1[local21] <= 57) {
				local5.aByteArray1[local11++] = this.aByteArray1[local21];
				local5.anInt311 = local11;
			} else if (local11 > 0) {
				local5.aByteArray1[local11++] = 95;
			}
			if (local11 == 12) {
				break;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(ILclient!ae;)Lclient!ae;")
	public Class5 method156(@OriginalArg(1) Class5 arg0) {
		if (!this.aBoolean12) {
			throw new IllegalArgumentException();
		}
		this.anInt318 = 0;
		if (this.aByteArray1.length < arg0.anInt311 + this.anInt311) {
			@Pc(26) int local26;
			for (local26 = 1; local26 < arg0.anInt311 + this.anInt311; local26 += local26) {
			}
			@Pc(46) byte[] local46 = new byte[local26];
			Static118.method807(this.aByteArray1, 0, local46, 0, this.anInt311);
			this.aByteArray1 = local46;
		}
		Static118.method807(arg0.aByteArray1, 0, this.aByteArray1, this.anInt311, arg0.anInt311);
		this.anInt311 += arg0.anInt311;
		return this;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II[BII)I")
	public int method157(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static118.method807(this.aByteArray1, 0, arg0, arg1, arg2);
		return arg2;
	}

	@OriginalMember(owner = "client!ae", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!ae;I)Z")
	public boolean method158(@OriginalArg(0) Class5 arg0) {
		if (this.anInt311 < arg0.anInt311) {
			return false;
		}
		@Pc(23) int local23 = this.anInt311 - arg0.anInt311;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt311; local25++) {
			if (this.aByteArray1[local25 + local23] != arg0.aByteArray1[local25]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)Lclient!ae;")
	public Class5 method159(@OriginalArg(1) int arg0) {
		return this.method133(arg0, this.anInt311);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)Lclient!ae;")
	public Class5 method160(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(19) Class5 local19 = new Class5();
		local19.aByteArray1 = new byte[this.anInt311 + 1];
		local19.anInt311 = this.anInt311 + 1;
		Static118.method807(this.aByteArray1, 0, local19.aByteArray1, 0, this.anInt311);
		local19.aByteArray1[this.anInt311] = (byte) arg0;
		return local19;
	}

	@OriginalMember(owner = "client!ae", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method130();
	}

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "(I)Z")
	public boolean method161() {
		return this.method135();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!ae;B)Z")
	public boolean method163(@OriginalArg(0) Class5 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt311 == this.anInt311) {
			if (!this.aBoolean12 || !arg0.aBoolean12) {
				if (this.anInt318 == 0) {
					this.anInt318 = this.method130();
					if (this.anInt318 == 0) {
						this.anInt318 = 1;
					}
				}
				if (arg0.anInt318 == 0) {
					arg0.anInt318 = arg0.method130();
					if (arg0.anInt318 == 0) {
						arg0.anInt318 = 1;
					}
				}
				if (arg0.anInt318 != this.anInt318) {
					return false;
				}
			}
			for (@Pc(70) int local70 = 0; local70 < this.anInt311; local70++) {
				if (this.aByteArray1[local70] != arg0.aByteArray1[local70]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)I")
	public int method164(@OriginalArg(0) int arg0) {
		return this.aByteArray1[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)I")
	public int method166() {
		return this.method142();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLclient!ae;I)I")
	private int method167(@OriginalArg(1) Class5 arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(12) int[] local12 = new int[arg0.anInt311];
		@Pc(16) int[] local16 = new int[arg0.anInt311];
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			local8[local18] = arg0.anInt311;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg0.anInt311; local36++) {
			local16[local36 - 1] = (arg0.anInt311 << 1) - local36;
			local8[arg0.aByteArray1[local36 - 1] & 0xFF] = arg0.anInt311 - local36;
		}
		@Pc(78) int local78 = arg0.anInt311 + 1;
		@Pc(81) int local81 = arg0.anInt311;
		while (local81 > 0) {
			local12[local81 - 1] = local78;
			while (local78 <= arg0.anInt311 && arg0.aByteArray1[local78 - 1] != arg0.aByteArray1[local81 - 1]) {
				if (local16[local78 - 1] >= arg0.anInt311 - local81) {
					local16[local78 - 1] = arg0.anInt311 - local81;
				}
				local78 = local12[local78 - 1];
			}
			local81--;
			local78--;
		}
		@Pc(149) int local149 = local78;
		local78 = arg0.anInt311 + 1 - local78;
		@Pc(159) int local159 = 1;
		@Pc(161) int local161 = 0;
		@Pc(163) int local163 = 1;
		while (local163 <= local78) {
			local12[local163 - 1] = local161;
			while (local161 >= 1 && arg0.aByteArray1[local161 - 1] != arg0.aByteArray1[local163 - 1]) {
				local161 = local12[local161 - 1];
			}
			local163++;
			local161++;
		}
		@Pc(204) int local204;
		while (local149 < arg0.anInt311) {
			for (local204 = local159; local204 <= local149; local204++) {
				if (arg0.anInt311 + local149 - local204 <= local16[local204 - 1]) {
					local16[local204 - 1] = local149 + arg0.anInt311 - local204;
				}
			}
			local159 = local149 + 1;
			local149 = local78 + local149 - local12[local78 + -1];
			local78 = local12[local78 - 1];
		}
		@Pc(282) int local282;
		for (local204 = arg0.anInt311 - 1; local204 < this.anInt311; local204 += Math.max(local8[this.aByteArray1[local204] & 0xFF], local16[local282])) {
			for (local282 = arg0.anInt311 - 1; local282 >= 0 && arg0.aByteArray1[local282] == this.aByteArray1[local204]; local282--) {
				local204--;
			}
			if (local282 == -1) {
				return local204 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "(I)J")
	private long method168() {
		@Pc(6) long local6 = (long) 0;
		for (@Pc(8) int local8 = 0; local8 < this.anInt311; local8++) {
			local6 = (long) (this.aByteArray1[local8] & 0xFF) + (local6 << 5) - local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(ILclient!ae;)I")
	public int method170(@OriginalArg(1) Class5 arg0) {
		@Pc(23) int local23;
		if (arg0.anInt311 >= this.anInt311) {
			local23 = this.anInt311;
		} else {
			local23 = arg0.anInt311;
		}
		for (@Pc(30) int local30 = 0; local30 < local23; local30++) {
			if (arg0.aByteArray1[local30] > this.aByteArray1[local30]) {
				return -1;
			}
			if (this.aByteArray1[local30] > arg0.aByteArray1[local30]) {
				return 1;
			}
		}
		if (arg0.anInt311 > this.anInt311) {
			return -1;
		} else if (this.anInt311 > arg0.anInt311) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(Lclient!ae;I)Z")
	public boolean method171(@OriginalArg(0) Class5 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt311 == this.anInt311) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt311; local27++) {
				@Pc(34) byte local34 = this.aByteArray1[local27];
				@Pc(39) byte local39 = arg0.aByteArray1[local27];
				if (local39 >= 65 && local39 <= 90 || local39 >= -64 && local39 <= -34 && local39 != -41) {
					local39 = (byte) (local39 + 32);
				}
				if (local34 >= 65 && local34 <= 90 || local34 >= -64 && local34 <= -34 && local34 != -41) {
					local34 = (byte) (local34 + 32);
				}
				if (local39 != local34) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}
