import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class61 implements Interface1 {

	@OriginalMember(owner = "client!va", name = "g", descriptor = "I")
	public int anInt2559;

	@OriginalMember(owner = "client!va", name = "L", descriptor = "I")
	private int anInt2588;

	@OriginalMember(owner = "client!va", name = "P", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!va", name = "N", descriptor = "Z")
	private boolean aBoolean119 = true;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)J")
	public long method1586() {
		@Pc(3) long local3 = 0L;
		for (@Pc(5) int local5 = 0; local5 < this.anInt2559 && local5 < 12; local5++) {
			local3 *= 37L;
			@Pc(16) byte local16 = this.aByteArray18[local5];
			if (local16 >= 65 && local16 <= 90) {
				local3 += local16 - 64;
			} else if (local16 >= 97 && local16 <= 122) {
				local3 += local16 + 1 - 97;
			} else if (local16 >= 48 && local16 <= 57) {
				local3 += local16 + 27 - 48;
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}

	@OriginalMember(owner = "client!va", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1603();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)Z")
	private boolean method1587() {
		@Pc(25) boolean local25 = false;
		@Pc(27) boolean local27 = false;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt2559; local31++) {
			@Pc(40) int local40 = this.aByteArray18[local31] & 0xFF;
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
			@Pc(113) int local113 = local29 * 10 + local40;
			if (local113 / 10 != local29) {
				return false;
			}
			local25 = true;
			local29 = local113;
		}
		return local25;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!va;I)Z")
	public boolean method1588(@OriginalArg(0) Class61 arg0) {
		if (arg0.anInt2559 > this.anInt2559) {
			return false;
		}
		@Pc(28) int local28 = this.anInt2559 - arg0.anInt2559;
		for (@Pc(30) int local30 = 0; local30 < arg0.anInt2559; local30++) {
			if (arg0.aByteArray18[local30] != this.aByteArray18[local28 + local30]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!va;IZ)Lclient!va;")
	public Class61 method1589(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean119) {
			throw new IllegalArgumentException();
		} else if (arg1 > this.anInt2559) {
			throw new IllegalArgumentException();
		} else {
			this.anInt2588 = 0;
			if (this.aByteArray18.length < arg1 + arg0.anInt2559) {
				@Pc(37) int local37;
				for (local37 = 1; local37 < arg1 + arg0.anInt2559; local37 += local37) {
				}
				@Pc(57) byte[] local57 = new byte[local37];
				Static110.method560(this.aByteArray18, 0, local57, 0, this.anInt2559);
				this.aByteArray18 = local57;
			}
			Static110.method560(arg0.aByteArray18, 0, this.aByteArray18, arg1, arg0.anInt2559);
			if (arg1 + arg0.anInt2559 > this.anInt2559) {
				this.anInt2559 = arg1 + arg0.anInt2559;
			}
			return this;
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)Lclient!va;")
	public Class61 method1590() {
		@Pc(9) long local9 = this.method1592();
		@Pc(18) Class local18 = va.class;
		synchronized (va.class) {
			@Pc(36) Class10_Sub2 local36;
			if (Static26.aClass50_8 == null) {
				Static26.aClass50_8 = new Class50(4096);
			} else {
				for (local36 = (Class10_Sub2) Static26.aClass50_8.method1250(local9); local36 != null; local36 = (Class10_Sub2) Static26.aClass50_8.method1248()) {
					if (this.method1608(local36.aClass61_221)) {
						return local36.aClass61_221;
					}
				}
			}
			local36 = new Class10_Sub2();
			local36.aClass61_221 = this;
			this.aBoolean119 = false;
			Static26.aClass50_8.method1252(local36, local9);
			return this;
		}
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(I)Lclient!va;")
	public Class61 method1591() {
		@Pc(9) Class61 local9 = new Class61();
		local9.aByteArray18 = new byte[12];
		@Pc(15) int local15 = 0;
		local9.anInt2559 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt2559; local28++) {
			if (this.aByteArray18[local28] >= 65 && this.aByteArray18[local28] <= 90) {
				local9.aByteArray18[local15++] = (byte) (this.aByteArray18[local28] + 97 - 65);
				local9.anInt2559 = local15;
			} else if (this.aByteArray18[local28] >= 97 && this.aByteArray18[local28] <= 122 || this.aByteArray18[local28] >= 48 && this.aByteArray18[local28] <= 57) {
				local9.aByteArray18[local15++] = this.aByteArray18[local28];
				local9.anInt2559 = local15;
			} else if (local15 > 0) {
				local9.aByteArray18[local15++] = 95;
			}
			if (local15 == 12) {
				break;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(I)J")
	private long method1592() {
		@Pc(5) long local5 = 0L;
		for (@Pc(14) int local14 = 0; local14 < this.anInt2559; local14++) {
			local5 = (long) (this.aByteArray18[local14] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BLclient!va;)Lclient!va;")
	public Class61 method1593(@OriginalArg(1) Class61 arg0) {
		if (!this.aBoolean119) {
			throw new IllegalArgumentException();
		}
		this.anInt2588 = 0;
		if (arg0.anInt2559 + this.anInt2559 > this.aByteArray18.length) {
			@Pc(35) int local35;
			for (local35 = 1; local35 < this.anInt2559 + arg0.anInt2559; local35 += local35) {
			}
			@Pc(55) byte[] local55 = new byte[local35];
			Static110.method560(this.aByteArray18, 0, local55, 0, this.anInt2559);
			this.aByteArray18 = local55;
		}
		Static110.method560(arg0.aByteArray18, 0, this.aByteArray18, this.anInt2559, arg0.anInt2559);
		this.anInt2559 += arg0.anInt2559;
		return this;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!va;B)Z")
	public boolean method1594(@OriginalArg(0) Class61 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt2559 == this.anInt2559) {
			for (@Pc(28) int local28 = 0; local28 < this.anInt2559; local28++) {
				@Pc(34) byte local34 = this.aByteArray18[local28];
				if (local34 >= 65 && local34 <= 90 || local34 >= -64 && local34 <= -34 && local34 != -41) {
					local34 = (byte) (local34 + 32);
				}
				@Pc(65) byte local65 = arg0.aByteArray18[local28];
				if (local65 >= 65 && local65 <= 90 || local65 >= -64 && local65 <= -34 && local65 != -41) {
					local65 = (byte) (local65 + 32);
				}
				if (local65 != local34) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BIILjava/awt/Graphics;)V")
	public void method1595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray18, 0, this.anInt2559, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray18, 0, this.anInt2559);
		}
		arg2.drawString(local13, arg0, arg1);
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(I)I")
	public int method1596() {
		return this.anInt2559;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)I")
	public int method1597() {
		return this.method1615();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Lclient!va;")
	public Class61 method1598(@OriginalArg(1) int arg0) {
		if (!this.aBoolean119) {
			throw new IllegalArgumentException();
		}
		this.anInt2588 = 0;
		if (this.aByteArray18.length == this.anInt2559) {
			@Pc(35) int local35;
			for (local35 = 1; local35 <= this.anInt2559; local35 += local35) {
			}
			@Pc(48) byte[] local48 = new byte[local35];
			Static110.method560(this.aByteArray18, 0, local48, 0, this.anInt2559);
			this.aByteArray18 = local48;
		}
		this.aByteArray18[this.anInt2559++] = (byte) arg0;
		return this;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method1599(@OriginalArg(0) FontMetrics arg0) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray18, 0, this.anInt2559, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray18, 0, this.anInt2559);
		}
		return arg0.stringWidth(local18);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!va;I)I")
	private int method1600(@OriginalArg(1) Class61 arg0) {
		@Pc(9) int[] local9 = new int[arg0.anInt2559];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg0.anInt2559];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg0.anInt2559;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg0.anInt2559; local36++) {
			local9[local36 - 1] = (arg0.anInt2559 << 1) - local36;
			local12[arg0.aByteArray18[local36 - 1] & 0xFF] = arg0.anInt2559 - local36;
		}
		@Pc(74) int local74 = arg0.anInt2559 + 1;
		for (@Pc(77) int local77 = arg0.anInt2559; local77 > 0; local77--) {
			local16[local77 - 1] = local74;
			while (arg0.anInt2559 >= local74 && arg0.aByteArray18[local77 - 1] != arg0.aByteArray18[local74 - 1]) {
				if (arg0.anInt2559 - local77 <= local9[local74 + -1]) {
					local9[local74 - 1] = arg0.anInt2559 - local77;
				}
				local74 = local16[local74 - 1];
			}
			local74--;
		}
		@Pc(141) int local141 = local74;
		local74 = arg0.anInt2559 + 1 - local74;
		@Pc(151) int local151 = 1;
		@Pc(153) int local153 = 0;
		@Pc(155) int local155 = 1;
		while (local74 >= local155) {
			local16[local155 - 1] = local153;
			while (local153 >= 1 && arg0.aByteArray18[local153 - 1] != arg0.aByteArray18[local155 - 1]) {
				local153 = local16[local153 - 1];
			}
			local155++;
			local153++;
		}
		@Pc(200) int local200;
		while (arg0.anInt2559 > local141) {
			for (local200 = local151; local200 <= local141; local200++) {
				if (local9[local200 - 1] >= local141 + arg0.anInt2559 - local200) {
					local9[local200 - 1] = arg0.anInt2559 + local141 - local200;
				}
			}
			local151 = local141 + 1;
			local141 += local74 - local16[local74 - 1];
			local74 = local16[local74 - 1];
		}
		@Pc(283) int local283;
		for (local200 = arg0.anInt2559 - 1; local200 < this.anInt2559; local200 += Math.max(local12[this.aByteArray18[local200] & 0xFF], local9[local283])) {
			for (local283 = arg0.anInt2559 - 1; local283 >= 0 && this.aByteArray18[local200] == arg0.aByteArray18[local283]; local283--) {
				local200--;
			}
			if (local283 == -1) {
				return local200 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)I")
	public int method1601(@OriginalArg(1) int arg0) {
		return this.aByteArray18[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(Lclient!va;I)Z")
	public boolean method1602(@OriginalArg(0) Class61 arg0) {
		if (this.anInt2559 < arg0.anInt2559) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt2559; local14++) {
			if (arg0.aByteArray18[local14] != this.aByteArray18[local14]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)I")
	public int method1603() {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2559; local12++) {
			local10 = (local10 << 5) + (this.aByteArray18[local12] & 0xFF) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!va;)I")
	public int method1604(@OriginalArg(1) Class61 arg0) {
		return this.method1600(arg0);
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "(I)Lclient!va;")
	public Class61 method1606() {
		if (!this.aBoolean119) {
			throw new IllegalArgumentException();
		}
		this.anInt2588 = 0;
		if (this.aByteArray18.length != this.anInt2559) {
			@Pc(23) byte[] local23 = new byte[this.anInt2559];
			Static110.method560(this.aByteArray18, 0, local23, 0, this.anInt2559);
			this.aByteArray18 = local23;
		}
		return this;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([BIIII)I")
	public int method1607(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		Static110.method560(this.aByteArray18, 0, arg0, arg2, arg1);
		return arg1;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(Lclient!va;I)Z")
	public boolean method1608(@OriginalArg(0) Class61 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2559 == arg0.anInt2559) {
			if (!this.aBoolean119 || !arg0.aBoolean119) {
				if (this.anInt2588 == 0) {
					this.anInt2588 = this.method1603();
					if (this.anInt2588 == 0) {
						this.anInt2588 = 1;
					}
				}
				if (arg0.anInt2588 == 0) {
					arg0.anInt2588 = arg0.method1603();
					if (arg0.anInt2588 == 0) {
						arg0.anInt2588 = 1;
					}
				}
				if (arg0.anInt2588 != this.anInt2588) {
					return false;
				}
			}
			for (@Pc(75) int local75 = 0; local75 < this.anInt2559; local75++) {
				if (this.aByteArray18[local75] != arg0.aByteArray18[local75]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)Lclient!va;")
	public Class61 method1609() {
		@Pc(8) int local8 = this.anInt2559;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt2559 && this.aByteArray18[local10] >= 0 && this.aByteArray18[local10] <= 32; local10++) {
		}
		while (local10 < local8 && this.aByteArray18[local8 - 1] >= 0 && this.aByteArray18[local8 - 1] <= 32) {
			local8--;
		}
		if (local10 == 0 && this.anInt2559 == local8) {
			return this;
		}
		@Pc(67) Class61 local67 = new Class61();
		local67.anInt2559 = local8 - local10;
		local67.aByteArray18 = new byte[local67.anInt2559];
		for (@Pc(86) int local86 = 0; local86 < local67.anInt2559; local86++) {
			local67.aByteArray18[local86] = this.aByteArray18[local86 + local10];
		}
		return local67;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZI)Lclient!va;")
	public Class61 method1611(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class61 local12 = new Class61();
		local12.anInt2559 = arg0 - arg1;
		local12.aByteArray18 = new byte[arg0 - arg1];
		Static110.method560(this.aByteArray18, arg1, local12.aByteArray18, 0, local12.anInt2559);
		return local12;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)Lclient!va;")
	public Class61 method1612(@OriginalArg(1) int arg0) {
		@Pc(3) Class61 local3 = new Class61();
		local3.aByteArray18 = new byte[this.anInt2559 + 1];
		local3.anInt2559 = this.anInt2559 + 1;
		Static110.method560(this.aByteArray18, 0, local3.aByteArray18, 0, this.anInt2559);
		local3.aByteArray18[this.anInt2559] = (byte) arg0;
		return local3;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(B)Lclient!va;")
	public Class61 method1613() {
		@Pc(7) Class61 local7 = new Class61();
		local7.anInt2559 = this.anInt2559;
		local7.aByteArray18 = new byte[this.anInt2559];
		for (@Pc(26) int local26 = 0; local26 < this.anInt2559; local26++) {
			@Pc(32) byte local32 = this.aByteArray18[local26];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local7.aByteArray18[local26] = local32;
		}
		return local7;
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(B)[B")
	public byte[] method1614() {
		@Pc(15) byte[] local15 = new byte[this.anInt2559];
		Static110.method560(this.aByteArray18, 0, local15, 0, this.anInt2559);
		return local15;
	}

	@OriginalMember(owner = "client!va", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)I")
	private int method1615() {
		for (@Pc(17) int local17 = 0; local17 < this.anInt2559; local17++) {
			if (this.aByteArray18[local17] == 32) {
				return local17;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(IB)I")
	private int method1616() {
		@Pc(15) boolean local15 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt2559; local26++) {
			@Pc(34) int local34 = this.aByteArray18[local26] & 0xFF;
			if (local26 == 0) {
				if (local34 == 45) {
					local15 = true;
					continue;
				}
				if (local34 == 43) {
					continue;
				}
			}
			if (local34 >= 48 && local34 <= 57) {
				local34 -= 48;
			} else if (local34 >= 65 && local34 <= 90) {
				local34 -= 55;
			} else if (local34 >= 97 && local34 <= 122) {
				local34 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (local34 >= 10) {
				throw new NumberFormatException();
			}
			if (local15) {
				local34 = -local34;
			}
			@Pc(97) int local97 = local24 * 10 + local34;
			if (local97 / 10 != local24) {
				throw new NumberFormatException();
			}
			local22 = true;
			local24 = local97;
		}
		if (!local22) {
			throw new NumberFormatException();
		}
		return local24;
	}

	@OriginalMember(owner = "client!va", name = "g", descriptor = "(I)Lclient!va;")
	public Class61 method1617() {
		@Pc(3) boolean local3 = true;
		@Pc(16) Class61 local16 = new Class61();
		local16.anInt2559 = this.anInt2559;
		local16.aByteArray18 = new byte[this.anInt2559];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2559; local27++) {
			@Pc(34) byte local34 = this.aByteArray18[local27];
			if (local34 == 95) {
				local3 = true;
				local16.aByteArray18[local27] = 32;
			} else if (local34 >= 97 && local34 <= 122 && local3) {
				local16.aByteArray18[local27] = (byte) (local34 - 32);
				local3 = false;
			} else {
				local16.aByteArray18[local27] = local34;
				local3 = false;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!va", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!va", name = "h", descriptor = "(I)Lclient!va;")
	public Class61 method1618() {
		@Pc(5) Class61 local5 = new Class61();
		local5.anInt2559 = this.anInt2559;
		local5.aByteArray18 = new byte[this.anInt2559];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2559; local27++) {
			local5.aByteArray18[local27] = 42;
		}
		return local5;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(II)Lclient!va;")
	public Class61 method1619(@OriginalArg(1) int arg0) {
		return this.method1611(this.anInt2559, arg0);
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(B)Lclient!va;")
	public Class61 method1620() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class61 local11 = new Class61();
		local11.anInt2559 = this.anInt2559;
		local11.aByteArray18 = new byte[this.anInt2559];
		for (@Pc(22) int local22 = 0; local22 < this.anInt2559; local22++) {
			@Pc(29) byte local29 = this.aByteArray18[local22];
			if (local29 >= 97 && local29 <= 122 || local29 >= -32 && local29 <= -2 && local29 != -9) {
				if (local7) {
					local29 = (byte) (local29 - 32);
				}
				local7 = false;
			} else if (local29 >= 65 && local29 <= 90 || local29 >= -64 && local29 <= -34 && local29 != -41) {
				if (!local7) {
					local29 = (byte) (local29 + 32);
				}
				local7 = false;
			}
			if (local29 == 46 || local29 == 33 || local29 == 63) {
				local7 = true;
			}
			local11.aByteArray18[local22] = local29;
		}
		return local11;
	}

	@OriginalMember(owner = "client!va", name = "i", descriptor = "(I)Z")
	public boolean method1621() {
		return this.method1587();
	}

	@OriginalMember(owner = "client!va", name = "j", descriptor = "(I)I")
	public int method1622() {
		return this.method1616();
	}
}
