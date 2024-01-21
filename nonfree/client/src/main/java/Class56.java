import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class56 implements Interface3 {

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
	private int anInt2165;

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
	public int anInt2171;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "Z")
	private boolean aBoolean99 = true;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lclient!oa;")
	public Class56 method1415(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		} else if (this.aBoolean99) {
			this.anInt2165 = 0;
			if (this.anInt2171 == this.aByteArray29.length) {
				@Pc(38) int local38;
				for (local38 = 1; local38 <= this.anInt2171; local38 += local38) {
				}
				@Pc(55) byte[] local55 = new byte[local38];
				Static128.method140(this.aByteArray29, 0, local55, 0, this.anInt2171);
				this.aByteArray29 = local55;
			}
			this.aByteArray29[this.anInt2171++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)I")
	public int method1416() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2171; local7++) {
			local5 = (local5 << 5) + (this.aByteArray29[local7] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Lclient!oa;")
	public Class56 method1417(@OriginalArg(1) int arg0) {
		return this.method1451(this.anInt2171, arg0);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!oa;)Z")
	public boolean method1418(@OriginalArg(1) Class56 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt2171 == this.anInt2171) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt2171; local18++) {
				@Pc(25) byte local25 = arg0.aByteArray29[local18];
				@Pc(30) byte local30 = this.aByteArray29[local18];
				if (local25 >= 65 && local25 <= 90 || local25 >= -64 && local25 <= -34 && local25 != -41) {
					local25 = (byte) (local25 + 32);
				}
				if (local30 >= 65 && local30 <= 90 || local30 >= -64 && local30 <= -34 && local30 != -41) {
					local30 = (byte) (local30 + 32);
				}
				if (local30 != local25) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)Lclient!oa;")
	public Class56 method1419() {
		@Pc(7) byte local7 = 2;
		@Pc(11) Class56 local11 = new Class56();
		local11.anInt2171 = this.anInt2171;
		local11.aByteArray29 = new byte[this.anInt2171];
		for (@Pc(30) int local30 = 0; local30 < this.anInt2171; local30++) {
			@Pc(37) byte local37 = this.aByteArray29[local30];
			if (local37 >= 97 && local37 <= 122 || local37 >= -32 && local37 <= -2 && local37 != -9) {
				if (local7 == 2) {
					local37 = (byte) (local37 - 32);
				}
				local7 = 0;
			} else if (local37 >= 65 && local37 <= 90 || !(local37 < -64 || local37 > -34 || local37 == -41)) {
				if (local7 == 0) {
					local37 = (byte) (local37 + 32);
				}
				local7 = 0;
			} else if (local37 == 46 || local37 == 33 || local37 == 63) {
				local7 = 2;
			} else if (local37 != 32) {
				local7 = 1;
			} else if (local7 != 2) {
				local7 = 1;
			}
			local11.aByteArray29[local30] = local37;
		}
		return local11;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)Lclient!oa;")
	public Class56 method1421() {
		@Pc(9) Class56 local9 = new Class56();
		@Pc(11) boolean local11 = true;
		local9.anInt2171 = this.anInt2171;
		local9.aByteArray29 = new byte[this.anInt2171];
		for (@Pc(28) int local28 = 0; local28 < this.anInt2171; local28++) {
			@Pc(35) byte local35 = this.aByteArray29[local28];
			if (local35 == 95) {
				local9.aByteArray29[local28] = 32;
				local11 = true;
			} else if (local35 >= 97 && local35 <= 122 && local11) {
				local11 = false;
				local9.aByteArray29[local28] = (byte) (local35 - 32);
			} else {
				local11 = false;
				local9.aByteArray29[local28] = local35;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)Lclient!oa;")
	public Class56 method1422() {
		@Pc(5) Class56 local5 = new Class56();
		local5.anInt2171 = this.anInt2171;
		local5.aByteArray29 = new byte[this.anInt2171];
		for (@Pc(29) int local29 = 0; local29 < this.anInt2171; local29++) {
			@Pc(36) byte local36 = this.aByteArray29[local29];
			if (local36 >= 65 && local36 <= 90 || local36 >= -64 && local36 <= -34 && local36 != -41) {
				local36 = (byte) (local36 + 32);
			}
			local5.aByteArray29[local29] = local36;
		}
		return local5;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!oa;B)Z")
	public boolean method1423(@OriginalArg(0) Class56 arg0) {
		if (this.anInt2171 < arg0.anInt2171) {
			return false;
		}
		@Pc(19) int local19 = this.anInt2171 - arg0.anInt2171;
		for (@Pc(29) int local29 = 0; local29 < arg0.anInt2171; local29++) {
			if (arg0.aByteArray29[local29] != this.aByteArray29[local19 + local29]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLclient!oa;)I")
	public int method1424(@OriginalArg(1) Class56 arg0) {
		return this.method1427(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)Lclient!oa;")
	public Class56 method1425() {
		@Pc(3) int local3;
		for (local3 = 0; this.anInt2171 > local3 && (this.aByteArray29[local3] >= 0 && this.aByteArray29[local3] <= 32 || (this.aByteArray29[local3] & 0xFF) == 160); local3++) {
		}
		@Pc(43) int local43;
		for (local43 = this.anInt2171; local43 > local3 && (this.aByteArray29[local43 - 1] >= 0 && this.aByteArray29[local43 - 1] <= 32 || (this.aByteArray29[local43 - 1] & 0xFF) == 160); local43--) {
		}
		if (local3 == 0 && local43 == this.anInt2171) {
			return this;
		}
		@Pc(90) Class56 local90 = new Class56();
		local90.anInt2171 = local43 - local3;
		local90.aByteArray29 = new byte[local90.anInt2171];
		for (@Pc(111) int local111 = 0; local111 < local90.anInt2171; local111++) {
			local90.aByteArray29[local111] = this.aByteArray29[local3 + local111];
		}
		return local90;
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)I")
	public int method1426() {
		return this.anInt2171;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!oa;B)I")
	private int method1427(@OriginalArg(1) Class56 arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(17) int[] local17 = new int[arg0.anInt2171];
		@Pc(21) int[] local21 = new int[arg0.anInt2171];
		for (@Pc(23) int local23 = 0; local23 < local8.length; local23++) {
			local8[local23] = arg0.anInt2171;
		}
		for (@Pc(41) int local41 = 1; local41 <= arg0.anInt2171; local41++) {
			local21[local41 - 1] = (arg0.anInt2171 << 1) - local41;
			local8[arg0.aByteArray29[local41 - 1] & 0xFF] = arg0.anInt2171 - local41;
		}
		@Pc(83) int local83 = arg0.anInt2171 + 1;
		for (@Pc(86) int local86 = arg0.anInt2171; local86 > 0; local86--) {
			local17[local86 - 1] = local83;
			while (local83 <= arg0.anInt2171 && arg0.aByteArray29[local86 - 1] != arg0.aByteArray29[local83 - 1]) {
				if (local21[local83 - 1] >= arg0.anInt2171 - local86) {
					local21[local83 - 1] = arg0.anInt2171 - local86;
				}
				local83 = local17[local83 - 1];
			}
			local83--;
		}
		@Pc(161) int local161 = local83;
		local83 = arg0.anInt2171 + 1 - local83;
		@Pc(171) int local171 = 0;
		@Pc(173) int local173 = 1;
		@Pc(175) int local175 = 1;
		while (local175 <= local83) {
			local17[local175 - 1] = local171;
			while (local171 >= 1 && arg0.aByteArray29[local171 - 1] != arg0.aByteArray29[local175 - 1]) {
				local171 = local17[local171 - 1];
			}
			local175++;
			local171++;
		}
		@Pc(224) int local224;
		while (arg0.anInt2171 > local161) {
			for (local224 = local173; local224 <= local161; local224++) {
				if (local21[local224 - 1] >= arg0.anInt2171 + local161 - local224) {
					local21[local224 - 1] = local161 + arg0.anInt2171 - local224;
				}
			}
			local173 = local161 + 1;
			local161 = local83 + local161 - local17[local83 + -1];
			local83 = local17[local83 - 1];
		}
		@Pc(295) int local295;
		for (local224 = arg0.anInt2171 - 1; local224 < this.anInt2171; local224 += Math.max(local8[this.aByteArray29[local224] & 0xFF], local21[local295])) {
			for (local295 = arg0.anInt2171 - 1; local295 >= 0 && arg0.aByteArray29[local295] == this.aByteArray29[local224]; local295--) {
				local224--;
			}
			if (local295 == -1) {
				return local224 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(BLclient!oa;)Z")
	public boolean method1428(@OriginalArg(1) Class56 arg0) {
		if (this.anInt2171 < arg0.anInt2171) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < arg0.anInt2171; local19++) {
			if (this.aByteArray29[local19] != arg0.aByteArray29[local19]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)I")
	public int method1429() {
		return this.method1439();
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)Lclient!oa;")
	public Class56 method1431() {
		@Pc(3) int local3 = 0;
		@Pc(7) Class56 local7 = new Class56();
		local7.aByteArray29 = new byte[12];
		local7.anInt2171 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.anInt2171; local20++) {
			if (this.aByteArray29[local20] >= 65 && this.aByteArray29[local20] <= 90) {
				local7.aByteArray29[local3++] = (byte) (this.aByteArray29[local20] + 97 - 65);
				local7.anInt2171 = local3;
			} else if (this.aByteArray29[local20] >= 97 && this.aByteArray29[local20] <= 122 || this.aByteArray29[local20] >= 48 && this.aByteArray29[local20] <= 57) {
				local7.aByteArray29[local3++] = this.aByteArray29[local20];
				local7.anInt2171 = local3;
			} else if (local3 > 0) {
				local7.aByteArray29[local3++] = 95;
			}
			if (local3 == 12) {
				break;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
	public void method1432(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray29, 0, this.anInt2171, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray29, 0, this.anInt2171);
		}
		arg2.drawString(local18, arg1, arg0);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)Lclient!oa;")
	public Class56 method1433() {
		if (!this.aBoolean99) {
			throw new IllegalArgumentException();
		}
		this.anInt2165 = 0;
		if (this.anInt2171 != this.aByteArray29.length) {
			@Pc(27) byte[] local27 = new byte[this.anInt2171];
			Static128.method140(this.aByteArray29, 0, local27, 0, this.anInt2171);
			this.aByteArray29 = local27;
		}
		return this;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(BLclient!oa;)Lclient!oa;")
	public Class56 method1434(@OriginalArg(1) Class56 arg0) {
		if (!this.aBoolean99) {
			throw new IllegalArgumentException();
		}
		this.anInt2165 = 0;
		if (arg0.anInt2171 + this.anInt2171 > this.aByteArray29.length) {
			@Pc(26) int local26;
			for (local26 = 1; local26 < this.anInt2171 + arg0.anInt2171; local26 += local26) {
			}
			@Pc(42) byte[] local42 = new byte[local26];
			Static128.method140(this.aByteArray29, 0, local42, 0, this.anInt2171);
			this.aByteArray29 = local42;
		}
		Static128.method140(arg0.aByteArray29, 0, this.aByteArray29, this.anInt2171, arg0.anInt2171);
		this.anInt2171 += arg0.anInt2171;
		return this;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIB)I")
	private int method1435() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt2171; local15++) {
			if (this.aByteArray29[local15] == 32) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLclient!oa;I)Lclient!oa;")
	public Class56 method1436(@OriginalArg(1) Class56 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean99) {
			throw new IllegalArgumentException();
		} else if (this.anInt2171 < arg1) {
			throw new IllegalArgumentException();
		} else {
			this.anInt2165 = 0;
			if (arg0.anInt2171 + arg1 > this.aByteArray29.length) {
				@Pc(37) int local37;
				for (local37 = 1; local37 < arg1 + arg0.anInt2171; local37 += local37) {
				}
				@Pc(52) byte[] local52 = new byte[local37];
				Static128.method140(this.aByteArray29, 0, local52, 0, this.anInt2171);
				this.aByteArray29 = local52;
			}
			Static128.method140(arg0.aByteArray29, 0, this.aByteArray29, arg1, arg0.anInt2171);
			if (this.anInt2171 < arg1 + arg0.anInt2171) {
				this.anInt2171 = arg0.anInt2171 + arg1;
			}
			return this;
		}
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(BLclient!oa;)Z")
	public boolean method1437(@OriginalArg(1) Class56 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2171 == arg0.anInt2171) {
			if (!this.aBoolean99 || !arg0.aBoolean99) {
				if (this.anInt2165 == 0) {
					this.anInt2165 = this.method1416();
					if (this.anInt2165 == 0) {
						this.anInt2165 = 1;
					}
				}
				if (arg0.anInt2165 == 0) {
					arg0.anInt2165 = arg0.method1416();
					if (arg0.anInt2165 == 0) {
						arg0.anInt2165 = 1;
					}
				}
				if (this.anInt2165 != arg0.anInt2165) {
					return false;
				}
			}
			for (@Pc(79) int local79 = 0; local79 < this.anInt2171; local79++) {
				if (this.aByteArray29[local79] != arg0.aByteArray29[local79]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)[B")
	public byte[] method1438() {
		@Pc(12) byte[] local12 = new byte[this.anInt2171];
		Static128.method140(this.aByteArray29, 0, local12, 0, this.anInt2171);
		return local12;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)I")
	private int method1439() {
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		for (@Pc(30) int local30 = 0; local30 < this.anInt2171; local30++) {
			@Pc(39) int local39 = this.aByteArray29[local30] & 0xFF;
			if (local30 == 0) {
				if (local39 == 45) {
					local21 = true;
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
			if (local21) {
				local39 = -local39;
			}
			@Pc(109) int local109 = local39 + local23 * 10;
			if (local23 != local109 / 10) {
				throw new NumberFormatException();
			}
			local23 = local109;
			local19 = true;
		}
		if (!local19) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!oa", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class56)) {
			throw new IllegalArgumentException();
		}
		return this.method1437((Class56) arg0);
	}

	@OriginalMember(owner = "client!oa", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1416();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)J")
	private long method1440() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2171; local7++) {
			local5 = (local5 << 5) + ((long) (this.aByteArray29[local7] & 0xFF)) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)Lclient!oa;")
	public Class56 method1441() {
		@Pc(11) long local11 = this.method1440();
		@Pc(24) Class local24 = oa.class;
		synchronized (oa.class) {
			@Pc(40) Class3_Sub11 local40;
			if (Static106.aClass2_11 == null) {
				Static106.aClass2_11 = new Class2(4096);
			} else {
				for (local40 = (Class3_Sub11) Static106.aClass2_11.method17(local11); local40 != null; local40 = (Class3_Sub11) Static106.aClass2_11.method13()) {
					if (this.method1437(local40.aClass56_1016)) {
						return local40.aClass56_1016;
					}
				}
			}
			local40 = new Class3_Sub11();
			this.aBoolean99 = false;
			local40.aClass56_1016 = this;
			Static106.aClass2_11.method12(local40, local11);
			return this;
		}
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)Lclient!oa;")
	public Class56 method1442() {
		@Pc(14) Class56 local14 = new Class56();
		local14.anInt2171 = this.anInt2171;
		local14.aByteArray29 = new byte[this.anInt2171];
		for (@Pc(25) int local25 = 0; local25 < this.anInt2171; local25++) {
			local14.aByteArray29[local25] = 42;
		}
		return local14;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IB)I")
	public int method1443() {
		return this.method1435();
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(B)Ljava/net/URL;")
	public URL method1444() throws MalformedURLException {
		return new URL(new String(this.aByteArray29, 0, this.anInt2171));
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)J")
	public long method1445() {
		@Pc(7) long local7 = 0L;
		for (@Pc(9) int local9 = 0; this.anInt2171 > local9 && local9 < 12; local9++) {
			local7 *= 37L;
			@Pc(20) byte local20 = this.aByteArray29[local9];
			if (local20 >= 65 && local20 <= 90) {
				local7 += local20 + 1 - 65;
			} else if (local20 >= 97 && local20 <= 122) {
				local7 += local20 + 1 - 97;
			} else if (local20 >= 48 && local20 <= 57) {
				local7 += local20 + 27 - 48;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)Lclient!oa;")
	public Class56 method1446(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(17) Class56 local17 = new Class56();
		local17.aByteArray29 = new byte[this.anInt2171 + 1];
		local17.anInt2171 = this.anInt2171 + 1;
		Static128.method140(this.aByteArray29, 0, local17.aByteArray29, 0, this.anInt2171);
		local17.aByteArray29[this.anInt2171] = (byte) arg0;
		return local17;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)Z")
	private boolean method1448() {
		@Pc(7) boolean local7 = false;
		@Pc(16) int local16 = 0;
		@Pc(30) boolean local30 = false;
		for (@Pc(32) int local32 = 0; local32 < this.anInt2171; local32++) {
			@Pc(41) int local41 = this.aByteArray29[local32] & 0xFF;
			if (local32 == 0) {
				if (local41 == 45) {
					local7 = true;
					continue;
				}
				if (local41 == 43) {
					continue;
				}
			}
			if (local41 >= 48 && local41 <= 57) {
				local41 -= 48;
			} else if (local41 >= 65 && local41 <= 90) {
				local41 -= 55;
			} else if (local41 >= 97 && local41 <= 122) {
				local41 -= 87;
			} else {
				return false;
			}
			if (local41 >= 10) {
				return false;
			}
			if (local7) {
				local41 = -local41;
			}
			@Pc(115) int local115 = local16 * 10 + local41;
			if (local16 != local115 / 10) {
				return false;
			}
			local16 = local115;
			local30 = true;
		}
		return local30;
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I")
	public int method1449(@OriginalArg(0) int arg0) {
		return this.aByteArray29[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB[BII)I")
	public int method1450(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static128.method140(this.aByteArray29, 0, arg0, arg1, arg2);
		return arg2;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)Lclient!oa;")
	public Class56 method1451(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class56 local7 = new Class56();
		local7.aByteArray29 = new byte[arg0 - arg1];
		local7.anInt2171 = arg0 - arg1;
		Static128.method140(this.aByteArray29, arg1, local7.aByteArray29, 0, local7.anInt2171);
		return local7;
	}

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "(I)Z")
	public boolean method1453() {
		return this.method1448();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Lclient!oa;B)I")
	public int method1454(@OriginalArg(0) Class56 arg0) {
		@Pc(13) int local13;
		if (this.anInt2171 <= arg0.anInt2171) {
			local13 = this.anInt2171;
		} else {
			local13 = arg0.anInt2171;
		}
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			if (Static5.anIntArray4[this.aByteArray29[local20] & 0xFF] < Static5.anIntArray4[arg0.aByteArray29[local20] & 0xFF]) {
				return -1;
			}
			if (Static5.anIntArray4[this.aByteArray29[local20] & 0xFF] > Static5.anIntArray4[arg0.aByteArray29[local20] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt2171 < arg0.anInt2171) {
			return -1;
		} else if (arg0.anInt2171 < this.anInt2171) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
	public int method1455(@OriginalArg(1) FontMetrics arg0) {
		@Pc(21) String local21;
		try {
			local21 = new String(this.aByteArray29, 0, this.anInt2171, "ISO-8859-1");
		} catch (@Pc(23) UnsupportedEncodingException local23) {
			local21 = new String(this.aByteArray29, 0, this.anInt2171);
		}
		return arg0.stringWidth(local21);
	}
}
