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

@OriginalClass("client!vd")
public final class Class92 implements Interface1 {

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
	public int anInt4244;

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
	private int anInt4253;

	@OriginalMember(owner = "client!vd", name = "db", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!vd", name = "bb", descriptor = "Z")
	private boolean aBoolean231 = true;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)Lclient!vd;")
	public Class92 method3196() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt4244 && (this.aByteArray52[local7] >= 0 && this.aByteArray52[local7] <= 32 || (this.aByteArray52[local7] & 0xFF) == 160); local7++) {
		}
		@Pc(44) int local44;
		for (local44 = this.anInt4244; local7 < local44 && (this.aByteArray52[local44 - 1] >= 0 && this.aByteArray52[local44 - 1] <= 32 || (this.aByteArray52[local44 - 1] & 0xFF) == 160); local44--) {
		}
		if (local7 == 0 && this.anInt4244 == local44) {
			return this;
		}
		@Pc(87) Class92 local87 = new Class92();
		local87.anInt4244 = local44 - local7;
		local87.aByteArray52 = new byte[local87.anInt4244];
		for (@Pc(100) int local100 = 0; local100 < local87.anInt4244; local100++) {
			local87.aByteArray52[local100] = this.aByteArray52[local7 + local100];
		}
		return local87;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)I")
	public int method3197(@OriginalArg(1) int arg0) {
		@Pc(3) boolean local3 = false;
		@Pc(5) int local5 = 0;
		@Pc(7) boolean local7 = false;
		for (@Pc(21) int local21 = 0; local21 < this.anInt4244; local21++) {
			@Pc(30) int local30 = this.aByteArray52[local21] & 0xFF;
			if (local21 == 0) {
				if (local30 == 45) {
					local7 = true;
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
			if (local30 >= arg0) {
				throw new NumberFormatException();
			}
			if (local7) {
				local30 = -local30;
			}
			@Pc(99) int local99 = local30 + arg0 * local5;
			if (local5 != local99 / arg0) {
				throw new NumberFormatException();
			}
			local5 = local99;
			local3 = true;
		}
		if (!local3) {
			throw new NumberFormatException();
		}
		return local5;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)Lclient!vd;")
	public Class92 method3198() {
		@Pc(9) Class92 local9 = new Class92();
		local9.anInt4244 = this.anInt4244;
		local9.aByteArray52 = new byte[this.anInt4244];
		@Pc(20) boolean local20 = true;
		for (@Pc(30) int local30 = 0; local30 < this.anInt4244; local30++) {
			@Pc(37) byte local37 = this.aByteArray52[local30];
			if (local37 == 95) {
				local9.aByteArray52[local30] = 32;
				local20 = true;
			} else if (local37 >= 97 && local37 <= 122 && local20) {
				local9.aByteArray52[local30] = (byte) (local37 - 32);
				local20 = false;
			} else {
				local9.aByteArray52[local30] = local37;
				local20 = false;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method3199(@OriginalArg(0) FontMetrics arg0) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray52, 0, this.anInt4244, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray52, 0, this.anInt4244);
		}
		return arg0.stringWidth(local9);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)Lclient!vd;")
	public Class92 method3201() {
		@Pc(16) Class92 local16 = Static179.method2937(this.method3217());
		return local16 == null ? Static6.aClass92_56 : local16;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)Lclient!vd;")
	public Class92 method3202() {
		@Pc(7) long local7 = this.method3215();
		@Pc(16) Class local16 = vd.class;
		synchronized (vd.class) {
			@Pc(26) Class1_Sub6 local26;
			if (Static74.aClass97_8 == null) {
				Static74.aClass97_8 = new Class97(4096);
			} else {
				for (local26 = (Class1_Sub6) Static74.aClass97_8.method3375(local7); local26 != null; local26 = (Class1_Sub6) Static74.aClass97_8.method3373()) {
					if (this.method3243(local26.aClass92_343)) {
						return local26.aClass92_343;
					}
				}
			}
			local26 = new Class1_Sub6();
			this.aBoolean231 = false;
			local26.aClass92_343 = this;
			Static74.aClass97_8.method3374(local26, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILjava/applet/Applet;)Lclient!vd;")
	public Class92 method3203(@OriginalArg(1) Applet arg0) {
		@Pc(13) String local13 = new String(this.aByteArray52, 0, this.anInt4244);
		@Pc(17) String local17 = arg0.getParameter(local13);
		return local17 == null ? null : Static15.method261(local17);
	}

	@OriginalMember(owner = "client!vd", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class92)) {
			throw new IllegalArgumentException();
		}
		return this.method3243((Class92) arg0);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)Lclient!vd;")
	public Class92 method3204(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean231) {
			this.anInt4253 = 0;
			if (this.anInt4244 == this.aByteArray52.length) {
				@Pc(52) int local52;
				for (local52 = 1; local52 <= this.anInt4244; local52 += local52) {
				}
				@Pc(65) byte[] local65 = new byte[local52];
				Static216.method2200(this.aByteArray52, 0, local65, 0, this.anInt4244);
				this.aByteArray52 = local65;
			}
			this.aByteArray52[this.anInt4244++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!vd;)Z")
	public boolean method3205(@OriginalArg(1) Class92 arg0) {
		if (arg0.anInt4244 > this.anInt4244) {
			return false;
		}
		for (@Pc(24) int local24 = 0; local24 < arg0.anInt4244; local24++) {
			if (arg0.aByteArray52[local24] != this.aByteArray52[local24]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!vd;I)I")
	public int method3206(@OriginalArg(0) Class92 arg0) {
		@Pc(21) int local21;
		if (this.anInt4244 > arg0.anInt4244) {
			local21 = arg0.anInt4244;
		} else {
			local21 = this.anInt4244;
		}
		for (@Pc(28) int local28 = 0; local28 < local21; local28++) {
			if (Static71.anIntArray129[arg0.aByteArray52[local28] & 0xFF] > Static71.anIntArray129[this.aByteArray52[local28] & 0xFF]) {
				return -1;
			}
			if (Static71.anIntArray129[arg0.aByteArray52[local28] & 0xFF] < Static71.anIntArray129[this.aByteArray52[local28] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt4244 > this.anInt4244) {
			return -1;
		} else if (arg0.anInt4244 < this.anInt4244) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)Ljava/net/URL;")
	public URL method3207() throws MalformedURLException {
		return new URL(new String(this.aByteArray52, 0, this.anInt4244));
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)Lclient!vd;")
	public Class92 method3208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class92 local3 = new Class92();
		local3.aByteArray52 = new byte[arg0 - arg1];
		local3.anInt4244 = arg0 - arg1;
		Static216.method2200(this.aByteArray52, arg1, local3.aByteArray52, 0, local3.anInt4244);
		return local3;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLclient!vd;)I")
	public int method3209(@OriginalArg(1) Class92 arg0) {
		@Pc(17) int local17;
		if (this.anInt4244 > arg0.anInt4244) {
			local17 = arg0.anInt4244;
		} else {
			local17 = this.anInt4244;
		}
		for (@Pc(24) int local24 = 0; local24 < local17; local24++) {
			if ((arg0.aByteArray52[local24] & 0xFF) > (this.aByteArray52[local24] & 0xFF)) {
				return -1;
			}
			if ((arg0.aByteArray52[local24] & 0xFF) < (this.aByteArray52[local24] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.anInt4244 > this.anInt4244) {
			return -1;
		} else if (arg0.anInt4244 < this.anInt4244) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)I")
	public int method3210() {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < this.anInt4244; local7++) {
			local5 = (this.aByteArray52[local7] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
	public void method3211() {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray52, 0, this.anInt4244, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray52, 0, this.anInt4244);
		}
		System.out.println(local13);
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)Lclient!vd;")
	public Class92 method3213() {
		@Pc(5) Class92 local5 = new Class92();
		@Pc(11) byte local11 = 2;
		local5.anInt4244 = this.anInt4244;
		local5.aByteArray52 = new byte[this.anInt4244];
		for (@Pc(27) int local27 = 0; local27 < this.anInt4244; local27++) {
			@Pc(34) byte local34 = this.aByteArray52[local27];
			if (local34 >= 97 && local34 <= 122 || !(local34 < -32 || local34 > -2 || local34 == -9)) {
				if (local11 == 2) {
					local34 = (byte) (local34 - 32);
				}
				local11 = 0;
			} else if (local34 >= 65 && local34 <= 90 || !(local34 < -64 || local34 > -34 || local34 == -41)) {
				if (local11 == 0) {
					local34 = (byte) (local34 + 32);
				}
				local11 = 0;
			} else if (local34 == 46 || local34 == 33 || local34 == 63) {
				local11 = 2;
			} else if (local34 != 32) {
				local11 = 1;
			} else if (local11 != 2) {
				local11 = 1;
			}
			local5.aByteArray52[local27] = local34;
		}
		return local5;
	}

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "(I)J")
	private long method3215() {
		@Pc(13) long local13 = 0L;
		for (@Pc(15) int local15 = 0; local15 < this.anInt4244; local15++) {
			local13 = (local13 << 5) + (long) (this.aByteArray52[local15] & 0xFF) - local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "(I)J")
	public long method3217() {
		@Pc(7) long local7 = 0L;
		for (@Pc(14) int local14 = 0; local14 < this.anInt4244 && local14 < 12; local14++) {
			local7 *= 37L;
			@Pc(25) byte local25 = this.aByteArray52[local14];
			if (local25 >= 65 && local25 <= 90) {
				local7 += local25 - 64;
			} else if (local25 >= 97 && local25 <= 122) {
				local7 += local25 + 1 - 97;
			} else if (local25 >= 48 && local25 <= 57) {
				local7 += local25 + 27 - 48;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(III)Lclient!vd;")
	public Class92 method3218() {
		@Pc(20) Class92 local20 = new Class92();
		local20.anInt4244 = this.anInt4244;
		local20.aByteArray52 = new byte[this.anInt4244];
		for (@Pc(31) int local31 = 0; local31 < this.anInt4244; local31++) {
			@Pc(38) byte local38 = this.aByteArray52[local31];
			if (local38 == 47) {
				local20.aByteArray52[local31] = 32;
			} else {
				local20.aByteArray52[local31] = local38;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)Lclient!vd;")
	public Class92 method3219() {
		if (!this.aBoolean231) {
			throw new IllegalArgumentException();
		}
		this.anInt4253 = 0;
		if (this.aByteArray52.length != this.anInt4244) {
			@Pc(35) byte[] local35 = new byte[this.anInt4244];
			Static216.method2200(this.aByteArray52, 0, local35, 0, this.anInt4244);
			this.aByteArray52 = local35;
		}
		return this;
	}

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "(I)Lclient!vd;")
	public Class92 method3220() {
		@Pc(9) Class92 local9 = new Class92();
		local9.anInt4244 = this.anInt4244;
		local9.aByteArray52 = new byte[this.anInt4244];
		for (@Pc(20) int local20 = 0; local20 < this.anInt4244; local20++) {
			@Pc(27) byte local27 = this.aByteArray52[local20];
			if (local27 >= 65 && local27 <= 90 || local27 >= -64 && local27 <= -34 && local27 != -41) {
				local27 = (byte) (local27 + 32);
			}
			local9.aByteArray52[local20] = local27;
		}
		return local9;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/net/URL;I)Ljava/net/URL;")
	public URL method3221(@OriginalArg(0) URL arg0) throws MalformedURLException {
		return new URL(arg0, new String(this.aByteArray52, 0, this.anInt4244));
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method3222(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray52, 0, this.anInt4244, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray52, 0, this.anInt4244);
		}
		arg1.drawString(local13, arg0, arg2);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Lclient!vd;I)Z")
	public boolean method3223(@OriginalArg(0) Class92 arg0) {
		if (arg0.anInt4244 > this.anInt4244) {
			return false;
		}
		@Pc(22) int local22 = this.anInt4244 - arg0.anInt4244;
		for (@Pc(29) int local29 = 0; local29 < arg0.anInt4244; local29++) {
			if (this.aByteArray52[local29 + local22] != arg0.aByteArray52[local29]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(BLclient!vd;)Z")
	public boolean method3224(@OriginalArg(1) Class92 arg0) {
		if (arg0.anInt4244 > this.anInt4244) {
			return false;
		}
		for (@Pc(26) int local26 = 0; local26 < arg0.anInt4244; local26++) {
			@Pc(33) byte local33 = arg0.aByteArray52[local26];
			if (local33 >= 65 && local33 <= 90 || local33 >= -64 && local33 <= -34 && local33 != -41) {
				local33 = (byte) (local33 + 32);
			}
			@Pc(62) byte local62 = this.aByteArray52[local26];
			if (local62 >= 65 && local62 <= 90 || local62 >= -64 && local62 <= -34 && local62 != -41) {
				local62 = (byte) (local62 + 32);
			}
			if (local33 != local62) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([BIIII)I")
	public int method3225(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static216.method2200(this.aByteArray52, 0, arg0, arg2, arg1);
		return arg1;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZI)I")
	public int method3227(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte local8 = (byte) arg1;
		for (@Pc(10) int local10 = arg0; local10 < this.anInt4244; local10++) {
			if (this.aByteArray52[local10] == local8) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "(I)[B")
	public byte[] method3228() {
		@Pc(3) byte[] local3 = new byte[this.anInt4244];
		Static216.method2200(this.aByteArray52, 0, local3, 0, this.anInt4244);
		return local3;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)[Lclient!vd;")
	public Class92[] method3229(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt4244; local9++) {
			if (arg0 == this.aByteArray52[local9]) {
				local7++;
			}
		}
		@Pc(32) Class92[] local32 = new Class92[local7 + 1];
		if (local7 == 0) {
			local32[0] = this;
			return local32;
		}
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < local7; local46++) {
			@Pc(50) int local50;
			for (local50 = 0; arg0 != this.aByteArray52[local44 + local50]; local50++) {
			}
			local32[local42++] = this.method3208(local50 + local44, local44);
			local44 += local50 + 1;
		}
		local32[local7] = this.method3208(this.anInt4244, local44);
		return local32;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)Z")
	private boolean method3230() {
		@Pc(7) boolean local7 = false;
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		for (@Pc(34) int local34 = 0; local34 < this.anInt4244; local34++) {
			@Pc(43) int local43 = this.aByteArray52[local34] & 0xFF;
			if (local34 == 0) {
				if (local43 == 45) {
					local7 = true;
					continue;
				}
				if (local43 == 43) {
					continue;
				}
			}
			if (local43 >= 48 && local43 <= 57) {
				local43 -= 48;
			} else if (local43 >= 65 && local43 <= 90) {
				local43 -= 55;
			} else if (local43 >= 97 && local43 <= 122) {
				local43 -= 87;
			} else {
				return false;
			}
			if (local43 >= 10) {
				return false;
			}
			if (local7) {
				local43 = -local43;
			}
			@Pc(108) int local108 = local43 + local32 * 10;
			if (local32 != local108 / 10) {
				return false;
			}
			local32 = local108;
			local30 = true;
		}
		return local30;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(II)I")
	public int method3231(@OriginalArg(0) int arg0) {
		return this.aByteArray52[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(II)Lclient!vd;")
	public Class92 method3232(@OriginalArg(1) int arg0) {
		return this.method3208(this.anInt4244, arg0);
	}

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "(I)I")
	public int method3233() {
		return this.anInt4244;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!vd;B)I")
	public int method3234(@OriginalArg(0) Class92 arg0) {
		return this.method3238(arg0, 0);
	}

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "(I)I")
	public int method3235() {
		return this.method3197(10);
	}

	@OriginalMember(owner = "client!vd", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method3210();
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(Lclient!vd;I)Lclient!vd;")
	public Class92 method3237(@OriginalArg(0) Class92 arg0) {
		if (!this.aBoolean231) {
			throw new IllegalArgumentException();
		}
		this.anInt4253 = 0;
		if (this.anInt4244 + arg0.anInt4244 > this.aByteArray52.length) {
			@Pc(27) int local27;
			for (local27 = 1; local27 < arg0.anInt4244 + this.anInt4244; local27 += local27) {
			}
			@Pc(47) byte[] local47 = new byte[local27];
			Static216.method2200(this.aByteArray52, 0, local47, 0, this.anInt4244);
			this.aByteArray52 = local47;
		}
		Static216.method2200(arg0.aByteArray52, 0, this.aByteArray52, this.anInt4244, arg0.anInt4244);
		this.anInt4244 += arg0.anInt4244;
		return this;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!vd;IB)I")
	public int method3238(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int[] local9 = new int[arg0.anInt4244];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg0.anInt4244];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg0.anInt4244;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg0.anInt4244; local36++) {
			local9[local36 - 1] = (arg0.anInt4244 << 1) - local36;
			local12[arg0.aByteArray52[local36 - 1] & 0xFF] = arg0.anInt4244 - local36;
		}
		@Pc(79) int local79 = arg0.anInt4244 + 1;
		for (@Pc(82) int local82 = arg0.anInt4244; local82 > 0; local82--) {
			local16[local82 - 1] = local79;
			while (arg0.anInt4244 >= local79 && arg0.aByteArray52[local82 - 1] != arg0.aByteArray52[local79 - 1]) {
				if (local9[local79 - 1] >= arg0.anInt4244 - local82) {
					local9[local79 - 1] = arg0.anInt4244 - local82;
				}
				local79 = local16[local79 - 1];
			}
			local79--;
		}
		@Pc(149) int local149 = local79;
		@Pc(151) int local151 = 1;
		@Pc(153) int local153 = 0;
		local79 = arg0.anInt4244 + 1 - local79;
		@Pc(163) int local163 = 1;
		while (local163 <= local79) {
			local16[local163 - 1] = local153;
			while (local153 >= 1 && arg0.aByteArray52[local163 - 1] != arg0.aByteArray52[local153 - 1]) {
				local153 = local16[local153 - 1];
			}
			local163++;
			local153++;
		}
		@Pc(218) int local218;
		while (local149 < arg0.anInt4244) {
			for (local218 = local151; local218 <= local149; local218++) {
				if (local9[local218 - 1] >= local149 + arg0.anInt4244 - local218) {
					local9[local218 - 1] = local149 + arg0.anInt4244 - local218;
				}
			}
			local151 = local149 + 1;
			local149 += local79 - local16[local79 - 1];
			local79 = local16[local79 - 1];
		}
		@Pc(300) int local300;
		for (local218 = arg0.anInt4244 + arg1 - 1; local218 < this.anInt4244; local218 += Math.max(local12[this.aByteArray52[local218] & 0xFF], local9[local300])) {
			for (local300 = arg0.anInt4244 - 1; local300 >= 0 && arg0.aByteArray52[local300] == this.aByteArray52[local218]; local300--) {
				local218--;
			}
			if (local300 == -1) {
				return local218 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "(I)Z")
	public boolean method3239() {
		return this.method3230();
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)Lclient!vd;")
	public Class92 method3240() {
		@Pc(5) Class92 local5 = new Class92();
		local5.anInt4244 = this.anInt4244;
		local5.aByteArray52 = new byte[this.anInt4244];
		for (@Pc(20) int local20 = 0; local20 < this.anInt4244; local20++) {
			local5.aByteArray52[local20] = 42;
		}
		return local5;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Lclient!vd;B)Z")
	public boolean method3241(@OriginalArg(0) Class92 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt4244 == this.anInt4244) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt4244; local18++) {
				@Pc(25) byte local25 = arg0.aByteArray52[local18];
				if (local25 >= 65 && local25 <= 90 || local25 >= -64 && local25 <= -34 && local25 != -41) {
					local25 = (byte) (local25 + 32);
				}
				@Pc(58) byte local58 = this.aByteArray52[local18];
				if (local58 >= 65 && local58 <= 90 || local58 >= -64 && local58 <= -34 && local58 != -41) {
					local58 = (byte) (local58 + 32);
				}
				if (local25 != local58) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)Lclient!vd;")
	public Class92 method3242(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(22) Class92 local22 = new Class92();
		local22.aByteArray52 = new byte[this.anInt4244 + 1];
		local22.anInt4244 = this.anInt4244 + 1;
		Static216.method2200(this.aByteArray52, 0, local22.aByteArray52, 0, this.anInt4244);
		local22.aByteArray52[this.anInt4244] = (byte) arg0;
		return local22;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!vd;Z)Z")
	public boolean method3243(@OriginalArg(0) Class92 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt4244 == arg0.anInt4244) {
			if (!this.aBoolean231 || !arg0.aBoolean231) {
				if (this.anInt4253 == 0) {
					this.anInt4253 = this.method3210();
					if (this.anInt4253 == 0) {
						this.anInt4253 = 1;
					}
				}
				if (arg0.anInt4253 == 0) {
					arg0.anInt4253 = arg0.method3210();
					if (arg0.anInt4253 == 0) {
						arg0.anInt4253 = 1;
					}
				}
				if (arg0.anInt4253 != this.anInt4253) {
					return false;
				}
			}
			for (@Pc(71) int local71 = 0; local71 < this.anInt4244; local71++) {
				if (this.aByteArray52[local71] != arg0.aByteArray52[local71]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(ILjava/applet/Applet;)V")
	public void method3244(@OriginalArg(1) Applet arg0) throws Throwable {
		@Pc(12) String local12 = new String(this.aByteArray52, 0, this.anInt4244);
		Static214.method1964(local12, arg0);
	}
}
