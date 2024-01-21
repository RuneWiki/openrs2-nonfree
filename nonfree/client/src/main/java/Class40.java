import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class40 implements Interface2 {

	@OriginalMember(owner = "client!je", name = "m", descriptor = "I")
	public int anInt1425;

	@OriginalMember(owner = "client!je", name = "D", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!je", name = "lb", descriptor = "I")
	private int anInt1462;

	@OriginalMember(owner = "client!je", name = "V", descriptor = "Z")
	private boolean aBoolean102 = true;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)I")
	public int method950() {
		return this.anInt1425;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BLclient!je;)Lclient!je;")
	public Class40 method951(@OriginalArg(1) Class40 arg0) {
		if (!this.aBoolean102) {
			throw new IllegalArgumentException();
		}
		this.anInt1462 = 0;
		if (this.anInt1425 + arg0.anInt1425 > this.aByteArray18.length) {
			@Pc(26) int local26;
			for (local26 = 1; local26 < this.anInt1425 + arg0.anInt1425; local26 += local26) {
			}
			@Pc(43) byte[] local43 = new byte[local26];
			Static141.method1907(this.aByteArray18, 0, local43, 0, this.anInt1425);
			this.aByteArray18 = local43;
		}
		Static141.method1907(arg0.aByteArray18, 0, this.aByteArray18, this.anInt1425, arg0.anInt1425);
		this.anInt1425 += arg0.anInt1425;
		return this;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)[B")
	public byte[] method952() {
		@Pc(12) byte[] local12 = new byte[this.anInt1425];
		Static141.method1907(this.aByteArray18, 0, local12, 0, this.anInt1425);
		return local12;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)Lclient!je;")
	public Class40 method953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class40 local3 = new Class40();
		local3.aByteArray18 = new byte[arg1 - arg0];
		local3.anInt1425 = arg1 - arg0;
		Static141.method1907(this.aByteArray18, arg0, local3.aByteArray18, 0, local3.anInt1425);
		return local3;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
	public void method954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray18, 0, this.anInt1425, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray18, 0, this.anInt1425);
		}
		arg2.drawString(local9, arg1, arg0);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IBLclient!je;)I")
	private int method955(@OriginalArg(2) Class40 arg0) {
		@Pc(5) int[] local5 = new int[arg0.anInt1425];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg0.anInt1425];
		for (@Pc(25) int local25 = 0; local25 < local12.length; local25++) {
			local12[local25] = arg0.anInt1425;
		}
		for (@Pc(39) int local39 = 1; local39 <= arg0.anInt1425; local39++) {
			local5[local39 - 1] = (arg0.anInt1425 << 1) - local39;
			local12[arg0.aByteArray18[local39 - 1] & 0xFF] = arg0.anInt1425 - local39;
		}
		@Pc(82) int local82 = arg0.anInt1425 + 1;
		@Pc(85) int local85 = arg0.anInt1425;
		while (local85 > 0) {
			local16[local85 - 1] = local82;
			while (local82 <= arg0.anInt1425 && arg0.aByteArray18[local85 - 1] != arg0.aByteArray18[local82 - 1]) {
				if (arg0.anInt1425 - local85 <= local5[local82 + -1]) {
					local5[local82 - 1] = arg0.anInt1425 - local85;
				}
				local82 = local16[local82 - 1];
			}
			local85--;
			local82--;
		}
		@Pc(149) int local149 = 1;
		@Pc(151) int local151 = local82;
		@Pc(153) int local153 = 0;
		local82 = arg0.anInt1425 + 1 - local82;
		@Pc(163) int local163 = 1;
		while (local82 >= local163) {
			local16[local163 - 1] = local153;
			while (local153 >= 1 && arg0.aByteArray18[local163 - 1] != arg0.aByteArray18[local153 - 1]) {
				local153 = local16[local153 - 1];
			}
			local163++;
			local153++;
		}
		@Pc(210) int local210;
		while (local151 < arg0.anInt1425) {
			for (local210 = local149; local210 <= local151; local210++) {
				if (local5[local210 - 1] >= arg0.anInt1425 + local151 - local210) {
					local5[local210 - 1] = local151 + arg0.anInt1425 - local210;
				}
			}
			local149 = local151 + 1;
			local151 = local151 + local82 - local16[local82 - 1];
			local82 = local16[local82 - 1];
		}
		@Pc(288) int local288;
		for (local210 = arg0.anInt1425 - 1; local210 < this.anInt1425; local210 += Math.max(local12[this.aByteArray18[local210] & 0xFF], local5[local288])) {
			for (local288 = arg0.anInt1425 - 1; local288 >= 0 && this.aByteArray18[local210] == arg0.aByteArray18[local288]; local288--) {
				local210--;
			}
			if (local288 == -1) {
				return local210 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)I")
	public int method956() {
		@Pc(5) int local5 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt1425; local14++) {
			local5 = (local5 << 5) + (this.aByteArray18[local14] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!je", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!je;B)Z")
	public boolean method957(@OriginalArg(0) Class40 arg0) {
		if (this.anInt1425 < arg0.anInt1425) {
			return false;
		}
		@Pc(30) int local30 = this.anInt1425 - arg0.anInt1425;
		for (@Pc(32) int local32 = 0; local32 < arg0.anInt1425; local32++) {
			if (this.aByteArray18[local32 + local30] != arg0.aByteArray18[local32]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Lclient!je;B)Z")
	public boolean method959(@OriginalArg(0) Class40 arg0) {
		if (this.anInt1425 < arg0.anInt1425) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt1425; local14++) {
			if (arg0.aByteArray18[local14] != this.aByteArray18[local14]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!je;I)Z")
	public boolean method960(@OriginalArg(0) Class40 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1425 == arg0.anInt1425) {
			if (!this.aBoolean102 || !arg0.aBoolean102) {
				if (this.anInt1462 == 0) {
					this.anInt1462 = this.method956();
					if (this.anInt1462 == 0) {
						this.anInt1462 = 1;
					}
				}
				if (arg0.anInt1462 == 0) {
					arg0.anInt1462 = arg0.method956();
					if (arg0.anInt1462 == 0) {
						arg0.anInt1462 = 1;
					}
				}
				if (arg0.anInt1462 != this.anInt1462) {
					return false;
				}
			}
			for (@Pc(78) int local78 = 0; local78 < this.anInt1425; local78++) {
				if (arg0.aByteArray18[local78] != this.aByteArray18[local78]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!je", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method956();
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(B)Lclient!je;")
	public Class40 method961() {
		if (!this.aBoolean102) {
			throw new IllegalArgumentException();
		}
		this.anInt1462 = 0;
		if (this.aByteArray18.length != this.anInt1425) {
			@Pc(35) byte[] local35 = new byte[this.anInt1425];
			Static141.method1907(this.aByteArray18, 0, local35, 0, this.anInt1425);
			this.aByteArray18 = local35;
		}
		return this;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)Lclient!je;")
	public Class40 method962() {
		@Pc(14) Class40 local14 = new Class40();
		local14.anInt1425 = this.anInt1425;
		local14.aByteArray18 = new byte[this.anInt1425];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1425; local25++) {
			local14.aByteArray18[local25] = 42;
		}
		return local14;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(Lclient!je;B)I")
	public int method963(@OriginalArg(0) Class40 arg0) {
		@Pc(13) int local13;
		if (this.anInt1425 <= arg0.anInt1425) {
			local13 = this.anInt1425;
		} else {
			local13 = arg0.anInt1425;
		}
		for (@Pc(25) int local25 = 0; local25 < local13; local25++) {
			if (Static30.anIntArray84[arg0.aByteArray18[local25] & 0xFF] > Static30.anIntArray84[this.aByteArray18[local25] & 0xFF]) {
				return -1;
			}
			if (Static30.anIntArray84[this.aByteArray18[local25] & 0xFF] > Static30.anIntArray84[arg0.aByteArray18[local25] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt1425 > this.anInt1425) {
			return -1;
		} else if (arg0.anInt1425 < this.anInt1425) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(B)Lclient!je;")
	public Class40 method964() {
		@Pc(7) int local7;
		for (local7 = 0; this.anInt1425 > local7 && (this.aByteArray18[local7] >= 0 && this.aByteArray18[local7] <= 32 || (this.aByteArray18[local7] & 0xFF) == 160); local7++) {
		}
		@Pc(47) int local47;
		for (local47 = this.anInt1425; local7 < local47 && (this.aByteArray18[local47 - 1] >= 0 && this.aByteArray18[local47 - 1] <= 32 || (this.aByteArray18[local47 - 1] & 0xFF) == 160); local47--) {
		}
		if (local7 == 0 && local47 == this.anInt1425) {
			return this;
		}
		@Pc(112) Class40 local112 = new Class40();
		local112.anInt1425 = local47 - local7;
		local112.aByteArray18 = new byte[local112.anInt1425];
		for (@Pc(125) int local125 = 0; local125 < local112.anInt1425; local125++) {
			local112.aByteArray18[local125] = this.aByteArray18[local7 + local125];
		}
		return local112;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)Lclient!je;")
	public Class40 method965() {
		@Pc(7) Class40 local7 = new Class40();
		local7.anInt1425 = this.anInt1425;
		local7.aByteArray18 = new byte[this.anInt1425];
		@Pc(23) boolean local23 = true;
		for (@Pc(25) int local25 = 0; local25 < this.anInt1425; local25++) {
			@Pc(31) byte local31 = this.aByteArray18[local25];
			if (local31 == 95) {
				local23 = true;
				local7.aByteArray18[local25] = 32;
			} else if (local31 >= 97 && local31 <= 122 && local23) {
				local7.aByteArray18[local25] = (byte) (local31 - 32);
				local23 = false;
			} else {
				local23 = false;
				local7.aByteArray18[local25] = local31;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/awt/FontMetrics;Z)I")
	public int method966(@OriginalArg(0) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray18, 0, this.anInt1425, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local13 = new String(this.aByteArray18, 0, this.anInt1425);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)Lclient!je;")
	public Class40 method967() {
		@Pc(9) Class40 local9 = new Class40();
		@Pc(11) byte local11 = 2;
		local9.anInt1425 = this.anInt1425;
		local9.aByteArray18 = new byte[this.anInt1425];
		for (@Pc(28) int local28 = 0; local28 < this.anInt1425; local28++) {
			@Pc(35) byte local35 = this.aByteArray18[local28];
			if (local35 >= 97 && local35 <= 122 || !(local35 < -32 || local35 > -2 || local35 == -9)) {
				if (local11 == 2) {
					local35 = (byte) (local35 - 32);
				}
				local11 = 0;
			} else if (local35 >= 65 && local35 <= 90 || !(local35 < -64 || local35 > -34 || local35 == -41)) {
				if (local11 == 0) {
					local35 = (byte) (local35 + 32);
				}
				local11 = 0;
			} else if (local35 == 46 || local35 == 33 || local35 == 63) {
				local11 = 2;
			} else if (local35 != 32) {
				local11 = 1;
			} else if (local11 != 2) {
				local11 = 1;
			}
			local9.aByteArray18[local28] = local35;
		}
		return local9;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lclient!je;")
	public Class40 method968(@OriginalArg(0) int arg0) {
		return this.method953(arg0, this.anInt1425);
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(I)J")
	private long method969() {
		@Pc(6) long local6 = (long) 0;
		for (@Pc(8) int local8 = 0; local8 < this.anInt1425; local8++) {
			local6 = (local6 << 5) + (long) (this.aByteArray18[local8] & 0xFF) - local6;
		}
		return local6;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)I")
	public int method970(@OriginalArg(1) int arg0) {
		return this.method987(arg0);
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(I)Lclient!je;")
	public Class40 method971() {
		@Pc(7) long local7 = this.method969();
		@Pc(16) Class local16 = je.class;
		synchronized (je.class) {
			@Pc(26) Class2_Sub12 local26;
			if (Static108.aClass77_12 == null) {
				Static108.aClass77_12 = new Class77(4096);
			} else {
				for (local26 = (Class2_Sub12) Static108.aClass77_12.method2034(local7); local26 != null; local26 = (Class2_Sub12) Static108.aClass77_12.method2040()) {
					if (this.method960(local26.aClass40_755)) {
						return local26.aClass40_755;
					}
				}
			}
			local26 = new Class2_Sub12();
			local26.aClass40_755 = this;
			this.aBoolean102 = false;
			Static108.aClass77_12.method2030(local7, local26);
			return this;
		}
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(B)I")
	public int method974() {
		return this.method975(10);
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(II)I")
	public int method975(@OriginalArg(0) int arg0) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt1425; local29++) {
			@Pc(38) int local38 = this.aByteArray18[local29] & 0xFF;
			if (local29 == 0) {
				if (local38 == 45) {
					local15 = true;
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
				throw new NumberFormatException();
			}
			if (arg0 <= local38) {
				throw new NumberFormatException();
			}
			if (local15) {
				local38 = -local38;
			}
			@Pc(113) int local113 = local38 + local19 * arg0;
			if (local19 != local113 / arg0) {
				throw new NumberFormatException();
			}
			local17 = true;
			local19 = local113;
		}
		if (!local17) {
			throw new NumberFormatException();
		}
		return local19;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!je;)I")
	public int method976(@OriginalArg(1) Class40 arg0) {
		@Pc(17) int local17;
		if (arg0.anInt1425 < this.anInt1425) {
			local17 = arg0.anInt1425;
		} else {
			local17 = this.anInt1425;
		}
		for (@Pc(24) int local24 = 0; local24 < local17; local24++) {
			if ((arg0.aByteArray18[local24] & 0xFF) > (this.aByteArray18[local24] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray18[local24] & 0xFF) > (arg0.aByteArray18[local24] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt1425 < arg0.anInt1425) {
			return -1;
		} else if (this.anInt1425 > arg0.anInt1425) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Lclient!je;I)I")
	public int method977(@OriginalArg(0) Class40 arg0) {
		return this.method955(arg0);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I[BIII)I")
	public int method978(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static141.method1907(this.aByteArray18, 0, arg0, arg2, arg1);
		return arg1;
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(B)Z")
	public boolean method980() {
		return this.method986();
	}

	@OriginalMember(owner = "client!je", name = "g", descriptor = "(B)J")
	public long method981() {
		@Pc(7) long local7 = 0L;
		for (@Pc(16) int local16 = 0; this.anInt1425 > local16 && local16 < 12; local16++) {
			@Pc(23) byte local23 = this.aByteArray18[local16];
			local7 *= 37L;
			if (local23 >= 65 && local23 <= 90) {
				local7 += local23 + 1 - 65;
			} else if (local23 >= 97 && local23 <= 122) {
				local7 += local23 + 1 - 97;
			} else if (local23 >= 48 && local23 <= 57) {
				local7 += local23 + 27 - 48;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!je", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class40)) {
			throw new IllegalArgumentException();
		}
		return this.method960((Class40) arg0);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)I")
	public int method982(@OriginalArg(0) int arg0) {
		return this.aByteArray18[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)Lclient!je;")
	public Class40 method983(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(22) Class40 local22 = new Class40();
		local22.aByteArray18 = new byte[this.anInt1425 + 1];
		local22.anInt1425 = this.anInt1425 + 1;
		Static141.method1907(this.aByteArray18, 0, local22.aByteArray18, 0, this.anInt1425);
		local22.aByteArray18[this.anInt1425] = (byte) arg0;
		return local22;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(ILclient!je;)Z")
	public boolean method984(@OriginalArg(1) Class40 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1425 == arg0.anInt1425) {
			for (@Pc(31) int local31 = 0; local31 < this.anInt1425; local31++) {
				@Pc(38) byte local38 = this.aByteArray18[local31];
				@Pc(43) byte local43 = arg0.aByteArray18[local31];
				if (local38 >= 65 && local38 <= 90 || local38 >= -64 && local38 <= -34 && local38 != -41) {
					local38 = (byte) (local38 + 32);
				}
				if (local43 >= 65 && local43 <= 90 || local43 >= -64 && local43 <= -34 && local43 != -41) {
					local43 = (byte) (local43 + 32);
				}
				if (local43 != local38) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(I)Lclient!je;")
	public Class40 method985() {
		@Pc(9) Class40 local9 = new Class40();
		local9.anInt1425 = this.anInt1425;
		local9.aByteArray18 = new byte[this.anInt1425];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1425; local25++) {
			@Pc(32) byte local32 = this.aByteArray18[local25];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local9.aByteArray18[local25] = local32;
		}
		return local9;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZ)Z")
	private boolean method986() {
		@Pc(3) boolean local3 = false;
		@Pc(15) int local15 = 0;
		@Pc(21) boolean local21 = false;
		for (@Pc(23) int local23 = 0; local23 < this.anInt1425; local23++) {
			@Pc(32) int local32 = this.aByteArray18[local23] & 0xFF;
			if (local23 == 0) {
				if (local32 == 45) {
					local21 = true;
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
				return false;
			}
			if (local32 >= 10) {
				return false;
			}
			if (local21) {
				local32 = -local32;
			}
			@Pc(91) int local91 = local32 + local15 * 10;
			if (local91 / 10 != local15) {
				return false;
			}
			local15 = local91;
			local3 = true;
		}
		return local3;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(III)I")
	private int method987(@OriginalArg(1) int arg0) {
		@Pc(4) byte local4 = (byte) arg0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt1425; local14++) {
			if (local4 == this.aByteArray18[local14]) {
				return local14;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(II)Lclient!je;")
	public Class40 method988(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean102) {
			this.anInt1462 = 0;
			if (this.anInt1425 == this.aByteArray18.length) {
				@Pc(46) int local46;
				for (local46 = 1; local46 <= this.anInt1425; local46 += local46) {
				}
				@Pc(63) byte[] local63 = new byte[local46];
				Static141.method1907(this.aByteArray18, 0, local63, 0, this.anInt1425);
				this.aByteArray18 = local63;
			}
			this.aByteArray18[this.anInt1425++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!je", name = "h", descriptor = "(B)Lclient!je;")
	public Class40 method989() {
		@Pc(18) int local18 = 0;
		@Pc(22) Class40 local22 = new Class40();
		local22.aByteArray18 = new byte[12];
		local22.anInt1425 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt1425; local31++) {
			if (this.aByteArray18[local31] >= 65 && this.aByteArray18[local31] <= 90) {
				local22.aByteArray18[local18++] = (byte) (this.aByteArray18[local31] + 97 - 65);
				local22.anInt1425 = local18;
			} else if (this.aByteArray18[local31] >= 97 && this.aByteArray18[local31] <= 122 || this.aByteArray18[local31] >= 48 && this.aByteArray18[local31] <= 57) {
				local22.aByteArray18[local18++] = this.aByteArray18[local31];
				local22.anInt1425 = local18;
			} else if (local18 > 0) {
				local22.aByteArray18[local18++] = 95;
			}
			if (local18 == 12) {
				break;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!je", name = "h", descriptor = "(I)Ljava/net/URL;")
	public URL method991() throws MalformedURLException {
		return new URL(new String(this.aByteArray18, 0, this.anInt1425));
	}
}
