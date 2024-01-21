import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class36 implements Interface4 {

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	public int anInt1442;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
	private int anInt1457;

	@OriginalMember(owner = "client!kc", name = "H", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "Z")
	private boolean aBoolean69 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)Lclient!kc;")
	public Class36 method1002(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(24) Class36 local24 = new Class36();
		local24.aByteArray9 = new byte[this.anInt1442 + 1];
		local24.anInt1442 = this.anInt1442 + 1;
		Static122.method709(this.aByteArray9, 0, local24.aByteArray9, 0, this.anInt1442);
		local24.aByteArray9[this.anInt1442] = (byte) arg0;
		return local24;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)I")
	public int method1003() {
		return this.method1035();
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)I")
	public int method1004(@OriginalArg(0) int arg0) {
		return this.aByteArray9[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!kc;I)I")
	private int method1005(@OriginalArg(1) Class36 arg0) {
		@Pc(5) int[] local5 = new int[arg0.anInt1442];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg0.anInt1442];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg0.anInt1442;
		}
		for (@Pc(40) int local40 = 1; local40 <= arg0.anInt1442; local40++) {
			local5[local40 - 1] = (arg0.anInt1442 << 1) - local40;
			local12[arg0.aByteArray9[local40 - 1] & 0xFF] = arg0.anInt1442 - local40;
		}
		@Pc(81) int local81 = arg0.anInt1442 + 1;
		for (@Pc(84) int local84 = arg0.anInt1442; local84 > 0; local84--) {
			local16[local84 - 1] = local81;
			while (arg0.anInt1442 >= local81 && arg0.aByteArray9[local81 - 1] != arg0.aByteArray9[local84 - 1]) {
				if (local5[local81 - 1] >= arg0.anInt1442 - local84) {
					local5[local81 - 1] = arg0.anInt1442 - local84;
				}
				local81 = local16[local81 - 1];
			}
			local81--;
		}
		@Pc(159) int local159 = local81;
		local81 = arg0.anInt1442 + 1 - local81;
		@Pc(169) int local169 = 1;
		@Pc(171) int local171 = 0;
		@Pc(173) int local173 = 1;
		while (local173 <= local81) {
			local16[local173 - 1] = local171;
			while (local171 >= 1 && arg0.aByteArray9[local171 - 1] != arg0.aByteArray9[local173 - 1]) {
				local171 = local16[local171 - 1];
			}
			local173++;
			local171++;
		}
		@Pc(220) int local220;
		while (arg0.anInt1442 > local159) {
			for (local220 = local169; local220 <= local159; local220++) {
				if (arg0.anInt1442 + local159 - local220 <= local5[local220 + -1]) {
					local5[local220 - 1] = local159 + arg0.anInt1442 - local220;
				}
			}
			local169 = local159 + 1;
			local159 = local81 + local159 - local16[local81 + -1];
			local81 = local16[local81 - 1];
		}
		@Pc(295) int local295;
		for (local220 = arg0.anInt1442 - 1; local220 < this.anInt1442; local220 += Math.max(local12[this.aByteArray9[local220] & 0xFF], local5[local295])) {
			for (local295 = arg0.anInt1442 - 1; local295 >= 0 && arg0.aByteArray9[local295] == this.aByteArray9[local220]; local295--) {
				local220--;
			}
			if (local295 == -1) {
				return local220 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!kc;)Z")
	public boolean method1006(@OriginalArg(1) Class36 arg0) {
		if (arg0.anInt1442 > this.anInt1442) {
			return false;
		}
		@Pc(27) int local27 = this.anInt1442 - arg0.anInt1442;
		for (@Pc(29) int local29 = 0; local29 < arg0.anInt1442; local29++) {
			if (arg0.aByteArray9[local29] != this.aByteArray9[local27 + local29]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI[BII)I")
	public int method1007(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2) {
		Static122.method709(this.aByteArray9, 0, arg1, arg2, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!kc;I)I")
	public int method1009(@OriginalArg(0) Class36 arg0) {
		return this.method1005(arg0);
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(II)Lclient!kc;")
	public Class36 method1010(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		} else if (this.aBoolean69) {
			this.anInt1457 = 0;
			if (this.anInt1442 == this.aByteArray9.length) {
				@Pc(42) int local42;
				for (local42 = 1; local42 <= this.anInt1442; local42 += local42) {
				}
				@Pc(59) byte[] local59 = new byte[local42];
				Static122.method709(this.aByteArray9, 0, local59, 0, this.anInt1442);
				this.aByteArray9 = local59;
			}
			this.aByteArray9[this.anInt1442++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)Z")
	public boolean method1011() {
		return this.method1025();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)I")
	public int method1012() {
		return this.method1038();
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)Lclient!kc;")
	public Class36 method1013() {
		@Pc(13) long local13 = this.method1023();
		@Pc(22) Class local22 = kc.class;
		synchronized (kc.class) {
			@Pc(38) Class2_Sub4 local38;
			if (Static108.aClass31_7 == null) {
				Static108.aClass31_7 = new Class31(4096);
			} else {
				for (local38 = (Class2_Sub4) Static108.aClass31_7.method905(local13); local38 != null; local38 = (Class2_Sub4) Static108.aClass31_7.method907()) {
					if (this.method1022(local38.aClass36_315)) {
						return local38.aClass36_315;
					}
				}
			}
			local38 = new Class2_Sub4();
			this.aBoolean69 = false;
			local38.aClass36_315 = this;
			Static108.aClass31_7.method912(local13, local38);
			return this;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)Lclient!kc;")
	public Class36 method1014() {
		@Pc(15) int local15 = this.anInt1442;
		@Pc(17) int local17;
		for (local17 = 0; local17 < this.anInt1442 && (this.aByteArray9[local17] >= 0 && this.aByteArray9[local17] <= 32 || (this.aByteArray9[local17] & 0xFF) == 160); local17++) {
		}
		while (local17 < local15 && (this.aByteArray9[local15 - 1] >= 0 && this.aByteArray9[local15 - 1] <= 32 || (this.aByteArray9[local15 - 1] & 0xFF) == 160)) {
			local15--;
		}
		if (local17 == 0 && this.anInt1442 == local15) {
			return this;
		}
		@Pc(105) Class36 local105 = new Class36();
		local105.anInt1442 = local15 - local17;
		local105.aByteArray9 = new byte[local105.anInt1442];
		for (@Pc(117) int local117 = 0; local117 < local105.anInt1442; local117++) {
			local105.aByteArray9[local117] = this.aByteArray9[local17 + local117];
		}
		return local105;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)Lclient!kc;")
	public Class36 method1015() {
		@Pc(10) Class36 local10 = new Class36();
		local10.anInt1442 = this.anInt1442;
		local10.aByteArray9 = new byte[this.anInt1442];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1442; local25++) {
			local10.aByteArray9[local25] = 42;
		}
		return local10;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)Lclient!kc;")
	public Class36 method1016() {
		@Pc(7) Class36 local7 = new Class36();
		local7.anInt1442 = this.anInt1442;
		local7.aByteArray9 = new byte[this.anInt1442];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1442; local18++) {
			@Pc(24) byte local24 = this.aByteArray9[local18];
			if (local24 >= 65 && local24 <= 90 || local24 >= -64 && local24 <= -34 && local24 != -41) {
				local24 = (byte) (local24 + 32);
			}
			local7.aByteArray9[local18] = local24;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)Lclient!kc;")
	public Class36 method1017() {
		@Pc(9) Class36 local9 = new Class36();
		local9.anInt1442 = this.anInt1442;
		local9.aByteArray9 = new byte[this.anInt1442];
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < this.anInt1442; local27++) {
			@Pc(34) byte local34 = this.aByteArray9[local27];
			if (local34 == 95) {
				local25 = true;
				local9.aByteArray9[local27] = 32;
			} else if (local34 >= 97 && local34 <= 122 && local25) {
				local9.aByteArray9[local27] = (byte) (local34 - 32);
				local25 = false;
			} else {
				local9.aByteArray9[local27] = local34;
				local25 = false;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)Lclient!kc;")
	public Class36 method1018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class36 local7 = new Class36();
		local7.aByteArray9 = new byte[arg1 - arg0];
		local7.anInt1442 = arg1 - arg0;
		Static122.method709(this.aByteArray9, arg0, local7.aByteArray9, 0, local7.anInt1442);
		return local7;
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(B)Lclient!kc;")
	public Class36 method1019() {
		if (!this.aBoolean69) {
			throw new IllegalArgumentException();
		}
		this.anInt1457 = 0;
		if (this.aByteArray9.length != this.anInt1442) {
			@Pc(34) byte[] local34 = new byte[this.anInt1442];
			Static122.method709(this.aByteArray9, 0, local34, 0, this.anInt1442);
			this.aByteArray9 = local34;
		}
		return this;
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(II)Lclient!kc;")
	public Class36 method1020(@OriginalArg(1) int arg0) {
		return this.method1018(arg0, this.anInt1442);
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)J")
	public long method1021() {
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < this.anInt1442 && local17 < 12; local17++) {
			local15 *= 37L;
			@Pc(28) byte local28 = this.aByteArray9[local17];
			if (local28 >= 65 && local28 <= 90) {
				local15 += local28 + 1 - 65;
			} else if (local28 >= 97 && local28 <= 122) {
				local15 += local28 + 1 - 97;
			} else if (local28 >= 48 && local28 <= 57) {
				local15 += local28 - 21;
			}
		}
		while (local15 % 37L == 0L && local15 != 0L) {
			local15 /= 37L;
		}
		return local15;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!kc;B)Z")
	public boolean method1022(@OriginalArg(0) Class36 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt1442 == this.anInt1442) {
			if (!this.aBoolean69 || !arg0.aBoolean69) {
				if (this.anInt1457 == 0) {
					this.anInt1457 = this.method1041();
					if (this.anInt1457 == 0) {
						this.anInt1457 = 1;
					}
				}
				if (arg0.anInt1457 == 0) {
					arg0.anInt1457 = arg0.method1041();
					if (arg0.anInt1457 == 0) {
						arg0.anInt1457 = 1;
					}
				}
				if (arg0.anInt1457 != this.anInt1457) {
					return false;
				}
			}
			for (@Pc(73) int local73 = 0; local73 < this.anInt1442; local73++) {
				if (arg0.aByteArray9[local73] != this.aByteArray9[local73]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)J")
	private long method1023() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1442; local7++) {
			local5 = (long) (this.aByteArray9[local7] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(Lclient!kc;B)Z")
	public boolean method1024(@OriginalArg(0) Class36 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1442 == arg0.anInt1442) {
			for (@Pc(28) int local28 = 0; local28 < this.anInt1442; local28++) {
				@Pc(34) byte local34 = this.aByteArray9[local28];
				@Pc(39) byte local39 = arg0.aByteArray9[local28];
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

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)Z")
	private boolean method1025() {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = 0; local33 < this.anInt1442; local33++) {
			@Pc(42) int local42 = this.aByteArray9[local33] & 0xFF;
			if (local33 == 0) {
				if (local42 == 45) {
					local15 = true;
					continue;
				}
				if (local42 == 43) {
					continue;
				}
			}
			if (local42 >= 48 && local42 <= 57) {
				local42 -= 48;
			} else if (local42 >= 65 && local42 <= 90) {
				local42 -= 55;
			} else if (local42 >= 97 && local42 <= 122) {
				local42 -= 87;
			} else {
				return false;
			}
			if (local42 >= 10) {
				return false;
			}
			if (local15) {
				local42 = -local42;
			}
			@Pc(118) int local118 = local42 + local31 * 10;
			if (local118 / 10 != local31) {
				return false;
			}
			local31 = local118;
			local17 = true;
		}
		return local17;
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)Lclient!kc;")
	public Class36 method1026() {
		@Pc(15) int local15 = 0;
		@Pc(19) Class36 local19 = new Class36();
		local19.anInt1442 = 0;
		local19.aByteArray9 = new byte[12];
		for (@Pc(28) int local28 = 0; local28 < this.anInt1442; local28++) {
			if (this.aByteArray9[local28] >= 65 && this.aByteArray9[local28] <= 90) {
				local19.aByteArray9[local15++] = (byte) (this.aByteArray9[local28] + 32);
				local19.anInt1442 = local15;
			} else if (this.aByteArray9[local28] >= 97 && this.aByteArray9[local28] <= 122 || this.aByteArray9[local28] >= 48 && this.aByteArray9[local28] <= 57) {
				local19.aByteArray9[local15++] = this.aByteArray9[local28];
				local19.anInt1442 = local15;
			} else if (local15 > 0) {
				local19.aByteArray9[local15++] = 95;
			}
			if (local15 == 12) {
				break;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLjava/awt/FontMetrics;)I")
	public int method1027(@OriginalArg(1) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray9, 0, this.anInt1442, "ISO-8859-1");
		} catch (@Pc(24) UnsupportedEncodingException local24) {
			local13 = new String(this.aByteArray9, 0, this.anInt1442);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)I")
	public int method1028() {
		return this.anInt1442;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILclient!kc;)Lclient!kc;")
	public Class36 method1029(@OriginalArg(1) int arg0, @OriginalArg(2) Class36 arg1) {
		if (!this.aBoolean69) {
			throw new IllegalArgumentException();
		} else if (this.anInt1442 < arg0) {
			throw new IllegalArgumentException();
		} else {
			this.anInt1457 = 0;
			if (arg1.anInt1442 + arg0 > this.aByteArray9.length) {
				@Pc(33) int local33;
				for (local33 = 1; local33 < arg1.anInt1442 + arg0; local33 += local33) {
				}
				@Pc(48) byte[] local48 = new byte[local33];
				Static122.method709(this.aByteArray9, 0, local48, 0, this.anInt1442);
				this.aByteArray9 = local48;
			}
			Static122.method709(arg1.aByteArray9, 0, this.aByteArray9, arg0, arg1.anInt1442);
			if (this.anInt1442 < arg1.anInt1442 + arg0) {
				this.anInt1442 = arg0 + arg1.anInt1442;
			}
			return this;
		}
	}

	@OriginalMember(owner = "client!kc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "(I)Lclient!kc;")
	public Class36 method1032() {
		@Pc(3) Class36 local3 = new Class36();
		local3.anInt1442 = this.anInt1442;
		local3.aByteArray9 = new byte[this.anInt1442];
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < this.anInt1442; local28++) {
			@Pc(34) byte local34 = this.aByteArray9[local28];
			if (local34 >= 97 && local34 <= 122 || local34 >= -32 && local34 <= -2 && local34 != -9) {
				if (local26) {
					local34 = (byte) (local34 - 32);
				}
				local26 = false;
			} else if (local34 >= 65 && local34 <= 90 || local34 >= -64 && local34 <= -34 && local34 != -41) {
				if (!local26) {
					local34 = (byte) (local34 + 32);
				}
				local26 = false;
			}
			local3.aByteArray9[local28] = local34;
			if (local34 == 46 || local34 == 33 || local34 == 63) {
				local26 = true;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "(I)[B")
	public byte[] method1033() {
		@Pc(3) byte[] local3 = new byte[this.anInt1442];
		Static122.method709(this.aByteArray9, 0, local3, 0, this.anInt1442);
		return local3;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(ILclient!kc;)I")
	public int method1034(@OriginalArg(1) Class36 arg0) {
		@Pc(15) int local15;
		if (arg0.anInt1442 < this.anInt1442) {
			local15 = arg0.anInt1442;
		} else {
			local15 = this.anInt1442;
		}
		for (@Pc(21) int local21 = 0; local21 < local15; local21++) {
			if (arg0.aByteArray9[local21] > this.aByteArray9[local21]) {
				return -1;
			}
			if (this.aByteArray9[local21] > arg0.aByteArray9[local21]) {
				return 1;
			}
		}
		if (arg0.anInt1442 > this.anInt1442) {
			return -1;
		} else if (arg0.anInt1442 < this.anInt1442) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BII)I")
	private int method1035() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt1442; local8++) {
			if (this.aByteArray9[local8] == 32) {
				return local8;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public void method1036(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray9, 0, this.anInt1442, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray9, 0, this.anInt1442);
		}
		arg0.drawString(local13, arg1, arg2);
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(II)I")
	private int method1038() {
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt1442; local26++) {
			@Pc(35) int local35 = this.aByteArray9[local26] & 0xFF;
			if (local26 == 0) {
				if (local35 == 45) {
					local13 = true;
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
				throw new NumberFormatException();
			}
			if (local35 >= 10) {
				throw new NumberFormatException();
			}
			if (local13) {
				local35 = -local35;
			}
			@Pc(105) int local105 = local35 + local15 * 10;
			if (local105 / 10 != local15) {
				throw new NumberFormatException();
			}
			local15 = local105;
			local11 = true;
		}
		if (!local11) {
			throw new NumberFormatException();
		}
		return local15;
	}

	@OriginalMember(owner = "client!kc", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1041();
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(ILclient!kc;)Lclient!kc;")
	public Class36 method1040(@OriginalArg(1) Class36 arg0) {
		if (!this.aBoolean69) {
			throw new IllegalArgumentException();
		}
		this.anInt1457 = 0;
		if (arg0.anInt1442 + this.anInt1442 > this.aByteArray9.length) {
			@Pc(35) int local35;
			for (local35 = 1; local35 < arg0.anInt1442 + this.anInt1442; local35 += local35) {
			}
			@Pc(51) byte[] local51 = new byte[local35];
			Static122.method709(this.aByteArray9, 0, local51, 0, this.anInt1442);
			this.aByteArray9 = local51;
		}
		Static122.method709(arg0.aByteArray9, 0, this.aByteArray9, this.anInt1442, arg0.anInt1442);
		this.anInt1442 += arg0.anInt1442;
		return this;
	}

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "(I)I")
	public int method1041() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1442; local7++) {
			local5 = (this.aByteArray9[local7] & 0xFF) + ((local5 << 5) - local5);
		}
		return local5;
	}

	@OriginalMember(owner = "client!kc", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(Lclient!kc;B)Z")
	public boolean method1042(@OriginalArg(0) Class36 arg0) {
		if (this.anInt1442 < arg0.anInt1442) {
			return false;
		}
		for (@Pc(24) int local24 = 0; local24 < arg0.anInt1442; local24++) {
			if (this.aByteArray9[local24] != arg0.aByteArray9[local24]) {
				return false;
			}
		}
		return true;
	}
}
