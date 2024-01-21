import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class77 implements Interface1 {

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
	public int anInt3606;

	@OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
	private int anInt3628;

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "Z")
	private boolean aBoolean147 = true;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)Lclient!sg;")
	public Class77 method2500() {
		@Pc(7) long local7 = this.method2533();
		@Pc(16) Class local16 = sg.class;
		synchronized (sg.class) {
			@Pc(26) Class2_Sub19 local26;
			if (Static13.aClass74_2 == null) {
				Static13.aClass74_2 = new Class74(4096);
			} else {
				for (local26 = (Class2_Sub19) Static13.aClass74_2.method2433(local7); local26 != null; local26 = (Class2_Sub19) Static13.aClass74_2.method2437()) {
					if (this.method2519(local26.aClass77_1090)) {
						return local26.aClass77_1090;
					}
				}
			}
			local26 = new Class2_Sub19();
			this.aBoolean147 = false;
			local26.aClass77_1090 = this;
			Static13.aClass74_2.method2432(local7, local26);
			return this;
		}
	}

	@OriginalMember(owner = "client!sg", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class77)) {
			throw new IllegalArgumentException();
		}
		return this.method2519((Class77) arg0);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)Z")
	public boolean method2502() {
		return this.method2536();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!sg;Z)Lclient!sg;")
	public Class77 method2503(@OriginalArg(0) Class77 arg0) {
		if (!this.aBoolean147) {
			throw new IllegalArgumentException();
		}
		this.anInt3628 = 0;
		if (arg0.anInt3606 + this.anInt3606 > this.aByteArray46.length) {
			@Pc(24) int local24;
			for (local24 = 1; local24 < this.anInt3606 + arg0.anInt3606; local24 += local24) {
			}
			@Pc(39) byte[] local39 = new byte[local24];
			Static186.method1561(this.aByteArray46, 0, local39, 0, this.anInt3606);
			this.aByteArray46 = local39;
		}
		Static186.method1561(arg0.aByteArray46, 0, this.aByteArray46, this.anInt3606, arg0.anInt3606);
		this.anInt3606 += arg0.anInt3606;
		return this;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZI)Lclient!sg;")
	public Class77 method2504(@OriginalArg(1) int arg0) {
		return this.method2530(arg0, this.anInt3606);
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)Lclient!sg;")
	public Class77 method2505() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt3606 && (this.aByteArray46[local1] >= 0 && this.aByteArray46[local1] <= 32 || (this.aByteArray46[local1] & 0xFF) == 160); local1++) {
		}
		@Pc(38) int local38;
		for (local38 = this.anInt3606; local38 > local1 && (this.aByteArray46[local38 - 1] >= 0 && this.aByteArray46[local38 - 1] <= 32 || (this.aByteArray46[local38 - 1] & 0xFF) == 160); local38--) {
		}
		if (local1 == 0 && local38 == this.anInt3606) {
			return this;
		}
		@Pc(100) Class77 local100 = new Class77();
		local100.anInt3606 = local38 - local1;
		local100.aByteArray46 = new byte[local100.anInt3606];
		for (@Pc(113) int local113 = 0; local113 < local100.anInt3606; local113++) {
			local100.aByteArray46[local113] = this.aByteArray46[local1 + local113];
		}
		return local100;
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)[B")
	public byte[] method2506() {
		@Pc(7) byte[] local7 = new byte[this.anInt3606];
		Static186.method1561(this.aByteArray46, 0, local7, 0, this.anInt3606);
		return local7;
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)Lclient!sg;")
	public Class77 method2507() {
		@Pc(5) byte local5 = 2;
		@Pc(14) Class77 local14 = new Class77();
		local14.anInt3606 = this.anInt3606;
		local14.aByteArray46 = new byte[this.anInt3606];
		for (@Pc(25) int local25 = 0; local25 < this.anInt3606; local25++) {
			@Pc(31) byte local31 = this.aByteArray46[local25];
			if (local31 >= 97 && local31 <= 122 || local31 >= -32 && local31 <= -2 && local31 != -9) {
				if (local5 == 2) {
					local31 = (byte) (local31 - 32);
				}
				local5 = 0;
			} else if (local31 >= 65 && local31 <= 90 || !(local31 < -64 || local31 > -34 || local31 == -41)) {
				if (local5 == 0) {
					local31 = (byte) (local31 + 32);
				}
				local5 = 0;
			} else if (local31 == 46 || local31 == 33 || local31 == 63) {
				local5 = 2;
			} else if (local31 != 32) {
				local5 = 1;
			} else if (local5 != 2) {
				local5 = 1;
			}
			local14.aByteArray46[local25] = local31;
		}
		return local14;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!sg;I)Z")
	public boolean method2508(@OriginalArg(0) Class77 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt3606 == arg0.anInt3606) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt3606; local20++) {
				@Pc(26) byte local26 = arg0.aByteArray46[local20];
				if (local26 >= 65 && local26 <= 90 || local26 >= -64 && local26 <= -34 && local26 != -41) {
					local26 = (byte) (local26 + 32);
				}
				@Pc(51) byte local51 = this.aByteArray46[local20];
				if (local51 >= 65 && local51 <= 90 || local51 >= -64 && local51 <= -34 && local51 != -41) {
					local51 = (byte) (local51 + 32);
				}
				if (local51 != local26) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)I")
	public int method2509(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte local8 = (byte) arg0;
		for (@Pc(18) int local18 = arg1; local18 < this.anInt3606; local18++) {
			if (local8 == this.aByteArray46[local18]) {
				return local18;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLclient!sg;)I")
	public int method2510(@OriginalArg(1) Class77 arg0) {
		@Pc(17) int local17;
		if (arg0.anInt3606 >= this.anInt3606) {
			local17 = this.anInt3606;
		} else {
			local17 = arg0.anInt3606;
		}
		for (@Pc(27) int local27 = 0; local27 < local17; local27++) {
			if ((this.aByteArray46[local27] & 0xFF) < (arg0.aByteArray46[local27] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray46[local27] & 0xFF) > (arg0.aByteArray46[local27] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt3606 < arg0.anInt3606) {
			return -1;
		} else if (this.anInt3606 > arg0.anInt3606) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(Lclient!sg;I)Z")
	public boolean method2511(@OriginalArg(0) Class77 arg0) {
		if (arg0.anInt3606 > this.anInt3606) {
			return false;
		}
		@Pc(20) int local20 = this.anInt3606 - arg0.anInt3606;
		for (@Pc(29) int local29 = 0; local29 < arg0.anInt3606; local29++) {
			if (arg0.aByteArray46[local29] != this.aByteArray46[local20 + local29]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public void method2512(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) int arg2) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray46, 0, this.anInt3606, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray46, 0, this.anInt3606);
		}
		arg1.drawString(local13, arg0, arg2);
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)Ljava/net/URL;")
	public URL method2513() throws MalformedURLException {
		return new URL(new String(this.aByteArray46, 0, this.anInt3606));
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!sg;)I")
	public int method2514(@OriginalArg(1) Class77 arg0) {
		return this.method2537(0, arg0);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II[BII)I")
	public int method2515(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		Static186.method1561(this.aByteArray46, 0, arg1, arg2, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "(I)Lclient!sg;")
	public Class77 method2516() {
		@Pc(9) Class77 local9 = new Class77();
		local9.anInt3606 = 0;
		local9.aByteArray46 = new byte[12];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.anInt3606; local20++) {
			if (this.aByteArray46[local20] >= 65 && this.aByteArray46[local20] <= 90) {
				local9.aByteArray46[local18++] = (byte) (this.aByteArray46[local20] + 97 - 65);
				local9.anInt3606 = local18;
			} else if (this.aByteArray46[local20] >= 97 && this.aByteArray46[local20] <= 122 || this.aByteArray46[local20] >= 48 && this.aByteArray46[local20] <= 57) {
				local9.aByteArray46[local18++] = this.aByteArray46[local20];
				local9.anInt3606 = local18;
			} else if (local18 > 0) {
				local9.aByteArray46[local18++] = 95;
			}
			if (local18 == 12) {
				break;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(B)Lclient!sg;")
	public Class77 method2517() {
		if (!this.aBoolean147) {
			throw new IllegalArgumentException();
		}
		this.anInt3628 = 0;
		if (this.anInt3606 != this.aByteArray46.length) {
			@Pc(35) byte[] local35 = new byte[this.anInt3606];
			Static186.method1561(this.aByteArray46, 0, local35, 0, this.anInt3606);
			this.aByteArray46 = local35;
		}
		return this;
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(Lclient!sg;I)Z")
	public boolean method2519(@OriginalArg(0) Class77 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt3606 == arg0.anInt3606) {
			if (!this.aBoolean147 || !arg0.aBoolean147) {
				if (this.anInt3628 == 0) {
					this.anInt3628 = this.method2528();
					if (this.anInt3628 == 0) {
						this.anInt3628 = 1;
					}
				}
				if (arg0.anInt3628 == 0) {
					arg0.anInt3628 = arg0.method2528();
					if (arg0.anInt3628 == 0) {
						arg0.anInt3628 = 1;
					}
				}
				if (this.anInt3628 != arg0.anInt3628) {
					return false;
				}
			}
			for (@Pc(76) int local76 = 0; local76 < this.anInt3606; local76++) {
				if (this.aByteArray46[local76] != arg0.aByteArray46[local76]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/awt/FontMetrics;B)I")
	public int method2520(@OriginalArg(0) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray46, 0, this.anInt3606, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray46, 0, this.anInt3606);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)I")
	public int method2521() {
		return this.method2523(10);
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(Lclient!sg;I)Z")
	public boolean method2522(@OriginalArg(0) Class77 arg0) {
		if (arg0.anInt3606 > this.anInt3606) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt3606; local12++) {
			if (this.aByteArray46[local12] != arg0.aByteArray46[local12]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
	public int method2523(@OriginalArg(0) int arg0) {
		@Pc(5) boolean local5 = false;
		@Pc(17) int local17 = 0;
		@Pc(19) boolean local19 = false;
		for (@Pc(26) int local26 = 0; local26 < this.anInt3606; local26++) {
			@Pc(34) int local34 = this.aByteArray46[local26] & 0xFF;
			if (local26 == 0) {
				if (local34 == 45) {
					local5 = true;
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
			if (local5) {
				local34 = -local34;
			}
			@Pc(104) int local104 = local17 * arg0 + local34;
			if (local17 != local104 / arg0) {
				throw new NumberFormatException();
			}
			local17 = local104;
			local19 = true;
		}
		if (!local19) {
			throw new NumberFormatException();
		}
		return local17;
	}

	@OriginalMember(owner = "client!sg", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method2528();
	}

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "(B)Lclient!sg;")
	public Class77 method2525() {
		@Pc(15) Class77 local15 = new Class77();
		local15.anInt3606 = this.anInt3606;
		local15.aByteArray46 = new byte[this.anInt3606];
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < this.anInt3606; local28++) {
			@Pc(34) byte local34 = this.aByteArray46[local28];
			if (local34 == 95) {
				local15.aByteArray46[local28] = 32;
				local26 = true;
			} else if (local34 >= 97 && local34 <= 122 && local26) {
				local15.aByteArray46[local28] = (byte) (local34 - 32);
				local26 = false;
			} else {
				local15.aByteArray46[local28] = local34;
				local26 = false;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)I")
	public int method2526(@OriginalArg(1) int arg0) {
		return this.aByteArray46[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(Z)Lclient!sg;")
	public Class77 method2527() {
		@Pc(3) Class77 local3 = new Class77();
		local3.anInt3606 = this.anInt3606;
		local3.aByteArray46 = new byte[this.anInt3606];
		for (@Pc(14) int local14 = 0; local14 < this.anInt3606; local14++) {
			local3.aByteArray46[local14] = 42;
		}
		return local3;
	}

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "(B)I")
	public int method2528() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt3606; local3++) {
			local1 = (this.aByteArray46[local3] & 0xFF) + ((local1 << 5) - local1);
		}
		return local1;
	}

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "(B)Lclient!sg;")
	public Class77 method2529() {
		@Pc(12) Class77 local12 = new Class77();
		local12.anInt3606 = this.anInt3606;
		local12.aByteArray46 = new byte[this.anInt3606];
		for (@Pc(23) int local23 = 0; local23 < this.anInt3606; local23++) {
			@Pc(29) byte local29 = this.aByteArray46[local23];
			if (local29 >= 65 && local29 <= 90 || local29 >= -64 && local29 <= -34 && local29 != -41) {
				local29 = (byte) (local29 + 32);
			}
			local12.aByteArray46[local23] = local29;
		}
		return local12;
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(III)Lclient!sg;")
	public Class77 method2530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class77 local12 = new Class77();
		local12.aByteArray46 = new byte[arg1 - arg0];
		local12.anInt3606 = arg1 - arg0;
		Static186.method1561(this.aByteArray46, arg0, local12.aByteArray46, 0, local12.anInt3606);
		return local12;
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(Z)J")
	public long method2531() {
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; this.anInt3606 > local12 && local12 < 12; local12++) {
			@Pc(18) byte local18 = this.aByteArray46[local12];
			local10 *= 37L;
			if (local18 >= 65 && local18 <= 90) {
				local10 += local18 + 1 - 65;
			} else if (local18 >= 97 && local18 <= 122) {
				local10 += local18 + 1 - 97;
			} else if (local18 >= 48 && local18 <= 57) {
				local10 += local18 - 21;
			}
		}
		while (local10 % 37L == 0L && local10 != 0L) {
			local10 /= 37L;
		}
		return local10;
	}

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "(I)I")
	public int method2532() {
		return this.anInt3606;
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(Z)J")
	private long method2533() {
		@Pc(6) long local6 = 0L;
		for (@Pc(12) int local12 = 0; local12 < this.anInt3606; local12++) {
			local6 = (local6 << 5) + (long) (this.aByteArray46[local12] & 0xFF) - local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(BLclient!sg;)I")
	public int method2534(@OriginalArg(1) Class77 arg0) {
		@Pc(11) int local11;
		if (arg0.anInt3606 < this.anInt3606) {
			local11 = arg0.anInt3606;
		} else {
			local11 = this.anInt3606;
		}
		for (@Pc(22) int local22 = 0; local22 < local11; local22++) {
			if (Static82.anIntArray358[arg0.aByteArray46[local22] & 0xFF] > Static82.anIntArray358[this.aByteArray46[local22] & 0xFF]) {
				return -1;
			}
			if (Static82.anIntArray358[this.aByteArray46[local22] & 0xFF] > Static82.anIntArray358[arg0.aByteArray46[local22] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt3606 > this.anInt3606) {
			return -1;
		} else if (arg0.anInt3606 < this.anInt3606) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)Lclient!sg;")
	public Class77 method2535(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(20) Class77 local20 = new Class77();
		local20.aByteArray46 = new byte[this.anInt3606 + 1];
		local20.anInt3606 = this.anInt3606 + 1;
		Static186.method1561(this.aByteArray46, 0, local20.aByteArray46, 0, this.anInt3606);
		local20.aByteArray46[this.anInt3606] = (byte) arg0;
		return local20;
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)Z")
	private boolean method2536() {
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt3606; local29++) {
			@Pc(38) int local38 = this.aByteArray46[local29] & 0xFF;
			if (local29 == 0) {
				if (local38 == 45) {
					local23 = true;
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
			if (local23) {
				local38 = -local38;
			}
			@Pc(111) int local111 = local27 * 10 + local38;
			if (local111 / 10 != local27) {
				return false;
			}
			local25 = true;
			local27 = local111;
		}
		return local25;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BILclient!sg;)I")
	public int method2537(@OriginalArg(1) int arg0, @OriginalArg(2) Class77 arg1) {
		@Pc(9) int[] local9 = new int[arg1.anInt3606];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg1.anInt3606];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg1.anInt3606;
		}
		for (@Pc(40) int local40 = 1; local40 <= arg1.anInt3606; local40++) {
			local9[local40 - 1] = (arg1.anInt3606 << 1) - local40;
			local12[arg1.aByteArray46[local40 - 1] & 0xFF] = arg1.anInt3606 - local40;
		}
		@Pc(83) int local83 = arg1.anInt3606 + 1;
		@Pc(86) int local86 = arg1.anInt3606;
		while (local86 > 0) {
			local16[local86 - 1] = local83;
			while (local83 <= arg1.anInt3606 && arg1.aByteArray46[local86 - 1] != arg1.aByteArray46[local83 - 1]) {
				if (local9[local83 - 1] >= arg1.anInt3606 - local86) {
					local9[local83 - 1] = arg1.anInt3606 - local86;
				}
				local83 = local16[local83 - 1];
			}
			local86--;
			local83--;
		}
		@Pc(156) int local156 = local83;
		@Pc(158) int local158 = 1;
		@Pc(160) int local160 = 0;
		local83 = arg1.anInt3606 + 1 - local83;
		@Pc(170) int local170 = 1;
		while (local83 >= local170) {
			local16[local170 - 1] = local160;
			while (local160 >= 1 && arg1.aByteArray46[local170 - 1] != arg1.aByteArray46[local160 - 1]) {
				local160 = local16[local160 - 1];
			}
			local170++;
			local160++;
		}
		@Pc(221) int local221;
		while (arg1.anInt3606 > local156) {
			for (local221 = local158; local221 <= local156; local221++) {
				if (arg1.anInt3606 + local156 - local221 <= local9[local221 + -1]) {
					local9[local221 - 1] = local156 + arg1.anInt3606 - local221;
				}
			}
			local158 = local156 + 1;
			local156 = local83 + local156 - local16[local83 - 1];
			local83 = local16[local83 - 1];
		}
		@Pc(294) int local294;
		for (local221 = arg1.anInt3606 + arg0 - 1; local221 < this.anInt3606; local221 += Math.max(local12[this.aByteArray46[local221] & 0xFF], local9[local294])) {
			for (local294 = arg1.anInt3606 - 1; local294 >= 0 && arg1.aByteArray46[local294] == this.aByteArray46[local221]; local294--) {
				local221--;
			}
			if (local294 == -1) {
				return local221 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(II)Lclient!sg;")
	public Class77 method2538(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean147) {
			this.anInt3628 = 0;
			if (this.aByteArray46.length == this.anInt3606) {
				@Pc(49) int local49;
				for (local49 = 1; local49 <= this.anInt3606; local49 += local49) {
				}
				@Pc(65) byte[] local65 = new byte[local49];
				Static186.method1561(this.aByteArray46, 0, local65, 0, this.anInt3606);
				this.aByteArray46 = local65;
			}
			this.aByteArray46[this.anInt3606++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
