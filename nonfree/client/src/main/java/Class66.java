import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class66 implements Interface3 {

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "[B")
	public byte[] aByteArray29;

	@OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
	private int anInt2576;

	@OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
	public int anInt2583;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Z")
	private boolean aBoolean109 = true;

	@OriginalMember(owner = "client!sc", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1821();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Lclient!sc;")
	public Class66 method1805(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean109) {
			this.anInt2576 = 0;
			if (this.aByteArray29.length == this.anInt2583) {
				@Pc(44) int local44;
				for (local44 = 1; local44 <= this.anInt2583; local44 += local44) {
				}
				@Pc(61) byte[] local61 = new byte[local44];
				Static139.method1493(this.aByteArray29, 0, local61, 0, this.anInt2583);
				this.aByteArray29 = local61;
			}
			this.aByteArray29[this.anInt2583++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)J")
	public long method1806() {
		@Pc(3) long local3 = 0L;
		for (@Pc(5) int local5 = 0; this.anInt2583 > local5 && local5 < 12; local5++) {
			@Pc(12) byte local12 = this.aByteArray29[local5];
			local3 *= 37L;
			if (local12 >= 65 && local12 <= 90) {
				local3 += local12 + 1 - 65;
			} else if (local12 >= 97 && local12 <= 122) {
				local3 += local12 - 96;
			} else if (local12 >= 48 && local12 <= 57) {
				local3 += local12 - 21;
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBI)Lclient!sc;")
	public Class66 method1807(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class66 local7 = new Class66();
		local7.anInt2583 = arg1 - arg0;
		local7.aByteArray29 = new byte[arg1 - arg0];
		Static139.method1493(this.aByteArray29, arg0, local7.aByteArray29, 0, local7.anInt2583);
		return local7;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)Lclient!sc;")
	public Class66 method1808() {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = this.anInt2583;
		while (local7 < this.anInt2583 && (this.aByteArray29[local7] >= 0 && this.aByteArray29[local7] <= 32 || (this.aByteArray29[local7] & 0xFF) == 160)) {
			local7++;
		}
		while (local10 > local7 && (this.aByteArray29[local10 - 1] >= 0 && this.aByteArray29[local10 - 1] <= 32 || (this.aByteArray29[local10 - 1] & 0xFF) == 160)) {
			local10--;
		}
		if (local7 == 0 && local10 == this.anInt2583) {
			return this;
		}
		@Pc(91) Class66 local91 = new Class66();
		local91.anInt2583 = local10 - local7;
		local91.aByteArray29 = new byte[local91.anInt2583];
		for (@Pc(103) int local103 = 0; local103 < local91.anInt2583; local103++) {
			local91.aByteArray29[local103] = this.aByteArray29[local103 + local7];
		}
		return local91;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)Z")
	private boolean method1809() {
		@Pc(13) boolean local13 = false;
		@Pc(19) int local19 = 0;
		@Pc(21) boolean local21 = false;
		for (@Pc(30) int local30 = 0; local30 < this.anInt2583; local30++) {
			@Pc(39) int local39 = this.aByteArray29[local30] & 0xFF;
			if (local30 == 0) {
				if (local39 == 45) {
					local13 = true;
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
			if (local13) {
				local39 = -local39;
			}
			@Pc(109) int local109 = local19 * 10 + local39;
			if (local19 != local109 / 10) {
				return false;
			}
			local21 = true;
			local19 = local109;
		}
		return local21;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)[B")
	public byte[] method1810() {
		@Pc(13) byte[] local13 = new byte[this.anInt2583];
		Static139.method1493(this.aByteArray29, 0, local13, 0, this.anInt2583);
		return local13;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)I")
	public int method1811(@OriginalArg(1) int arg0) {
		@Pc(15) boolean local15 = false;
		@Pc(27) int local27 = 0;
		@Pc(29) boolean local29 = false;
		for (@Pc(31) int local31 = 0; local31 < this.anInt2583; local31++) {
			@Pc(40) int local40 = this.aByteArray29[local31] & 0xFF;
			if (local31 == 0) {
				if (local40 == 45) {
					local15 = true;
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
			if (local15) {
				local40 = -local40;
			}
			@Pc(113) int local113 = arg0 * local27 + local40;
			if (local27 != local113 / arg0) {
				throw new NumberFormatException();
			}
			local27 = local113;
			local29 = true;
		}
		if (!local29) {
			throw new NumberFormatException();
		}
		return local27;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(II)I")
	public int method1812(@OriginalArg(1) int arg0) {
		return this.method1836(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZI)I")
	public int method1814(@OriginalArg(1) int arg0) {
		return this.aByteArray29[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)Lclient!sc;")
	public Class66 method1815() {
		if (!this.aBoolean109) {
			throw new IllegalArgumentException();
		}
		this.anInt2576 = 0;
		if (this.aByteArray29.length != this.anInt2583) {
			@Pc(28) byte[] local28 = new byte[this.anInt2583];
			Static139.method1493(this.aByteArray29, 0, local28, 0, this.anInt2583);
			this.aByteArray29 = local28;
		}
		return this;
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(B)Lclient!sc;")
	public Class66 method1816() {
		@Pc(7) long local7 = this.method1833();
		@Pc(16) Class local16 = sc.class;
		synchronized (sc.class) {
			@Pc(26) Class1_Sub3 local26;
			if (Static89.aClass65_34 == null) {
				Static89.aClass65_34 = new Class65(4096);
			} else {
				for (local26 = (Class1_Sub3) Static89.aClass65_34.method1802(local7); local26 != null; local26 = (Class1_Sub3) Static89.aClass65_34.method1799()) {
					if (this.method1824(local26.aClass66_239)) {
						return local26.aClass66_239;
					}
				}
			}
			local26 = new Class1_Sub3();
			local26.aClass66_239 = this;
			this.aBoolean109 = false;
			Static89.aClass65_34.method1797(local26, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!sc", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class66)) {
			throw new IllegalArgumentException();
		}
		return this.method1824((Class66) arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!sc;B)I")
	public int method1819(@OriginalArg(0) Class66 arg0) {
		return this.method1828(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)Lclient!sc;")
	public Class66 method1820() {
		@Pc(14) Class66 local14 = new Class66();
		local14.anInt2583 = this.anInt2583;
		@Pc(20) boolean local20 = true;
		local14.aByteArray29 = new byte[this.anInt2583];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2583; local27++) {
			@Pc(34) byte local34 = this.aByteArray29[local27];
			if (local34 == 95) {
				local14.aByteArray29[local27] = 32;
				local20 = true;
			} else if (local34 >= 97 && local34 <= 122 && local20) {
				local14.aByteArray29[local27] = (byte) (local34 - 32);
				local20 = false;
			} else {
				local14.aByteArray29[local27] = local34;
				local20 = false;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)I")
	public int method1821() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2583; local7++) {
			local5 = (this.aByteArray29[local7] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!sc;I)I")
	public int method1822(@OriginalArg(0) Class66 arg0) {
		@Pc(13) int local13;
		if (arg0.anInt2583 < this.anInt2583) {
			local13 = arg0.anInt2583;
		} else {
			local13 = this.anInt2583;
		}
		for (@Pc(24) int local24 = 0; local24 < local13; local24++) {
			if ((arg0.aByteArray29[local24] & 0xFF) > (this.aByteArray29[local24] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray29[local24] & 0xFF) > (arg0.aByteArray29[local24] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt2583 < arg0.anInt2583) {
			return -1;
		} else if (arg0.anInt2583 < this.anInt2583) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)Lclient!sc;")
	public Class66 method1823() {
		@Pc(5) Class66 local5 = new Class66();
		local5.anInt2583 = this.anInt2583;
		local5.aByteArray29 = new byte[this.anInt2583];
		for (@Pc(20) int local20 = 0; local20 < this.anInt2583; local20++) {
			@Pc(27) byte local27 = this.aByteArray29[local20];
			if (local27 >= 65 && local27 <= 90 || local27 >= -64 && local27 <= -34 && local27 != -41) {
				local27 = (byte) (local27 + 32);
			}
			local5.aByteArray29[local20] = local27;
		}
		return local5;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!sc;)Z")
	public boolean method1824(@OriginalArg(1) Class66 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt2583 == this.anInt2583) {
			if (!this.aBoolean109 || !arg0.aBoolean109) {
				if (this.anInt2576 == 0) {
					this.anInt2576 = this.method1821();
					if (this.anInt2576 == 0) {
						this.anInt2576 = 1;
					}
				}
				if (arg0.anInt2576 == 0) {
					arg0.anInt2576 = arg0.method1821();
					if (arg0.anInt2576 == 0) {
						arg0.anInt2576 = 1;
					}
				}
				if (arg0.anInt2576 != this.anInt2576) {
					return false;
				}
			}
			for (@Pc(69) int local69 = 0; local69 < this.anInt2583; local69++) {
				if (this.aByteArray29[local69] != arg0.aByteArray29[local69]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!sc;I)Lclient!sc;")
	public Class66 method1825(@OriginalArg(0) Class66 arg0) {
		if (!this.aBoolean109) {
			throw new IllegalArgumentException();
		}
		this.anInt2576 = 0;
		if (this.aByteArray29.length < arg0.anInt2583 + this.anInt2583) {
			@Pc(28) int local28;
			for (local28 = 1; local28 < this.anInt2583 + arg0.anInt2583; local28 += local28) {
			}
			@Pc(47) byte[] local47 = new byte[local28];
			Static139.method1493(this.aByteArray29, 0, local47, 0, this.anInt2583);
			this.aByteArray29 = local47;
		}
		Static139.method1493(arg0.aByteArray29, 0, this.aByteArray29, this.anInt2583, arg0.anInt2583);
		this.anInt2583 += arg0.anInt2583;
		return this;
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(B)Z")
	public boolean method1826() {
		return this.method1809();
	}

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "(B)Lclient!sc;")
	public Class66 method1827() {
		@Pc(9) Class66 local9 = new Class66();
		local9.anInt2583 = this.anInt2583;
		local9.aByteArray29 = new byte[this.anInt2583];
		for (@Pc(25) int local25 = 0; local25 < this.anInt2583; local25++) {
			local9.aByteArray29[local25] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILclient!sc;)I")
	private int method1828(@OriginalArg(2) Class66 arg0) {
		@Pc(9) int[] local9 = new int[arg0.anInt2583];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg0.anInt2583];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg0.anInt2583;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg0.anInt2583; local36++) {
			local9[local36 - 1] = (arg0.anInt2583 << 1) - local36;
			local12[arg0.aByteArray29[local36 - 1] & 0xFF] = arg0.anInt2583 - local36;
		}
		@Pc(79) int local79 = arg0.anInt2583 + 1;
		@Pc(82) int local82 = arg0.anInt2583;
		while (local82 > 0) {
			local16[local82 - 1] = local79;
			while (local79 <= arg0.anInt2583 && arg0.aByteArray29[local82 - 1] != arg0.aByteArray29[local79 - 1]) {
				if (local9[local79 - 1] >= arg0.anInt2583 - local82) {
					local9[local79 - 1] = arg0.anInt2583 - local82;
				}
				local79 = local16[local79 - 1];
			}
			local82--;
			local79--;
		}
		@Pc(153) int local153 = local79;
		local79 = arg0.anInt2583 + 1 - local79;
		@Pc(169) int local169 = 0;
		@Pc(171) int local171 = 1;
		for (@Pc(173) int local173 = 1; local173 <= local79; local173++) {
			local16[local173 - 1] = local169;
			while (local169 >= 1 && arg0.aByteArray29[local169 - 1] != arg0.aByteArray29[local173 - 1]) {
				local169 = local16[local169 - 1];
			}
			local169++;
		}
		@Pc(214) int local214;
		while (local153 < arg0.anInt2583) {
			for (local214 = local171; local214 <= local153; local214++) {
				if (arg0.anInt2583 + local153 - local214 <= local9[local214 - 1]) {
					local9[local214 - 1] = local153 + arg0.anInt2583 - local214;
				}
			}
			local171 = local153 + 1;
			local153 -= local16[local79 - 1] - local79;
			local79 = local16[local79 - 1];
		}
		@Pc(288) int local288;
		for (local214 = arg0.anInt2583 - 1; local214 < this.anInt2583; local214 += Math.max(local12[this.aByteArray29[local214] & 0xFF], local9[local288])) {
			for (local288 = arg0.anInt2583 - 1; local288 >= 0 && this.aByteArray29[local214] == arg0.aByteArray29[local288]; local288--) {
				local214--;
			}
			if (local288 == -1) {
				return local214 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!sc;Z)Z")
	public boolean method1829(@OriginalArg(0) Class66 arg0) {
		if (arg0.anInt2583 > this.anInt2583) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < arg0.anInt2583; local19++) {
			if (arg0.aByteArray29[local19] != this.aByteArray29[local19]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
	public void method1830(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) int arg2) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray29, 0, this.anInt2583, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray29, 0, this.anInt2583);
		}
		arg1.drawString(local13, arg2, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)Lclient!sc;")
	public Class66 method1831(@OriginalArg(1) int arg0) {
		return this.method1807(arg0, this.anInt2583);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLclient!sc;)I")
	public int method1832(@OriginalArg(1) Class66 arg0) {
		@Pc(17) int local17;
		if (this.anInt2583 > arg0.anInt2583) {
			local17 = arg0.anInt2583;
		} else {
			local17 = this.anInt2583;
		}
		for (@Pc(24) int local24 = 0; local24 < local17; local24++) {
			if (Static129.anIntArray497[arg0.aByteArray29[local24] & 0xFF] > Static129.anIntArray497[this.aByteArray29[local24] & 0xFF]) {
				return -1;
			}
			if (Static129.anIntArray497[this.aByteArray29[local24] & 0xFF] > Static129.anIntArray497[arg0.aByteArray29[local24] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt2583 < arg0.anInt2583) {
			return -1;
		} else if (this.anInt2583 > arg0.anInt2583) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)J")
	private long method1833() {
		@Pc(5) long local5 = 0L;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2583; local12++) {
			local5 = (local5 << 5) + (long) (this.aByteArray29[local12] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIB[B)I")
	public int method1834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) byte[] arg2) {
		Static139.method1493(this.aByteArray29, 0, arg2, arg0, arg1);
		return arg1;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(ILclient!sc;)Z")
	public boolean method1835(@OriginalArg(1) Class66 arg0) {
		if (arg0.anInt2583 > this.anInt2583) {
			return false;
		}
		@Pc(19) int local19 = this.anInt2583 - arg0.anInt2583;
		for (@Pc(28) int local28 = 0; local28 < arg0.anInt2583; local28++) {
			if (arg0.aByteArray29[local28] != this.aByteArray29[local28 + local19]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIB)I")
	private int method1836(@OriginalArg(1) int arg0) {
		@Pc(13) byte local13 = (byte) arg0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt2583; local15++) {
			if (this.aByteArray29[local15] == local13) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(ZI)Lclient!sc;")
	public Class66 method1837(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(17) Class66 local17 = new Class66();
		local17.aByteArray29 = new byte[this.anInt2583 + 1];
		local17.anInt2583 = this.anInt2583 + 1;
		Static139.method1493(this.aByteArray29, 0, local17.aByteArray29, 0, this.anInt2583);
		local17.aByteArray29[this.anInt2583] = (byte) arg0;
		return local17;
	}

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)Lclient!sc;")
	public Class66 method1839() {
		@Pc(12) byte local12 = 2;
		@Pc(16) Class66 local16 = new Class66();
		local16.anInt2583 = this.anInt2583;
		local16.aByteArray29 = new byte[this.anInt2583];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2583; local27++) {
			@Pc(34) byte local34 = this.aByteArray29[local27];
			if (local34 >= 97 && local34 <= 122 || !(local34 < -32 || local34 > -2 || local34 == -9)) {
				if (local12 == 2) {
					local34 = (byte) (local34 - 32);
				}
				local12 = 0;
			} else if (local34 >= 65 && local34 <= 90 || !(local34 < -64 || local34 > -34 || local34 == -41)) {
				if (local12 == 0) {
					local34 = (byte) (local34 + 32);
				}
				local12 = 0;
			} else if (local34 == 46 || local34 == 33 || local34 == 63) {
				local12 = 2;
			} else if (local34 != 32) {
				local12 = 1;
			} else if (local12 != 2) {
				local12 = 1;
			}
			local16.aByteArray29[local27] = local34;
		}
		return local16;
	}

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "(B)I")
	public int method1840() {
		return this.method1811(10);
	}

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "(B)Lclient!sc;")
	public Class66 method1841() {
		@Pc(9) Class66 local9 = new Class66();
		local9.aByteArray29 = new byte[12];
		local9.anInt2583 = 0;
		@Pc(18) int local18 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt2583; local27++) {
			if (this.aByteArray29[local27] >= 65 && this.aByteArray29[local27] <= 90) {
				local9.aByteArray29[local18++] = (byte) (this.aByteArray29[local27] + 32);
				local9.anInt2583 = local18;
			} else if (this.aByteArray29[local27] >= 97 && this.aByteArray29[local27] <= 122 || this.aByteArray29[local27] >= 48 && this.aByteArray29[local27] <= 57) {
				local9.aByteArray29[local18++] = this.aByteArray29[local27];
				local9.anInt2583 = local18;
			} else if (local18 > 0) {
				local9.aByteArray29[local18++] = 95;
			}
			if (local18 == 12) {
				break;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(ILclient!sc;)Z")
	public boolean method1843(@OriginalArg(1) Class66 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2583 == arg0.anInt2583) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt2583; local18++) {
				@Pc(25) byte local25 = this.aByteArray29[local18];
				@Pc(30) byte local30 = arg0.aByteArray29[local18];
				if (local30 >= 65 && local30 <= 90 || local30 >= -64 && local30 <= -34 && local30 != -41) {
					local30 = (byte) (local30 + 32);
				}
				if (local25 >= 65 && local25 <= 90 || local25 >= -64 && local25 <= -34 && local25 != -41) {
					local25 = (byte) (local25 + 32);
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

	@OriginalMember(owner = "client!sc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "(B)Ljava/net/URL;")
	public URL method1844() throws MalformedURLException {
		return new URL(new String(this.aByteArray29, 0, this.anInt2583));
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
	public int method1846(@OriginalArg(1) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray29, 0, this.anInt2583, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray29, 0, this.anInt2583);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "(I)I")
	public int method1847() {
		return this.anInt2583;
	}
}
