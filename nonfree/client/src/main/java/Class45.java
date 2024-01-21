import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class45 implements Interface1 {

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
	public int anInt1925;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
	private int anInt1930;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "Z")
	private boolean aBoolean94 = true;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)Z")
	private boolean method1293() {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt1925; local21++) {
			@Pc(29) int local29 = this.aByteArray27[local21] & 0xFF;
			if (local21 == 0) {
				if (local29 == 45) {
					local15 = true;
					continue;
				}
				if (local29 == 43) {
					continue;
				}
			}
			if (local29 >= 48 && local29 <= 57) {
				local29 -= 48;
			} else if (local29 >= 65 && local29 <= 90) {
				local29 -= 55;
			} else if (local29 >= 97 && local29 <= 122) {
				local29 -= 87;
			} else {
				return false;
			}
			if (local29 >= 10) {
				return false;
			}
			if (local15) {
				local29 = -local29;
			}
			@Pc(96) int local96 = local19 * 10 + local29;
			if (local19 != local96 / 10) {
				return false;
			}
			local17 = true;
			local19 = local96;
		}
		return local17;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BILclient!mb;)I")
	private int method1295(@OriginalArg(2) Class45 arg0) {
		@Pc(13) int[] local13 = new int[256];
		@Pc(17) int[] local17 = new int[arg0.anInt1925];
		@Pc(21) int[] local21 = new int[arg0.anInt1925];
		for (@Pc(23) int local23 = 0; local23 < local13.length; local23++) {
			local13[local23] = arg0.anInt1925;
		}
		for (@Pc(41) int local41 = 1; local41 <= arg0.anInt1925; local41++) {
			local17[local41 - 1] = (arg0.anInt1925 << 1) - local41;
			local13[arg0.aByteArray27[local41 - 1] & 0xFF] = arg0.anInt1925 - local41;
		}
		@Pc(84) int local84 = arg0.anInt1925 + 1;
		@Pc(87) int local87 = arg0.anInt1925;
		while (local87 > 0) {
			local21[local87 - 1] = local84;
			while (arg0.anInt1925 >= local84 && arg0.aByteArray27[local87 - 1] != arg0.aByteArray27[local84 - 1]) {
				if (local17[local84 - 1] >= arg0.anInt1925 - local87) {
					local17[local84 - 1] = arg0.anInt1925 - local87;
				}
				local84 = local21[local84 - 1];
			}
			local87--;
			local84--;
		}
		@Pc(158) int local158 = local84;
		local84 = arg0.anInt1925 + 1 - local84;
		@Pc(168) int local168 = 1;
		@Pc(170) int local170 = 0;
		for (@Pc(172) int local172 = 1; local172 <= local84; local172++) {
			local21[local172 - 1] = local170;
			while (local170 >= 1 && arg0.aByteArray27[local172 - 1] != arg0.aByteArray27[local170 - 1]) {
				local170 = local21[local170 - 1];
			}
			local170++;
		}
		@Pc(223) int local223;
		while (local158 < arg0.anInt1925) {
			for (local223 = local168; local223 <= local158; local223++) {
				if (local17[local223 - 1] >= arg0.anInt1925 + local158 - local223) {
					local17[local223 - 1] = local158 + arg0.anInt1925 - local223;
				}
			}
			local168 = local158 + 1;
			local158 = local158 + local84 - local21[local84 - 1];
			local84 = local21[local84 - 1];
		}
		@Pc(300) int local300;
		for (local223 = arg0.anInt1925 - 1; local223 < this.anInt1925; local223 += Math.max(local13[this.aByteArray27[local223] & 0xFF], local17[local300])) {
			for (local300 = arg0.anInt1925 - 1; local300 >= 0 && arg0.aByteArray27[local300] == this.aByteArray27[local223]; local300--) {
				local223--;
			}
			if (local300 == -1) {
				return local223 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Lclient!mb;")
	public Class45 method1296(@OriginalArg(1) int arg0) {
		return this.method1322(this.anInt1925, arg0);
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)Lclient!mb;")
	public Class45 method1297() {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = this.anInt1925;
		while (this.anInt1925 > local5 && (this.aByteArray27[local5] >= 0 && this.aByteArray27[local5] <= 32 || (this.aByteArray27[local5] & 0xFF) == 160)) {
			local5++;
		}
		while (local8 > local5 && (this.aByteArray27[local8 - 1] >= 0 && this.aByteArray27[local8 - 1] <= 32 || (this.aByteArray27[local8 - 1] & 0xFF) == 160)) {
			local8--;
		}
		if (local5 == 0 && this.anInt1925 == local8) {
			return this;
		}
		@Pc(93) Class45 local93 = new Class45();
		local93.anInt1925 = local8 - local5;
		local93.aByteArray27 = new byte[local93.anInt1925];
		for (@Pc(106) int local106 = 0; local106 < local93.anInt1925; local106++) {
			local93.aByteArray27[local106] = this.aByteArray27[local5 + local106];
		}
		return local93;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BII[BI)I")
	public int method1298(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2) {
		Static127.method878(this.aByteArray27, 0, arg1, arg2, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)J")
	public long method1299() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; this.anInt1925 > local7 && local7 < 12; local7++) {
			local5 *= 37L;
			@Pc(17) byte local17 = this.aByteArray27[local7];
			if (local17 >= 65 && local17 <= 90) {
				local5 += local17 - 64;
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

	@OriginalMember(owner = "client!mb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)J")
	private long method1301() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1925; local7++) {
			local5 = (local5 << 5) + (long) (this.aByteArray27[local7] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!mb;I)Z")
	public boolean method1302(@OriginalArg(0) Class45 arg0) {
		if (arg0.anInt1925 > this.anInt1925) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt1925; local16++) {
			if (this.aByteArray27[local16] != arg0.aByteArray27[local16]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)Lclient!mb;")
	public Class45 method1303() {
		@Pc(3) Class45 local3 = new Class45();
		local3.anInt1925 = this.anInt1925;
		local3.aByteArray27 = new byte[this.anInt1925];
		@Pc(18) boolean local18 = true;
		for (@Pc(28) int local28 = 0; local28 < this.anInt1925; local28++) {
			@Pc(34) byte local34 = this.aByteArray27[local28];
			if (local34 == 95) {
				local18 = true;
				local3.aByteArray27[local28] = 32;
			} else if (local34 >= 97 && local34 <= 122 && local18) {
				local18 = false;
				local3.aByteArray27[local28] = (byte) (local34 - 32);
			} else {
				local18 = false;
				local3.aByteArray27[local28] = local34;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)I")
	public int method1304() {
		return this.method1329();
	}

	@OriginalMember(owner = "client!mb", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class45)) {
			throw new IllegalArgumentException();
		}
		return this.method1319((Class45) arg0);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)I")
	private int method1305() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt1925; local8++) {
			if (this.aByteArray27[local8] == 32) {
				return local8;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)Lclient!mb;")
	public Class45 method1306(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		} else if (this.aBoolean94) {
			this.anInt1930 = 0;
			if (this.anInt1925 == this.aByteArray27.length) {
				@Pc(43) int local43;
				for (local43 = 1; local43 <= this.anInt1925; local43 += local43) {
				}
				@Pc(60) byte[] local60 = new byte[local43];
				Static127.method878(this.aByteArray27, 0, local60, 0, this.anInt1925);
				this.aByteArray27 = local60;
			}
			this.aByteArray27[this.anInt1925++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)I")
	public int method1307() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1925; local7++) {
			local5 = (this.aByteArray27[local7] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)Lclient!mb;")
	public Class45 method1308() {
		if (!this.aBoolean94) {
			throw new IllegalArgumentException();
		}
		this.anInt1930 = 0;
		if (this.aByteArray27.length != this.anInt1925) {
			@Pc(28) byte[] local28 = new byte[this.anInt1925];
			Static127.method878(this.aByteArray27, 0, local28, 0, this.anInt1925);
			this.aByteArray27 = local28;
		}
		return this;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)Lclient!mb;")
	public Class45 method1309() {
		@Pc(9) Class45 local9 = new Class45();
		local9.anInt1925 = this.anInt1925;
		local9.aByteArray27 = new byte[this.anInt1925];
		for (@Pc(27) int local27 = 0; local27 < this.anInt1925; local27++) {
			local9.aByteArray27[local27] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)Lclient!mb;")
	public Class45 method1310() {
		@Pc(5) Class45 local5 = new Class45();
		local5.anInt1925 = this.anInt1925;
		local5.aByteArray27 = new byte[this.anInt1925];
		@Pc(20) boolean local20 = true;
		for (@Pc(29) int local29 = 0; local29 < this.anInt1925; local29++) {
			@Pc(36) byte local36 = this.aByteArray27[local29];
			if (local36 >= 97 && local36 <= 122 || local36 >= -32 && local36 <= -2 && local36 != -9) {
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
			if (local36 == 46 || local36 == 33 || local36 == 63) {
				local20 = true;
			}
			local5.aByteArray27[local29] = local36;
		}
		return local5;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!mb;)Lclient!mb;")
	public Class45 method1311(@OriginalArg(1) int arg0, @OriginalArg(2) Class45 arg1) {
		if (!this.aBoolean94) {
			throw new IllegalArgumentException();
		} else if (arg0 > this.anInt1925) {
			throw new IllegalArgumentException();
		} else {
			this.anInt1930 = 0;
			if (this.aByteArray27.length < arg1.anInt1925 + arg0) {
				@Pc(41) int local41;
				for (local41 = 1; local41 < arg0 + arg1.anInt1925; local41 += local41) {
				}
				@Pc(56) byte[] local56 = new byte[local41];
				Static127.method878(this.aByteArray27, 0, local56, 0, this.anInt1925);
				this.aByteArray27 = local56;
			}
			Static127.method878(arg1.aByteArray27, 0, this.aByteArray27, arg0, arg1.anInt1925);
			if (this.anInt1925 < arg0 + arg1.anInt1925) {
				this.anInt1925 = arg0 + arg1.anInt1925;
			}
			return this;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!mb;)I")
	public int method1312(@OriginalArg(1) Class45 arg0) {
		@Pc(18) int local18;
		if (arg0.anInt1925 < this.anInt1925) {
			local18 = arg0.anInt1925;
		} else {
			local18 = this.anInt1925;
		}
		for (@Pc(25) int local25 = 0; local25 < local18; local25++) {
			if (Static99.anIntArray404[arg0.aByteArray27[local25] & 0xFF] > Static99.anIntArray404[this.aByteArray27[local25] & 0xFF]) {
				return -1;
			}
			if (Static99.anIntArray404[arg0.aByteArray27[local25] & 0xFF] < Static99.anIntArray404[this.aByteArray27[local25] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt1925 < arg0.anInt1925) {
			return -1;
		} else if (this.anInt1925 > arg0.anInt1925) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLjava/awt/FontMetrics;)I")
	public int method1313(@OriginalArg(1) FontMetrics arg0) {
		@Pc(15) String local15;
		try {
			local15 = new String(this.aByteArray27, 0, this.anInt1925, "ISO-8859-1");
		} catch (@Pc(17) UnsupportedEncodingException local17) {
			local15 = new String(this.aByteArray27, 0, this.anInt1925);
		}
		return arg0.stringWidth(local15);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLjava/awt/Graphics;II)V")
	public void method1314(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) String local17;
		try {
			local17 = new String(this.aByteArray27, 0, this.anInt1925, "ISO-8859-1");
		} catch (@Pc(19) UnsupportedEncodingException local19) {
			local17 = new String(this.aByteArray27, 0, this.anInt1925);
		}
		arg0.drawString(local17, arg2, arg1);
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)Lclient!mb;")
	public Class45 method1315() {
		@Pc(9) Class45 local9 = new Class45();
		local9.anInt1925 = 0;
		@Pc(14) int local14 = 0;
		local9.aByteArray27 = new byte[12];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1925; local25++) {
			if (this.aByteArray27[local25] >= 65 && this.aByteArray27[local25] <= 90) {
				local9.aByteArray27[local14++] = (byte) (this.aByteArray27[local25] + 97 - 65);
				local9.anInt1925 = local14;
			} else if (this.aByteArray27[local25] >= 97 && this.aByteArray27[local25] <= 122 || this.aByteArray27[local25] >= 48 && this.aByteArray27[local25] <= 57) {
				local9.aByteArray27[local14++] = this.aByteArray27[local25];
				local9.anInt1925 = local14;
			} else if (local14 > 0) {
				local9.aByteArray27[local14++] = 95;
			}
			if (local14 == 12) {
				break;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!mb", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1307();
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(Lclient!mb;I)Lclient!mb;")
	public Class45 method1316(@OriginalArg(0) Class45 arg0) {
		if (!this.aBoolean94) {
			throw new IllegalArgumentException();
		}
		this.anInt1930 = 0;
		if (arg0.anInt1925 + this.anInt1925 > this.aByteArray27.length) {
			@Pc(30) int local30;
			for (local30 = 1; local30 < arg0.anInt1925 + this.anInt1925; local30 += local30) {
			}
			@Pc(50) byte[] local50 = new byte[local30];
			Static127.method878(this.aByteArray27, 0, local50, 0, this.anInt1925);
			this.aByteArray27 = local50;
		}
		Static127.method878(arg0.aByteArray27, 0, this.aByteArray27, this.anInt1925, arg0.anInt1925);
		this.anInt1925 += arg0.anInt1925;
		return this;
	}

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "(I)I")
	public int method1317() {
		return this.anInt1925;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)Z")
	public boolean method1318() {
		return this.method1293();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!mb;)Z")
	public boolean method1319(@OriginalArg(1) Class45 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1925 == arg0.anInt1925) {
			if (!this.aBoolean94 || !arg0.aBoolean94) {
				if (this.anInt1930 == 0) {
					this.anInt1930 = this.method1307();
					if (this.anInt1930 == 0) {
						this.anInt1930 = 1;
					}
				}
				if (arg0.anInt1930 == 0) {
					arg0.anInt1930 = arg0.method1307();
					if (arg0.anInt1930 == 0) {
						arg0.anInt1930 = 1;
					}
				}
				if (arg0.anInt1930 != this.anInt1930) {
					return false;
				}
			}
			for (@Pc(70) int local70 = 0; local70 < this.anInt1925; local70++) {
				if (arg0.aByteArray27[local70] != this.aByteArray27[local70]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "(I)Lclient!mb;")
	public Class45 method1320() {
		@Pc(9) long local9 = this.method1301();
		@Pc(18) Class local18 = mb.class;
		synchronized (mb.class) {
			@Pc(28) Class5_Sub18 local28;
			if (Static19.aClass66_1 == null) {
				Static19.aClass66_1 = new Class66(4096);
			} else {
				for (local28 = (Class5_Sub18) Static19.aClass66_1.method1812(local9); local28 != null; local28 = (Class5_Sub18) Static19.aClass66_1.method1810()) {
					if (this.method1319(local28.aClass45_1326)) {
						return local28.aClass45_1326;
					}
				}
			}
			local28 = new Class5_Sub18();
			local28.aClass45_1326 = this;
			this.aBoolean94 = false;
			Static19.aClass66_1.method1811(local9, local28);
			return this;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!mb;B)Z")
	public boolean method1321(@OriginalArg(0) Class45 arg0) {
		if (this.anInt1925 < arg0.anInt1925) {
			return false;
		}
		@Pc(23) int local23 = this.anInt1925 - arg0.anInt1925;
		for (@Pc(32) int local32 = 0; local32 < arg0.anInt1925; local32++) {
			if (this.aByteArray27[local23 + local32] != arg0.aByteArray27[local32]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZII)Lclient!mb;")
	public Class45 method1322(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class45 local12 = new Class45();
		local12.anInt1925 = arg0 - arg1;
		local12.aByteArray27 = new byte[arg0 - arg1];
		Static127.method878(this.aByteArray27, arg1, local12.aByteArray27, 0, local12.anInt1925);
		return local12;
	}

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "(I)[B")
	public byte[] method1323() {
		@Pc(3) byte[] local3 = new byte[this.anInt1925];
		Static127.method878(this.aByteArray27, 0, local3, 0, this.anInt1925);
		return local3;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)I")
	public int method1324(@OriginalArg(0) int arg0) {
		return this.aByteArray27[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)I")
	public int method1325() {
		return this.method1305();
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(II)Lclient!mb;")
	public Class45 method1326(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(26) Class45 local26 = new Class45();
		local26.aByteArray27 = new byte[this.anInt1925 + 1];
		local26.anInt1925 = this.anInt1925 + 1;
		Static127.method878(this.aByteArray27, 0, local26.aByteArray27, 0, this.anInt1925);
		local26.aByteArray27[this.anInt1925] = (byte) arg0;
		return local26;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)Lclient!mb;")
	public Class45 method1327() {
		@Pc(7) Class45 local7 = new Class45();
		local7.anInt1925 = this.anInt1925;
		local7.aByteArray27 = new byte[this.anInt1925];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1925; local18++) {
			@Pc(30) byte local30 = this.aByteArray27[local18];
			if (local30 >= 65 && local30 <= 90 || local30 >= -64 && local30 <= -34 && local30 != -41) {
				local30 = (byte) (local30 + 32);
			}
			local7.aByteArray27[local18] = local30;
		}
		return local7;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(ILclient!mb;)I")
	public int method1328(@OriginalArg(1) Class45 arg0) {
		return this.method1295(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IB)I")
	private int method1329() {
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt1925; local28++) {
			@Pc(37) int local37 = this.aByteArray27[local28] & 0xFF;
			if (local28 == 0) {
				if (local37 == 45) {
					local17 = true;
					continue;
				}
				if (local37 == 43) {
					continue;
				}
			}
			if (local37 >= 48 && local37 <= 57) {
				local37 -= 48;
			} else if (local37 >= 65 && local37 <= 90) {
				local37 -= 55;
			} else if (local37 >= 97 && local37 <= 122) {
				local37 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (local37 >= 10) {
				throw new NumberFormatException();
			}
			if (local17) {
				local37 = -local37;
			}
			@Pc(118) int local118 = local21 * 10 + local37;
			if (local21 != local118 / 10) {
				throw new NumberFormatException();
			}
			local19 = true;
			local21 = local118;
		}
		if (!local19) {
			throw new NumberFormatException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(BLclient!mb;)Z")
	public boolean method1330(@OriginalArg(1) Class45 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1925 == arg0.anInt1925) {
			for (@Pc(25) int local25 = 0; local25 < this.anInt1925; local25++) {
				@Pc(31) byte local31 = this.aByteArray27[local25];
				if (local31 >= 65 && local31 <= 90 || local31 >= -64 && local31 <= -34 && local31 != -41) {
					local31 = (byte) (local31 + 32);
				}
				@Pc(62) byte local62 = arg0.aByteArray27[local25];
				if (local62 >= 65 && local62 <= 90 || local62 >= -64 && local62 <= -34 && local62 != -41) {
					local62 = (byte) (local62 + 32);
				}
				if (local31 != local62) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}
