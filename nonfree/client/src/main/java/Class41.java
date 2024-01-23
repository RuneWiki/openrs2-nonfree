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

@OriginalClass("client!i")
public final class Class41 implements Interface3 {

	@OriginalMember(owner = "client!i", name = "r", descriptor = "I")
	private int anInt1974;

	@OriginalMember(owner = "client!i", name = "T", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!i", name = "kb", descriptor = "I")
	public int anInt2012;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "Z")
	private boolean aBoolean105 = true;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BII)I")
	public int method1383(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) byte local4 = (byte) arg0;
		for (@Pc(10) int local10 = arg1; local10 < this.anInt2012; local10++) {
			if (this.aByteArray26[local10] == local4) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!i;)Z")
	public boolean method1384(@OriginalArg(1) Class41 arg0) {
		if (arg0.anInt2012 > this.anInt2012) {
			return false;
		}
		for (@Pc(23) int local23 = 0; local23 < arg0.anInt2012; local23++) {
			@Pc(30) byte local30 = this.aByteArray26[local23];
			if (local30 >= 65 && local30 <= 90 || local30 >= -64 && local30 <= -34 && local30 != -41) {
				local30 = (byte) (local30 + 32);
			}
			@Pc(59) byte local59 = arg0.aByteArray26[local23];
			if (local59 >= 65 && local59 <= 90 || local59 >= -64 && local59 <= -34 && local59 != -41) {
				local59 = (byte) (local59 + 32);
			}
			if (local30 != local59) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)Lclient!i;")
	public Class41 method1385() {
		@Pc(9) Class41 local9 = new Class41();
		local9.anInt2012 = this.anInt2012;
		local9.aByteArray26 = new byte[this.anInt2012];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2012; local27++) {
			local9.aByteArray26[local27] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(ILclient!i;)Z")
	public boolean method1386(@OriginalArg(1) Class41 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt2012 == this.anInt2012) {
			if (!this.aBoolean105 || !arg0.aBoolean105) {
				if (this.anInt1974 == 0) {
					this.anInt1974 = this.method1394();
					if (this.anInt1974 == 0) {
						this.anInt1974 = 1;
					}
				}
				if (arg0.anInt1974 == 0) {
					arg0.anInt1974 = arg0.method1394();
					if (arg0.anInt1974 == 0) {
						arg0.anInt1974 = 1;
					}
				}
				if (this.anInt1974 != arg0.anInt1974) {
					return false;
				}
			}
			for (@Pc(75) int local75 = 0; local75 < this.anInt2012; local75++) {
				if (arg0.aByteArray26[local75] != this.aByteArray26[local75]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)I")
	public int method1388(@OriginalArg(1) int arg0) {
		return this.aByteArray26[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)[Lclient!i;")
	public Class41[] method1389(@OriginalArg(1) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < this.anInt2012; local5++) {
			if (arg0 == this.aByteArray26[local5]) {
				local3++;
			}
		}
		@Pc(32) Class41[] local32 = new Class41[local3 + 1];
		if (local3 == 0) {
			local32[0] = this;
			return local32;
		}
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		for (@Pc(46) int local46 = 0; local46 < local3; local46++) {
			@Pc(50) int local50;
			for (local50 = 0; this.aByteArray26[local44 + local50] != arg0; local50++) {
			}
			local32[local42++] = this.method1412(local44, local44 + local50);
			local44 += local50 + 1;
		}
		local32[local3] = this.method1412(local44, this.anInt2012);
		return local32;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)Lclient!i;")
	public Class41 method1390() {
		@Pc(7) long local7 = this.method1426();
		@Pc(16) Class local16 = i.class;
		synchronized (i.class) {
			@Pc(32) Class2_Sub26 local32;
			if (Static204.aClass70_17 == null) {
				Static204.aClass70_17 = new Class70(4096);
			} else {
				for (local32 = (Class2_Sub26) Static204.aClass70_17.method2205(local7); local32 != null; local32 = (Class2_Sub26) Static204.aClass70_17.method2210()) {
					if (this.method1386(local32.aClass41_1152)) {
						return local32.aClass41_1152;
					}
				}
			}
			local32 = new Class2_Sub26();
			local32.aClass41_1152 = this;
			this.aBoolean105 = false;
			Static204.aClass70_17.method2208(local7, local32);
			return this;
		}
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(I)Lclient!i;")
	public Class41 method1391() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt2012 && (this.aByteArray26[local7] >= 0 && this.aByteArray26[local7] <= 32 || (this.aByteArray26[local7] & 0xFF) == 160); local7++) {
		}
		@Pc(52) int local52;
		for (local52 = this.anInt2012; local7 < local52 && (this.aByteArray26[local52 - 1] >= 0 && this.aByteArray26[local52 - 1] <= 32 || (this.aByteArray26[local52 - 1] & 0xFF) == 160); local52--) {
		}
		if (local7 == 0 && this.anInt2012 == local52) {
			return this;
		}
		@Pc(95) Class41 local95 = new Class41();
		local95.anInt2012 = local52 - local7;
		local95.aByteArray26 = new byte[local95.anInt2012];
		for (@Pc(108) int local108 = 0; local108 < local95.anInt2012; local108++) {
			local95.aByteArray26[local108] = this.aByteArray26[local7 + local108];
		}
		return local95;
	}

	@OriginalMember(owner = "client!i", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)I")
	public int method1392() {
		return this.method1396(10);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)I")
	public int method1393() {
		return this.anInt2012;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(B)I")
	public int method1394() {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt2012; local15++) {
			local13 = (this.aByteArray26[local15] & 0xFF) + ((local13 << 5) - local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(Z)Ljava/net/URL;")
	public URL method1395() throws MalformedURLException {
		return new URL(new String(this.aByteArray26, 0, this.anInt2012));
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(II)I")
	public int method1396(@OriginalArg(0) int arg0) {
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2012; local23++) {
			@Pc(32) int local32 = this.aByteArray26[local23] & 0xFF;
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
				throw new NumberFormatException();
			}
			if (arg0 <= local32) {
				throw new NumberFormatException();
			}
			if (local17) {
				local32 = -local32;
			}
			@Pc(104) int local104 = local21 * arg0 + local32;
			if (local104 / arg0 != local21) {
				throw new NumberFormatException();
			}
			local21 = local104;
			local19 = true;
		}
		if (!local19) {
			throw new NumberFormatException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/applet/Applet;I)Lclient!i;")
	public Class41 method1397(@OriginalArg(0) Applet arg0) {
		@Pc(20) String local20 = new String(this.aByteArray26, 0, this.anInt2012);
		@Pc(24) String local24 = arg0.getParameter(local20);
		return local24 == null ? null : Static97.method1683(local24);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZLjava/awt/FontMetrics;)I")
	public int method1398(@OriginalArg(1) FontMetrics arg0) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray26, 0, this.anInt2012, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray26, 0, this.anInt2012);
		}
		return arg0.stringWidth(local18);
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V")
	public void method1399() {
		@Pc(15) String local15;
		try {
			local15 = new String(this.aByteArray26, 0, this.anInt2012, "ISO-8859-1");
		} catch (@Pc(17) UnsupportedEncodingException local17) {
			local15 = new String(this.aByteArray26, 0, this.anInt2012);
		}
		System.out.println(local15);
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(Z)Lclient!i;")
	public Class41 method1400() {
		@Pc(9) Class41 local9 = Static176.method2837(this.method1419());
		return local9 == null ? Static68.aClass41_560 : local9;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII[B)I")
	public int method1401(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2) {
		Static225.method1839(this.aByteArray26, 0, arg2, arg1, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(I)[B")
	public byte[] method1402() {
		@Pc(7) byte[] local7 = new byte[this.anInt2012];
		Static225.method1839(this.aByteArray26, 0, local7, 0, this.anInt2012);
		return local7;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(B)Lclient!i;")
	public Class41 method1403() {
		@Pc(12) boolean local12 = true;
		@Pc(16) Class41 local16 = new Class41();
		local16.anInt2012 = this.anInt2012;
		local16.aByteArray26 = new byte[this.anInt2012];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2012; local27++) {
			@Pc(34) byte local34 = this.aByteArray26[local27];
			if (local34 == 95) {
				local12 = true;
				local16.aByteArray26[local27] = 32;
			} else if (local34 >= 97 && local34 <= 122 && local12) {
				local16.aByteArray26[local27] = (byte) (local34 - 32);
				local12 = false;
			} else {
				local12 = false;
				local16.aByteArray26[local27] = local34;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(II)Z")
	private boolean method1404() {
		@Pc(22) boolean local22 = false;
		@Pc(24) int local24 = 0;
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < this.anInt2012; local28++) {
			@Pc(37) int local37 = this.aByteArray26[local28] & 0xFF;
			if (local28 == 0) {
				if (local37 == 45) {
					local22 = true;
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
			if (local22) {
				local37 = -local37;
			}
			@Pc(102) int local102 = local37 + local24 * 10;
			if (local24 != local102 / 10) {
				return false;
			}
			local26 = true;
			local24 = local102;
		}
		return local26;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!i;B)Lclient!i;")
	public Class41 method1405(@OriginalArg(0) Class41 arg0) {
		if (!this.aBoolean105) {
			throw new IllegalArgumentException();
		}
		this.anInt1974 = 0;
		if (this.aByteArray26.length < this.anInt2012 + arg0.anInt2012) {
			@Pc(38) int local38;
			for (local38 = 1; local38 < arg0.anInt2012 + this.anInt2012; local38 += local38) {
			}
			@Pc(58) byte[] local58 = new byte[local38];
			Static225.method1839(this.aByteArray26, 0, local58, 0, this.anInt2012);
			this.aByteArray26 = local58;
		}
		Static225.method1839(arg0.aByteArray26, 0, this.aByteArray26, this.anInt2012, arg0.anInt2012);
		this.anInt2012 += arg0.anInt2012;
		return this;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(ILclient!i;)I")
	public int method1406(@OriginalArg(1) Class41 arg0) {
		return this.method1423(0, arg0);
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(II)Lclient!i;")
	public Class41 method1407(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(27) Class41 local27 = new Class41();
		local27.aByteArray26 = new byte[this.anInt2012 + 1];
		local27.anInt2012 = this.anInt2012 + 1;
		Static225.method1839(this.aByteArray26, 0, local27.aByteArray26, 0, this.anInt2012);
		local27.aByteArray26[this.anInt2012] = (byte) arg0;
		return local27;
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(ILclient!i;)Z")
	public boolean method1408(@OriginalArg(1) Class41 arg0) {
		if (this.anInt2012 < arg0.anInt2012) {
			return false;
		}
		for (@Pc(23) int local23 = 0; local23 < arg0.anInt2012; local23++) {
			if (arg0.aByteArray26[local23] != this.aByteArray26[local23]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!i", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class41)) {
			throw new IllegalArgumentException();
		}
		return this.method1386((Class41) arg0);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public void method1409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2) {
		@Pc(20) String local20;
		try {
			local20 = new String(this.aByteArray26, 0, this.anInt2012, "ISO-8859-1");
		} catch (@Pc(22) UnsupportedEncodingException local22) {
			local20 = new String(this.aByteArray26, 0, this.anInt2012);
		}
		arg2.drawString(local20, arg0, arg1);
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(I)Z")
	public boolean method1410() {
		return this.method1404();
	}

	@OriginalMember(owner = "client!i", name = "g", descriptor = "(I)Lclient!i;")
	public Class41 method1411() {
		@Pc(3) byte local3 = 2;
		@Pc(7) Class41 local7 = new Class41();
		local7.anInt2012 = this.anInt2012;
		local7.aByteArray26 = new byte[this.anInt2012];
		for (@Pc(22) int local22 = 0; local22 < this.anInt2012; local22++) {
			@Pc(29) byte local29 = this.aByteArray26[local22];
			if (local29 >= 97 && local29 <= 122 || local29 >= -32 && local29 <= -2 && local29 != -9) {
				if (local3 == 2) {
					local29 = (byte) (local29 - 32);
				}
				local3 = 0;
			} else if (local29 >= 65 && local29 <= 90 || !(local29 < -64 || local29 > -34 || local29 == -41)) {
				if (local3 == 0) {
					local29 = (byte) (local29 + 32);
				}
				local3 = 0;
			} else if (local29 == 46 || local29 == 33 || local29 == 63) {
				local3 = 2;
			} else if (local29 != 32) {
				local3 = 1;
			} else if (local3 != 2) {
				local3 = 1;
			}
			local7.aByteArray26[local22] = local29;
		}
		return local7;
	}

	@OriginalMember(owner = "client!i", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1394();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IBI)Lclient!i;")
	public Class41 method1412(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class41 local14 = new Class41();
		local14.aByteArray26 = new byte[arg1 - arg0];
		local14.anInt2012 = arg1 - arg0;
		Static225.method1839(this.aByteArray26, arg0, local14.aByteArray26, 0, local14.anInt2012);
		return local14;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(Lclient!i;B)Z")
	public boolean method1413(@OriginalArg(0) Class41 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt2012 == this.anInt2012) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt2012; local22++) {
				@Pc(29) byte local29 = this.aByteArray26[local22];
				if (local29 >= 65 && local29 <= 90 || local29 >= -64 && local29 <= -34 && local29 != -41) {
					local29 = (byte) (local29 + 32);
				}
				@Pc(60) byte local60 = arg0.aByteArray26[local22];
				if (local60 >= 65 && local60 <= 90 || local60 >= -64 && local60 <= -34 && local60 != -41) {
					local60 = (byte) (local60 + 32);
				}
				if (local29 != local60) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZLclient!i;)I")
	public int method1414(@OriginalArg(1) Class41 arg0) {
		@Pc(13) int local13;
		if (this.anInt2012 <= arg0.anInt2012) {
			local13 = this.anInt2012;
		} else {
			local13 = arg0.anInt2012;
		}
		for (@Pc(25) int local25 = 0; local25 < local13; local25++) {
			if ((arg0.aByteArray26[local25] & 0xFF) > (this.aByteArray26[local25] & 0xFF)) {
				return -1;
			}
			if ((arg0.aByteArray26[local25] & 0xFF) < (this.aByteArray26[local25] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt2012 < arg0.anInt2012) {
			return -1;
		} else if (arg0.anInt2012 < this.anInt2012) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IZI)Lclient!i;")
	public Class41 method1415() {
		@Pc(15) Class41 local15 = new Class41();
		local15.anInt2012 = this.anInt2012;
		local15.aByteArray26 = new byte[this.anInt2012];
		for (@Pc(32) int local32 = 0; local32 < this.anInt2012; local32++) {
			@Pc(39) byte local39 = this.aByteArray26[local32];
			if (local39 == 47) {
				local15.aByteArray26[local32] = 32;
			} else {
				local15.aByteArray26[local32] = local39;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BLclient!i;)I")
	public int method1416(@OriginalArg(1) Class41 arg0) {
		@Pc(25) int local25;
		if (arg0.anInt2012 >= this.anInt2012) {
			local25 = this.anInt2012;
		} else {
			local25 = arg0.anInt2012;
		}
		for (@Pc(32) int local32 = 0; local32 < local25; local32++) {
			if (Static207.anIntArray477[this.aByteArray26[local32] & 0xFF] < Static207.anIntArray477[arg0.aByteArray26[local32] & 0xFF]) {
				return -1;
			}
			if (Static207.anIntArray477[this.aByteArray26[local32] & 0xFF] > Static207.anIntArray477[arg0.aByteArray26[local32] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt2012 < arg0.anInt2012) {
			return -1;
		} else if (arg0.anInt2012 < this.anInt2012) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/applet/Applet;Z)Ljava/lang/Object;")
	public Object method1417(@OriginalArg(0) Applet arg0) throws Throwable {
		@Pc(8) String local8 = new String(this.aByteArray26, 0, this.anInt2012);
		@Pc(23) Object local23 = Static229.method3284(null, arg0, local8);
		if (local23 instanceof String) {
			@Pc(30) byte[] local30 = ((String) local23).getBytes();
			local23 = Static49.method967(0, local30, local30.length);
		}
		return local23;
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(B)Lclient!i;")
	public Class41 method1418() {
		if (!this.aBoolean105) {
			throw new IllegalArgumentException();
		}
		this.anInt1974 = 0;
		if (this.aByteArray26.length != this.anInt2012) {
			@Pc(32) byte[] local32 = new byte[this.anInt2012];
			Static225.method1839(this.aByteArray26, 0, local32, 0, this.anInt2012);
			this.aByteArray26 = local32;
		}
		return this;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(Z)J")
	public long method1419() {
		@Pc(7) long local7 = 0L;
		for (@Pc(9) int local9 = 0; this.anInt2012 > local9 && local9 < 12; local9++) {
			@Pc(16) byte local16 = this.aByteArray26[local9];
			local7 *= 37L;
			if (local16 >= 65 && local16 <= 90) {
				local7 += local16 - 64;
			} else if (local16 >= 97 && local16 <= 122) {
				local7 += local16 + 1 - 97;
			} else if (local16 >= 48 && local16 <= 57) {
				local7 += local16 + 27 - 48;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(ILclient!i;)Z")
	public boolean method1420(@OriginalArg(1) Class41 arg0) {
		if (arg0.anInt2012 > this.anInt2012) {
			return false;
		}
		@Pc(22) int local22 = this.anInt2012 - arg0.anInt2012;
		for (@Pc(24) int local24 = 0; local24 < arg0.anInt2012; local24++) {
			if (arg0.aByteArray26[local24] != this.aByteArray26[local24 + local22]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/net/URL;B)Ljava/net/URL;")
	public URL method1421(@OriginalArg(0) URL arg0) throws MalformedURLException {
		return new URL(arg0, new String(this.aByteArray26, 0, this.anInt2012));
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IBLclient!i;)I")
	public int method1423(@OriginalArg(0) int arg0, @OriginalArg(2) Class41 arg1) {
		@Pc(17) int[] local17 = new int[arg1.anInt2012];
		@Pc(20) int[] local20 = new int[256];
		@Pc(24) int[] local24 = new int[arg1.anInt2012];
		for (@Pc(26) int local26 = 0; local26 < local20.length; local26++) {
			local20[local26] = arg1.anInt2012;
		}
		for (@Pc(44) int local44 = 1; local44 <= arg1.anInt2012; local44++) {
			local17[local44 - 1] = (arg1.anInt2012 << 1) - local44;
			local20[arg1.aByteArray26[local44 - 1] & 0xFF] = arg1.anInt2012 - local44;
		}
		@Pc(86) int local86 = arg1.anInt2012 + 1;
		@Pc(89) int local89 = arg1.anInt2012;
		while (local89 > 0) {
			local24[local89 - 1] = local86;
			while (local86 <= arg1.anInt2012 && arg1.aByteArray26[local86 - 1] != arg1.aByteArray26[local89 - 1]) {
				if (arg1.anInt2012 - local89 <= local17[local86 + -1]) {
					local17[local86 - 1] = arg1.anInt2012 - local89;
				}
				local86 = local24[local86 - 1];
			}
			local89--;
			local86--;
		}
		@Pc(156) int local156 = local86;
		@Pc(158) int local158 = 1;
		local86 = arg1.anInt2012 + 1 - local86;
		@Pc(167) int local167 = 0;
		@Pc(169) int local169 = 1;
		while (local86 >= local169) {
			local24[local169 - 1] = local167;
			while (local167 >= 1 && arg1.aByteArray26[local167 - 1] != arg1.aByteArray26[local169 - 1]) {
				local167 = local24[local167 - 1];
			}
			local169++;
			local167++;
		}
		@Pc(216) int local216;
		while (local156 < arg1.anInt2012) {
			for (local216 = local158; local216 <= local156; local216++) {
				if (local17[local216 - 1] >= local156 + arg1.anInt2012 - local216) {
					local17[local216 - 1] = local156 + arg1.anInt2012 - local216;
				}
			}
			local158 = local156 + 1;
			local156 = local86 + local156 - local24[local86 + -1];
			local86 = local24[local86 - 1];
		}
		@Pc(294) int local294;
		for (local216 = arg1.anInt2012 + arg0 - 1; local216 < this.anInt2012; local216 += Math.max(local20[this.aByteArray26[local216] & 0xFF], local17[local294])) {
			for (local294 = arg1.anInt2012 - 1; local294 >= 0 && this.aByteArray26[local216] == arg1.aByteArray26[local294]; local294--) {
				local216--;
			}
			if (local294 == -1) {
				return local216 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(II)Lclient!i;")
	public Class41 method1424(@OriginalArg(0) int arg0) {
		return this.method1412(arg0, this.anInt2012);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILjava/applet/Applet;)V")
	public void method1425(@OriginalArg(1) Applet arg0) throws Throwable {
		@Pc(8) String local8 = new String(this.aByteArray26, 0, this.anInt2012);
		Static229.method3283(arg0, local8);
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(B)J")
	private long method1426() {
		@Pc(5) long local5 = 0L;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2012; local12++) {
			local5 = (long) (this.aByteArray26[local12] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(II)Lclient!i;")
	public Class41 method1427(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean105) {
			this.anInt1974 = 0;
			if (this.anInt2012 == this.aByteArray26.length) {
				@Pc(48) int local48;
				for (local48 = 1; local48 <= this.anInt2012; local48 += local48) {
				}
				@Pc(61) byte[] local61 = new byte[local48];
				Static225.method1839(this.aByteArray26, 0, local61, 0, this.anInt2012);
				this.aByteArray26 = local61;
			}
			this.aByteArray26[this.anInt2012++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!i", name = "i", descriptor = "(I)Lclient!i;")
	public Class41 method1428() {
		@Pc(11) Class41 local11 = new Class41();
		local11.anInt2012 = this.anInt2012;
		local11.aByteArray26 = new byte[this.anInt2012];
		for (@Pc(26) int local26 = 0; local26 < this.anInt2012; local26++) {
			@Pc(33) byte local33 = this.aByteArray26[local26];
			if (local33 >= 65 && local33 <= 90 || local33 >= -64 && local33 <= -34 && local33 != -41) {
				local33 = (byte) (local33 + 32);
			}
			local11.aByteArray26[local26] = local33;
		}
		return local11;
	}
}
