import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class76 implements Interface3 {

	@OriginalMember(owner = "client!v", name = "M", descriptor = "[B")
	public byte[] aByteArray71;

	@OriginalMember(owner = "client!v", name = "T", descriptor = "I")
	public int anInt2668;

	@OriginalMember(owner = "client!v", name = "W", descriptor = "I")
	private int anInt2670;

	@OriginalMember(owner = "client!v", name = "U", descriptor = "Z")
	private boolean aBoolean154 = true;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)I")
	public int method1850(@OriginalArg(1) int arg0) {
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = 0;
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < this.anInt2668; local25++) {
			@Pc(34) int local34 = this.aByteArray71[local25] & 0xFF;
			if (local25 == 0) {
				if (local34 == 45) {
					local19 = true;
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
			if (local34 >= arg0) {
				throw new NumberFormatException();
			}
			if (local19) {
				local34 = -local34;
			}
			@Pc(108) int local108 = arg0 * local21 + local34;
			if (local21 != local108 / arg0) {
				throw new NumberFormatException();
			}
			local23 = true;
			local21 = local108;
		}
		if (!local23) {
			throw new NumberFormatException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)I")
	public int method1851() {
		return this.anInt2668;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)I")
	private int method1853(@OriginalArg(1) int arg0) {
		@Pc(8) byte local8 = (byte) arg0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2668; local18++) {
			if (this.aByteArray71[local18] == local8) {
				return local18;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Lclient!v;")
	public Class76 method1854() {
		@Pc(14) Class76 local14 = new Class76();
		local14.anInt2668 = this.anInt2668;
		local14.aByteArray71 = new byte[this.anInt2668];
		for (@Pc(25) int local25 = 0; local25 < this.anInt2668; local25++) {
			@Pc(32) byte local32 = this.aByteArray71[local25];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local14.aByteArray71[local25] = local32;
		}
		return local14;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)Lclient!v;")
	public Class76 method1855() {
		if (!this.aBoolean154) {
			throw new IllegalArgumentException();
		}
		this.anInt2670 = 0;
		if (this.aByteArray71.length != this.anInt2668) {
			@Pc(32) byte[] local32 = new byte[this.anInt2668];
			Static135.method111(this.aByteArray71, 0, local32, 0, this.anInt2668);
			this.aByteArray71 = local32;
		}
		return this;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!v;I)Lclient!v;")
	public Class76 method1856(@OriginalArg(0) Class76 arg0) {
		if (!this.aBoolean154) {
			throw new IllegalArgumentException();
		}
		this.anInt2670 = 0;
		if (this.aByteArray71.length < arg0.anInt2668 + this.anInt2668) {
			@Pc(31) int local31;
			for (local31 = 1; local31 < this.anInt2668 + arg0.anInt2668; local31 += local31) {
			}
			@Pc(52) byte[] local52 = new byte[local31];
			Static135.method111(this.aByteArray71, 0, local52, 0, this.anInt2668);
			this.aByteArray71 = local52;
		}
		Static135.method111(arg0.aByteArray71, 0, this.aByteArray71, this.anInt2668, arg0.anInt2668);
		this.anInt2668 += arg0.anInt2668;
		return this;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(B)I")
	public int method1857() {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < this.anInt2668; local13++) {
			local11 = (this.aByteArray71[local13] & 0xFF) + ((local11 << 5) - local11);
		}
		return local11;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)Lclient!v;")
	public Class76 method1858() {
		@Pc(9) Class76 local9 = new Class76();
		local9.anInt2668 = this.anInt2668;
		local9.aByteArray71 = new byte[this.anInt2668];
		@Pc(20) boolean local20 = true;
		for (@Pc(22) int local22 = 0; local22 < this.anInt2668; local22++) {
			@Pc(29) byte local29 = this.aByteArray71[local22];
			if (local29 == 95) {
				local20 = true;
				local9.aByteArray71[local22] = 32;
			} else if (local29 >= 97 && local29 <= 122 && local20) {
				local20 = false;
				local9.aByteArray71[local22] = (byte) (local29 - 32);
			} else {
				local20 = false;
				local9.aByteArray71[local22] = local29;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(II)I")
	public int method1859(@OriginalArg(0) int arg0) {
		return this.method1853(arg0);
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(II)I")
	public int method1860(@OriginalArg(1) int arg0) {
		return this.aByteArray71[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Lclient!v;I)I")
	public int method1861(@OriginalArg(0) Class76 arg0) {
		return this.method1865(arg0);
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(I)Z")
	public boolean method1862() {
		return this.method1879();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLclient!v;)I")
	public int method1863(@OriginalArg(1) Class76 arg0) {
		@Pc(13) int local13;
		if (this.anInt2668 <= arg0.anInt2668) {
			local13 = this.anInt2668;
		} else {
			local13 = arg0.anInt2668;
		}
		for (@Pc(25) int local25 = 0; local25 < local13; local25++) {
			if (Static111.anIntArray347[arg0.aByteArray71[local25] & 0xFF] > Static111.anIntArray347[this.aByteArray71[local25] & 0xFF]) {
				return -1;
			}
			if (Static111.anIntArray347[arg0.aByteArray71[local25] & 0xFF] < Static111.anIntArray347[this.aByteArray71[local25] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt2668 > this.anInt2668) {
			return -1;
		} else if (arg0.anInt2668 < this.anInt2668) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
	public void method1864(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray71, 0, this.anInt2668, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray71, 0, this.anInt2668);
		}
		arg0.drawString(local18, arg1, arg2);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!v;I)I")
	private int method1865(@OriginalArg(1) Class76 arg0) {
		@Pc(5) int[] local5 = new int[arg0.anInt2668];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg0.anInt2668];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg0.anInt2668;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg0.anInt2668; local36++) {
			local5[local36 - 1] = (arg0.anInt2668 << 1) - local36;
			local12[arg0.aByteArray71[local36 - 1] & 0xFF] = arg0.anInt2668 - local36;
		}
		@Pc(78) int local78 = arg0.anInt2668 + 1;
		@Pc(81) int local81 = arg0.anInt2668;
		while (local81 > 0) {
			local16[local81 - 1] = local78;
			while (local78 <= arg0.anInt2668 && arg0.aByteArray71[local78 - 1] != arg0.aByteArray71[local81 - 1]) {
				if (local5[local78 - 1] >= arg0.anInt2668 - local81) {
					local5[local78 - 1] = arg0.anInt2668 - local81;
				}
				local78 = local16[local78 - 1];
			}
			local81--;
			local78--;
		}
		@Pc(153) int local153 = 0;
		@Pc(155) int local155 = 1;
		@Pc(157) int local157 = local78;
		local78 = arg0.anInt2668 + 1 - local78;
		@Pc(167) int local167 = 1;
		while (local78 >= local167) {
			local16[local167 - 1] = local153;
			while (local153 >= 1 && arg0.aByteArray71[local167 - 1] != arg0.aByteArray71[local153 - 1]) {
				local153 = local16[local153 - 1];
			}
			local167++;
			local153++;
		}
		@Pc(212) int local212;
		while (arg0.anInt2668 > local157) {
			for (local212 = local155; local212 <= local157; local212++) {
				if (local5[local212 - 1] >= arg0.anInt2668 + local157 - local212) {
					local5[local212 - 1] = local157 + arg0.anInt2668 - local212;
				}
			}
			local155 = local157 + 1;
			local157 += local78 - local16[local78 - 1];
			local78 = local16[local78 - 1];
		}
		@Pc(287) int local287;
		for (local212 = arg0.anInt2668 - 1; local212 < this.anInt2668; local212 += Math.max(local12[this.aByteArray71[local212] & 0xFF], local5[local287])) {
			for (local287 = arg0.anInt2668 - 1; local287 >= 0 && this.aByteArray71[local212] == arg0.aByteArray71[local287]; local287--) {
				local212--;
			}
			if (local287 == -1) {
				return local212 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)[B")
	public byte[] method1866() {
		@Pc(12) byte[] local12 = new byte[this.anInt2668];
		Static135.method111(this.aByteArray71, 0, local12, 0, this.anInt2668);
		return local12;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)Lclient!v;")
	public Class76 method1867(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(17) Class76 local17 = new Class76();
		local17.aByteArray71 = new byte[this.anInt2668 + 1];
		local17.anInt2668 = this.anInt2668 + 1;
		Static135.method111(this.aByteArray71, 0, local17.aByteArray71, 0, this.anInt2668);
		local17.aByteArray71[this.anInt2668] = (byte) arg0;
		return local17;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(BLclient!v;)Z")
	public boolean method1868(@OriginalArg(1) Class76 arg0) {
		if (this.anInt2668 < arg0.anInt2668) {
			return false;
		}
		@Pc(26) int local26 = this.anInt2668 - arg0.anInt2668;
		for (@Pc(28) int local28 = 0; local28 < arg0.anInt2668; local28++) {
			if (arg0.aByteArray71[local28] != this.aByteArray71[local28 + local26]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!v;Z)Z")
	public boolean method1869(@OriginalArg(0) Class76 arg0) {
		if (this.anInt2668 < arg0.anInt2668) {
			return false;
		}
		for (@Pc(22) int local22 = 0; local22 < arg0.anInt2668; local22++) {
			if (arg0.aByteArray71[local22] != this.aByteArray71[local22]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)Lclient!v;")
	public Class76 method1871() {
		@Pc(13) Class76 local13 = new Class76();
		local13.anInt2668 = this.anInt2668;
		@Pc(19) byte local19 = 2;
		local13.aByteArray71 = new byte[this.anInt2668];
		for (@Pc(30) int local30 = 0; local30 < this.anInt2668; local30++) {
			@Pc(37) byte local37 = this.aByteArray71[local30];
			if (local37 >= 97 && local37 <= 122 || local37 >= -32 && local37 <= -2 && local37 != -9) {
				if (local19 == 2) {
					local37 = (byte) (local37 - 32);
				}
				local19 = 0;
			} else if (local37 >= 65 && local37 <= 90 || !(local37 < -64 || local37 > -34 || local37 == -41)) {
				if (local19 == 0) {
					local37 = (byte) (local37 + 32);
				}
				local19 = 0;
			} else if (local37 == 46 || local37 == 33 || local37 == 63) {
				local19 = 2;
			} else if (local37 != 32) {
				local19 = 1;
			} else if (local19 != 2) {
				local19 = 1;
			}
			local13.aByteArray71[local30] = local37;
		}
		return local13;
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(I)J")
	public long method1872() {
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; this.anInt2668 > local17 && local17 < 12; local17++) {
			local15 *= 37L;
			@Pc(28) byte local28 = this.aByteArray71[local17];
			if (local28 >= 65 && local28 <= 90) {
				local15 += local28 + 1 - 65;
			} else if (local28 >= 97 && local28 <= 122) {
				local15 += local28 - 96;
			} else if (local28 >= 48 && local28 <= 57) {
				local15 += local28 + 27 - 48;
			}
		}
		while (local15 % 37L == 0L && local15 != 0L) {
			local15 /= 37L;
		}
		return local15;
	}

	@OriginalMember(owner = "client!v", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)Lclient!v;")
	public Class76 method1873() {
		@Pc(9) Class76 local9 = new Class76();
		local9.anInt2668 = this.anInt2668;
		local9.aByteArray71 = new byte[this.anInt2668];
		for (@Pc(20) int local20 = 0; local20 < this.anInt2668; local20++) {
			local9.aByteArray71[local20] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI)Lclient!v;")
	public Class76 method1874(@OriginalArg(1) int arg0) {
		return this.method1876(this.anInt2668, arg0);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
	public int method1875(@OriginalArg(1) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray71, 0, this.anInt2668, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray71, 0, this.anInt2668);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(III)Lclient!v;")
	public Class76 method1876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class76 local3 = new Class76();
		local3.aByteArray71 = new byte[arg0 - arg1];
		local3.anInt2668 = arg0 - arg1;
		Static135.method111(this.aByteArray71, arg1, local3.aByteArray71, 0, local3.anInt2668);
		return local3;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLclient!v;)I")
	public int method1877(@OriginalArg(1) Class76 arg0) {
		@Pc(9) int local9;
		if (this.anInt2668 <= arg0.anInt2668) {
			local9 = this.anInt2668;
		} else {
			local9 = arg0.anInt2668;
		}
		for (@Pc(26) int local26 = 0; local26 < local9; local26++) {
			if ((arg0.aByteArray71[local26] & 0xFF) > (this.aByteArray71[local26] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray71[local26] & 0xFF) > (arg0.aByteArray71[local26] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt2668 < arg0.anInt2668) {
			return -1;
		} else if (arg0.anInt2668 < this.anInt2668) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(BLclient!v;)Z")
	public boolean method1878(@OriginalArg(1) Class76 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2668 == arg0.anInt2668) {
			if (!this.aBoolean154 || !arg0.aBoolean154) {
				if (this.anInt2670 == 0) {
					this.anInt2670 = this.method1857();
					if (this.anInt2670 == 0) {
						this.anInt2670 = 1;
					}
				}
				if (arg0.anInt2670 == 0) {
					arg0.anInt2670 = arg0.method1857();
					if (arg0.anInt2670 == 0) {
						arg0.anInt2670 = 1;
					}
				}
				if (arg0.anInt2670 != this.anInt2670) {
					return false;
				}
			}
			for (@Pc(69) int local69 = 0; local69 < this.anInt2668; local69++) {
				if (this.aByteArray71[local69] != arg0.aByteArray71[local69]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(BI)Z")
	private boolean method1879() {
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt2668; local28++) {
			@Pc(37) int local37 = this.aByteArray71[local28] & 0xFF;
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
				return false;
			}
			if (local37 >= 10) {
				return false;
			}
			if (local17) {
				local37 = -local37;
			}
			@Pc(110) int local110 = local37 + local21 * 10;
			if (local110 / 10 != local21) {
				return false;
			}
			local21 = local110;
			local19 = true;
		}
		return local19;
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(I)Lclient!v;")
	public Class76 method1880() {
		@Pc(3) long local3 = this.method1881();
		@Pc(16) Class local16 = v.class;
		synchronized (v.class) {
			@Pc(32) Class4_Sub2 local32;
			if (Static48.aClass28_4 == null) {
				Static48.aClass28_4 = new Class28(4096);
			} else {
				for (local32 = (Class4_Sub2) Static48.aClass28_4.method770(local3); local32 != null; local32 = (Class4_Sub2) Static48.aClass28_4.method773()) {
					if (this.method1878(local32.aClass76_62)) {
						return local32.aClass76_62;
					}
				}
			}
			local32 = new Class4_Sub2();
			this.aBoolean154 = false;
			local32.aClass76_62 = this;
			Static48.aClass28_4.method774(local3, local32);
			return this;
		}
	}

	@OriginalMember(owner = "client!v", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class76)) {
			throw new IllegalArgumentException();
		}
		return this.method1878((Class76) arg0);
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(B)J")
	private long method1881() {
		@Pc(5) long local5 = 0L;
		for (@Pc(15) int local15 = 0; local15 < this.anInt2668; local15++) {
			local5 = (local5 << 5) + (long) (this.aByteArray71[local15] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(Lclient!v;I)Z")
	public boolean method1882(@OriginalArg(0) Class76 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2668 == arg0.anInt2668) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt2668; local27++) {
				@Pc(34) byte local34 = this.aByteArray71[local27];
				@Pc(39) byte local39 = arg0.aByteArray71[local27];
				if (local39 >= 65 && local39 <= 90 || local39 >= -64 && local39 <= -34 && local39 != -41) {
					local39 = (byte) (local39 + 32);
				}
				if (local34 >= 65 && local34 <= 90 || local34 >= -64 && local34 <= -34 && local34 != -41) {
					local34 = (byte) (local34 + 32);
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

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(B)Lclient!v;")
	public Class76 method1883() {
		@Pc(7) int local7;
		for (local7 = 0; this.anInt2668 > local7 && (this.aByteArray71[local7] >= 0 && this.aByteArray71[local7] <= 32 || (this.aByteArray71[local7] & 0xFF) == 160); local7++) {
		}
		@Pc(40) int local40;
		for (local40 = this.anInt2668; local40 > local7 && (this.aByteArray71[local40 - 1] >= 0 && this.aByteArray71[local40 - 1] <= 32 || (this.aByteArray71[local40 - 1] & 0xFF) == 160); local40--) {
		}
		if (local7 == 0 && this.anInt2668 == local40) {
			return this;
		}
		@Pc(93) Class76 local93 = new Class76();
		local93.anInt2668 = local40 - local7;
		local93.aByteArray71 = new byte[local93.anInt2668];
		for (@Pc(110) int local110 = 0; local110 < local93.anInt2668; local110++) {
			local93.aByteArray71[local110] = this.aByteArray71[local110 + local7];
		}
		return local93;
	}

	@OriginalMember(owner = "client!v", name = "h", descriptor = "(I)I")
	public int method1884() {
		return this.method1850(10);
	}

	@OriginalMember(owner = "client!v", name = "i", descriptor = "(I)Lclient!v;")
	public Class76 method1885() {
		@Pc(3) int local3 = 0;
		@Pc(11) Class76 local11 = new Class76();
		local11.anInt2668 = 0;
		local11.aByteArray71 = new byte[12];
		for (@Pc(25) int local25 = 0; local25 < this.anInt2668; local25++) {
			if (this.aByteArray71[local25] >= 65 && this.aByteArray71[local25] <= 90) {
				local11.aByteArray71[local3++] = (byte) (this.aByteArray71[local25] + 97 - 65);
				local11.anInt2668 = local3;
			} else if (this.aByteArray71[local25] >= 97 && this.aByteArray71[local25] <= 122 || this.aByteArray71[local25] >= 48 && this.aByteArray71[local25] <= 57) {
				local11.aByteArray71[local3++] = this.aByteArray71[local25];
				local11.anInt2668 = local3;
			} else if (local3 > 0) {
				local11.aByteArray71[local3++] = 95;
			}
			if (local3 == 12) {
				break;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I[BIII)I")
	public int method1886(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		Static135.method111(this.aByteArray71, 0, arg1, arg0, arg2);
		return arg2;
	}

	@OriginalMember(owner = "client!v", name = "j", descriptor = "(I)Ljava/net/URL;")
	public URL method1887() throws MalformedURLException {
		return new URL(new String(this.aByteArray71, 0, this.anInt2668));
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(BI)Lclient!v;")
	public Class76 method1888(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean154) {
			this.anInt2670 = 0;
			if (this.anInt2668 == this.aByteArray71.length) {
				@Pc(44) int local44;
				for (local44 = 1; local44 <= this.anInt2668; local44 += local44) {
				}
				@Pc(61) byte[] local61 = new byte[local44];
				Static135.method111(this.aByteArray71, 0, local61, 0, this.anInt2668);
				this.aByteArray71 = local61;
			}
			this.aByteArray71[this.anInt2668++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!v", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1857();
	}
}
