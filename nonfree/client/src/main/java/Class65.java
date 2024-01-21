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

@OriginalClass("client!oc")
public final class Class65 implements Interface1 {

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
	public int anInt3190;

	@OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
	private int anInt3222;

	@OriginalMember(owner = "client!oc", name = "Y", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Z")
	private boolean aBoolean134 = true;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!oc;Z)Z")
	public boolean method2445(@OriginalArg(0) Class65 arg0) {
		if (arg0.anInt3190 > this.anInt3190) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt3190; local17++) {
			@Pc(23) byte local23 = this.aByteArray37[local17];
			if (local23 >= 65 && local23 <= 90 || local23 >= -64 && local23 <= -34 && local23 != -41) {
				local23 = (byte) (local23 + 32);
			}
			@Pc(52) byte local52 = arg0.aByteArray37[local17];
			if (local52 >= 65 && local52 <= 90 || local52 >= -64 && local52 <= -34 && local52 != -41) {
				local52 = (byte) (local52 + 32);
			}
			if (local52 != local23) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BII)I")
	public int method2446(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) byte local11 = (byte) arg0;
		for (@Pc(13) int local13 = arg1; local13 < this.anInt3190; local13++) {
			if (this.aByteArray37[local13] == local11) {
				return local13;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!oc", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method2449();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[Lclient!oc;")
	public Class65[] method2447(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt3190; local12++) {
			if (this.aByteArray37[local12] == arg0) {
				local10++;
			}
		}
		@Pc(34) Class65[] local34 = new Class65[local10 + 1];
		if (local10 == 0) {
			local34[0] = this;
			return local34;
		}
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		for (@Pc(48) int local48 = 0; local48 < local10; local48++) {
			@Pc(51) int local51;
			for (local51 = 0; arg0 != this.aByteArray37[local51 + local46]; local51++) {
			}
			local34[local44++] = this.method2481(local51 + local46, local46);
			local46 += local51 + 1;
		}
		local34[local10] = this.method2481(this.anInt3190, local46);
		return local34;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/applet/Applet;I)Lclient!oc;")
	public Class65 method2448(@OriginalArg(0) Applet arg0) {
		@Pc(12) String local12 = new String(this.aByteArray37, 0, this.anInt3190);
		@Pc(16) String local16 = arg0.getParameter(local12);
		return local16 == null ? null : Static206.method3275(local16);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I")
	public int method2449() {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < this.anInt3190; local13++) {
			local11 = (local11 << 5) + (this.aByteArray37[local13] & 0xFF) - local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	public void method2450(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray37, 0, this.anInt3190, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray37, 0, this.anInt3190);
		}
		arg0.drawString(local9, arg1, arg2);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)[B")
	public byte[] method2452() {
		@Pc(15) byte[] local15 = new byte[this.anInt3190];
		Static217.method2361(this.aByteArray37, 0, local15, 0, this.anInt3190);
		return local15;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILclient!oc;)I")
	public int method2453(@OriginalArg(0) int arg0, @OriginalArg(2) Class65 arg1) {
		@Pc(7) int[] local7 = new int[arg1.anInt3190];
		@Pc(11) int[] local11 = new int[arg1.anInt3190];
		@Pc(14) int[] local14 = new int[256];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			local14[local16] = arg1.anInt3190;
		}
		for (@Pc(33) int local33 = 1; local33 <= arg1.anInt3190; local33++) {
			local7[local33 - 1] = (arg1.anInt3190 << 1) - local33;
			local14[arg1.aByteArray37[local33 - 1] & 0xFF] = arg1.anInt3190 - local33;
		}
		@Pc(69) int local69 = arg1.anInt3190 + 1;
		for (@Pc(72) int local72 = arg1.anInt3190; local72 > 0; local72--) {
			local11[local72 - 1] = local69;
			while (arg1.anInt3190 >= local69 && arg1.aByteArray37[local72 - 1] != arg1.aByteArray37[local69 - 1]) {
				if (arg1.anInt3190 - local72 <= local7[local69 + -1]) {
					local7[local69 - 1] = arg1.anInt3190 - local72;
				}
				local69 = local11[local69 - 1];
			}
			local69--;
		}
		@Pc(136) int local136 = local69;
		local69 = arg1.anInt3190 + 1 - local69;
		@Pc(146) int local146 = 1;
		@Pc(148) int local148 = 0;
		@Pc(150) int local150 = 1;
		while (local150 <= local69) {
			local11[local150 - 1] = local148;
			while (local148 >= 1 && arg1.aByteArray37[local150 - 1] != arg1.aByteArray37[local148 - 1]) {
				local148 = local11[local148 - 1];
			}
			local150++;
			local148++;
		}
		@Pc(188) int local188;
		while (local136 < arg1.anInt3190) {
			for (local188 = local146; local188 <= local136; local188++) {
				if (arg1.anInt3190 + local136 - local188 <= local7[local188 - 1]) {
					local7[local188 - 1] = arg1.anInt3190 + local136 - local188;
				}
			}
			local146 = local136 + 1;
			local136 += local69 - local11[local69 - 1];
			local69 = local11[local69 - 1];
		}
		@Pc(265) int local265;
		for (local188 = arg0 + arg1.anInt3190 - 1; local188 < this.anInt3190; local188 += Math.max(local14[this.aByteArray37[local188] & 0xFF], local7[local265])) {
			for (local265 = arg1.anInt3190 - 1; local265 >= 0 && arg1.aByteArray37[local265] == this.aByteArray37[local188]; local265--) {
				local188--;
			}
			if (local265 == -1) {
				return local188 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)I")
	public int method2454() {
		return this.method2477(10);
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
	public void method2455() {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray37, 0, this.anInt3190, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local13 = new String(this.aByteArray37, 0, this.anInt3190);
		}
		System.out.println(local13);
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)Lclient!oc;")
	public Class65 method2456() {
		@Pc(14) Class65 local14 = Static134.method2558(this.method2475());
		return local14 == null ? Static64.aClass65_1001 : local14;
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)Ljava/net/URL;")
	public URL method2458() throws MalformedURLException {
		return new URL(new String(this.aByteArray37, 0, this.anInt3190));
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)Lclient!oc;")
	public Class65 method2459() {
		@Pc(15) Class65 local15 = new Class65();
		local15.anInt3190 = this.anInt3190;
		local15.aByteArray37 = new byte[this.anInt3190];
		for (@Pc(26) int local26 = 0; local26 < this.anInt3190; local26++) {
			@Pc(33) byte local33 = this.aByteArray37[local26];
			if (local33 == 47) {
				local15.aByteArray37[local26] = 32;
			} else {
				local15.aByteArray37[local26] = local33;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/net/URL;I)Ljava/net/URL;")
	public URL method2460(@OriginalArg(0) URL arg0) throws MalformedURLException {
		return new URL(arg0, new String(this.aByteArray37, 0, this.anInt3190));
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZLclient!oc;)Z")
	public boolean method2461(@OriginalArg(1) Class65 arg0) {
		if (arg0.anInt3190 > this.anInt3190) {
			return false;
		}
		@Pc(21) int local21 = this.anInt3190 - arg0.anInt3190;
		for (@Pc(23) int local23 = 0; local23 < arg0.anInt3190; local23++) {
			if (this.aByteArray37[local23 + local21] != arg0.aByteArray37[local23]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)Lclient!oc;")
	public Class65 method2462(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(18) Class65 local18 = new Class65();
		local18.aByteArray37 = new byte[this.anInt3190 + 1];
		local18.anInt3190 = this.anInt3190 + 1;
		Static217.method2361(this.aByteArray37, 0, local18.aByteArray37, 0, this.anInt3190);
		local18.aByteArray37[this.anInt3190] = (byte) arg0;
		return local18;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)J")
	private long method2463() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt3190; local7++) {
			local5 = (local5 << 5) + (long) (this.aByteArray37[local7] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!oc;)I")
	public int method2464(@OriginalArg(1) Class65 arg0) {
		@Pc(12) int local12;
		if (this.anInt3190 <= arg0.anInt3190) {
			local12 = this.anInt3190;
		} else {
			local12 = arg0.anInt3190;
		}
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			if ((this.aByteArray37[local22] & 0xFF) < (arg0.aByteArray37[local22] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray37[local22] & 0xFF) > (arg0.aByteArray37[local22] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.anInt3190 > this.anInt3190) {
			return -1;
		} else if (this.anInt3190 > arg0.anInt3190) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(Z)Lclient!oc;")
	public Class65 method2465() {
		@Pc(7) Class65 local7 = new Class65();
		local7.anInt3190 = this.anInt3190;
		local7.aByteArray37 = new byte[this.anInt3190];
		for (@Pc(23) int local23 = 0; local23 < this.anInt3190; local23++) {
			local7.aByteArray37[local23] = 42;
		}
		return local7;
	}

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)Lclient!oc;")
	public Class65 method2466() {
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.anInt3190 && (this.aByteArray37[local5] >= 0 && this.aByteArray37[local5] <= 32 || (this.aByteArray37[local5] & 0xFF) == 160); local5++) {
		}
		@Pc(38) int local38;
		for (local38 = this.anInt3190; local38 > local5 && (this.aByteArray37[local38 - 1] >= 0 && this.aByteArray37[local38 - 1] <= 32 || (this.aByteArray37[local38 - 1] & 0xFF) == 160); local38--) {
		}
		if (local5 == 0 && local38 == this.anInt3190) {
			return this;
		}
		@Pc(86) Class65 local86 = new Class65();
		local86.anInt3190 = local38 - local5;
		local86.aByteArray37 = new byte[local86.anInt3190];
		for (@Pc(98) int local98 = 0; local98 < local86.anInt3190; local98++) {
			local86.aByteArray37[local98] = this.aByteArray37[local98 + local5];
		}
		return local86;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(II)Z")
	private boolean method2467() {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt3190; local21++) {
			@Pc(29) int local29 = this.aByteArray37[local21] & 0xFF;
			if (local21 == 0) {
				if (local29 == 45) {
					local17 = true;
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
			if (local17) {
				local29 = -local29;
			}
			@Pc(88) int local88 = local29 + local19 * 10;
			if (local19 != local88 / 10) {
				return false;
			}
			local15 = true;
			local19 = local88;
		}
		return local15;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(II)Lclient!oc;")
	public Class65 method2468(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean134) {
			this.anInt3222 = 0;
			if (this.aByteArray37.length == this.anInt3190) {
				@Pc(45) int local45;
				for (local45 = 1; local45 <= this.anInt3190; local45 += local45) {
				}
				@Pc(61) byte[] local61 = new byte[local45];
				Static217.method2361(this.aByteArray37, 0, local61, 0, this.anInt3190);
				this.aByteArray37 = local61;
			}
			this.aByteArray37[this.anInt3190++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)Lclient!oc;")
	public Class65 method2469() {
		if (!this.aBoolean134) {
			throw new IllegalArgumentException();
		}
		this.anInt3222 = 0;
		if (this.anInt3190 != this.aByteArray37.length) {
			@Pc(23) byte[] local23 = new byte[this.anInt3190];
			Static217.method2361(this.aByteArray37, 0, local23, 0, this.anInt3190);
			this.aByteArray37 = local23;
		}
		return this;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(ILclient!oc;)Z")
	public boolean method2470(@OriginalArg(1) Class65 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt3190 == arg0.anInt3190) {
			if (!this.aBoolean134 || !arg0.aBoolean134) {
				if (this.anInt3222 == 0) {
					this.anInt3222 = this.method2449();
					if (this.anInt3222 == 0) {
						this.anInt3222 = 1;
					}
				}
				if (arg0.anInt3222 == 0) {
					arg0.anInt3222 = arg0.method2449();
					if (arg0.anInt3222 == 0) {
						arg0.anInt3222 = 1;
					}
				}
				if (this.anInt3222 != arg0.anInt3222) {
					return false;
				}
			}
			for (@Pc(66) int local66 = 0; local66 < this.anInt3190; local66++) {
				if (arg0.aByteArray37[local66] != this.aByteArray37[local66]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)Z")
	public boolean method2471() {
		return this.method2467();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!oc;B)Z")
	public boolean method2472(@OriginalArg(0) Class65 arg0) {
		if (this.anInt3190 < arg0.anInt3190) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt3190; local17++) {
			if (arg0.aByteArray37[local17] != this.aByteArray37[local17]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)I")
	public int method2473(@OriginalArg(0) int arg0) {
		return this.aByteArray37[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(Lclient!oc;B)Lclient!oc;")
	public Class65 method2474(@OriginalArg(0) Class65 arg0) {
		if (!this.aBoolean134) {
			throw new IllegalArgumentException();
		}
		this.anInt3222 = 0;
		if (this.aByteArray37.length < this.anInt3190 + arg0.anInt3190) {
			@Pc(37) int local37;
			for (local37 = 1; local37 < arg0.anInt3190 + this.anInt3190; local37 += local37) {
			}
			@Pc(56) byte[] local56 = new byte[local37];
			Static217.method2361(this.aByteArray37, 0, local56, 0, this.anInt3190);
			this.aByteArray37 = local56;
		}
		Static217.method2361(arg0.aByteArray37, 0, this.aByteArray37, this.anInt3190, arg0.anInt3190);
		this.anInt3190 += arg0.anInt3190;
		return this;
	}

	@OriginalMember(owner = "client!oc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(Z)J")
	public long method2475() {
		@Pc(5) long local5 = 0L;
		for (@Pc(15) int local15 = 0; this.anInt3190 > local15 && local15 < 12; local15++) {
			local5 *= 37L;
			@Pc(25) byte local25 = this.aByteArray37[local15];
			if (local25 >= 65 && local25 <= 90) {
				local5 += local25 + 1 - 65;
			} else if (local25 >= 97 && local25 <= 122) {
				local5 += local25 + 1 - 97;
			} else if (local25 >= 48 && local25 <= 57) {
				local5 += local25 + 27 - 48;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}

	@OriginalMember(owner = "client!oc", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class65)) {
			throw new IllegalArgumentException();
		}
		return this.method2470((Class65) arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/FontMetrics;B)I")
	public int method2476(@OriginalArg(0) FontMetrics arg0) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray37, 0, this.anInt3190, "ISO-8859-1");
		} catch (@Pc(17) UnsupportedEncodingException local17) {
			local9 = new String(this.aByteArray37, 0, this.anInt3190);
		}
		return arg0.stringWidth(local9);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)I")
	public int method2477(@OriginalArg(1) int arg0) {
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt3190; local29++) {
			@Pc(37) int local37 = this.aByteArray37[local29] & 0xFF;
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
				throw new NumberFormatException();
			}
			if (local37 >= arg0) {
				throw new NumberFormatException();
			}
			if (local23) {
				local37 = -local37;
			}
			@Pc(109) int local109 = arg0 * local27 + local37;
			if (local109 / arg0 != local27) {
				throw new NumberFormatException();
			}
			local25 = true;
			local27 = local109;
		}
		if (!local25) {
			throw new NumberFormatException();
		}
		return local27;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZLjava/applet/Applet;)V")
	public void method2478(@OriginalArg(1) Applet arg0) throws Throwable {
		@Pc(12) String local12 = new String(this.aByteArray37, 0, this.anInt3190);
		Static215.method1445(arg0, local12);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(BII)Lclient!oc;")
	public Class65 method2481(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class65 local3 = new Class65();
		local3.aByteArray37 = new byte[arg0 - arg1];
		local3.anInt3190 = arg0 - arg1;
		Static217.method2361(this.aByteArray37, arg1, local3.aByteArray37, 0, local3.anInt3190);
		return local3;
	}

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "(I)I")
	public int method2482() {
		return this.anInt3190;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(IB)Lclient!oc;")
	public Class65 method2483(@OriginalArg(0) int arg0) {
		return this.method2481(this.anInt3190, arg0);
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(Lclient!oc;B)I")
	public int method2484(@OriginalArg(0) Class65 arg0) {
		return this.method2453(0, arg0);
	}

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "(I)Lclient!oc;")
	public Class65 method2485() {
		@Pc(3) long local3 = this.method2463();
		@Pc(16) Class local16 = oc.class;
		synchronized (oc.class) {
			@Pc(32) Class1_Sub8 local32;
			if (Static185.aClass99_13 == null) {
				Static185.aClass99_13 = new Class99(4096);
			} else {
				for (local32 = (Class1_Sub8) Static185.aClass99_13.method3292(local3); local32 != null; local32 = (Class1_Sub8) Static185.aClass99_13.method3293()) {
					if (this.method2470(local32.aClass65_1073)) {
						return local32.aClass65_1073;
					}
				}
			}
			local32 = new Class1_Sub8();
			local32.aClass65_1073 = this;
			this.aBoolean134 = false;
			Static185.aClass99_13.method3290(local32, local3);
			return this;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([BIIII)I")
	public int method2486(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static217.method2361(this.aByteArray37, 0, arg0, arg1, arg2);
		return arg2;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)Lclient!oc;")
	public Class65 method2487() {
		@Pc(3) Class65 local3 = new Class65();
		local3.anInt3190 = this.anInt3190;
		local3.aByteArray37 = new byte[this.anInt3190];
		for (@Pc(18) int local18 = 0; local18 < this.anInt3190; local18++) {
			@Pc(28) byte local28 = this.aByteArray37[local18];
			if (local28 >= 65 && local28 <= 90 || local28 >= -64 && local28 <= -34 && local28 != -41) {
				local28 = (byte) (local28 + 32);
			}
			local3.aByteArray37[local18] = local28;
		}
		return local3;
	}

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "(I)Lclient!oc;")
	public Class65 method2488() {
		@Pc(3) Class65 local3 = new Class65();
		local3.anInt3190 = this.anInt3190;
		@Pc(9) boolean local9 = true;
		local3.aByteArray37 = new byte[this.anInt3190];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3190; local16++) {
			@Pc(22) byte local22 = this.aByteArray37[local16];
			if (local22 == 95) {
				local9 = true;
				local3.aByteArray37[local16] = 32;
			} else if (local22 >= 97 && local22 <= 122 && local9) {
				local3.aByteArray37[local16] = (byte) (local22 - 32);
				local9 = false;
			} else {
				local3.aByteArray37[local16] = local22;
				local9 = false;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLclient!oc;)Z")
	public boolean method2489(@OriginalArg(1) Class65 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt3190 == arg0.anInt3190) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt3190; local16++) {
				@Pc(22) byte local22 = this.aByteArray37[local16];
				if (local22 >= 65 && local22 <= 90 || local22 >= -64 && local22 <= -34 && local22 != -41) {
					local22 = (byte) (local22 + 32);
				}
				@Pc(51) byte local51 = arg0.aByteArray37[local16];
				if (local51 >= 65 && local51 <= 90 || local51 >= -64 && local51 <= -34 && local51 != -41) {
					local51 = (byte) (local51 + 32);
				}
				if (local22 != local51) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(ILclient!oc;)I")
	public int method2490(@OriginalArg(1) Class65 arg0) {
		@Pc(15) int local15;
		if (this.anInt3190 <= arg0.anInt3190) {
			local15 = this.anInt3190;
		} else {
			local15 = arg0.anInt3190;
		}
		for (@Pc(25) int local25 = 0; local25 < local15; local25++) {
			if (Static196.anIntArray485[this.aByteArray37[local25] & 0xFF] < Static196.anIntArray485[arg0.aByteArray37[local25] & 0xFF]) {
				return -1;
			}
			if (Static196.anIntArray485[this.aByteArray37[local25] & 0xFF] > Static196.anIntArray485[arg0.aByteArray37[local25] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt3190 < arg0.anInt3190) {
			return -1;
		} else if (arg0.anInt3190 < this.anInt3190) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(Z)Lclient!oc;")
	public Class65 method2491() {
		@Pc(7) Class65 local7 = new Class65();
		local7.anInt3190 = this.anInt3190;
		@Pc(21) byte local21 = 2;
		local7.aByteArray37 = new byte[this.anInt3190];
		for (@Pc(28) int local28 = 0; local28 < this.anInt3190; local28++) {
			@Pc(34) byte local34 = this.aByteArray37[local28];
			if (local34 >= 97 && local34 <= 122 || !(local34 < -32 || local34 > -2 || local34 == -9)) {
				if (local21 == 2) {
					local34 = (byte) (local34 - 32);
				}
				local21 = 0;
			} else if (local34 >= 65 && local34 <= 90 || !(local34 < -64 || local34 > -34 || local34 == -41)) {
				if (local21 == 0) {
					local34 = (byte) (local34 + 32);
				}
				local21 = 0;
			} else if (local34 == 46 || local34 == 33 || local34 == 63) {
				local21 = 2;
			} else if (local34 != 32) {
				local21 = 1;
			} else if (local21 != 2) {
				local21 = 1;
			}
			local7.aByteArray37[local28] = local34;
		}
		return local7;
	}
}
