import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class62 implements Interface3 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "I")
	private int anInt2612;

	@OriginalMember(owner = "client!v", name = "W", descriptor = "I")
	public int anInt2649;

	@OriginalMember(owner = "client!v", name = "t", descriptor = "Z")
	private boolean aBoolean162 = true;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLjava/awt/FontMetrics;)I")
	public int method1672(@OriginalArg(1) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray25, 0, this.anInt2649, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local13 = new String(this.aByteArray25, 0, this.anInt2649);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!v;B)Lclient!v;")
	public Class62 method1673(@OriginalArg(0) Class62 arg0) {
		if (!this.aBoolean162) {
			throw new IllegalArgumentException();
		}
		this.anInt2612 = 0;
		if (arg0.anInt2649 + this.anInt2649 > this.aByteArray25.length) {
			@Pc(30) int local30;
			for (local30 = 1; local30 < arg0.anInt2649 + this.anInt2649; local30 += local30) {
			}
			@Pc(46) byte[] local46 = new byte[local30];
			Static112.method491(this.aByteArray25, 0, local46, 0, this.anInt2649);
			this.aByteArray25 = local46;
		}
		Static112.method491(arg0.aByteArray25, 0, this.aByteArray25, this.anInt2649, arg0.anInt2649);
		this.anInt2649 += arg0.anInt2649;
		return this;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!v;)I")
	private int method1674(@OriginalArg(2) Class62 arg0) {
		@Pc(5) int[] local5 = new int[arg0.anInt2649];
		@Pc(17) int[] local17 = new int[256];
		@Pc(21) int[] local21 = new int[arg0.anInt2649];
		for (@Pc(23) int local23 = 0; local23 < local17.length; local23++) {
			local17[local23] = arg0.anInt2649;
		}
		for (@Pc(37) int local37 = 1; local37 <= arg0.anInt2649; local37++) {
			local5[local37 - 1] = (arg0.anInt2649 << 1) - local37;
			local17[arg0.aByteArray25[local37 - 1] & 0xFF] = arg0.anInt2649 - local37;
		}
		@Pc(76) int local76 = arg0.anInt2649 + 1;
		for (@Pc(79) int local79 = arg0.anInt2649; local79 > 0; local79--) {
			local21[local79 - 1] = local76;
			while (arg0.anInt2649 >= local76 && arg0.aByteArray25[local79 - 1] != arg0.aByteArray25[local76 - 1]) {
				if (local5[local76 - 1] >= arg0.anInt2649 - local79) {
					local5[local76 - 1] = arg0.anInt2649 - local79;
				}
				local76 = local21[local76 - 1];
			}
			local76--;
		}
		@Pc(146) int local146 = local76;
		@Pc(148) int local148 = 1;
		local76 = arg0.anInt2649 + 1 - local76;
		@Pc(158) int local158 = 0;
		@Pc(160) int local160 = 1;
		while (local76 >= local160) {
			local21[local160 - 1] = local158;
			while (local158 >= 1 && arg0.aByteArray25[local160 - 1] != arg0.aByteArray25[local158 - 1]) {
				local158 = local21[local158 - 1];
			}
			local160++;
			local158++;
		}
		@Pc(205) int local205;
		while (local146 < arg0.anInt2649) {
			for (local205 = local148; local205 <= local146; local205++) {
				if (local5[local205 - 1] >= arg0.anInt2649 + local146 - local205) {
					local5[local205 - 1] = local146 + arg0.anInt2649 - local205;
				}
			}
			local148 = local146 + 1;
			local146 = local76 + local146 - local21[local76 + -1];
			local76 = local21[local76 - 1];
		}
		@Pc(282) int local282;
		for (local205 = arg0.anInt2649 - 1; local205 < this.anInt2649; local205 += Math.max(local17[this.aByteArray25[local205] & 0xFF], local5[local282])) {
			for (local282 = arg0.anInt2649 - 1; local282 >= 0 && arg0.aByteArray25[local282] == this.aByteArray25[local205]; local282--) {
				local205--;
			}
			if (local282 == -1) {
				return local205 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!v;I)Z")
	public boolean method1675(@OriginalArg(0) Class62 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2649 == arg0.anInt2649) {
			if (!this.aBoolean162 || !arg0.aBoolean162) {
				if (this.anInt2612 == 0) {
					this.anInt2612 = this.method1703();
					if (this.anInt2612 == 0) {
						this.anInt2612 = 1;
					}
				}
				if (arg0.anInt2612 == 0) {
					arg0.anInt2612 = arg0.method1703();
					if (arg0.anInt2612 == 0) {
						arg0.anInt2612 = 1;
					}
				}
				if (arg0.anInt2612 != this.anInt2612) {
					return false;
				}
			}
			for (@Pc(70) int local70 = 0; local70 < this.anInt2649; local70++) {
				if (arg0.aByteArray25[local70] != this.aByteArray25[local70]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)I")
	public int method1677() {
		return this.method1683();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)Z")
	public boolean method1678() {
		return this.method1679();
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)Z")
	private boolean method1679() {
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt2649; local21++) {
			@Pc(30) int local30 = this.aByteArray25[local21] & 0xFF;
			if (local21 == 0) {
				if (local30 == 45) {
					local11 = true;
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
			if (local11) {
				local30 = -local30;
			}
			@Pc(99) int local99 = local19 * 10 + local30;
			if (local99 / 10 != local19) {
				return false;
			}
			local19 = local99;
			local13 = true;
		}
		return local13;
	}

	@OriginalMember(owner = "client!v", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!v;)Z")
	public boolean method1680(@OriginalArg(1) Class62 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt2649 == this.anInt2649) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt2649; local26++) {
				@Pc(33) byte local33 = this.aByteArray25[local26];
				if (local33 >= 65 && local33 <= 90 || local33 >= -64 && local33 <= -34 && local33 != -41) {
					local33 = (byte) (local33 + 32);
				}
				@Pc(66) byte local66 = arg0.aByteArray25[local26];
				if (local66 >= 65 && local66 <= 90 || local66 >= -64 && local66 <= -34 && local66 != -41) {
					local66 = (byte) (local66 + 32);
				}
				if (local66 != local33) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Lclient!v;")
	public Class62 method1681() {
		@Pc(3) boolean local3 = true;
		@Pc(11) Class62 local11 = new Class62();
		local11.anInt2649 = this.anInt2649;
		local11.aByteArray25 = new byte[this.anInt2649];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2649; local27++) {
			@Pc(34) byte local34 = this.aByteArray25[local27];
			if (local34 == 95) {
				local11.aByteArray25[local27] = 32;
				local3 = true;
			} else if (local34 >= 97 && local34 <= 122 && local3) {
				local3 = false;
				local11.aByteArray25[local27] = (byte) (local34 - 32);
			} else {
				local11.aByteArray25[local27] = local34;
				local3 = false;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(II)I")
	private int method1682() {
		@Pc(7) boolean local7 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2649; local23++) {
			@Pc(39) int local39 = this.aByteArray25[local23] & 0xFF;
			if (local23 == 0) {
				if (local39 == 45) {
					local7 = true;
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
				throw new NumberFormatException();
			}
			if (local39 >= 10) {
				throw new NumberFormatException();
			}
			if (local7) {
				local39 = -local39;
			}
			@Pc(116) int local116 = local21 * 10 + local39;
			if (local116 / 10 != local21) {
				throw new NumberFormatException();
			}
			local19 = true;
			local21 = local116;
		}
		if (!local19) {
			throw new NumberFormatException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)I")
	private int method1683() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt2649; local15++) {
			if (this.aByteArray25[local15] == 32) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI)Lclient!v;")
	public Class62 method1684(@OriginalArg(1) int arg0) {
		@Pc(3) Class62 local3 = new Class62();
		local3.aByteArray25 = new byte[this.anInt2649 + 1];
		local3.anInt2649 = this.anInt2649 + 1;
		Static112.method491(this.aByteArray25, 0, local3.aByteArray25, 0, this.anInt2649);
		local3.aByteArray25[this.anInt2649] = (byte) arg0;
		return local3;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)Lclient!v;")
	public Class62 method1685(@OriginalArg(1) int arg0) {
		if (!this.aBoolean162) {
			throw new IllegalArgumentException();
		}
		this.anInt2612 = 0;
		if (this.anInt2649 == this.aByteArray25.length) {
			@Pc(27) int local27;
			for (local27 = 1; local27 <= this.anInt2649; local27 += local27) {
			}
			@Pc(40) byte[] local40 = new byte[local27];
			Static112.method491(this.aByteArray25, 0, local40, 0, this.anInt2649);
			this.aByteArray25 = local40;
		}
		this.aByteArray25[this.anInt2649++] = (byte) arg0;
		return this;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([BZIII)I")
	public int method1686(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static112.method491(this.aByteArray25, 0, arg0, arg2, arg1);
		return arg1;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(I)I")
	public int method1688() {
		return this.anInt2649;
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)Lclient!v;")
	public Class62 method1689() {
		if (!this.aBoolean162) {
			throw new IllegalArgumentException();
		}
		this.anInt2612 = 0;
		if (this.anInt2649 != this.aByteArray25.length) {
			@Pc(28) byte[] local28 = new byte[this.anInt2649];
			Static112.method491(this.aByteArray25, 0, local28, 0, this.anInt2649);
			this.aByteArray25 = local28;
		}
		return this;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Lclient!v;B)Z")
	public boolean method1690(@OriginalArg(0) Class62 arg0) {
		if (arg0.anInt2649 > this.anInt2649) {
			return false;
		}
		for (@Pc(23) int local23 = 0; local23 < arg0.anInt2649; local23++) {
			if (arg0.aByteArray25[local23] != this.aByteArray25[local23]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(ILclient!v;)Z")
	public boolean method1691(@OriginalArg(1) Class62 arg0) {
		if (this.anInt2649 < arg0.anInt2649) {
			return false;
		}
		@Pc(23) int local23 = this.anInt2649 - arg0.anInt2649;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2649; local25++) {
			if (arg0.aByteArray25[local25] != this.aByteArray25[local23 + local25]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(B)Lclient!v;")
	public Class62 method1692() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class62 local11 = new Class62();
		local11.aByteArray25 = new byte[12];
		local11.anInt2649 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anInt2649; local25++) {
			if (this.aByteArray25[local25] >= 65 && this.aByteArray25[local25] <= 90) {
				local11.aByteArray25[local7++] = (byte) (this.aByteArray25[local25] + 97 - 65);
				local11.anInt2649 = local7;
			} else if (this.aByteArray25[local25] >= 97 && this.aByteArray25[local25] <= 122 || this.aByteArray25[local25] >= 48 && this.aByteArray25[local25] <= 57) {
				local11.aByteArray25[local7++] = this.aByteArray25[local25];
				local11.anInt2649 = local7;
			} else if (local7 > 0) {
				local11.aByteArray25[local7++] = 95;
			}
			if (local7 == 12) {
				break;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(III)Lclient!v;")
	public Class62 method1693(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class62 local7 = new Class62();
		local7.anInt2649 = arg0 - arg1;
		local7.aByteArray25 = new byte[arg0 - arg1];
		Static112.method491(this.aByteArray25, arg1, local7.aByteArray25, 0, local7.anInt2649);
		return local7;
	}

	@OriginalMember(owner = "client!v", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(I)J")
	private long method1694() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2649; local7++) {
			local5 = (local5 << 5) + (long) (this.aByteArray25[local7] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)Lclient!v;")
	public Class62 method1695() {
		@Pc(3) long local3 = this.method1694();
		@Pc(16) Class local16 = v.class;
		synchronized (v.class) {
			@Pc(26) Class3_Sub9 local26;
			if (Static23.aClass43_3 == null) {
				Static23.aClass43_3 = new Class43(4096);
			} else {
				for (local26 = (Class3_Sub9) Static23.aClass43_3.method1079(local3); local26 != null; local26 = (Class3_Sub9) Static23.aClass43_3.method1086()) {
					if (this.method1675(local26.aClass62_667)) {
						return local26.aClass62_667;
					}
				}
			}
			local26 = new Class3_Sub9();
			local26.aClass62_667 = this;
			this.aBoolean162 = false;
			Static23.aClass43_3.method1081(local3, local26);
			return this;
		}
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)Lclient!v;")
	public Class62 method1696() {
		@Pc(9) Class62 local9 = new Class62();
		local9.anInt2649 = this.anInt2649;
		local9.aByteArray25 = new byte[this.anInt2649];
		for (@Pc(20) int local20 = 0; local20 < this.anInt2649; local20++) {
			local9.aByteArray25[local20] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(ILclient!v;)I")
	public int method1697(@OriginalArg(1) Class62 arg0) {
		return this.method1674(arg0);
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(I)[B")
	public byte[] method1698() {
		@Pc(16) byte[] local16 = new byte[this.anInt2649];
		Static112.method491(this.aByteArray25, 0, local16, 0, this.anInt2649);
		return local16;
	}

	@OriginalMember(owner = "client!v", name = "h", descriptor = "(I)Lclient!v;")
	public Class62 method1699() {
		@Pc(15) int local15;
		for (local15 = 0; local15 < this.anInt2649 && this.aByteArray25[local15] >= 0 && this.aByteArray25[local15] <= 32; local15++) {
		}
		@Pc(40) int local40;
		for (local40 = this.anInt2649; local15 < local40 && this.aByteArray25[local40 - 1] >= 0 && this.aByteArray25[local40 - 1] <= 32; local40--) {
		}
		if (local15 == 0 && this.anInt2649 == local40) {
			return this;
		}
		@Pc(82) Class62 local82 = new Class62();
		local82.anInt2649 = local40 - local15;
		local82.aByteArray25 = new byte[local82.anInt2649];
		for (@Pc(95) int local95 = 0; local95 < local82.anInt2649; local95++) {
			local82.aByteArray25[local95] = this.aByteArray25[local15 + local95];
		}
		return local82;
	}

	@OriginalMember(owner = "client!v", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1703();
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)I")
	public int method1700() {
		return this.method1682();
	}

	@OriginalMember(owner = "client!v", name = "i", descriptor = "(I)J")
	public long method1701() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; this.anInt2649 > local7 && local7 < 12; local7++) {
			local5 *= 37L;
			@Pc(17) byte local17 = this.aByteArray25[local7];
			if (local17 >= 65 && local17 <= 90) {
				local5 += local17 + 1 - 65;
			} else if (local17 >= 97 && local17 <= 122) {
				local5 += local17 + 1 - 97;
			} else if (local17 >= 48 && local17 <= 57) {
				local5 += local17 + 27 - 48;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(II)Lclient!v;")
	public Class62 method1702(@OriginalArg(0) int arg0) {
		return this.method1693(this.anInt2649, arg0);
	}

	@OriginalMember(owner = "client!v", name = "j", descriptor = "(I)I")
	public int method1703() {
		@Pc(5) int local5 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt2649; local14++) {
			local5 = (this.aByteArray25[local14] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!v", name = "k", descriptor = "(I)Lclient!v;")
	public Class62 method1704() {
		@Pc(5) Class62 local5 = new Class62();
		local5.anInt2649 = this.anInt2649;
		local5.aByteArray25 = new byte[this.anInt2649];
		for (@Pc(28) int local28 = 0; local28 < this.anInt2649; local28++) {
			@Pc(35) byte local35 = this.aByteArray25[local28];
			if (local35 >= 65 && local35 <= 90 || local35 >= -64 && local35 <= -34 && local35 != -41) {
				local35 = (byte) (local35 + 32);
			}
			local5.aByteArray25[local28] = local35;
		}
		return local5;
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(B)Lclient!v;")
	public Class62 method1707() {
		@Pc(9) Class62 local9 = new Class62();
		local9.anInt2649 = this.anInt2649;
		@Pc(15) boolean local15 = true;
		local9.aByteArray25 = new byte[this.anInt2649];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2649; local27++) {
			@Pc(34) byte local34 = this.aByteArray25[local27];
			if (local34 >= 97 && local34 <= 122 || !(local34 < -32 || local34 > -2 || local34 == -9)) {
				if (local15) {
					local34 = (byte) (local34 - 32);
				}
				local15 = false;
			} else if (local34 >= 65 && local34 <= 90 || local34 >= -64 && local34 <= -34 && local34 != -41) {
				if (!local15) {
					local34 = (byte) (local34 + 32);
				}
				local15 = false;
			}
			if (local34 == 46 || local34 == 33 || local34 == 63) {
				local15 = true;
			}
			local9.aByteArray25[local27] = local34;
		}
		return local9;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public void method1708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2) {
		@Pc(17) String local17;
		try {
			local17 = new String(this.aByteArray25, 0, this.anInt2649, "ISO-8859-1");
		} catch (@Pc(19) UnsupportedEncodingException local19) {
			local17 = new String(this.aByteArray25, 0, this.anInt2649);
		}
		arg2.drawString(local17, arg0, arg1);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!v;II)Lclient!v;")
	public Class62 method1709(@OriginalArg(0) Class62 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean162) {
			throw new IllegalArgumentException();
		} else if (arg1 > this.anInt2649) {
			throw new IllegalArgumentException();
		} else {
			this.anInt2612 = 0;
			if (this.aByteArray25.length < arg0.anInt2649 + arg1) {
				@Pc(42) int local42;
				for (local42 = 1; local42 < arg0.anInt2649 + arg1; local42 += local42) {
				}
				@Pc(61) byte[] local61 = new byte[local42];
				Static112.method491(this.aByteArray25, 0, local61, 0, this.anInt2649);
				this.aByteArray25 = local61;
			}
			Static112.method491(arg0.aByteArray25, 0, this.aByteArray25, arg1, arg0.anInt2649);
			if (arg1 + arg0.anInt2649 > this.anInt2649) {
				this.anInt2649 = arg1 + arg0.anInt2649;
			}
			return this;
		}
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(II)I")
	public int method1710(@OriginalArg(0) int arg0) {
		return this.aByteArray25[arg0] & 0xFF;
	}
}
