import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class60 implements Interface2 {

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
	private int anInt2796;

	@OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
	public int anInt2817;

	@OriginalMember(owner = "client!qf", name = "M", descriptor = "[B")
	public byte[] aByteArray73;

	@OriginalMember(owner = "client!qf", name = "O", descriptor = "Z")
	private boolean aBoolean103 = true;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Z")
	public boolean method1826() {
		return this.method1835();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)Lclient!qf;")
	public Class60 method1827() {
		@Pc(7) int local7;
		for (local7 = 0; this.anInt2817 > local7 && (this.aByteArray73[local7] >= 0 && this.aByteArray73[local7] <= 32 || (this.aByteArray73[local7] & 0xFF) == 160); local7++) {
		}
		@Pc(41) int local41;
		for (local41 = this.anInt2817; local41 > local7 && (this.aByteArray73[local41 - 1] >= 0 && this.aByteArray73[local41 - 1] <= 32 || (this.aByteArray73[local41 - 1] & 0xFF) == 160); local41--) {
		}
		if (local7 == 0 && this.anInt2817 == local41) {
			return this;
		}
		@Pc(99) Class60 local99 = new Class60();
		local99.anInt2817 = local41 - local7;
		local99.aByteArray73 = new byte[local99.anInt2817];
		for (@Pc(111) int local111 = 0; local111 < local99.anInt2817; local111++) {
			local99.aByteArray73[local111] = this.aByteArray73[local7 + local111];
		}
		return local99;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)Lclient!qf;")
	public Class60 method1828(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean103) {
			this.anInt2796 = 0;
			if (this.aByteArray73.length == this.anInt2817) {
				@Pc(54) int local54;
				for (local54 = 1; local54 <= this.anInt2817; local54 += local54) {
				}
				@Pc(71) byte[] local71 = new byte[local54];
				Static135.method1705(this.aByteArray73, 0, local71, 0, this.anInt2817);
				this.aByteArray73 = local71;
			}
			this.aByteArray73[this.anInt2817++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Lclient!qf;")
	public Class60 method1829(@OriginalArg(0) int arg0) {
		return this.method1864(arg0, this.anInt2817);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!qf;I)Lclient!qf;")
	public Class60 method1830(@OriginalArg(0) Class60 arg0) {
		if (!this.aBoolean103) {
			throw new IllegalArgumentException();
		}
		this.anInt2796 = 0;
		if (this.aByteArray73.length < this.anInt2817 + arg0.anInt2817) {
			@Pc(40) int local40;
			for (local40 = 1; local40 < this.anInt2817 + arg0.anInt2817; local40 += local40) {
			}
			@Pc(56) byte[] local56 = new byte[local40];
			Static135.method1705(this.aByteArray73, 0, local56, 0, this.anInt2817);
			this.aByteArray73 = local56;
		}
		Static135.method1705(arg0.aByteArray73, 0, this.aByteArray73, this.anInt2817, arg0.anInt2817);
		this.anInt2817 += arg0.anInt2817;
		return this;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)I")
	public int method1832(@OriginalArg(1) int arg0) {
		return this.aByteArray73[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)I")
	public int method1833() {
		return this.method1845(10);
	}

	@OriginalMember(owner = "client!qf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)Lclient!qf;")
	public Class60 method1834() {
		@Pc(9) Class60 local9 = new Class60();
		local9.anInt2817 = this.anInt2817;
		local9.aByteArray73 = new byte[this.anInt2817];
		for (@Pc(20) int local20 = 0; local20 < this.anInt2817; local20++) {
			local9.aByteArray73[local20] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(IB)Z")
	private boolean method1835() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt2817; local29++) {
			@Pc(38) int local38 = this.aByteArray73[local29] & 0xFF;
			if (local29 == 0) {
				if (local38 == 45) {
					local7 = true;
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
				return false;
			}
			if (local38 >= 10) {
				return false;
			}
			if (local7) {
				local38 = -local38;
			}
			@Pc(104) int local104 = local21 * 10 + local38;
			if (local104 / 10 != local21) {
				return false;
			}
			local21 = local104;
			local9 = true;
		}
		return local9;
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)I")
	public int method1836() {
		return this.anInt2817;
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)Ljava/net/URL;")
	public URL method1837() throws MalformedURLException {
		return new URL(new String(this.aByteArray73, 0, this.anInt2817));
	}

	@OriginalMember(owner = "client!qf", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1855();
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Lclient!qf;I)Z")
	public boolean method1839(@OriginalArg(0) Class60 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt2817 == this.anInt2817) {
			if (!this.aBoolean103 || !arg0.aBoolean103) {
				if (this.anInt2796 == 0) {
					this.anInt2796 = this.method1855();
					if (this.anInt2796 == 0) {
						this.anInt2796 = 1;
					}
				}
				if (arg0.anInt2796 == 0) {
					arg0.anInt2796 = arg0.method1855();
					if (arg0.anInt2796 == 0) {
						arg0.anInt2796 = 1;
					}
				}
				if (this.anInt2796 != arg0.anInt2796) {
					return false;
				}
			}
			for (@Pc(77) int local77 = 0; local77 < this.anInt2817; local77++) {
				if (arg0.aByteArray73[local77] != this.aByteArray73[local77]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(IB)Lclient!qf;")
	public Class60 method1840(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(30) Class60 local30 = new Class60();
		local30.aByteArray73 = new byte[this.anInt2817 + 1];
		local30.anInt2817 = this.anInt2817 + 1;
		Static135.method1705(this.aByteArray73, 0, local30.aByteArray73, 0, this.anInt2817);
		local30.aByteArray73[this.anInt2817] = (byte) arg0;
		return local30;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)I")
	public int method1841() {
		return this.method1850();
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(Lclient!qf;I)I")
	public int method1842(@OriginalArg(0) Class60 arg0) {
		@Pc(9) int local9;
		if (this.anInt2817 <= arg0.anInt2817) {
			local9 = this.anInt2817;
		} else {
			local9 = arg0.anInt2817;
		}
		for (@Pc(27) int local27 = 0; local27 < local9; local27++) {
			if (Static74.anIntArray240[this.aByteArray73[local27] & 0xFF] < Static74.anIntArray240[arg0.aByteArray73[local27] & 0xFF]) {
				return -1;
			}
			if (Static74.anIntArray240[this.aByteArray73[local27] & 0xFF] > Static74.anIntArray240[arg0.aByteArray73[local27] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt2817 < arg0.anInt2817) {
			return -1;
		} else if (this.anInt2817 > arg0.anInt2817) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)J")
	private long method1843() {
		@Pc(1) long local1 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2817; local7++) {
			local1 = (long) (this.aByteArray73[local7] & 0xFF) + (local1 << 5) - local1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!qf;Z)I")
	public int method1844(@OriginalArg(0) Class60 arg0) {
		@Pc(17) int local17;
		if (arg0.anInt2817 >= this.anInt2817) {
			local17 = this.anInt2817;
		} else {
			local17 = arg0.anInt2817;
		}
		for (@Pc(24) int local24 = 0; local24 < local17; local24++) {
			if ((this.aByteArray73[local24] & 0xFF) < (arg0.aByteArray73[local24] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray73[local24] & 0xFF) > (arg0.aByteArray73[local24] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.anInt2817 > this.anInt2817) {
			return -1;
		} else if (arg0.anInt2817 < this.anInt2817) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(IB)I")
	public int method1845(@OriginalArg(0) int arg0) {
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2817; local23++) {
			@Pc(37) int local37 = this.aByteArray73[local23] & 0xFF;
			if (local23 == 0) {
				if (local37 == 45) {
					local15 = true;
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
			if (arg0 <= local37) {
				throw new NumberFormatException();
			}
			if (local15) {
				local37 = -local37;
			}
			@Pc(107) int local107 = local37 + local21 * arg0;
			if (local21 != local107 / arg0) {
				throw new NumberFormatException();
			}
			local21 = local107;
			local13 = true;
		}
		if (!local13) {
			throw new NumberFormatException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(Z)Lclient!qf;")
	public Class60 method1846() {
		@Pc(17) Class60 local17 = new Class60();
		local17.anInt2817 = this.anInt2817;
		local17.aByteArray73 = new byte[this.anInt2817];
		for (@Pc(28) int local28 = 0; local28 < this.anInt2817; local28++) {
			@Pc(35) byte local35 = this.aByteArray73[local28];
			if (local35 >= 65 && local35 <= 90 || local35 >= -64 && local35 <= -34 && local35 != -41) {
				local35 = (byte) (local35 + 32);
			}
			local17.aByteArray73[local28] = local35;
		}
		return local17;
	}

	@OriginalMember(owner = "client!qf", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class60)) {
			throw new IllegalArgumentException();
		}
		return this.method1839((Class60) arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLclient!qf;)I")
	public int method1847(@OriginalArg(1) Class60 arg0) {
		return this.method1852(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!qf;B)Z")
	public boolean method1848(@OriginalArg(0) Class60 arg0) {
		if (arg0.anInt2817 > this.anInt2817) {
			return false;
		}
		@Pc(18) int local18 = this.anInt2817 - arg0.anInt2817;
		for (@Pc(20) int local20 = 0; local20 < arg0.anInt2817; local20++) {
			if (this.aByteArray73[local20 + local18] != arg0.aByteArray73[local20]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)Lclient!qf;")
	public Class60 method1849() {
		if (!this.aBoolean103) {
			throw new IllegalArgumentException();
		}
		this.anInt2796 = 0;
		if (this.anInt2817 != this.aByteArray73.length) {
			@Pc(28) byte[] local28 = new byte[this.anInt2817];
			Static135.method1705(this.aByteArray73, 0, local28, 0, this.anInt2817);
			this.aByteArray73 = local28;
		}
		return this;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)I")
	private int method1850() {
		for (@Pc(18) int local18 = 0; local18 < this.anInt2817; local18++) {
			if (this.aByteArray73[local18] == 32) {
				return local18;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZLclient!qf;I)I")
	private int method1852(@OriginalArg(1) Class60 arg0) {
		@Pc(9) int[] local9 = new int[arg0.anInt2817];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg0.anInt2817];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg0.anInt2817;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg0.anInt2817; local36++) {
			local9[local36 - 1] = (arg0.anInt2817 << 1) - local36;
			local12[arg0.aByteArray73[local36 - 1] & 0xFF] = arg0.anInt2817 - local36;
		}
		@Pc(75) int local75 = arg0.anInt2817 + 1;
		for (@Pc(78) int local78 = arg0.anInt2817; local78 > 0; local78--) {
			local16[local78 - 1] = local75;
			while (local75 <= arg0.anInt2817 && arg0.aByteArray73[local78 - 1] != arg0.aByteArray73[local75 - 1]) {
				if (local9[local75 - 1] >= arg0.anInt2817 - local78) {
					local9[local75 - 1] = arg0.anInt2817 - local78;
				}
				local75 = local16[local75 - 1];
			}
			local75--;
		}
		@Pc(151) int local151 = local75;
		@Pc(153) int local153 = 1;
		local75 = arg0.anInt2817 + 1 - local75;
		@Pc(163) int local163 = 0;
		@Pc(165) int local165 = 1;
		while (local75 >= local165) {
			local16[local165 - 1] = local163;
			while (local163 >= 1 && arg0.aByteArray73[local163 - 1] != arg0.aByteArray73[local165 - 1]) {
				local163 = local16[local163 - 1];
			}
			local165++;
			local163++;
		}
		@Pc(214) int local214;
		while (local151 < arg0.anInt2817) {
			for (local214 = local153; local214 <= local151; local214++) {
				if (local9[local214 - 1] >= local151 + arg0.anInt2817 - local214) {
					local9[local214 - 1] = local151 + arg0.anInt2817 - local214;
				}
			}
			local153 = local151 + 1;
			local151 -= local16[local75 - 1] - local75;
			local75 = local16[local75 - 1];
		}
		@Pc(293) int local293;
		for (local214 = arg0.anInt2817 - 1; local214 < this.anInt2817; local214 += Math.max(local12[this.aByteArray73[local214] & 0xFF], local9[local293])) {
			for (local293 = arg0.anInt2817 - 1; local293 >= 0 && this.aByteArray73[local214] == arg0.aByteArray73[local293]; local293--) {
				local214--;
			}
			if (local293 == -1) {
				return local214 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(Lclient!qf;I)Z")
	public boolean method1853(@OriginalArg(0) Class60 arg0) {
		if (this.anInt2817 < arg0.anInt2817) {
			return false;
		}
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2817; local25++) {
			if (arg0.aByteArray73[local25] != this.aByteArray73[local25]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(Z)Lclient!qf;")
	public Class60 method1854() {
		@Pc(9) Class60 local9 = new Class60();
		local9.anInt2817 = 0;
		local9.aByteArray73 = new byte[12];
		@Pc(18) int local18 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt2817; local27++) {
			if (this.aByteArray73[local27] >= 65 && this.aByteArray73[local27] <= 90) {
				local9.aByteArray73[local18++] = (byte) (this.aByteArray73[local27] + 97 - 65);
				local9.anInt2817 = local18;
			} else if (this.aByteArray73[local27] >= 97 && this.aByteArray73[local27] <= 122 || this.aByteArray73[local27] >= 48 && this.aByteArray73[local27] <= 57) {
				local9.aByteArray73[local18++] = this.aByteArray73[local27];
				local9.anInt2817 = local18;
			} else if (local18 > 0) {
				local9.aByteArray73[local18++] = 95;
			}
			if (local18 == 12) {
				break;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(Z)I")
	public int method1855() {
		@Pc(5) int local5 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2817; local12++) {
			local5 = (local5 << 5) + (this.aByteArray73[local12] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[BIBI)I")
	public int method1856(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(4) int arg2) {
		Static135.method1705(this.aByteArray73, 0, arg1, arg2, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/awt/FontMetrics;Z)I")
	public int method1857(@OriginalArg(0) FontMetrics arg0) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray73, 0, this.anInt2817, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray73, 0, this.anInt2817);
		}
		return arg0.stringWidth(local18);
	}

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)Lclient!qf;")
	public Class60 method1858() {
		@Pc(7) long local7 = this.method1843();
		@Pc(16) Class local16 = qf.class;
		synchronized (qf.class) {
			@Pc(32) Class3_Sub5 local32;
			if (Static109.aClass82_10 == null) {
				Static109.aClass82_10 = new Class82(4096);
			} else {
				for (local32 = (Class3_Sub5) Static109.aClass82_10.method2305(local7); local32 != null; local32 = (Class3_Sub5) Static109.aClass82_10.method2304()) {
					if (this.method1839(local32.aClass60_186)) {
						return local32.aClass60_186;
					}
				}
			}
			local32 = new Class3_Sub5();
			local32.aClass60_186 = this;
			this.aBoolean103 = false;
			Static109.aClass82_10.method2303(local32, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!qf;)Z")
	public boolean method1860(@OriginalArg(1) Class60 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2817 == arg0.anInt2817) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt2817; local27++) {
				@Pc(34) byte local34 = this.aByteArray73[local27];
				if (local34 >= 65 && local34 <= 90 || local34 >= -64 && local34 <= -34 && local34 != -41) {
					local34 = (byte) (local34 + 32);
				}
				@Pc(61) byte local61 = arg0.aByteArray73[local27];
				if (local61 >= 65 && local61 <= 90 || local61 >= -64 && local61 <= -34 && local61 != -41) {
					local61 = (byte) (local61 + 32);
				}
				if (local61 != local34) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "(I)[B")
	public byte[] method1861() {
		@Pc(12) byte[] local12 = new byte[this.anInt2817];
		Static135.method1705(this.aByteArray73, 0, local12, 0, this.anInt2817);
		return local12;
	}

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "(I)Lclient!qf;")
	public Class60 method1862() {
		@Pc(3) byte local3 = 2;
		@Pc(7) Class60 local7 = new Class60();
		local7.anInt2817 = this.anInt2817;
		local7.aByteArray73 = new byte[this.anInt2817];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2817; local18++) {
			@Pc(25) byte local25 = this.aByteArray73[local18];
			if (local25 >= 97 && local25 <= 122 || local25 >= -32 && local25 <= -2 && local25 != -9) {
				if (local3 == 2) {
					local25 = (byte) (local25 - 32);
				}
				local3 = 0;
			} else if (local25 >= 65 && local25 <= 90 || !(local25 < -64 || local25 > -34 || local25 == -41)) {
				if (local3 == 0) {
					local25 = (byte) (local25 + 32);
				}
				local3 = 0;
			} else if (local25 == 46 || local25 == 33 || local25 == 63) {
				local3 = 2;
			} else if (local25 != 32) {
				local3 = 1;
			} else if (local3 != 2) {
				local3 = 1;
			}
			local7.aByteArray73[local18] = local25;
		}
		return local7;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)J")
	public long method1863() {
		@Pc(12) long local12 = 0L;
		for (@Pc(14) int local14 = 0; this.anInt2817 > local14 && local14 < 12; local14++) {
			local12 *= 37L;
			@Pc(25) byte local25 = this.aByteArray73[local14];
			if (local25 >= 65 && local25 <= 90) {
				local12 += local25 - 64;
			} else if (local25 >= 97 && local25 <= 122) {
				local12 += local25 + 1 - 97;
			} else if (local25 >= 48 && local25 <= 57) {
				local12 += local25 + 27 - 48;
			}
		}
		while (local12 % 37L == 0L && local12 != 0L) {
			local12 /= 37L;
		}
		return local12;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBI)Lclient!qf;")
	public Class60 method1864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class60 local7 = new Class60();
		local7.aByteArray73 = new byte[arg1 - arg0];
		local7.anInt2817 = arg1 - arg0;
		Static135.method1705(this.aByteArray73, arg0, local7.aByteArray73, 0, local7.anInt2817);
		return local7;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public void method1865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray73, 0, this.anInt2817, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray73, 0, this.anInt2817);
		}
		arg2.drawString(local18, arg0, arg1);
	}

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "(I)Lclient!qf;")
	public Class60 method1866() {
		@Pc(9) Class60 local9 = new Class60();
		@Pc(11) boolean local11 = true;
		local9.anInt2817 = this.anInt2817;
		local9.aByteArray73 = new byte[this.anInt2817];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2817; local27++) {
			@Pc(34) byte local34 = this.aByteArray73[local27];
			if (local34 == 95) {
				local11 = true;
				local9.aByteArray73[local27] = 32;
			} else if (local34 >= 97 && local34 <= 122 && local11) {
				local11 = false;
				local9.aByteArray73[local27] = (byte) (local34 - 32);
			} else {
				local11 = false;
				local9.aByteArray73[local27] = local34;
			}
		}
		return local9;
	}
}
