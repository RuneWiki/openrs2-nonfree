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

@OriginalClass("client!rd")
public final class Class80 implements Interface2 {

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
	public int anInt3421;

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
	private int anInt3422;

	@OriginalMember(owner = "client!rd", name = "X", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!rd", name = "Z", descriptor = "Z")
	private boolean aBoolean140 = true;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Lclient!rd;")
	public Class80 method2425() {
		@Pc(7) long local7 = this.method2427();
		@Pc(16) Class local16 = rd.class;
		synchronized (rd.class) {
			@Pc(32) Class3_Sub21 local32;
			if (Static141.aClass54_13 == null) {
				Static141.aClass54_13 = new Class54(4096);
			} else {
				for (local32 = (Class3_Sub21) Static141.aClass54_13.method1496(local7); local32 != null; local32 = (Class3_Sub21) Static141.aClass54_13.method1495()) {
					if (this.method2437(local32.aClass80_1355)) {
						return local32.aClass80_1355;
					}
				}
			}
			local32 = new Class3_Sub21();
			local32.aClass80_1355 = this;
			this.aBoolean140 = false;
			Static141.aClass54_13.method1494(local7, local32);
			return this;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)J")
	private long method2427() {
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < this.anInt3421; local12++) {
			local10 = (long) (this.aByteArray43[local12] & 0xFF) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBLclient!rd;)I")
	public int method2428(@OriginalArg(0) int arg0, @OriginalArg(2) Class80 arg1) {
		@Pc(9) int[] local9 = new int[arg1.anInt3421];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg1.anInt3421];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg1.anInt3421;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg1.anInt3421; local36++) {
			local9[local36 - 1] = (arg1.anInt3421 << 1) - local36;
			local12[arg1.aByteArray43[local36 - 1] & 0xFF] = arg1.anInt3421 - local36;
		}
		@Pc(74) int local74 = arg1.anInt3421 + 1;
		@Pc(77) int local77 = arg1.anInt3421;
		while (local77 > 0) {
			local16[local77 - 1] = local74;
			while (local74 <= arg1.anInt3421 && arg1.aByteArray43[local74 - 1] != arg1.aByteArray43[local77 - 1]) {
				if (arg1.anInt3421 - local77 <= local9[local74 + -1]) {
					local9[local74 - 1] = arg1.anInt3421 - local77;
				}
				local74 = local16[local74 - 1];
			}
			local77--;
			local74--;
		}
		@Pc(144) int local144 = local74;
		local74 = arg1.anInt3421 + 1 - local74;
		@Pc(153) int local153 = 1;
		@Pc(155) int local155 = 0;
		@Pc(163) int local163 = 1;
		while (local163 <= local74) {
			local16[local163 - 1] = local155;
			while (local155 >= 1 && arg1.aByteArray43[local163 - 1] != arg1.aByteArray43[local155 - 1]) {
				local155 = local16[local155 - 1];
			}
			local163++;
			local155++;
		}
		@Pc(212) int local212;
		while (arg1.anInt3421 > local144) {
			for (local212 = local153; local212 <= local144; local212++) {
				if (arg1.anInt3421 + local144 - local212 <= local9[local212 + -1]) {
					local9[local212 - 1] = arg1.anInt3421 + local144 - local212;
				}
			}
			local153 = local144 + 1;
			local144 += local74 - local16[local74 - 1];
			local74 = local16[local74 - 1];
		}
		@Pc(289) int local289;
		for (local212 = arg1.anInt3421 + arg0 - 1; local212 < this.anInt3421; local212 += Math.max(local12[this.aByteArray43[local212] & 0xFF], local9[local289])) {
			for (local289 = arg1.anInt3421 - 1; local289 >= 0 && arg1.aByteArray43[local289] == this.aByteArray43[local212]; local289--) {
				local212--;
			}
			if (local289 == -1) {
				return local212 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)I")
	public int method2429(@OriginalArg(1) int arg0) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt3421; local26++) {
			@Pc(35) int local35 = this.aByteArray43[local26] & 0xFF;
			if (local26 == 0) {
				if (local35 == 45) {
					local15 = true;
					continue;
				}
				if (local35 == 43) {
					continue;
				}
			}
			if (local35 >= 48 && local35 <= 57) {
				local35 -= 48;
			} else if (local35 >= 65 && local35 <= 90) {
				local35 -= 55;
			} else if (local35 >= 97 && local35 <= 122) {
				local35 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (local35 >= arg0) {
				throw new NumberFormatException();
			}
			if (local15) {
				local35 = -local35;
			}
			@Pc(112) int local112 = local35 + arg0 * local19;
			if (local112 / arg0 != local19) {
				throw new NumberFormatException();
			}
			local17 = true;
			local19 = local112;
		}
		if (!local17) {
			throw new NumberFormatException();
		}
		return local19;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/applet/Applet;B)V")
	public void method2430(@OriginalArg(0) Applet arg0) throws Throwable {
		@Pc(16) String local16 = new String(this.aByteArray43, 0, this.anInt3421);
		Static201.method1183(arg0, local16);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)Lclient!rd;")
	public Class80 method2431() {
		@Pc(8) int local8 = this.anInt3421;
		@Pc(10) int local10;
		for (local10 = 0; this.anInt3421 > local10 && (this.aByteArray43[local10] >= 0 && this.aByteArray43[local10] <= 32 || (this.aByteArray43[local10] & 0xFF) == 160); local10++) {
		}
		while (local8 > local10 && (this.aByteArray43[local8 - 1] >= 0 && this.aByteArray43[local8 - 1] <= 32 || (this.aByteArray43[local8 - 1] & 0xFF) == 160)) {
			local8--;
		}
		if (local10 == 0 && this.anInt3421 == local8) {
			return this;
		}
		@Pc(95) Class80 local95 = new Class80();
		local95.anInt3421 = local8 - local10;
		local95.aByteArray43 = new byte[local95.anInt3421];
		for (@Pc(108) int local108 = 0; local108 < local95.anInt3421; local108++) {
			local95.aByteArray43[local108] = this.aByteArray43[local10 + local108];
		}
		return local95;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!rd;)Z")
	public boolean method2432(@OriginalArg(1) Class80 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt3421 == this.anInt3421) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt3421; local30++) {
				@Pc(37) byte local37 = this.aByteArray43[local30];
				@Pc(42) byte local42 = arg0.aByteArray43[local30];
				if (local42 >= 65 && local42 <= 90 || local42 >= -64 && local42 <= -34 && local42 != -41) {
					local42 = (byte) (local42 + 32);
				}
				if (local37 >= 65 && local37 <= 90 || local37 >= -64 && local37 <= -34 && local37 != -41) {
					local37 = (byte) (local37 + 32);
				}
				if (local37 != local42) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!rd;B)I")
	public int method2433(@OriginalArg(0) Class80 arg0) {
		@Pc(17) int local17;
		if (arg0.anInt3421 < this.anInt3421) {
			local17 = arg0.anInt3421;
		} else {
			local17 = this.anInt3421;
		}
		for (@Pc(24) int local24 = 0; local24 < local17; local24++) {
			if (Static118.anIntArray337[this.aByteArray43[local24] & 0xFF] < Static118.anIntArray337[arg0.aByteArray43[local24] & 0xFF]) {
				return -1;
			}
			if (Static118.anIntArray337[this.aByteArray43[local24] & 0xFF] > Static118.anIntArray337[arg0.aByteArray43[local24] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt3421 > this.anInt3421) {
			return -1;
		} else if (this.anInt3421 > arg0.anInt3421) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Lclient!rd;")
	public Class80 method2434(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(22) Class80 local22 = new Class80();
		local22.aByteArray43 = new byte[this.anInt3421 + 1];
		local22.anInt3421 = this.anInt3421 + 1;
		Static200.method1179(this.aByteArray43, 0, local22.aByteArray43, 0, this.anInt3421);
		local22.aByteArray43[this.anInt3421] = (byte) arg0;
		return local22;
	}

	@OriginalMember(owner = "client!rd", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method2445();
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Ljava/applet/Applet;B)Lclient!rd;")
	public Class80 method2435(@OriginalArg(0) Applet arg0) {
		@Pc(17) String local17 = new String(this.aByteArray43, 0, this.anInt3421);
		@Pc(21) String local21 = arg0.getParameter(local17);
		return local21 == null ? null : Static50.method745(local21);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)Lclient!rd;")
	public Class80 method2436(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean140) {
			this.anInt3422 = 0;
			if (this.anInt3421 == this.aByteArray43.length) {
				@Pc(44) int local44;
				for (local44 = 1; local44 <= this.anInt3421; local44 += local44) {
				}
				@Pc(61) byte[] local61 = new byte[local44];
				Static200.method1179(this.aByteArray43, 0, local61, 0, this.anInt3421);
				this.aByteArray43 = local61;
			}
			this.aByteArray43[this.anInt3421++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLclient!rd;)Z")
	public boolean method2437(@OriginalArg(1) Class80 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt3421 == this.anInt3421) {
			if (!this.aBoolean140 || !arg0.aBoolean140) {
				if (this.anInt3422 == 0) {
					this.anInt3422 = this.method2445();
					if (this.anInt3422 == 0) {
						this.anInt3422 = 1;
					}
				}
				if (arg0.anInt3422 == 0) {
					arg0.anInt3422 = arg0.method2445();
					if (arg0.anInt3422 == 0) {
						arg0.anInt3422 = 1;
					}
				}
				if (this.anInt3422 != arg0.anInt3422) {
					return false;
				}
			}
			for (@Pc(57) int local57 = 0; local57 < this.anInt3421; local57++) {
				if (arg0.aByteArray43[local57] != this.aByteArray43[local57]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)Ljava/net/URL;")
	public URL method2438() throws MalformedURLException {
		return new URL(new String(this.aByteArray43, 0, this.anInt3421));
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)Lclient!rd;")
	public Class80 method2439() {
		if (!this.aBoolean140) {
			throw new IllegalArgumentException();
		}
		this.anInt3422 = 0;
		if (this.anInt3421 != this.aByteArray43.length) {
			@Pc(28) byte[] local28 = new byte[this.anInt3421];
			Static200.method1179(this.aByteArray43, 0, local28, 0, this.anInt3421);
			this.aByteArray43 = local28;
		}
		return this;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(ILclient!rd;)Z")
	public boolean method2440(@OriginalArg(1) Class80 arg0) {
		if (arg0.anInt3421 > this.anInt3421) {
			return false;
		}
		@Pc(24) int local24 = this.anInt3421 - arg0.anInt3421;
		for (@Pc(26) int local26 = 0; local26 < arg0.anInt3421; local26++) {
			if (this.aByteArray43[local24 + local26] != arg0.aByteArray43[local26]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)J")
	public long method2441() {
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; this.anInt3421 > local12 && local12 < 12; local12++) {
			local10 *= 37L;
			@Pc(22) byte local22 = this.aByteArray43[local12];
			if (local22 >= 65 && local22 <= 90) {
				local10 += local22 - 64;
			} else if (local22 >= 97 && local22 <= 122) {
				local10 += local22 + 1 - 97;
			} else if (local22 >= 48 && local22 <= 57) {
				local10 += local22 + 27 - 48;
			}
		}
		while (local10 % 37L == 0L && local10 != 0L) {
			local10 /= 37L;
		}
		return local10;
	}

	@OriginalMember(owner = "client!rd", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class80)) {
			throw new IllegalArgumentException();
		}
		return this.method2437((Class80) arg0);
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(ILclient!rd;)I")
	public int method2442(@OriginalArg(1) Class80 arg0) {
		@Pc(25) int local25;
		if (this.anInt3421 > arg0.anInt3421) {
			local25 = arg0.anInt3421;
		} else {
			local25 = this.anInt3421;
		}
		for (@Pc(32) int local32 = 0; local32 < local25; local32++) {
			if ((this.aByteArray43[local32] & 0xFF) < (arg0.aByteArray43[local32] & 0xFF)) {
				return -1;
			}
			if ((arg0.aByteArray43[local32] & 0xFF) < (this.aByteArray43[local32] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.anInt3421 > this.anInt3421) {
			return -1;
		} else if (arg0.anInt3421 < this.anInt3421) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/awt/FontMetrics;B)I")
	public int method2443(@OriginalArg(0) FontMetrics arg0) {
		@Pc(19) String local19;
		try {
			local19 = new String(this.aByteArray43, 0, this.anInt3421, "ISO-8859-1");
		} catch (@Pc(21) UnsupportedEncodingException local21) {
			local19 = new String(this.aByteArray43, 0, this.anInt3421);
		}
		return arg0.stringWidth(local19);
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)[B")
	public byte[] method2444() {
		@Pc(3) byte[] local3 = new byte[this.anInt3421];
		Static200.method1179(this.aByteArray43, 0, local3, 0, this.anInt3421);
		return local3;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)I")
	public int method2445() {
		@Pc(5) int local5 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt3421; local15++) {
			local5 = (this.aByteArray43[local15] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)Lclient!rd;")
	public Class80 method2449(@OriginalArg(0) int arg0) {
		return this.method2464(arg0, this.anInt3421);
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)Lclient!rd;")
	public Class80 method2450() {
		@Pc(9) Class80 local9 = new Class80();
		local9.anInt3421 = this.anInt3421;
		local9.aByteArray43 = new byte[this.anInt3421];
		for (@Pc(28) int local28 = 0; local28 < this.anInt3421; local28++) {
			local9.aByteArray43[local28] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)Lclient!rd;")
	public Class80 method2451() {
		@Pc(9) Class80 local9 = new Class80();
		@Pc(11) boolean local11 = true;
		local9.anInt3421 = this.anInt3421;
		local9.aByteArray43 = new byte[this.anInt3421];
		for (@Pc(22) int local22 = 0; local22 < this.anInt3421; local22++) {
			@Pc(29) byte local29 = this.aByteArray43[local22];
			if (local29 == 95) {
				local11 = true;
				local9.aByteArray43[local22] = 32;
			} else if (local29 >= 97 && local29 <= 122 && local11) {
				local9.aByteArray43[local22] = (byte) (local29 - 32);
				local11 = false;
			} else {
				local11 = false;
				local9.aByteArray43[local22] = local29;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public void method2452(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray43, 0, this.anInt3421, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray43, 0, this.anInt3421);
		}
		arg2.drawString(local13, arg1, arg0);
	}

	@OriginalMember(owner = "client!rd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([BIIBI)I")
	public int method2453(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		Static200.method1179(this.aByteArray43, 0, arg0, arg1, arg2);
		return arg2;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLclient!rd;)Lclient!rd;")
	public Class80 method2454(@OriginalArg(1) Class80 arg0) {
		if (!this.aBoolean140) {
			throw new IllegalArgumentException();
		}
		this.anInt3422 = 0;
		if (this.aByteArray43.length < this.anInt3421 + arg0.anInt3421) {
			@Pc(24) int local24;
			for (local24 = 1; local24 < arg0.anInt3421 + this.anInt3421; local24 += local24) {
			}
			@Pc(43) byte[] local43 = new byte[local24];
			Static200.method1179(this.aByteArray43, 0, local43, 0, this.anInt3421);
			this.aByteArray43 = local43;
		}
		Static200.method1179(arg0.aByteArray43, 0, this.aByteArray43, this.anInt3421, arg0.anInt3421);
		this.anInt3421 += arg0.anInt3421;
		return this;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)Lclient!rd;")
	public Class80 method2455() {
		@Pc(9) Class80 local9 = new Class80();
		local9.anInt3421 = this.anInt3421;
		local9.aByteArray43 = new byte[this.anInt3421];
		@Pc(20) byte local20 = 2;
		for (@Pc(22) int local22 = 0; local22 < this.anInt3421; local22++) {
			@Pc(29) byte local29 = this.aByteArray43[local22];
			if (local29 >= 97 && local29 <= 122 || local29 >= -32 && local29 <= -2 && local29 != -9) {
				if (local20 == 2) {
					local29 = (byte) (local29 - 32);
				}
				local20 = 0;
			} else if (local29 >= 65 && local29 <= 90 || !(local29 < -64 || local29 > -34 || local29 == -41)) {
				if (local20 == 0) {
					local29 = (byte) (local29 + 32);
				}
				local20 = 0;
			} else if (local29 == 46 || local29 == 33 || local29 == 63) {
				local20 = 2;
			} else if (local29 != 32) {
				local20 = 1;
			} else if (local20 != 2) {
				local20 = 1;
			}
			local9.aByteArray43[local22] = local29;
		}
		return local9;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)I")
	public int method2456(@OriginalArg(1) int arg0) {
		return this.aByteArray43[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(B)Z")
	public boolean method2458() {
		return this.method2459();
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(BI)Z")
	private boolean method2459() {
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt3421; local28++) {
			@Pc(37) int local37 = this.aByteArray43[local28] & 0xFF;
			if (local28 == 0) {
				if (local37 == 45) {
					local19 = true;
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
			if (local19) {
				local37 = -local37;
			}
			@Pc(100) int local100 = local21 * 10 + local37;
			if (local21 != local100 / 10) {
				return false;
			}
			local17 = true;
			local21 = local100;
		}
		return local17;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!rd;Z)I")
	public int method2460(@OriginalArg(0) Class80 arg0) {
		return this.method2428(0, arg0);
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(B)I")
	public int method2462() {
		return this.anInt3421;
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)I")
	public int method2463() {
		return this.method2429(10);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIB)Lclient!rd;")
	public Class80 method2464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class80 local12 = new Class80();
		local12.anInt3421 = arg1 - arg0;
		local12.aByteArray43 = new byte[arg1 - arg0];
		Static200.method1179(this.aByteArray43, arg0, local12.aByteArray43, 0, local12.anInt3421);
		return local12;
	}

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)Lclient!rd;")
	public Class80 method2465() {
		@Pc(9) Class80 local9 = new Class80();
		local9.anInt3421 = this.anInt3421;
		local9.aByteArray43 = new byte[this.anInt3421];
		for (@Pc(20) int local20 = 0; local20 < this.anInt3421; local20++) {
			@Pc(27) byte local27 = this.aByteArray43[local20];
			if (local27 >= 65 && local27 <= 90 || local27 >= -64 && local27 <= -34 && local27 != -41) {
				local27 = (byte) (local27 + 32);
			}
			local9.aByteArray43[local20] = local27;
		}
		return local9;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Lclient!rd;Z)Z")
	public boolean method2466(@OriginalArg(0) Class80 arg0) {
		if (this.anInt3421 < arg0.anInt3421) {
			return false;
		}
		for (@Pc(27) int local27 = 0; local27 < arg0.anInt3421; local27++) {
			if (this.aByteArray43[local27] != arg0.aByteArray43[local27]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "(I)Lclient!rd;")
	public Class80 method2468() {
		@Pc(9) Class80 local9 = Static19.method321(this.method2441());
		return local9 == null ? Static161.aClass80_1392 : local9;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(III)I")
	public int method2469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) byte local6 = (byte) arg0;
		for (@Pc(8) int local8 = arg1; local8 < this.anInt3421; local8++) {
			if (local6 == this.aByteArray43[local8]) {
				return local8;
			}
		}
		return -1;
	}
}
