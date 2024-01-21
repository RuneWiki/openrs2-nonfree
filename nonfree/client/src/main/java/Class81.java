import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class81 implements Interface2 {

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
	private int anInt3670;

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
	public int anInt3691;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "Z")
	private boolean aBoolean154 = true;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)I")
	public int method2792() {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt3691; local12++) {
			local10 = (this.aByteArray41[local12] & 0xFF) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)Z")
	public boolean method2793() {
		return this.method2805();
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)J")
	private long method2794() {
		@Pc(5) long local5 = 0L;
		for (@Pc(12) int local12 = 0; local12 < this.anInt3691; local12++) {
			local5 = (local5 << 5) + (long) (this.aByteArray41[local12] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)I")
	public int method2795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) byte local16 = (byte) arg0;
		for (@Pc(18) int local18 = arg1; local18 < this.anInt3691; local18++) {
			if (local16 == this.aByteArray41[local18]) {
				return local18;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLclient!tg;)Z")
	public boolean method2796(@OriginalArg(1) Class81 arg0) {
		if (arg0.anInt3691 > this.anInt3691) {
			return false;
		}
		for (@Pc(24) int local24 = 0; local24 < arg0.anInt3691; local24++) {
			if (this.aByteArray41[local24] != arg0.aByteArray41[local24]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)Lclient!tg;")
	public Class81 method2797() {
		@Pc(7) long local7 = this.method2794();
		@Pc(24) Class local24 = tg.class;
		synchronized (tg.class) {
			@Pc(34) Class1_Sub20 local34;
			if (Static26.aClass5_4 == null) {
				Static26.aClass5_4 = new Class5(4096);
			} else {
				for (local34 = (Class1_Sub20) Static26.aClass5_4.method134(local7); local34 != null; local34 = (Class1_Sub20) Static26.aClass5_4.method135()) {
					if (this.method2800(local34.aClass81_1074)) {
						return local34.aClass81_1074;
					}
				}
			}
			local34 = new Class1_Sub20();
			local34.aClass81_1074 = this;
			this.aBoolean154 = false;
			Static26.aClass5_4.method138(local34, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!tg;B)Z")
	public boolean method2798(@OriginalArg(0) Class81 arg0) {
		if (this.anInt3691 < arg0.anInt3691) {
			return false;
		}
		@Pc(19) int local19 = this.anInt3691 - arg0.anInt3691;
		for (@Pc(26) int local26 = 0; local26 < arg0.anInt3691; local26++) {
			if (this.aByteArray41[local26 + local19] != arg0.aByteArray41[local26]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tg", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method2792();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)Lclient!tg;")
	public Class81 method2799() {
		@Pc(7) Class81 local7 = Static106.method1751(this.method2821());
		return local7 == null ? Static33.aClass81_311 : local7;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(Lclient!tg;B)Z")
	public boolean method2800(@OriginalArg(0) Class81 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt3691 == arg0.anInt3691) {
			if (!this.aBoolean154 || !arg0.aBoolean154) {
				if (this.anInt3670 == 0) {
					this.anInt3670 = this.method2792();
					if (this.anInt3670 == 0) {
						this.anInt3670 = 1;
					}
				}
				if (arg0.anInt3670 == 0) {
					arg0.anInt3670 = arg0.method2792();
					if (arg0.anInt3670 == 0) {
						arg0.anInt3670 = 1;
					}
				}
				if (this.anInt3670 != arg0.anInt3670) {
					return false;
				}
			}
			for (@Pc(78) int local78 = 0; local78 < this.anInt3691; local78++) {
				if (this.aByteArray41[local78] != arg0.aByteArray41[local78]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Lclient!tg;")
	public Class81 method2801(@OriginalArg(1) int arg0) {
		return this.method2823(arg0, this.anInt3691);
	}

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "(B)Lclient!tg;")
	public Class81 method2802() {
		@Pc(9) Class81 local9 = new Class81();
		local9.anInt3691 = this.anInt3691;
		local9.aByteArray41 = new byte[this.anInt3691];
		for (@Pc(25) int local25 = 0; local25 < this.anInt3691; local25++) {
			@Pc(32) byte local32 = this.aByteArray41[local25];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local9.aByteArray41[local25] = local32;
		}
		return local9;
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(Lclient!tg;B)I")
	public int method2803(@OriginalArg(0) Class81 arg0) {
		return this.method2806(arg0, 0);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I")
	public int method2804(@OriginalArg(1) FontMetrics arg0) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray41, 0, this.anInt3691, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray41, 0, this.anInt3691);
		}
		return arg0.stringWidth(local18);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)Z")
	private boolean method2805() {
		@Pc(7) boolean local7 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt3691; local31++) {
			@Pc(40) int local40 = this.aByteArray41[local31] & 0xFF;
			if (local31 == 0) {
				if (local40 == 45) {
					local7 = true;
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
				return false;
			}
			if (local40 >= 10) {
				return false;
			}
			if (local7) {
				local40 = -local40;
			}
			@Pc(119) int local119 = local21 * 10 + local40;
			if (local21 != local119 / 10) {
				return false;
			}
			local19 = true;
			local21 = local119;
		}
		return local19;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!tg;I)I")
	public int method2806(@OriginalArg(1) Class81 arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int[] local5 = new int[arg0.anInt3691];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg0.anInt3691];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg0.anInt3691;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg0.anInt3691; local36++) {
			local5[local36 - 1] = (arg0.anInt3691 << 1) - local36;
			local12[arg0.aByteArray41[local36 - 1] & 0xFF] = arg0.anInt3691 - local36;
		}
		@Pc(77) int local77 = arg0.anInt3691 + 1;
		@Pc(80) int local80 = arg0.anInt3691;
		while (local80 > 0) {
			local16[local80 - 1] = local77;
			while (local77 <= arg0.anInt3691 && arg0.aByteArray41[local80 - 1] != arg0.aByteArray41[local77 - 1]) {
				if (local5[local77 - 1] >= arg0.anInt3691 - local80) {
					local5[local77 - 1] = arg0.anInt3691 - local80;
				}
				local77 = local16[local77 - 1];
			}
			local80--;
			local77--;
		}
		@Pc(151) int local151 = 1;
		@Pc(153) int local153 = 0;
		@Pc(155) int local155 = local77;
		local77 = arg0.anInt3691 + 1 - local77;
		for (@Pc(165) int local165 = 1; local165 <= local77; local165++) {
			local16[local165 - 1] = local153;
			while (local153 >= 1 && arg0.aByteArray41[local165 - 1] != arg0.aByteArray41[local153 - 1]) {
				local153 = local16[local153 - 1];
			}
			local153++;
		}
		@Pc(212) int local212;
		while (local155 < arg0.anInt3691) {
			for (local212 = local151; local212 <= local155; local212++) {
				if (local5[local212 - 1] >= local155 + arg0.anInt3691 - local212) {
					local5[local212 - 1] = local155 + arg0.anInt3691 - local212;
				}
			}
			local151 = local155 + 1;
			local155 = local155 + local77 - local16[local77 - 1];
			local77 = local16[local77 - 1];
		}
		@Pc(292) int local292;
		for (local212 = arg0.anInt3691 + arg1 - 1; local212 < this.anInt3691; local212 += Math.max(local12[this.aByteArray41[local212] & 0xFF], local5[local292])) {
			for (local292 = arg0.anInt3691 - 1; local292 >= 0 && arg0.aByteArray41[local292] == this.aByteArray41[local212]; local292--) {
				local212--;
			}
			if (local292 == -1) {
				return local212 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "(B)I")
	public int method2807() {
		return this.method2812(10);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)Lclient!tg;")
	public Class81 method2808() {
		@Pc(3) boolean local3 = true;
		@Pc(7) Class81 local7 = new Class81();
		local7.anInt3691 = this.anInt3691;
		local7.aByteArray41 = new byte[this.anInt3691];
		for (@Pc(22) int local22 = 0; local22 < this.anInt3691; local22++) {
			@Pc(29) byte local29 = this.aByteArray41[local22];
			if (local29 == 95) {
				local7.aByteArray41[local22] = 32;
				local3 = true;
			} else if (local29 >= 97 && local29 <= 122 && local3) {
				local7.aByteArray41[local22] = (byte) (local29 - 32);
				local3 = false;
			} else {
				local3 = false;
				local7.aByteArray41[local22] = local29;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)Lclient!tg;")
	public Class81 method2809() {
		@Pc(3) int local3;
		for (local3 = 0; this.anInt3691 > local3 && (this.aByteArray41[local3] >= 0 && this.aByteArray41[local3] <= 32 || (this.aByteArray41[local3] & 0xFF) == 160); local3++) {
		}
		@Pc(34) int local34;
		for (local34 = this.anInt3691; local3 < local34 && (this.aByteArray41[local34 - 1] >= 0 && this.aByteArray41[local34 - 1] <= 32 || (this.aByteArray41[local34 - 1] & 0xFF) == 160); local34--) {
		}
		if (local3 == 0 && this.anInt3691 == local34) {
			return this;
		}
		@Pc(92) Class81 local92 = new Class81();
		local92.anInt3691 = local34 - local3;
		local92.aByteArray41 = new byte[local92.anInt3691];
		for (@Pc(105) int local105 = 0; local105 < local92.anInt3691; local105++) {
			local92.aByteArray41[local105] = this.aByteArray41[local3 + local105];
		}
		return local92;
	}

	@OriginalMember(owner = "client!tg", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class81)) {
			throw new IllegalArgumentException();
		}
		return this.method2800((Class81) arg0);
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(BLclient!tg;)I")
	public int method2810(@OriginalArg(1) Class81 arg0) {
		@Pc(13) int local13;
		if (this.anInt3691 <= arg0.anInt3691) {
			local13 = this.anInt3691;
		} else {
			local13 = arg0.anInt3691;
		}
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			if (Static119.anIntArray282[arg0.aByteArray41[local20] & 0xFF] > Static119.anIntArray282[this.aByteArray41[local20] & 0xFF]) {
				return -1;
			}
			if (Static119.anIntArray282[arg0.aByteArray41[local20] & 0xFF] < Static119.anIntArray282[this.aByteArray41[local20] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt3691 < arg0.anInt3691) {
			return -1;
		} else if (this.anInt3691 > arg0.anInt3691) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!tg;I)Z")
	public boolean method2811(@OriginalArg(0) Class81 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt3691 == arg0.anInt3691) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt3691; local23++) {
				@Pc(30) byte local30 = this.aByteArray41[local23];
				if (local30 >= 65 && local30 <= 90 || local30 >= -64 && local30 <= -34 && local30 != -41) {
					local30 = (byte) (local30 + 32);
				}
				@Pc(63) byte local63 = arg0.aByteArray41[local23];
				if (local63 >= 65 && local63 <= 90 || local63 >= -64 && local63 <= -34 && local63 != -41) {
					local63 = (byte) (local63 + 32);
				}
				if (local63 != local30) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(BI)I")
	public int method2812(@OriginalArg(1) int arg0) {
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt3691; local23++) {
			@Pc(32) int local32 = this.aByteArray41[local23] & 0xFF;
			if (local23 == 0) {
				if (local32 == 45) {
					local13 = true;
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
			if (arg0 <= local32) {
				throw new NumberFormatException();
			}
			if (local13) {
				local32 = -local32;
			}
			@Pc(100) int local100 = local21 * arg0 + local32;
			if (local100 / arg0 != local21) {
				throw new NumberFormatException();
			}
			local15 = true;
			local21 = local100;
		}
		if (!local15) {
			throw new NumberFormatException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)Lclient!tg;")
	public Class81 method2813() {
		@Pc(9) Class81 local9 = new Class81();
		@Pc(11) byte local11 = 2;
		local9.anInt3691 = this.anInt3691;
		local9.aByteArray41 = new byte[this.anInt3691];
		for (@Pc(30) int local30 = 0; local30 < this.anInt3691; local30++) {
			@Pc(37) byte local37 = this.aByteArray41[local30];
			if (local37 >= 97 && local37 <= 122 || !(local37 < -32 || local37 > -2 || local37 == -9)) {
				if (local11 == 2) {
					local37 = (byte) (local37 - 32);
				}
				local11 = 0;
			} else if (local37 >= 65 && local37 <= 90 || !(local37 < -64 || local37 > -34 || local37 == -41)) {
				if (local11 == 0) {
					local37 = (byte) (local37 + 32);
				}
				local11 = 0;
			} else if (local37 == 46 || local37 == 33 || local37 == 63) {
				local11 = 2;
			} else if (local37 != 32) {
				local11 = 1;
			} else if (local11 != 2) {
				local11 = 1;
			}
			local9.aByteArray41[local30] = local37;
		}
		return local9;
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(BLclient!tg;)Lclient!tg;")
	public Class81 method2814(@OriginalArg(1) Class81 arg0) {
		if (!this.aBoolean154) {
			throw new IllegalArgumentException();
		}
		this.anInt3670 = 0;
		if (arg0.anInt3691 + this.anInt3691 > this.aByteArray41.length) {
			@Pc(30) int local30;
			for (local30 = 1; local30 < arg0.anInt3691 + this.anInt3691; local30 += local30) {
			}
			@Pc(46) byte[] local46 = new byte[local30];
			Static190.method1388(this.aByteArray41, 0, local46, 0, this.anInt3691);
			this.aByteArray41 = local46;
		}
		Static190.method1388(arg0.aByteArray41, 0, this.aByteArray41, this.anInt3691, arg0.anInt3691);
		this.anInt3691 += arg0.anInt3691;
		return this;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IBII[B)I")
	public int method2815(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2) {
		Static190.method1388(this.aByteArray41, 0, arg2, arg0, arg1);
		return arg1;
	}

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "(B)Lclient!tg;")
	public Class81 method2817() {
		@Pc(10) Class81 local10 = new Class81();
		local10.anInt3691 = this.anInt3691;
		local10.aByteArray41 = new byte[this.anInt3691];
		for (@Pc(25) int local25 = 0; local25 < this.anInt3691; local25++) {
			local10.aByteArray41[local25] = 42;
		}
		return local10;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)Lclient!tg;")
	public Class81 method2818(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean154) {
			this.anInt3670 = 0;
			if (this.anInt3691 == this.aByteArray41.length) {
				@Pc(40) int local40;
				for (local40 = 1; local40 <= this.anInt3691; local40 += local40) {
				}
				@Pc(57) byte[] local57 = new byte[local40];
				Static190.method1388(this.aByteArray41, 0, local57, 0, this.anInt3691);
				this.aByteArray41 = local57;
			}
			this.aByteArray41[this.anInt3691++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public void method2819(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray41, 0, this.anInt3691, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray41, 0, this.anInt3691);
		}
		arg0.drawString(local9, arg2, arg1);
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(Z)I")
	public int method2820() {
		return this.anInt3691;
	}

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)J")
	public long method2821() {
		@Pc(7) long local7 = 0L;
		for (@Pc(9) int local9 = 0; this.anInt3691 > local9 && local9 < 12; local9++) {
			local7 *= 37L;
			@Pc(20) byte local20 = this.aByteArray41[local9];
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

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(Z)Ljava/net/URL;")
	public URL method2822() throws MalformedURLException {
		return new URL(new String(this.aByteArray41, 0, this.anInt3691));
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(III)Lclient!tg;")
	public Class81 method2823(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class81 local7 = new Class81();
		local7.aByteArray41 = new byte[arg1 - arg0];
		local7.anInt3691 = arg1 - arg0;
		Static190.method1388(this.aByteArray41, arg0, local7.aByteArray41, 0, local7.anInt3691);
		return local7;
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(II)Lclient!tg;")
	public Class81 method2824(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(26) Class81 local26 = new Class81();
		local26.aByteArray41 = new byte[this.anInt3691 + 1];
		local26.anInt3691 = this.anInt3691 + 1;
		Static190.method1388(this.aByteArray41, 0, local26.aByteArray41, 0, this.anInt3691);
		local26.aByteArray41[this.anInt3691] = (byte) arg0;
		return local26;
	}

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)Lclient!tg;")
	public Class81 method2825() {
		if (!this.aBoolean154) {
			throw new IllegalArgumentException();
		}
		this.anInt3670 = 0;
		if (this.anInt3691 != this.aByteArray41.length) {
			@Pc(30) byte[] local30 = new byte[this.anInt3691];
			Static190.method1388(this.aByteArray41, 0, local30, 0, this.anInt3691);
			this.aByteArray41 = local30;
		}
		return this;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZ)I")
	public int method2826(@OriginalArg(0) int arg0) {
		return this.aByteArray41[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!tg;)I")
	public int method2827(@OriginalArg(1) Class81 arg0) {
		@Pc(13) int local13;
		if (arg0.anInt3691 >= this.anInt3691) {
			local13 = this.anInt3691;
		} else {
			local13 = arg0.anInt3691;
		}
		for (@Pc(25) int local25 = 0; local25 < local13; local25++) {
			if ((this.aByteArray41[local25] & 0xFF) < (arg0.aByteArray41[local25] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray41[local25] & 0xFF) > (arg0.aByteArray41[local25] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt3691 < arg0.anInt3691) {
			return -1;
		} else if (arg0.anInt3691 < this.anInt3691) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)[B")
	public byte[] method2828() {
		@Pc(15) byte[] local15 = new byte[this.anInt3691];
		Static190.method1388(this.aByteArray41, 0, local15, 0, this.anInt3691);
		return local15;
	}
}
