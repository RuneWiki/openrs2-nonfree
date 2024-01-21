import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class10 implements Interface1 {

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
	public int anInt513;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
	private int anInt540;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "Z")
	private boolean aBoolean21 = true;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!cd;)I")
	public int method331(@OriginalArg(1) Class10 arg0) {
		@Pc(9) int local9;
		if (arg0.anInt513 < this.anInt513) {
			local9 = arg0.anInt513;
		} else {
			local9 = this.anInt513;
		}
		for (@Pc(25) int local25 = 0; local25 < local9; local25++) {
			if (Static146.anIntArray339[arg0.aByteArray7[local25] & 0xFF] > Static146.anIntArray339[this.aByteArray7[local25] & 0xFF]) {
				return -1;
			}
			if (Static146.anIntArray339[arg0.aByteArray7[local25] & 0xFF] < Static146.anIntArray339[this.aByteArray7[local25] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt513 > this.anInt513) {
			return -1;
		} else if (arg0.anInt513 < this.anInt513) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)I")
	public int method332() {
		return this.method339(10);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Lclient!cd;")
	public Class10 method333(@OriginalArg(0) int arg0) {
		return this.method353(arg0, this.anInt513);
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)I")
	public int method334() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt513; local3++) {
			local1 = (this.aByteArray7[local3] & 0xFF) + (local1 << 5) - local1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)Lclient!cd;")
	public Class10 method335() {
		@Pc(5) Class10 local5 = new Class10();
		local5.anInt513 = this.anInt513;
		local5.aByteArray7 = new byte[this.anInt513];
		for (@Pc(25) int local25 = 0; local25 < this.anInt513; local25++) {
			local5.aByteArray7[local25] = 42;
		}
		return local5;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)Lclient!cd;")
	public Class10 method336() {
		@Pc(8) int local8;
		for (local8 = 0; local8 < this.anInt513 && (this.aByteArray7[local8] >= 0 && this.aByteArray7[local8] <= 32 || (this.aByteArray7[local8] & 0xFF) == 160); local8++) {
		}
		@Pc(41) int local41;
		for (local41 = this.anInt513; local41 > local8 && (this.aByteArray7[local41 - 1] >= 0 && this.aByteArray7[local41 - 1] <= 32 || (this.aByteArray7[local41 - 1] & 0xFF) == 160); local41--) {
		}
		if (local8 == 0 && this.anInt513 == local41) {
			return this;
		}
		@Pc(95) Class10 local95 = new Class10();
		local95.anInt513 = local41 - local8;
		local95.aByteArray7 = new byte[local95.anInt513];
		for (@Pc(108) int local108 = 0; local108 < local95.anInt513; local108++) {
			local95.aByteArray7[local108] = this.aByteArray7[local8 + local108];
		}
		return local95;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/awt/FontMetrics;B)I")
	public int method337(@OriginalArg(0) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray7, 0, this.anInt513, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray7, 0, this.anInt513);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!cd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!cd;Z)I")
	public int method338(@OriginalArg(0) Class10 arg0) {
		@Pc(18) int local18;
		if (arg0.anInt513 < this.anInt513) {
			local18 = arg0.anInt513;
		} else {
			local18 = this.anInt513;
		}
		for (@Pc(25) int local25 = 0; local25 < local18; local25++) {
			if ((arg0.aByteArray7[local25] & 0xFF) > (this.aByteArray7[local25] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray7[local25] & 0xFF) > (arg0.aByteArray7[local25] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.anInt513 > this.anInt513) {
			return -1;
		} else if (this.anInt513 > arg0.anInt513) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)I")
	public int method339(@OriginalArg(1) int arg0) {
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		@Pc(21) boolean local21 = false;
		for (@Pc(28) int local28 = 0; local28 < this.anInt513; local28++) {
			@Pc(37) int local37 = this.aByteArray7[local28] & 0xFF;
			if (local28 == 0) {
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
			if (local37 >= arg0) {
				throw new NumberFormatException();
			}
			if (local17) {
				local37 = -local37;
			}
			@Pc(115) int local115 = local37 + arg0 * local19;
			if (local19 != local115 / arg0) {
				throw new NumberFormatException();
			}
			local21 = true;
			local19 = local115;
		}
		if (!local21) {
			throw new NumberFormatException();
		}
		return local19;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)I")
	public int method340() {
		return this.anInt513;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!cd;I)Z")
	public boolean method341(@OriginalArg(0) Class10 arg0) {
		if (this.anInt513 < arg0.anInt513) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < arg0.anInt513; local18++) {
			if (this.aByteArray7[local18] != arg0.aByteArray7[local18]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(ILclient!cd;)Z")
	public boolean method343(@OriginalArg(1) Class10 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt513 == arg0.anInt513) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt513; local26++) {
				@Pc(33) byte local33 = arg0.aByteArray7[local26];
				if (local33 >= 65 && local33 <= 90 || local33 >= -64 && local33 <= -34 && local33 != -41) {
					local33 = (byte) (local33 + 32);
				}
				@Pc(66) byte local66 = this.aByteArray7[local26];
				if (local66 >= 65 && local66 <= 90 || local66 >= -64 && local66 <= -34 && local66 != -41) {
					local66 = (byte) (local66 + 32);
				}
				if (local33 != local66) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cd", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class10)) {
			throw new IllegalArgumentException();
		}
		return this.method358((Class10) arg0);
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(ILclient!cd;)Z")
	public boolean method344(@OriginalArg(1) Class10 arg0) {
		if (this.anInt513 < arg0.anInt513) {
			return false;
		}
		@Pc(27) int local27 = this.anInt513 - arg0.anInt513;
		for (@Pc(29) int local29 = 0; local29 < arg0.anInt513; local29++) {
			if (this.aByteArray7[local27 + local29] != arg0.aByteArray7[local29]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	public void method345(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray7, 0, this.anInt513, "ISO-8859-1");
		} catch (@Pc(23) UnsupportedEncodingException local23) {
			local13 = new String(this.aByteArray7, 0, this.anInt513);
		}
		arg0.drawString(local13, arg2, arg1);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BII)I")
	public int method347(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte local8 = (byte) arg0;
		for (@Pc(10) int local10 = arg1; local10 < this.anInt513; local10++) {
			if (local8 == this.aByteArray7[local10]) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(B)Lclient!cd;")
	public Class10 method348() {
		@Pc(7) byte local7 = 2;
		@Pc(19) Class10 local19 = new Class10();
		local19.anInt513 = this.anInt513;
		local19.aByteArray7 = new byte[this.anInt513];
		for (@Pc(30) int local30 = 0; local30 < this.anInt513; local30++) {
			@Pc(37) byte local37 = this.aByteArray7[local30];
			if (local37 >= 97 && local37 <= 122 || !(local37 < -32 || local37 > -2 || local37 == -9)) {
				if (local7 == 2) {
					local37 = (byte) (local37 - 32);
				}
				local7 = 0;
			} else if (local37 >= 65 && local37 <= 90 || !(local37 < -64 || local37 > -34 || local37 == -41)) {
				if (local7 == 0) {
					local37 = (byte) (local37 + 32);
				}
				local7 = 0;
			} else if (local37 == 46 || local37 == 33 || local37 == 63) {
				local7 = 2;
			} else if (local37 != 32) {
				local7 = 1;
			} else if (local7 != 2) {
				local7 = 1;
			}
			local19.aByteArray7[local30] = local37;
		}
		return local19;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)Lclient!cd;")
	public Class10 method349() {
		@Pc(7) long local7 = this.method367();
		@Pc(16) Class local16 = cd.class;
		synchronized (cd.class) {
			@Pc(26) Class2_Sub14 local26;
			if (Static88.aClass18_6 == null) {
				Static88.aClass18_6 = new Class18(4096);
			} else {
				for (local26 = (Class2_Sub14) Static88.aClass18_6.method683(local7); local26 != null; local26 = (Class2_Sub14) Static88.aClass18_6.method677()) {
					if (this.method358(local26.aClass10_967)) {
						return local26.aClass10_967;
					}
				}
			}
			local26 = new Class2_Sub14();
			local26.aClass10_967 = this;
			this.aBoolean21 = false;
			Static88.aClass18_6.method685(local7, local26);
			return this;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILclient!cd;)I")
	public int method350(@OriginalArg(1) int arg0, @OriginalArg(2) Class10 arg1) {
		@Pc(9) int[] local9 = new int[arg1.anInt513];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg1.anInt513];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg1.anInt513;
		}
		for (@Pc(32) int local32 = 1; local32 <= arg1.anInt513; local32++) {
			local9[local32 - 1] = (arg1.anInt513 << 1) - local32;
			local12[arg1.aByteArray7[local32 - 1] & 0xFF] = arg1.anInt513 - local32;
		}
		@Pc(75) int local75 = arg1.anInt513 + 1;
		for (@Pc(78) int local78 = arg1.anInt513; local78 > 0; local78--) {
			local16[local78 - 1] = local75;
			while (arg1.anInt513 >= local75 && arg1.aByteArray7[local78 - 1] != arg1.aByteArray7[local75 - 1]) {
				if (local9[local75 - 1] >= arg1.anInt513 - local78) {
					local9[local75 - 1] = arg1.anInt513 - local78;
				}
				local75 = local16[local75 - 1];
			}
			local75--;
		}
		@Pc(150) int local150 = 0;
		@Pc(152) int local152 = 1;
		@Pc(154) int local154 = local75;
		local75 = arg1.anInt513 + 1 - local75;
		@Pc(164) int local164 = 1;
		while (local75 >= local164) {
			local16[local164 - 1] = local150;
			while (local150 >= 1 && arg1.aByteArray7[local150 - 1] != arg1.aByteArray7[local164 - 1]) {
				local150 = local16[local150 - 1];
			}
			local164++;
			local150++;
		}
		@Pc(216) int local216;
		while (local154 < arg1.anInt513) {
			for (local216 = local152; local216 <= local154; local216++) {
				if (local154 + arg1.anInt513 - local216 <= local9[local216 + -1]) {
					local9[local216 - 1] = local154 + arg1.anInt513 - local216;
				}
			}
			local152 = local154 + 1;
			local154 = local154 + local75 - local16[local75 - 1];
			local75 = local16[local75 - 1];
		}
		@Pc(285) int local285;
		for (local216 = arg1.anInt513 + arg0 - 1; local216 < this.anInt513; local216 += Math.max(local12[this.aByteArray7[local216] & 0xFF], local9[local285])) {
			for (local285 = arg1.anInt513 - 1; local285 >= 0 && arg1.aByteArray7[local285] == this.aByteArray7[local216]; local285--) {
				local216--;
			}
			if (local285 == -1) {
				return local216 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(BI)Lclient!cd;")
	public Class10 method351(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean21) {
			this.anInt540 = 0;
			if (this.aByteArray7.length == this.anInt513) {
				@Pc(50) int local50;
				for (local50 = 1; local50 <= this.anInt513; local50 += local50) {
				}
				@Pc(63) byte[] local63 = new byte[local50];
				Static182.method1348(this.aByteArray7, 0, local63, 0, this.anInt513);
				this.aByteArray7 = local63;
			}
			this.aByteArray7[this.anInt513++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(ILclient!cd;)Lclient!cd;")
	public Class10 method352(@OriginalArg(1) Class10 arg0) {
		if (!this.aBoolean21) {
			throw new IllegalArgumentException();
		}
		this.anInt540 = 0;
		if (this.aByteArray7.length < this.anInt513 + arg0.anInt513) {
			@Pc(26) int local26;
			for (local26 = 1; local26 < arg0.anInt513 + this.anInt513; local26 += local26) {
			}
			@Pc(46) byte[] local46 = new byte[local26];
			Static182.method1348(this.aByteArray7, 0, local46, 0, this.anInt513);
			this.aByteArray7 = local46;
		}
		Static182.method1348(arg0.aByteArray7, 0, this.aByteArray7, this.anInt513, arg0.anInt513);
		this.anInt513 += arg0.anInt513;
		return this;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)Lclient!cd;")
	public Class10 method353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class10 local7 = new Class10();
		local7.aByteArray7 = new byte[arg1 - arg0];
		local7.anInt513 = arg1 - arg0;
		Static182.method1348(this.aByteArray7, arg0, local7.aByteArray7, 0, local7.anInt513);
		return local7;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(BI)Lclient!cd;")
	public Class10 method354(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(20) Class10 local20 = new Class10();
		local20.aByteArray7 = new byte[this.anInt513 + 1];
		local20.anInt513 = this.anInt513 + 1;
		Static182.method1348(this.aByteArray7, 0, local20.aByteArray7, 0, this.anInt513);
		local20.aByteArray7[this.anInt513] = (byte) arg0;
		return local20;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([BIIII)I")
	public int method355(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static182.method1348(this.aByteArray7, 0, arg0, arg2, arg1);
		return arg1;
	}

	@OriginalMember(owner = "client!cd", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method334();
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)Lclient!cd;")
	public Class10 method356() {
		if (!this.aBoolean21) {
			throw new IllegalArgumentException();
		}
		this.anInt540 = 0;
		if (this.aByteArray7.length != this.anInt513) {
			@Pc(32) byte[] local32 = new byte[this.anInt513];
			Static182.method1348(this.aByteArray7, 0, local32, 0, this.anInt513);
			this.aByteArray7 = local32;
		}
		return this;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)I")
	public int method357(@OriginalArg(0) int arg0) {
		return this.aByteArray7[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(ILclient!cd;)Z")
	public boolean method358(@OriginalArg(1) Class10 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt513 == arg0.anInt513) {
			if (!this.aBoolean21 || !arg0.aBoolean21) {
				if (this.anInt540 == 0) {
					this.anInt540 = this.method334();
					if (this.anInt540 == 0) {
						this.anInt540 = 1;
					}
				}
				if (arg0.anInt540 == 0) {
					arg0.anInt540 = arg0.method334();
					if (arg0.anInt540 == 0) {
						arg0.anInt540 = 1;
					}
				}
				if (this.anInt540 != arg0.anInt540) {
					return false;
				}
			}
			for (@Pc(71) int local71 = 0; local71 < this.anInt513; local71++) {
				if (this.aByteArray7[local71] != arg0.aByteArray7[local71]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(B)[B")
	public byte[] method359() {
		@Pc(7) byte[] local7 = new byte[this.anInt513];
		Static182.method1348(this.aByteArray7, 0, local7, 0, this.anInt513);
		return local7;
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)Lclient!cd;")
	public Class10 method360() {
		@Pc(9) Class10 local9 = new Class10();
		local9.anInt513 = this.anInt513;
		local9.aByteArray7 = new byte[this.anInt513];
		for (@Pc(25) int local25 = 0; local25 < this.anInt513; local25++) {
			@Pc(32) byte local32 = this.aByteArray7[local25];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local9.aByteArray7[local25] = local32;
		}
		return local9;
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)Lclient!cd;")
	public Class10 method361() {
		@Pc(9) Class10 local9 = new Class10();
		@Pc(11) boolean local11 = true;
		local9.anInt513 = this.anInt513;
		local9.aByteArray7 = new byte[this.anInt513];
		for (@Pc(22) int local22 = 0; local22 < this.anInt513; local22++) {
			@Pc(29) byte local29 = this.aByteArray7[local22];
			if (local29 == 95) {
				local11 = true;
				local9.aByteArray7[local22] = 32;
			} else if (local29 >= 97 && local29 <= 122 && local11) {
				local9.aByteArray7[local22] = (byte) (local29 - 32);
				local11 = false;
			} else {
				local9.aByteArray7[local22] = local29;
				local11 = false;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)Z")
	public boolean method362() {
		return this.method368();
	}

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "(B)J")
	public long method363() {
		@Pc(12) long local12 = 0L;
		for (@Pc(14) int local14 = 0; this.anInt513 > local14 && local14 < 12; local14++) {
			local12 *= 37L;
			@Pc(25) byte local25 = this.aByteArray7[local14];
			if (local25 >= 65 && local25 <= 90) {
				local12 += local25 + 1 - 65;
			} else if (local25 >= 97 && local25 <= 122) {
				local12 += local25 - 96;
			} else if (local25 >= 48 && local25 <= 57) {
				local12 += local25 - 21;
			}
		}
		while (local12 % 37L == 0L && local12 != 0L) {
			local12 /= 37L;
		}
		return local12;
	}

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)Lclient!cd;")
	public Class10 method364() {
		@Pc(9) Class10 local9 = new Class10();
		@Pc(11) int local11 = 0;
		local9.aByteArray7 = new byte[12];
		local9.anInt513 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anInt513; local25++) {
			if (this.aByteArray7[local25] >= 65 && this.aByteArray7[local25] <= 90) {
				local9.aByteArray7[local11++] = (byte) (this.aByteArray7[local25] + 32);
				local9.anInt513 = local11;
			} else if (this.aByteArray7[local25] >= 97 && this.aByteArray7[local25] <= 122 || this.aByteArray7[local25] >= 48 && this.aByteArray7[local25] <= 57) {
				local9.aByteArray7[local11++] = this.aByteArray7[local25];
				local9.anInt513 = local11;
			} else if (local11 > 0) {
				local9.aByteArray7[local11++] = 95;
			}
			if (local11 == 12) {
				break;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(ILclient!cd;)I")
	public int method365(@OriginalArg(1) Class10 arg0) {
		return this.method350(0, arg0);
	}

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)J")
	private long method367() {
		@Pc(1) long local1 = 0L;
		for (@Pc(12) int local12 = 0; local12 < this.anInt513; local12++) {
			local1 = (long) (this.aByteArray7[local12] & 0xFF) + (local1 << 5) - local1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)Z")
	private boolean method368() {
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		@Pc(21) boolean local21 = false;
		for (@Pc(23) int local23 = 0; local23 < this.anInt513; local23++) {
			@Pc(32) int local32 = this.aByteArray7[local23] & 0xFF;
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
			@Pc(102) int local102 = local32 + local19 * 10;
			if (local19 != local102 / 10) {
				return false;
			}
			local21 = true;
			local19 = local102;
		}
		return local21;
	}

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "(B)Ljava/net/URL;")
	public URL method369() throws MalformedURLException {
		return new URL(new String(this.aByteArray7, 0, this.anInt513));
	}
}
