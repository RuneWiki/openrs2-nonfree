import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class53 implements Interface3 {

	@OriginalMember(owner = "client!na", name = "m", descriptor = "I")
	private int anInt1879;

	@OriginalMember(owner = "client!na", name = "x", descriptor = "I")
	public int anInt1890;

	@OriginalMember(owner = "client!na", name = "D", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!na", name = "B", descriptor = "Z")
	private boolean aBoolean71 = true;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B)Lclient!na;")
	public Class53 method1256() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt1890 && (this.aByteArray43[local7] >= 0 && this.aByteArray43[local7] <= 32 || (this.aByteArray43[local7] & 0xFF) == 160); local7++) {
		}
		@Pc(43) int local43;
		for (local43 = this.anInt1890; local43 > local7 && (this.aByteArray43[local43 - 1] >= 0 && this.aByteArray43[local43 - 1] <= 32 || (this.aByteArray43[local43 - 1] & 0xFF) == 160); local43--) {
		}
		if (local7 == 0 && local43 == this.anInt1890) {
			return this;
		}
		@Pc(97) Class53 local97 = new Class53();
		local97.anInt1890 = local43 - local7;
		local97.aByteArray43 = new byte[local97.anInt1890];
		for (@Pc(110) int local110 = 0; local110 < local97.anInt1890; local110++) {
			local97.aByteArray43[local110] = this.aByteArray43[local110 + local7];
		}
		return local97;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)Lclient!na;")
	public Class53 method1257() {
		@Pc(14) Class53 local14 = new Class53();
		local14.anInt1890 = this.anInt1890;
		local14.aByteArray43 = new byte[this.anInt1890];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1890; local25++) {
			local14.aByteArray43[local25] = 42;
		}
		return local14;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)I")
	public int method1258(@OriginalArg(0) int arg0) {
		return this.aByteArray43[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III)I")
	private int method1259() {
		for (@Pc(10) int local10 = 0; local10 < this.anInt1890; local10++) {
			if (this.aByteArray43[local10] == 32) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(II)Lclient!na;")
	public Class53 method1261(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(20) Class53 local20 = new Class53();
		local20.aByteArray43 = new byte[this.anInt1890 + 1];
		local20.anInt1890 = this.anInt1890 + 1;
		Static127.method202(this.aByteArray43, 0, local20.aByteArray43, 0, this.anInt1890);
		local20.aByteArray43[this.anInt1890] = (byte) arg0;
		return local20;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Lclient!na;")
	public Class53 method1263() {
		@Pc(8) boolean local8 = true;
		@Pc(12) Class53 local12 = new Class53();
		local12.anInt1890 = this.anInt1890;
		local12.aByteArray43 = new byte[this.anInt1890];
		for (@Pc(27) int local27 = 0; local27 < this.anInt1890; local27++) {
			@Pc(34) byte local34 = this.aByteArray43[local27];
			if (local34 == 95) {
				local8 = true;
				local12.aByteArray43[local27] = 32;
			} else if (local34 >= 97 && local34 <= 122 && local8) {
				local8 = false;
				local12.aByteArray43[local27] = (byte) (local34 - 32);
			} else {
				local12.aByteArray43[local27] = local34;
				local8 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)Lclient!na;")
	public Class53 method1264() {
		@Pc(7) long local7 = this.method1296();
		@Pc(16) Class local16 = na.class;
		synchronized (na.class) {
			@Pc(26) Class3_Sub3 local26;
			if (Static118.aClass77_11 == null) {
				Static118.aClass77_11 = new Class77(4096);
			} else {
				for (local26 = (Class3_Sub3) Static118.aClass77_11.method1805(local7); local26 != null; local26 = (Class3_Sub3) Static118.aClass77_11.method1801()) {
					if (this.method1282(local26.aClass53_126)) {
						return local26.aClass53_126;
					}
				}
			}
			local26 = new Class3_Sub3();
			this.aBoolean71 = false;
			local26.aClass53_126 = this;
			Static118.aClass77_11.method1810(local26, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)I")
	public int method1265() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1890; local7++) {
			local5 = (local5 << 5) + (this.aByteArray43[local7] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)[B")
	public byte[] method1266() {
		@Pc(12) byte[] local12 = new byte[this.anInt1890];
		Static127.method202(this.aByteArray43, 0, local12, 0, this.anInt1890);
		return local12;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZII)Lclient!na;")
	public Class53 method1267(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class53 local15 = new Class53();
		local15.anInt1890 = arg0 - arg1;
		local15.aByteArray43 = new byte[arg0 - arg1];
		Static127.method202(this.aByteArray43, arg1, local15.aByteArray43, 0, local15.anInt1890);
		return local15;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(I)Lclient!na;")
	public Class53 method1269() {
		@Pc(14) Class53 local14 = new Class53();
		local14.anInt1890 = this.anInt1890;
		local14.aByteArray43 = new byte[this.anInt1890];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1890; local25++) {
			@Pc(32) byte local32 = this.aByteArray43[local25];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local14.aByteArray43[local25] = local32;
		}
		return local14;
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(I)I")
	public int method1271() {
		return this.method1292();
	}

	@OriginalMember(owner = "client!na", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(I)Z")
	public boolean method1272() {
		return this.method1287();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZILclient!na;)I")
	private int method1273(@OriginalArg(2) Class53 arg0) {
		@Pc(4) int[] local4 = new int[256];
		@Pc(8) int[] local8 = new int[arg0.anInt1890];
		@Pc(16) int[] local16 = new int[arg0.anInt1890];
		for (@Pc(18) int local18 = 0; local18 < local4.length; local18++) {
			local4[local18] = arg0.anInt1890;
		}
		for (@Pc(32) int local32 = 1; local32 <= arg0.anInt1890; local32++) {
			local8[local32 - 1] = (arg0.anInt1890 << 1) - local32;
			local4[arg0.aByteArray43[local32 - 1] & 0xFF] = arg0.anInt1890 - local32;
		}
		@Pc(71) int local71 = arg0.anInt1890 + 1;
		for (@Pc(74) int local74 = arg0.anInt1890; local74 > 0; local74--) {
			local16[local74 - 1] = local71;
			while (local71 <= arg0.anInt1890 && arg0.aByteArray43[local74 - 1] != arg0.aByteArray43[local71 - 1]) {
				if (local8[local71 - 1] >= arg0.anInt1890 - local74) {
					local8[local71 - 1] = arg0.anInt1890 - local74;
				}
				local71 = local16[local71 - 1];
			}
			local71--;
		}
		@Pc(145) int local145 = 0;
		@Pc(147) int local147 = local71;
		local71 = arg0.anInt1890 + 1 - local71;
		@Pc(157) int local157 = 1;
		@Pc(159) int local159 = 1;
		while (local71 >= local159) {
			local16[local159 - 1] = local145;
			while (local145 >= 1 && arg0.aByteArray43[local145 - 1] != arg0.aByteArray43[local159 - 1]) {
				local145 = local16[local145 - 1];
			}
			local159++;
			local145++;
		}
		@Pc(208) int local208;
		while (local147 < arg0.anInt1890) {
			for (local208 = local157; local208 <= local147; local208++) {
				if (local147 + arg0.anInt1890 - local208 <= local8[local208 - 1]) {
					local8[local208 - 1] = arg0.anInt1890 + local147 - local208;
				}
			}
			local157 = local147 + 1;
			local147 = local71 + local147 - local16[local71 - 1];
			local71 = local16[local71 - 1];
		}
		@Pc(295) int local295;
		for (local208 = arg0.anInt1890 - 1; local208 < this.anInt1890; local208 += Math.max(local4[this.aByteArray43[local208] & 0xFF], local8[local295])) {
			for (local295 = arg0.anInt1890 - 1; local295 >= 0 && arg0.aByteArray43[local295] == this.aByteArray43[local208]; local295--) {
				local208--;
			}
			if (local295 == -1) {
				return local208 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!na;)Z")
	public boolean method1274(@OriginalArg(1) Class53 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1890 == arg0.anInt1890) {
			for (@Pc(25) int local25 = 0; local25 < this.anInt1890; local25++) {
				@Pc(32) byte local32 = this.aByteArray43[local25];
				@Pc(37) byte local37 = arg0.aByteArray43[local25];
				if (local37 >= 65 && local37 <= 90 || local37 >= -64 && local37 <= -34 && local37 != -41) {
					local37 = (byte) (local37 + 32);
				}
				if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
					local32 = (byte) (local32 + 32);
				}
				if (local37 != local32) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I")
	public int method1275(@OriginalArg(1) FontMetrics arg0) {
		@Pc(21) String local21;
		try {
			local21 = new String(this.aByteArray43, 0, this.anInt1890, "ISO-8859-1");
		} catch (@Pc(23) UnsupportedEncodingException local23) {
			local21 = new String(this.aByteArray43, 0, this.anInt1890);
		}
		return arg0.stringWidth(local21);
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(Z)Lclient!na;")
	public Class53 method1276() {
		@Pc(9) Class53 local9 = new Class53();
		local9.anInt1890 = 0;
		@Pc(14) int local14 = 0;
		local9.aByteArray43 = new byte[12];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1890; local25++) {
			if (this.aByteArray43[local25] >= 65 && this.aByteArray43[local25] <= 90) {
				local9.aByteArray43[local14++] = (byte) (this.aByteArray43[local25] + 97 - 65);
				local9.anInt1890 = local14;
			} else if (this.aByteArray43[local25] >= 97 && this.aByteArray43[local25] <= 122 || this.aByteArray43[local25] >= 48 && this.aByteArray43[local25] <= 57) {
				local9.aByteArray43[local14++] = this.aByteArray43[local25];
				local9.anInt1890 = local14;
			} else if (local14 > 0) {
				local9.aByteArray43[local14++] = 95;
			}
			if (local14 == 12) {
				break;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IBLclient!na;)Lclient!na;")
	public Class53 method1277(@OriginalArg(0) int arg0, @OriginalArg(2) Class53 arg1) {
		if (!this.aBoolean71) {
			throw new IllegalArgumentException();
		} else if (arg0 > this.anInt1890) {
			throw new IllegalArgumentException();
		} else {
			this.anInt1879 = 0;
			if (arg1.anInt1890 + arg0 > this.aByteArray43.length) {
				@Pc(37) int local37;
				for (local37 = 1; local37 < arg1.anInt1890 + arg0; local37 += local37) {
				}
				@Pc(56) byte[] local56 = new byte[local37];
				Static127.method202(this.aByteArray43, 0, local56, 0, this.anInt1890);
				this.aByteArray43 = local56;
			}
			Static127.method202(arg1.aByteArray43, 0, this.aByteArray43, arg0, arg1.anInt1890);
			if (this.anInt1890 < arg1.anInt1890 + arg0) {
				this.anInt1890 = arg0 + arg1.anInt1890;
			}
			return this;
		}
	}

	@OriginalMember(owner = "client!na", name = "g", descriptor = "(I)Lclient!na;")
	public Class53 method1278() {
		if (!this.aBoolean71) {
			throw new IllegalArgumentException();
		}
		this.anInt1879 = 0;
		if (this.aByteArray43.length != this.anInt1890) {
			@Pc(27) byte[] local27 = new byte[this.anInt1890];
			Static127.method202(this.aByteArray43, 0, local27, 0, this.anInt1890);
			this.aByteArray43 = local27;
		}
		return this;
	}

	@OriginalMember(owner = "client!na", name = "h", descriptor = "(I)Ljava/net/URL;")
	public URL method1280() throws MalformedURLException {
		return new URL(new String(this.aByteArray43, 0, this.anInt1890));
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!na;I)I")
	public int method1281(@OriginalArg(0) Class53 arg0) {
		return this.method1273(arg0);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Lclient!na;I)Z")
	public boolean method1282(@OriginalArg(0) Class53 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt1890 == this.anInt1890) {
			if (!this.aBoolean71 || !arg0.aBoolean71) {
				if (this.anInt1879 == 0) {
					this.anInt1879 = this.method1265();
					if (this.anInt1879 == 0) {
						this.anInt1879 = 1;
					}
				}
				if (arg0.anInt1879 == 0) {
					arg0.anInt1879 = arg0.method1265();
					if (arg0.anInt1879 == 0) {
						arg0.anInt1879 = 1;
					}
				}
				if (this.anInt1879 != arg0.anInt1879) {
					return false;
				}
			}
			for (@Pc(78) int local78 = 0; local78 < this.anInt1890; local78++) {
				if (arg0.aByteArray43[local78] != this.aByteArray43[local78]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(II)I")
	public int method1283() {
		return this.method1259();
	}

	@OriginalMember(owner = "client!na", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class53)) {
			throw new IllegalArgumentException();
		}
		return this.method1282((Class53) arg0);
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(B)Lclient!na;")
	public Class53 method1284() {
		@Pc(7) byte local7 = 2;
		@Pc(11) Class53 local11 = new Class53();
		local11.anInt1890 = this.anInt1890;
		local11.aByteArray43 = new byte[this.anInt1890];
		for (@Pc(29) int local29 = 0; local29 < this.anInt1890; local29++) {
			@Pc(36) byte local36 = this.aByteArray43[local29];
			if (local36 >= 97 && local36 <= 122 || local36 >= -32 && local36 <= -2 && local36 != -9) {
				if (local7 == 2) {
					local36 = (byte) (local36 - 32);
				}
				local7 = 0;
			} else if (local36 >= 65 && local36 <= 90 || !(local36 < -64 || local36 > -34 || local36 == -41)) {
				if (local7 == 0) {
					local36 = (byte) (local36 + 32);
				}
				local7 = 0;
			} else if (local36 == 46 || local36 == 33 || local36 == 63) {
				local7 = 2;
			} else if (local36 != 32) {
				local7 = 1;
			} else if (local7 != 2) {
				local7 = 1;
			}
			local11.aByteArray43[local29] = local36;
		}
		return local11;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(BLclient!na;)I")
	public int method1285(@OriginalArg(1) Class53 arg0) {
		@Pc(17) int local17;
		if (this.anInt1890 > arg0.anInt1890) {
			local17 = arg0.anInt1890;
		} else {
			local17 = this.anInt1890;
		}
		for (@Pc(24) int local24 = 0; local24 < local17; local24++) {
			if (Static125.anIntArray419[this.aByteArray43[local24] & 0xFF] < Static125.anIntArray419[arg0.aByteArray43[local24] & 0xFF]) {
				return -1;
			}
			if (Static125.anIntArray419[this.aByteArray43[local24] & 0xFF] > Static125.anIntArray419[arg0.aByteArray43[local24] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt1890 < arg0.anInt1890) {
			return -1;
		} else if (arg0.anInt1890 < this.anInt1890) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!na", name = "i", descriptor = "(I)J")
	public long method1286() {
		@Pc(12) long local12 = 0L;
		for (@Pc(14) int local14 = 0; this.anInt1890 > local14 && local14 < 12; local14++) {
			@Pc(21) byte local21 = this.aByteArray43[local14];
			local12 *= 37L;
			if (local21 >= 65 && local21 <= 90) {
				local12 += local21 + 1 - 65;
			} else if (local21 >= 97 && local21 <= 122) {
				local12 += local21 + 1 - 97;
			} else if (local21 >= 48 && local21 <= 57) {
				local12 += local21 - 21;
			}
		}
		while (local12 % 37L == 0L && local12 != 0L) {
			local12 /= 37L;
		}
		return local12;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)Z")
	private boolean method1287() {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anInt1890; local25++) {
			@Pc(34) int local34 = this.aByteArray43[local25] & 0xFF;
			if (local25 == 0) {
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
				return false;
			}
			if (local34 >= 10) {
				return false;
			}
			if (local15) {
				local34 = -local34;
			}
			@Pc(100) int local100 = local23 * 10 + local34;
			if (local100 / 10 != local23) {
				return false;
			}
			local17 = true;
			local23 = local100;
		}
		return local17;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(Lclient!na;I)Lclient!na;")
	public Class53 method1288(@OriginalArg(0) Class53 arg0) {
		if (!this.aBoolean71) {
			throw new IllegalArgumentException();
		}
		this.anInt1879 = 0;
		if (this.anInt1890 + arg0.anInt1890 > this.aByteArray43.length) {
			@Pc(36) int local36;
			for (local36 = 1; local36 < this.anInt1890 + arg0.anInt1890; local36 += local36) {
			}
			@Pc(56) byte[] local56 = new byte[local36];
			Static127.method202(this.aByteArray43, 0, local56, 0, this.anInt1890);
			this.aByteArray43 = local56;
		}
		Static127.method202(arg0.aByteArray43, 0, this.aByteArray43, this.anInt1890, arg0.anInt1890);
		this.anInt1890 += arg0.anInt1890;
		return this;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)Lclient!na;")
	public Class53 method1289(@OriginalArg(0) int arg0) {
		return this.method1267(this.anInt1890, arg0);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!na;)Z")
	public boolean method1290(@OriginalArg(1) Class53 arg0) {
		if (arg0.anInt1890 > this.anInt1890) {
			return false;
		}
		@Pc(23) int local23 = this.anInt1890 - arg0.anInt1890;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1890; local25++) {
			if (arg0.aByteArray43[local25] != this.aByteArray43[local25 + local23]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!na;B)Z")
	public boolean method1291(@OriginalArg(0) Class53 arg0) {
		if (this.anInt1890 < arg0.anInt1890) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt1890; local16++) {
			if (arg0.aByteArray43[local16] != this.aByteArray43[local16]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(II)I")
	private int method1292() {
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt1890; local28++) {
			@Pc(37) int local37 = this.aByteArray43[local28] & 0xFF;
			if (local28 == 0) {
				if (local37 == 45) {
					local22 = true;
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
			if (local22) {
				local37 = -local37;
			}
			@Pc(104) int local104 = local37 + local26 * 10;
			if (local26 != local104 / 10) {
				throw new NumberFormatException();
			}
			local24 = true;
			local26 = local104;
		}
		if (!local24) {
			throw new NumberFormatException();
		}
		return local26;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IB)Lclient!na;")
	public Class53 method1293(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		} else if (this.aBoolean71) {
			this.anInt1879 = 0;
			if (this.aByteArray43.length == this.anInt1890) {
				@Pc(50) int local50;
				for (local50 = 1; local50 <= this.anInt1890; local50 += local50) {
				}
				@Pc(67) byte[] local67 = new byte[local50];
				Static127.method202(this.aByteArray43, 0, local67, 0, this.anInt1890);
				this.aByteArray43 = local67;
			}
			this.aByteArray43[this.anInt1890++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!na", name = "j", descriptor = "(I)I")
	public int method1294() {
		return this.anInt1890;
	}

	@OriginalMember(owner = "client!na", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1265();
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(Z)J")
	private long method1296() {
		@Pc(12) long local12 = 0L;
		for (@Pc(14) int local14 = 0; local14 < this.anInt1890; local14++) {
			local12 = (local12 << 5) + (long) (this.aByteArray43[local14] & 0xFF) - local12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BIILjava/awt/Graphics;)V")
	public void method1297(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		@Pc(20) String local20;
		try {
			local20 = new String(this.aByteArray43, 0, this.anInt1890, "ISO-8859-1");
		} catch (@Pc(22) UnsupportedEncodingException local22) {
			local20 = new String(this.aByteArray43, 0, this.anInt1890);
		}
		arg2.drawString(local20, arg0, arg1);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II[BII)I")
	public int method1298(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static127.method202(this.aByteArray43, 0, arg0, arg2, arg1);
		return arg1;
	}
}
