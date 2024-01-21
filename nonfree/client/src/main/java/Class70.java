import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class70 implements Interface2 {

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
	private int anInt2883;

	@OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
	public int anInt2899;

	@OriginalMember(owner = "client!oc", name = "cb", descriptor = "Z")
	private boolean aBoolean137 = true;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!oc;Z)Z")
	public boolean method2017(@OriginalArg(0) Class70 arg0) {
		if (arg0.anInt2899 > this.anInt2899) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt2899; local17++) {
			@Pc(23) byte local23 = this.aByteArray30[local17];
			if (local23 >= 65 && local23 <= 90 || local23 >= -64 && local23 <= -34 && local23 != -41) {
				local23 = (byte) (local23 + 32);
			}
			@Pc(56) byte local56 = arg0.aByteArray30[local17];
			if (local56 >= 65 && local56 <= 90 || local56 >= -64 && local56 <= -34 && local56 != -41) {
				local56 = (byte) (local56 + 32);
			}
			if (local56 != local23) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)J")
	public long method2018() {
		@Pc(12) long local12 = 0L;
		for (@Pc(14) int local14 = 0; local14 < this.anInt2899 && local14 < 12; local14++) {
			local12 *= 37L;
			@Pc(24) byte local24 = this.aByteArray30[local14];
			if (local24 >= 65 && local24 <= 90) {
				local12 += local24 + 1 - 65;
			} else if (local24 >= 97 && local24 <= 122) {
				local12 += local24 - 96;
			} else if (local24 >= 48 && local24 <= 57) {
				local12 += local24 - 21;
			}
		}
		while (local12 % 37L == 0L && local12 != 0L) {
			local12 /= 37L;
		}
		return local12;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Lclient!oc;")
	public Class70 method2019(@OriginalArg(0) int arg0) {
		return this.method2023(this.anInt2899, arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIB)Lclient!oc;")
	public Class70 method2020() {
		@Pc(13) Class70 local13 = new Class70();
		local13.anInt2899 = this.anInt2899;
		local13.aByteArray30 = new byte[this.anInt2899];
		for (@Pc(24) int local24 = 0; local24 < this.anInt2899; local24++) {
			@Pc(30) byte local30 = this.aByteArray30[local24];
			if (local30 == 47) {
				local13.aByteArray30[local24] = 32;
			} else {
				local13.aByteArray30[local24] = local30;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)Lclient!oc;")
	public Class70 method2021() {
		@Pc(7) Class70 local7 = new Class70();
		local7.anInt2899 = this.anInt2899;
		local7.aByteArray30 = new byte[this.anInt2899];
		for (@Pc(23) int local23 = 0; local23 < this.anInt2899; local23++) {
			@Pc(29) byte local29 = this.aByteArray30[local23];
			if (local29 >= 65 && local29 <= 90 || local29 >= -64 && local29 <= -34 && local29 != -41) {
				local29 = (byte) (local29 + 32);
			}
			local7.aByteArray30[local23] = local29;
		}
		return local7;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)[B")
	public byte[] method2022() {
		@Pc(15) byte[] local15 = new byte[this.anInt2899];
		Static218.method2016(this.aByteArray30, 0, local15, 0, this.anInt2899);
		return local15;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBI)Lclient!oc;")
	public Class70 method2023(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class70 local7 = new Class70();
		local7.anInt2899 = arg0 - arg1;
		local7.aByteArray30 = new byte[arg0 - arg1];
		Static218.method2016(this.aByteArray30, arg1, local7.aByteArray30, 0, local7.anInt2899);
		return local7;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIB[BI)I")
	public int method2024(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2) {
		Static218.method2016(this.aByteArray30, 0, arg1, arg2, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)I")
	public int method2025() {
		return this.method2029(10);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)Lclient!oc;")
	public Class70 method2026() {
		if (!this.aBoolean137) {
			throw new IllegalArgumentException();
		}
		this.anInt2883 = 0;
		if (this.aByteArray30.length != this.anInt2899) {
			@Pc(35) byte[] local35 = new byte[this.anInt2899];
			Static218.method2016(this.aByteArray30, 0, local35, 0, this.anInt2899);
			this.aByteArray30 = local35;
		}
		return this;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLclient!oc;)Z")
	public boolean method2027(@OriginalArg(1) Class70 arg0) {
		if (arg0.anInt2899 > this.anInt2899) {
			return false;
		}
		@Pc(24) int local24 = this.anInt2899 - arg0.anInt2899;
		for (@Pc(26) int local26 = 0; local26 < arg0.anInt2899; local26++) {
			if (this.aByteArray30[local24 + local26] != arg0.aByteArray30[local26]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)Lclient!oc;")
	public Class70 method2028() {
		@Pc(16) Class70 local16 = Static113.method1641(this.method2018());
		return local16 == null ? Static146.aClass70_1399 : local16;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)I")
	public int method2029(@OriginalArg(1) int arg0) {
		@Pc(5) boolean local5 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt2899; local21++) {
			@Pc(29) int local29 = this.aByteArray30[local21] & 0xFF;
			if (local21 == 0) {
				if (local29 == 45) {
					local5 = true;
					continue;
				}
				if (local29 == 43) {
					continue;
				}
			}
			if (local29 >= 48 && local29 <= 57) {
				local29 -= 48;
			} else if (local29 >= 65 && local29 <= 90) {
				local29 -= 55;
			} else if (local29 >= 97 && local29 <= 122) {
				local29 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (local29 >= arg0) {
				throw new NumberFormatException();
			}
			if (local5) {
				local29 = -local29;
			}
			@Pc(102) int local102 = local19 * arg0 + local29;
			if (local19 != local102 / arg0) {
				throw new NumberFormatException();
			}
			local17 = true;
			local19 = local102;
		}
		if (!local17) {
			throw new NumberFormatException();
		}
		return local19;
	}

	@OriginalMember(owner = "client!oc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method2030(@OriginalArg(0) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray30, 0, this.anInt2899, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray30, 0, this.anInt2899);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!oc;B)Lclient!oc;")
	public Class70 method2031(@OriginalArg(0) Class70 arg0) {
		if (!this.aBoolean137) {
			throw new IllegalArgumentException();
		}
		this.anInt2883 = 0;
		if (arg0.anInt2899 + this.anInt2899 > this.aByteArray30.length) {
			@Pc(31) int local31;
			for (local31 = 1; local31 < this.anInt2899 + arg0.anInt2899; local31 += local31) {
			}
			@Pc(51) byte[] local51 = new byte[local31];
			Static218.method2016(this.aByteArray30, 0, local51, 0, this.anInt2899);
			this.aByteArray30 = local51;
		}
		Static218.method2016(arg0.aByteArray30, 0, this.aByteArray30, this.anInt2899, arg0.anInt2899);
		this.anInt2899 += arg0.anInt2899;
		return this;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!oc;I)Z")
	public boolean method2032(@OriginalArg(0) Class70 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2899 == arg0.anInt2899) {
			if (!this.aBoolean137 || !arg0.aBoolean137) {
				if (this.anInt2883 == 0) {
					this.anInt2883 = this.method2044();
					if (this.anInt2883 == 0) {
						this.anInt2883 = 1;
					}
				}
				if (arg0.anInt2883 == 0) {
					arg0.anInt2883 = arg0.method2044();
					if (arg0.anInt2883 == 0) {
						arg0.anInt2883 = 1;
					}
				}
				if (arg0.anInt2883 != this.anInt2883) {
					return false;
				}
			}
			for (@Pc(67) int local67 = 0; local67 < this.anInt2899; local67++) {
				if (arg0.aByteArray30[local67] != this.aByteArray30[local67]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)Lclient!oc;")
	public Class70 method2033() {
		@Pc(8) Class70 local8 = new Class70();
		local8.anInt2899 = this.anInt2899;
		@Pc(18) boolean local18 = true;
		local8.aByteArray30 = new byte[this.anInt2899];
		for (@Pc(25) int local25 = 0; local25 < this.anInt2899; local25++) {
			@Pc(31) byte local31 = this.aByteArray30[local25];
			if (local31 == 95) {
				local8.aByteArray30[local25] = 32;
				local18 = true;
			} else if (local31 >= 97 && local31 <= 122 && local18) {
				local8.aByteArray30[local25] = (byte) (local31 - 32);
				local18 = false;
			} else {
				local18 = false;
				local8.aByteArray30[local25] = local31;
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
	public void method2034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2) {
		@Pc(17) String local17;
		try {
			local17 = new String(this.aByteArray30, 0, this.anInt2899, "ISO-8859-1");
		} catch (@Pc(19) UnsupportedEncodingException local19) {
			local17 = new String(this.aByteArray30, 0, this.anInt2899);
		}
		arg2.drawString(local17, arg0, arg1);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Lclient!oc;")
	public Class70 method2035(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(24) Class70 local24 = new Class70();
		local24.aByteArray30 = new byte[this.anInt2899 + 1];
		local24.anInt2899 = this.anInt2899 + 1;
		Static218.method2016(this.aByteArray30, 0, local24.aByteArray30, 0, this.anInt2899);
		local24.aByteArray30[this.anInt2899] = (byte) arg0;
		return local24;
	}

	@OriginalMember(owner = "client!oc", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method2044();
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(BLclient!oc;)I")
	public int method2036(@OriginalArg(1) Class70 arg0) {
		return this.method2038(arg0, 0);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)[Lclient!oc;")
	public Class70[] method2037(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2899; local7++) {
			if (arg0 == this.aByteArray30[local7]) {
				local5++;
			}
		}
		@Pc(33) Class70[] local33 = new Class70[local5 + 1];
		if (local5 == 0) {
			local33[0] = this;
			return local33;
		}
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		for (@Pc(47) int local47 = 0; local47 < local5; local47++) {
			@Pc(50) int local50;
			for (local50 = 0; arg0 != this.aByteArray30[local50 + local45]; local50++) {
			}
			local33[local43++] = this.method2023(local50 + local45, local45);
			local45 += local50 + 1;
		}
		local33[local5] = this.method2023(this.anInt2899, local45);
		return local33;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLclient!oc;I)I")
	public int method2038(@OriginalArg(1) Class70 arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int[] local3 = new int[arg0.anInt2899];
		@Pc(10) int[] local10 = new int[256];
		@Pc(14) int[] local14 = new int[arg0.anInt2899];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			local10[local16] = arg0.anInt2899;
		}
		for (@Pc(29) int local29 = 1; local29 <= arg0.anInt2899; local29++) {
			local3[local29 - 1] = (arg0.anInt2899 << 1) - local29;
			local10[arg0.aByteArray30[local29 - 1] & 0xFF] = arg0.anInt2899 - local29;
		}
		@Pc(72) int local72 = arg0.anInt2899 + 1;
		for (@Pc(75) int local75 = arg0.anInt2899; local75 > 0; local75--) {
			local14[local75 - 1] = local72;
			while (local72 <= arg0.anInt2899 && arg0.aByteArray30[local75 - 1] != arg0.aByteArray30[local72 - 1]) {
				if (arg0.anInt2899 - local75 <= local3[local72 + -1]) {
					local3[local72 - 1] = arg0.anInt2899 - local75;
				}
				local72 = local14[local72 - 1];
			}
			local72--;
		}
		@Pc(144) int local144 = local72;
		local72 = arg0.anInt2899 + 1 - local72;
		@Pc(154) int local154 = 1;
		@Pc(156) int local156 = 0;
		for (@Pc(158) int local158 = 1; local158 <= local72; local158++) {
			local14[local158 - 1] = local156;
			while (local156 >= 1 && arg0.aByteArray30[local158 - 1] != arg0.aByteArray30[local156 - 1]) {
				local156 = local14[local156 - 1];
			}
			local156++;
		}
		@Pc(200) int local200;
		while (local144 < arg0.anInt2899) {
			for (local200 = local154; local200 <= local144; local200++) {
				if (local3[local200 - 1] >= arg0.anInt2899 + local144 - local200) {
					local3[local200 - 1] = arg0.anInt2899 + local144 - local200;
				}
			}
			local154 = local144 + 1;
			local144 = local72 + local144 - local14[local72 - 1];
			local72 = local14[local72 - 1];
		}
		@Pc(277) int local277;
		for (local200 = arg1 + arg0.anInt2899 - 1; local200 < this.anInt2899; local200 += Math.max(local10[this.aByteArray30[local200] & 0xFF], local3[local277])) {
			for (local277 = arg0.anInt2899 - 1; local277 >= 0 && this.aByteArray30[local200] == arg0.aByteArray30[local277]; local277--) {
				local200--;
			}
			if (local277 == -1) {
				return local200 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/net/URL;I)Ljava/net/URL;")
	public URL method2039(@OriginalArg(0) URL arg0) throws MalformedURLException {
		return new URL(arg0, new String(this.aByteArray30, 0, this.anInt2899));
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/applet/Applet;B)V")
	public void method2041(@OriginalArg(0) Applet arg0) throws Throwable {
		@Pc(16) String local16 = new String(this.aByteArray30, 0, this.anInt2899);
		Static215.method868(arg0, local16);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(Lclient!oc;I)Z")
	public boolean method2042(@OriginalArg(0) Class70 arg0) {
		if (this.anInt2899 < arg0.anInt2899) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt2899; local17++) {
			if (this.aByteArray30[local17] != arg0.aByteArray30[local17]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/applet/Applet;I)Lclient!oc;")
	public Class70 method2043(@OriginalArg(0) Applet arg0) {
		@Pc(20) String local20 = new String(this.aByteArray30, 0, this.anInt2899);
		@Pc(24) String local24 = arg0.getParameter(local20);
		return local24 == null ? null : Static11.method251(local24);
	}

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)I")
	public int method2044() {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt2899; local15++) {
			local13 = (local13 << 5) + (this.aByteArray30[local15] & 0xFF) - local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!oc", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class70)) {
			throw new IllegalArgumentException();
		}
		return this.method2032((Class70) arg0);
	}

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)I")
	public int method2045() {
		return this.anInt2899;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)Lclient!oc;")
	public Class70 method2046() {
		@Pc(9) Class70 local9 = new Class70();
		local9.anInt2899 = this.anInt2899;
		local9.aByteArray30 = new byte[this.anInt2899];
		@Pc(25) byte local25 = 2;
		for (@Pc(27) int local27 = 0; local27 < this.anInt2899; local27++) {
			@Pc(34) byte local34 = this.aByteArray30[local27];
			if (local34 >= 97 && local34 <= 122 || !(local34 < -32 || local34 > -2 || local34 == -9)) {
				if (local25 == 2) {
					local34 = (byte) (local34 - 32);
				}
				local25 = 0;
			} else if (local34 >= 65 && local34 <= 90 || !(local34 < -64 || local34 > -34 || local34 == -41)) {
				if (local25 == 0) {
					local34 = (byte) (local34 + 32);
				}
				local25 = 0;
			} else if (local34 == 46 || local34 == 33 || local34 == 63) {
				local25 = 2;
			} else if (local34 != 32) {
				local25 = 1;
			} else if (local25 != 2) {
				local25 = 1;
			}
			local9.aByteArray30[local27] = local34;
		}
		return local9;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(IIB)I")
	public int method2047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte local13 = (byte) arg1;
		for (@Pc(15) int local15 = arg0; local15 < this.anInt2899; local15++) {
			if (local13 == this.aByteArray30[local15]) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(II)Lclient!oc;")
	public Class70 method2048(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean137) {
			this.anInt2883 = 0;
			if (this.aByteArray30.length == this.anInt2899) {
				@Pc(42) int local42;
				for (local42 = 1; local42 <= this.anInt2899; local42 += local42) {
				}
				@Pc(54) byte[] local54 = new byte[local42];
				Static218.method2016(this.aByteArray30, 0, local54, 0, this.anInt2899);
				this.aByteArray30 = local54;
			}
			this.aByteArray30[this.anInt2899++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(Z)Ljava/net/URL;")
	public URL method2049() throws MalformedURLException {
		return new URL(new String(this.aByteArray30, 0, this.anInt2899));
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(Lclient!oc;I)I")
	public int method2050(@OriginalArg(0) Class70 arg0) {
		@Pc(19) int local19;
		if (this.anInt2899 > arg0.anInt2899) {
			local19 = arg0.anInt2899;
		} else {
			local19 = this.anInt2899;
		}
		for (@Pc(25) int local25 = 0; local25 < local19; local25++) {
			if ((arg0.aByteArray30[local25] & 0xFF) > (this.aByteArray30[local25] & 0xFF)) {
				return -1;
			}
			if ((arg0.aByteArray30[local25] & 0xFF) < (this.aByteArray30[local25] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt2899 < arg0.anInt2899) {
			return -1;
		} else if (arg0.anInt2899 < this.anInt2899) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "(I)V")
	public void method2052() {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray30, 0, this.anInt2899, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray30, 0, this.anInt2899);
		}
		System.out.println(local13);
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)J")
	private long method2053() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2899; local7++) {
			local5 = (local5 << 5) - (local5 - ((long) (this.aByteArray30[local7] & 0xFF)));
		}
		return local5;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)Lclient!oc;")
	public Class70 method2054() {
		@Pc(5) Class70 local5 = new Class70();
		local5.anInt2899 = this.anInt2899;
		local5.aByteArray30 = new byte[this.anInt2899];
		for (@Pc(20) int local20 = 0; local20 < this.anInt2899; local20++) {
			local5.aByteArray30[local20] = 42;
		}
		return local5;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(II)I")
	public int method2055(@OriginalArg(0) int arg0) {
		return this.aByteArray30[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "(I)Lclient!oc;")
	public Class70 method2056() {
		@Pc(6) int local6 = this.anInt2899;
		@Pc(8) int local8;
		for (local8 = 0; local8 < this.anInt2899 && (this.aByteArray30[local8] >= 0 && this.aByteArray30[local8] <= 32 || (this.aByteArray30[local8] & 0xFF) == 160); local8++) {
		}
		while (local6 > local8 && (this.aByteArray30[local6 - 1] >= 0 && this.aByteArray30[local6 - 1] <= 32 || (this.aByteArray30[local6 - 1] & 0xFF) == 160)) {
			local6--;
		}
		if (local8 == 0 && local6 == this.anInt2899) {
			return this;
		}
		@Pc(85) Class70 local85 = new Class70();
		local85.anInt2899 = local6 - local8;
		local85.aByteArray30 = new byte[local85.anInt2899];
		for (@Pc(105) int local105 = 0; local105 < local85.anInt2899; local105++) {
			local85.aByteArray30[local105] = this.aByteArray30[local8 + local105];
		}
		return local85;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZ)Z")
	private boolean method2057() {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt2899; local21++) {
			@Pc(29) int local29 = this.aByteArray30[local21] & 0xFF;
			if (local21 == 0) {
				if (local29 == 45) {
					local15 = true;
					continue;
				}
				if (local29 == 43) {
					continue;
				}
			}
			if (local29 >= 48 && local29 <= 57) {
				local29 -= 48;
			} else if (local29 >= 65 && local29 <= 90) {
				local29 -= 55;
			} else if (local29 >= 97 && local29 <= 122) {
				local29 -= 87;
			} else {
				return false;
			}
			if (local29 >= 10) {
				return false;
			}
			if (local15) {
				local29 = -local29;
			}
			@Pc(101) int local101 = local29 + local19 * 10;
			if (local19 != local101 / 10) {
				return false;
			}
			local19 = local101;
			local17 = true;
		}
		return local17;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!oc;)I")
	public int method2058(@OriginalArg(1) Class70 arg0) {
		@Pc(15) int local15;
		if (this.anInt2899 > arg0.anInt2899) {
			local15 = arg0.anInt2899;
		} else {
			local15 = this.anInt2899;
		}
		for (@Pc(21) int local21 = 0; local21 < local15; local21++) {
			if (Static109.anIntArray125[this.aByteArray30[local21] & 0xFF] < Static109.anIntArray125[arg0.aByteArray30[local21] & 0xFF]) {
				return -1;
			}
			if (Static109.anIntArray125[this.aByteArray30[local21] & 0xFF] > Static109.anIntArray125[arg0.aByteArray30[local21] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt2899 < arg0.anInt2899) {
			return -1;
		} else if (this.anInt2899 > arg0.anInt2899) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(ILclient!oc;)Z")
	public boolean method2059(@OriginalArg(1) Class70 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2899 == arg0.anInt2899) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt2899; local16++) {
				@Pc(22) byte local22 = this.aByteArray30[local16];
				@Pc(27) byte local27 = arg0.aByteArray30[local16];
				if (local27 >= 65 && local27 <= 90 || local27 >= -64 && local27 <= -34 && local27 != -41) {
					local27 = (byte) (local27 + 32);
				}
				if (local22 >= 65 && local22 <= 90 || local22 >= -64 && local22 <= -34 && local22 != -41) {
					local22 = (byte) (local22 + 32);
				}
				if (local22 != local27) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(B)Lclient!oc;")
	public Class70 method2060() {
		@Pc(3) long local3 = this.method2053();
		@Pc(16) Class local16 = oc.class;
		synchronized (oc.class) {
			@Pc(26) Class3_Sub5 local26;
			if (Static10.aClass40_1 == null) {
				Static10.aClass40_1 = new Class40(4096);
			} else {
				for (local26 = (Class3_Sub5) Static10.aClass40_1.method1029(local3); local26 != null; local26 = (Class3_Sub5) Static10.aClass40_1.method1028()) {
					if (this.method2032(local26.aClass70_281)) {
						return local26.aClass70_281;
					}
				}
			}
			local26 = new Class3_Sub5();
			local26.aClass70_281 = this;
			this.aBoolean137 = false;
			Static10.aClass40_1.method1027(local26, local3);
			return this;
		}
	}

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "(I)Z")
	public boolean method2061() {
		return this.method2057();
	}
}
