import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class23 implements Interface2 {

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
	public int anInt1053;

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
	private int anInt1071;

	@OriginalMember(owner = "client!ed", name = "D", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!ed", name = "M", descriptor = "Z")
	private boolean aBoolean50 = true;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)Lclient!ed;")
	public Class23 method630() {
		@Pc(5) Class23 local5 = new Class23();
		local5.aByteArray10 = new byte[12];
		local5.anInt1053 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt1053; local26++) {
			if (this.aByteArray10[local26] >= 65 && this.aByteArray10[local26] <= 90) {
				local5.aByteArray10[local24++] = (byte) (this.aByteArray10[local26] + 97 - 65);
				local5.anInt1053 = local24;
			} else if (this.aByteArray10[local26] >= 97 && this.aByteArray10[local26] <= 122 || this.aByteArray10[local26] >= 48 && this.aByteArray10[local26] <= 57) {
				local5.aByteArray10[local24++] = this.aByteArray10[local26];
				local5.anInt1053 = local24;
			} else if (local24 > 0) {
				local5.aByteArray10[local24++] = 95;
			}
			if (local24 == 12) {
				break;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ed", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class23)) {
			throw new IllegalArgumentException();
		}
		return this.method651((Class23) arg0);
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)Z")
	public boolean method631() {
		return this.method645();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Lclient!ed;")
	public Class23 method632(@OriginalArg(1) int arg0) {
		return this.method635(arg0, this.anInt1053);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	public void method633(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray10, 0, this.anInt1053, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray10, 0, this.anInt1053);
		}
		arg0.drawString(local9, arg2, arg1);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!ed;)Z")
	public boolean method634(@OriginalArg(1) Class23 arg0) {
		if (this.anInt1053 < arg0.anInt1053) {
			return false;
		}
		for (@Pc(24) int local24 = 0; local24 < arg0.anInt1053; local24++) {
			if (this.aByteArray10[local24] != arg0.aByteArray10[local24]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ed", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method657();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BII)Lclient!ed;")
	public Class23 method635(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class23 local7 = new Class23();
		local7.anInt1053 = arg1 - arg0;
		local7.aByteArray10 = new byte[arg1 - arg0];
		Static184.method628(this.aByteArray10, arg0, local7.aByteArray10, 0, local7.anInt1053);
		return local7;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ed;I)Z")
	public boolean method637(@OriginalArg(0) Class23 arg0) {
		if (arg0.anInt1053 > this.anInt1053) {
			return false;
		}
		@Pc(28) int local28 = this.anInt1053 - arg0.anInt1053;
		for (@Pc(30) int local30 = 0; local30 < arg0.anInt1053; local30++) {
			if (this.aByteArray10[local30 + local28] != arg0.aByteArray10[local30]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)Lclient!ed;")
	public Class23 method638() {
		@Pc(9) Class23 local9 = new Class23();
		local9.anInt1053 = this.anInt1053;
		local9.aByteArray10 = new byte[this.anInt1053];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1053; local25++) {
			@Pc(32) byte local32 = this.aByteArray10[local25];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local9.aByteArray10[local25] = local32;
		}
		return local9;
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)Lclient!ed;")
	public Class23 method639() {
		@Pc(9) Class23 local9 = new Class23();
		local9.anInt1053 = this.anInt1053;
		local9.aByteArray10 = new byte[this.anInt1053];
		@Pc(20) byte local20 = 2;
		for (@Pc(22) int local22 = 0; local22 < this.anInt1053; local22++) {
			@Pc(29) byte local29 = this.aByteArray10[local22];
			if (local29 >= 97 && local29 <= 122 || local29 >= -32 && local29 <= -2 && local29 != -9) {
				if (local20 == 2) {
					local29 = (byte) (local29 - 32);
				}
				local20 = 0;
			} else if (local29 >= 65 && local29 <= 90 || !(local29 < -64 || local29 > -34 || local29 == -41)) {
				if (local20 == 0) {
					local29 = (byte) (local29 + 32);
				}
				local20 = 0;
			} else if (local29 == 46 || local29 == 33 || local29 == 63) {
				local20 = 2;
			} else if (local29 != 32) {
				local20 = 1;
			} else if (local20 != 2) {
				local20 = 1;
			}
			local9.aByteArray10[local22] = local29;
		}
		return local9;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)I")
	public int method640(@OriginalArg(0) int arg0) {
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anInt1053; local25++) {
			@Pc(40) int local40 = this.aByteArray10[local25] & 0xFF;
			if (local25 == 0) {
				if (local40 == 45) {
					local19 = true;
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
				throw new NumberFormatException();
			}
			if (arg0 <= local40) {
				throw new NumberFormatException();
			}
			if (local19) {
				local40 = -local40;
			}
			@Pc(114) int local114 = arg0 * local23 + local40;
			if (local23 != local114 / arg0) {
				throw new NumberFormatException();
			}
			local21 = true;
			local23 = local114;
		}
		if (!local21) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)Lclient!ed;")
	public Class23 method641() {
		@Pc(3) int local3 = 0;
		@Pc(6) int local6 = this.anInt1053;
		while (this.anInt1053 > local3 && (this.aByteArray10[local3] >= 0 && this.aByteArray10[local3] <= 32 || (this.aByteArray10[local3] & 0xFF) == 160)) {
			local3++;
		}
		while (local3 < local6 && (this.aByteArray10[local6 - 1] >= 0 && this.aByteArray10[local6 - 1] <= 32 || (this.aByteArray10[local6 - 1] & 0xFF) == 160)) {
			local6--;
		}
		if (local3 == 0 && local6 == this.anInt1053) {
			return this;
		}
		@Pc(99) Class23 local99 = new Class23();
		local99.anInt1053 = local6 - local3;
		local99.aByteArray10 = new byte[local99.anInt1053];
		for (@Pc(112) int local112 = 0; local112 < local99.anInt1053; local112++) {
			local99.aByteArray10[local112] = this.aByteArray10[local3 + local112];
		}
		return local99;
	}

	@OriginalMember(owner = "client!ed", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)I")
	public int method642() {
		return this.anInt1053;
	}

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "(I)J")
	public long method643() {
		@Pc(13) long local13 = 0L;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1053 && local15 < 12; local15++) {
			@Pc(22) byte local22 = this.aByteArray10[local15];
			local13 *= 37L;
			if (local22 >= 65 && local22 <= 90) {
				local13 += local22 - 64;
			} else if (local22 >= 97 && local22 <= 122) {
				local13 += local22 + 1 - 97;
			} else if (local22 >= 48 && local22 <= 57) {
				local13 += local22 + 27 - 48;
			}
		}
		while (local13 % 37L == 0L && local13 != 0L) {
			local13 /= 37L;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(ILclient!ed;)Z")
	public boolean method644(@OriginalArg(1) Class23 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt1053 == this.anInt1053) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt1053; local23++) {
				@Pc(30) byte local30 = arg0.aByteArray10[local23];
				if (local30 >= 65 && local30 <= 90 || local30 >= -64 && local30 <= -34 && local30 != -41) {
					local30 = (byte) (local30 + 32);
				}
				@Pc(63) byte local63 = this.aByteArray10[local23];
				if (local63 >= 65 && local63 <= 90 || local63 >= -64 && local63 <= -34 && local63 != -41) {
					local63 = (byte) (local63 + 32);
				}
				if (local30 != local63) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(IB)Z")
	private boolean method645() {
		@Pc(21) boolean local21 = false;
		@Pc(27) boolean local27 = false;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt1053; local31++) {
			@Pc(40) int local40 = this.aByteArray10[local31] & 0xFF;
			if (local31 == 0) {
				if (local40 == 45) {
					local27 = true;
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
			if (local27) {
				local40 = -local40;
			}
			@Pc(111) int local111 = local40 + local29 * 10;
			if (local29 != local111 / 10) {
				return false;
			}
			local29 = local111;
			local21 = true;
		}
		return local21;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
	public int method646(@OriginalArg(1) FontMetrics arg0) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray10, 0, this.anInt1053, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray10, 0, this.anInt1053);
		}
		return arg0.stringWidth(local18);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)Lclient!ed;")
	public Class23 method647() {
		@Pc(5) Class23 local5 = new Class23();
		local5.anInt1053 = this.anInt1053;
		local5.aByteArray10 = new byte[this.anInt1053];
		for (@Pc(29) int local29 = 0; local29 < this.anInt1053; local29++) {
			local5.aByteArray10[local29] = 42;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)J")
	private long method648() {
		@Pc(1) long local1 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1053; local7++) {
			local1 = (local1 << 5) + (long) (this.aByteArray10[local7] & 0xFF) - local1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([BIIIB)I")
	public int method649(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static184.method628(this.aByteArray10, 0, arg0, arg1, arg2);
		return arg2;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZI)I")
	public int method650(@OriginalArg(1) int arg0) {
		return this.aByteArray10[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(Lclient!ed;I)Z")
	public boolean method651(@OriginalArg(0) Class23 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1053 == arg0.anInt1053) {
			if (!this.aBoolean50 || !arg0.aBoolean50) {
				if (this.anInt1071 == 0) {
					this.anInt1071 = this.method657();
					if (this.anInt1071 == 0) {
						this.anInt1071 = 1;
					}
				}
				if (arg0.anInt1071 == 0) {
					arg0.anInt1071 = arg0.method657();
					if (arg0.anInt1071 == 0) {
						arg0.anInt1071 = 1;
					}
				}
				if (this.anInt1071 != arg0.anInt1071) {
					return false;
				}
			}
			for (@Pc(79) int local79 = 0; local79 < this.anInt1053; local79++) {
				if (this.aByteArray10[local79] != arg0.aByteArray10[local79]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)Ljava/net/URL;")
	public URL method652() throws MalformedURLException {
		return new URL(new String(this.aByteArray10, 0, this.anInt1053));
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(B)[B")
	public byte[] method653() {
		@Pc(7) byte[] local7 = new byte[this.anInt1053];
		Static184.method628(this.aByteArray10, 0, local7, 0, this.anInt1053);
		return local7;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!ed;I)I")
	public int method654(@OriginalArg(1) Class23 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(12) int[] local12 = new int[arg0.anInt1053];
		@Pc(16) int[] local16 = new int[arg0.anInt1053];
		for (@Pc(26) int local26 = 0; local26 < local8.length; local26++) {
			local8[local26] = arg0.anInt1053;
		}
		for (@Pc(40) int local40 = 1; local40 <= arg0.anInt1053; local40++) {
			local12[local40 - 1] = (arg0.anInt1053 << 1) - local40;
			local8[arg0.aByteArray10[local40 - 1] & 0xFF] = arg0.anInt1053 - local40;
		}
		@Pc(83) int local83 = arg0.anInt1053 + 1;
		@Pc(86) int local86 = arg0.anInt1053;
		while (local86 > 0) {
			local16[local86 - 1] = local83;
			while (arg0.anInt1053 >= local83 && arg0.aByteArray10[local86 - 1] != arg0.aByteArray10[local83 - 1]) {
				if (arg0.anInt1053 - local86 <= local12[local83 + -1]) {
					local12[local83 - 1] = arg0.anInt1053 - local86;
				}
				local83 = local16[local83 - 1];
			}
			local86--;
			local83--;
		}
		@Pc(146) int local146 = local83;
		@Pc(148) int local148 = 1;
		@Pc(150) int local150 = 0;
		local83 = arg0.anInt1053 + 1 - local83;
		@Pc(160) int local160 = 1;
		while (local160 <= local83) {
			local16[local160 - 1] = local150;
			while (local150 >= 1 && arg0.aByteArray10[local160 - 1] != arg0.aByteArray10[local150 - 1]) {
				local150 = local16[local150 - 1];
			}
			local160++;
			local150++;
		}
		@Pc(201) int local201;
		while (local146 < arg0.anInt1053) {
			for (local201 = local148; local201 <= local146; local201++) {
				if (local12[local201 - 1] >= arg0.anInt1053 + local146 - local201) {
					local12[local201 - 1] = local146 + arg0.anInt1053 - local201;
				}
			}
			local148 = local146 + 1;
			local146 = local83 + local146 - local16[local83 - 1];
			local83 = local16[local83 - 1];
		}
		@Pc(274) int local274;
		for (local201 = arg1 + arg0.anInt1053 - 1; local201 < this.anInt1053; local201 += Math.max(local8[this.aByteArray10[local201] & 0xFF], local12[local274])) {
			for (local274 = arg0.anInt1053 - 1; local274 >= 0 && arg0.aByteArray10[local274] == this.aByteArray10[local201]; local274--) {
				local201--;
			}
			if (local274 == -1) {
				return local201 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLclient!ed;)I")
	public int method655(@OriginalArg(1) Class23 arg0) {
		return this.method654(arg0, 0);
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(Lclient!ed;I)I")
	public int method656(@OriginalArg(0) Class23 arg0) {
		@Pc(17) int local17;
		if (arg0.anInt1053 < this.anInt1053) {
			local17 = arg0.anInt1053;
		} else {
			local17 = this.anInt1053;
		}
		for (@Pc(29) int local29 = 0; local29 < local17; local29++) {
			if ((arg0.aByteArray10[local29] & 0xFF) > (this.aByteArray10[local29] & 0xFF)) {
				return -1;
			}
			if ((arg0.aByteArray10[local29] & 0xFF) < (this.aByteArray10[local29] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt1053 < arg0.anInt1053) {
			return -1;
		} else if (arg0.anInt1053 < this.anInt1053) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "(I)I")
	public int method657() {
		@Pc(5) int local5 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1053; local15++) {
			local5 = (this.aByteArray10[local15] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "(I)I")
	public int method658() {
		return this.method640(10);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)I")
	public int method660(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte local8 = (byte) arg1;
		for (@Pc(10) int local10 = arg0; local10 < this.anInt1053; local10++) {
			if (local8 == this.aByteArray10[local10]) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)Lclient!ed;")
	public Class23 method661(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean50) {
			this.anInt1071 = 0;
			if (this.aByteArray10.length == this.anInt1053) {
				@Pc(52) int local52;
				for (local52 = 1; local52 <= this.anInt1053; local52 += local52) {
				}
				@Pc(69) byte[] local69 = new byte[local52];
				Static184.method628(this.aByteArray10, 0, local69, 0, this.anInt1053);
				this.aByteArray10 = local69;
			}
			this.aByteArray10[this.anInt1053++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(BLclient!ed;)I")
	public int method662(@OriginalArg(1) Class23 arg0) {
		@Pc(13) int local13;
		if (arg0.anInt1053 < this.anInt1053) {
			local13 = arg0.anInt1053;
		} else {
			local13 = this.anInt1053;
		}
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			if (Static49.anIntArray159[this.aByteArray10[local20] & 0xFF] < Static49.anIntArray159[arg0.aByteArray10[local20] & 0xFF]) {
				return -1;
			}
			if (Static49.anIntArray159[this.aByteArray10[local20] & 0xFF] > Static49.anIntArray159[arg0.aByteArray10[local20] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt1053 < arg0.anInt1053) {
			return -1;
		} else if (this.anInt1053 > arg0.anInt1053) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ed;B)Lclient!ed;")
	public Class23 method663(@OriginalArg(0) Class23 arg0) {
		if (!this.aBoolean50) {
			throw new IllegalArgumentException();
		}
		this.anInt1071 = 0;
		if (this.aByteArray10.length < arg0.anInt1053 + this.anInt1053) {
			@Pc(30) int local30;
			for (local30 = 1; local30 < arg0.anInt1053 + this.anInt1053; local30 += local30) {
			}
			@Pc(46) byte[] local46 = new byte[local30];
			Static184.method628(this.aByteArray10, 0, local46, 0, this.anInt1053);
			this.aByteArray10 = local46;
		}
		Static184.method628(arg0.aByteArray10, 0, this.aByteArray10, this.anInt1053, arg0.anInt1053);
		this.anInt1053 += arg0.anInt1053;
		return this;
	}

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "(I)Lclient!ed;")
	public Class23 method664() {
		if (!this.aBoolean50) {
			throw new IllegalArgumentException();
		}
		this.anInt1071 = 0;
		if (this.aByteArray10.length != this.anInt1053) {
			@Pc(23) byte[] local23 = new byte[this.anInt1053];
			Static184.method628(this.aByteArray10, 0, local23, 0, this.anInt1053);
			this.aByteArray10 = local23;
		}
		return this;
	}

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "(I)Lclient!ed;")
	public Class23 method665() {
		@Pc(3) long local3 = this.method648();
		@Pc(16) Class local16 = ed.class;
		synchronized (ed.class) {
			@Pc(40) Class1_Sub22 local40;
			if (Static140.aClass10_11 == null) {
				Static140.aClass10_11 = new Class10(4096);
			} else {
				for (local40 = (Class1_Sub22) Static140.aClass10_11.method256(local3); local40 != null; local40 = (Class1_Sub22) Static140.aClass10_11.method265()) {
					if (this.method651(local40.aClass23_1476)) {
						return local40.aClass23_1476;
					}
				}
			}
			local40 = new Class1_Sub22();
			local40.aClass23_1476 = this;
			this.aBoolean50 = false;
			Static140.aClass10_11.method263(local40, local3);
			return this;
		}
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(II)Lclient!ed;")
	public Class23 method666(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(29) Class23 local29 = new Class23();
		local29.aByteArray10 = new byte[this.anInt1053 + 1];
		local29.anInt1053 = this.anInt1053 + 1;
		Static184.method628(this.aByteArray10, 0, local29.aByteArray10, 0, this.anInt1053);
		local29.aByteArray10[this.anInt1053] = (byte) arg0;
		return local29;
	}

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "(I)Lclient!ed;")
	public Class23 method667() {
		@Pc(9) Class23 local9 = new Class23();
		@Pc(11) boolean local11 = true;
		local9.anInt1053 = this.anInt1053;
		local9.aByteArray10 = new byte[this.anInt1053];
		for (@Pc(30) int local30 = 0; local30 < this.anInt1053; local30++) {
			@Pc(37) byte local37 = this.aByteArray10[local30];
			if (local37 == 95) {
				local9.aByteArray10[local30] = 32;
				local11 = true;
			} else if (local37 >= 97 && local37 <= 122 && local11) {
				local11 = false;
				local9.aByteArray10[local30] = (byte) (local37 - 32);
			} else {
				local9.aByteArray10[local30] = local37;
				local11 = false;
			}
		}
		return local9;
	}
}
