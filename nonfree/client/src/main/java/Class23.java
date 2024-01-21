import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class23 implements Interface4 {

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
	public int anInt965;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "Z")
	private boolean aBoolean57 = true;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I")
	public int method509() {
		return this.method511();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Lclient!gd;")
	public Class23 method510(@OriginalArg(1) int arg0) {
		return this.method512(arg0, this.anInt965);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)I")
	private int method511() {
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		@Pc(21) boolean local21 = false;
		for (@Pc(29) int local29 = 0; local29 < this.anInt965; local29++) {
			@Pc(37) int local37 = this.aByteArray4[local29] & 0xFF;
			if (local29 == 0) {
				if (local37 == 45) {
					local17 = true;
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
			if (local37 >= 10) {
				throw new NumberFormatException();
			}
			if (local17) {
				local37 = -local37;
			}
			@Pc(108) int local108 = local19 * 10 + local37;
			if (local108 / 10 != local19) {
				throw new NumberFormatException();
			}
			local21 = true;
			local19 = local108;
		}
		if (!local21) {
			throw new NumberFormatException();
		}
		return local19;
	}

	@OriginalMember(owner = "client!gd", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!gd", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method523();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Lclient!gd;")
	public Class23 method512(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class23 local7 = new Class23();
		local7.anInt965 = arg1 - arg0;
		local7.aByteArray4 = new byte[arg1 - arg0];
		Static123.method1270(this.aByteArray4, arg0, local7.aByteArray4, 0, local7.anInt965);
		return local7;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)Lclient!gd;")
	public Class23 method514() {
		@Pc(3) Class23 local3 = new Class23();
		local3.anInt965 = this.anInt965;
		local3.aByteArray4 = new byte[this.anInt965];
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anInt965; local20++) {
			@Pc(26) byte local26 = this.aByteArray4[local20];
			if (local26 == 95) {
				local3.aByteArray4[local20] = 32;
				local18 = true;
			} else if (local26 >= 97 && local26 <= 122 && local18) {
				local18 = false;
				local3.aByteArray4[local20] = (byte) (local26 - 32);
			} else {
				local18 = false;
				local3.aByteArray4[local20] = local26;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)Lclient!gd;")
	public Class23 method515() {
		@Pc(3) long local3 = this.method540();
		@Pc(16) Class local16 = gd.class;
		synchronized (gd.class) {
			@Pc(32) Class1_Sub6 local32;
			if (Static3.aClass14_1 == null) {
				Static3.aClass14_1 = new Class14(4096);
			} else {
				for (local32 = (Class1_Sub6) Static3.aClass14_1.method343(local3); local32 != null; local32 = (Class1_Sub6) Static3.aClass14_1.method351()) {
					if (this.method539(local32.aClass23_715)) {
						return local32.aClass23_715;
					}
				}
			}
			local32 = new Class1_Sub6();
			this.aBoolean57 = false;
			local32.aClass23_715 = this;
			Static3.aClass14_1.method345(local32, local3);
			return this;
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)J")
	public long method516() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; this.anInt965 > local7 && local7 < 12; local7++) {
			local5 *= 37L;
			@Pc(25) byte local25 = this.aByteArray4[local7];
			if (local25 >= 65 && local25 <= 90) {
				local5 += local25 + 1 - 65;
			} else if (local25 >= 97 && local25 <= 122) {
				local5 += local25 + 1 - 97;
			} else if (local25 >= 48 && local25 <= 57) {
				local5 += local25 - 21;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IBI)I")
	private int method517() {
		for (@Pc(10) int local10 = 0; local10 < this.anInt965; local10++) {
			if (this.aByteArray4[local10] == 32) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!gd;I)Lclient!gd;")
	public Class23 method518(@OriginalArg(0) Class23 arg0) {
		if (!this.aBoolean57) {
			throw new IllegalArgumentException();
		}
		this.anInt977 = 0;
		if (this.aByteArray4.length < arg0.anInt965 + this.anInt965) {
			@Pc(24) int local24;
			for (local24 = 1; local24 < arg0.anInt965 + this.anInt965; local24 += local24) {
			}
			@Pc(39) byte[] local39 = new byte[local24];
			Static123.method1270(this.aByteArray4, 0, local39, 0, this.anInt965);
			this.aByteArray4 = local39;
		}
		Static123.method1270(arg0.aByteArray4, 0, this.aByteArray4, this.anInt965, arg0.anInt965);
		this.anInt965 += arg0.anInt965;
		return this;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)I")
	public int method519(@OriginalArg(1) int arg0) {
		return this.aByteArray4[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public void method520(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) int arg2) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray4, 0, this.anInt965, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray4, 0, this.anInt965);
		}
		arg1.drawString(local18, arg2, arg0);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(BI)Z")
	private boolean method522() {
		@Pc(13) boolean local13 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anInt965; local24++) {
			@Pc(32) int local32 = this.aByteArray4[local24] & 0xFF;
			if (local24 == 0) {
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
				return false;
			}
			if (local32 >= 10) {
				return false;
			}
			if (local13) {
				local32 = -local32;
			}
			@Pc(97) int local97 = local32 + local22 * 10;
			if (local22 != local97 / 10) {
				return false;
			}
			local20 = true;
			local22 = local97;
		}
		return local20;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)I")
	public int method523() {
		@Pc(5) int local5 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt965; local12++) {
			local5 = (local5 << 5) + (this.aByteArray4[local12] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method524(@OriginalArg(0) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray4, 0, this.anInt965, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray4, 0, this.anInt965);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)I")
	public int method525() {
		return this.anInt965;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)Lclient!gd;")
	public Class23 method526() {
		@Pc(17) Class23 local17 = new Class23();
		local17.anInt965 = this.anInt965;
		local17.aByteArray4 = new byte[this.anInt965];
		for (@Pc(28) int local28 = 0; local28 < this.anInt965; local28++) {
			local17.aByteArray4[local28] = 42;
		}
		return local17;
	}

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)Lclient!gd;")
	public Class23 method527() {
		@Pc(7) Class23 local7 = new Class23();
		@Pc(14) boolean local14 = true;
		local7.anInt965 = this.anInt965;
		local7.aByteArray4 = new byte[this.anInt965];
		for (@Pc(25) int local25 = 0; local25 < this.anInt965; local25++) {
			@Pc(31) byte local31 = this.aByteArray4[local25];
			if (local31 >= 97 && local31 <= 122 || !(local31 < -32 || local31 > -2 || local31 == -9)) {
				if (local14) {
					local31 = (byte) (local31 - 32);
				}
				local14 = false;
			} else if (local31 >= 65 && local31 <= 90 || local31 >= -64 && local31 <= -34 && local31 != -41) {
				if (!local14) {
					local31 = (byte) (local31 + 32);
				}
				local14 = false;
			}
			if (local31 == 46 || local31 == 33 || local31 == 63) {
				local14 = true;
			}
			local7.aByteArray4[local25] = local31;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!gd;B)I")
	public int method528(@OriginalArg(0) Class23 arg0) {
		return this.method533(arg0);
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)Lclient!gd;")
	public Class23 method529() {
		@Pc(1) int local1;
		for (local1 = 0; this.anInt965 > local1 && (this.aByteArray4[local1] >= 0 && this.aByteArray4[local1] <= 32 || (this.aByteArray4[local1] & 0xFF) == 160); local1++) {
		}
		@Pc(38) int local38;
		for (local38 = this.anInt965; local38 > local1 && (this.aByteArray4[local38 - 1] >= 0 && this.aByteArray4[local38 - 1] <= 32 || (this.aByteArray4[local38 - 1] & 0xFF) == 160); local38--) {
		}
		if (local1 == 0 && this.anInt965 == local38) {
			return this;
		}
		@Pc(89) Class23 local89 = new Class23();
		local89.anInt965 = local38 - local1;
		local89.aByteArray4 = new byte[local89.anInt965];
		for (@Pc(109) int local109 = 0; local109 < local89.anInt965; local109++) {
			local89.aByteArray4[local109] = this.aByteArray4[local1 + local109];
		}
		return local89;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lclient!gd;B)Z")
	public boolean method530(@OriginalArg(0) Class23 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt965 == arg0.anInt965) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt965; local27++) {
				@Pc(33) byte local33 = this.aByteArray4[local27];
				if (local33 >= 65 && local33 <= 90 || local33 >= -64 && local33 <= -34 && local33 != -41) {
					local33 = (byte) (local33 + 32);
				}
				@Pc(62) byte local62 = arg0.aByteArray4[local27];
				if (local62 >= 65 && local62 <= 90 || local62 >= -64 && local62 <= -34 && local62 != -41) {
					local62 = (byte) (local62 + 32);
				}
				if (local62 != local33) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!gd;Z)Z")
	public boolean method531(@OriginalArg(0) Class23 arg0) {
		if (arg0.anInt965 > this.anInt965) {
			return false;
		}
		@Pc(21) int local21 = this.anInt965 - arg0.anInt965;
		for (@Pc(31) int local31 = 0; local31 < arg0.anInt965; local31++) {
			if (arg0.aByteArray4[local31] != this.aByteArray4[local31 + local21]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(B)Lclient!gd;")
	public Class23 method532() {
		@Pc(7) Class23 local7 = new Class23();
		local7.aByteArray4 = new byte[12];
		@Pc(13) int local13 = 0;
		local7.anInt965 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt965; local18++) {
			if (this.aByteArray4[local18] >= 65 && this.aByteArray4[local18] <= 90) {
				local7.aByteArray4[local13++] = (byte) (this.aByteArray4[local18] + 97 - 65);
				local7.anInt965 = local13;
			} else if (this.aByteArray4[local18] >= 97 && this.aByteArray4[local18] <= 122 || this.aByteArray4[local18] >= 48 && this.aByteArray4[local18] <= 57) {
				local7.aByteArray4[local13++] = this.aByteArray4[local18];
				local7.anInt965 = local13;
			} else if (local13 > 0) {
				local7.aByteArray4[local13++] = 95;
			}
			if (local13 == 12) {
				break;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZLclient!gd;)I")
	private int method533(@OriginalArg(2) Class23 arg0) {
		@Pc(7) int[] local7 = new int[arg0.anInt965];
		@Pc(11) int[] local11 = new int[arg0.anInt965];
		@Pc(14) int[] local14 = new int[256];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			local14[local16] = arg0.anInt965;
		}
		for (@Pc(29) int local29 = 1; local29 <= arg0.anInt965; local29++) {
			local7[local29 - 1] = (arg0.anInt965 << 1) - local29;
			local14[arg0.aByteArray4[local29 - 1] & 0xFF] = arg0.anInt965 - local29;
		}
		@Pc(65) int local65 = arg0.anInt965 + 1;
		for (@Pc(68) int local68 = arg0.anInt965; local68 > 0; local68--) {
			local11[local68 - 1] = local65;
			while (local65 <= arg0.anInt965 && arg0.aByteArray4[local68 - 1] != arg0.aByteArray4[local65 - 1]) {
				if (arg0.anInt965 - local68 <= local7[local65 + -1]) {
					local7[local65 - 1] = arg0.anInt965 - local68;
				}
				local65 = local11[local65 - 1];
			}
			local65--;
		}
		@Pc(126) int local126 = 0;
		@Pc(128) int local128 = local65;
		@Pc(130) int local130 = 1;
		local65 = arg0.anInt965 + 1 - local65;
		@Pc(139) int local139 = 1;
		while (local139 <= local65) {
			local11[local139 - 1] = local126;
			while (local126 >= 1 && arg0.aByteArray4[local139 - 1] != arg0.aByteArray4[local126 - 1]) {
				local126 = local11[local126 - 1];
			}
			local139++;
			local126++;
		}
		@Pc(187) int local187;
		while (arg0.anInt965 > local128) {
			for (local187 = local130; local187 <= local128; local187++) {
				if (arg0.anInt965 + local128 - local187 <= local7[local187 + -1]) {
					local7[local187 - 1] = local128 + arg0.anInt965 - local187;
				}
			}
			local130 = local128 + 1;
			local128 = local128 + local65 - local11[local65 + -1];
			local65 = local11[local65 - 1];
		}
		@Pc(269) int local269;
		for (local187 = arg0.anInt965 - 1; local187 < this.anInt965; local187 += Math.max(local14[this.aByteArray4[local187] & 0xFF], local7[local269])) {
			for (local269 = arg0.anInt965 - 1; local269 >= 0 && arg0.aByteArray4[local269] == this.aByteArray4[local187]; local269--) {
				local187--;
			}
			if (local269 == -1) {
				return local187 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(BI)Lclient!gd;")
	public Class23 method534(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		} else if (this.aBoolean57) {
			this.anInt977 = 0;
			if (this.aByteArray4.length == this.anInt965) {
				@Pc(44) int local44;
				for (local44 = 1; local44 <= this.anInt965; local44 += local44) {
				}
				@Pc(60) byte[] local60 = new byte[local44];
				Static123.method1270(this.aByteArray4, 0, local60, 0, this.anInt965);
				this.aByteArray4 = local60;
			}
			this.aByteArray4[this.anInt965++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[BZI)I")
	public int method535(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2) {
		Static123.method1270(this.aByteArray4, 0, arg1, arg2, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!gd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "(I)Lclient!gd;")
	public Class23 method537() {
		@Pc(3) Class23 local3 = new Class23();
		local3.anInt965 = this.anInt965;
		local3.aByteArray4 = new byte[this.anInt965];
		for (@Pc(14) int local14 = 0; local14 < this.anInt965; local14++) {
			@Pc(20) byte local20 = this.aByteArray4[local14];
			if (local20 >= 65 && local20 <= 90 || local20 >= -64 && local20 <= -34 && local20 != -41) {
				local20 = (byte) (local20 + 32);
			}
			local3.aByteArray4[local14] = local20;
		}
		return local3;
	}

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "(I)[B")
	public byte[] method538() {
		@Pc(12) byte[] local12 = new byte[this.anInt965];
		Static123.method1270(this.aByteArray4, 0, local12, 0, this.anInt965);
		return local12;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lclient!gd;I)Z")
	public boolean method539(@OriginalArg(0) Class23 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt965 == arg0.anInt965) {
			if (!this.aBoolean57 || !arg0.aBoolean57) {
				if (this.anInt977 == 0) {
					this.anInt977 = this.method523();
					if (this.anInt977 == 0) {
						this.anInt977 = 1;
					}
				}
				if (arg0.anInt977 == 0) {
					arg0.anInt977 = arg0.method523();
					if (arg0.anInt977 == 0) {
						arg0.anInt977 = 1;
					}
				}
				if (this.anInt977 != arg0.anInt977) {
					return false;
				}
			}
			for (@Pc(79) int local79 = 0; local79 < this.anInt965; local79++) {
				if (arg0.aByteArray4[local79] != this.aByteArray4[local79]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "(I)J")
	private long method540() {
		@Pc(11) long local11 = 0L;
		for (@Pc(13) int local13 = 0; local13 < this.anInt965; local13++) {
			local11 = (long) (this.aByteArray4[local13] & 0xFF) + (local11 << 5) - local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(BI)I")
	public int method541() {
		return this.method517();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!gd;B)Lclient!gd;")
	public Class23 method542(@OriginalArg(0) int arg0, @OriginalArg(1) Class23 arg1) {
		if (!this.aBoolean57) {
			throw new IllegalArgumentException();
		} else if (arg0 > this.anInt965) {
			throw new IllegalArgumentException();
		} else {
			this.anInt977 = 0;
			if (arg0 + arg1.anInt965 > this.aByteArray4.length) {
				@Pc(45) int local45;
				for (local45 = 1; local45 < arg1.anInt965 + arg0; local45 += local45) {
				}
				@Pc(59) byte[] local59 = new byte[local45];
				Static123.method1270(this.aByteArray4, 0, local59, 0, this.anInt965);
				this.aByteArray4 = local59;
			}
			Static123.method1270(arg1.aByteArray4, 0, this.aByteArray4, arg0, arg1.anInt965);
			if (arg1.anInt965 + arg0 > this.anInt965) {
				this.anInt965 = arg0 + arg1.anInt965;
			}
			return this;
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lclient!gd;I)I")
	public int method543(@OriginalArg(0) Class23 arg0) {
		@Pc(20) int local20;
		if (arg0.anInt965 >= this.anInt965) {
			local20 = this.anInt965;
		} else {
			local20 = arg0.anInt965;
		}
		for (@Pc(26) int local26 = 0; local26 < local20; local26++) {
			if (arg0.aByteArray4[local26] > this.aByteArray4[local26]) {
				return -1;
			}
			if (arg0.aByteArray4[local26] < this.aByteArray4[local26]) {
				return 1;
			}
		}
		if (this.anInt965 < arg0.anInt965) {
			return -1;
		} else if (this.anInt965 > arg0.anInt965) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "(I)Z")
	public boolean method544() {
		return this.method522();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)Lclient!gd;")
	public Class23 method545(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(27) Class23 local27 = new Class23();
		local27.aByteArray4 = new byte[this.anInt965 + 1];
		local27.anInt965 = this.anInt965 + 1;
		Static123.method1270(this.aByteArray4, 0, local27.aByteArray4, 0, this.anInt965);
		local27.aByteArray4[this.anInt965] = (byte) arg0;
		return local27;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!gd;)Z")
	public boolean method546(@OriginalArg(1) Class23 arg0) {
		if (this.anInt965 < arg0.anInt965) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt965; local16++) {
			if (arg0.aByteArray4[local16] != this.aByteArray4[local16]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "(I)Lclient!gd;")
	public Class23 method547() {
		if (!this.aBoolean57) {
			throw new IllegalArgumentException();
		}
		this.anInt977 = 0;
		if (this.aByteArray4.length != this.anInt965) {
			@Pc(23) byte[] local23 = new byte[this.anInt965];
			Static123.method1270(this.aByteArray4, 0, local23, 0, this.anInt965);
			this.aByteArray4 = local23;
		}
		return this;
	}
}
