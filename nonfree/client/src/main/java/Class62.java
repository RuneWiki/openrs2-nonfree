import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class62 implements Interface2 {

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
	private int anInt2644;

	@OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
	public int anInt2653;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "Z")
	private boolean aBoolean118 = true;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
	public void method1837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2) {
		@Pc(17) String local17;
		try {
			local17 = new String(this.aByteArray28, 0, this.anInt2653, "ISO-8859-1");
		} catch (@Pc(19) UnsupportedEncodingException local19) {
			local17 = new String(this.aByteArray28, 0, this.anInt2653);
		}
		arg2.drawString(local17, arg0, arg1);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[BIII)I")
	public int method1838(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static220.method1006(this.aByteArray28, 0, arg0, arg2, arg1);
		return arg1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)[Lclient!mb;")
	public Class62[] method1839(@OriginalArg(1) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < this.anInt2653; local5++) {
			if (this.aByteArray28[local5] == arg0) {
				local3++;
			}
		}
		@Pc(32) Class62[] local32 = new Class62[local3 + 1];
		if (local3 == 0) {
			local32[0] = this;
			return local32;
		}
		@Pc(49) int local49 = 0;
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < local3; local53++) {
			@Pc(57) int local57;
			for (local57 = 0; arg0 != this.aByteArray28[local57 + local51]; local57++) {
			}
			local32[local49++] = this.method1862(local51, local51 + local57);
			local51 += local57 + 1;
		}
		local32[local3] = this.method1862(local51, this.anInt2653);
		return local32;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!mb;)I")
	public int method1841(@OriginalArg(1) Class62 arg0) {
		@Pc(19) int local19;
		if (arg0.anInt2653 < this.anInt2653) {
			local19 = arg0.anInt2653;
		} else {
			local19 = this.anInt2653;
		}
		for (@Pc(30) int local30 = 0; local30 < local19; local30++) {
			if (Static175.anIntArray321[arg0.aByteArray28[local30] & 0xFF] > Static175.anIntArray321[this.aByteArray28[local30] & 0xFF]) {
				return -1;
			}
			if (Static175.anIntArray321[arg0.aByteArray28[local30] & 0xFF] < Static175.anIntArray321[this.aByteArray28[local30] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt2653 < arg0.anInt2653) {
			return -1;
		} else if (arg0.anInt2653 < this.anInt2653) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLjava/applet/Applet;)Lclient!mb;")
	public Class62 method1842(@OriginalArg(1) Applet arg0) {
		@Pc(12) String local12 = new String(this.aByteArray28, 0, this.anInt2653);
		@Pc(21) String local21 = arg0.getParameter(local12);
		return local21 == null ? null : Static181.method2621(local21);
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)J")
	public long method1843() {
		@Pc(7) long local7 = 0L;
		for (@Pc(9) int local9 = 0; local9 < this.anInt2653 && local9 < 12; local9++) {
			local7 *= 37L;
			@Pc(20) byte local20 = this.aByteArray28[local9];
			if (local20 >= 65 && local20 <= 90) {
				local7 += local20 + 1 - 65;
			} else if (local20 >= 97 && local20 <= 122) {
				local7 += local20 - 96;
			} else if (local20 >= 48 && local20 <= 57) {
				local7 += local20 + 27 - 48;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BII)Lclient!mb;")
	public Class62 method1844() {
		@Pc(15) Class62 local15 = new Class62();
		local15.anInt2653 = this.anInt2653;
		local15.aByteArray28 = new byte[this.anInt2653];
		for (@Pc(26) int local26 = 0; local26 < this.anInt2653; local26++) {
			@Pc(33) byte local33 = this.aByteArray28[local26];
			if (local33 == 47) {
				local15.aByteArray28[local26] = 32;
			} else {
				local15.aByteArray28[local26] = local33;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)[B")
	public byte[] method1845() {
		@Pc(13) byte[] local13 = new byte[this.anInt2653];
		Static220.method1006(this.aByteArray28, 0, local13, 0, this.anInt2653);
		return local13;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)Lclient!mb;")
	public Class62 method1846() {
		@Pc(8) int local8 = this.anInt2653;
		@Pc(10) int local10;
		for (local10 = 0; this.anInt2653 > local10 && (this.aByteArray28[local10] >= 0 && this.aByteArray28[local10] <= 32 || (this.aByteArray28[local10] & 0xFF) == 160); local10++) {
		}
		while (local10 < local8 && (this.aByteArray28[local8 - 1] >= 0 && this.aByteArray28[local8 - 1] <= 32 || (this.aByteArray28[local8 - 1] & 0xFF) == 160)) {
			local8--;
		}
		if (local10 == 0 && this.anInt2653 == local8) {
			return this;
		}
		@Pc(106) Class62 local106 = new Class62();
		local106.anInt2653 = local8 - local10;
		local106.aByteArray28 = new byte[local106.anInt2653];
		for (@Pc(119) int local119 = 0; local119 < local106.anInt2653; local119++) {
			local106.aByteArray28[local119] = this.aByteArray28[local10 + local119];
		}
		return local106;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!mb;I)I")
	public int method1847(@OriginalArg(0) Class62 arg0) {
		@Pc(24) int local24;
		if (arg0.anInt2653 >= this.anInt2653) {
			local24 = this.anInt2653;
		} else {
			local24 = arg0.anInt2653;
		}
		for (@Pc(31) int local31 = 0; local31 < local24; local31++) {
			if ((this.aByteArray28[local31] & 0xFF) < (arg0.aByteArray28[local31] & 0xFF)) {
				return -1;
			}
			if ((arg0.aByteArray28[local31] & 0xFF) < (this.aByteArray28[local31] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.anInt2653 > this.anInt2653) {
			return -1;
		} else if (arg0.anInt2653 < this.anInt2653) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(BI)Lclient!mb;")
	public Class62 method1849(@OriginalArg(1) int arg0) {
		return this.method1862(arg0, this.anInt2653);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Z")
	private boolean method1850() {
		@Pc(7) boolean local7 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(30) int local30 = 0; local30 < this.anInt2653; local30++) {
			@Pc(39) int local39 = this.aByteArray28[local30] & 0xFF;
			if (local30 == 0) {
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
				return false;
			}
			if (local39 >= 10) {
				return false;
			}
			if (local7) {
				local39 = -local39;
			}
			@Pc(107) int local107 = local39 + local21 * 10;
			if (local107 / 10 != local21) {
				return false;
			}
			local19 = true;
			local21 = local107;
		}
		return local19;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)Lclient!mb;")
	public Class62 method1851(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(30) Class62 local30 = new Class62();
		local30.aByteArray28 = new byte[this.anInt2653 + 1];
		local30.anInt2653 = this.anInt2653 + 1;
		Static220.method1006(this.aByteArray28, 0, local30.aByteArray28, 0, this.anInt2653);
		local30.aByteArray28[this.anInt2653] = (byte) arg0;
		return local30;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)Lclient!mb;")
	public Class62 method1852() {
		if (!this.aBoolean118) {
			throw new IllegalArgumentException();
		}
		this.anInt2644 = 0;
		if (this.aByteArray28.length != this.anInt2653) {
			@Pc(35) byte[] local35 = new byte[this.anInt2653];
			Static220.method1006(this.aByteArray28, 0, local35, 0, this.anInt2653);
			this.aByteArray28 = local35;
		}
		return this;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)I")
	public int method1853() {
		return this.method1873(10);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
	public int method1854(@OriginalArg(1) FontMetrics arg0) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray28, 0, this.anInt2653, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray28, 0, this.anInt2653);
		}
		return arg0.stringWidth(local18);
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)Lclient!mb;")
	public Class62 method1855() {
		@Pc(17) Class62 local17 = new Class62();
		local17.anInt2653 = this.anInt2653;
		local17.aByteArray28 = new byte[this.anInt2653];
		for (@Pc(28) int local28 = 0; local28 < this.anInt2653; local28++) {
			local17.aByteArray28[local28] = 42;
		}
		return local17;
	}

	@OriginalMember(owner = "client!mb", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1868();
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)Z")
	public boolean method1856() {
		return this.method1850();
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)I")
	public int method1857(@OriginalArg(0) int arg0) {
		return this.aByteArray28[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(ILclient!mb;)Z")
	public boolean method1858(@OriginalArg(1) Class62 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt2653 == this.anInt2653) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt2653; local23++) {
				@Pc(30) byte local30 = this.aByteArray28[local23];
				if (local30 >= 65 && local30 <= 90 || local30 >= -64 && local30 <= -34 && local30 != -41) {
					local30 = (byte) (local30 + 32);
				}
				@Pc(61) byte local61 = arg0.aByteArray28[local23];
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

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)Lclient!mb;")
	public Class62 method1859(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean118) {
			this.anInt2644 = 0;
			if (this.aByteArray28.length == this.anInt2653) {
				@Pc(41) int local41;
				for (local41 = 1; local41 <= this.anInt2653; local41 += local41) {
				}
				@Pc(54) byte[] local54 = new byte[local41];
				Static220.method1006(this.aByteArray28, 0, local54, 0, this.anInt2653);
				this.aByteArray28 = local54;
			}
			this.aByteArray28[this.anInt2653++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)Lclient!mb;")
	public Class62 method1860() {
		@Pc(7) long local7 = this.method1861();
		@Pc(16) Class local16 = mb.class;
		synchronized (mb.class) {
			@Pc(26) Class2_Sub5 local26;
			if (Static206.aClass58_2 == null) {
				Static206.aClass58_2 = new Class58(4096);
			} else {
				for (local26 = (Class2_Sub5) Static206.aClass58_2.method1704(local7); local26 != null; local26 = (Class2_Sub5) Static206.aClass58_2.method1706()) {
					if (this.method1870(local26.aClass62_229)) {
						return local26.aClass62_229;
					}
				}
			}
			local26 = new Class2_Sub5();
			local26.aClass62_229 = this;
			this.aBoolean118 = false;
			Static206.aClass58_2.method1708(local26, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)J")
	private long method1861() {
		@Pc(5) long local5 = 0L;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2653; local12++) {
			local5 = (local5 << 5) + (long) (this.aByteArray28[local12] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)Lclient!mb;")
	public Class62 method1862(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class62 local3 = new Class62();
		local3.aByteArray28 = new byte[arg1 - arg0];
		local3.anInt2653 = arg1 - arg0;
		Static220.method1006(this.aByteArray28, arg0, local3.aByteArray28, 0, local3.anInt2653);
		return local3;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/applet/Applet;I)V")
	public void method1863(@OriginalArg(0) Applet arg0) throws Throwable {
		@Pc(8) String local8 = new String(this.aByteArray28, 0, this.anInt2653);
		Static224.method2894(local8, arg0);
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)V")
	public void method1864() {
		@Pc(17) String local17;
		try {
			local17 = new String(this.aByteArray28, 0, this.anInt2653, "ISO-8859-1");
		} catch (@Pc(19) UnsupportedEncodingException local19) {
			local17 = new String(this.aByteArray28, 0, this.anInt2653);
		}
		System.out.println(local17);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!mb;)I")
	public int method1866(@OriginalArg(0) int arg0, @OriginalArg(2) Class62 arg1) {
		@Pc(9) int[] local9 = new int[arg1.anInt2653];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg1.anInt2653];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg1.anInt2653;
		}
		for (@Pc(32) int local32 = 1; local32 <= arg1.anInt2653; local32++) {
			local16[local32 - 1] = (arg1.anInt2653 << 1) - local32;
			local12[arg1.aByteArray28[local32 - 1] & 0xFF] = arg1.anInt2653 - local32;
		}
		@Pc(74) int local74 = arg1.anInt2653 + 1;
		for (@Pc(77) int local77 = arg1.anInt2653; local77 > 0; local77--) {
			local9[local77 - 1] = local74;
			while (arg1.anInt2653 >= local74 && arg1.aByteArray28[local74 - 1] != arg1.aByteArray28[local77 - 1]) {
				if (arg1.anInt2653 - local77 <= local16[local74 - 1]) {
					local16[local74 - 1] = arg1.anInt2653 - local77;
				}
				local74 = local9[local74 - 1];
			}
			local74--;
		}
		@Pc(144) int local144 = local74;
		@Pc(146) int local146 = 0;
		local74 = arg1.anInt2653 + 1 - local74;
		@Pc(156) int local156 = 1;
		for (@Pc(164) int local164 = 1; local164 <= local74; local164++) {
			local9[local164 - 1] = local146;
			while (local146 >= 1 && arg1.aByteArray28[local146 - 1] != arg1.aByteArray28[local164 - 1]) {
				local146 = local9[local146 - 1];
			}
			local146++;
		}
		@Pc(211) int local211;
		while (local144 < arg1.anInt2653) {
			for (local211 = local156; local211 <= local144; local211++) {
				if (arg1.anInt2653 + local144 - local211 <= local16[local211 - 1]) {
					local16[local211 - 1] = local144 + arg1.anInt2653 - local211;
				}
			}
			local156 = local144 + 1;
			local144 = local144 + local74 - local9[local74 - 1];
			local74 = local9[local74 - 1];
		}
		@Pc(290) int local290;
		for (local211 = arg1.anInt2653 + arg0 - 1; local211 < this.anInt2653; local211 += Math.max(local12[this.aByteArray28[local211] & 0xFF], local16[local290])) {
			for (local290 = arg1.anInt2653 - 1; local290 >= 0 && this.aByteArray28[local211] == arg1.aByteArray28[local290]; local290--) {
				local211--;
			}
			if (local290 == -1) {
				return local211 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)Lclient!mb;")
	public Class62 method1867() {
		@Pc(9) Class62 local9 = new Class62();
		local9.anInt2653 = this.anInt2653;
		@Pc(22) byte local22 = 2;
		local9.aByteArray28 = new byte[this.anInt2653];
		for (@Pc(29) int local29 = 0; local29 < this.anInt2653; local29++) {
			@Pc(36) byte local36 = this.aByteArray28[local29];
			if (local36 >= 97 && local36 <= 122 || local36 >= -32 && local36 <= -2 && local36 != -9) {
				if (local22 == 2) {
					local36 = (byte) (local36 - 32);
				}
				local22 = 0;
			} else if (local36 >= 65 && local36 <= 90 || !(local36 < -64 || local36 > -34 || local36 == -41)) {
				if (local22 == 0) {
					local36 = (byte) (local36 + 32);
				}
				local22 = 0;
			} else if (local36 == 46 || local36 == 33 || local36 == 63) {
				local22 = 2;
			} else if (local36 != 32) {
				local22 = 1;
			} else if (local22 != 2) {
				local22 = 1;
			}
			local9.aByteArray28[local29] = local36;
		}
		return local9;
	}

	@OriginalMember(owner = "client!mb", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class62)) {
			throw new IllegalArgumentException();
		}
		return this.method1870((Class62) arg0);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)I")
	public int method1868() {
		@Pc(5) int local5 = 0;
		for (@Pc(13) int local13 = 0; local13 < this.anInt2653; local13++) {
			local5 = (local5 << 5) + (this.aByteArray28[local13] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!mb;)I")
	public int method1869(@OriginalArg(1) Class62 arg0) {
		return this.method1866(0, arg0);
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(BLclient!mb;)Z")
	public boolean method1870(@OriginalArg(1) Class62 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt2653 == this.anInt2653) {
			if (!this.aBoolean118 || !arg0.aBoolean118) {
				if (this.anInt2644 == 0) {
					this.anInt2644 = this.method1868();
					if (this.anInt2644 == 0) {
						this.anInt2644 = 1;
					}
				}
				if (arg0.anInt2644 == 0) {
					arg0.anInt2644 = arg0.method1868();
					if (arg0.anInt2644 == 0) {
						arg0.anInt2644 = 1;
					}
				}
				if (arg0.anInt2644 != this.anInt2644) {
					return false;
				}
			}
			for (@Pc(69) int local69 = 0; local69 < this.anInt2653; local69++) {
				if (arg0.aByteArray28[local69] != this.aByteArray28[local69]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!mb;Z)Lclient!mb;")
	public Class62 method1871(@OriginalArg(0) Class62 arg0) {
		if (!this.aBoolean118) {
			throw new IllegalArgumentException();
		}
		this.anInt2644 = 0;
		if (arg0.anInt2653 + this.anInt2653 > this.aByteArray28.length) {
			@Pc(35) int local35;
			for (local35 = 1; local35 < this.anInt2653 + arg0.anInt2653; local35 += local35) {
			}
			@Pc(55) byte[] local55 = new byte[local35];
			Static220.method1006(this.aByteArray28, 0, local55, 0, this.anInt2653);
			this.aByteArray28 = local55;
		}
		Static220.method1006(arg0.aByteArray28, 0, this.aByteArray28, this.anInt2653, arg0.anInt2653);
		this.anInt2653 += arg0.anInt2653;
		return this;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(B)Lclient!mb;")
	public Class62 method1872() {
		@Pc(9) Class62 local9 = new Class62();
		local9.anInt2653 = this.anInt2653;
		local9.aByteArray28 = new byte[this.anInt2653];
		for (@Pc(20) int local20 = 0; local20 < this.anInt2653; local20++) {
			@Pc(27) byte local27 = this.aByteArray28[local20];
			if (local27 >= 65 && local27 <= 90 || local27 >= -64 && local27 <= -34 && local27 != -41) {
				local27 = (byte) (local27 + 32);
			}
			local9.aByteArray28[local20] = local27;
		}
		return local9;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(II)I")
	public int method1873(@OriginalArg(1) int arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anInt2653; local25++) {
			@Pc(34) int local34 = this.aByteArray28[local25] & 0xFF;
			if (local25 == 0) {
				if (local34 == 45) {
					local7 = true;
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
			if (local7) {
				local34 = -local34;
			}
			@Pc(107) int local107 = local23 * arg0 + local34;
			if (local23 != local107 / arg0) {
				throw new NumberFormatException();
			}
			local23 = local107;
			local21 = true;
		}
		if (!local21) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIB)I")
	public int method1874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte local8 = (byte) arg1;
		for (@Pc(10) int local10 = arg0; local10 < this.anInt2653; local10++) {
			if (this.aByteArray28[local10] == local8) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)Ljava/net/URL;")
	public URL method1875() throws MalformedURLException {
		return new URL(new String(this.aByteArray28, 0, this.anInt2653));
	}

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "(I)Lclient!mb;")
	public Class62 method1876() {
		@Pc(9) Class62 local9 = new Class62();
		local9.anInt2653 = this.anInt2653;
		@Pc(15) boolean local15 = true;
		local9.aByteArray28 = new byte[this.anInt2653];
		for (@Pc(22) int local22 = 0; local22 < this.anInt2653; local22++) {
			@Pc(29) byte local29 = this.aByteArray28[local22];
			if (local29 == 95) {
				local15 = true;
				local9.aByteArray28[local22] = 32;
			} else if (local29 >= 97 && local29 <= 122 && local15) {
				local9.aByteArray28[local22] = (byte) (local29 - 32);
				local15 = false;
			} else {
				local9.aByteArray28[local22] = local29;
				local15 = false;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(ILclient!mb;)Z")
	public boolean method1877(@OriginalArg(1) Class62 arg0) {
		if (arg0.anInt2653 > this.anInt2653) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < arg0.anInt2653; local19++) {
			@Pc(26) byte local26 = arg0.aByteArray28[local19];
			@Pc(31) byte local31 = this.aByteArray28[local19];
			if (local31 >= 65 && local31 <= 90 || local31 >= -64 && local31 <= -34 && local31 != -41) {
				local31 = (byte) (local31 + 32);
			}
			if (local26 >= 65 && local26 <= 90 || local26 >= -64 && local26 <= -34 && local26 != -41) {
				local26 = (byte) (local26 + 32);
			}
			if (local31 != local26) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(B)I")
	public int method1878() {
		return this.anInt2653;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/net/URL;Z)Ljava/net/URL;")
	public URL method1879(@OriginalArg(0) URL arg0) throws MalformedURLException {
		return new URL(arg0, new String(this.aByteArray28, 0, this.anInt2653));
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(Lclient!mb;Z)Z")
	public boolean method1880(@OriginalArg(0) Class62 arg0) {
		if (arg0.anInt2653 > this.anInt2653) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt2653; local14++) {
			if (this.aByteArray28[local14] != arg0.aByteArray28[local14]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(Lclient!mb;Z)Z")
	public boolean method1881(@OriginalArg(0) Class62 arg0) {
		if (this.anInt2653 < arg0.anInt2653) {
			return false;
		}
		@Pc(22) int local22 = this.anInt2653 - arg0.anInt2653;
		for (@Pc(30) int local30 = 0; local30 < arg0.anInt2653; local30++) {
			if (this.aByteArray28[local30 + local22] != arg0.aByteArray28[local30]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "(I)Lclient!mb;")
	public Class62 method1882() {
		@Pc(14) Class62 local14 = Static149.method2218(this.method1843());
		return local14 == null ? Static50.aClass62_345 : local14;
	}
}
