import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class5 implements Interface1 {

	@OriginalMember(owner = "client!af", name = "n", descriptor = "I")
	private int anInt173;

	@OriginalMember(owner = "client!af", name = "s", descriptor = "I")
	public int anInt178;

	@OriginalMember(owner = "client!af", name = "P", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "Z")
	private boolean aBoolean3 = true;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)Lclient!af;")
	public Class5 method181() {
		if (!this.aBoolean3) {
			throw new IllegalArgumentException();
		}
		this.anInt173 = 0;
		if (this.anInt178 != this.aByteArray2.length) {
			@Pc(28) byte[] local28 = new byte[this.anInt178];
			Static138.method1878(this.aByteArray2, 0, local28, 0, this.anInt178);
			this.aByteArray2 = local28;
		}
		return this;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)Lclient!af;")
	public Class5 method182(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean3) {
			this.anInt173 = 0;
			if (this.aByteArray2.length == this.anInt178) {
				@Pc(48) int local48;
				for (local48 = 1; local48 <= this.anInt178; local48 += local48) {
				}
				@Pc(65) byte[] local65 = new byte[local48];
				Static138.method1878(this.aByteArray2, 0, local65, 0, this.anInt178);
				this.aByteArray2 = local65;
			}
			this.aByteArray2[this.anInt178++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Lclient!af;")
	public Class5 method183() {
		@Pc(5) Class5 local5 = new Class5();
		local5.anInt178 = this.anInt178;
		local5.aByteArray2 = new byte[this.anInt178];
		for (@Pc(24) int local24 = 0; local24 < this.anInt178; local24++) {
			local5.aByteArray2[local24] = 42;
		}
		return local5;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Lclient!af;")
	public Class5 method184(@OriginalArg(1) int arg0) {
		return this.method200(arg0, this.anInt178);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(III)I")
	private int method185(@OriginalArg(2) int arg0) {
		@Pc(6) byte local6 = (byte) arg0;
		for (@Pc(8) int local8 = 0; local8 < this.anInt178; local8++) {
			if (this.aByteArray2[local8] == local6) {
				return local8;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)Lclient!af;")
	public Class5 method186() {
		@Pc(9) Class5 local9 = new Class5();
		local9.aByteArray2 = new byte[12];
		local9.anInt178 = 0;
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.anInt178; local20++) {
			if (this.aByteArray2[local20] >= 65 && this.aByteArray2[local20] <= 90) {
				local9.aByteArray2[local18++] = (byte) (this.aByteArray2[local20] + 97 - 65);
				local9.anInt178 = local18;
			} else if (this.aByteArray2[local20] >= 97 && this.aByteArray2[local20] <= 122 || this.aByteArray2[local20] >= 48 && this.aByteArray2[local20] <= 57) {
				local9.aByteArray2[local18++] = this.aByteArray2[local20];
				local9.anInt178 = local18;
			} else if (local18 > 0) {
				local9.aByteArray2[local18++] = 95;
			}
			if (local18 == 12) {
				break;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BLclient!af;)I")
	public int method187(@OriginalArg(1) Class5 arg0) {
		@Pc(13) int local13;
		if (this.anInt178 > arg0.anInt178) {
			local13 = arg0.anInt178;
		} else {
			local13 = this.anInt178;
		}
		for (@Pc(32) int local32 = 0; local32 < local13; local32++) {
			if (Static1.anIntArray9[arg0.aByteArray2[local32] & 0xFF] > Static1.anIntArray9[this.aByteArray2[local32] & 0xFF]) {
				return -1;
			}
			if (Static1.anIntArray9[this.aByteArray2[local32] & 0xFF] > Static1.anIntArray9[arg0.aByteArray2[local32] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt178 > this.anInt178) {
			return -1;
		} else if (arg0.anInt178 < this.anInt178) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!af;II)I")
	private int method188(@OriginalArg(0) Class5 arg0) {
		@Pc(9) int[] local9 = new int[arg0.anInt178];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg0.anInt178];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg0.anInt178;
		}
		for (@Pc(32) int local32 = 1; local32 <= arg0.anInt178; local32++) {
			local9[local32 - 1] = (arg0.anInt178 << 1) - local32;
			local12[arg0.aByteArray2[local32 - 1] & 0xFF] = arg0.anInt178 - local32;
		}
		@Pc(70) int local70 = arg0.anInt178 + 1;
		@Pc(73) int local73 = arg0.anInt178;
		while (local73 > 0) {
			local16[local73 - 1] = local70;
			while (local70 <= arg0.anInt178 && arg0.aByteArray2[local70 - 1] != arg0.aByteArray2[local73 - 1]) {
				if (arg0.anInt178 - local73 <= local9[local70 + -1]) {
					local9[local70 - 1] = arg0.anInt178 - local73;
				}
				local70 = local16[local70 - 1];
			}
			local73--;
			local70--;
		}
		@Pc(141) int local141 = 0;
		@Pc(143) int local143 = 1;
		@Pc(145) int local145 = local70;
		local70 = arg0.anInt178 + 1 - local70;
		@Pc(160) int local160 = 1;
		while (local70 >= local160) {
			local16[local160 - 1] = local141;
			while (local141 >= 1 && arg0.aByteArray2[local141 - 1] != arg0.aByteArray2[local160 - 1]) {
				local141 = local16[local141 - 1];
			}
			local160++;
			local141++;
		}
		@Pc(207) int local207;
		while (local145 < arg0.anInt178) {
			for (local207 = local143; local207 <= local145; local207++) {
				if (local9[local207 - 1] >= arg0.anInt178 + local145 - local207) {
					local9[local207 - 1] = local145 + arg0.anInt178 - local207;
				}
			}
			local143 = local145 + 1;
			local145 += local70 - local16[local70 - 1];
			local70 = local16[local70 - 1];
		}
		@Pc(277) int local277;
		for (local207 = arg0.anInt178 - 1; local207 < this.anInt178; local207 += Math.max(local12[this.aByteArray2[local207] & 0xFF], local9[local277])) {
			for (local277 = arg0.anInt178 - 1; local277 >= 0 && arg0.aByteArray2[local277] == this.aByteArray2[local207]; local277--) {
				local207--;
			}
			if (local277 == -1) {
				return local207 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(I)Lclient!af;")
	public Class5 method189() {
		@Pc(7) long local7 = this.method214();
		@Pc(24) Class local24 = af.class;
		synchronized (af.class) {
			@Pc(34) Class1_Sub12 local34;
			if (Static97.aClass7_12 == null) {
				Static97.aClass7_12 = new Class7(4096);
			} else {
				for (local34 = (Class1_Sub12) Static97.aClass7_12.method287(local7); local34 != null; local34 = (Class1_Sub12) Static97.aClass7_12.method289()) {
					if (this.method199(local34.aClass5_818)) {
						return local34.aClass5_818;
					}
				}
			}
			local34 = new Class1_Sub12();
			local34.aClass5_818 = this;
			this.aBoolean3 = false;
			Static97.aClass7_12.method291(local34, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!af;)Lclient!af;")
	public Class5 method192(@OriginalArg(1) Class5 arg0) {
		if (!this.aBoolean3) {
			throw new IllegalArgumentException();
		}
		this.anInt173 = 0;
		if (this.aByteArray2.length < arg0.anInt178 + this.anInt178) {
			@Pc(30) int local30;
			for (local30 = 1; local30 < this.anInt178 + arg0.anInt178; local30 += local30) {
			}
			@Pc(46) byte[] local46 = new byte[local30];
			Static138.method1878(this.aByteArray2, 0, local46, 0, this.anInt178);
			this.aByteArray2 = local46;
		}
		Static138.method1878(arg0.aByteArray2, 0, this.aByteArray2, this.anInt178, arg0.anInt178);
		this.anInt178 += arg0.anInt178;
		return this;
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)J")
	public long method193() {
		@Pc(13) long local13 = 0L;
		for (@Pc(15) int local15 = 0; this.anInt178 > local15 && local15 < 12; local15++) {
			local13 *= 37L;
			@Pc(25) byte local25 = this.aByteArray2[local15];
			if (local25 >= 65 && local25 <= 90) {
				local13 += local25 + 1 - 65;
			} else if (local25 >= 97 && local25 <= 122) {
				local13 += local25 + 1 - 97;
			} else if (local25 >= 48 && local25 <= 57) {
				local13 += local25 + 27 - 48;
			}
		}
		while (local13 % 37L == 0L && local13 != 0L) {
			local13 /= 37L;
		}
		return local13;
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(I)Lclient!af;")
	public Class5 method194() {
		@Pc(13) int local13 = this.anInt178;
		@Pc(15) int local15;
		for (local15 = 0; this.anInt178 > local15 && (this.aByteArray2[local15] >= 0 && this.aByteArray2[local15] <= 32 || (this.aByteArray2[local15] & 0xFF) == 160); local15++) {
		}
		while (local15 < local13 && (this.aByteArray2[local13 - 1] >= 0 && this.aByteArray2[local13 - 1] <= 32 || (this.aByteArray2[local13 - 1] & 0xFF) == 160)) {
			local13--;
		}
		if (local15 == 0 && local13 == this.anInt178) {
			return this;
		}
		@Pc(104) Class5 local104 = new Class5();
		local104.anInt178 = local13 - local15;
		local104.aByteArray2 = new byte[local104.anInt178];
		for (@Pc(116) int local116 = 0; local116 < local104.anInt178; local116++) {
			local104.aByteArray2[local116] = this.aByteArray2[local15 + local116];
		}
		return local104;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!af;I)I")
	public int method195(@OriginalArg(0) Class5 arg0) {
		return this.method188(arg0);
	}

	@OriginalMember(owner = "client!af", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)I")
	public int method196() {
		return this.method206(10);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([BIIII)I")
	public int method197(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		Static138.method1878(this.aByteArray2, 0, arg0, arg2, arg1);
		return arg1;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)I")
	public int method198(@OriginalArg(1) int arg0) {
		return this.method185(arg0);
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(ILclient!af;)Z")
	public boolean method199(@OriginalArg(1) Class5 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt178 == this.anInt178) {
			if (!this.aBoolean3 || !arg0.aBoolean3) {
				if (this.anInt173 == 0) {
					this.anInt173 = this.method211();
					if (this.anInt173 == 0) {
						this.anInt173 = 1;
					}
				}
				if (arg0.anInt173 == 0) {
					arg0.anInt173 = arg0.method211();
					if (arg0.anInt173 == 0) {
						arg0.anInt173 = 1;
					}
				}
				if (arg0.anInt173 != this.anInt173) {
					return false;
				}
			}
			for (@Pc(85) int local85 = 0; local85 < this.anInt178; local85++) {
				if (this.aByteArray2[local85] != arg0.aByteArray2[local85]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(III)Lclient!af;")
	public Class5 method200(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class5 local16 = new Class5();
		local16.aByteArray2 = new byte[arg1 - arg0];
		local16.anInt178 = arg1 - arg0;
		Static138.method1878(this.aByteArray2, arg0, local16.aByteArray2, 0, local16.anInt178);
		return local16;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(II)Z")
	private boolean method201() {
		@Pc(7) boolean local7 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anInt178; local25++) {
			@Pc(42) int local42 = this.aByteArray2[local25] & 0xFF;
			if (local25 == 0) {
				if (local42 == 45) {
					local7 = true;
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
				return false;
			}
			if (local42 >= 10) {
				return false;
			}
			if (local7) {
				local42 = -local42;
			}
			@Pc(112) int local112 = local23 * 10 + local42;
			if (local23 != local112 / 10) {
				return false;
			}
			local21 = true;
			local23 = local112;
		}
		return local21;
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(II)I")
	public int method202(@OriginalArg(0) int arg0) {
		return this.aByteArray2[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)Ljava/net/URL;")
	public URL method203() throws MalformedURLException {
		return new URL(new String(this.aByteArray2, 0, this.anInt178));
	}

	@OriginalMember(owner = "client!af", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method211();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method204(@OriginalArg(0) FontMetrics arg0) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray2, 0, this.anInt178, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray2, 0, this.anInt178);
		}
		return arg0.stringWidth(local9);
	}

	@OriginalMember(owner = "client!af", name = "f", descriptor = "(I)Z")
	public boolean method205() {
		return this.method201();
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(II)I")
	public int method206(@OriginalArg(0) int arg0) {
		@Pc(13) boolean local13 = false;
		@Pc(24) int local24 = 0;
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < this.anInt178; local28++) {
			@Pc(37) int local37 = this.aByteArray2[local28] & 0xFF;
			if (local28 == 0) {
				if (local37 == 45) {
					local13 = true;
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
			if (arg0 <= local37) {
				throw new NumberFormatException();
			}
			if (local13) {
				local37 = -local37;
			}
			@Pc(106) int local106 = local37 + arg0 * local24;
			if (local24 != local106 / arg0) {
				throw new NumberFormatException();
			}
			local24 = local106;
			local26 = true;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local24;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(Lclient!af;I)Z")
	public boolean method207(@OriginalArg(0) Class5 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt178 == arg0.anInt178) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt178; local18++) {
				@Pc(31) byte local31 = this.aByteArray2[local18];
				if (local31 >= 65 && local31 <= 90 || local31 >= -64 && local31 <= -34 && local31 != -41) {
					local31 = (byte) (local31 + 32);
				}
				@Pc(62) byte local62 = arg0.aByteArray2[local18];
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

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(Z)Lclient!af;")
	public Class5 method208() {
		@Pc(15) Class5 local15 = new Class5();
		local15.anInt178 = this.anInt178;
		local15.aByteArray2 = new byte[this.anInt178];
		for (@Pc(26) int local26 = 0; local26 < this.anInt178; local26++) {
			@Pc(33) byte local33 = this.aByteArray2[local26];
			if (local33 >= 65 && local33 <= 90 || local33 >= -64 && local33 <= -34 && local33 != -41) {
				local33 = (byte) (local33 + 32);
			}
			local15.aByteArray2[local26] = local33;
		}
		return local15;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(Lclient!af;I)I")
	public int method209(@OriginalArg(0) Class5 arg0) {
		@Pc(18) int local18;
		if (this.anInt178 > arg0.anInt178) {
			local18 = arg0.anInt178;
		} else {
			local18 = this.anInt178;
		}
		for (@Pc(25) int local25 = 0; local25 < local18; local25++) {
			if ((this.aByteArray2[local25] & 0xFF) < (arg0.aByteArray2[local25] & 0xFF)) {
				return -1;
			}
			if ((arg0.aByteArray2[local25] & 0xFF) < (this.aByteArray2[local25] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.anInt178 > this.anInt178) {
			return -1;
		} else if (arg0.anInt178 < this.anInt178) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!af", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class5)) {
			throw new IllegalArgumentException();
		}
		return this.method199((Class5) arg0);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public void method210(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray2, 0, this.anInt178, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray2, 0, this.anInt178);
		}
		arg1.drawString(local9, arg2, arg0);
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(B)I")
	public int method211() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt178; local7++) {
			local5 = (local5 << 5) + (this.aByteArray2[local7] & 0xFF) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(IZ)Lclient!af;")
	public Class5 method212(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(22) Class5 local22 = new Class5();
		local22.aByteArray2 = new byte[this.anInt178 + 1];
		local22.anInt178 = this.anInt178 + 1;
		Static138.method1878(this.aByteArray2, 0, local22.aByteArray2, 0, this.anInt178);
		local22.aByteArray2[this.anInt178] = (byte) arg0;
		return local22;
	}

	@OriginalMember(owner = "client!af", name = "g", descriptor = "(I)Lclient!af;")
	public Class5 method213() {
		@Pc(9) Class5 local9 = new Class5();
		local9.anInt178 = this.anInt178;
		@Pc(15) byte local15 = 2;
		local9.aByteArray2 = new byte[this.anInt178];
		for (@Pc(22) int local22 = 0; local22 < this.anInt178; local22++) {
			@Pc(29) byte local29 = this.aByteArray2[local22];
			if (local29 >= 97 && local29 <= 122 || !(local29 < -32 || local29 > -2 || local29 == -9)) {
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
			local9.aByteArray2[local22] = local29;
		}
		return local9;
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(B)J")
	private long method214() {
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < this.anInt178; local12++) {
			local10 = (long) (this.aByteArray2[local12] & 0xFF) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!af", name = "h", descriptor = "(I)I")
	public int method215() {
		return this.anInt178;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(BLclient!af;)Z")
	public boolean method217(@OriginalArg(1) Class5 arg0) {
		if (arg0.anInt178 > this.anInt178) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt178; local14++) {
			if (arg0.aByteArray2[local14] != this.aByteArray2[local14]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!af;B)Z")
	public boolean method218(@OriginalArg(0) Class5 arg0) {
		if (this.anInt178 < arg0.anInt178) {
			return false;
		}
		@Pc(27) int local27 = this.anInt178 - arg0.anInt178;
		for (@Pc(29) int local29 = 0; local29 < arg0.anInt178; local29++) {
			if (this.aByteArray2[local29 + local27] != arg0.aByteArray2[local29]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!af", name = "i", descriptor = "(I)Lclient!af;")
	public Class5 method219() {
		@Pc(9) Class5 local9 = new Class5();
		@Pc(11) boolean local11 = true;
		local9.anInt178 = this.anInt178;
		local9.aByteArray2 = new byte[this.anInt178];
		for (@Pc(22) int local22 = 0; local22 < this.anInt178; local22++) {
			@Pc(29) byte local29 = this.aByteArray2[local22];
			if (local29 == 95) {
				local9.aByteArray2[local22] = 32;
				local11 = true;
			} else if (local29 >= 97 && local29 <= 122 && local11) {
				local11 = false;
				local9.aByteArray2[local22] = (byte) (local29 - 32);
			} else {
				local9.aByteArray2[local22] = local29;
				local11 = false;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!af", name = "j", descriptor = "(I)[B")
	public byte[] method220() {
		@Pc(7) byte[] local7 = new byte[this.anInt178];
		Static138.method1878(this.aByteArray2, 0, local7, 0, this.anInt178);
		return local7;
	}
}
