import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class6 implements Interface2 {

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
	public int anInt165;

	@OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
	private int anInt193;

	@OriginalMember(owner = "client!ai", name = "U", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "Z")
	private boolean aBoolean6 = true;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I")
	public int method101(@OriginalArg(1) FontMetrics arg0) {
		@Pc(21) String local21;
		try {
			local21 = new String(this.aByteArray2, 0, this.anInt165, "ISO-8859-1");
		} catch (@Pc(23) UnsupportedEncodingException local23) {
			local21 = new String(this.aByteArray2, 0, this.anInt165);
		}
		return arg0.stringWidth(local21);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)I")
	public int method102() {
		@Pc(1) int local1 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt165; local15++) {
			local1 = (local1 << 5) + (this.aByteArray2[local15] & 0xFF) - local1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLclient!ai;)Z")
	public boolean method103(@OriginalArg(1) Class6 arg0) {
		if (this.anInt165 < arg0.anInt165) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt165; local14++) {
			if (arg0.aByteArray2[local14] != this.aByteArray2[local14]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Z")
	private boolean method104() {
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt165; local26++) {
			@Pc(35) int local35 = this.aByteArray2[local26] & 0xFF;
			if (local26 == 0) {
				if (local35 == 45) {
					local20 = true;
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
			if (local20) {
				local35 = -local35;
			}
			@Pc(104) int local104 = local24 * 10 + local35;
			if (local24 != local104 / 10) {
				return false;
			}
			local22 = true;
			local24 = local104;
		}
		return local22;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)Lclient!ai;")
	public Class6 method105(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(25) Class6 local25 = new Class6();
		local25.aByteArray2 = new byte[this.anInt165 + 1];
		local25.anInt165 = this.anInt165 + 1;
		Static184.method163(this.aByteArray2, 0, local25.aByteArray2, 0, this.anInt165);
		local25.aByteArray2[this.anInt165] = (byte) arg0;
		return local25;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)Lclient!ai;")
	public Class6 method106() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class6 local11 = new Class6();
		local11.anInt165 = this.anInt165;
		local11.aByteArray2 = new byte[this.anInt165];
		for (@Pc(22) int local22 = 0; local22 < this.anInt165; local22++) {
			@Pc(32) byte local32 = this.aByteArray2[local22];
			if (local32 == 95) {
				local7 = true;
				local11.aByteArray2[local22] = 32;
			} else if (local32 >= 97 && local32 <= 122 && local7) {
				local11.aByteArray2[local22] = (byte) (local32 - 32);
				local7 = false;
			} else {
				local11.aByteArray2[local22] = local32;
				local7 = false;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)I")
	public int method107() {
		return this.anInt165;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(BLclient!ai;)I")
	public int method108(@OriginalArg(1) Class6 arg0) {
		@Pc(17) int local17;
		if (arg0.anInt165 >= this.anInt165) {
			local17 = this.anInt165;
		} else {
			local17 = arg0.anInt165;
		}
		for (@Pc(24) int local24 = 0; local24 < local17; local24++) {
			if (Static142.anIntArray295[arg0.aByteArray2[local24] & 0xFF] > Static142.anIntArray295[this.aByteArray2[local24] & 0xFF]) {
				return -1;
			}
			if (Static142.anIntArray295[this.aByteArray2[local24] & 0xFF] > Static142.anIntArray295[arg0.aByteArray2[local24] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt165 > this.anInt165) {
			return -1;
		} else if (this.anInt165 > arg0.anInt165) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ai", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!ai", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class6)) {
			throw new IllegalArgumentException();
		}
		return this.method131((Class6) arg0);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(III[BI)I")
	public int method109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		Static184.method163(this.aByteArray2, 0, arg2, arg1, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)Lclient!ai;")
	public Class6 method110() {
		@Pc(7) byte local7 = 2;
		@Pc(11) Class6 local11 = new Class6();
		local11.anInt165 = this.anInt165;
		local11.aByteArray2 = new byte[this.anInt165];
		for (@Pc(22) int local22 = 0; local22 < this.anInt165; local22++) {
			@Pc(29) byte local29 = this.aByteArray2[local22];
			if (local29 >= 97 && local29 <= 122 || local29 >= -32 && local29 <= -2 && local29 != -9) {
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
			local11.aByteArray2[local22] = local29;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIB)Lclient!ai;")
	public Class6 method111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class6 local7 = new Class6();
		local7.aByteArray2 = new byte[arg0 - arg1];
		local7.anInt165 = arg0 - arg1;
		Static184.method163(this.aByteArray2, arg1, local7.aByteArray2, 0, local7.anInt165);
		return local7;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)[B")
	public byte[] method112() {
		@Pc(3) byte[] local3 = new byte[this.anInt165];
		Static184.method163(this.aByteArray2, 0, local3, 0, this.anInt165);
		return local3;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ai;Z)I")
	public int method114(@OriginalArg(0) Class6 arg0) {
		@Pc(17) int local17;
		if (arg0.anInt165 >= this.anInt165) {
			local17 = this.anInt165;
		} else {
			local17 = arg0.anInt165;
		}
		for (@Pc(29) int local29 = 0; local29 < local17; local29++) {
			if ((this.aByteArray2[local29] & 0xFF) < (arg0.aByteArray2[local29] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray2[local29] & 0xFF) > (arg0.aByteArray2[local29] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.anInt165 > this.anInt165) {
			return -1;
		} else if (this.anInt165 > arg0.anInt165) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ai", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method102();
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)Lclient!ai;")
	public Class6 method115() {
		@Pc(9) Class6 local9 = new Class6();
		local9.anInt165 = this.anInt165;
		local9.aByteArray2 = new byte[this.anInt165];
		for (@Pc(25) int local25 = 0; local25 < this.anInt165; local25++) {
			@Pc(32) byte local32 = this.aByteArray2[local25];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local9.aByteArray2[local25] = local32;
		}
		return local9;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)Z")
	public boolean method116() {
		return this.method104();
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(BLclient!ai;)Lclient!ai;")
	public Class6 method117(@OriginalArg(1) Class6 arg0) {
		if (!this.aBoolean6) {
			throw new IllegalArgumentException();
		}
		this.anInt193 = 0;
		if (this.aByteArray2.length < this.anInt165 + arg0.anInt165) {
			@Pc(39) int local39;
			for (local39 = 1; local39 < arg0.anInt165 + this.anInt165; local39 += local39) {
			}
			@Pc(59) byte[] local59 = new byte[local39];
			Static184.method163(this.aByteArray2, 0, local59, 0, this.anInt165);
			this.aByteArray2 = local59;
		}
		Static184.method163(arg0.aByteArray2, 0, this.aByteArray2, this.anInt165, arg0.anInt165);
		this.anInt165 += arg0.anInt165;
		return this;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)I")
	public int method118(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte local9 = (byte) arg0;
		for (@Pc(15) int local15 = arg1; local15 < this.anInt165; local15++) {
			if (local9 == this.aByteArray2[local15]) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(BI)Lclient!ai;")
	public Class6 method119(@OriginalArg(1) int arg0) {
		return this.method111(this.anInt165, arg0);
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(BLclient!ai;)I")
	public int method120(@OriginalArg(1) Class6 arg0) {
		return this.method134(0, arg0);
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(Z)Lclient!ai;")
	public Class6 method121() {
		@Pc(10) Class6 local10 = new Class6();
		local10.anInt165 = 0;
		local10.aByteArray2 = new byte[12];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt165; local21++) {
			if (this.aByteArray2[local21] >= 65 && this.aByteArray2[local21] <= 90) {
				local10.aByteArray2[local19++] = (byte) (this.aByteArray2[local21] + 32);
				local10.anInt165 = local19;
			} else if (this.aByteArray2[local21] >= 97 && this.aByteArray2[local21] <= 122 || this.aByteArray2[local21] >= 48 && this.aByteArray2[local21] <= 57) {
				local10.aByteArray2[local19++] = this.aByteArray2[local21];
				local10.anInt165 = local19;
			} else if (local19 > 0) {
				local10.aByteArray2[local19++] = 95;
			}
			if (local19 == 12) {
				break;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)I")
	public int method122() {
		return this.method133(10);
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)Lclient!ai;")
	public Class6 method123(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean6) {
			this.anInt193 = 0;
			if (this.aByteArray2.length == this.anInt165) {
				@Pc(48) int local48;
				for (local48 = 1; local48 <= this.anInt165; local48 += local48) {
				}
				@Pc(65) byte[] local65 = new byte[local48];
				Static184.method163(this.aByteArray2, 0, local65, 0, this.anInt165);
				this.aByteArray2 = local65;
			}
			this.aByteArray2[this.anInt165++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(BLclient!ai;)Z")
	public boolean method124(@OriginalArg(1) Class6 arg0) {
		if (arg0.anInt165 > this.anInt165) {
			return false;
		}
		@Pc(23) int local23 = this.anInt165 - arg0.anInt165;
		for (@Pc(30) int local30 = 0; local30 < arg0.anInt165; local30++) {
			if (arg0.aByteArray2[local30] != this.aByteArray2[local23 + local30]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2) {
		@Pc(21) String local21;
		try {
			local21 = new String(this.aByteArray2, 0, this.anInt165, "ISO-8859-1");
		} catch (@Pc(23) UnsupportedEncodingException local23) {
			local21 = new String(this.aByteArray2, 0, this.anInt165);
		}
		arg2.drawString(local21, arg1, arg0);
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(B)Lclient!ai;")
	public Class6 method126() {
		@Pc(9) Class6 local9 = new Class6();
		local9.anInt165 = this.anInt165;
		local9.aByteArray2 = new byte[this.anInt165];
		for (@Pc(25) int local25 = 0; local25 < this.anInt165; local25++) {
			local9.aByteArray2[local25] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(B)Lclient!ai;")
	public Class6 method127() {
		if (!this.aBoolean6) {
			throw new IllegalArgumentException();
		}
		this.anInt193 = 0;
		if (this.anInt165 != this.aByteArray2.length) {
			@Pc(27) byte[] local27 = new byte[this.anInt165];
			Static184.method163(this.aByteArray2, 0, local27, 0, this.anInt165);
			this.aByteArray2 = local27;
		}
		return this;
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)I")
	public int method128(@OriginalArg(0) int arg0) {
		return this.aByteArray2[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(B)J")
	public long method129() {
		@Pc(7) long local7 = 0L;
		for (@Pc(17) int local17 = 0; local17 < this.anInt165 && local17 < 12; local17++) {
			local7 *= 37L;
			@Pc(28) byte local28 = this.aByteArray2[local17];
			if (local28 >= 65 && local28 <= 90) {
				local7 += local28 + 1 - 65;
			} else if (local28 >= 97 && local28 <= 122) {
				local7 += local28 + 1 - 97;
			} else if (local28 >= 48 && local28 <= 57) {
				local7 += local28 - 21;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "(B)Ljava/net/URL;")
	public URL method130() throws MalformedURLException {
		return new URL(new String(this.aByteArray2, 0, this.anInt165));
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!ai;)Z")
	public boolean method131(@OriginalArg(1) Class6 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt165 == this.anInt165) {
			if (!this.aBoolean6 || !arg0.aBoolean6) {
				if (this.anInt193 == 0) {
					this.anInt193 = this.method102();
					if (this.anInt193 == 0) {
						this.anInt193 = 1;
					}
				}
				if (arg0.anInt193 == 0) {
					arg0.anInt193 = arg0.method102();
					if (arg0.anInt193 == 0) {
						arg0.anInt193 = 1;
					}
				}
				if (arg0.anInt193 != this.anInt193) {
					return false;
				}
			}
			for (@Pc(57) int local57 = 0; local57 < this.anInt165; local57++) {
				if (arg0.aByteArray2[local57] != this.aByteArray2[local57]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "(B)J")
	private long method132() {
		@Pc(13) long local13 = 0L;
		for (@Pc(15) int local15 = 0; local15 < this.anInt165; local15++) {
			local13 = (local13 << 5) + (long) (this.aByteArray2[local15] & 0xFF) - local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(II)I")
	public int method133(@OriginalArg(1) int arg0) {
		@Pc(15) boolean local15 = false;
		@Pc(25) boolean local25 = false;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt165; local29++) {
			@Pc(38) int local38 = this.aByteArray2[local29] & 0xFF;
			if (local29 == 0) {
				if (local38 == 45) {
					local15 = true;
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
			if (local38 >= arg0) {
				throw new NumberFormatException();
			}
			if (local15) {
				local38 = -local38;
			}
			@Pc(109) int local109 = local38 + local27 * arg0;
			if (local109 / arg0 != local27) {
				throw new NumberFormatException();
			}
			local27 = local109;
			local25 = true;
		}
		if (!local25) {
			throw new NumberFormatException();
		}
		return local27;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IBLclient!ai;)I")
	public int method134(@OriginalArg(0) int arg0, @OriginalArg(2) Class6 arg1) {
		@Pc(9) int[] local9 = new int[arg1.anInt165];
		@Pc(13) int[] local13 = new int[arg1.anInt165];
		@Pc(16) int[] local16 = new int[256];
		for (@Pc(23) int local23 = 0; local23 < local16.length; local23++) {
			local16[local23] = arg1.anInt165;
		}
		for (@Pc(41) int local41 = 1; local41 <= arg1.anInt165; local41++) {
			local9[local41 - 1] = (arg1.anInt165 << 1) - local41;
			local16[arg1.aByteArray2[local41 - 1] & 0xFF] = arg1.anInt165 - local41;
		}
		@Pc(84) int local84 = arg1.anInt165 + 1;
		@Pc(87) int local87 = arg1.anInt165;
		while (local87 > 0) {
			local13[local87 - 1] = local84;
			while (arg1.anInt165 >= local84 && arg1.aByteArray2[local84 - 1] != arg1.aByteArray2[local87 - 1]) {
				if (local9[local84 - 1] >= arg1.anInt165 - local87) {
					local9[local84 - 1] = arg1.anInt165 - local87;
				}
				local84 = local13[local84 - 1];
			}
			local87--;
			local84--;
		}
		@Pc(146) int local146 = local84;
		local84 = arg1.anInt165 + 1 - local84;
		@Pc(155) int local155 = 1;
		@Pc(157) int local157 = 0;
		for (@Pc(159) int local159 = 1; local159 <= local84; local159++) {
			local13[local159 - 1] = local157;
			while (local157 >= 1 && arg1.aByteArray2[local157 - 1] != arg1.aByteArray2[local159 - 1]) {
				local157 = local13[local157 - 1];
			}
			local157++;
		}
		@Pc(208) int local208;
		while (local146 < arg1.anInt165) {
			for (local208 = local155; local208 <= local146; local208++) {
				if (local9[local208 - 1] >= local146 + arg1.anInt165 - local208) {
					local9[local208 - 1] = arg1.anInt165 + local146 - local208;
				}
			}
			local155 = local146 + 1;
			local146 = local84 + local146 - local13[local84 + -1];
			local84 = local13[local84 - 1];
		}
		@Pc(285) int local285;
		for (local208 = arg0 + arg1.anInt165 - 1; local208 < this.anInt165; local208 += Math.max(local16[this.aByteArray2[local208] & 0xFF], local9[local285])) {
			for (local285 = arg1.anInt165 - 1; local285 >= 0 && this.aByteArray2[local208] == arg1.aByteArray2[local285]; local285--) {
				local208--;
			}
			if (local285 == -1) {
				return local208 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)Lclient!ai;")
	public Class6 method135() {
		@Pc(13) int local13;
		for (local13 = 0; local13 < this.anInt165 && (this.aByteArray2[local13] >= 0 && this.aByteArray2[local13] <= 32 || (this.aByteArray2[local13] & 0xFF) == 160); local13++) {
		}
		@Pc(48) int local48;
		for (local48 = this.anInt165; local48 > local13 && (this.aByteArray2[local48 - 1] >= 0 && this.aByteArray2[local48 - 1] <= 32 || (this.aByteArray2[local48 - 1] & 0xFF) == 160); local48--) {
		}
		if (local13 == 0 && local48 == this.anInt165) {
			return this;
		}
		@Pc(100) Class6 local100 = new Class6();
		local100.anInt165 = local48 - local13;
		local100.aByteArray2 = new byte[local100.anInt165];
		for (@Pc(113) int local113 = 0; local113 < local100.anInt165; local113++) {
			local100.aByteArray2[local113] = this.aByteArray2[local113 + local13];
		}
		return local100;
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)Lclient!ai;")
	public Class6 method136() {
		@Pc(3) long local3 = this.method132();
		@Pc(16) Class local16 = ai.class;
		synchronized (ai.class) {
			@Pc(32) Class2_Sub24 local32;
			if (Static103.aClass16_8 == null) {
				Static103.aClass16_8 = new Class16(4096);
			} else {
				for (local32 = (Class2_Sub24) Static103.aClass16_8.method479(local3); local32 != null; local32 = (Class2_Sub24) Static103.aClass16_8.method474()) {
					if (this.method131(local32.aClass6_1182)) {
						return local32.aClass6_1182;
					}
				}
			}
			local32 = new Class2_Sub24();
			this.aBoolean6 = false;
			local32.aClass6_1182 = this;
			Static103.aClass16_8.method480(local32, local3);
			return this;
		}
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(BLclient!ai;)Z")
	public boolean method137(@OriginalArg(1) Class6 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt165 == this.anInt165) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt165; local27++) {
				@Pc(34) byte local34 = this.aByteArray2[local27];
				@Pc(39) byte local39 = arg0.aByteArray2[local27];
				if (local34 >= 65 && local34 <= 90 || local34 >= -64 && local34 <= -34 && local34 != -41) {
					local34 = (byte) (local34 + 32);
				}
				if (local39 >= 65 && local39 <= 90 || local39 >= -64 && local39 <= -34 && local39 != -41) {
					local39 = (byte) (local39 + 32);
				}
				if (local34 != local39) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}
