import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class34 implements Interface2 {

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
	private int anInt1412;

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
	public int anInt1418;

	@OriginalMember(owner = "client!ic", name = "U", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!ic", name = "C", descriptor = "Z")
	private boolean aBoolean56 = true;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Lclient!ic;")
	public Class34 method803(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(20) Class34 local20 = new Class34();
		local20.aByteArray20 = new byte[this.anInt1418 + 1];
		local20.anInt1418 = this.anInt1418 + 1;
		Static140.method1345(this.aByteArray20, 0, local20.aByteArray20, 0, this.anInt1418);
		local20.aByteArray20[this.anInt1418] = (byte) arg0;
		return local20;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ic;Z)Z")
	public boolean method804(@OriginalArg(0) Class34 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1418 == arg0.anInt1418) {
			if (!this.aBoolean56 || !arg0.aBoolean56) {
				if (this.anInt1412 == 0) {
					this.anInt1412 = this.method839();
					if (this.anInt1412 == 0) {
						this.anInt1412 = 1;
					}
				}
				if (arg0.anInt1412 == 0) {
					arg0.anInt1412 = arg0.method839();
					if (arg0.anInt1412 == 0) {
						arg0.anInt1412 = 1;
					}
				}
				if (arg0.anInt1412 != this.anInt1412) {
					return false;
				}
			}
			for (@Pc(73) int local73 = 0; local73 < this.anInt1418; local73++) {
				if (arg0.aByteArray20[local73] != this.aByteArray20[local73]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)I")
	public int method805(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte local9 = (byte) arg1;
		for (@Pc(15) int local15 = arg0; local15 < this.anInt1418; local15++) {
			if (local9 == this.aByteArray20[local15]) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ic;I)Z")
	public boolean method806(@OriginalArg(0) Class34 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1418 == arg0.anInt1418) {
			for (@Pc(21) int local21 = 0; local21 < this.anInt1418; local21++) {
				@Pc(27) byte local27 = arg0.aByteArray20[local21];
				@Pc(32) byte local32 = this.aByteArray20[local21];
				if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
					local32 = (byte) (local32 + 32);
				}
				if (local27 >= 65 && local27 <= 90 || local27 >= -64 && local27 <= -34 && local27 != -41) {
					local27 = (byte) (local27 + 32);
				}
				if (local27 != local32) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Lclient!ic;I)Lclient!ic;")
	public Class34 method807(@OriginalArg(0) Class34 arg0) {
		if (!this.aBoolean56) {
			throw new IllegalArgumentException();
		}
		this.anInt1412 = 0;
		if (arg0.anInt1418 + this.anInt1418 > this.aByteArray20.length) {
			@Pc(35) int local35;
			for (local35 = 1; local35 < arg0.anInt1418 + this.anInt1418; local35 += local35) {
			}
			@Pc(55) byte[] local55 = new byte[local35];
			Static140.method1345(this.aByteArray20, 0, local55, 0, this.anInt1418);
			this.aByteArray20 = local55;
		}
		Static140.method1345(arg0.aByteArray20, 0, this.aByteArray20, this.anInt1418, arg0.anInt1418);
		this.anInt1418 += arg0.anInt1418;
		return this;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)I")
	public int method808(@OriginalArg(1) int arg0) {
		return this.aByteArray20[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)Z")
	private boolean method809() {
		@Pc(7) boolean local7 = false;
		@Pc(15) int local15 = 0;
		@Pc(17) boolean local17 = false;
		for (@Pc(29) int local29 = 0; local29 < this.anInt1418; local29++) {
			@Pc(38) int local38 = this.aByteArray20[local29] & 0xFF;
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
			@Pc(111) int local111 = local15 * 10 + local38;
			if (local111 / 10 != local15) {
				return false;
			}
			local17 = true;
			local15 = local111;
		}
		return local17;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BII)Lclient!ic;")
	public Class34 method810(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class34 local7 = new Class34();
		local7.aByteArray20 = new byte[arg0 - arg1];
		local7.anInt1418 = arg0 - arg1;
		Static140.method1345(this.aByteArray20, arg1, local7.aByteArray20, 0, local7.anInt1418);
		return local7;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(BI)I")
	public int method811(@OriginalArg(1) int arg0) {
		@Pc(15) boolean local15 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt1418; local26++) {
			@Pc(34) int local34 = this.aByteArray20[local26] & 0xFF;
			if (local26 == 0) {
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
			if (arg0 <= local34) {
				throw new NumberFormatException();
			}
			if (local15) {
				local34 = -local34;
			}
			@Pc(104) int local104 = local34 + arg0 * local24;
			if (local104 / arg0 != local24) {
				throw new NumberFormatException();
			}
			local22 = true;
			local24 = local104;
		}
		if (!local22) {
			throw new NumberFormatException();
		}
		return local24;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)Lclient!ic;")
	public Class34 method812() {
		@Pc(5) int local5;
		for (local5 = 0; this.anInt1418 > local5 && (this.aByteArray20[local5] >= 0 && this.aByteArray20[local5] <= 32 || (this.aByteArray20[local5] & 0xFF) == 160); local5++) {
		}
		@Pc(33) int local33;
		for (local33 = this.anInt1418; local33 > local5 && (this.aByteArray20[local33 - 1] >= 0 && this.aByteArray20[local33 - 1] <= 32 || (this.aByteArray20[local33 - 1] & 0xFF) == 160); local33--) {
		}
		if (local5 == 0 && local33 == this.anInt1418) {
			return this;
		}
		@Pc(84) Class34 local84 = new Class34();
		local84.anInt1418 = local33 - local5;
		local84.aByteArray20 = new byte[local84.anInt1418];
		for (@Pc(104) int local104 = 0; local104 < local84.anInt1418; local104++) {
			local84.aByteArray20[local104] = this.aByteArray20[local5 + local104];
		}
		return local84;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)Lclient!ic;")
	public Class34 method814() {
		@Pc(12) long local12 = this.method829();
		@Pc(21) Class local21 = ic.class;
		synchronized (ic.class) {
			@Pc(31) Class8_Sub16 local31;
			if (Static84.aClass7_15 == null) {
				Static84.aClass7_15 = new Class7(4096);
			} else {
				for (local31 = (Class8_Sub16) Static84.aClass7_15.method45(local12); local31 != null; local31 = (Class8_Sub16) Static84.aClass7_15.method50()) {
					if (this.method804(local31.aClass34_996)) {
						return local31.aClass34_996;
					}
				}
			}
			local31 = new Class8_Sub16();
			local31.aClass34_996 = this;
			this.aBoolean56 = false;
			Static84.aClass7_15.method48(local31, local12);
			return this;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLclient!ic;)I")
	public int method815(@OriginalArg(1) Class34 arg0) {
		@Pc(17) int local17;
		if (this.anInt1418 <= arg0.anInt1418) {
			local17 = this.anInt1418;
		} else {
			local17 = arg0.anInt1418;
		}
		for (@Pc(24) int local24 = 0; local24 < local17; local24++) {
			if (Static50.anIntArray165[arg0.aByteArray20[local24] & 0xFF] > Static50.anIntArray165[this.aByteArray20[local24] & 0xFF]) {
				return -1;
			}
			if (Static50.anIntArray165[arg0.aByteArray20[local24] & 0xFF] < Static50.anIntArray165[this.aByteArray20[local24] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt1418 < arg0.anInt1418) {
			return -1;
		} else if (this.anInt1418 > arg0.anInt1418) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(II)Lclient!ic;")
	public Class34 method817(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean56) {
			this.anInt1412 = 0;
			if (this.aByteArray20.length == this.anInt1418) {
				@Pc(57) int local57;
				for (local57 = 1; local57 <= this.anInt1418; local57 += local57) {
				}
				@Pc(74) byte[] local74 = new byte[local57];
				Static140.method1345(this.aByteArray20, 0, local74, 0, this.anInt1418);
				this.aByteArray20 = local74;
			}
			this.aByteArray20[this.anInt1418++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(Lclient!ic;I)I")
	public int method818(@OriginalArg(0) Class34 arg0) {
		return this.method824(arg0, 0);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)Lclient!ic;")
	public Class34 method819() {
		if (!this.aBoolean56) {
			throw new IllegalArgumentException();
		}
		this.anInt1412 = 0;
		if (this.anInt1418 != this.aByteArray20.length) {
			@Pc(36) byte[] local36 = new byte[this.anInt1418];
			Static140.method1345(this.aByteArray20, 0, local36, 0, this.anInt1418);
			this.aByteArray20 = local36;
		}
		return this;
	}

	@OriginalMember(owner = "client!ic", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class34)) {
			throw new IllegalArgumentException();
		}
		return this.method804((Class34) arg0);
	}

	@OriginalMember(owner = "client!ic", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method839();
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)I")
	public int method820() {
		return this.anInt1418;
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)Lclient!ic;")
	public Class34 method822() {
		@Pc(7) byte local7 = 2;
		@Pc(11) Class34 local11 = new Class34();
		local11.anInt1418 = this.anInt1418;
		local11.aByteArray20 = new byte[this.anInt1418];
		for (@Pc(27) int local27 = 0; local27 < this.anInt1418; local27++) {
			@Pc(34) byte local34 = this.aByteArray20[local27];
			if (local34 >= 97 && local34 <= 122 || !(local34 < -32 || local34 > -2 || local34 == -9)) {
				if (local7 == 2) {
					local34 = (byte) (local34 - 32);
				}
				local7 = 0;
			} else if (local34 >= 65 && local34 <= 90 || !(local34 < -64 || local34 > -34 || local34 == -41)) {
				if (local7 == 0) {
					local34 = (byte) (local34 + 32);
				}
				local7 = 0;
			} else if (local34 == 46 || local34 == 33 || local34 == 63) {
				local7 = 2;
			} else if (local34 != 32) {
				local7 = 1;
			} else if (local7 != 2) {
				local7 = 1;
			}
			local11.aByteArray20[local27] = local34;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)I")
	public int method823() {
		return this.method811(10);
	}

	@OriginalMember(owner = "client!ic", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!ic;I)I")
	public int method824(@OriginalArg(1) Class34 arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int[] local6 = new int[256];
		@Pc(10) int[] local10 = new int[arg0.anInt1418];
		@Pc(14) int[] local14 = new int[arg0.anInt1418];
		for (@Pc(16) int local16 = 0; local16 < local6.length; local16++) {
			local6[local16] = arg0.anInt1418;
		}
		for (@Pc(34) int local34 = 1; local34 <= arg0.anInt1418; local34++) {
			local10[local34 - 1] = (arg0.anInt1418 << 1) - local34;
			local6[arg0.aByteArray20[local34 - 1] & 0xFF] = arg0.anInt1418 - local34;
		}
		@Pc(72) int local72 = arg0.anInt1418 + 1;
		@Pc(75) int local75 = arg0.anInt1418;
		while (local75 > 0) {
			local14[local75 - 1] = local72;
			while (local72 <= arg0.anInt1418 && arg0.aByteArray20[local72 - 1] != arg0.aByteArray20[local75 - 1]) {
				if (arg0.anInt1418 - local75 <= local10[local72 + -1]) {
					local10[local72 - 1] = arg0.anInt1418 - local75;
				}
				local72 = local14[local72 - 1];
			}
			local75--;
			local72--;
		}
		@Pc(144) int local144 = local72;
		@Pc(146) int local146 = 1;
		local72 = arg0.anInt1418 + 1 - local72;
		@Pc(156) int local156 = 0;
		for (@Pc(158) int local158 = 1; local158 <= local72; local158++) {
			local14[local158 - 1] = local156;
			while (local156 >= 1 && arg0.aByteArray20[local158 - 1] != arg0.aByteArray20[local156 - 1]) {
				local156 = local14[local156 - 1];
			}
			local156++;
		}
		@Pc(200) int local200;
		while (arg0.anInt1418 > local144) {
			for (local200 = local146; local200 <= local144; local200++) {
				if (local10[local200 - 1] >= arg0.anInt1418 + local144 - local200) {
					local10[local200 - 1] = arg0.anInt1418 + local144 - local200;
				}
			}
			local146 = local144 + 1;
			local144 += local72 - local14[local72 - 1];
			local72 = local14[local72 - 1];
		}
		@Pc(277) int local277;
		for (local200 = arg0.anInt1418 + arg1 - 1; local200 < this.anInt1418; local200 += Math.max(local6[this.aByteArray20[local200] & 0xFF], local10[local277])) {
			for (local277 = arg0.anInt1418 - 1; local277 >= 0 && this.aByteArray20[local200] == arg0.aByteArray20[local277]; local277--) {
				local200--;
			}
			if (local277 == -1) {
				return local200 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([BIIII)I")
	public int method825(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static140.method1345(this.aByteArray20, 0, arg0, arg1, arg2);
		return arg2;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(BLclient!ic;)Z")
	public boolean method826(@OriginalArg(1) Class34 arg0) {
		if (this.anInt1418 < arg0.anInt1418) {
			return false;
		}
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt1418; local21++) {
			if (this.aByteArray20[local21] != arg0.aByteArray20[local21]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)Lclient!ic;")
	public Class34 method827() {
		@Pc(9) Class34 local9 = new Class34();
		local9.anInt1418 = this.anInt1418;
		local9.aByteArray20 = new byte[this.anInt1418];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1418; local25++) {
			local9.aByteArray20[local25] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method828(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray20, 0, this.anInt1418, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local13 = new String(this.aByteArray20, 0, this.anInt1418);
		}
		arg1.drawString(local13, arg2, arg0);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)J")
	private long method829() {
		@Pc(6) long local6 = 0L;
		for (@Pc(8) int local8 = 0; local8 < this.anInt1418; local8++) {
			local6 = (long) (this.aByteArray20[local8] & 0xFF) + (local6 << 5) - local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)J")
	public long method830() {
		@Pc(13) long local13 = 0L;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1418 && local15 < 12; local15++) {
			@Pc(21) byte local21 = this.aByteArray20[local15];
			local13 *= 37L;
			if (local21 >= 65 && local21 <= 90) {
				local13 += local21 + 1 - 65;
			} else if (local21 >= 97 && local21 <= 122) {
				local13 += local21 + 1 - 97;
			} else if (local21 >= 48 && local21 <= 57) {
				local13 += local21 + 27 - 48;
			}
		}
		while (local13 % 37L == 0L && local13 != 0L) {
			local13 /= 37L;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)Lclient!ic;")
	public Class34 method831() {
		@Pc(7) Class34 local7 = new Class34();
		local7.anInt1418 = 0;
		local7.aByteArray20 = new byte[12];
		@Pc(16) int local16 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anInt1418; local25++) {
			if (this.aByteArray20[local25] >= 65 && this.aByteArray20[local25] <= 90) {
				local7.aByteArray20[local16++] = (byte) (this.aByteArray20[local25] + 97 - 65);
				local7.anInt1418 = local16;
			} else if (this.aByteArray20[local25] >= 97 && this.aByteArray20[local25] <= 122 || this.aByteArray20[local25] >= 48 && this.aByteArray20[local25] <= 57) {
				local7.aByteArray20[local16++] = this.aByteArray20[local25];
				local7.anInt1418 = local16;
			} else if (local16 > 0) {
				local7.aByteArray20[local16++] = 95;
			}
			if (local16 == 12) {
				break;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)Ljava/net/URL;")
	public URL method832() throws MalformedURLException {
		return new URL(new String(this.aByteArray20, 0, this.anInt1418));
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ic;B)I")
	public int method833(@OriginalArg(0) Class34 arg0) {
		@Pc(17) int local17;
		if (arg0.anInt1418 >= this.anInt1418) {
			local17 = this.anInt1418;
		} else {
			local17 = arg0.anInt1418;
		}
		for (@Pc(24) int local24 = 0; local24 < local17; local24++) {
			if ((this.aByteArray20[local24] & 0xFF) < (arg0.aByteArray20[local24] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray20[local24] & 0xFF) > (arg0.aByteArray20[local24] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.anInt1418 > this.anInt1418) {
			return -1;
		} else if (this.anInt1418 > arg0.anInt1418) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(Z)Lclient!ic;")
	public Class34 method834() {
		@Pc(7) Class34 local7 = new Class34();
		local7.anInt1418 = this.anInt1418;
		local7.aByteArray20 = new byte[this.anInt1418];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1418; local25++) {
			@Pc(31) byte local31 = this.aByteArray20[local25];
			if (local31 >= 65 && local31 <= 90 || local31 >= -64 && local31 <= -34 && local31 != -41) {
				local31 = (byte) (local31 + 32);
			}
			local7.aByteArray20[local25] = local31;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(II)Lclient!ic;")
	public Class34 method835(@OriginalArg(1) int arg0) {
		return this.method810(this.anInt1418, arg0);
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(B)[B")
	public byte[] method836() {
		@Pc(7) byte[] local7 = new byte[this.anInt1418];
		Static140.method1345(this.aByteArray20, 0, local7, 0, this.anInt1418);
		return local7;
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(B)Z")
	public boolean method838() {
		return this.method809();
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(Z)I")
	public int method839() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1418; local7++) {
			local5 = (local5 << 5) + (this.aByteArray20[local7] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Lclient!ic;B)Z")
	public boolean method840(@OriginalArg(0) Class34 arg0) {
		if (arg0.anInt1418 > this.anInt1418) {
			return false;
		}
		@Pc(19) int local19 = this.anInt1418 - arg0.anInt1418;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt1418; local21++) {
			if (arg0.aByteArray20[local21] != this.aByteArray20[local19 + local21]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method841(@OriginalArg(0) FontMetrics arg0) {
		@Pc(14) String local14;
		try {
			local14 = new String(this.aByteArray20, 0, this.anInt1418, "ISO-8859-1");
		} catch (@Pc(16) UnsupportedEncodingException local16) {
			local14 = new String(this.aByteArray20, 0, this.anInt1418);
		}
		return arg0.stringWidth(local14);
	}

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "(I)Lclient!ic;")
	public Class34 method842() {
		@Pc(9) Class34 local9 = new Class34();
		local9.anInt1418 = this.anInt1418;
		local9.aByteArray20 = new byte[this.anInt1418];
		@Pc(20) boolean local20 = true;
		for (@Pc(30) int local30 = 0; local30 < this.anInt1418; local30++) {
			@Pc(37) byte local37 = this.aByteArray20[local30];
			if (local37 == 95) {
				local9.aByteArray20[local30] = 32;
				local20 = true;
			} else if (local37 >= 97 && local37 <= 122 && local20) {
				local20 = false;
				local9.aByteArray20[local30] = (byte) (local37 - 32);
			} else {
				local20 = false;
				local9.aByteArray20[local30] = local37;
			}
		}
		return local9;
	}
}
