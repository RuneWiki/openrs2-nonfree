import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class65 implements Interface2 {

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
	private int anInt1993;

	@OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
	public int anInt2005;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "Z")
	private boolean aBoolean79 = true;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Lclient!pe;")
	public Class65 method1474() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt2005 && (this.aByteArray27[local1] >= 0 && this.aByteArray27[local1] <= 32 || (this.aByteArray27[local1] & 0xFF) == 160); local1++) {
		}
		@Pc(37) int local37;
		for (local37 = this.anInt2005; local1 < local37 && (this.aByteArray27[local37 - 1] >= 0 && this.aByteArray27[local37 - 1] <= 32 || (this.aByteArray27[local37 - 1] & 0xFF) == 160); local37--) {
		}
		if (local1 == 0 && this.anInt2005 == local37) {
			return this;
		}
		@Pc(94) Class65 local94 = new Class65();
		local94.anInt2005 = local37 - local1;
		local94.aByteArray27 = new byte[local94.anInt2005];
		for (@Pc(107) int local107 = 0; local107 < local94.anInt2005; local107++) {
			local94.aByteArray27[local107] = this.aByteArray27[local107 + local1];
		}
		return local94;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)Lclient!pe;")
	public Class65 method1475(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(29) Class65 local29 = new Class65();
		local29.aByteArray27 = new byte[this.anInt2005 + 1];
		local29.anInt2005 = this.anInt2005 + 1;
		Static135.method359(this.aByteArray27, 0, local29.aByteArray27, 0, this.anInt2005);
		local29.aByteArray27[this.anInt2005] = (byte) arg0;
		return local29;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Lclient!pe;")
	public Class65 method1476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class65 local7 = new Class65();
		local7.aByteArray27 = new byte[arg0 - arg1];
		local7.anInt2005 = arg0 - arg1;
		Static135.method359(this.aByteArray27, arg1, local7.aByteArray27, 0, local7.anInt2005);
		return local7;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!pe;I)I")
	private int method1477(@OriginalArg(1) Class65 arg0) {
		@Pc(5) int[] local5 = new int[arg0.anInt2005];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg0.anInt2005];
		for (@Pc(23) int local23 = 0; local23 < local12.length; local23++) {
			local12[local23] = arg0.anInt2005;
		}
		for (@Pc(37) int local37 = 1; local37 <= arg0.anInt2005; local37++) {
			local5[local37 - 1] = (arg0.anInt2005 << 1) - local37;
			local12[arg0.aByteArray27[local37 - 1] & 0xFF] = arg0.anInt2005 - local37;
		}
		@Pc(79) int local79 = arg0.anInt2005 + 1;
		for (@Pc(82) int local82 = arg0.anInt2005; local82 > 0; local82--) {
			local16[local82 - 1] = local79;
			while (local79 <= arg0.anInt2005 && arg0.aByteArray27[local79 - 1] != arg0.aByteArray27[local82 - 1]) {
				if (arg0.anInt2005 - local82 <= local5[local79 + -1]) {
					local5[local79 - 1] = arg0.anInt2005 - local82;
				}
				local79 = local16[local79 - 1];
			}
			local79--;
		}
		@Pc(153) int local153 = 1;
		@Pc(155) int local155 = local79;
		local79 = arg0.anInt2005 + 1 - local79;
		@Pc(165) int local165 = 0;
		for (@Pc(167) int local167 = 1; local167 <= local79; local167++) {
			local16[local167 - 1] = local165;
			while (local165 >= 1 && arg0.aByteArray27[local167 - 1] != arg0.aByteArray27[local165 - 1]) {
				local165 = local16[local165 - 1];
			}
			local165++;
		}
		@Pc(212) int local212;
		while (local155 < arg0.anInt2005) {
			for (local212 = local153; local212 <= local155; local212++) {
				if (local5[local212 - 1] >= arg0.anInt2005 + local155 - local212) {
					local5[local212 - 1] = local155 + arg0.anInt2005 - local212;
				}
			}
			local153 = local155 + 1;
			local155 = local155 + local79 - local16[local79 - 1];
			local79 = local16[local79 - 1];
		}
		@Pc(291) int local291;
		for (local212 = arg0.anInt2005 - 1; local212 < this.anInt2005; local212 += Math.max(local12[this.aByteArray27[local212] & 0xFF], local5[local291])) {
			for (local291 = arg0.anInt2005 - 1; local291 >= 0 && arg0.aByteArray27[local291] == this.aByteArray27[local212]; local291--) {
				local212--;
			}
			if (local291 == -1) {
				return local212 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)[B")
	public byte[] method1478() {
		@Pc(14) byte[] local14 = new byte[this.anInt2005];
		Static135.method359(this.aByteArray27, 0, local14, 0, this.anInt2005);
		return local14;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)Z")
	public boolean method1479() {
		return this.method1508();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!pe;)I")
	public int method1480(@OriginalArg(1) Class65 arg0) {
		@Pc(13) int local13;
		if (this.anInt2005 > arg0.anInt2005) {
			local13 = arg0.anInt2005;
		} else {
			local13 = this.anInt2005;
		}
		for (@Pc(24) int local24 = 0; local24 < local13; local24++) {
			if ((arg0.aByteArray27[local24] & 0xFF) > (this.aByteArray27[local24] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray27[local24] & 0xFF) > (arg0.aByteArray27[local24] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.anInt2005 > this.anInt2005) {
			return -1;
		} else if (this.anInt2005 > arg0.anInt2005) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)Lclient!pe;")
	public Class65 method1481() {
		@Pc(5) Class65 local5 = new Class65();
		local5.aByteArray27 = new byte[12];
		@Pc(11) int local11 = 0;
		local5.anInt2005 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.anInt2005; local20++) {
			if (this.aByteArray27[local20] >= 65 && this.aByteArray27[local20] <= 90) {
				local5.aByteArray27[local11++] = (byte) (this.aByteArray27[local20] + 97 - 65);
				local5.anInt2005 = local11;
			} else if (this.aByteArray27[local20] >= 97 && this.aByteArray27[local20] <= 122 || this.aByteArray27[local20] >= 48 && this.aByteArray27[local20] <= 57) {
				local5.aByteArray27[local11++] = this.aByteArray27[local20];
				local5.anInt2005 = local11;
			} else if (local11 > 0) {
				local5.aByteArray27[local11++] = 95;
			}
			if (local11 == 12) {
				break;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
	public int method1482(@OriginalArg(1) int arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(14) boolean local14 = false;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt2005; local28++) {
			@Pc(37) int local37 = this.aByteArray27[local28] & 0xFF;
			if (local28 == 0) {
				if (local37 == 45) {
					local7 = true;
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
			if (local7) {
				local37 = -local37;
			}
			@Pc(109) int local109 = local26 * arg0 + local37;
			if (local26 != local109 / arg0) {
				throw new NumberFormatException();
			}
			local26 = local109;
			local14 = true;
		}
		if (!local14) {
			throw new NumberFormatException();
		}
		return local26;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)I")
	public int method1483(@OriginalArg(1) int arg0) {
		return this.method1495(arg0);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)J")
	private long method1484() {
		@Pc(5) long local5 = 0L;
		for (@Pc(14) int local14 = 0; local14 < this.anInt2005; local14++) {
			local5 = (local5 << 5) + (((long) (this.aByteArray27[local14] & 0xFF)) - local5);
		}
		return local5;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)Lclient!pe;")
	public Class65 method1485() {
		if (!this.aBoolean79) {
			throw new IllegalArgumentException();
		}
		this.anInt1993 = 0;
		if (this.aByteArray27.length != this.anInt2005) {
			@Pc(32) byte[] local32 = new byte[this.anInt2005];
			Static135.method359(this.aByteArray27, 0, local32, 0, this.anInt2005);
			this.aByteArray27 = local32;
		}
		return this;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)Lclient!pe;")
	public Class65 method1486() {
		@Pc(7) Class65 local7 = new Class65();
		local7.anInt2005 = this.anInt2005;
		local7.aByteArray27 = new byte[this.anInt2005];
		for (@Pc(23) int local23 = 0; local23 < this.anInt2005; local23++) {
			@Pc(29) byte local29 = this.aByteArray27[local23];
			if (local29 >= 65 && local29 <= 90 || local29 >= -64 && local29 <= -34 && local29 != -41) {
				local29 = (byte) (local29 + 32);
			}
			local7.aByteArray27[local23] = local29;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)Lclient!pe;")
	public Class65 method1487() {
		@Pc(3) Class65 local3 = new Class65();
		local3.anInt2005 = this.anInt2005;
		local3.aByteArray27 = new byte[this.anInt2005];
		@Pc(18) byte local18 = 2;
		for (@Pc(25) int local25 = 0; local25 < this.anInt2005; local25++) {
			@Pc(31) byte local31 = this.aByteArray27[local25];
			if (local31 >= 97 && local31 <= 122 || local31 >= -32 && local31 <= -2 && local31 != -9) {
				if (local18 == 2) {
					local31 = (byte) (local31 - 32);
				}
				local18 = 0;
			} else if (local31 >= 65 && local31 <= 90 || !(local31 < -64 || local31 > -34 || local31 == -41)) {
				if (local18 == 0) {
					local31 = (byte) (local31 + 32);
				}
				local18 = 0;
			} else if (local31 == 46 || local31 == 33 || local31 == 63) {
				local18 = 2;
			} else if (local31 != 32) {
				local18 = 1;
			} else if (local18 != 2) {
				local18 = 1;
			}
			local3.aByteArray27[local25] = local31;
		}
		return local3;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!pe;I)Z")
	public boolean method1488(@OriginalArg(0) Class65 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2005 == arg0.anInt2005) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt2005; local16++) {
				@Pc(27) byte local27 = this.aByteArray27[local16];
				@Pc(32) byte local32 = arg0.aByteArray27[local16];
				if (local27 >= 65 && local27 <= 90 || local27 >= -64 && local27 <= -34 && local27 != -41) {
					local27 = (byte) (local27 + 32);
				}
				if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
					local32 = (byte) (local32 + 32);
				}
				if (local32 != local27) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(B)Lclient!pe;")
	public Class65 method1489() {
		@Pc(7) long local7 = this.method1484();
		@Pc(16) Class local16 = pe.class;
		synchronized (pe.class) {
			@Pc(32) Class2_Sub13 local32;
			if (Static12.aClass40_5 == null) {
				Static12.aClass40_5 = new Class40(4096);
			} else {
				for (local32 = (Class2_Sub13) Static12.aClass40_5.method851(local7); local32 != null; local32 = (Class2_Sub13) Static12.aClass40_5.method850()) {
					if (this.method1512(local32.aClass65_967)) {
						return local32.aClass65_967;
					}
				}
			}
			local32 = new Class2_Sub13();
			local32.aClass65_967 = this;
			this.aBoolean79 = false;
			Static12.aClass40_5.method849(local32, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!pe", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1499();
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(Lclient!pe;I)Z")
	public boolean method1490(@OriginalArg(0) Class65 arg0) {
		if (this.anInt2005 < arg0.anInt2005) {
			return false;
		}
		for (@Pc(23) int local23 = 0; local23 < arg0.anInt2005; local23++) {
			if (this.aByteArray27[local23] != arg0.aByteArray27[local23]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
	public void method1491(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) int arg2) {
		@Pc(17) String local17;
		try {
			local17 = new String(this.aByteArray27, 0, this.anInt2005, "ISO-8859-1");
		} catch (@Pc(19) UnsupportedEncodingException local19) {
			local17 = new String(this.aByteArray27, 0, this.anInt2005);
		}
		arg1.drawString(local17, arg2, arg0);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)Lclient!pe;")
	public Class65 method1492(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean79) {
			this.anInt1993 = 0;
			if (this.aByteArray27.length == this.anInt2005) {
				@Pc(42) int local42;
				for (local42 = 1; local42 <= this.anInt2005; local42 += local42) {
				}
				@Pc(55) byte[] local55 = new byte[local42];
				Static135.method359(this.aByteArray27, 0, local55, 0, this.anInt2005);
				this.aByteArray27 = local55;
			}
			this.aByteArray27[this.anInt2005++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)J")
	public long method1493() {
		@Pc(5) long local5 = 0L;
		for (@Pc(14) int local14 = 0; local14 < this.anInt2005 && local14 < 12; local14++) {
			local5 *= 37L;
			@Pc(24) byte local24 = this.aByteArray27[local14];
			if (local24 >= 65 && local24 <= 90) {
				local5 += local24 + 1 - 65;
			} else if (local24 >= 97 && local24 <= 122) {
				local5 += local24 + 1 - 97;
			} else if (local24 >= 48 && local24 <= 57) {
				local5 += local24 + 27 - 48;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}

	@OriginalMember(owner = "client!pe", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class65)) {
			throw new IllegalArgumentException();
		}
		return this.method1512((Class65) arg0);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZI)I")
	private int method1495(@OriginalArg(2) int arg0) {
		@Pc(6) byte local6 = (byte) arg0;
		for (@Pc(16) int local16 = 0; local16 < this.anInt2005; local16++) {
			if (local6 == this.aByteArray27[local16]) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLjava/awt/FontMetrics;)I")
	public int method1496(@OriginalArg(1) FontMetrics arg0) {
		@Pc(14) String local14;
		try {
			local14 = new String(this.aByteArray27, 0, this.anInt2005, "ISO-8859-1");
		} catch (@Pc(16) UnsupportedEncodingException local16) {
			local14 = new String(this.aByteArray27, 0, this.anInt2005);
		}
		return arg0.stringWidth(local14);
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)I")
	public int method1497() {
		return this.method1482(10);
	}

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "(B)Ljava/net/URL;")
	public URL method1498() throws MalformedURLException {
		return new URL(new String(this.aByteArray27, 0, this.anInt2005));
	}

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "(B)I")
	public int method1499() {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2005; local12++) {
			local10 = (local10 << 5) - (local10 - (this.aByteArray27[local12] & 0xFF));
		}
		return local10;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(Lclient!pe;I)I")
	public int method1500(@OriginalArg(0) Class65 arg0) {
		return this.method1477(arg0);
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(ZI)Lclient!pe;")
	public Class65 method1501(@OriginalArg(1) int arg0) {
		return this.method1476(this.anInt2005, arg0);
	}

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "(B)I")
	public int method1502() {
		return this.anInt2005;
	}

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)Lclient!pe;")
	public Class65 method1503() {
		@Pc(7) Class65 local7 = new Class65();
		local7.anInt2005 = this.anInt2005;
		local7.aByteArray27 = new byte[this.anInt2005];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2005; local27++) {
			local7.aByteArray27[local27] = 42;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLclient!pe;)Lclient!pe;")
	public Class65 method1504(@OriginalArg(1) Class65 arg0) {
		if (!this.aBoolean79) {
			throw new IllegalArgumentException();
		}
		this.anInt1993 = 0;
		if (arg0.anInt2005 + this.anInt2005 > this.aByteArray27.length) {
			@Pc(35) int local35;
			for (local35 = 1; local35 < this.anInt2005 + arg0.anInt2005; local35 += local35) {
			}
			@Pc(56) byte[] local56 = new byte[local35];
			Static135.method359(this.aByteArray27, 0, local56, 0, this.anInt2005);
			this.aByteArray27 = local56;
		}
		Static135.method359(arg0.aByteArray27, 0, this.aByteArray27, this.anInt2005, arg0.anInt2005);
		this.anInt2005 += arg0.anInt2005;
		return this;
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(Lclient!pe;I)I")
	public int method1505(@OriginalArg(0) Class65 arg0) {
		@Pc(13) int local13;
		if (arg0.anInt2005 >= this.anInt2005) {
			local13 = this.anInt2005;
		} else {
			local13 = arg0.anInt2005;
		}
		for (@Pc(27) int local27 = 0; local27 < local13; local27++) {
			if (Static48.anIntArray152[this.aByteArray27[local27] & 0xFF] < Static48.anIntArray152[arg0.aByteArray27[local27] & 0xFF]) {
				return -1;
			}
			if (Static48.anIntArray152[this.aByteArray27[local27] & 0xFF] > Static48.anIntArray152[arg0.aByteArray27[local27] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt2005 < arg0.anInt2005) {
			return -1;
		} else if (this.anInt2005 > arg0.anInt2005) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "(B)Lclient!pe;")
	public Class65 method1506() {
		@Pc(3) Class65 local3 = new Class65();
		local3.anInt2005 = this.anInt2005;
		local3.aByteArray27 = new byte[this.anInt2005];
		@Pc(18) boolean local18 = true;
		for (@Pc(28) int local28 = 0; local28 < this.anInt2005; local28++) {
			@Pc(34) byte local34 = this.aByteArray27[local28];
			if (local34 == 95) {
				local18 = true;
				local3.aByteArray27[local28] = 32;
			} else if (local34 >= 97 && local34 <= 122 && local18) {
				local18 = false;
				local3.aByteArray27[local28] = (byte) (local34 - 32);
			} else {
				local18 = false;
				local3.aByteArray27[local28] = local34;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(BLclient!pe;)Z")
	public boolean method1507(@OriginalArg(1) Class65 arg0) {
		if (this.anInt2005 < arg0.anInt2005) {
			return false;
		}
		@Pc(27) int local27 = this.anInt2005 - arg0.anInt2005;
		for (@Pc(29) int local29 = 0; local29 < arg0.anInt2005; local29++) {
			if (arg0.aByteArray27[local29] != this.aByteArray27[local29 + local27]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)Z")
	private boolean method1508() {
		@Pc(1) boolean local1 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) int local17 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anInt2005; local24++) {
			@Pc(32) int local32 = this.aByteArray27[local24] & 0xFF;
			if (local24 == 0) {
				if (local32 == 45) {
					local1 = true;
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
			if (local1) {
				local32 = -local32;
			}
			@Pc(101) int local101 = local17 * 10 + local32;
			if (local17 != local101 / 10) {
				return false;
			}
			local17 = local101;
			local15 = true;
		}
		return local15;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III[BI)I")
	public int method1509(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		Static135.method359(this.aByteArray27, 0, arg2, arg1, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!pe", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)I")
	public int method1510(@OriginalArg(0) int arg0) {
		return this.aByteArray27[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!pe;B)Z")
	public boolean method1512(@OriginalArg(0) Class65 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt2005 == this.anInt2005) {
			if (!this.aBoolean79 || !arg0.aBoolean79) {
				if (this.anInt1993 == 0) {
					this.anInt1993 = this.method1499();
					if (this.anInt1993 == 0) {
						this.anInt1993 = 1;
					}
				}
				if (arg0.anInt1993 == 0) {
					arg0.anInt1993 = arg0.method1499();
					if (arg0.anInt1993 == 0) {
						arg0.anInt1993 = 1;
					}
				}
				if (arg0.anInt1993 != this.anInt1993) {
					return false;
				}
			}
			for (@Pc(75) int local75 = 0; local75 < this.anInt2005; local75++) {
				if (arg0.aByteArray27[local75] != this.aByteArray27[local75]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}
