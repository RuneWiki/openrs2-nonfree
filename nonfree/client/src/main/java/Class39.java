import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class39 implements Interface2 {

	@OriginalMember(owner = "client!ja", name = "w", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
	private int anInt1458;

	@OriginalMember(owner = "client!ja", name = "fb", descriptor = "I")
	public int anInt1481;

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "Z")
	private boolean aBoolean80 = true;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)Lclient!ja;")
	public Class39 method930() {
		if (!this.aBoolean80) {
			throw new IllegalArgumentException();
		}
		this.anInt1458 = 0;
		if (this.anInt1481 != this.aByteArray10.length) {
			@Pc(23) byte[] local23 = new byte[this.anInt1481];
			Static134.method1168(this.aByteArray10, 0, local23, 0, this.anInt1481);
			this.aByteArray10 = local23;
		}
		return this;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!ja;Z)Z")
	public boolean method931(@OriginalArg(0) Class39 arg0) {
		if (arg0.anInt1481 > this.anInt1481) {
			return false;
		}
		@Pc(23) int local23 = this.anInt1481 - arg0.anInt1481;
		for (@Pc(31) int local31 = 0; local31 < arg0.anInt1481; local31++) {
			if (this.aByteArray10[local23 + local31] != arg0.aByteArray10[local31]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)I")
	public int method932() {
		return this.method969(10);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lclient!ja;")
	public Class39 method933(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(20) Class39 local20 = new Class39();
		local20.aByteArray10 = new byte[this.anInt1481 + 1];
		local20.anInt1481 = this.anInt1481 + 1;
		Static134.method1168(this.aByteArray10, 0, local20.aByteArray10, 0, this.anInt1481);
		local20.aByteArray10[this.anInt1481] = (byte) arg0;
		return local20;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)I")
	public int method934(@OriginalArg(0) int arg0) {
		return this.method940(arg0);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[BB)I")
	public int method935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		Static134.method1168(this.aByteArray10, 0, arg2, arg1, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public void method936(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(21) String local21;
		try {
			local21 = new String(this.aByteArray10, 0, this.anInt1481, "ISO-8859-1");
		} catch (@Pc(23) UnsupportedEncodingException local23) {
			local21 = new String(this.aByteArray10, 0, this.anInt1481);
		}
		arg0.drawString(local21, arg2, arg1);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)Lclient!ja;")
	public Class39 method937() {
		@Pc(9) Class39 local9 = new Class39();
		local9.aByteArray10 = new byte[12];
		local9.anInt1481 = 0;
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.anInt1481; local20++) {
			if (this.aByteArray10[local20] >= 65 && this.aByteArray10[local20] <= 90) {
				local9.aByteArray10[local18++] = (byte) (this.aByteArray10[local20] + 97 - 65);
				local9.anInt1481 = local18;
			} else if (this.aByteArray10[local20] >= 97 && this.aByteArray10[local20] <= 122 || this.aByteArray10[local20] >= 48 && this.aByteArray10[local20] <= 57) {
				local9.aByteArray10[local18++] = this.aByteArray10[local20];
				local9.anInt1481 = local18;
			} else if (local18 > 0) {
				local9.aByteArray10[local18++] = 95;
			}
			if (local18 == 12) {
				break;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBI)Lclient!ja;")
	public Class39 method938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class39 local3 = new Class39();
		local3.aByteArray10 = new byte[arg0 - arg1];
		local3.anInt1481 = arg0 - arg1;
		Static134.method1168(this.aByteArray10, arg1, local3.aByteArray10, 0, local3.anInt1481);
		return local3;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)I")
	public int method939(@OriginalArg(1) int arg0) {
		return this.aByteArray10[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZI)I")
	private int method940(@OriginalArg(2) int arg0) {
		@Pc(4) byte local4 = (byte) arg0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1481; local15++) {
			if (local4 == this.aByteArray10[local15]) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)J")
	public long method941() {
		@Pc(3) long local3 = 0L;
		for (@Pc(9) int local9 = 0; this.anInt1481 > local9 && local9 < 12; local9++) {
			local3 *= 37L;
			@Pc(20) byte local20 = this.aByteArray10[local9];
			if (local20 >= 65 && local20 <= 90) {
				local3 += local20 + 1 - 65;
			} else if (local20 >= 97 && local20 <= 122) {
				local3 += local20 + 1 - 97;
			} else if (local20 >= 48 && local20 <= 57) {
				local3 += local20 + 27 - 48;
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)Lclient!ja;")
	public Class39 method942() {
		@Pc(9) Class39 local9 = new Class39();
		local9.anInt1481 = this.anInt1481;
		local9.aByteArray10 = new byte[this.anInt1481];
		@Pc(20) byte local20 = 2;
		for (@Pc(27) int local27 = 0; local27 < this.anInt1481; local27++) {
			@Pc(34) byte local34 = this.aByteArray10[local27];
			if (local34 >= 97 && local34 <= 122 || !(local34 < -32 || local34 > -2 || local34 == -9)) {
				if (local20 == 2) {
					local34 = (byte) (local34 - 32);
				}
				local20 = 0;
			} else if (local34 >= 65 && local34 <= 90 || !(local34 < -64 || local34 > -34 || local34 == -41)) {
				if (local20 == 0) {
					local34 = (byte) (local34 + 32);
				}
				local20 = 0;
			} else if (local34 == 46 || local34 == 33 || local34 == 63) {
				local20 = 2;
			} else if (local34 != 32) {
				local20 = 1;
			} else if (local20 != 2) {
				local20 = 1;
			}
			local9.aByteArray10[local27] = local34;
		}
		return local9;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!ja;B)Z")
	public boolean method943(@OriginalArg(0) Class39 arg0) {
		if (this.anInt1481 < arg0.anInt1481) {
			return false;
		}
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt1481; local21++) {
			if (arg0.aByteArray10[local21] != this.aByteArray10[local21]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!ja;I)Lclient!ja;")
	public Class39 method944(@OriginalArg(0) Class39 arg0) {
		if (!this.aBoolean80) {
			throw new IllegalArgumentException();
		}
		this.anInt1458 = 0;
		if (this.aByteArray10.length < this.anInt1481 + arg0.anInt1481) {
			@Pc(32) int local32;
			for (local32 = 1; local32 < arg0.anInt1481 + this.anInt1481; local32 += local32) {
			}
			@Pc(52) byte[] local52 = new byte[local32];
			Static134.method1168(this.aByteArray10, 0, local52, 0, this.anInt1481);
			this.aByteArray10 = local52;
		}
		Static134.method1168(arg0.aByteArray10, 0, this.aByteArray10, this.anInt1481, arg0.anInt1481);
		this.anInt1481 += arg0.anInt1481;
		return this;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(Lclient!ja;I)I")
	public int method945(@OriginalArg(0) Class39 arg0) {
		@Pc(13) int local13;
		if (this.anInt1481 > arg0.anInt1481) {
			local13 = arg0.anInt1481;
		} else {
			local13 = this.anInt1481;
		}
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			if (Static58.anIntArray158[arg0.aByteArray10[local20] & 0xFF] > Static58.anIntArray158[this.aByteArray10[local20] & 0xFF]) {
				return -1;
			}
			if (Static58.anIntArray158[arg0.aByteArray10[local20] & 0xFF] < Static58.anIntArray158[this.aByteArray10[local20] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt1481 < arg0.anInt1481) {
			return -1;
		} else if (this.anInt1481 > arg0.anInt1481) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)Lclient!ja;")
	public Class39 method946(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean80) {
			this.anInt1458 = 0;
			if (this.anInt1481 == this.aByteArray10.length) {
				@Pc(43) int local43;
				for (local43 = 1; local43 <= this.anInt1481; local43 += local43) {
				}
				@Pc(60) byte[] local60 = new byte[local43];
				Static134.method1168(this.aByteArray10, 0, local60, 0, this.anInt1481);
				this.aByteArray10 = local60;
			}
			this.aByteArray10[this.anInt1481++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)Ljava/net/URL;")
	public URL method947() throws MalformedURLException {
		return new URL(new String(this.aByteArray10, 0, this.anInt1481));
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)Lclient!ja;")
	public Class39 method948() {
		@Pc(7) long local7 = this.method959();
		@Pc(16) Class local16 = ja.class;
		synchronized (ja.class) {
			@Pc(32) Class4_Sub3 local32;
			if (Static78.aClass42_8 == null) {
				Static78.aClass42_8 = new Class42(4096);
			} else {
				for (local32 = (Class4_Sub3) Static78.aClass42_8.method1055(local7); local32 != null; local32 = (Class4_Sub3) Static78.aClass42_8.method1052()) {
					if (this.method968(local32.aClass39_267)) {
						return local32.aClass39_267;
					}
				}
			}
			local32 = new Class4_Sub3();
			this.aBoolean80 = false;
			local32.aClass39_267 = this;
			Static78.aClass42_8.method1056(local32, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)Lclient!ja;")
	public Class39 method950() {
		@Pc(7) Class39 local7 = new Class39();
		local7.anInt1481 = this.anInt1481;
		local7.aByteArray10 = new byte[this.anInt1481];
		for (@Pc(23) int local23 = 0; local23 < this.anInt1481; local23++) {
			@Pc(29) byte local29 = this.aByteArray10[local23];
			if (local29 >= 65 && local29 <= 90 || local29 >= -64 && local29 <= -34 && local29 != -41) {
				local29 = (byte) (local29 + 32);
			}
			local7.aByteArray10[local23] = local29;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)Lclient!ja;")
	public Class39 method951() {
		@Pc(9) Class39 local9 = new Class39();
		local9.anInt1481 = this.anInt1481;
		local9.aByteArray10 = new byte[this.anInt1481];
		for (@Pc(29) int local29 = 0; local29 < this.anInt1481; local29++) {
			local9.aByteArray10[local29] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(B)Z")
	public boolean method952() {
		return this.method961();
	}

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "(B)I")
	public int method953() {
		return this.anInt1481;
	}

	@OriginalMember(owner = "client!ja", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class39)) {
			throw new IllegalArgumentException();
		}
		return this.method968((Class39) arg0);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!ja;)Z")
	public boolean method954(@OriginalArg(1) Class39 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt1481 == this.anInt1481) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt1481; local16++) {
				@Pc(28) byte local28 = arg0.aByteArray10[local16];
				@Pc(33) byte local33 = this.aByteArray10[local16];
				if (local33 >= 65 && local33 <= 90 || local33 >= -64 && local33 <= -34 && local33 != -41) {
					local33 = (byte) (local33 + 32);
				}
				if (local28 >= 65 && local28 <= 90 || local28 >= -64 && local28 <= -34 && local28 != -41) {
					local28 = (byte) (local28 + 32);
				}
				if (local28 != local33) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ja", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!ja", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method967();
	}

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)Lclient!ja;")
	public Class39 method955() {
		@Pc(7) boolean local7 = true;
		@Pc(16) Class39 local16 = new Class39();
		local16.anInt1481 = this.anInt1481;
		local16.aByteArray10 = new byte[this.anInt1481];
		for (@Pc(27) int local27 = 0; local27 < this.anInt1481; local27++) {
			@Pc(34) byte local34 = this.aByteArray10[local27];
			if (local34 == 95) {
				local7 = true;
				local16.aByteArray10[local27] = 32;
			} else if (local34 >= 97 && local34 <= 122 && local7) {
				local16.aByteArray10[local27] = (byte) (local34 - 32);
				local7 = false;
			} else {
				local7 = false;
				local16.aByteArray10[local27] = local34;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILclient!ja;)I")
	private int method956(@OriginalArg(2) Class39 arg0) {
		@Pc(9) int[] local9 = new int[arg0.anInt1481];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg0.anInt1481];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg0.anInt1481;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg0.anInt1481; local36++) {
			local9[local36 - 1] = (arg0.anInt1481 << 1) - local36;
			local12[arg0.aByteArray10[local36 - 1] & 0xFF] = arg0.anInt1481 - local36;
		}
		@Pc(74) int local74 = arg0.anInt1481 + 1;
		for (@Pc(77) int local77 = arg0.anInt1481; local77 > 0; local77--) {
			local16[local77 - 1] = local74;
			while (local74 <= arg0.anInt1481 && arg0.aByteArray10[local74 - 1] != arg0.aByteArray10[local77 - 1]) {
				if (local9[local74 - 1] >= arg0.anInt1481 - local77) {
					local9[local74 - 1] = arg0.anInt1481 - local77;
				}
				local74 = local16[local74 - 1];
			}
			local74--;
		}
		@Pc(147) int local147 = 1;
		@Pc(149) int local149 = local74;
		@Pc(151) int local151 = 0;
		local74 = arg0.anInt1481 + 1 - local74;
		@Pc(161) int local161 = 1;
		while (local161 <= local74) {
			local16[local161 - 1] = local151;
			while (local151 >= 1 && arg0.aByteArray10[local151 - 1] != arg0.aByteArray10[local161 - 1]) {
				local151 = local16[local151 - 1];
			}
			local161++;
			local151++;
		}
		@Pc(209) int local209;
		while (local149 < arg0.anInt1481) {
			for (local209 = local147; local209 <= local149; local209++) {
				if (arg0.anInt1481 + local149 - local209 <= local9[local209 + -1]) {
					local9[local209 - 1] = arg0.anInt1481 + local149 - local209;
				}
			}
			local147 = local149 + 1;
			local149 = local149 + local74 - local16[local74 - 1];
			local74 = local16[local74 - 1];
		}
		@Pc(291) int local291;
		for (local209 = arg0.anInt1481 - 1; local209 < this.anInt1481; local209 += Math.max(local12[this.aByteArray10[local209] & 0xFF], local9[local291])) {
			for (local291 = arg0.anInt1481 - 1; local291 >= 0 && this.aByteArray10[local209] == arg0.aByteArray10[local291]; local291--) {
				local209--;
			}
			if (local291 == -1) {
				return local209 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "(B)Lclient!ja;")
	public Class39 method957() {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = this.anInt1481;
		while (this.anInt1481 > local7 && (this.aByteArray10[local7] >= 0 && this.aByteArray10[local7] <= 32 || (this.aByteArray10[local7] & 0xFF) == 160)) {
			local7++;
		}
		while (local7 < local10 && (this.aByteArray10[local10 - 1] >= 0 && this.aByteArray10[local10 - 1] <= 32 || (this.aByteArray10[local10 - 1] & 0xFF) == 160)) {
			local10--;
		}
		if (local7 == 0 && this.anInt1481 == local10) {
			return this;
		}
		@Pc(92) Class39 local92 = new Class39();
		local92.anInt1481 = local10 - local7;
		local92.aByteArray10 = new byte[local92.anInt1481];
		for (@Pc(105) int local105 = 0; local105 < local92.anInt1481; local105++) {
			local92.aByteArray10[local105] = this.aByteArray10[local7 + local105];
		}
		return local92;
	}

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)J")
	private long method959() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1481; local7++) {
			local5 = (long) (this.aByteArray10[local7] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(Lclient!ja;B)I")
	public int method960(@OriginalArg(0) Class39 arg0) {
		return this.method956(arg0);
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(II)Z")
	private boolean method961() {
		@Pc(23) boolean local23 = false;
		@Pc(25) int local25 = 0;
		@Pc(27) boolean local27 = false;
		for (@Pc(29) int local29 = 0; local29 < this.anInt1481; local29++) {
			@Pc(37) int local37 = this.aByteArray10[local29] & 0xFF;
			if (local29 == 0) {
				if (local37 == 45) {
					local23 = true;
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
			if (local23) {
				local37 = -local37;
			}
			@Pc(97) int local97 = local25 * 10 + local37;
			if (local25 != local97 / 10) {
				return false;
			}
			local25 = local97;
			local27 = true;
		}
		return local27;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method962(@OriginalArg(0) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray10, 0, this.anInt1481, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray10, 0, this.anInt1481);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(Lclient!ja;I)I")
	public int method963(@OriginalArg(0) Class39 arg0) {
		@Pc(22) int local22;
		if (arg0.anInt1481 >= this.anInt1481) {
			local22 = this.anInt1481;
		} else {
			local22 = arg0.anInt1481;
		}
		for (@Pc(29) int local29 = 0; local29 < local22; local29++) {
			if ((this.aByteArray10[local29] & 0xFF) < (arg0.aByteArray10[local29] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray10[local29] & 0xFF) > (arg0.aByteArray10[local29] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.anInt1481 > this.anInt1481) {
			return -1;
		} else if (this.anInt1481 > arg0.anInt1481) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(BI)Lclient!ja;")
	public Class39 method964(@OriginalArg(1) int arg0) {
		return this.method938(this.anInt1481, arg0);
	}

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)[B")
	public byte[] method965() {
		@Pc(13) byte[] local13 = new byte[this.anInt1481];
		Static134.method1168(this.aByteArray10, 0, local13, 0, this.anInt1481);
		return local13;
	}

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "(B)I")
	public int method967() {
		@Pc(1) int local1 = 0;
		for (@Pc(13) int local13 = 0; local13 < this.anInt1481; local13++) {
			local1 = (local1 << 5) + (this.aByteArray10[local13] & 0xFF) - local1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(ILclient!ja;)Z")
	public boolean method968(@OriginalArg(1) Class39 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1481 == arg0.anInt1481) {
			if (!this.aBoolean80 || !arg0.aBoolean80) {
				if (this.anInt1458 == 0) {
					this.anInt1458 = this.method967();
					if (this.anInt1458 == 0) {
						this.anInt1458 = 1;
					}
				}
				if (arg0.anInt1458 == 0) {
					arg0.anInt1458 = arg0.method967();
					if (arg0.anInt1458 == 0) {
						arg0.anInt1458 = 1;
					}
				}
				if (this.anInt1458 != arg0.anInt1458) {
					return false;
				}
			}
			for (@Pc(69) int local69 = 0; local69 < this.anInt1481; local69++) {
				if (arg0.aByteArray10[local69] != this.aByteArray10[local69]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(II)I")
	public int method969(@OriginalArg(0) int arg0) {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt1481; local28++) {
			@Pc(36) int local36 = this.aByteArray10[local28] & 0xFF;
			if (local28 == 0) {
				if (local36 == 45) {
					local7 = true;
					continue;
				}
				if (local36 == 43) {
					continue;
				}
			}
			if (local36 >= 48 && local36 <= 57) {
				local36 -= 48;
			} else if (local36 >= 65 && local36 <= 90) {
				local36 -= 55;
			} else if (local36 >= 97 && local36 <= 122) {
				local36 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local36) {
				throw new NumberFormatException();
			}
			if (local7) {
				local36 = -local36;
			}
			@Pc(109) int local109 = local36 + local21 * arg0;
			if (local109 / arg0 != local21) {
				throw new NumberFormatException();
			}
			local5 = true;
			local21 = local109;
		}
		if (!local5) {
			throw new NumberFormatException();
		}
		return local21;
	}
}
