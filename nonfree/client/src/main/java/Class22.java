import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class22 implements Interface3 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	private int anInt621;

	@OriginalMember(owner = "client!ec", name = "fb", descriptor = "I")
	public int anInt668;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "Z")
	private boolean aBoolean65 = true;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIII[B)I")
	public int method444(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2) {
		Static139.method952(this.aByteArray7, 0, arg2, arg0, arg1);
		return arg1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
	private boolean method445() {
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = 0;
		@Pc(17) boolean local17 = false;
		for (@Pc(30) int local30 = 0; local30 < this.anInt668; local30++) {
			@Pc(39) int local39 = this.aByteArray7[local30] & 0xFF;
			if (local30 == 0) {
				if (local39 == 45) {
					local17 = true;
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
			if (local17) {
				local39 = -local39;
			}
			@Pc(109) int local109 = local39 + local15 * 10;
			if (local109 / 10 != local15) {
				return false;
			}
			local15 = local109;
			local13 = true;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ec", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class22)) {
			throw new IllegalArgumentException();
		}
		return this.method481((Class22) arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!ec;)I")
	public int method447(@OriginalArg(1) Class22 arg0) {
		@Pc(13) int local13;
		if (arg0.anInt668 < this.anInt668) {
			local13 = arg0.anInt668;
		} else {
			local13 = this.anInt668;
		}
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			if ((arg0.aByteArray7[local20] & 0xFF) > (this.aByteArray7[local20] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray7[local20] & 0xFF) > (arg0.aByteArray7[local20] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt668 < arg0.anInt668) {
			return -1;
		} else if (arg0.anInt668 < this.anInt668) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)I")
	public int method449() {
		return this.anInt668;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BII)Lclient!ec;")
	public Class22 method450(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class22 local15 = new Class22();
		local15.anInt668 = arg1 - arg0;
		local15.aByteArray7 = new byte[arg1 - arg0];
		Static139.method952(this.aByteArray7, arg0, local15.aByteArray7, 0, local15.anInt668);
		return local15;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ec;B)Lclient!ec;")
	public Class22 method452(@OriginalArg(0) Class22 arg0) {
		if (!this.aBoolean65) {
			throw new IllegalArgumentException();
		}
		this.anInt621 = 0;
		if (this.anInt668 + arg0.anInt668 > this.aByteArray7.length) {
			@Pc(27) int local27;
			for (local27 = 1; local27 < arg0.anInt668 + this.anInt668; local27 += local27) {
			}
			@Pc(47) byte[] local47 = new byte[local27];
			Static139.method952(this.aByteArray7, 0, local47, 0, this.anInt668);
			this.aByteArray7 = local47;
		}
		Static139.method952(arg0.aByteArray7, 0, this.aByteArray7, this.anInt668, arg0.anInt668);
		this.anInt668 += arg0.anInt668;
		return this;
	}

	@OriginalMember(owner = "client!ec", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)Lclient!ec;")
	public Class22 method453() {
		@Pc(14) Class22 local14 = new Class22();
		local14.aByteArray7 = new byte[12];
		@Pc(20) int local20 = 0;
		local14.anInt668 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anInt668; local25++) {
			if (this.aByteArray7[local25] >= 65 && this.aByteArray7[local25] <= 90) {
				local14.aByteArray7[local20++] = (byte) (this.aByteArray7[local25] + 97 - 65);
				local14.anInt668 = local20;
			} else if (this.aByteArray7[local25] >= 97 && this.aByteArray7[local25] <= 122 || this.aByteArray7[local25] >= 48 && this.aByteArray7[local25] <= 57) {
				local14.aByteArray7[local20++] = this.aByteArray7[local25];
				local14.anInt668 = local20;
			} else if (local20 > 0) {
				local14.aByteArray7[local20++] = 95;
			}
			if (local20 == 12) {
				break;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(ILclient!ec;)I")
	public int method454(@OriginalArg(1) Class22 arg0) {
		@Pc(7) int local7;
		if (this.anInt668 > arg0.anInt668) {
			local7 = arg0.anInt668;
		} else {
			local7 = this.anInt668;
		}
		for (@Pc(24) int local24 = 0; local24 < local7; local24++) {
			if (Static64.anIntArray186[this.aByteArray7[local24] & 0xFF] < Static64.anIntArray186[arg0.aByteArray7[local24] & 0xFF]) {
				return -1;
			}
			if (Static64.anIntArray186[this.aByteArray7[local24] & 0xFF] > Static64.anIntArray186[arg0.aByteArray7[local24] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt668 < arg0.anInt668) {
			return -1;
		} else if (arg0.anInt668 < this.anInt668) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)J")
	private long method455() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt668; local7++) {
			local5 = (local5 << 5) + (long) (this.aByteArray7[local7] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)I")
	public int method456() {
		@Pc(5) int local5 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt668; local14++) {
			local5 = (local5 << 5) + (this.aByteArray7[local14] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)Lclient!ec;")
	public Class22 method457() {
		@Pc(9) Class22 local9 = new Class22();
		local9.anInt668 = this.anInt668;
		local9.aByteArray7 = new byte[this.anInt668];
		for (@Pc(27) int local27 = 0; local27 < this.anInt668; local27++) {
			local9.aByteArray7[local27] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ec;II)I")
	private int method458(@OriginalArg(0) Class22 arg0) {
		@Pc(5) int[] local5 = new int[arg0.anInt668];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg0.anInt668];
		for (@Pc(26) int local26 = 0; local26 < local12.length; local26++) {
			local12[local26] = arg0.anInt668;
		}
		for (@Pc(40) int local40 = 1; local40 <= arg0.anInt668; local40++) {
			local5[local40 - 1] = (arg0.anInt668 << 1) - local40;
			local12[arg0.aByteArray7[local40 - 1] & 0xFF] = arg0.anInt668 - local40;
		}
		@Pc(79) int local79 = arg0.anInt668 + 1;
		for (@Pc(82) int local82 = arg0.anInt668; local82 > 0; local82--) {
			local16[local82 - 1] = local79;
			while (arg0.anInt668 >= local79 && arg0.aByteArray7[local79 - 1] != arg0.aByteArray7[local82 - 1]) {
				if (local5[local79 - 1] >= arg0.anInt668 - local82) {
					local5[local79 - 1] = arg0.anInt668 - local82;
				}
				local79 = local16[local79 - 1];
			}
			local79--;
		}
		@Pc(150) int local150 = local79;
		@Pc(152) int local152 = 0;
		@Pc(154) int local154 = 1;
		local79 = arg0.anInt668 + 1 - local79;
		@Pc(164) int local164 = 1;
		while (local79 >= local164) {
			local16[local164 - 1] = local152;
			while (local152 >= 1 && arg0.aByteArray7[local152 - 1] != arg0.aByteArray7[local164 - 1]) {
				local152 = local16[local152 - 1];
			}
			local164++;
			local152++;
		}
		@Pc(207) int local207;
		while (arg0.anInt668 > local150) {
			for (local207 = local154; local207 <= local150; local207++) {
				if (arg0.anInt668 + local150 - local207 <= local5[local207 - 1]) {
					local5[local207 - 1] = local150 + arg0.anInt668 - local207;
				}
			}
			local154 = local150 + 1;
			local150 = local79 + local150 - local16[local79 + -1];
			local79 = local16[local79 - 1];
		}
		@Pc(284) int local284;
		for (local207 = arg0.anInt668 - 1; local207 < this.anInt668; local207 += Math.max(local12[this.aByteArray7[local207] & 0xFF], local5[local284])) {
			for (local284 = arg0.anInt668 - 1; local284 >= 0 && arg0.aByteArray7[local284] == this.aByteArray7[local207]; local284--) {
				local207--;
			}
			if (local284 == -1) {
				return local207 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)I")
	private int method459(@OriginalArg(1) int arg0) {
		@Pc(8) byte local8 = (byte) arg0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt668; local15++) {
			if (this.aByteArray7[local15] == local8) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ec", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method456();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
	public int method461(@OriginalArg(1) FontMetrics arg0) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray7, 0, this.anInt668, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray7, 0, this.anInt668);
		}
		return arg0.stringWidth(local9);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public void method462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray7, 0, this.anInt668, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray7, 0, this.anInt668);
		}
		arg2.drawString(local13, arg0, arg1);
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)Lclient!ec;")
	public Class22 method463() {
		@Pc(14) long local14 = this.method455();
		@Pc(23) Class local23 = ec.class;
		synchronized (ec.class) {
			@Pc(39) Class4_Sub10 local39;
			if (Static132.aClass81_15 == null) {
				Static132.aClass81_15 = new Class81(4096);
			} else {
				for (local39 = (Class4_Sub10) Static132.aClass81_15.method2010(local14); local39 != null; local39 = (Class4_Sub10) Static132.aClass81_15.method2016()) {
					if (this.method481(local39.aClass22_236)) {
						return local39.aClass22_236;
					}
				}
			}
			local39 = new Class4_Sub10();
			this.aBoolean65 = false;
			local39.aClass22_236 = this;
			Static132.aClass81_15.method2015(local14, local39);
			return this;
		}
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)[B")
	public byte[] method464() {
		@Pc(12) byte[] local12 = new byte[this.anInt668];
		Static139.method952(this.aByteArray7, 0, local12, 0, this.anInt668);
		return local12;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZI)I")
	public int method465(@OriginalArg(1) int arg0) {
		@Pc(15) boolean local15 = false;
		@Pc(21) int local21 = 0;
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < this.anInt668; local25++) {
			@Pc(34) int local34 = this.aByteArray7[local25] & 0xFF;
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
				throw new NumberFormatException();
			}
			if (local34 >= arg0) {
				throw new NumberFormatException();
			}
			if (local15) {
				local34 = -local34;
			}
			@Pc(99) int local99 = local34 + local21 * arg0;
			if (local99 / arg0 != local21) {
				throw new NumberFormatException();
			}
			local21 = local99;
			local23 = true;
		}
		if (!local23) {
			throw new NumberFormatException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)Lclient!ec;")
	public Class22 method467() {
		@Pc(5) Class22 local5 = new Class22();
		@Pc(12) byte local12 = 2;
		local5.anInt668 = this.anInt668;
		local5.aByteArray7 = new byte[this.anInt668];
		for (@Pc(27) int local27 = 0; local27 < this.anInt668; local27++) {
			@Pc(34) byte local34 = this.aByteArray7[local27];
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
			local5.aByteArray7[local27] = local34;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "(I)J")
	public long method468() {
		@Pc(7) long local7 = 0L;
		for (@Pc(9) int local9 = 0; this.anInt668 > local9 && local9 < 12; local9++) {
			local7 *= 37L;
			@Pc(20) byte local20 = this.aByteArray7[local9];
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

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)I")
	public int method469(@OriginalArg(1) int arg0) {
		return this.aByteArray7[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "(I)I")
	public int method470() {
		return this.method465(10);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ec;Z)Z")
	public boolean method471(@OriginalArg(0) Class22 arg0) {
		if (this.anInt668 < arg0.anInt668) {
			return false;
		}
		for (@Pc(23) int local23 = 0; local23 < arg0.anInt668; local23++) {
			if (arg0.aByteArray7[local23] != this.aByteArray7[local23]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)I")
	public int method472(@OriginalArg(0) int arg0) {
		return this.method459(arg0);
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)Lclient!ec;")
	public Class22 method473() {
		@Pc(3) Class22 local3 = new Class22();
		local3.anInt668 = this.anInt668;
		@Pc(13) boolean local13 = true;
		local3.aByteArray7 = new byte[this.anInt668];
		for (@Pc(20) int local20 = 0; local20 < this.anInt668; local20++) {
			@Pc(26) byte local26 = this.aByteArray7[local20];
			if (local26 == 95) {
				local3.aByteArray7[local20] = 32;
				local13 = true;
			} else if (local26 >= 97 && local26 <= 122 && local13) {
				local3.aByteArray7[local20] = (byte) (local26 - 32);
				local13 = false;
			} else {
				local3.aByteArray7[local20] = local26;
				local13 = false;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(ILclient!ec;)Z")
	public boolean method475(@OriginalArg(1) Class22 arg0) {
		if (this.anInt668 < arg0.anInt668) {
			return false;
		}
		@Pc(23) int local23 = this.anInt668 - arg0.anInt668;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt668; local25++) {
			if (this.aByteArray7[local23 + local25] != arg0.aByteArray7[local25]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(ILclient!ec;)I")
	public int method476(@OriginalArg(1) Class22 arg0) {
		return this.method458(arg0);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(BI)Lclient!ec;")
	public Class22 method477(@OriginalArg(1) int arg0) {
		return this.method450(arg0, this.anInt668);
	}

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "(I)Lclient!ec;")
	public Class22 method478() {
		if (!this.aBoolean65) {
			throw new IllegalArgumentException();
		}
		this.anInt621 = 0;
		if (this.aByteArray7.length != this.anInt668) {
			@Pc(27) byte[] local27 = new byte[this.anInt668];
			Static139.method952(this.aByteArray7, 0, local27, 0, this.anInt668);
			this.aByteArray7 = local27;
		}
		return this;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)Lclient!ec;")
	public Class22 method479() {
		@Pc(15) Class22 local15 = new Class22();
		local15.anInt668 = this.anInt668;
		local15.aByteArray7 = new byte[this.anInt668];
		for (@Pc(26) int local26 = 0; local26 < this.anInt668; local26++) {
			@Pc(33) byte local33 = this.aByteArray7[local26];
			if (local33 >= 65 && local33 <= 90 || local33 >= -64 && local33 <= -34 && local33 != -41) {
				local33 = (byte) (local33 + 32);
			}
			local15.aByteArray7[local26] = local33;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!ec;)Z")
	public boolean method480(@OriginalArg(1) Class22 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt668 == this.anInt668) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt668; local18++) {
				@Pc(25) byte local25 = arg0.aByteArray7[local18];
				if (local25 >= 65 && local25 <= 90 || local25 >= -64 && local25 <= -34 && local25 != -41) {
					local25 = (byte) (local25 + 32);
				}
				@Pc(54) byte local54 = this.aByteArray7[local18];
				if (local54 >= 65 && local54 <= 90 || local54 >= -64 && local54 <= -34 && local54 != -41) {
					local54 = (byte) (local54 + 32);
				}
				if (local25 != local54) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZLclient!ec;)Z")
	public boolean method481(@OriginalArg(1) Class22 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt668 == this.anInt668) {
			if (!this.aBoolean65 || !arg0.aBoolean65) {
				if (this.anInt621 == 0) {
					this.anInt621 = this.method456();
					if (this.anInt621 == 0) {
						this.anInt621 = 1;
					}
				}
				if (arg0.anInt621 == 0) {
					arg0.anInt621 = arg0.method456();
					if (arg0.anInt621 == 0) {
						arg0.anInt621 = 1;
					}
				}
				if (this.anInt621 != arg0.anInt621) {
					return false;
				}
			}
			for (@Pc(74) int local74 = 0; local74 < this.anInt668; local74++) {
				if (arg0.aByteArray7[local74] != this.aByteArray7[local74]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(II)Lclient!ec;")
	public Class22 method482(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean65) {
			this.anInt621 = 0;
			if (this.anInt668 == this.aByteArray7.length) {
				@Pc(48) int local48;
				for (local48 = 1; local48 <= this.anInt668; local48 += local48) {
				}
				@Pc(65) byte[] local65 = new byte[local48];
				Static139.method952(this.aByteArray7, 0, local65, 0, this.anInt668);
				this.aByteArray7 = local65;
			}
			this.aByteArray7[this.anInt668++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(B)Z")
	public boolean method483() {
		return this.method445();
	}

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "(I)Lclient!ec;")
	public Class22 method484() {
		@Pc(1) int local1;
		for (local1 = 0; this.anInt668 > local1 && (this.aByteArray7[local1] >= 0 && this.aByteArray7[local1] <= 32 || (this.aByteArray7[local1] & 0xFF) == 160); local1++) {
		}
		@Pc(47) int local47;
		for (local47 = this.anInt668; local1 < local47 && (this.aByteArray7[local47 - 1] >= 0 && this.aByteArray7[local47 - 1] <= 32 || (this.aByteArray7[local47 - 1] & 0xFF) == 160); local47--) {
		}
		if (local1 == 0 && local47 == this.anInt668) {
			return this;
		}
		@Pc(95) Class22 local95 = new Class22();
		local95.anInt668 = local47 - local1;
		local95.aByteArray7 = new byte[local95.anInt668];
		for (@Pc(108) int local108 = 0; local108 < local95.anInt668; local108++) {
			local95.aByteArray7[local108] = this.aByteArray7[local108 + local1];
		}
		return local95;
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(II)Lclient!ec;")
	public Class22 method486(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(24) Class22 local24 = new Class22();
		local24.aByteArray7 = new byte[this.anInt668 + 1];
		local24.anInt668 = this.anInt668 + 1;
		Static139.method952(this.aByteArray7, 0, local24.aByteArray7, 0, this.anInt668);
		local24.aByteArray7[this.anInt668] = (byte) arg0;
		return local24;
	}

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "(I)Ljava/net/URL;")
	public URL method487() throws MalformedURLException {
		return new URL(new String(this.aByteArray7, 0, this.anInt668));
	}
}
