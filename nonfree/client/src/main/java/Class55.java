import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class55 implements Interface2 {

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	public int anInt2411;

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
	private int anInt2436;

	@OriginalMember(owner = "client!rc", name = "S", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "Z")
	private boolean aBoolean114 = true;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)Lclient!rc;")
	public Class55 method1637() {
		@Pc(3) int local3 = 0;
		@Pc(11) Class55 local11 = new Class55();
		local11.anInt2411 = 0;
		local11.aByteArray12 = new byte[12];
		for (@Pc(25) int local25 = 0; local25 < this.anInt2411; local25++) {
			if (this.aByteArray12[local25] >= 65 && this.aByteArray12[local25] <= 90) {
				local11.aByteArray12[local3++] = (byte) (this.aByteArray12[local25] + 32);
				local11.anInt2411 = local3;
			} else if (this.aByteArray12[local25] >= 97 && this.aByteArray12[local25] <= 122 || this.aByteArray12[local25] >= 48 && this.aByteArray12[local25] <= 57) {
				local11.aByteArray12[local3++] = this.aByteArray12[local25];
				local11.anInt2411 = local3;
			} else if (local3 > 0) {
				local11.aByteArray12[local3++] = 95;
			}
			if (local3 == 12) {
				break;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)I")
	private int method1638() {
		for (@Pc(10) int local10 = 0; local10 < this.anInt2411; local10++) {
			if (this.aByteArray12[local10] == 32) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)J")
	public long method1639() {
		@Pc(12) long local12 = 0L;
		for (@Pc(14) int local14 = 0; local14 < this.anInt2411 && local14 < 12; local14++) {
			local12 *= 37L;
			@Pc(25) byte local25 = this.aByteArray12[local14];
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

	@OriginalMember(owner = "client!rc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLclient!rc;)Z")
	public boolean method1640(@OriginalArg(1) Class55 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt2411 == this.anInt2411) {
			if (!this.aBoolean114 || !arg0.aBoolean114) {
				if (this.anInt2436 == 0) {
					this.anInt2436 = this.method1664();
					if (this.anInt2436 == 0) {
						this.anInt2436 = 1;
					}
				}
				if (arg0.anInt2436 == 0) {
					arg0.anInt2436 = arg0.method1664();
					if (arg0.anInt2436 == 0) {
						arg0.anInt2436 = 1;
					}
				}
				if (arg0.anInt2436 != this.anInt2436) {
					return false;
				}
			}
			for (@Pc(79) int local79 = 0; local79 < this.anInt2411; local79++) {
				if (arg0.aByteArray12[local79] != this.aByteArray12[local79]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public void method1641(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray12, 0, this.anInt2411, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray12, 0, this.anInt2411);
		}
		arg0.drawString(local18, arg1, arg2);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!rc;I)Z")
	public boolean method1642(@OriginalArg(0) Class55 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2411 == arg0.anInt2411) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt2411; local27++) {
				@Pc(34) byte local34 = arg0.aByteArray12[local27];
				@Pc(39) byte local39 = this.aByteArray12[local27];
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

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)I")
	public int method1644() {
		return this.method1662();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLclient!rc;)I")
	public int method1645(@OriginalArg(1) Class55 arg0) {
		return this.method1658(arg0);
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)Lclient!rc;")
	public Class55 method1646() {
		@Pc(5) Class55 local5 = new Class55();
		@Pc(19) boolean local19 = true;
		local5.anInt2411 = this.anInt2411;
		local5.aByteArray12 = new byte[this.anInt2411];
		for (@Pc(30) int local30 = 0; local30 < this.anInt2411; local30++) {
			@Pc(37) byte local37 = this.aByteArray12[local30];
			if (local37 >= 97 && local37 <= 122 || local37 >= -32 && local37 <= -2 && local37 != -9) {
				if (local19) {
					local37 = (byte) (local37 - 32);
				}
				local19 = false;
			} else if (local37 >= 65 && local37 <= 90 || local37 >= -64 && local37 <= -34 && local37 != -41) {
				if (!local19) {
					local37 = (byte) (local37 + 32);
				}
				local19 = false;
			}
			if (local37 == 46 || local37 == 33 || local37 == 63) {
				local19 = true;
			}
			local5.aByteArray12[local30] = local37;
		}
		return local5;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)Lclient!rc;")
	public Class55 method1647(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		} else if (this.aBoolean114) {
			this.anInt2436 = 0;
			if (this.anInt2411 == this.aByteArray12.length) {
				@Pc(38) int local38;
				for (local38 = 1; local38 <= this.anInt2411; local38 += local38) {
				}
				@Pc(54) byte[] local54 = new byte[local38];
				Static120.method1341(this.aByteArray12, 0, local54, 0, this.anInt2411);
				this.aByteArray12 = local54;
			}
			this.aByteArray12[this.anInt2411++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(IB)I")
	public int method1648(@OriginalArg(0) int arg0) {
		return this.aByteArray12[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)Lclient!rc;")
	public Class55 method1649() {
		@Pc(7) Class55 local7 = new Class55();
		local7.anInt2411 = this.anInt2411;
		local7.aByteArray12 = new byte[this.anInt2411];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2411; local18++) {
			local7.aByteArray12[local18] = 42;
		}
		return local7;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)Lclient!rc;")
	public Class55 method1650() {
		if (!this.aBoolean114) {
			throw new IllegalArgumentException();
		}
		this.anInt2436 = 0;
		if (this.aByteArray12.length != this.anInt2411) {
			@Pc(27) byte[] local27 = new byte[this.anInt2411];
			Static120.method1341(this.aByteArray12, 0, local27, 0, this.anInt2411);
			this.aByteArray12 = local27;
		}
		return this;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Z")
	private boolean method1651() {
		@Pc(3) boolean local3 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt2411; local21++) {
			@Pc(30) int local30 = this.aByteArray12[local21] & 0xFF;
			if (local21 == 0) {
				if (local30 == 45) {
					local3 = true;
					continue;
				}
				if (local30 == 43) {
					continue;
				}
			}
			if (local30 >= 48 && local30 <= 57) {
				local30 -= 48;
			} else if (local30 >= 65 && local30 <= 90) {
				local30 -= 55;
			} else if (local30 >= 97 && local30 <= 122) {
				local30 -= 87;
			} else {
				return false;
			}
			if (local30 >= 10) {
				return false;
			}
			if (local3) {
				local30 = -local30;
			}
			@Pc(104) int local104 = local30 + local19 * 10;
			if (local19 != local104 / 10) {
				return false;
			}
			local19 = local104;
			local17 = true;
		}
		return local17;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
	public int method1652(@OriginalArg(1) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray12, 0, this.anInt2411, "ISO-8859-1");
		} catch (@Pc(22) UnsupportedEncodingException local22) {
			local13 = new String(this.aByteArray12, 0, this.anInt2411);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!rc;B)Lclient!rc;")
	public Class55 method1653(@OriginalArg(0) Class55 arg0) {
		if (!this.aBoolean114) {
			throw new IllegalArgumentException();
		}
		this.anInt2436 = 0;
		if (this.aByteArray12.length < this.anInt2411 + arg0.anInt2411) {
			@Pc(31) int local31;
			for (local31 = 1; local31 < arg0.anInt2411 + this.anInt2411; local31 += local31) {
			}
			@Pc(47) byte[] local47 = new byte[local31];
			Static120.method1341(this.aByteArray12, 0, local47, 0, this.anInt2411);
			this.aByteArray12 = local47;
		}
		Static120.method1341(arg0.aByteArray12, 0, this.aByteArray12, this.anInt2411, arg0.anInt2411);
		this.anInt2411 += arg0.anInt2411;
		return this;
	}

	@OriginalMember(owner = "client!rc", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1664();
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)Lclient!rc;")
	public Class55 method1654() {
		@Pc(8) int local8 = this.anInt2411;
		@Pc(10) int local10;
		for (local10 = 0; this.anInt2411 > local10 && (this.aByteArray12[local10] >= 0 && this.aByteArray12[local10] <= 32 || (this.aByteArray12[local10] & 0xFF) == 160); local10++) {
		}
		while (local10 < local8 && (this.aByteArray12[local8 - 1] >= 0 && this.aByteArray12[local8 - 1] <= 32 || (this.aByteArray12[local8 - 1] & 0xFF) == 160)) {
			local8--;
		}
		if (local10 == 0 && local8 == this.anInt2411) {
			return this;
		}
		@Pc(97) Class55 local97 = new Class55();
		local97.anInt2411 = local8 - local10;
		local97.aByteArray12 = new byte[local97.anInt2411];
		for (@Pc(117) int local117 = 0; local117 < local97.anInt2411; local117++) {
			local97.aByteArray12[local117] = this.aByteArray12[local117 + local10];
		}
		return local97;
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)Lclient!rc;")
	public Class55 method1655() {
		@Pc(7) boolean local7 = true;
		@Pc(16) Class55 local16 = new Class55();
		local16.anInt2411 = this.anInt2411;
		local16.aByteArray12 = new byte[this.anInt2411];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2411; local27++) {
			@Pc(34) byte local34 = this.aByteArray12[local27];
			if (local34 == 95) {
				local16.aByteArray12[local27] = 32;
				local7 = true;
			} else if (local34 >= 97 && local34 <= 122 && local7) {
				local7 = false;
				local16.aByteArray12[local27] = (byte) (local34 - 32);
			} else {
				local16.aByteArray12[local27] = local34;
				local7 = false;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)Z")
	public boolean method1656() {
		return this.method1651();
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)I")
	public int method1657() {
		return this.method1638();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!rc;)I")
	private int method1658(@OriginalArg(2) Class55 arg0) {
		@Pc(5) int[] local5 = new int[arg0.anInt2411];
		@Pc(8) int[] local8 = new int[256];
		@Pc(12) int[] local12 = new int[arg0.anInt2411];
		for (@Pc(14) int local14 = 0; local14 < local8.length; local14++) {
			local8[local14] = arg0.anInt2411;
		}
		for (@Pc(32) int local32 = 1; local32 <= arg0.anInt2411; local32++) {
			local5[local32 - 1] = (arg0.anInt2411 << 1) - local32;
			local8[arg0.aByteArray12[local32 - 1] & 0xFF] = arg0.anInt2411 - local32;
		}
		@Pc(75) int local75 = arg0.anInt2411 + 1;
		for (@Pc(78) int local78 = arg0.anInt2411; local78 > 0; local78--) {
			local12[local78 - 1] = local75;
			while (local75 <= arg0.anInt2411 && arg0.aByteArray12[local78 - 1] != arg0.aByteArray12[local75 - 1]) {
				if (arg0.anInt2411 - local78 <= local5[local75 + -1]) {
					local5[local75 - 1] = arg0.anInt2411 - local78;
				}
				local75 = local12[local75 - 1];
			}
			local75--;
		}
		@Pc(138) int local138 = local75;
		local75 = arg0.anInt2411 + 1 - local75;
		@Pc(148) int local148 = 0;
		@Pc(150) int local150 = 1;
		while (local150 <= local75) {
			local12[local150 - 1] = local148;
			while (local148 >= 1 && arg0.aByteArray12[local148 - 1] != arg0.aByteArray12[local150 - 1]) {
				local148 = local12[local148 - 1];
			}
			local150++;
			local148++;
		}
		@Pc(193) int local193 = 1;
		@Pc(197) int local197;
		while (arg0.anInt2411 > local138) {
			for (local197 = local193; local197 <= local138; local197++) {
				if (arg0.anInt2411 + local138 - local197 <= local5[local197 - 1]) {
					local5[local197 - 1] = arg0.anInt2411 + local138 - local197;
				}
			}
			local193 = local138 + 1;
			local138 = local138 + local75 - local12[local75 + -1];
			local75 = local12[local75 - 1];
		}
		@Pc(276) int local276;
		for (local197 = arg0.anInt2411 - 1; local197 < this.anInt2411; local197 += Math.max(local8[this.aByteArray12[local197] & 0xFF], local5[local276])) {
			for (local276 = arg0.anInt2411 - 1; local276 >= 0 && arg0.aByteArray12[local276] == this.aByteArray12[local197]; local276--) {
				local197--;
			}
			if (local276 == -1) {
				return local197 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Lclient!rc;I)Z")
	public boolean method1659(@OriginalArg(0) Class55 arg0) {
		if (this.anInt2411 < arg0.anInt2411) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt2411; local14++) {
			if (arg0.aByteArray12[local14] != this.aByteArray12[local14]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(B)[B")
	public byte[] method1661() {
		@Pc(7) byte[] local7 = new byte[this.anInt2411];
		Static120.method1341(this.aByteArray12, 0, local7, 0, this.anInt2411);
		return local7;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)I")
	private int method1662() {
		@Pc(5) boolean local5 = false;
		@Pc(15) int local15 = 0;
		@Pc(17) boolean local17 = false;
		for (@Pc(19) int local19 = 0; local19 < this.anInt2411; local19++) {
			@Pc(27) int local27 = this.aByteArray12[local19] & 0xFF;
			if (local19 == 0) {
				if (local27 == 45) {
					local5 = true;
					continue;
				}
				if (local27 == 43) {
					continue;
				}
			}
			if (local27 >= 48 && local27 <= 57) {
				local27 -= 48;
			} else if (local27 >= 65 && local27 <= 90) {
				local27 -= 55;
			} else if (local27 >= 97 && local27 <= 122) {
				local27 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (local27 >= 10) {
				throw new NumberFormatException();
			}
			if (local5) {
				local27 = -local27;
			}
			@Pc(88) int local88 = local27 + local15 * 10;
			if (local88 / 10 != local15) {
				throw new NumberFormatException();
			}
			local15 = local88;
			local17 = true;
		}
		if (!local17) {
			throw new NumberFormatException();
		}
		return local15;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!rc;B)Lclient!rc;")
	public Class55 method1663(@OriginalArg(0) int arg0, @OriginalArg(1) Class55 arg1) {
		if (!this.aBoolean114) {
			throw new IllegalArgumentException();
		} else if (arg0 > this.anInt2411) {
			throw new IllegalArgumentException();
		} else {
			this.anInt2436 = 0;
			if (arg1.anInt2411 + arg0 > this.aByteArray12.length) {
				@Pc(41) int local41;
				for (local41 = 1; local41 < arg0 + arg1.anInt2411; local41 += local41) {
				}
				@Pc(60) byte[] local60 = new byte[local41];
				Static120.method1341(this.aByteArray12, 0, local60, 0, this.anInt2411);
				this.aByteArray12 = local60;
			}
			Static120.method1341(arg1.aByteArray12, 0, this.aByteArray12, arg0, arg1.anInt2411);
			if (this.anInt2411 < arg0 + arg1.anInt2411) {
				this.anInt2411 = arg1.anInt2411 + arg0;
			}
			return this;
		}
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)I")
	public int method1664() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2411; local7++) {
			local5 = (this.aByteArray12[local7] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)Lclient!rc;")
	public Class55 method1665() {
		@Pc(3) long local3 = this.method1672();
		@Pc(16) Class local16 = rc.class;
		synchronized (rc.class) {
			@Pc(26) Class6_Sub10 local26;
			if (Static14.aClass38_9 == null) {
				Static14.aClass38_9 = new Class38(4096);
			} else {
				for (local26 = (Class6_Sub10) Static14.aClass38_9.method1183(local3); local26 != null; local26 = (Class6_Sub10) Static14.aClass38_9.method1179()) {
					if (this.method1640(local26.aClass55_784)) {
						return local26.aClass55_784;
					}
				}
			}
			local26 = new Class6_Sub10();
			local26.aClass55_784 = this;
			this.aBoolean114 = false;
			Static14.aClass38_9.method1184(local26, local3);
			return this;
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(Lclient!rc;I)Z")
	public boolean method1666(@OriginalArg(0) Class55 arg0) {
		if (this.anInt2411 < arg0.anInt2411) {
			return false;
		}
		@Pc(23) int local23 = this.anInt2411 - arg0.anInt2411;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2411; local25++) {
			if (arg0.aByteArray12[local25] != this.aByteArray12[local23 + local25]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!rc;)I")
	public int method1667(@OriginalArg(1) Class55 arg0) {
		@Pc(17) int local17;
		if (arg0.anInt2411 >= this.anInt2411) {
			local17 = this.anInt2411;
		} else {
			local17 = arg0.anInt2411;
		}
		for (@Pc(24) int local24 = 0; local24 < local17; local24++) {
			if (arg0.aByteArray12[local24] > this.aByteArray12[local24]) {
				return -1;
			}
			if (arg0.aByteArray12[local24] < this.aByteArray12[local24]) {
				return 1;
			}
		}
		if (arg0.anInt2411 > this.anInt2411) {
			return -1;
		} else if (arg0.anInt2411 < this.anInt2411) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(II)Lclient!rc;")
	public Class55 method1668(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(19) Class55 local19 = new Class55();
		local19.aByteArray12 = new byte[this.anInt2411 + 1];
		local19.anInt2411 = this.anInt2411 + 1;
		Static120.method1341(this.aByteArray12, 0, local19.aByteArray12, 0, this.anInt2411);
		local19.aByteArray12[this.anInt2411] = (byte) arg0;
		return local19;
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(B)Lclient!rc;")
	public Class55 method1669() {
		@Pc(9) Class55 local9 = new Class55();
		local9.anInt2411 = this.anInt2411;
		local9.aByteArray12 = new byte[this.anInt2411];
		for (@Pc(25) int local25 = 0; local25 < this.anInt2411; local25++) {
			@Pc(32) byte local32 = this.aByteArray12[local25];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local9.aByteArray12[local25] = local32;
		}
		return local9;
	}

	@OriginalMember(owner = "client!rc", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[BIII)I")
	public int method1670(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		Static120.method1341(this.aByteArray12, 0, arg1, arg0, arg2);
		return arg2;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZI)Lclient!rc;")
	public Class55 method1671(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class55 local7 = new Class55();
		local7.anInt2411 = arg1 - arg0;
		local7.aByteArray12 = new byte[arg1 - arg0];
		Static120.method1341(this.aByteArray12, arg0, local7.aByteArray12, 0, local7.anInt2411);
		return local7;
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(B)J")
	private long method1672() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2411; local7++) {
			local5 = (long) (this.aByteArray12[local7] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(IB)Lclient!rc;")
	public Class55 method1673(@OriginalArg(0) int arg0) {
		return this.method1671(arg0, this.anInt2411);
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)I")
	public int method1674() {
		return this.anInt2411;
	}
}
