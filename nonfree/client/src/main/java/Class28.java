import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class28 implements Interface3 {

	@OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
	public int anInt1118;

	@OriginalMember(owner = "client!eh", name = "K", descriptor = "[B")
	public byte[] aByteArray15;

	@OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
	private int anInt1138;

	@OriginalMember(owner = "client!eh", name = "I", descriptor = "Z")
	private boolean aBoolean59 = true;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)I")
	public int method901() {
		return this.anInt1118;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)Lclient!eh;")
	public Class28 method902() {
		if (!this.aBoolean59) {
			throw new IllegalArgumentException();
		}
		this.anInt1138 = 0;
		if (this.anInt1118 != this.aByteArray15.length) {
			@Pc(27) byte[] local27 = new byte[this.anInt1118];
			Static188.method2240(this.aByteArray15, 0, local27, 0, this.anInt1118);
			this.aByteArray15 = local27;
		}
		return this;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!eh;)I")
	public int method903(@OriginalArg(1) Class28 arg0) {
		return this.method908(0, arg0);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!eh;B)I")
	public int method904(@OriginalArg(0) Class28 arg0) {
		@Pc(15) int local15;
		if (this.anInt1118 > arg0.anInt1118) {
			local15 = arg0.anInt1118;
		} else {
			local15 = this.anInt1118;
		}
		for (@Pc(21) int local21 = 0; local21 < local15; local21++) {
			if (Static81.anIntArray387[arg0.aByteArray15[local21] & 0xFF] > Static81.anIntArray387[this.aByteArray15[local21] & 0xFF]) {
				return -1;
			}
			if (Static81.anIntArray387[arg0.aByteArray15[local21] & 0xFF] < Static81.anIntArray387[this.aByteArray15[local21] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt1118 < arg0.anInt1118) {
			return -1;
		} else if (arg0.anInt1118 < this.anInt1118) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)Lclient!eh;")
	public Class28 method905(@OriginalArg(1) int arg0) {
		return this.method926(this.anInt1118, arg0);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIB)I")
	public int method906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte local13 = (byte) arg1;
		for (@Pc(15) int local15 = arg0; local15 < this.anInt1118; local15++) {
			if (this.aByteArray15[local15] == local13) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)Lclient!eh;")
	public Class28 method907(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean59) {
			this.anInt1138 = 0;
			if (this.anInt1118 == this.aByteArray15.length) {
				@Pc(49) int local49;
				for (local49 = 1; local49 <= this.anInt1118; local49 += local49) {
				}
				@Pc(61) byte[] local61 = new byte[local49];
				Static188.method2240(this.aByteArray15, 0, local61, 0, this.anInt1118);
				this.aByteArray15 = local61;
			}
			this.aByteArray15[this.anInt1118++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILclient!eh;)I")
	public int method908(@OriginalArg(0) int arg0, @OriginalArg(2) Class28 arg1) {
		@Pc(7) int[] local7 = new int[arg1.anInt1118];
		@Pc(10) int[] local10 = new int[256];
		@Pc(14) int[] local14 = new int[arg1.anInt1118];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			local10[local16] = arg1.anInt1118;
		}
		for (@Pc(35) int local35 = 1; local35 <= arg1.anInt1118; local35++) {
			local7[local35 - 1] = (arg1.anInt1118 << 1) - local35;
			local10[arg1.aByteArray15[local35 - 1] & 0xFF] = arg1.anInt1118 - local35;
		}
		@Pc(72) int local72 = arg1.anInt1118 + 1;
		@Pc(75) int local75 = arg1.anInt1118;
		while (local75 > 0) {
			local14[local75 - 1] = local72;
			while (local72 <= arg1.anInt1118 && arg1.aByteArray15[local75 - 1] != arg1.aByteArray15[local72 - 1]) {
				if (arg1.anInt1118 - local75 <= local7[local72 + -1]) {
					local7[local72 - 1] = arg1.anInt1118 - local75;
				}
				local72 = local14[local72 - 1];
			}
			local75--;
			local72--;
		}
		@Pc(137) int local137 = local72;
		local72 = arg1.anInt1118 + 1 - local72;
		@Pc(147) int local147 = 1;
		@Pc(149) int local149 = 0;
		for (@Pc(151) int local151 = 1; local151 <= local72; local151++) {
			local14[local151 - 1] = local149;
			while (local149 >= 1 && arg1.aByteArray15[local149 - 1] != arg1.aByteArray15[local151 - 1]) {
				local149 = local14[local149 - 1];
			}
			local149++;
		}
		@Pc(193) int local193;
		while (local137 < arg1.anInt1118) {
			for (local193 = local147; local193 <= local137; local193++) {
				if (local137 + arg1.anInt1118 - local193 <= local7[local193 + -1]) {
					local7[local193 - 1] = arg1.anInt1118 + local137 - local193;
				}
			}
			local147 = local137 + 1;
			local137 = local72 + local137 - local14[local72 + -1];
			local72 = local14[local72 - 1];
		}
		@Pc(270) int local270;
		for (local193 = arg0 + arg1.anInt1118 - 1; local193 < this.anInt1118; local193 += Math.max(local10[this.aByteArray15[local193] & 0xFF], local7[local270])) {
			for (local270 = arg1.anInt1118 - 1; local270 >= 0 && this.aByteArray15[local193] == arg1.aByteArray15[local270]; local270--) {
				local193--;
			}
			if (local270 == -1) {
				return local193 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!eh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)Ljava/net/URL;")
	public URL method909() throws MalformedURLException {
		return new URL(new String(this.aByteArray15, 0, this.anInt1118));
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[BBII)I")
	public int method910(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		Static188.method2240(this.aByteArray15, 0, arg1, arg2, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)J")
	private long method911() {
		@Pc(12) long local12 = 0L;
		for (@Pc(14) int local14 = 0; local14 < this.anInt1118; local14++) {
			local12 = (long) (this.aByteArray15[local14] & 0xFF) + (local12 << 5) - local12;
		}
		return local12;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)Lclient!eh;")
	public Class28 method912() {
		@Pc(7) Class28 local7 = new Class28();
		local7.anInt1118 = this.anInt1118;
		local7.aByteArray15 = new byte[this.anInt1118];
		@Pc(18) boolean local18 = true;
		for (@Pc(26) int local26 = 0; local26 < this.anInt1118; local26++) {
			@Pc(32) byte local32 = this.aByteArray15[local26];
			if (local32 == 95) {
				local18 = true;
				local7.aByteArray15[local26] = 32;
			} else if (local32 >= 97 && local32 <= 122 && local18) {
				local18 = false;
				local7.aByteArray15[local26] = (byte) (local32 - 32);
			} else {
				local7.aByteArray15[local26] = local32;
				local18 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(Z)Lclient!eh;")
	public Class28 method914() {
		@Pc(7) long local7 = this.method911();
		@Pc(16) Class local16 = eh.class;
		synchronized (eh.class) {
			@Pc(26) Class3_Sub4 local26;
			if (Static5.aClass87_2 == null) {
				Static5.aClass87_2 = new Class87(4096);
			} else {
				for (local26 = (Class3_Sub4) Static5.aClass87_2.method3201(local7); local26 != null; local26 = (Class3_Sub4) Static5.aClass87_2.method3202()) {
					if (this.method934(local26.aClass28_227)) {
						return local26.aClass28_227;
					}
				}
			}
			local26 = new Class3_Sub4();
			local26.aClass28_227 = this;
			this.aBoolean59 = false;
			Static5.aClass87_2.method3200(local7, local26);
			return this;
		}
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)Lclient!eh;")
	public Class28 method915() {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = this.anInt1118;
		while (local5 < this.anInt1118 && (this.aByteArray15[local5] >= 0 && this.aByteArray15[local5] <= 32 || (this.aByteArray15[local5] & 0xFF) == 160)) {
			local5++;
		}
		while (local5 < local8 && (this.aByteArray15[local8 - 1] >= 0 && this.aByteArray15[local8 - 1] <= 32 || (this.aByteArray15[local8 - 1] & 0xFF) == 160)) {
			local8--;
		}
		if (local5 == 0 && this.anInt1118 == local8) {
			return this;
		}
		@Pc(94) Class28 local94 = new Class28();
		local94.anInt1118 = local8 - local5;
		local94.aByteArray15 = new byte[local94.anInt1118];
		for (@Pc(116) int local116 = 0; local116 < local94.anInt1118; local116++) {
			local94.aByteArray15[local116] = this.aByteArray15[local5 + local116];
		}
		return local94;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)Z")
	private boolean method916() {
		@Pc(5) boolean local5 = false;
		@Pc(19) boolean local19 = false;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt1118; local28++) {
			@Pc(36) int local36 = this.aByteArray15[local28] & 0xFF;
			if (local28 == 0) {
				if (local36 == 45) {
					local5 = true;
					continue;
				}
				if (local36 == 43) {
					continue;
				}
			}
			if (local36 >= 48 && local36 <= 57) {
				local36 -= 48;
			} else if (local36 >= 65 && local36 <= 90) {
				local36 -= 55;
			} else if (local36 >= 97 && local36 <= 122) {
				local36 -= 87;
			} else {
				return false;
			}
			if (local36 >= 10) {
				return false;
			}
			if (local5) {
				local36 = -local36;
			}
			@Pc(101) int local101 = local26 * 10 + local36;
			if (local26 != local101 / 10) {
				return false;
			}
			local26 = local101;
			local19 = true;
		}
		return local19;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)I")
	public int method917(@OriginalArg(0) int arg0) {
		return this.aByteArray15[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!eh;I)Z")
	public boolean method918(@OriginalArg(0) Class28 arg0) {
		if (arg0.anInt1118 > this.anInt1118) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt1118; local16++) {
			if (this.aByteArray15[local16] != arg0.aByteArray15[local16]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)Lclient!eh;")
	public Class28 method920() {
		@Pc(10) Class28 local10 = Static149.method2829(this.method924());
		return local10 == null ? Static31.aClass28_315 : local10;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(Lclient!eh;I)I")
	public int method921(@OriginalArg(0) Class28 arg0) {
		@Pc(15) int local15;
		if (arg0.anInt1118 >= this.anInt1118) {
			local15 = this.anInt1118;
		} else {
			local15 = arg0.anInt1118;
		}
		for (@Pc(29) int local29 = 0; local29 < local15; local29++) {
			if ((this.aByteArray15[local29] & 0xFF) < (arg0.aByteArray15[local29] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray15[local29] & 0xFF) > (arg0.aByteArray15[local29] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.anInt1118 > this.anInt1118) {
			return -1;
		} else if (arg0.anInt1118 < this.anInt1118) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(B)I")
	public int method922() {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1118; local12++) {
			local10 = (local10 << 5) + (this.aByteArray15[local12] & 0xFF) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(B)Lclient!eh;")
	public Class28 method923() {
		@Pc(5) Class28 local5 = new Class28();
		local5.anInt1118 = this.anInt1118;
		local5.aByteArray15 = new byte[this.anInt1118];
		for (@Pc(20) int local20 = 0; local20 < this.anInt1118; local20++) {
			local5.aByteArray15[local20] = 42;
		}
		return local5;
	}

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)J")
	public long method924() {
		@Pc(1) long local1 = 0L;
		for (@Pc(3) int local3 = 0; local3 < this.anInt1118 && local3 < 12; local3++) {
			local1 *= 37L;
			@Pc(13) byte local13 = this.aByteArray15[local3];
			if (local13 >= 65 && local13 <= 90) {
				local1 += local13 + 1 - 65;
			} else if (local13 >= 97 && local13 <= 122) {
				local1 += local13 - 96;
			} else if (local13 >= 48 && local13 <= 57) {
				local1 += local13 - 21;
			}
		}
		while (local1 % 37L == 0L && local1 != 0L) {
			local1 /= 37L;
		}
		return local1;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Lclient!eh;")
	public Class28 method926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class28 local7 = new Class28();
		local7.aByteArray15 = new byte[arg0 - arg1];
		local7.anInt1118 = arg0 - arg1;
		Static188.method2240(this.aByteArray15, arg1, local7.aByteArray15, 0, local7.anInt1118);
		return local7;
	}

	@OriginalMember(owner = "client!eh", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class28)) {
			throw new IllegalArgumentException();
		}
		return this.method934((Class28) arg0);
	}

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)Z")
	public boolean method927() {
		return this.method916();
	}

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "(B)I")
	public int method929() {
		return this.method932(10);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZLclient!eh;)Lclient!eh;")
	public Class28 method930(@OriginalArg(1) Class28 arg0) {
		if (!this.aBoolean59) {
			throw new IllegalArgumentException();
		}
		this.anInt1138 = 0;
		if (arg0.anInt1118 + this.anInt1118 > this.aByteArray15.length) {
			@Pc(37) int local37;
			for (local37 = 1; local37 < this.anInt1118 + arg0.anInt1118; local37 += local37) {
			}
			@Pc(57) byte[] local57 = new byte[local37];
			Static188.method2240(this.aByteArray15, 0, local57, 0, this.anInt1118);
			this.aByteArray15 = local57;
		}
		Static188.method2240(arg0.aByteArray15, 0, this.aByteArray15, this.anInt1118, arg0.anInt1118);
		this.anInt1118 += arg0.anInt1118;
		return this;
	}

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "(I)Lclient!eh;")
	public Class28 method931() {
		@Pc(7) Class28 local7 = new Class28();
		local7.anInt1118 = this.anInt1118;
		local7.aByteArray15 = new byte[this.anInt1118];
		for (@Pc(23) int local23 = 0; local23 < this.anInt1118; local23++) {
			@Pc(29) byte local29 = this.aByteArray15[local23];
			if (local29 >= 65 && local29 <= 90 || local29 >= -64 && local29 <= -34 && local29 != -41) {
				local29 = (byte) (local29 + 32);
			}
			local7.aByteArray15[local23] = local29;
		}
		return local7;
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(II)I")
	public int method932(@OriginalArg(1) int arg0) {
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt1118; local26++) {
			@Pc(34) int local34 = this.aByteArray15[local26] & 0xFF;
			if (local26 == 0) {
				if (local34 == 45) {
					local22 = true;
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
			if (local22) {
				local34 = -local34;
			}
			@Pc(97) int local97 = local34 + arg0 * local24;
			if (local97 / arg0 != local24) {
				throw new NumberFormatException();
			}
			local20 = true;
			local24 = local97;
		}
		if (!local20) {
			throw new NumberFormatException();
		}
		return local24;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
	public void method933(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) String local17;
		try {
			local17 = new String(this.aByteArray15, 0, this.anInt1118, "ISO-8859-1");
		} catch (@Pc(19) UnsupportedEncodingException local19) {
			local17 = new String(this.aByteArray15, 0, this.anInt1118);
		}
		arg0.drawString(local17, arg2, arg1);
	}

	@OriginalMember(owner = "client!eh", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method922();
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(ILclient!eh;)Z")
	public boolean method934(@OriginalArg(1) Class28 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt1118 == this.anInt1118) {
			if (!this.aBoolean59 || !arg0.aBoolean59) {
				if (this.anInt1138 == 0) {
					this.anInt1138 = this.method922();
					if (this.anInt1138 == 0) {
						this.anInt1138 = 1;
					}
				}
				if (arg0.anInt1138 == 0) {
					arg0.anInt1138 = arg0.method922();
					if (arg0.anInt1138 == 0) {
						arg0.anInt1138 = 1;
					}
				}
				if (arg0.anInt1138 != this.anInt1138) {
					return false;
				}
			}
			for (@Pc(64) int local64 = 0; local64 < this.anInt1118; local64++) {
				if (this.aByteArray15[local64] != arg0.aByteArray15[local64]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "(I)[B")
	public byte[] method935() {
		@Pc(12) byte[] local12 = new byte[this.anInt1118];
		Static188.method2240(this.aByteArray15, 0, local12, 0, this.anInt1118);
		return local12;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(ZLclient!eh;)Z")
	public boolean method936(@OriginalArg(1) Class28 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1118 == arg0.anInt1118) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt1118; local16++) {
				@Pc(26) byte local26 = arg0.aByteArray15[local16];
				if (local26 >= 65 && local26 <= 90 || local26 >= -64 && local26 <= -34 && local26 != -41) {
					local26 = (byte) (local26 + 32);
				}
				@Pc(55) byte local55 = this.aByteArray15[local16];
				if (local55 >= 65 && local55 <= 90 || local55 >= -64 && local55 <= -34 && local55 != -41) {
					local55 = (byte) (local55 + 32);
				}
				if (local55 != local26) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)Lclient!eh;")
	public Class28 method937(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(20) Class28 local20 = new Class28();
		local20.aByteArray15 = new byte[this.anInt1118 + 1];
		local20.anInt1118 = this.anInt1118 + 1;
		Static188.method2240(this.aByteArray15, 0, local20.aByteArray15, 0, this.anInt1118);
		local20.aByteArray15[this.anInt1118] = (byte) arg0;
		return local20;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method938(@OriginalArg(0) FontMetrics arg0) {
		@Pc(17) String local17;
		try {
			local17 = new String(this.aByteArray15, 0, this.anInt1118, "ISO-8859-1");
		} catch (@Pc(19) UnsupportedEncodingException local19) {
			local17 = new String(this.aByteArray15, 0, this.anInt1118);
		}
		return arg0.stringWidth(local17);
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(ILclient!eh;)Z")
	public boolean method939(@OriginalArg(1) Class28 arg0) {
		if (this.anInt1118 < arg0.anInt1118) {
			return false;
		}
		@Pc(25) int local25 = this.anInt1118 - arg0.anInt1118;
		for (@Pc(27) int local27 = 0; local27 < arg0.anInt1118; local27++) {
			if (this.aByteArray15[local25 + local27] != arg0.aByteArray15[local27]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "(I)Lclient!eh;")
	public Class28 method940() {
		@Pc(7) Class28 local7 = new Class28();
		@Pc(9) byte local9 = 2;
		local7.anInt1118 = this.anInt1118;
		local7.aByteArray15 = new byte[this.anInt1118];
		for (@Pc(25) int local25 = 0; local25 < this.anInt1118; local25++) {
			@Pc(31) byte local31 = this.aByteArray15[local25];
			if (local31 >= 97 && local31 <= 122 || !(local31 < -32 || local31 > -2 || local31 == -9)) {
				if (local9 == 2) {
					local31 = (byte) (local31 - 32);
				}
				local9 = 0;
			} else if (local31 >= 65 && local31 <= 90 || !(local31 < -64 || local31 > -34 || local31 == -41)) {
				if (local9 == 0) {
					local31 = (byte) (local31 + 32);
				}
				local9 = 0;
			} else if (local31 == 46 || local31 == 33 || local31 == 63) {
				local9 = 2;
			} else if (local31 != 32) {
				local9 = 1;
			} else if (local9 != 2) {
				local9 = 1;
			}
			local7.aByteArray15[local25] = local31;
		}
		return local7;
	}
}
