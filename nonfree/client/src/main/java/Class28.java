import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class28 implements Interface1 {

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
	private int anInt1694;

	@OriginalMember(owner = "client!gg", name = "v", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
	public int anInt1718;

	@OriginalMember(owner = "client!gg", name = "T", descriptor = "Z")
	private boolean aBoolean86 = true;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!gg;B)Z")
	public boolean method1107(@OriginalArg(0) Class28 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1718 == arg0.anInt1718) {
			if (!this.aBoolean86 || !arg0.aBoolean86) {
				if (this.anInt1694 == 0) {
					this.anInt1694 = this.method1126();
					if (this.anInt1694 == 0) {
						this.anInt1694 = 1;
					}
				}
				if (arg0.anInt1694 == 0) {
					arg0.anInt1694 = arg0.method1126();
					if (arg0.anInt1694 == 0) {
						arg0.anInt1694 = 1;
					}
				}
				if (this.anInt1694 != arg0.anInt1694) {
					return false;
				}
			}
			for (@Pc(74) int local74 = 0; local74 < this.anInt1718; local74++) {
				if (this.aByteArray14[local74] != arg0.aByteArray14[local74]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)I")
	public int method1108(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte local8 = (byte) arg1;
		for (@Pc(15) int local15 = arg0; local15 < this.anInt1718; local15++) {
			if (local8 == this.aByteArray14[local15]) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLclient!gg;)Lclient!gg;")
	public Class28 method1109(@OriginalArg(1) Class28 arg0) {
		if (!this.aBoolean86) {
			throw new IllegalArgumentException();
		}
		this.anInt1694 = 0;
		if (this.anInt1718 + arg0.anInt1718 > this.aByteArray14.length) {
			@Pc(28) int local28;
			for (local28 = 1; local28 < this.anInt1718 + arg0.anInt1718; local28 += local28) {
			}
			@Pc(43) byte[] local43 = new byte[local28];
			Static184.method1640(this.aByteArray14, 0, local43, 0, this.anInt1718);
			this.aByteArray14 = local43;
		}
		Static184.method1640(arg0.aByteArray14, 0, this.aByteArray14, this.anInt1718, arg0.anInt1718);
		this.anInt1718 += arg0.anInt1718;
		return this;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Ljava/net/URL;")
	public URL method1110() throws MalformedURLException {
		return new URL(new String(this.aByteArray14, 0, this.anInt1718));
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BIILjava/awt/Graphics;)V")
	public void method1111(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		@Pc(19) String local19;
		try {
			local19 = new String(this.aByteArray14, 0, this.anInt1718, "ISO-8859-1");
		} catch (@Pc(21) UnsupportedEncodingException local21) {
			local19 = new String(this.aByteArray14, 0, this.anInt1718);
		}
		arg2.drawString(local19, arg0, arg1);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)I")
	public int method1112(@OriginalArg(1) int arg0) {
		return this.aByteArray14[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)Lclient!gg;")
	public Class28 method1113() {
		if (!this.aBoolean86) {
			throw new IllegalArgumentException();
		}
		this.anInt1694 = 0;
		if (this.anInt1718 != this.aByteArray14.length) {
			@Pc(30) byte[] local30 = new byte[this.anInt1718];
			Static184.method1640(this.aByteArray14, 0, local30, 0, this.anInt1718);
			this.aByteArray14 = local30;
		}
		return this;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!gg;)Z")
	public boolean method1114(@OriginalArg(1) Class28 arg0) {
		if (this.anInt1718 < arg0.anInt1718) {
			return false;
		}
		@Pc(19) int local19 = this.anInt1718 - arg0.anInt1718;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt1718; local21++) {
			if (arg0.aByteArray14[local21] != this.aByteArray14[local21 + local19]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)Lclient!gg;")
	public Class28 method1115() {
		@Pc(17) Class28 local17 = new Class28();
		local17.anInt1718 = this.anInt1718;
		local17.aByteArray14 = new byte[this.anInt1718];
		@Pc(28) boolean local28 = true;
		for (@Pc(30) int local30 = 0; local30 < this.anInt1718; local30++) {
			@Pc(37) byte local37 = this.aByteArray14[local30];
			if (local37 == 95) {
				local17.aByteArray14[local30] = 32;
				local28 = true;
			} else if (local37 >= 97 && local37 <= 122 && local28) {
				local17.aByteArray14[local30] = (byte) (local37 - 32);
				local28 = false;
			} else {
				local28 = false;
				local17.aByteArray14[local30] = local37;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I")
	public int method1116(@OriginalArg(1) FontMetrics arg0) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray14, 0, this.anInt1718, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray14, 0, this.anInt1718);
		}
		return arg0.stringWidth(local18);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)Lclient!gg;")
	public Class28 method1117() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt1718 && (this.aByteArray14[local1] >= 0 && this.aByteArray14[local1] <= 32 || (this.aByteArray14[local1] & 0xFF) == 160); local1++) {
		}
		@Pc(38) int local38;
		for (local38 = this.anInt1718; local1 < local38 && (this.aByteArray14[local38 - 1] >= 0 && this.aByteArray14[local38 - 1] <= 32 || (this.aByteArray14[local38 - 1] & 0xFF) == 160); local38--) {
		}
		if (local1 == 0 && this.anInt1718 == local38) {
			return this;
		}
		@Pc(85) Class28 local85 = new Class28();
		local85.anInt1718 = local38 - local1;
		local85.aByteArray14 = new byte[local85.anInt1718];
		for (@Pc(98) int local98 = 0; local98 < local85.anInt1718; local98++) {
			local85.aByteArray14[local98] = this.aByteArray14[local98 + local1];
		}
		return local85;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!gg;IZ)I")
	public int method1118(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(12) int[] local12 = new int[arg0.anInt1718];
		@Pc(16) int[] local16 = new int[arg0.anInt1718];
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			local8[local18] = arg0.anInt1718;
		}
		for (@Pc(38) int local38 = 1; local38 <= arg0.anInt1718; local38++) {
			local12[local38 - 1] = (arg0.anInt1718 << 1) - local38;
			local8[arg0.aByteArray14[local38 - 1] & 0xFF] = arg0.anInt1718 - local38;
		}
		@Pc(80) int local80 = arg0.anInt1718 + 1;
		for (@Pc(83) int local83 = arg0.anInt1718; local83 > 0; local83--) {
			local16[local83 - 1] = local80;
			while (arg0.anInt1718 >= local80 && arg0.aByteArray14[local83 - 1] != arg0.aByteArray14[local80 - 1]) {
				if (local12[local80 - 1] >= arg0.anInt1718 - local83) {
					local12[local80 - 1] = arg0.anInt1718 - local83;
				}
				local80 = local16[local80 - 1];
			}
			local80--;
		}
		@Pc(149) int local149 = local80;
		@Pc(151) int local151 = 1;
		@Pc(153) int local153 = 0;
		local80 = arg0.anInt1718 + 1 - local80;
		for (@Pc(163) int local163 = 1; local163 <= local80; local163++) {
			local16[local163 - 1] = local153;
			while (local153 >= 1 && arg0.aByteArray14[local163 - 1] != arg0.aByteArray14[local153 - 1]) {
				local153 = local16[local153 - 1];
			}
			local153++;
		}
		@Pc(210) int local210;
		while (arg0.anInt1718 > local149) {
			for (local210 = local151; local210 <= local149; local210++) {
				if (local12[local210 - 1] >= local149 + arg0.anInt1718 - local210) {
					local12[local210 - 1] = local149 + arg0.anInt1718 - local210;
				}
			}
			local151 = local149 + 1;
			local149 = local149 + local80 - local16[local80 - 1];
			local80 = local16[local80 - 1];
		}
		@Pc(289) int local289;
		for (local210 = arg0.anInt1718 + arg1 - 1; local210 < this.anInt1718; local210 += Math.max(local8[this.aByteArray14[local210] & 0xFF], local12[local289])) {
			for (local289 = arg0.anInt1718 - 1; local289 >= 0 && this.aByteArray14[local210] == arg0.aByteArray14[local289]; local289--) {
				local210--;
			}
			if (local289 == -1) {
				return local210 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)Lclient!gg;")
	public Class28 method1119(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean86) {
			this.anInt1694 = 0;
			if (this.aByteArray14.length == this.anInt1718) {
				@Pc(46) int local46;
				for (local46 = 1; local46 <= this.anInt1718; local46 += local46) {
				}
				@Pc(63) byte[] local63 = new byte[local46];
				Static184.method1640(this.aByteArray14, 0, local63, 0, this.anInt1718);
				this.aByteArray14 = local63;
			}
			this.aByteArray14[this.anInt1718++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)I")
	public int method1121() {
		return this.anInt1718;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([BIIII)I")
	public int method1122(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static184.method1640(this.aByteArray14, 0, arg0, arg1, arg2);
		return arg2;
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)Lclient!gg;")
	public Class28 method1123() {
		@Pc(14) Class28 local14 = new Class28();
		local14.anInt1718 = this.anInt1718;
		local14.aByteArray14 = new byte[this.anInt1718];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1718; local25++) {
			@Pc(32) byte local32 = this.aByteArray14[local25];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local14.aByteArray14[local25] = local32;
		}
		return local14;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(ILclient!gg;)I")
	public int method1124(@OriginalArg(1) Class28 arg0) {
		return this.method1118(arg0, 0);
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)Lclient!gg;")
	public Class28 method1125() {
		@Pc(15) Class28 local15 = new Class28();
		local15.anInt1718 = this.anInt1718;
		local15.aByteArray14 = new byte[this.anInt1718];
		for (@Pc(26) int local26 = 0; local26 < this.anInt1718; local26++) {
			local15.aByteArray14[local26] = 42;
		}
		return local15;
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)I")
	public int method1126() {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1718; local12++) {
			local10 = (local10 << 5) + (this.aByteArray14[local12] & 0xFF) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "(B)Lclient!gg;")
	public Class28 method1127() {
		@Pc(7) long local7 = this.method1142();
		@Pc(16) Class local16 = gg.class;
		synchronized (gg.class) {
			@Pc(32) Class2_Sub16 local32;
			if (Static108.aClass35_34 == null) {
				Static108.aClass35_34 = new Class35(4096);
			} else {
				for (local32 = (Class2_Sub16) Static108.aClass35_34.method1354(local7); local32 != null; local32 = (Class2_Sub16) Static108.aClass35_34.method1355()) {
					if (this.method1107(local32.aClass28_1402)) {
						return local32.aClass28_1402;
					}
				}
			}
			local32 = new Class2_Sub16();
			local32.aClass28_1402 = this;
			this.aBoolean86 = false;
			Static108.aClass35_34.method1362(local32, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!gg;I)I")
	public int method1128(@OriginalArg(0) Class28 arg0) {
		@Pc(13) int local13;
		if (arg0.anInt1718 < this.anInt1718) {
			local13 = arg0.anInt1718;
		} else {
			local13 = this.anInt1718;
		}
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			if (Static28.anIntArray68[this.aByteArray14[local20] & 0xFF] < Static28.anIntArray68[arg0.aByteArray14[local20] & 0xFF]) {
				return -1;
			}
			if (Static28.anIntArray68[arg0.aByteArray14[local20] & 0xFF] < Static28.anIntArray68[this.aByteArray14[local20] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt1718 > this.anInt1718) {
			return -1;
		} else if (this.anInt1718 > arg0.anInt1718) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)J")
	public long method1129() {
		@Pc(7) long local7 = 0L;
		for (@Pc(9) int local9 = 0; this.anInt1718 > local9 && local9 < 12; local9++) {
			local7 *= 37L;
			@Pc(27) byte local27 = this.aByteArray14[local9];
			if (local27 >= 65 && local27 <= 90) {
				local7 += local27 + 1 - 65;
			} else if (local27 >= 97 && local27 <= 122) {
				local7 += local27 + 1 - 97;
			} else if (local27 >= 48 && local27 <= 57) {
				local7 += local27 - 21;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)Lclient!gg;")
	public Class28 method1131(@OriginalArg(1) int arg0) {
		return this.method1135(arg0, this.anInt1718);
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(Lclient!gg;I)Z")
	public boolean method1132(@OriginalArg(0) Class28 arg0) {
		if (this.anInt1718 < arg0.anInt1718) {
			return false;
		}
		for (@Pc(23) int local23 = 0; local23 < arg0.anInt1718; local23++) {
			if (arg0.aByteArray14[local23] != this.aByteArray14[local23]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "(B)Lclient!gg;")
	public Class28 method1133() {
		return Static83.method1479(this.method1129());
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(II)I")
	public int method1134(@OriginalArg(1) int arg0) {
		@Pc(19) boolean local19 = false;
		@Pc(27) boolean local27 = false;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt1718; local31++) {
			@Pc(40) int local40 = this.aByteArray14[local31] & 0xFF;
			if (local31 == 0) {
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
			@Pc(112) int local112 = local29 * arg0 + local40;
			if (local29 != local112 / arg0) {
				throw new NumberFormatException();
			}
			local27 = true;
			local29 = local112;
		}
		if (!local27) {
			throw new NumberFormatException();
		}
		return local29;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(III)Lclient!gg;")
	public Class28 method1135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class28 local7 = new Class28();
		local7.anInt1718 = arg1 - arg0;
		local7.aByteArray14 = new byte[arg1 - arg0];
		Static184.method1640(this.aByteArray14, arg0, local7.aByteArray14, 0, local7.anInt1718);
		return local7;
	}

	@OriginalMember(owner = "client!gg", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class28)) {
			throw new IllegalArgumentException();
		}
		return this.method1107((Class28) arg0);
	}

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)Z")
	public boolean method1136() {
		return this.method1141();
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(II)Lclient!gg;")
	public Class28 method1137(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(20) Class28 local20 = new Class28();
		local20.aByteArray14 = new byte[this.anInt1718 + 1];
		local20.anInt1718 = this.anInt1718 + 1;
		Static184.method1640(this.aByteArray14, 0, local20.aByteArray14, 0, this.anInt1718);
		local20.aByteArray14[this.anInt1718] = (byte) arg0;
		return local20;
	}

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)Lclient!gg;")
	public Class28 method1138() {
		@Pc(9) Class28 local9 = new Class28();
		local9.anInt1718 = this.anInt1718;
		local9.aByteArray14 = new byte[this.anInt1718];
		@Pc(20) byte local20 = 2;
		for (@Pc(27) int local27 = 0; local27 < this.anInt1718; local27++) {
			@Pc(34) byte local34 = this.aByteArray14[local27];
			if (local34 >= 97 && local34 <= 122 || !(local34 < -32 || local34 > -2 || local34 == -9)) {
				if (local20 == 2) {
					local34 = (byte) (local34 - 32);
				}
				local20 = 0;
			} else if (local34 >= 65 && local34 <= 90 || !(local34 < -64 || local34 > -34 || local34 == -41)) {
				if (local20 == 0) {
					local34 = (byte) (local34 + 32);
				}
				local20 = 0;
			} else if (local34 == 46 || local34 == 33 || local34 == 63) {
				local20 = 2;
			} else if (local34 != 32) {
				local20 = 1;
			} else if (local20 != 2) {
				local20 = 1;
			}
			local9.aByteArray14[local27] = local34;
		}
		return local9;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)I")
	public int method1139() {
		return this.method1134(10);
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(ILclient!gg;)Z")
	public boolean method1140(@OriginalArg(1) Class28 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt1718 == this.anInt1718) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt1718; local23++) {
				@Pc(30) byte local30 = this.aByteArray14[local23];
				if (local30 >= 65 && local30 <= 90 || local30 >= -64 && local30 <= -34 && local30 != -41) {
					local30 = (byte) (local30 + 32);
				}
				@Pc(61) byte local61 = arg0.aByteArray14[local23];
				if (local61 >= 65 && local61 <= 90 || local61 >= -64 && local61 <= -34 && local61 != -41) {
					local61 = (byte) (local61 + 32);
				}
				if (local30 != local61) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "(II)Z")
	private boolean method1141() {
		@Pc(13) boolean local13 = false;
		@Pc(27) boolean local27 = false;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt1718; local31++) {
			@Pc(40) int local40 = this.aByteArray14[local31] & 0xFF;
			if (local31 == 0) {
				if (local40 == 45) {
					local13 = true;
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
			if (local13) {
				local40 = -local40;
			}
			@Pc(109) int local109 = local29 * 10 + local40;
			if (local109 / 10 != local29) {
				return false;
			}
			local29 = local109;
			local27 = true;
		}
		return local27;
	}

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "(I)J")
	private long method1142() {
		@Pc(13) long local13 = 0L;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1718; local15++) {
			local13 = (long) (this.aByteArray14[local15] & 0xFF) + (local13 << 5) - local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "(B)[B")
	public byte[] method1143() {
		@Pc(15) byte[] local15 = new byte[this.anInt1718];
		Static184.method1640(this.aByteArray14, 0, local15, 0, this.anInt1718);
		return local15;
	}

	@OriginalMember(owner = "client!gg", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1126();
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(ILclient!gg;)I")
	public int method1144(@OriginalArg(1) Class28 arg0) {
		@Pc(17) int local17;
		if (arg0.anInt1718 >= this.anInt1718) {
			local17 = this.anInt1718;
		} else {
			local17 = arg0.anInt1718;
		}
		for (@Pc(24) int local24 = 0; local24 < local17; local24++) {
			if ((arg0.aByteArray14[local24] & 0xFF) > (this.aByteArray14[local24] & 0xFF)) {
				return -1;
			}
			if ((arg0.aByteArray14[local24] & 0xFF) < (this.aByteArray14[local24] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.anInt1718 > this.anInt1718) {
			return -1;
		} else if (arg0.anInt1718 < this.anInt1718) {
			return 1;
		} else {
			return 0;
		}
	}
}
