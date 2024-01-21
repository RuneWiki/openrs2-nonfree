import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class25 implements Interface1 {

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
	public int anInt956;

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "[B")
	public byte[] aByteArray15;

	@OriginalMember(owner = "client!fc", name = "cb", descriptor = "I")
	private int anInt998;

	@OriginalMember(owner = "client!fc", name = "O", descriptor = "Z")
	private boolean aBoolean38 = true;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method759(@OriginalArg(0) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray15, 0, this.anInt956, "ISO-8859-1");
		} catch (@Pc(22) UnsupportedEncodingException local22) {
			local13 = new String(this.aByteArray15, 0, this.anInt956);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!fc", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class25)) {
			throw new IllegalArgumentException();
		}
		return this.method787((Class25) arg0);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Lclient!fc;")
	public Class25 method761() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class25 local16 = new Class25();
		local16.anInt956 = 0;
		local16.aByteArray15 = new byte[12];
		for (@Pc(25) int local25 = 0; local25 < this.anInt956; local25++) {
			if (this.aByteArray15[local25] >= 65 && this.aByteArray15[local25] <= 90) {
				local16.aByteArray15[local12++] = (byte) (this.aByteArray15[local25] + 97 - 65);
				local16.anInt956 = local12;
			} else if (this.aByteArray15[local25] >= 97 && this.aByteArray15[local25] <= 122 || this.aByteArray15[local25] >= 48 && this.aByteArray15[local25] <= 57) {
				local16.aByteArray15[local12++] = this.aByteArray15[local25];
				local16.anInt956 = local12;
			} else if (local12 > 0) {
				local16.aByteArray15[local12++] = 95;
			}
			if (local12 == 12) {
				break;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)I")
	public int method762() {
		return this.anInt956;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
	public int method763(@OriginalArg(0) int arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(26) int local26 = 0;
		@Pc(28) boolean local28 = false;
		for (@Pc(30) int local30 = 0; local30 < this.anInt956; local30++) {
			@Pc(39) int local39 = this.aByteArray15[local30] & 0xFF;
			if (local30 == 0) {
				if (local39 == 45) {
					local7 = true;
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
				throw new NumberFormatException();
			}
			if (arg0 <= local39) {
				throw new NumberFormatException();
			}
			if (local7) {
				local39 = -local39;
			}
			@Pc(108) int local108 = arg0 * local26 + local39;
			if (local26 != local108 / arg0) {
				throw new NumberFormatException();
			}
			local28 = true;
			local26 = local108;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local26;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIB)I")
	private int method764() {
		for (@Pc(10) int local10 = 0; local10 < this.anInt956; local10++) {
			if (this.aByteArray15[local10] == 32) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)Lclient!fc;")
	public Class25 method765() {
		@Pc(3) long local3 = this.method790();
		@Pc(16) Class local16 = fc.class;
		synchronized (fc.class) {
			@Pc(26) Class1_Sub20 local26;
			if (Static69.aClass66_11 == null) {
				Static69.aClass66_11 = new Class66(4096);
			} else {
				for (local26 = (Class1_Sub20) Static69.aClass66_11.method1650(local3); local26 != null; local26 = (Class1_Sub20) Static69.aClass66_11.method1655()) {
					if (this.method787(local26.aClass25_1391)) {
						return local26.aClass25_1391;
					}
				}
			}
			local26 = new Class1_Sub20();
			local26.aClass25_1391 = this;
			this.aBoolean38 = false;
			Static69.aClass66_11.method1653(local26, local3);
			return this;
		}
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)Ljava/net/URL;")
	public URL method766() throws MalformedURLException {
		return new URL(new String(this.aByteArray15, 0, this.anInt956));
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)I")
	public int method767(@OriginalArg(1) int arg0) {
		return this.aByteArray15[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!fc;I)I")
	private int method768(@OriginalArg(1) Class25 arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(12) int[] local12 = new int[arg0.anInt956];
		@Pc(16) int[] local16 = new int[arg0.anInt956];
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			local8[local18] = arg0.anInt956;
		}
		for (@Pc(32) int local32 = 1; local32 <= arg0.anInt956; local32++) {
			local12[local32 - 1] = (arg0.anInt956 << 1) - local32;
			local8[arg0.aByteArray15[local32 - 1] & 0xFF] = arg0.anInt956 - local32;
		}
		@Pc(69) int local69 = arg0.anInt956 + 1;
		for (@Pc(72) int local72 = arg0.anInt956; local72 > 0; local72--) {
			local16[local72 - 1] = local69;
			while (arg0.anInt956 >= local69 && arg0.aByteArray15[local72 - 1] != arg0.aByteArray15[local69 - 1]) {
				if (arg0.anInt956 - local72 <= local12[local69 + -1]) {
					local12[local69 - 1] = arg0.anInt956 - local72;
				}
				local69 = local16[local69 - 1];
			}
			local69--;
		}
		@Pc(145) int local145 = local69;
		@Pc(147) int local147 = 0;
		local69 = arg0.anInt956 + 1 - local69;
		for (@Pc(157) int local157 = 1; local157 <= local69; local157++) {
			local16[local157 - 1] = local147;
			while (local147 >= 1 && arg0.aByteArray15[local157 - 1] != arg0.aByteArray15[local147 - 1]) {
				local147 = local16[local147 - 1];
			}
			local147++;
		}
		@Pc(202) int local202 = 1;
		@Pc(206) int local206;
		while (arg0.anInt956 > local145) {
			for (local206 = local202; local206 <= local145; local206++) {
				if (local12[local206 - 1] >= arg0.anInt956 + local145 - local206) {
					local12[local206 - 1] = arg0.anInt956 + local145 - local206;
				}
			}
			local202 = local145 + 1;
			local145 += local69 - local16[local69 - 1];
			local69 = local16[local69 - 1];
		}
		@Pc(284) int local284;
		for (local206 = arg0.anInt956 - 1; local206 < this.anInt956; local206 += Math.max(local8[this.aByteArray15[local206] & 0xFF], local12[local284])) {
			for (local284 = arg0.anInt956 - 1; local284 >= 0 && this.aByteArray15[local206] == arg0.aByteArray15[local284]; local284--) {
				local206--;
			}
			if (local284 == -1) {
				return local206 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)J")
	public long method770() {
		@Pc(7) long local7 = 0L;
		for (@Pc(17) int local17 = 0; local17 < this.anInt956 && local17 < 12; local17++) {
			@Pc(24) byte local24 = this.aByteArray15[local17];
			local7 *= 37L;
			if (local24 >= 65 && local24 <= 90) {
				local7 += local24 - 64;
			} else if (local24 >= 97 && local24 <= 122) {
				local7 += local24 + 1 - 97;
			} else if (local24 >= 48 && local24 <= 57) {
				local7 += local24 + 27 - 48;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII[B)I")
	public int method771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) byte[] arg2) {
		Static132.method848(this.aByteArray15, 0, arg2, arg1, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)Lclient!fc;")
	public Class25 method772() {
		@Pc(9) Class25 local9 = new Class25();
		@Pc(11) boolean local11 = true;
		local9.anInt956 = this.anInt956;
		local9.aByteArray15 = new byte[this.anInt956];
		for (@Pc(22) int local22 = 0; local22 < this.anInt956; local22++) {
			@Pc(29) byte local29 = this.aByteArray15[local22];
			if (local29 == 95) {
				local11 = true;
				local9.aByteArray15[local22] = 32;
			} else if (local29 >= 97 && local29 <= 122 && local11) {
				local9.aByteArray15[local22] = (byte) (local29 - 32);
				local11 = false;
			} else {
				local9.aByteArray15[local22] = local29;
				local11 = false;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)Lclient!fc;")
	public Class25 method773() {
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.anInt956 && (this.aByteArray15[local5] >= 0 && this.aByteArray15[local5] <= 32 || (this.aByteArray15[local5] & 0xFF) == 160); local5++) {
		}
		@Pc(38) int local38;
		for (local38 = this.anInt956; local5 < local38 && (this.aByteArray15[local38 - 1] >= 0 && this.aByteArray15[local38 - 1] <= 32 || (this.aByteArray15[local38 - 1] & 0xFF) == 160); local38--) {
		}
		if (local5 == 0 && local38 == this.anInt956) {
			return this;
		}
		@Pc(80) Class25 local80 = new Class25();
		local80.anInt956 = local38 - local5;
		local80.aByteArray15 = new byte[local80.anInt956];
		for (@Pc(93) int local93 = 0; local93 < local80.anInt956; local93++) {
			local80.aByteArray15[local93] = this.aByteArray15[local93 + local5];
		}
		return local80;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)Lclient!fc;")
	public Class25 method775() {
		@Pc(3) byte local3 = 2;
		@Pc(7) Class25 local7 = new Class25();
		local7.anInt956 = this.anInt956;
		local7.aByteArray15 = new byte[this.anInt956];
		for (@Pc(23) int local23 = 0; local23 < this.anInt956; local23++) {
			@Pc(30) byte local30 = this.aByteArray15[local23];
			if (local30 >= 97 && local30 <= 122 || local30 >= -32 && local30 <= -2 && local30 != -9) {
				if (local3 == 2) {
					local30 = (byte) (local30 - 32);
				}
				local3 = 0;
			} else if (local30 >= 65 && local30 <= 90 || !(local30 < -64 || local30 > -34 || local30 == -41)) {
				if (local3 == 0) {
					local30 = (byte) (local30 + 32);
				}
				local3 = 0;
			} else if (local30 == 46 || local30 == 33 || local30 == 63) {
				local3 = 2;
			} else if (local30 != 32) {
				local3 = 1;
			} else if (local3 != 2) {
				local3 = 1;
			}
			local7.aByteArray15[local23] = local30;
		}
		return local7;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!fc;)Z")
	public boolean method776(@OriginalArg(1) Class25 arg0) {
		if (this.anInt956 < arg0.anInt956) {
			return false;
		}
		@Pc(23) int local23 = this.anInt956 - arg0.anInt956;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt956; local25++) {
			if (arg0.aByteArray15[local25] != this.aByteArray15[local23 + local25]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)Lclient!fc;")
	public Class25 method777() {
		@Pc(14) Class25 local14 = new Class25();
		local14.anInt956 = this.anInt956;
		local14.aByteArray15 = new byte[this.anInt956];
		for (@Pc(25) int local25 = 0; local25 < this.anInt956; local25++) {
			@Pc(32) byte local32 = this.aByteArray15[local25];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local14.aByteArray15[local25] = local32;
		}
		return local14;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)Lclient!fc;")
	public Class25 method778(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(17) Class25 local17 = new Class25();
		local17.aByteArray15 = new byte[this.anInt956 + 1];
		local17.anInt956 = this.anInt956 + 1;
		Static132.method848(this.aByteArray15, 0, local17.aByteArray15, 0, this.anInt956);
		local17.aByteArray15[this.anInt956] = (byte) arg0;
		return local17;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!fc;)I")
	public int method779(@OriginalArg(1) Class25 arg0) {
		@Pc(18) int local18;
		if (this.anInt956 <= arg0.anInt956) {
			local18 = this.anInt956;
		} else {
			local18 = arg0.anInt956;
		}
		for (@Pc(25) int local25 = 0; local25 < local18; local25++) {
			if ((arg0.aByteArray15[local25] & 0xFF) > (this.aByteArray15[local25] & 0xFF)) {
				return -1;
			}
			if ((arg0.aByteArray15[local25] & 0xFF) < (this.aByteArray15[local25] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.anInt956 > this.anInt956) {
			return -1;
		} else if (arg0.anInt956 < this.anInt956) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLclient!fc;)I")
	public int method780(@OriginalArg(1) Class25 arg0) {
		@Pc(13) int local13;
		if (arg0.anInt956 < this.anInt956) {
			local13 = arg0.anInt956;
		} else {
			local13 = this.anInt956;
		}
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			if (Static48.anIntArray242[this.aByteArray15[local20] & 0xFF] < Static48.anIntArray242[arg0.aByteArray15[local20] & 0xFF]) {
				return -1;
			}
			if (Static48.anIntArray242[this.aByteArray15[local20] & 0xFF] > Static48.anIntArray242[arg0.aByteArray15[local20] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt956 > this.anInt956) {
			return -1;
		} else if (this.anInt956 > arg0.anInt956) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)Lclient!fc;")
	public Class25 method781(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class25 local7 = new Class25();
		local7.aByteArray15 = new byte[arg1 - arg0];
		local7.anInt956 = arg1 - arg0;
		Static132.method848(this.aByteArray15, arg0, local7.aByteArray15, 0, local7.anInt956);
		return local7;
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)I")
	public int method782() {
		return this.method763(10);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(ILclient!fc;)Lclient!fc;")
	public Class25 method783(@OriginalArg(1) Class25 arg0) {
		if (!this.aBoolean38) {
			throw new IllegalArgumentException();
		}
		this.anInt998 = 0;
		if (arg0.anInt956 + this.anInt956 > this.aByteArray15.length) {
			@Pc(26) int local26;
			for (local26 = 1; local26 < arg0.anInt956 + this.anInt956; local26 += local26) {
			}
			@Pc(42) byte[] local42 = new byte[local26];
			Static132.method848(this.aByteArray15, 0, local42, 0, this.anInt956);
			this.aByteArray15 = local42;
		}
		Static132.method848(arg0.aByteArray15, 0, this.aByteArray15, this.anInt956, arg0.anInt956);
		this.anInt956 += arg0.anInt956;
		return this;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(B)Z")
	public boolean method784() {
		return this.method795();
	}

	@OriginalMember(owner = "client!fc", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method792();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!fc;B)Z")
	public boolean method786(@OriginalArg(0) Class25 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt956 == arg0.anInt956) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt956; local27++) {
				@Pc(34) byte local34 = this.aByteArray15[local27];
				@Pc(39) byte local39 = arg0.aByteArray15[local27];
				if (local34 >= 65 && local34 <= 90 || local34 >= -64 && local34 <= -34 && local34 != -41) {
					local34 = (byte) (local34 + 32);
				}
				if (local39 >= 65 && local39 <= 90 || local39 >= -64 && local39 <= -34 && local39 != -41) {
					local39 = (byte) (local39 + 32);
				}
				if (local34 != local39) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(ILclient!fc;)Z")
	public boolean method787(@OriginalArg(1) Class25 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt956 == arg0.anInt956) {
			if (!this.aBoolean38 || !arg0.aBoolean38) {
				if (this.anInt998 == 0) {
					this.anInt998 = this.method792();
					if (this.anInt998 == 0) {
						this.anInt998 = 1;
					}
				}
				if (arg0.anInt998 == 0) {
					arg0.anInt998 = arg0.method792();
					if (arg0.anInt998 == 0) {
						arg0.anInt998 = 1;
					}
				}
				if (this.anInt998 != arg0.anInt998) {
					return false;
				}
			}
			for (@Pc(71) int local71 = 0; local71 < this.anInt956; local71++) {
				if (arg0.aByteArray15[local71] != this.aByteArray15[local71]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(Z)J")
	private long method790() {
		@Pc(1) long local1 = 0L;
		for (@Pc(8) int local8 = 0; local8 < this.anInt956; local8++) {
			local1 = (local1 << 5) + (long) (this.aByteArray15[local8] & 0xFF) - local1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)Lclient!fc;")
	public Class25 method791(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean38) {
			this.anInt998 = 0;
			if (this.aByteArray15.length == this.anInt956) {
				@Pc(39) int local39;
				for (local39 = 1; local39 <= this.anInt956; local39 += local39) {
				}
				@Pc(52) byte[] local52 = new byte[local39];
				Static132.method848(this.aByteArray15, 0, local52, 0, this.anInt956);
				this.aByteArray15 = local52;
			}
			this.aByteArray15[this.anInt956++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)I")
	public int method792() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt956; local7++) {
			local5 = (this.aByteArray15[local7] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "(B)Lclient!fc;")
	public Class25 method793() {
		@Pc(9) Class25 local9 = new Class25();
		local9.anInt956 = this.anInt956;
		local9.aByteArray15 = new byte[this.anInt956];
		for (@Pc(25) int local25 = 0; local25 < this.anInt956; local25++) {
			local9.aByteArray15[local25] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)Lclient!fc;")
	public Class25 method794(@OriginalArg(0) int arg0) {
		return this.method781(arg0, this.anInt956);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(BI)Z")
	private boolean method795() {
		@Pc(22) int local22 = 0;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < this.anInt956; local28++) {
			@Pc(37) int local37 = this.aByteArray15[local28] & 0xFF;
			if (local28 == 0) {
				if (local37 == 45) {
					local26 = true;
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
			if (local26) {
				local37 = -local37;
			}
			@Pc(106) int local106 = local37 + local22 * 10;
			if (local106 / 10 != local22) {
				return false;
			}
			local24 = true;
			local22 = local106;
		}
		return local24;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lclient!fc;B)I")
	public int method796(@OriginalArg(0) Class25 arg0) {
		return this.method768(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(ILclient!fc;)Z")
	public boolean method797(@OriginalArg(1) Class25 arg0) {
		if (arg0.anInt956 > this.anInt956) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < arg0.anInt956; local18++) {
			if (arg0.aByteArray15[local18] != this.aByteArray15[local18]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(Z)Lclient!fc;")
	public Class25 method798() {
		if (!this.aBoolean38) {
			throw new IllegalArgumentException();
		}
		this.anInt998 = 0;
		if (this.aByteArray15.length != this.anInt956) {
			@Pc(23) byte[] local23 = new byte[this.anInt956];
			Static132.method848(this.aByteArray15, 0, local23, 0, this.anInt956);
			this.aByteArray15 = local23;
		}
		return this;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public void method800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray15, 0, this.anInt956, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray15, 0, this.anInt956);
		}
		arg2.drawString(local13, arg0, arg1);
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)I")
	public int method801() {
		return this.method764();
	}

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "(I)[B")
	public byte[] method802() {
		@Pc(14) byte[] local14 = new byte[this.anInt956];
		Static132.method848(this.aByteArray15, 0, local14, 0, this.anInt956);
		return local14;
	}

	@OriginalMember(owner = "client!fc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}
}
