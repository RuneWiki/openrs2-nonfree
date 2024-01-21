import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class39 implements Interface2 {

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
	private int anInt1594;

	@OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
	public int anInt1601;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "Z")
	private boolean aBoolean85 = true;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)Lclient!ke;")
	public Class39 method1087(@OriginalArg(0) int arg0) {
		if (!this.aBoolean85) {
			throw new IllegalArgumentException();
		}
		this.anInt1594 = 0;
		if (this.aByteArray13.length == this.anInt1601) {
			@Pc(23) int local23;
			for (local23 = 1; local23 <= this.anInt1601; local23 += local23) {
			}
			@Pc(40) byte[] local40 = new byte[local23];
			Static114.method1154(this.aByteArray13, 0, local40, 0, this.anInt1601);
			this.aByteArray13 = local40;
		}
		this.aByteArray13[this.anInt1601++] = (byte) arg0;
		return this;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)I")
	public int method1088() {
		return this.anInt1601;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)Lclient!ke;")
	public Class39 method1089() {
		@Pc(9) Class39 local9 = new Class39();
		local9.aByteArray13 = new byte[12];
		local9.anInt1601 = 0;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anInt1601; local25++) {
			if (this.aByteArray13[local25] >= 65 && this.aByteArray13[local25] <= 90) {
				local9.aByteArray13[local23++] = (byte) (this.aByteArray13[local25] + 32);
				local9.anInt1601 = local23;
			} else if (this.aByteArray13[local25] >= 97 && this.aByteArray13[local25] <= 122 || this.aByteArray13[local25] >= 48 && this.aByteArray13[local25] <= 57) {
				local9.aByteArray13[local23++] = this.aByteArray13[local25];
				local9.anInt1601 = local23;
			} else if (local23 > 0) {
				local9.aByteArray13[local23++] = 95;
			}
			if (local23 == 12) {
				break;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)J")
	public long method1090() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1601 && local7 < 12; local7++) {
			local5 *= 37L;
			@Pc(17) byte local17 = this.aByteArray13[local7];
			if (local17 >= 65 && local17 <= 90) {
				local5 += local17 - 64;
			} else if (local17 >= 97 && local17 <= 122) {
				local5 += local17 - 96;
			} else if (local17 >= 48 && local17 <= 57) {
				local5 += local17 + 27 - 48;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ke;B)Lclient!ke;")
	public Class39 method1091(@OriginalArg(0) Class39 arg0) {
		if (!this.aBoolean85) {
			throw new IllegalArgumentException();
		}
		this.anInt1594 = 0;
		if (arg0.anInt1601 + this.anInt1601 > this.aByteArray13.length) {
			@Pc(31) int local31;
			for (local31 = 1; local31 < this.anInt1601 + arg0.anInt1601; local31 += local31) {
			}
			@Pc(51) byte[] local51 = new byte[local31];
			Static114.method1154(this.aByteArray13, 0, local51, 0, this.anInt1601);
			this.aByteArray13 = local51;
		}
		Static114.method1154(arg0.aByteArray13, 0, this.aByteArray13, this.anInt1601, arg0.anInt1601);
		this.anInt1601 += arg0.anInt1601;
		return this;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ke;Z)Z")
	public boolean method1093(@OriginalArg(0) Class39 arg0) {
		if (this.anInt1601 < arg0.anInt1601) {
			return false;
		}
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1601; local25++) {
			if (arg0.aByteArray13[local25] != this.aByteArray13[local25]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III[BI)I")
	public int method1094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		Static114.method1154(this.aByteArray13, 0, arg2, arg1, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)Lclient!ke;")
	public Class39 method1095(@OriginalArg(0) int arg0) {
		@Pc(7) Class39 local7 = new Class39();
		local7.aByteArray13 = new byte[this.anInt1601 + 1];
		local7.anInt1601 = this.anInt1601 + 1;
		Static114.method1154(this.aByteArray13, 0, local7.aByteArray13, 0, this.anInt1601);
		local7.aByteArray13[this.anInt1601] = (byte) arg0;
		return local7;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)Lclient!ke;")
	public Class39 method1096() {
		if (!this.aBoolean85) {
			throw new IllegalArgumentException();
		}
		this.anInt1594 = 0;
		if (this.anInt1601 != this.aByteArray13.length) {
			@Pc(31) byte[] local31 = new byte[this.anInt1601];
			Static114.method1154(this.aByteArray13, 0, local31, 0, this.anInt1601);
			this.aByteArray13 = local31;
		}
		return this;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public void method1098(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		@Pc(21) String local21;
		try {
			local21 = new String(this.aByteArray13, 0, this.anInt1601, "ISO-8859-1");
		} catch (@Pc(23) UnsupportedEncodingException local23) {
			local21 = new String(this.aByteArray13, 0, this.anInt1601);
		}
		arg2.drawString(local21, arg0, arg1);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Lclient!ke;")
	public Class39 method1099(@OriginalArg(1) int arg0) {
		return this.method1115(arg0, this.anInt1601);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!ke;)I")
	public int method1100(@OriginalArg(1) Class39 arg0) {
		return this.method1113(arg0);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I")
	public int method1101(@OriginalArg(1) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray13, 0, this.anInt1601, "ISO-8859-1");
		} catch (@Pc(23) UnsupportedEncodingException local23) {
			local13 = new String(this.aByteArray13, 0, this.anInt1601);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!ke", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)I")
	public int method1102() {
		return this.method1121();
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)Lclient!ke;")
	public Class39 method1103() {
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.anInt1601 && this.aByteArray13[local5] >= 0 && this.aByteArray13[local5] <= 32; local5++) {
		}
		@Pc(28) int local28;
		for (local28 = this.anInt1601; local5 < local28 && this.aByteArray13[local28 - 1] >= 0 && this.aByteArray13[local28 - 1] <= 32; local28--) {
		}
		if (local5 == 0 && local28 == this.anInt1601) {
			return this;
		}
		@Pc(76) Class39 local76 = new Class39();
		local76.anInt1601 = local28 - local5;
		local76.aByteArray13 = new byte[local76.anInt1601];
		for (@Pc(94) int local94 = 0; local94 < local76.anInt1601; local94++) {
			local76.aByteArray13[local94] = this.aByteArray13[local5 + local94];
		}
		return local76;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)Z")
	private boolean method1104() {
		@Pc(1) boolean local1 = false;
		@Pc(19) boolean local19 = false;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt1601; local28++) {
			@Pc(36) int local36 = this.aByteArray13[local28] & 0xFF;
			if (local28 == 0) {
				if (local36 == 45) {
					local19 = true;
					continue;
				}
				if (local36 == 43) {
					continue;
				}
			}
			if (local36 >= 48 && local36 <= 57) {
				local36 -= 48;
			} else if (local36 >= 65 && local36 <= 90) {
				local36 -= 55;
			} else if (local36 >= 97 && local36 <= 122) {
				local36 -= 87;
			} else {
				return false;
			}
			if (local36 >= 10) {
				return false;
			}
			if (local19) {
				local36 = -local36;
			}
			@Pc(100) int local100 = local36 + local26 * 10;
			if (local26 != local100 / 10) {
				return false;
			}
			local1 = true;
			local26 = local100;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ke", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)Lclient!ke;")
	public Class39 method1105() {
		@Pc(7) Class39 local7 = new Class39();
		local7.anInt1601 = this.anInt1601;
		local7.aByteArray13 = new byte[this.anInt1601];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1601; local18++) {
			local7.aByteArray13[local18] = 42;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLclient!ke;)Z")
	public boolean method1106(@OriginalArg(1) Class39 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1601 == arg0.anInt1601) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt1601; local26++) {
				@Pc(32) byte local32 = this.aByteArray13[local26];
				if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
					local32 = (byte) (local32 + 32);
				}
				@Pc(65) byte local65 = arg0.aByteArray13[local26];
				if (local65 >= 65 && local65 <= 90 || local65 >= -64 && local65 <= -34 && local65 != -41) {
					local65 = (byte) (local65 + 32);
				}
				if (local65 != local32) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)Lclient!ke;")
	public Class39 method1107() {
		@Pc(8) Class39 local8 = new Class39();
		local8.anInt1601 = this.anInt1601;
		local8.aByteArray13 = new byte[this.anInt1601];
		for (@Pc(23) int local23 = 0; local23 < this.anInt1601; local23++) {
			@Pc(29) byte local29 = this.aByteArray13[local23];
			if (local29 >= 65 && local29 <= 90 || local29 >= -64 && local29 <= -34 && local29 != -41) {
				local29 = (byte) (local29 + 32);
			}
			local8.aByteArray13[local23] = local29;
		}
		return local8;
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)Lclient!ke;")
	public Class39 method1108() {
		@Pc(7) long local7 = this.method1110();
		@Pc(16) Class local16 = ke.class;
		synchronized (ke.class) {
			@Pc(32) Class2_Sub11 local32;
			if (Static95.aClass57_5 == null) {
				Static95.aClass57_5 = new Class57(4096);
			} else {
				for (local32 = (Class2_Sub11) Static95.aClass57_5.method1678(local7); local32 != null; local32 = (Class2_Sub11) Static95.aClass57_5.method1676()) {
					if (this.method1124(local32.aClass39_932)) {
						return local32.aClass39_932;
					}
				}
			}
			local32 = new Class2_Sub11();
			local32.aClass39_932 = this;
			this.aBoolean85 = false;
			Static95.aClass57_5.method1671(local7, local32);
			return this;
		}
	}

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)Z")
	public boolean method1109() {
		return this.method1104();
	}

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "(I)J")
	private long method1110() {
		@Pc(5) long local5 = 0L;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1601; local12++) {
			local5 = (local5 << 5) + (long) (this.aByteArray13[local12] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "(I)I")
	public int method1111() {
		return this.method1117();
	}

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "(I)[B")
	public byte[] method1112() {
		@Pc(3) byte[] local3 = new byte[this.anInt1601];
		Static114.method1154(this.aByteArray13, 0, local3, 0, this.anInt1601);
		return local3;
	}

	@OriginalMember(owner = "client!ke", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1119();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ke;IB)I")
	private int method1113(@OriginalArg(0) Class39 arg0) {
		@Pc(6) int[] local6 = new int[256];
		@Pc(10) int[] local10 = new int[arg0.anInt1601];
		@Pc(14) int[] local14 = new int[arg0.anInt1601];
		for (@Pc(21) int local21 = 0; local21 < local6.length; local21++) {
			local6[local21] = arg0.anInt1601;
		}
		for (@Pc(34) int local34 = 1; local34 <= arg0.anInt1601; local34++) {
			local10[local34 - 1] = (arg0.anInt1601 << 1) - local34;
			local6[arg0.aByteArray13[local34 - 1] & 0xFF] = arg0.anInt1601 - local34;
		}
		@Pc(76) int local76 = arg0.anInt1601 + 1;
		@Pc(79) int local79 = arg0.anInt1601;
		while (local79 > 0) {
			local14[local79 - 1] = local76;
			while (arg0.anInt1601 >= local76 && arg0.aByteArray13[local76 - 1] != arg0.aByteArray13[local79 - 1]) {
				if (local10[local76 - 1] >= arg0.anInt1601 - local79) {
					local10[local76 - 1] = arg0.anInt1601 - local79;
				}
				local76 = local14[local76 - 1];
			}
			local79--;
			local76--;
		}
		@Pc(144) int local144 = local76;
		@Pc(146) int local146 = 0;
		@Pc(148) int local148 = 1;
		local76 = arg0.anInt1601 + 1 - local76;
		for (@Pc(158) int local158 = 1; local158 <= local76; local158++) {
			local14[local158 - 1] = local146;
			while (local146 >= 1 && arg0.aByteArray13[local158 - 1] != arg0.aByteArray13[local146 - 1]) {
				local146 = local14[local146 - 1];
			}
			local146++;
		}
		@Pc(204) int local204;
		while (arg0.anInt1601 > local144) {
			for (local204 = local148; local204 <= local144; local204++) {
				if (local10[local204 - 1] >= local144 + arg0.anInt1601 - local204) {
					local10[local204 - 1] = local144 + arg0.anInt1601 - local204;
				}
			}
			local148 = local144 + 1;
			local144 = local144 + local76 - local14[local76 - 1];
			local76 = local14[local76 - 1];
		}
		@Pc(276) int local276;
		for (local204 = arg0.anInt1601 - 1; local204 < this.anInt1601; local204 += Math.max(local6[this.aByteArray13[local204] & 0xFF], local10[local276])) {
			for (local276 = arg0.anInt1601 - 1; local276 >= 0 && arg0.aByteArray13[local276] == this.aByteArray13[local204]; local276--) {
				local204--;
			}
			if (local276 == -1) {
				return local204 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(IIB)Lclient!ke;")
	public Class39 method1115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class39 local3 = new Class39();
		local3.aByteArray13 = new byte[arg1 - arg0];
		local3.anInt1601 = arg1 - arg0;
		Static114.method1154(this.aByteArray13, arg0, local3.aByteArray13, 0, local3.anInt1601);
		return local3;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ke;I)Z")
	public boolean method1116(@OriginalArg(0) Class39 arg0) {
		if (this.anInt1601 < arg0.anInt1601) {
			return false;
		}
		@Pc(31) int local31 = this.anInt1601 - arg0.anInt1601;
		for (@Pc(33) int local33 = 0; local33 < arg0.anInt1601; local33++) {
			if (arg0.aByteArray13[local33] != this.aByteArray13[local31 + local33]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(II)I")
	private int method1117() {
		@Pc(17) boolean local17 = false;
		@Pc(25) boolean local25 = false;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt1601; local29++) {
			@Pc(38) int local38 = this.aByteArray13[local29] & 0xFF;
			if (local29 == 0) {
				if (local38 == 45) {
					local17 = true;
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
			if (local38 >= 10) {
				throw new NumberFormatException();
			}
			if (local17) {
				local38 = -local38;
			}
			@Pc(108) int local108 = local27 * 10 + local38;
			if (local27 != local108 / 10) {
				throw new NumberFormatException();
			}
			local25 = true;
			local27 = local108;
		}
		if (!local25) {
			throw new NumberFormatException();
		}
		return local27;
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(B)Lclient!ke;")
	public Class39 method1118() {
		@Pc(7) Class39 local7 = new Class39();
		local7.anInt1601 = this.anInt1601;
		local7.aByteArray13 = new byte[this.anInt1601];
		@Pc(18) boolean local18 = true;
		for (@Pc(28) int local28 = 0; local28 < this.anInt1601; local28++) {
			@Pc(34) byte local34 = this.aByteArray13[local28];
			if (local34 >= 97 && local34 <= 122 || !(local34 < -32 || local34 > -2 || local34 == -9)) {
				if (local18) {
					local34 = (byte) (local34 - 32);
				}
				local18 = false;
			} else if (local34 >= 65 && local34 <= 90 || local34 >= -64 && local34 <= -34 && local34 != -41) {
				if (!local18) {
					local34 = (byte) (local34 + 32);
				}
				local18 = false;
			}
			if (local34 == 46 || local34 == 33 || local34 == 63) {
				local18 = true;
			}
			local7.aByteArray13[local28] = local34;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(B)I")
	public int method1119() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1601; local7++) {
			local5 = (local5 << 5) + ((this.aByteArray13[local7] & 0xFF) - local5);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "(I)Lclient!ke;")
	public Class39 method1120() {
		@Pc(12) Class39 local12 = new Class39();
		local12.anInt1601 = this.anInt1601;
		local12.aByteArray13 = new byte[this.anInt1601];
		@Pc(23) boolean local23 = true;
		for (@Pc(25) int local25 = 0; local25 < this.anInt1601; local25++) {
			@Pc(31) byte local31 = this.aByteArray13[local25];
			if (local31 == 95) {
				local23 = true;
				local12.aByteArray13[local25] = 32;
			} else if (local31 >= 97 && local31 <= 122 && local23) {
				local23 = false;
				local12.aByteArray13[local25] = (byte) (local31 - 32);
			} else {
				local23 = false;
				local12.aByteArray13[local25] = local31;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(IIB)I")
	private int method1121() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt1601; local15++) {
			if (this.aByteArray13[local15] == 32) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!ke;I)Lclient!ke;")
	public Class39 method1122(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean85) {
			throw new IllegalArgumentException();
		} else if (this.anInt1601 < arg1) {
			throw new IllegalArgumentException();
		} else {
			this.anInt1594 = 0;
			if (arg0.anInt1601 + arg1 > this.aByteArray13.length) {
				@Pc(49) int local49;
				for (local49 = 1; local49 < arg1 + arg0.anInt1601; local49 += local49) {
				}
				@Pc(68) byte[] local68 = new byte[local49];
				Static114.method1154(this.aByteArray13, 0, local68, 0, this.anInt1601);
				this.aByteArray13 = local68;
			}
			Static114.method1154(arg0.aByteArray13, 0, this.aByteArray13, arg1, arg0.anInt1601);
			if (arg0.anInt1601 + arg1 > this.anInt1601) {
				this.anInt1601 = arg0.anInt1601 + arg1;
			}
			return this;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)I")
	public int method1123(@OriginalArg(1) int arg0) {
		return this.aByteArray13[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(BLclient!ke;)Z")
	public boolean method1124(@OriginalArg(1) Class39 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1601 == arg0.anInt1601) {
			if (!this.aBoolean85 || !arg0.aBoolean85) {
				if (this.anInt1594 == 0) {
					this.anInt1594 = this.method1119();
					if (this.anInt1594 == 0) {
						this.anInt1594 = 1;
					}
				}
				if (arg0.anInt1594 == 0) {
					arg0.anInt1594 = arg0.method1119();
					if (arg0.anInt1594 == 0) {
						arg0.anInt1594 = 1;
					}
				}
				if (this.anInt1594 != arg0.anInt1594) {
					return false;
				}
			}
			for (@Pc(76) int local76 = 0; local76 < this.anInt1601; local76++) {
				if (this.aByteArray13[local76] != arg0.aByteArray13[local76]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}
