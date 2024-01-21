import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 implements Interface2 {

	@OriginalMember(owner = "client!a", name = "z", descriptor = "I")
	public int anInt23;

	@OriginalMember(owner = "client!a", name = "L", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!a", name = "P", descriptor = "I")
	private int anInt36;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "Z")
	private boolean aBoolean1 = true;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)Lclient!a;")
	public Class1 method1(@OriginalArg(1) int arg0) {
		return this.method19(arg0, this.anInt23);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II[BII)I")
	public int method2(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		Static116.method742(this.aByteArray1, 0, arg1, arg2, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)I")
	public int method3() {
		return this.method39();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)Lclient!a;")
	public Class1 method4() {
		@Pc(9) Class1 local9 = new Class1();
		local9.anInt23 = this.anInt23;
		local9.aByteArray1 = new byte[this.anInt23];
		@Pc(20) boolean local20 = true;
		for (@Pc(29) int local29 = 0; local29 < this.anInt23; local29++) {
			@Pc(36) byte local36 = this.aByteArray1[local29];
			if (local36 >= 97 && local36 <= 122 || !(local36 < -32 || local36 > -2 || local36 == -9)) {
				if (local20) {
					local36 = (byte) (local36 - 32);
				}
				local20 = false;
			} else if (local36 >= 65 && local36 <= 90 || local36 >= -64 && local36 <= -34 && local36 != -41) {
				if (!local20) {
					local36 = (byte) (local36 + 32);
				}
				local20 = false;
			}
			local9.aByteArray1[local29] = local36;
			if (local36 == 46 || local36 == 33 || local36 == 63) {
				local20 = true;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!a;I)Z")
	public boolean method5(@OriginalArg(0) Class1 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt23 == arg0.anInt23) {
			if (!this.aBoolean1 || !arg0.aBoolean1) {
				if (this.anInt36 == 0) {
					this.anInt36 = this.method27();
					if (this.anInt36 == 0) {
						this.anInt36 = 1;
					}
				}
				if (arg0.anInt36 == 0) {
					arg0.anInt36 = arg0.method27();
					if (arg0.anInt36 == 0) {
						arg0.anInt36 = 1;
					}
				}
				if (arg0.anInt36 != this.anInt36) {
					return false;
				}
			}
			for (@Pc(75) int local75 = 0; local75 < this.anInt23; local75++) {
				if (this.aByteArray1[local75] != arg0.aByteArray1[local75]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ)I")
	public int method6(@OriginalArg(0) int arg0) {
		return this.aByteArray1[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(BI)I")
	public int method8() {
		return this.method15();
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(B)J")
	public long method9() {
		@Pc(7) long local7 = 0L;
		for (@Pc(9) int local9 = 0; this.anInt23 > local9 && local9 < 12; local9++) {
			local7 *= 37L;
			@Pc(20) byte local20 = this.aByteArray1[local9];
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

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)I")
	public int method10() {
		return this.anInt23;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Lclient!a;I)I")
	public int method11(@OriginalArg(0) Class1 arg0) {
		return this.method32(arg0);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)Lclient!a;")
	public Class1 method12() {
		@Pc(5) Class1 local5 = new Class1();
		local5.anInt23 = this.anInt23;
		local5.aByteArray1 = new byte[this.anInt23];
		for (@Pc(20) int local20 = 0; local20 < this.anInt23; local20++) {
			local5.aByteArray1[local20] = 42;
		}
		return local5;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)Lclient!a;")
	public Class1 method13() {
		@Pc(9) Class1 local9 = new Class1();
		local9.anInt23 = 0;
		@Pc(22) int local22 = 0;
		local9.aByteArray1 = new byte[12];
		for (@Pc(28) int local28 = 0; local28 < this.anInt23; local28++) {
			if (this.aByteArray1[local28] >= 65 && this.aByteArray1[local28] <= 90) {
				local9.aByteArray1[local22++] = (byte) (this.aByteArray1[local28] + 97 - 65);
				local9.anInt23 = local22;
			} else if (this.aByteArray1[local28] >= 97 && this.aByteArray1[local28] <= 122 || this.aByteArray1[local28] >= 48 && this.aByteArray1[local28] <= 57) {
				local9.aByteArray1[local22++] = this.aByteArray1[local28];
				local9.anInt23 = local22;
			} else if (local22 > 0) {
				local9.aByteArray1[local22++] = 95;
			}
			if (local22 == 12) {
				break;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!a;Z)Z")
	public boolean method14(@OriginalArg(0) Class1 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt23 == this.anInt23) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt23; local23++) {
				@Pc(30) byte local30 = arg0.aByteArray1[local23];
				@Pc(35) byte local35 = this.aByteArray1[local23];
				if (local30 >= 65 && local30 <= 90 || local30 >= -64 && local30 <= -34 && local30 != -41) {
					local30 = (byte) (local30 + 32);
				}
				if (local35 >= 65 && local35 <= 90 || local35 >= -64 && local35 <= -34 && local35 != -41) {
					local35 = (byte) (local35 + 32);
				}
				if (local30 != local35) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIZ)I")
	private int method15() {
		for (@Pc(10) int local10 = 0; local10 < this.anInt23; local10++) {
			if (this.aByteArray1[local10] == 32) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BIILjava/awt/Graphics;)V")
	public void method16(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray1, 0, this.anInt23, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray1, 0, this.anInt23);
		}
		arg2.drawString(local9, arg0, arg1);
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)Lclient!a;")
	public Class1 method17() {
		@Pc(3) long local3 = this.method37();
		@Pc(16) Class local16 = a.class;
		synchronized (a.class) {
			@Pc(26) Class2_Sub8 local26;
			if (Static62.aClass25_3 == null) {
				Static62.aClass25_3 = new Class25(4096);
			} else {
				for (local26 = (Class2_Sub8) Static62.aClass25_3.method991(local3); local26 != null; local26 = (Class2_Sub8) Static62.aClass25_3.method993()) {
					if (this.method5(local26.aClass1_1899)) {
						return local26.aClass1_1899;
					}
				}
			}
			local26 = new Class2_Sub8();
			this.aBoolean1 = false;
			local26.aClass1_1899 = this;
			Static62.aClass25_3.method990(local26, local3);
			return this;
		}
	}

	@OriginalMember(owner = "client!a", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method27();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Z")
	private boolean method18() {
		@Pc(22) boolean local22 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		for (@Pc(32) int local32 = 0; local32 < this.anInt23; local32++) {
			@Pc(41) int local41 = this.aByteArray1[local32] & 0xFF;
			if (local32 == 0) {
				if (local41 == 45) {
					local22 = true;
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
			if (local22) {
				local41 = -local41;
			}
			@Pc(116) int local116 = local41 + local30 * 10;
			if (local116 / 10 != local30) {
				return false;
			}
			local30 = local116;
			local28 = true;
		}
		return local28;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)Lclient!a;")
	public Class1 method19(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class1 local11 = new Class1();
		local11.aByteArray1 = new byte[arg1 - arg0];
		local11.anInt23 = arg1 - arg0;
		Static116.method742(this.aByteArray1, arg0, local11.aByteArray1, 0, local11.anInt23);
		return local11;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!a;II)Lclient!a;")
	public Class1 method20(@OriginalArg(0) Class1 arg0, @OriginalArg(2) int arg1) {
		if (!this.aBoolean1) {
			throw new IllegalArgumentException();
		} else if (arg1 > this.anInt23) {
			throw new IllegalArgumentException();
		} else {
			this.anInt36 = 0;
			if (arg0.anInt23 + arg1 > this.aByteArray1.length) {
				@Pc(40) int local40;
				for (local40 = 1; local40 < arg0.anInt23 + arg1; local40 += local40) {
				}
				@Pc(59) byte[] local59 = new byte[local40];
				Static116.method742(this.aByteArray1, 0, local59, 0, this.anInt23);
				this.aByteArray1 = local59;
			}
			Static116.method742(arg0.aByteArray1, 0, this.aByteArray1, arg1, arg0.anInt23);
			if (this.anInt23 < arg1 + arg0.anInt23) {
				this.anInt23 = arg0.anInt23 + arg1;
			}
			return this;
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)Lclient!a;")
	public Class1 method21(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(18) Class1 local18 = new Class1();
		local18.aByteArray1 = new byte[this.anInt23 + 1];
		local18.anInt23 = this.anInt23 + 1;
		Static116.method742(this.aByteArray1, 0, local18.aByteArray1, 0, this.anInt23);
		local18.aByteArray1[this.anInt23] = (byte) arg0;
		return local18;
	}

	@OriginalMember(owner = "client!a", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!a;B)Lclient!a;")
	public Class1 method23(@OriginalArg(0) Class1 arg0) {
		if (!this.aBoolean1) {
			throw new IllegalArgumentException();
		}
		this.anInt36 = 0;
		if (this.anInt23 + arg0.anInt23 > this.aByteArray1.length) {
			@Pc(31) int local31;
			for (local31 = 1; local31 < this.anInt23 + arg0.anInt23; local31 += local31) {
			}
			@Pc(51) byte[] local51 = new byte[local31];
			Static116.method742(this.aByteArray1, 0, local51, 0, this.anInt23);
			this.aByteArray1 = local51;
		}
		Static116.method742(arg0.aByteArray1, 0, this.aByteArray1, this.anInt23, arg0.anInt23);
		this.anInt23 += arg0.anInt23;
		return this;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
	public int method24(@OriginalArg(1) FontMetrics arg0) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray1, 0, this.anInt23, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray1, 0, this.anInt23);
		}
		return arg0.stringWidth(local9);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BLclient!a;)Z")
	public boolean method26(@OriginalArg(1) Class1 arg0) {
		if (arg0.anInt23 > this.anInt23) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < arg0.anInt23; local19++) {
			if (this.aByteArray1[local19] != arg0.aByteArray1[local19]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(B)I")
	public int method27() {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt23; local12++) {
			local10 = (this.aByteArray1[local12] & 0xFF) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(B)Lclient!a;")
	public Class1 method28() {
		if (!this.aBoolean1) {
			throw new IllegalArgumentException();
		}
		this.anInt36 = 0;
		if (this.anInt23 != this.aByteArray1.length) {
			@Pc(31) byte[] local31 = new byte[this.anInt23];
			Static116.method742(this.aByteArray1, 0, local31, 0, this.anInt23);
			this.aByteArray1 = local31;
		}
		return this;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(II)Lclient!a;")
	public Class1 method29(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		} else if (this.aBoolean1) {
			this.anInt36 = 0;
			if (this.aByteArray1.length == this.anInt23) {
				@Pc(40) int local40;
				for (local40 = 1; local40 <= this.anInt23; local40 += local40) {
				}
				@Pc(53) byte[] local53 = new byte[local40];
				Static116.method742(this.aByteArray1, 0, local53, 0, this.anInt23);
				this.aByteArray1 = local53;
			}
			this.aByteArray1[this.anInt23++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(I)Lclient!a;")
	public Class1 method30() {
		@Pc(9) Class1 local9 = new Class1();
		local9.anInt23 = this.anInt23;
		local9.aByteArray1 = new byte[this.anInt23];
		for (@Pc(20) int local20 = 0; local20 < this.anInt23; local20++) {
			@Pc(27) byte local27 = this.aByteArray1[local20];
			if (local27 >= 65 && local27 <= 90 || local27 >= -64 && local27 <= -34 && local27 != -41) {
				local27 = (byte) (local27 + 32);
			}
			local9.aByteArray1[local20] = local27;
		}
		return local9;
	}

	@OriginalMember(owner = "client!a", name = "g", descriptor = "(I)[B")
	public byte[] method31() {
		@Pc(11) byte[] local11 = new byte[this.anInt23];
		Static116.method742(this.aByteArray1, 0, local11, 0, this.anInt23);
		return local11;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!a;IZ)I")
	private int method32(@OriginalArg(0) Class1 arg0) {
		@Pc(9) int[] local9 = new int[arg0.anInt23];
		@Pc(13) int[] local13 = new int[arg0.anInt23];
		@Pc(16) int[] local16 = new int[256];
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			local16[local18] = arg0.anInt23;
		}
		for (@Pc(41) int local41 = 1; local41 <= arg0.anInt23; local41++) {
			local9[local41 - 1] = (arg0.anInt23 << 1) - local41;
			local16[arg0.aByteArray1[local41 - 1] & 0xFF] = arg0.anInt23 - local41;
		}
		@Pc(82) int local82 = arg0.anInt23 + 1;
		for (@Pc(85) int local85 = arg0.anInt23; local85 > 0; local85--) {
			local13[local85 - 1] = local82;
			while (arg0.anInt23 >= local82 && arg0.aByteArray1[local82 - 1] != arg0.aByteArray1[local85 - 1]) {
				if (arg0.anInt23 - local85 <= local9[local82 - 1]) {
					local9[local82 - 1] = arg0.anInt23 - local85;
				}
				local82 = local13[local82 - 1];
			}
			local82--;
		}
		@Pc(153) int local153 = local82;
		local82 = arg0.anInt23 + 1 - local82;
		@Pc(162) int local162 = 1;
		@Pc(164) int local164 = 0;
		for (@Pc(166) int local166 = 1; local166 <= local82; local166++) {
			local13[local166 - 1] = local164;
			while (local164 >= 1 && arg0.aByteArray1[local166 - 1] != arg0.aByteArray1[local164 - 1]) {
				local164 = local13[local164 - 1];
			}
			local164++;
		}
		@Pc(207) int local207;
		while (local153 < arg0.anInt23) {
			for (local207 = local162; local207 <= local153; local207++) {
				if (local153 + arg0.anInt23 - local207 <= local9[local207 + -1]) {
					local9[local207 - 1] = arg0.anInt23 + local153 - local207;
				}
			}
			local162 = local153 + 1;
			local153 = local82 + local153 - local13[local82 - 1];
			local82 = local13[local82 - 1];
		}
		@Pc(282) int local282;
		for (local207 = arg0.anInt23 - 1; local207 < this.anInt23; local207 += Math.max(local16[this.aByteArray1[local207] & 0xFF], local9[local282])) {
			for (local282 = arg0.anInt23 - 1; local282 >= 0 && arg0.aByteArray1[local282] == this.aByteArray1[local207]; local282--) {
				local207--;
			}
			if (local282 == -1) {
				return local207 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!a", name = "h", descriptor = "(I)Z")
	public boolean method33() {
		return this.method18();
	}

	@OriginalMember(owner = "client!a", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Lclient!a;B)I")
	public int method35(@OriginalArg(0) Class1 arg0) {
		@Pc(9) int local9;
		if (arg0.anInt23 >= this.anInt23) {
			local9 = this.anInt23;
		} else {
			local9 = arg0.anInt23;
		}
		for (@Pc(20) int local20 = 0; local20 < local9; local20++) {
			if (arg0.aByteArray1[local20] > this.aByteArray1[local20]) {
				return -1;
			}
			if (this.aByteArray1[local20] > arg0.aByteArray1[local20]) {
				return 1;
			}
		}
		if (this.anInt23 < arg0.anInt23) {
			return -1;
		} else if (arg0.anInt23 < this.anInt23) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "i", descriptor = "(I)Lclient!a;")
	public Class1 method36() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class1 local11 = new Class1();
		local11.anInt23 = this.anInt23;
		local11.aByteArray1 = new byte[this.anInt23];
		for (@Pc(27) int local27 = 0; local27 < this.anInt23; local27++) {
			@Pc(34) byte local34 = this.aByteArray1[local27];
			if (local34 == 95) {
				local11.aByteArray1[local27] = 32;
				local7 = true;
			} else if (local34 >= 97 && local34 <= 122 && local7) {
				local7 = false;
				local11.aByteArray1[local27] = (byte) (local34 - 32);
			} else {
				local11.aByteArray1[local27] = local34;
				local7 = false;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!a", name = "j", descriptor = "(I)J")
	private long method37() {
		@Pc(5) long local5 = 0L;
		for (@Pc(12) int local12 = 0; local12 < this.anInt23; local12++) {
			local5 = (local5 << 5) + (long) (this.aByteArray1[local12] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!a;)Z")
	public boolean method38(@OriginalArg(1) Class1 arg0) {
		if (arg0.anInt23 > this.anInt23) {
			return false;
		}
		@Pc(30) int local30 = this.anInt23 - arg0.anInt23;
		for (@Pc(32) int local32 = 0; local32 < arg0.anInt23; local32++) {
			if (this.aByteArray1[local32 + local30] != arg0.aByteArray1[local32]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)I")
	private int method39() {
		@Pc(13) boolean local13 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt23; local23++) {
			@Pc(32) int local32 = this.aByteArray1[local23] & 0xFF;
			if (local23 == 0) {
				if (local32 == 45) {
					local19 = true;
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
			if (local19) {
				local32 = -local32;
			}
			@Pc(101) int local101 = local32 + local21 * 10;
			if (local21 != local101 / 10) {
				throw new NumberFormatException();
			}
			local21 = local101;
			local13 = true;
		}
		if (!local13) {
			throw new NumberFormatException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)Lclient!a;")
	public Class1 method40() {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = this.anInt23;
		while (local7 < this.anInt23 && (this.aByteArray1[local7] >= 0 && this.aByteArray1[local7] <= 32 || (this.aByteArray1[local7] & 0xFF) == 160)) {
			local7++;
		}
		while (local10 > local7 && (this.aByteArray1[local10 - 1] >= 0 && this.aByteArray1[local10 - 1] <= 32 || (this.aByteArray1[local10 - 1] & 0xFF) == 160)) {
			local10--;
		}
		if (local7 == 0 && local10 == this.anInt23) {
			return this;
		}
		@Pc(98) Class1 local98 = new Class1();
		local98.anInt23 = local10 - local7;
		local98.aByteArray1 = new byte[local98.anInt23];
		for (@Pc(111) int local111 = 0; local111 < local98.anInt23; local111++) {
			local98.aByteArray1[local111] = this.aByteArray1[local7 + local111];
		}
		return local98;
	}
}
