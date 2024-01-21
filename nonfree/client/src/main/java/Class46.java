import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class46 implements Interface2 {

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
	public int anInt2034;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
	private int anInt2042;

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Z")
	private boolean aBoolean85 = true;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)J")
	public long method1348() {
		@Pc(7) long local7 = 0L;
		for (@Pc(9) int local9 = 0; this.anInt2034 > local9 && local9 < 12; local9++) {
			local7 *= 37L;
			@Pc(28) byte local28 = this.aByteArray17[local9];
			if (local28 >= 65 && local28 <= 90) {
				local7 += local28 + 1 - 65;
			} else if (local28 >= 97 && local28 <= 122) {
				local7 += local28 + 1 - 97;
			} else if (local28 >= 48 && local28 <= 57) {
				local7 += local28 + 27 - 48;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)[B")
	public byte[] method1349() {
		@Pc(7) byte[] local7 = new byte[this.anInt2034];
		Static184.method1309(this.aByteArray17, 0, local7, 0, this.anInt2034);
		return local7;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!kb;)Z")
	public boolean method1351(@OriginalArg(1) Class46 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2034 == arg0.anInt2034) {
			if (!this.aBoolean85 || !arg0.aBoolean85) {
				if (this.anInt2042 == 0) {
					this.anInt2042 = this.method1365();
					if (this.anInt2042 == 0) {
						this.anInt2042 = 1;
					}
				}
				if (arg0.anInt2042 == 0) {
					arg0.anInt2042 = arg0.method1365();
					if (arg0.anInt2042 == 0) {
						arg0.anInt2042 = 1;
					}
				}
				if (this.anInt2042 != arg0.anInt2042) {
					return false;
				}
			}
			for (@Pc(79) int local79 = 0; local79 < this.anInt2034; local79++) {
				if (this.aByteArray17[local79] != arg0.aByteArray17[local79]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)J")
	private long method1352() {
		@Pc(1) long local1 = 0L;
		for (@Pc(3) int local3 = 0; local3 < this.anInt2034; local3++) {
			local1 = (local1 << 5) + (long) (this.aByteArray17[local3] & 0xFF) - local1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)Lclient!kb;")
	public Class46 method1353() {
		@Pc(16) Class46 local16 = new Class46();
		local16.anInt2034 = this.anInt2034;
		local16.aByteArray17 = new byte[this.anInt2034];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2034; local27++) {
			@Pc(34) byte local34 = this.aByteArray17[local27];
			if (local34 >= 65 && local34 <= 90 || local34 >= -64 && local34 <= -34 && local34 != -41) {
				local34 = (byte) (local34 + 32);
			}
			local16.aByteArray17[local27] = local34;
		}
		return local16;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(BLclient!kb;)I")
	public int method1355(@OriginalArg(1) Class46 arg0) {
		return this.method1383(arg0, 0);
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)Z")
	public boolean method1356() {
		return this.method1369();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)I")
	public int method1357(@OriginalArg(1) int arg0) {
		return this.aByteArray17[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)Lclient!kb;")
	public Class46 method1358(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(20) Class46 local20 = new Class46();
		local20.aByteArray17 = new byte[this.anInt2034 + 1];
		local20.anInt2034 = this.anInt2034 + 1;
		Static184.method1309(this.aByteArray17, 0, local20.aByteArray17, 0, this.anInt2034);
		local20.aByteArray17[this.anInt2034] = (byte) arg0;
		return local20;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Lclient!kb;")
	public Class46 method1361(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean85) {
			this.anInt2042 = 0;
			if (this.aByteArray17.length == this.anInt2034) {
				@Pc(45) int local45;
				for (local45 = 1; local45 <= this.anInt2034; local45 += local45) {
				}
				@Pc(62) byte[] local62 = new byte[local45];
				Static184.method1309(this.aByteArray17, 0, local62, 0, this.anInt2034);
				this.aByteArray17 = local62;
			}
			this.aByteArray17[this.anInt2034++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method1362(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2) {
		@Pc(21) String local21;
		try {
			local21 = new String(this.aByteArray17, 0, this.anInt2034, "ISO-8859-1");
		} catch (@Pc(23) UnsupportedEncodingException local23) {
			local21 = new String(this.aByteArray17, 0, this.anInt2034);
		}
		arg1.drawString(local21, arg2, arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BII)Lclient!kb;")
	public Class46 method1363(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class46 local7 = new Class46();
		local7.anInt2034 = arg0 - arg1;
		local7.aByteArray17 = new byte[arg0 - arg1];
		Static184.method1309(this.aByteArray17, arg1, local7.aByteArray17, 0, local7.anInt2034);
		return local7;
	}

	@OriginalMember(owner = "client!kb", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class46)) {
			throw new IllegalArgumentException();
		}
		return this.method1351((Class46) arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)Lclient!kb;")
	public Class46 method1364() {
		@Pc(5) Class46 local5 = new Class46();
		local5.anInt2034 = this.anInt2034;
		@Pc(15) byte local15 = 2;
		local5.aByteArray17 = new byte[this.anInt2034];
		for (@Pc(22) int local22 = 0; local22 < this.anInt2034; local22++) {
			@Pc(29) byte local29 = this.aByteArray17[local22];
			if (local29 >= 97 && local29 <= 122 || local29 >= -32 && local29 <= -2 && local29 != -9) {
				if (local15 == 2) {
					local29 = (byte) (local29 - 32);
				}
				local15 = 0;
			} else if (local29 >= 65 && local29 <= 90 || !(local29 < -64 || local29 > -34 || local29 == -41)) {
				if (local15 == 0) {
					local29 = (byte) (local29 + 32);
				}
				local15 = 0;
			} else if (local29 == 46 || local29 == 33 || local29 == 63) {
				local15 = 2;
			} else if (local29 != 32) {
				local15 = 1;
			} else if (local15 != 2) {
				local15 = 1;
			}
			local5.aByteArray17[local22] = local29;
		}
		return local5;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)I")
	public int method1365() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2034; local7++) {
			local5 = (this.aByteArray17[local7] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!kb;)Z")
	public boolean method1367(@OriginalArg(1) Class46 arg0) {
		if (this.anInt2034 < arg0.anInt2034) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt2034; local14++) {
			if (this.aByteArray17[local14] != arg0.aByteArray17[local14]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBI)I")
	public int method1368(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte local8 = (byte) arg1;
		for (@Pc(15) int local15 = arg0; local15 < this.anInt2034; local15++) {
			if (local8 == this.aByteArray17[local15]) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)Z")
	private boolean method1369() {
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2034; local23++) {
			@Pc(32) int local32 = this.aByteArray17[local23] & 0xFF;
			if (local23 == 0) {
				if (local32 == 45) {
					local17 = true;
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
			if (local17) {
				local32 = -local32;
			}
			@Pc(101) int local101 = local32 + local21 * 10;
			if (local21 != local101 / 10) {
				return false;
			}
			local19 = true;
			local21 = local101;
		}
		return local19;
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(B)Lclient!kb;")
	public Class46 method1370() {
		@Pc(13) long local13 = this.method1352();
		@Pc(22) Class local22 = kb.class;
		synchronized (kb.class) {
			@Pc(32) Class3_Sub10 local32;
			if (Static50.aClass54_5 == null) {
				Static50.aClass54_5 = new Class54(4096);
			} else {
				for (local32 = (Class3_Sub10) Static50.aClass54_5.method1602(local13); local32 != null; local32 = (Class3_Sub10) Static50.aClass54_5.method1600()) {
					if (this.method1351(local32.aClass46_537)) {
						return local32.aClass46_537;
					}
				}
			}
			local32 = new Class3_Sub10();
			local32.aClass46_537 = this;
			this.aBoolean85 = false;
			Static50.aClass54_5.method1603(local13, local32);
			return this;
		}
	}

	@OriginalMember(owner = "client!kb", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1365();
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(B)Lclient!kb;")
	public Class46 method1371() {
		@Pc(9) Class46 local9 = new Class46();
		@Pc(11) boolean local11 = true;
		local9.anInt2034 = this.anInt2034;
		local9.aByteArray17 = new byte[this.anInt2034];
		for (@Pc(22) int local22 = 0; local22 < this.anInt2034; local22++) {
			@Pc(29) byte local29 = this.aByteArray17[local22];
			if (local29 == 95) {
				local11 = true;
				local9.aByteArray17[local22] = 32;
			} else if (local29 >= 97 && local29 <= 122 && local11) {
				local9.aByteArray17[local22] = (byte) (local29 - 32);
				local11 = false;
			} else {
				local9.aByteArray17[local22] = local29;
				local11 = false;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)Lclient!kb;")
	public Class46 method1372() {
		@Pc(14) Class46 local14 = new Class46();
		local14.anInt2034 = 0;
		@Pc(19) int local19 = 0;
		local14.aByteArray17 = new byte[12];
		for (@Pc(25) int local25 = 0; local25 < this.anInt2034; local25++) {
			if (this.aByteArray17[local25] >= 65 && this.aByteArray17[local25] <= 90) {
				local14.aByteArray17[local19++] = (byte) (this.aByteArray17[local25] + 32);
				local14.anInt2034 = local19;
			} else if (this.aByteArray17[local25] >= 97 && this.aByteArray17[local25] <= 122 || this.aByteArray17[local25] >= 48 && this.aByteArray17[local25] <= 57) {
				local14.aByteArray17[local19++] = this.aByteArray17[local25];
				local14.anInt2034 = local19;
			} else if (local19 > 0) {
				local14.aByteArray17[local19++] = 95;
			}
			if (local19 == 12) {
				break;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!kb;I)I")
	public int method1373(@OriginalArg(0) Class46 arg0) {
		@Pc(9) int local9;
		if (arg0.anInt2034 < this.anInt2034) {
			local9 = arg0.anInt2034;
		} else {
			local9 = this.anInt2034;
		}
		for (@Pc(20) int local20 = 0; local20 < local9; local20++) {
			if (Static78.anIntArray241[this.aByteArray17[local20] & 0xFF] < Static78.anIntArray241[arg0.aByteArray17[local20] & 0xFF]) {
				return -1;
			}
			if (Static78.anIntArray241[arg0.aByteArray17[local20] & 0xFF] < Static78.anIntArray241[this.aByteArray17[local20] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt2034 > this.anInt2034) {
			return -1;
		} else if (this.anInt2034 > arg0.anInt2034) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZLjava/awt/FontMetrics;)I")
	public int method1374(@OriginalArg(1) FontMetrics arg0) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray17, 0, this.anInt2034, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray17, 0, this.anInt2034);
		}
		return arg0.stringWidth(local18);
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)Lclient!kb;")
	public Class46 method1375() {
		@Pc(15) Class46 local15 = new Class46();
		local15.anInt2034 = this.anInt2034;
		local15.aByteArray17 = new byte[this.anInt2034];
		for (@Pc(26) int local26 = 0; local26 < this.anInt2034; local26++) {
			local15.aByteArray17[local26] = 42;
		}
		return local15;
	}

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "(I)I")
	public int method1376() {
		return this.anInt2034;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(Z)Ljava/net/URL;")
	public URL method1377() throws MalformedURLException {
		return new URL(new String(this.aByteArray17, 0, this.anInt2034));
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(ILclient!kb;)I")
	public int method1378(@OriginalArg(1) Class46 arg0) {
		@Pc(17) int local17;
		if (this.anInt2034 <= arg0.anInt2034) {
			local17 = this.anInt2034;
		} else {
			local17 = arg0.anInt2034;
		}
		for (@Pc(24) int local24 = 0; local24 < local17; local24++) {
			if ((this.aByteArray17[local24] & 0xFF) < (arg0.aByteArray17[local24] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray17[local24] & 0xFF) > (arg0.aByteArray17[local24] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.anInt2034 > this.anInt2034) {
			return -1;
		} else if (arg0.anInt2034 < this.anInt2034) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "(I)Lclient!kb;")
	public Class46 method1379() {
		@Pc(3) int local3 = 0;
		@Pc(6) int local6 = this.anInt2034;
		while (local3 < this.anInt2034 && (this.aByteArray17[local3] >= 0 && this.aByteArray17[local3] <= 32 || (this.aByteArray17[local3] & 0xFF) == 160)) {
			local3++;
		}
		while (local3 < local6 && (this.aByteArray17[local6 - 1] >= 0 && this.aByteArray17[local6 - 1] <= 32 || (this.aByteArray17[local6 - 1] & 0xFF) == 160)) {
			local6--;
		}
		if (local3 == 0 && local6 == this.anInt2034) {
			return this;
		}
		@Pc(87) Class46 local87 = new Class46();
		local87.anInt2034 = local6 - local3;
		local87.aByteArray17 = new byte[local87.anInt2034];
		for (@Pc(99) int local99 = 0; local99 < local87.anInt2034; local99++) {
			local87.aByteArray17[local99] = this.aByteArray17[local99 + local3];
		}
		return local87;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)Lclient!kb;")
	public Class46 method1380(@OriginalArg(1) int arg0) {
		return this.method1363(this.anInt2034, arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BZIII)I")
	public int method1381(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static184.method1309(this.aByteArray17, 0, arg0, arg2, arg1);
		return arg1;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(Lclient!kb;I)Lclient!kb;")
	public Class46 method1382(@OriginalArg(0) Class46 arg0) {
		if (!this.aBoolean85) {
			throw new IllegalArgumentException();
		}
		this.anInt2042 = 0;
		if (this.aByteArray17.length < arg0.anInt2034 + this.anInt2034) {
			@Pc(31) int local31;
			for (local31 = 1; local31 < arg0.anInt2034 + this.anInt2034; local31 += local31) {
			}
			@Pc(47) byte[] local47 = new byte[local31];
			Static184.method1309(this.aByteArray17, 0, local47, 0, this.anInt2034);
			this.aByteArray17 = local47;
		}
		Static184.method1309(arg0.aByteArray17, 0, this.aByteArray17, this.anInt2034, arg0.anInt2034);
		this.anInt2034 += arg0.anInt2034;
		return this;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!kb;I)I")
	public int method1383(@OriginalArg(1) Class46 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int[] local9 = new int[arg0.anInt2034];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg0.anInt2034];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg0.anInt2034;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg0.anInt2034; local36++) {
			local9[local36 - 1] = (arg0.anInt2034 << 1) - local36;
			local12[arg0.aByteArray17[local36 - 1] & 0xFF] = arg0.anInt2034 - local36;
		}
		@Pc(74) int local74 = arg0.anInt2034 + 1;
		for (@Pc(77) int local77 = arg0.anInt2034; local77 > 0; local77--) {
			local16[local77 - 1] = local74;
			while (local74 <= arg0.anInt2034 && arg0.aByteArray17[local77 - 1] != arg0.aByteArray17[local74 - 1]) {
				if (local9[local74 - 1] >= arg0.anInt2034 - local77) {
					local9[local74 - 1] = arg0.anInt2034 - local77;
				}
				local74 = local16[local74 - 1];
			}
			local74--;
		}
		@Pc(141) int local141 = local74;
		local74 = arg0.anInt2034 + 1 - local74;
		@Pc(150) int local150 = 1;
		@Pc(152) int local152 = 0;
		for (@Pc(154) int local154 = 1; local154 <= local74; local154++) {
			local16[local154 - 1] = local152;
			while (local152 >= 1 && arg0.aByteArray17[local152 - 1] != arg0.aByteArray17[local154 - 1]) {
				local152 = local16[local152 - 1];
			}
			local152++;
		}
		@Pc(195) int local195;
		while (arg0.anInt2034 > local141) {
			for (local195 = local150; local195 <= local141; local195++) {
				if (local9[local195 - 1] >= local141 + arg0.anInt2034 - local195) {
					local9[local195 - 1] = local141 + arg0.anInt2034 - local195;
				}
			}
			local150 = local141 + 1;
			local141 = local74 + local141 - local16[local74 + -1];
			local74 = local16[local74 - 1];
		}
		@Pc(269) int local269;
		for (local195 = arg1 + arg0.anInt2034 - 1; local195 < this.anInt2034; local195 += Math.max(local12[this.aByteArray17[local195] & 0xFF], local9[local269])) {
			for (local269 = arg0.anInt2034 - 1; local269 >= 0 && this.aByteArray17[local195] == arg0.aByteArray17[local269]; local269--) {
				local195--;
			}
			if (local269 == -1) {
				return local195 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)I")
	public int method1384(@OriginalArg(1) int arg0) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		for (@Pc(33) int local33 = 0; local33 < this.anInt2034; local33++) {
			@Pc(42) int local42 = this.aByteArray17[local33] & 0xFF;
			if (local33 == 0) {
				if (local42 == 45) {
					local15 = true;
					continue;
				}
				if (local42 == 43) {
					continue;
				}
			}
			if (local42 >= 48 && local42 <= 57) {
				local42 -= 48;
			} else if (local42 >= 65 && local42 <= 90) {
				local42 -= 55;
			} else if (local42 >= 97 && local42 <= 122) {
				local42 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local42) {
				throw new NumberFormatException();
			}
			if (local15) {
				local42 = -local42;
			}
			@Pc(117) int local117 = local19 * arg0 + local42;
			if (local19 != local117 / arg0) {
				throw new NumberFormatException();
			}
			local19 = local117;
			local17 = true;
		}
		if (!local17) {
			throw new NumberFormatException();
		}
		return local19;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(ILclient!kb;)Z")
	public boolean method1385(@OriginalArg(1) Class46 arg0) {
		if (arg0.anInt2034 > this.anInt2034) {
			return false;
		}
		@Pc(23) int local23 = this.anInt2034 - arg0.anInt2034;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2034; local25++) {
			if (arg0.aByteArray17[local25] != this.aByteArray17[local25 + local23]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "(B)I")
	public int method1386() {
		return this.method1384(10);
	}

	@OriginalMember(owner = "client!kb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(ILclient!kb;)Z")
	public boolean method1389(@OriginalArg(1) Class46 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2034 == arg0.anInt2034) {
			for (@Pc(25) int local25 = 0; local25 < this.anInt2034; local25++) {
				@Pc(31) byte local31 = this.aByteArray17[local25];
				if (local31 >= 65 && local31 <= 90 || local31 >= -64 && local31 <= -34 && local31 != -41) {
					local31 = (byte) (local31 + 32);
				}
				@Pc(62) byte local62 = arg0.aByteArray17[local25];
				if (local62 >= 65 && local62 <= 90 || local62 >= -64 && local62 <= -34 && local62 != -41) {
					local62 = (byte) (local62 + 32);
				}
				if (local31 != local62) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "(I)Lclient!kb;")
	public Class46 method1390() {
		if (!this.aBoolean85) {
			throw new IllegalArgumentException();
		}
		this.anInt2042 = 0;
		if (this.aByteArray17.length != this.anInt2034) {
			@Pc(23) byte[] local23 = new byte[this.anInt2034];
			Static184.method1309(this.aByteArray17, 0, local23, 0, this.anInt2034);
			this.aByteArray17 = local23;
		}
		return this;
	}
}
