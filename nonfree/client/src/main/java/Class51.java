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

@OriginalClass("client!ia")
public final class Class51 implements Interface2 {

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
	private int anInt1834;

	@OriginalMember(owner = "client!ia", name = "fb", descriptor = "I")
	public int anInt1858;

	@OriginalMember(owner = "client!ia", name = "pb", descriptor = "Z")
	private boolean aBoolean83 = true;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)[B")
	public byte[] method1387() {
		@Pc(13) byte[] local13 = new byte[this.anInt1858];
		Static233.method868(this.aByteArray17, 0, local13, 0, this.anInt1858);
		return local13;
	}

	@OriginalMember(owner = "client!ia", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class51)) {
			throw new IllegalArgumentException();
		}
		return this.method1426((Class51) arg0);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)J")
	public long method1388() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; this.anInt1858 > local7 && local7 < 12; local7++) {
			@Pc(13) byte local13 = this.aByteArray17[local7];
			local5 *= 37L;
			if (local13 >= 65 && local13 <= 90) {
				local5 += local13 + 1 - 65;
			} else if (local13 >= 97 && local13 <= 122) {
				local5 += local13 - 96;
			} else if (local13 >= 48 && local13 <= 57) {
				local5 += local13 + 27 - 48;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILclient!ia;)I")
	public int method1389(@OriginalArg(1) int arg0, @OriginalArg(2) Class51 arg1) {
		@Pc(4) int[] local4 = new int[256];
		@Pc(12) int[] local12 = new int[arg1.anInt1858];
		@Pc(16) int[] local16 = new int[arg1.anInt1858];
		for (@Pc(18) int local18 = 0; local18 < local4.length; local18++) {
			local4[local18] = arg1.anInt1858;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg1.anInt1858; local36++) {
			local16[local36 - 1] = (arg1.anInt1858 << 1) - local36;
			local4[arg1.aByteArray17[local36 - 1] & 0xFF] = arg1.anInt1858 - local36;
		}
		@Pc(79) int local79 = arg1.anInt1858 + 1;
		@Pc(82) int local82 = arg1.anInt1858;
		while (local82 > 0) {
			local12[local82 - 1] = local79;
			while (local79 <= arg1.anInt1858 && arg1.aByteArray17[local79 - 1] != arg1.aByteArray17[local82 - 1]) {
				if (arg1.anInt1858 - local82 <= local16[local79 - 1]) {
					local16[local79 - 1] = arg1.anInt1858 - local82;
				}
				local79 = local12[local79 - 1];
			}
			local82--;
			local79--;
		}
		@Pc(153) int local153 = local79;
		local79 = arg1.anInt1858 + 1 - local79;
		@Pc(163) int local163 = 0;
		for (@Pc(165) int local165 = 1; local165 <= local79; local165++) {
			local12[local165 - 1] = local163;
			while (local163 >= 1 && arg1.aByteArray17[local165 - 1] != arg1.aByteArray17[local163 - 1]) {
				local163 = local12[local163 - 1];
			}
			local163++;
		}
		@Pc(210) int local210 = 1;
		@Pc(214) int local214;
		while (local153 < arg1.anInt1858) {
			for (local214 = local210; local214 <= local153; local214++) {
				if (local16[local214 - 1] >= arg1.anInt1858 + local153 - local214) {
					local16[local214 - 1] = local153 + arg1.anInt1858 - local214;
				}
			}
			local210 = local153 + 1;
			local153 = local79 + local153 - local12[local79 + -1];
			local79 = local12[local79 - 1];
		}
		@Pc(292) int local292;
		for (local214 = arg1.anInt1858 + arg0 - 1; local214 < this.anInt1858; local214 += Math.max(local4[this.aByteArray17[local214] & 0xFF], local16[local292])) {
			for (local292 = arg1.anInt1858 - 1; local292 >= 0 && this.aByteArray17[local214] == arg1.aByteArray17[local292]; local292--) {
				local214--;
			}
			if (local292 == -1) {
				return local214 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!ia;I)I")
	public int method1390(@OriginalArg(0) Class51 arg0) {
		@Pc(17) int local17;
		if (this.anInt1858 > arg0.anInt1858) {
			local17 = arg0.anInt1858;
		} else {
			local17 = this.anInt1858;
		}
		for (@Pc(24) int local24 = 0; local24 < local17; local24++) {
			if (Static55.anIntArray79[arg0.aByteArray17[local24] & 0xFF] > Static55.anIntArray79[this.aByteArray17[local24] & 0xFF]) {
				return -1;
			}
			if (Static55.anIntArray79[arg0.aByteArray17[local24] & 0xFF] < Static55.anIntArray79[this.aByteArray17[local24] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt1858 < arg0.anInt1858) {
			return -1;
		} else if (arg0.anInt1858 < this.anInt1858) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)Lclient!ia;")
	public Class51 method1391() {
		@Pc(7) long local7 = this.method1420();
		@Pc(16) Class local16 = ia.class;
		synchronized (ia.class) {
			@Pc(26) Class1_Sub26 local26;
			if (Static191.aClass102_19 == null) {
				Static191.aClass102_19 = new Class102(4096);
			} else {
				for (local26 = (Class1_Sub26) Static191.aClass102_19.method3093(local7); local26 != null; local26 = (Class1_Sub26) Static191.aClass102_19.method3089()) {
					if (this.method1426(local26.aClass51_1609)) {
						return local26.aClass51_1609;
					}
				}
			}
			local26 = new Class1_Sub26();
			local26.aClass51_1609 = this;
			this.aBoolean83 = false;
			Static191.aClass102_19.method3083(local26, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)I")
	public int method1392(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) boolean local9 = false;
		@Pc(24) boolean local24 = false;
		for (@Pc(26) int local26 = 0; local26 < this.anInt1858; local26++) {
			@Pc(35) int local35 = this.aByteArray17[local26] & 0xFF;
			if (local26 == 0) {
				if (local35 == 45) {
					local24 = true;
					continue;
				}
				if (local35 == 43) {
					continue;
				}
			}
			if (local35 >= 48 && local35 <= 57) {
				local35 -= 48;
			} else if (local35 >= 65 && local35 <= 90) {
				local35 -= 55;
			} else if (local35 >= 97 && local35 <= 122) {
				local35 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (local35 >= arg0) {
				throw new NumberFormatException();
			}
			if (local24) {
				local35 = -local35;
			}
			@Pc(106) int local106 = arg0 * local7 + local35;
			if (local7 != local106 / arg0) {
				throw new NumberFormatException();
			}
			local7 = local106;
			local9 = true;
		}
		if (!local9) {
			throw new NumberFormatException();
		}
		return local7;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!ia;B)Z")
	public boolean method1393(@OriginalArg(0) Class51 arg0) {
		if (this.anInt1858 < arg0.anInt1858) {
			return false;
		}
		for (@Pc(23) int local23 = 0; local23 < arg0.anInt1858; local23++) {
			if (this.aByteArray17[local23] != arg0.aByteArray17[local23]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Lclient!ia;")
	public Class51 method1394(@OriginalArg(0) int arg0) {
		return this.method1433(arg0, this.anInt1858);
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)[B")
	public byte[] method1396() {
		if (this.anInt1858 == 0) {
			return new byte[0];
		}
		@Pc(19) int local19 = this.anInt1858 + 3 & 0xFFFFFFFC;
		@Pc(25) int local25 = local19 / 4 * 3;
		if (local19 - 2 >= this.anInt1858 || Static167.method2866(this.aByteArray17[local19 - 2]) == -1) {
			local25 -= 2;
		} else if (this.anInt1858 <= local19 - 1 || Static167.method2866(this.aByteArray17[local19 - 1]) == -1) {
			local25--;
		}
		@Pc(78) byte[] local78 = new byte[local25];
		this.method1429(0, local78);
		return local78;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	public void method1398(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray17, 0, this.anInt1858, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray17, 0, this.anInt1858);
		}
		arg1.drawString(local9, arg2, arg0);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)I")
	public int method1399() {
		return this.anInt1858;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/applet/Applet;I)Ljava/lang/Object;")
	public Object method1400(@OriginalArg(0) Applet arg0) throws Throwable {
		@Pc(12) String local12 = new String(this.aByteArray17, 0, this.anInt1858);
		@Pc(18) Object local18 = Static232.method508(local12, null, arg0);
		if (local18 instanceof String) {
			@Pc(25) byte[] local25 = ((String) local18).getBytes();
			local18 = Static191.method3197(local25.length, 0, local25);
		}
		return local18;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLclient!ia;)Z")
	public boolean method1401(@OriginalArg(1) Class51 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt1858 == this.anInt1858) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt1858; local30++) {
				@Pc(37) byte local37 = this.aByteArray17[local30];
				if (local37 >= 65 && local37 <= 90 || local37 >= -64 && local37 <= -34 && local37 != -41) {
					local37 = (byte) (local37 + 32);
				}
				@Pc(70) byte local70 = arg0.aByteArray17[local30];
				if (local70 >= 65 && local70 <= 90 || local70 >= -64 && local70 <= -34 && local70 != -41) {
					local70 = (byte) (local70 + 32);
				}
				if (local70 != local37) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)Lclient!ia;")
	public Class51 method1402() {
		@Pc(14) Class51 local14 = new Class51();
		@Pc(16) byte local16 = 2;
		local14.anInt1858 = this.anInt1858;
		local14.aByteArray17 = new byte[this.anInt1858];
		for (@Pc(27) int local27 = 0; local27 < this.anInt1858; local27++) {
			@Pc(34) byte local34 = this.aByteArray17[local27];
			if (local34 >= 97 && local34 <= 122 || !(local34 < -32 || local34 > -2 || local34 == -9)) {
				if (local16 == 2) {
					local34 = (byte) (local34 - 32);
				}
				local16 = 0;
			} else if (local34 >= 65 && local34 <= 90 || !(local34 < -64 || local34 > -34 || local34 == -41)) {
				if (local16 == 0) {
					local34 = (byte) (local34 + 32);
				}
				local16 = 0;
			} else if (local34 == 46 || local34 == 33 || local34 == 63) {
				local16 = 2;
			} else if (local34 != 32) {
				local16 = 1;
			} else if (local16 != 2) {
				local16 = 1;
			}
			local14.aByteArray17[local27] = local34;
		}
		return local14;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLclient!ia;)I")
	public int method1403(@OriginalArg(1) Class51 arg0) {
		return this.method1389(0, arg0);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!ia;)Lclient!ia;")
	public Class51 method1404(@OriginalArg(1) Class51 arg0) {
		if (!this.aBoolean83) {
			throw new IllegalArgumentException();
		}
		this.anInt1834 = 0;
		if (this.anInt1858 + arg0.anInt1858 > this.aByteArray17.length) {
			@Pc(36) int local36;
			for (local36 = 1; local36 < arg0.anInt1858 + this.anInt1858; local36 += local36) {
			}
			@Pc(56) byte[] local56 = new byte[local36];
			Static233.method868(this.aByteArray17, 0, local56, 0, this.anInt1858);
			this.aByteArray17 = local56;
		}
		Static233.method868(arg0.aByteArray17, 0, this.aByteArray17, this.anInt1858, arg0.anInt1858);
		this.anInt1858 += arg0.anInt1858;
		return this;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(Lclient!ia;I)Z")
	public boolean method1405(@OriginalArg(0) Class51 arg0) {
		if (this.anInt1858 < arg0.anInt1858) {
			return false;
		}
		@Pc(19) int local19 = this.anInt1858 - arg0.anInt1858;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt1858; local21++) {
			if (arg0.aByteArray17[local21] != this.aByteArray17[local21 + local19]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)Lclient!ia;")
	public Class51 method1406(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(22) Class51 local22 = new Class51();
		local22.aByteArray17 = new byte[this.anInt1858 + 1];
		local22.anInt1858 = this.anInt1858 + 1;
		Static233.method868(this.aByteArray17, 0, local22.aByteArray17, 0, this.anInt1858);
		local22.aByteArray17[this.anInt1858] = (byte) arg0;
		return local22;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[BIIZ)I")
	public int method1407(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static233.method868(this.aByteArray17, 0, arg0, arg1, arg2);
		return arg2;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)I")
	public int method1408(@OriginalArg(1) int arg0) {
		return this.aByteArray17[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)[Lclient!ia;")
	public Class51[] method1409(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < this.anInt1858; local14++) {
			if (this.aByteArray17[local14] == arg0) {
				local7++;
			}
		}
		@Pc(41) Class51[] local41 = new Class51[local7 + 1];
		if (local7 == 0) {
			local41[0] = this;
			return local41;
		}
		@Pc(51) int local51 = 0;
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < local7; local55++) {
			@Pc(59) int local59;
			for (local59 = 0; this.aByteArray17[local59 + local51] != arg0; local59++) {
			}
			local41[local53++] = this.method1433(local51, local51 + local59);
			local51 += local59 + 1;
		}
		local41[local7] = this.method1433(local51, this.anInt1858);
		return local41;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(ILclient!ia;)I")
	public int method1411(@OriginalArg(1) Class51 arg0) {
		@Pc(13) int local13;
		if (this.anInt1858 <= arg0.anInt1858) {
			local13 = this.anInt1858;
		} else {
			local13 = arg0.anInt1858;
		}
		for (@Pc(25) int local25 = 0; local25 < local13; local25++) {
			if ((this.aByteArray17[local25] & 0xFF) < (arg0.aByteArray17[local25] & 0xFF)) {
				return -1;
			}
			if ((arg0.aByteArray17[local25] & 0xFF) < (this.aByteArray17[local25] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt1858 < arg0.anInt1858) {
			return -1;
		} else if (arg0.anInt1858 < this.anInt1858) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/applet/Applet;B)Lclient!ia;")
	public Class51 method1412(@OriginalArg(0) Applet arg0) {
		@Pc(20) String local20 = new String(this.aByteArray17, 0, this.anInt1858);
		@Pc(24) String local24 = arg0.getParameter(local20);
		return local24 == null ? null : Static189.method3166(local24);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIILclient!ia;)Lclient!ia;")
	public Class51 method1413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class51 arg2) {
		if (!this.aBoolean83) {
			throw new IllegalArgumentException();
		} else if (arg0 >= 0 && arg1 >= arg0 && arg1 <= arg2.anInt1858) {
			this.anInt1834 = 0;
			if (this.aByteArray17.length < this.anInt1858 + arg1 - arg0) {
				@Pc(45) int local45;
				for (local45 = 1; local45 < this.anInt1858 + arg2.anInt1858; local45 += local45) {
				}
				@Pc(65) byte[] local65 = new byte[local45];
				Static233.method868(this.aByteArray17, 0, local65, 0, this.anInt1858);
				this.aByteArray17 = local65;
			}
			Static233.method868(arg2.aByteArray17, arg0, this.aByteArray17, this.anInt1858, arg1 - arg0);
			this.anInt1858 += arg1 - arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ia", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1416();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method1414(@OriginalArg(0) FontMetrics arg0) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray17, 0, this.anInt1858, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray17, 0, this.anInt1858);
		}
		return arg0.stringWidth(local18);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/net/URL;I)Ljava/net/URL;")
	public URL method1415(@OriginalArg(0) URL arg0) throws MalformedURLException {
		return new URL(arg0, new String(this.aByteArray17, 0, this.anInt1858));
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)I")
	public int method1416() {
		@Pc(5) int local5 = 0;
		for (@Pc(13) int local13 = 0; local13 < this.anInt1858; local13++) {
			local5 = (this.aByteArray17[local13] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)Z")
	public boolean method1417() {
		return this.method1422();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Lclient!ia;")
	public Class51 method1418() {
		@Pc(8) Class51 local8 = new Class51();
		local8.anInt1858 = this.anInt1858;
		local8.aByteArray17 = new byte[this.anInt1858];
		for (@Pc(31) int local31 = 0; local31 < this.anInt1858; local31++) {
			@Pc(38) byte local38 = this.aByteArray17[local31];
			if (local38 == 47) {
				local8.aByteArray17[local31] = 32;
			} else {
				local8.aByteArray17[local31] = local38;
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(II)I")
	public int method1419() {
		return this.method1425(44, 0);
	}

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)J")
	private long method1420() {
		@Pc(5) long local5 = 0L;
		for (@Pc(14) int local14 = 0; local14 < this.anInt1858; local14++) {
			local5 = (local5 << 5) - (local5 - ((long) (this.aByteArray17[local14] & 0xFF)));
		}
		return local5;
	}

	@OriginalMember(owner = "client!ia", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(Ljava/applet/Applet;B)V")
	public void method1421(@OriginalArg(0) Applet arg0) throws Throwable {
		@Pc(12) String local12 = new String(this.aByteArray17, 0, this.anInt1858);
		Static232.method509(arg0, local12);
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(II)Z")
	private boolean method1422() {
		@Pc(3) boolean local3 = false;
		@Pc(5) int local5 = 0;
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < this.anInt1858; local21++) {
			@Pc(30) int local30 = this.aByteArray17[local21] & 0xFF;
			if (local21 == 0) {
				if (local30 == 45) {
					local3 = true;
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
				return false;
			}
			if (local30 >= 10) {
				return false;
			}
			if (local3) {
				local30 = -local30;
			}
			@Pc(95) int local95 = local30 + local5 * 10;
			if (local5 != local95 / 10) {
				return false;
			}
			local19 = true;
			local5 = local95;
		}
		return local19;
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(II)Lclient!ia;")
	public Class51 method1423(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean83) {
			this.anInt1834 = 0;
			if (this.anInt1858 == this.aByteArray17.length) {
				@Pc(48) int local48;
				for (local48 = 1; local48 <= this.anInt1858; local48 += local48) {
				}
				@Pc(65) byte[] local65 = new byte[local48];
				Static233.method868(this.aByteArray17, 0, local65, 0, this.anInt1858);
				this.aByteArray17 = local65;
			}
			this.aByteArray17[this.anInt1858++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "(I)Lclient!ia;")
	public Class51 method1424() {
		@Pc(5) Class51 local5 = Static202.method3323(this.method1388());
		return local5 == null ? Static127.aClass51_990 : local5;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBI)I")
	public int method1425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte local8 = (byte) arg0;
		for (@Pc(15) int local15 = arg1; local15 < this.anInt1858; local15++) {
			if (local8 == this.aByteArray17[local15]) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(Lclient!ia;I)Z")
	public boolean method1426(@OriginalArg(0) Class51 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt1858 == arg0.anInt1858) {
			if (!this.aBoolean83 || !arg0.aBoolean83) {
				if (this.anInt1834 == 0) {
					this.anInt1834 = this.method1416();
					if (this.anInt1834 == 0) {
						this.anInt1834 = 1;
					}
				}
				if (arg0.anInt1834 == 0) {
					arg0.anInt1834 = arg0.method1416();
					if (arg0.anInt1834 == 0) {
						arg0.anInt1834 = 1;
					}
				}
				if (this.anInt1834 != arg0.anInt1834) {
					return false;
				}
			}
			for (@Pc(66) int local66 = 0; local66 < this.anInt1858; local66++) {
				if (this.aByteArray17[local66] != arg0.aByteArray17[local66]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Ljava/net/URL;")
	public URL method1427() throws MalformedURLException {
		return new URL(new String(this.aByteArray17, 0, this.anInt1858));
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)I")
	public int method1428() {
		return this.method1392(10);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II[B)I")
	private int method1429(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt1858; local9 += 4) {
			@Pc(23) int local23 = Static167.method2866(this.aByteArray17[local9]);
			@Pc(40) int local40 = this.anInt1858 > local9 + 1 ? Static167.method2866(this.aByteArray17[local9 + 1]) : -1;
			@Pc(61) int local61 = this.anInt1858 > local9 + 2 ? Static167.method2866(this.aByteArray17[local9 + 2]) : -1;
			@Pc(78) int local78 = this.anInt1858 > local9 + 3 ? Static167.method2866(this.aByteArray17[local9 + 3]) : -1;
			arg1[arg0++] = (byte) (local23 << 2 | local40 >>> 4);
			if (local61 == -1) {
				break;
			}
			arg1[arg0++] = (byte) (local61 >>> 2 | (local40 & 0xF) << 4);
			if (local78 == -1) {
				break;
			}
			arg1[arg0++] = (byte) ((local61 & 0x3) << 6 | local78);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "(I)Lclient!ia;")
	public Class51 method1430() {
		@Pc(9) Class51 local9 = new Class51();
		local9.anInt1858 = this.anInt1858;
		local9.aByteArray17 = new byte[this.anInt1858];
		for (@Pc(26) int local26 = 0; local26 < this.anInt1858; local26++) {
			@Pc(33) byte local33 = this.aByteArray17[local26];
			if (local33 >= 65 && local33 <= 90 || local33 >= -64 && local33 <= -34 && local33 != -41) {
				local33 = (byte) (local33 + 32);
			}
			local9.aByteArray17[local26] = local33;
		}
		return local9;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(ILclient!ia;)Z")
	public boolean method1432(@OriginalArg(1) Class51 arg0) {
		if (arg0.anInt1858 > this.anInt1858) {
			return false;
		}
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt1858; local14++) {
			@Pc(21) byte local21 = this.aByteArray17[local14];
			@Pc(26) byte local26 = arg0.aByteArray17[local14];
			if (local21 >= 65 && local21 <= 90 || local21 >= -64 && local21 <= -34 && local21 != -41) {
				local21 = (byte) (local21 + 32);
			}
			if (local26 >= 65 && local26 <= 90 || local26 >= -64 && local26 <= -34 && local26 != -41) {
				local26 = (byte) (local26 + 32);
			}
			if (local26 != local21) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)Lclient!ia;")
	public Class51 method1433(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class51 local13 = new Class51();
		local13.aByteArray17 = new byte[arg1 - arg0];
		local13.anInt1858 = arg1 - arg0;
		Static233.method868(this.aByteArray17, arg0, local13.aByteArray17, 0, local13.anInt1858);
		return local13;
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(B)Lclient!ia;")
	public Class51 method1434() {
		if (!this.aBoolean83) {
			throw new IllegalArgumentException();
		}
		this.anInt1834 = 0;
		if (this.aByteArray17.length != this.anInt1858) {
			@Pc(27) byte[] local27 = new byte[this.anInt1858];
			Static233.method868(this.aByteArray17, 0, local27, 0, this.anInt1858);
			this.aByteArray17 = local27;
		}
		return this;
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(II)V")
	public void method1435() {
		this.anInt1834 = 0;
		if (!this.aBoolean83) {
			throw new IllegalArgumentException();
		}
		@Pc(31) int local31;
		if (this.aByteArray17.length < 0) {
			for (local31 = 1; local31 < 0; local31 += local31) {
			}
			@Pc(43) byte[] local43 = new byte[local31];
			Static233.method868(this.aByteArray17, 0, local43, 0, this.anInt1858);
			this.aByteArray17 = local43;
		}
		for (local31 = this.anInt1858; local31 < 0; local31++) {
			this.aByteArray17[local31] = 32;
		}
		this.anInt1858 = 0;
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(B)Lclient!ia;")
	public Class51 method1436() {
		@Pc(3) int local3 = 0;
		@Pc(6) int local6 = this.anInt1858;
		while (local3 < this.anInt1858 && (this.aByteArray17[local3] >= 0 && this.aByteArray17[local3] <= 32 || (this.aByteArray17[local3] & 0xFF) == 160)) {
			local3++;
		}
		while (local6 > local3 && (this.aByteArray17[local6 - 1] >= 0 && this.aByteArray17[local6 - 1] <= 32 || (this.aByteArray17[local6 - 1] & 0xFF) == 160)) {
			local6--;
		}
		if (local3 == 0 && local6 == this.anInt1858) {
			return this;
		}
		@Pc(102) Class51 local102 = new Class51();
		local102.anInt1858 = local6 - local3;
		local102.aByteArray17 = new byte[local102.anInt1858];
		for (@Pc(115) int local115 = 0; local115 < local102.anInt1858; local115++) {
			local102.aByteArray17[local115] = this.aByteArray17[local3 + local115];
		}
		return local102;
	}

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "(I)Lclient!ia;")
	public Class51 method1437() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class51 local11 = new Class51();
		local11.anInt1858 = this.anInt1858;
		local11.aByteArray17 = new byte[this.anInt1858];
		for (@Pc(27) int local27 = 0; local27 < this.anInt1858; local27++) {
			@Pc(34) byte local34 = this.aByteArray17[local27];
			if (local34 == 95) {
				local11.aByteArray17[local27] = 32;
				local7 = true;
			} else if (local34 >= 97 && local34 <= 122 && local7) {
				local7 = false;
				local11.aByteArray17[local27] = (byte) (local34 - 32);
			} else {
				local7 = false;
				local11.aByteArray17[local27] = local34;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "(I)V")
	public void method1439() {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray17, 0, this.anInt1858, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray17, 0, this.anInt1858);
		}
		System.out.println(local13);
	}
}
