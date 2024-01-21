import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class27 implements Interface1 {

	@OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
	public int anInt963;

	@OriginalMember(owner = "client!hb", name = "Q", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!hb", name = "Lb", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!hb", name = "fb", descriptor = "Z")
	private boolean aBoolean52 = true;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III[BI)I")
	public int method727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		Static117.method1761(this.aByteArray9, 0, arg2, arg0, arg1);
		return arg1;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)Lclient!hb;")
	public Class27 method728() {
		@Pc(9) Class27 local9 = new Class27();
		@Pc(11) boolean local11 = true;
		local9.anInt963 = this.anInt963;
		local9.aByteArray9 = new byte[this.anInt963];
		for (@Pc(30) int local30 = 0; local30 < this.anInt963; local30++) {
			@Pc(37) byte local37 = this.aByteArray9[local30];
			if (local37 >= 97 && local37 <= 122 || local37 >= -32 && local37 <= -2 && local37 != -9) {
				if (local11) {
					local37 = (byte) (local37 - 32);
				}
				local11 = false;
			} else if (local37 >= 65 && local37 <= 90 || local37 >= -64 && local37 <= -34 && local37 != -41) {
				if (!local11) {
					local37 = (byte) (local37 + 32);
				}
				local11 = false;
			}
			local9.aByteArray9[local30] = local37;
			if (local37 == 46 || local37 == 33 || local37 == 63) {
				local11 = true;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method729(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2) {
		@Pc(21) String local21;
		try {
			local21 = new String(this.aByteArray9, 0, this.anInt963, "ISO-8859-1");
		} catch (@Pc(23) UnsupportedEncodingException local23) {
			local21 = new String(this.aByteArray9, 0, this.anInt963);
		}
		arg1.drawString(local21, arg2, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)Lclient!hb;")
	public Class27 method730() {
		if (!this.aBoolean52) {
			throw new IllegalArgumentException();
		}
		this.anInt987 = 0;
		if (this.anInt963 != this.aByteArray9.length) {
			@Pc(32) byte[] local32 = new byte[this.anInt963];
			Static117.method1761(this.aByteArray9, 0, local32, 0, this.anInt963);
			this.aByteArray9 = local32;
		}
		return this;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)Lclient!hb;")
	public Class27 method731(@OriginalArg(0) int arg0) {
		return this.method747(arg0, this.anInt963);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)I")
	public int method732() {
		return this.method757();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLclient!hb;)Z")
	public boolean method733(@OriginalArg(1) Class27 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt963 == arg0.anInt963) {
			if (!this.aBoolean52 || !arg0.aBoolean52) {
				if (this.anInt987 == 0) {
					this.anInt987 = this.method738();
					if (this.anInt987 == 0) {
						this.anInt987 = 1;
					}
				}
				if (arg0.anInt987 == 0) {
					arg0.anInt987 = arg0.method738();
					if (arg0.anInt987 == 0) {
						arg0.anInt987 = 1;
					}
				}
				if (this.anInt987 != arg0.anInt987) {
					return false;
				}
			}
			for (@Pc(70) int local70 = 0; local70 < this.anInt963; local70++) {
				if (arg0.aByteArray9[local70] != this.aByteArray9[local70]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)J")
	private long method734() {
		@Pc(1) long local1 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt963; local7++) {
			local1 = (long) (this.aByteArray9[local7] & 0xFF) + (local1 << 5) - local1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)Lclient!hb;")
	public Class27 method735() {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = this.anInt963;
		while (this.anInt963 > local12 && (this.aByteArray9[local12] >= 0 && this.aByteArray9[local12] <= 32 || (this.aByteArray9[local12] & 0xFF) == 160)) {
			local12++;
		}
		while (local15 > local12 && (this.aByteArray9[local15 - 1] >= 0 && this.aByteArray9[local15 - 1] <= 32 || (this.aByteArray9[local15 - 1] & 0xFF) == 160)) {
			local15--;
		}
		if (local12 == 0 && local15 == this.anInt963) {
			return this;
		}
		@Pc(99) Class27 local99 = new Class27();
		local99.anInt963 = local15 - local12;
		local99.aByteArray9 = new byte[local99.anInt963];
		for (@Pc(112) int local112 = 0; local112 < local99.anInt963; local112++) {
			local99.aByteArray9[local112] = this.aByteArray9[local112 + local12];
		}
		return local99;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)I")
	public int method736(@OriginalArg(1) int arg0) {
		return this.aByteArray9[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)I")
	private int method737() {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt963; local21++) {
			@Pc(30) int local30 = this.aByteArray9[local21] & 0xFF;
			if (local21 == 0) {
				if (local30 == 45) {
					local17 = true;
					continue;
				}
				if (local30 == 43) {
					continue;
				}
			}
			if (local30 >= 48 && local30 <= 57) {
				local30 -= 48;
			} else if (local30 >= 65 && local30 <= 90) {
				local30 -= 55;
			} else if (local30 >= 97 && local30 <= 122) {
				local30 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (local30 >= 10) {
				throw new NumberFormatException();
			}
			if (local17) {
				local30 = -local30;
			}
			@Pc(103) int local103 = local19 * 10 + local30;
			if (local103 / 10 != local19) {
				throw new NumberFormatException();
			}
			local15 = true;
			local19 = local103;
		}
		if (!local15) {
			throw new NumberFormatException();
		}
		return local19;
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)I")
	public int method738() {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt963; local12++) {
			local10 = (this.aByteArray9[local12] & 0xFF) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!hb;)I")
	public int method739(@OriginalArg(1) Class27 arg0) {
		return this.method749(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)Z")
	public boolean method740() {
		return this.method754();
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(BLclient!hb;)Lclient!hb;")
	public Class27 method741(@OriginalArg(1) Class27 arg0) {
		if (!this.aBoolean52) {
			throw new IllegalArgumentException();
		}
		this.anInt987 = 0;
		if (arg0.anInt963 + this.anInt963 > this.aByteArray9.length) {
			@Pc(30) int local30;
			for (local30 = 1; local30 < this.anInt963 + arg0.anInt963; local30 += local30) {
			}
			@Pc(51) byte[] local51 = new byte[local30];
			Static117.method1761(this.aByteArray9, 0, local51, 0, this.anInt963);
			this.aByteArray9 = local51;
		}
		Static117.method1761(arg0.aByteArray9, 0, this.aByteArray9, this.anInt963, arg0.anInt963);
		this.anInt963 += arg0.anInt963;
		return this;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)Lclient!hb;")
	public Class27 method742() {
		@Pc(9) Class27 local9 = new Class27();
		local9.anInt963 = this.anInt963;
		local9.aByteArray9 = new byte[this.anInt963];
		for (@Pc(25) int local25 = 0; local25 < this.anInt963; local25++) {
			@Pc(32) byte local32 = this.aByteArray9[local25];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local9.aByteArray9[local25] = local32;
		}
		return local9;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)Lclient!hb;")
	public Class27 method743() {
		@Pc(9) Class27 local9 = new Class27();
		local9.anInt963 = 0;
		local9.aByteArray9 = new byte[12];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anInt963; local25++) {
			if (this.aByteArray9[local25] >= 65 && this.aByteArray9[local25] <= 90) {
				local9.aByteArray9[local23++] = (byte) (this.aByteArray9[local25] + 97 - 65);
				local9.anInt963 = local23;
			} else if (this.aByteArray9[local25] >= 97 && this.aByteArray9[local25] <= 122 || this.aByteArray9[local25] >= 48 && this.aByteArray9[local25] <= 57) {
				local9.aByteArray9[local23++] = this.aByteArray9[local25];
				local9.anInt963 = local23;
			} else if (local23 > 0) {
				local9.aByteArray9[local23++] = 95;
			}
			if (local23 == 12) {
				break;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)[B")
	public byte[] method744() {
		@Pc(12) byte[] local12 = new byte[this.anInt963];
		Static117.method1761(this.aByteArray9, 0, local12, 0, this.anInt963);
		return local12;
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(B)Lclient!hb;")
	public Class27 method745() {
		@Pc(7) long local7 = this.method734();
		@Pc(24) Class local24 = hb.class;
		synchronized (hb.class) {
			@Pc(40) Class3_Sub4 local40;
			if (Static84.aClass14_6 == null) {
				Static84.aClass14_6 = new Class14(4096);
			} else {
				for (local40 = (Class3_Sub4) Static84.aClass14_6.method317(local7); local40 != null; local40 = (Class3_Sub4) Static84.aClass14_6.method315()) {
					if (this.method733(local40.aClass27_149)) {
						return local40.aClass27_149;
					}
				}
			}
			local40 = new Class3_Sub4();
			this.aBoolean52 = false;
			local40.aClass27_149 = this;
			Static84.aClass14_6.method321(local7, local40);
			return this;
		}
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)Lclient!hb;")
	public Class27 method746() {
		@Pc(9) Class27 local9 = new Class27();
		local9.anInt963 = this.anInt963;
		@Pc(22) boolean local22 = true;
		local9.aByteArray9 = new byte[this.anInt963];
		for (@Pc(29) int local29 = 0; local29 < this.anInt963; local29++) {
			@Pc(36) byte local36 = this.aByteArray9[local29];
			if (local36 == 95) {
				local22 = true;
				local9.aByteArray9[local29] = 32;
			} else if (local36 >= 97 && local36 <= 122 && local22) {
				local9.aByteArray9[local29] = (byte) (local36 - 32);
				local22 = false;
			} else {
				local22 = false;
				local9.aByteArray9[local29] = local36;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BII)Lclient!hb;")
	public Class27 method747(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class27 local7 = new Class27();
		local7.aByteArray9 = new byte[arg1 - arg0];
		local7.anInt963 = arg1 - arg0;
		Static117.method1761(this.aByteArray9, arg0, local7.aByteArray9, 0, local7.anInt963);
		return local7;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(ZI)Lclient!hb;")
	public Class27 method748(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(25) Class27 local25 = new Class27();
		local25.aByteArray9 = new byte[this.anInt963 + 1];
		local25.anInt963 = this.anInt963 + 1;
		Static117.method1761(this.aByteArray9, 0, local25.aByteArray9, 0, this.anInt963);
		local25.aByteArray9[this.anInt963] = (byte) arg0;
		return local25;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!hb;)I")
	private int method749(@OriginalArg(2) Class27 arg0) {
		@Pc(9) int[] local9 = new int[arg0.anInt963];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg0.anInt963];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg0.anInt963;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg0.anInt963; local36++) {
			local9[local36 - 1] = (arg0.anInt963 << 1) - local36;
			local12[arg0.aByteArray9[local36 - 1] & 0xFF] = arg0.anInt963 - local36;
		}
		@Pc(75) int local75 = arg0.anInt963 + 1;
		for (@Pc(78) int local78 = arg0.anInt963; local78 > 0; local78--) {
			local16[local78 - 1] = local75;
			while (local75 <= arg0.anInt963 && arg0.aByteArray9[local78 - 1] != arg0.aByteArray9[local75 - 1]) {
				if (local9[local75 - 1] >= arg0.anInt963 - local78) {
					local9[local75 - 1] = arg0.anInt963 - local78;
				}
				local75 = local16[local75 - 1];
			}
			local75--;
		}
		@Pc(148) int local148 = local75;
		@Pc(150) int local150 = 1;
		local75 = arg0.anInt963 + 1 - local75;
		@Pc(159) int local159 = 0;
		for (@Pc(161) int local161 = 1; local161 <= local75; local161++) {
			local16[local161 - 1] = local159;
			while (local159 >= 1 && arg0.aByteArray9[local161 - 1] != arg0.aByteArray9[local159 - 1]) {
				local159 = local16[local159 - 1];
			}
			local159++;
		}
		@Pc(208) int local208;
		while (arg0.anInt963 > local148) {
			for (local208 = local150; local208 <= local148; local208++) {
				if (arg0.anInt963 + local148 - local208 <= local9[local208 + -1]) {
					local9[local208 - 1] = local148 + arg0.anInt963 - local208;
				}
			}
			local150 = local148 + 1;
			local148 -= local16[local75 - 1] - local75;
			local75 = local16[local75 - 1];
		}
		@Pc(287) int local287;
		for (local208 = arg0.anInt963 - 1; local208 < this.anInt963; local208 += Math.max(local12[this.aByteArray9[local208] & 0xFF], local9[local287])) {
			for (local287 = arg0.anInt963 - 1; local287 >= 0 && this.aByteArray9[local208] == arg0.aByteArray9[local287]; local287--) {
				local208--;
			}
			if (local287 == -1) {
				return local208 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!hb;I)Z")
	public boolean method750(@OriginalArg(0) Class27 arg0) {
		if (this.anInt963 < arg0.anInt963) {
			return false;
		}
		@Pc(18) int local18 = this.anInt963 - arg0.anInt963;
		for (@Pc(20) int local20 = 0; local20 < arg0.anInt963; local20++) {
			if (arg0.aByteArray9[local20] != this.aByteArray9[local20 + local18]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hb", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method738();
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(BLclient!hb;)Z")
	public boolean method751(@OriginalArg(1) Class27 arg0) {
		if (this.anInt963 < arg0.anInt963) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt963; local14++) {
			if (arg0.aByteArray9[local14] != this.aByteArray9[local14]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)Lclient!hb;")
	public Class27 method752() {
		@Pc(14) Class27 local14 = new Class27();
		local14.anInt963 = this.anInt963;
		local14.aByteArray9 = new byte[this.anInt963];
		for (@Pc(25) int local25 = 0; local25 < this.anInt963; local25++) {
			local14.aByteArray9[local25] = 42;
		}
		return local14;
	}

	@OriginalMember(owner = "client!hb", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)Z")
	private boolean method754() {
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt963; local28++) {
			@Pc(37) int local37 = this.aByteArray9[local28] & 0xFF;
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
			@Pc(111) int local111 = local37 + local21 * 10;
			if (local111 / 10 != local21) {
				return false;
			}
			local17 = true;
			local21 = local111;
		}
		return local17;
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(B)I")
	public int method756() {
		return this.method737();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)I")
	private int method757() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt963; local8++) {
			if (this.aByteArray9[local8] == 32) {
				return local8;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(Z)J")
	public long method758() {
		@Pc(3) long local3 = 0L;
		for (@Pc(5) int local5 = 0; local5 < this.anInt963 && local5 < 12; local5++) {
			local3 *= 37L;
			@Pc(19) byte local19 = this.aByteArray9[local5];
			if (local19 >= 65 && local19 <= 90) {
				local3 += local19 + 1 - 65;
			} else if (local19 >= 97 && local19 <= 122) {
				local3 += local19 - 96;
			} else if (local19 >= 48 && local19 <= 57) {
				local3 += local19 - 21;
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IB)Lclient!hb;")
	public Class27 method761(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		} else if (this.aBoolean52) {
			this.anInt987 = 0;
			if (this.aByteArray9.length == this.anInt963) {
				@Pc(46) int local46;
				for (local46 = 1; local46 <= this.anInt963; local46 += local46) {
				}
				@Pc(59) byte[] local59 = new byte[local46];
				Static117.method1761(this.aByteArray9, 0, local59, 0, this.anInt963);
				this.aByteArray9 = local59;
			}
			this.aByteArray9[this.anInt963++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BILclient!hb;)Lclient!hb;")
	public Class27 method762(@OriginalArg(1) int arg0, @OriginalArg(2) Class27 arg1) {
		if (!this.aBoolean52) {
			throw new IllegalArgumentException();
		} else if (arg0 > this.anInt963) {
			throw new IllegalArgumentException();
		} else {
			this.anInt987 = 0;
			if (this.aByteArray9.length < arg1.anInt963 + arg0) {
				@Pc(45) int local45;
				for (local45 = 1; local45 < arg0 + arg1.anInt963; local45 += local45) {
				}
				@Pc(65) byte[] local65 = new byte[local45];
				Static117.method1761(this.aByteArray9, 0, local65, 0, this.anInt963);
				this.aByteArray9 = local65;
			}
			Static117.method1761(arg1.aByteArray9, 0, this.aByteArray9, arg0, arg1.anInt963);
			if (arg1.anInt963 + arg0 > this.anInt963) {
				this.anInt963 = arg0 + arg1.anInt963;
			}
			return this;
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(ILclient!hb;)Z")
	public boolean method763(@OriginalArg(1) Class27 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt963 == this.anInt963) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt963; local18++) {
				@Pc(25) byte local25 = arg0.aByteArray9[local18];
				if (local25 >= 65 && local25 <= 90 || local25 >= -64 && local25 <= -34 && local25 != -41) {
					local25 = (byte) (local25 + 32);
				}
				@Pc(52) byte local52 = this.aByteArray9[local18];
				if (local52 >= 65 && local52 <= 90 || local52 >= -64 && local52 <= -34 && local52 != -41) {
					local52 = (byte) (local52 + 32);
				}
				if (local52 != local25) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method764(@OriginalArg(0) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray9, 0, this.anInt963, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray9, 0, this.anInt963);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "(B)I")
	public int method765() {
		return this.anInt963;
	}
}
