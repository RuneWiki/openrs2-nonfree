import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class64 implements Interface1 {

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
	public int anInt2086;

	@OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
	private int anInt2091;

	@OriginalMember(owner = "client!rd", name = "R", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!rd", name = "N", descriptor = "Z")
	private boolean aBoolean127 = true;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Lclient!rd;")
	public Class64 method1467() {
		@Pc(7) long local7 = this.method1500();
		@Pc(16) Class local16 = rd.class;
		synchronized (rd.class) {
			@Pc(32) Class1_Sub15 local32;
			if (Static71.aClass58_4 == null) {
				Static71.aClass58_4 = new Class58(4096);
			} else {
				for (local32 = (Class1_Sub15) Static71.aClass58_4.method1380(local7); local32 != null; local32 = (Class1_Sub15) Static71.aClass58_4.method1381()) {
					if (this.method1496(local32.aClass64_1748)) {
						return local32.aClass64_1748;
					}
				}
			}
			local32 = new Class1_Sub15();
			local32.aClass64_1748 = this;
			this.aBoolean127 = false;
			Static71.aClass58_4.method1378(local7, local32);
			return this;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBLclient!rd;)Lclient!rd;")
	public Class64 method1468(@OriginalArg(0) int arg0, @OriginalArg(2) Class64 arg1) {
		if (!this.aBoolean127) {
			throw new IllegalArgumentException();
		} else if (arg0 > this.anInt2086) {
			throw new IllegalArgumentException();
		} else {
			this.anInt2091 = 0;
			if (arg0 + arg1.anInt2086 > this.aByteArray24.length) {
				@Pc(46) int local46;
				for (local46 = 1; local46 < arg0 + arg1.anInt2086; local46 += local46) {
				}
				@Pc(66) byte[] local66 = new byte[local46];
				Static124.method523(this.aByteArray24, 0, local66, 0, this.anInt2086);
				this.aByteArray24 = local66;
			}
			Static124.method523(arg1.aByteArray24, 0, this.aByteArray24, arg0, arg1.anInt2086);
			if (this.anInt2086 < arg1.anInt2086 + arg0) {
				this.anInt2086 = arg1.anInt2086 + arg0;
			}
			return this;
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)I")
	public int method1469() {
		return this.anInt2086;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)I")
	private int method1470() {
		for (@Pc(16) int local16 = 0; local16 < this.anInt2086; local16++) {
			if (this.aByteArray24[local16] == 32) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)Lclient!rd;")
	public Class64 method1471() {
		@Pc(10) Class64 local10 = new Class64();
		local10.anInt2086 = 0;
		@Pc(19) int local19 = 0;
		local10.aByteArray24 = new byte[12];
		for (@Pc(25) int local25 = 0; local25 < this.anInt2086; local25++) {
			if (this.aByteArray24[local25] >= 65 && this.aByteArray24[local25] <= 90) {
				local10.aByteArray24[local19++] = (byte) (this.aByteArray24[local25] + 97 - 65);
				local10.anInt2086 = local19;
			} else if (this.aByteArray24[local25] >= 97 && this.aByteArray24[local25] <= 122 || this.aByteArray24[local25] >= 48 && this.aByteArray24[local25] <= 57) {
				local10.aByteArray24[local19++] = this.aByteArray24[local25];
				local10.anInt2086 = local19;
			} else if (local19 > 0) {
				local10.aByteArray24[local19++] = 95;
			}
			if (local19 == 12) {
				break;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!rd;I)I")
	public int method1472(@OriginalArg(0) Class64 arg0) {
		@Pc(13) int local13;
		if (arg0.anInt2086 >= this.anInt2086) {
			local13 = this.anInt2086;
		} else {
			local13 = arg0.anInt2086;
		}
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			if (Static45.anIntArray156[this.aByteArray24[local20] & 0xFF] < Static45.anIntArray156[arg0.aByteArray24[local20] & 0xFF]) {
				return -1;
			}
			if (Static45.anIntArray156[this.aByteArray24[local20] & 0xFF] > Static45.anIntArray156[arg0.aByteArray24[local20] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt2086 < arg0.anInt2086) {
			return -1;
		} else if (arg0.anInt2086 < this.anInt2086) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLclient!rd;)I")
	public int method1473(@OriginalArg(1) Class64 arg0) {
		return this.method1487(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!rd;)Z")
	public boolean method1474(@OriginalArg(1) Class64 arg0) {
		if (arg0.anInt2086 > this.anInt2086) {
			return false;
		}
		@Pc(18) int local18 = this.anInt2086 - arg0.anInt2086;
		for (@Pc(28) int local28 = 0; local28 < arg0.anInt2086; local28++) {
			if (this.aByteArray24[local28 + local18] != arg0.aByteArray24[local28]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(III)Lclient!rd;")
	public Class64 method1475(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class64 local3 = new Class64();
		local3.anInt2086 = arg0 - arg1;
		local3.aByteArray24 = new byte[arg0 - arg1];
		Static124.method523(this.aByteArray24, arg1, local3.aByteArray24, 0, local3.anInt2086);
		return local3;
	}

	@OriginalMember(owner = "client!rd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)I")
	public int method1476(@OriginalArg(0) int arg0) {
		return this.aByteArray24[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)Lclient!rd;")
	public Class64 method1477() {
		@Pc(8) int local8 = this.anInt2086;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt2086 && (this.aByteArray24[local10] >= 0 && this.aByteArray24[local10] <= 32 || (this.aByteArray24[local10] & 0xFF) == 160); local10++) {
		}
		while (local8 > local10 && (this.aByteArray24[local8 - 1] >= 0 && this.aByteArray24[local8 - 1] <= 32 || (this.aByteArray24[local8 - 1] & 0xFF) == 160)) {
			local8--;
		}
		if (local10 == 0 && local8 == this.anInt2086) {
			return this;
		}
		@Pc(95) Class64 local95 = new Class64();
		local95.anInt2086 = local8 - local10;
		local95.aByteArray24 = new byte[local95.anInt2086];
		for (@Pc(108) int local108 = 0; local108 < local95.anInt2086; local108++) {
			local95.aByteArray24[local108] = this.aByteArray24[local108 + local10];
		}
		return local95;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)Lclient!rd;")
	public Class64 method1478() {
		@Pc(14) Class64 local14 = new Class64();
		@Pc(16) boolean local16 = true;
		local14.anInt2086 = this.anInt2086;
		local14.aByteArray24 = new byte[this.anInt2086];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2086; local27++) {
			@Pc(34) byte local34 = this.aByteArray24[local27];
			if (local34 == 95) {
				local16 = true;
				local14.aByteArray24[local27] = 32;
			} else if (local34 >= 97 && local34 <= 122 && local16) {
				local16 = false;
				local14.aByteArray24[local27] = (byte) (local34 - 32);
			} else {
				local16 = false;
				local14.aByteArray24[local27] = local34;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(ILclient!rd;)Z")
	public boolean method1479(@OriginalArg(1) Class64 arg0) {
		if (this.anInt2086 < arg0.anInt2086) {
			return false;
		}
		for (@Pc(23) int local23 = 0; local23 < arg0.anInt2086; local23++) {
			if (this.aByteArray24[local23] != arg0.aByteArray24[local23]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rd", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1485();
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)Lclient!rd;")
	public Class64 method1480() {
		@Pc(13) Class64 local13 = new Class64();
		local13.anInt2086 = this.anInt2086;
		local13.aByteArray24 = new byte[this.anInt2086];
		@Pc(28) boolean local28 = true;
		for (@Pc(30) int local30 = 0; local30 < this.anInt2086; local30++) {
			@Pc(37) byte local37 = this.aByteArray24[local30];
			if (local37 >= 97 && local37 <= 122 || !(local37 < -32 || local37 > -2 || local37 == -9)) {
				if (local28) {
					local37 = (byte) (local37 - 32);
				}
				local28 = false;
			} else if (local37 >= 65 && local37 <= 90 || local37 >= -64 && local37 <= -34 && local37 != -41) {
				if (!local28) {
					local37 = (byte) (local37 + 32);
				}
				local28 = false;
			}
			if (local37 == 46 || local37 == 33 || local37 == 63) {
				local28 = true;
			}
			local13.aByteArray24[local30] = local37;
		}
		return local13;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI)Lclient!rd;")
	public Class64 method1481(@OriginalArg(1) int arg0) {
		return this.method1475(this.anInt2086, arg0);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)I")
	private int method1482() {
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		for (@Pc(30) int local30 = 0; local30 < this.anInt2086; local30++) {
			@Pc(39) int local39 = this.aByteArray24[local30] & 0xFF;
			if (local30 == 0) {
				if (local39 == 45) {
					local21 = true;
					continue;
				}
				if (local39 == 43) {
					continue;
				}
			}
			if (local39 >= 48 && local39 <= 57) {
				local39 -= 48;
			} else if (local39 >= 65 && local39 <= 90) {
				local39 -= 55;
			} else if (local39 >= 97 && local39 <= 122) {
				local39 -= 87;
			} else {
				throw new NumberFormatException();
			}
			if (local39 >= 10) {
				throw new NumberFormatException();
			}
			if (local21) {
				local39 = -local39;
			}
			@Pc(117) int local117 = local39 + local23 * 10;
			if (local117 / 10 != local23) {
				throw new NumberFormatException();
			}
			local19 = true;
			local23 = local117;
		}
		if (!local19) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)Z")
	public boolean method1483() {
		return this.method1502();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public void method1484(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		@Pc(21) String local21;
		try {
			local21 = new String(this.aByteArray24, 0, this.anInt2086, "ISO-8859-1");
		} catch (@Pc(23) UnsupportedEncodingException local23) {
			local21 = new String(this.aByteArray24, 0, this.anInt2086);
		}
		arg2.drawString(local21, arg0, arg1);
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)I")
	public int method1485() {
		@Pc(5) int local5 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2086; local12++) {
			local5 = (this.aByteArray24[local12] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)Lclient!rd;")
	public Class64 method1486(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		} else if (this.aBoolean127) {
			this.anInt2091 = 0;
			if (this.anInt2086 == this.aByteArray24.length) {
				@Pc(45) int local45;
				for (local45 = 1; local45 <= this.anInt2086; local45 += local45) {
				}
				@Pc(62) byte[] local62 = new byte[local45];
				Static124.method523(this.aByteArray24, 0, local62, 0, this.anInt2086);
				this.aByteArray24 = local62;
			}
			this.aByteArray24[this.anInt2086++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLclient!rd;I)I")
	private int method1487(@OriginalArg(1) Class64 arg0) {
		@Pc(9) int[] local9 = new int[arg0.anInt2086];
		@Pc(13) int[] local13 = new int[arg0.anInt2086];
		@Pc(16) int[] local16 = new int[256];
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			local16[local18] = arg0.anInt2086;
		}
		for (@Pc(45) int local45 = 1; local45 <= arg0.anInt2086; local45++) {
			local9[local45 - 1] = (arg0.anInt2086 << 1) - local45;
			local16[arg0.aByteArray24[local45 - 1] & 0xFF] = arg0.anInt2086 - local45;
		}
		@Pc(87) int local87 = arg0.anInt2086 + 1;
		@Pc(90) int local90 = arg0.anInt2086;
		while (local90 > 0) {
			local13[local90 - 1] = local87;
			while (local87 <= arg0.anInt2086 && arg0.aByteArray24[local87 - 1] != arg0.aByteArray24[local90 - 1]) {
				if (local9[local87 - 1] >= arg0.anInt2086 - local90) {
					local9[local87 - 1] = arg0.anInt2086 - local90;
				}
				local87 = local13[local87 - 1];
			}
			local90--;
			local87--;
		}
		@Pc(154) int local154 = local87;
		local87 = arg0.anInt2086 + 1 - local87;
		@Pc(164) int local164 = 1;
		@Pc(166) int local166 = 0;
		for (@Pc(168) int local168 = 1; local168 <= local87; local168++) {
			local13[local168 - 1] = local166;
			while (local166 >= 1 && arg0.aByteArray24[local166 - 1] != arg0.aByteArray24[local168 - 1]) {
				local166 = local13[local166 - 1];
			}
			local166++;
		}
		@Pc(217) int local217;
		while (arg0.anInt2086 > local154) {
			for (local217 = local164; local217 <= local154; local217++) {
				if (local9[local217 - 1] >= arg0.anInt2086 + local154 - local217) {
					local9[local217 - 1] = arg0.anInt2086 + local154 - local217;
				}
			}
			local164 = local154 + 1;
			local154 = local154 + local87 - local13[local87 - 1];
			local87 = local13[local87 - 1];
		}
		@Pc(296) int local296;
		for (local217 = arg0.anInt2086 - 1; local217 < this.anInt2086; local217 += Math.max(local16[this.aByteArray24[local217] & 0xFF], local9[local296])) {
			for (local296 = arg0.anInt2086 - 1; local296 >= 0 && arg0.aByteArray24[local296] == this.aByteArray24[local217]; local296--) {
				local217--;
			}
			if (local296 == -1) {
				return local217 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)[B")
	public byte[] method1488() {
		@Pc(7) byte[] local7 = new byte[this.anInt2086];
		Static124.method523(this.aByteArray24, 0, local7, 0, this.anInt2086);
		return local7;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II[BII)I")
	public int method1489(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static124.method523(this.aByteArray24, 0, arg0, arg1, arg2);
		return arg2;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)I")
	public int method1490() {
		return this.method1470();
	}

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)I")
	public int method1491() {
		return this.method1482();
	}

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "(I)J")
	public long method1492() {
		@Pc(3) long local3 = 0L;
		for (@Pc(5) int local5 = 0; this.anInt2086 > local5 && local5 < 12; local5++) {
			local3 *= 37L;
			@Pc(16) byte local16 = this.aByteArray24[local5];
			if (local16 >= 65 && local16 <= 90) {
				local3 += local16 + 1 - 65;
			} else if (local16 >= 97 && local16 <= 122) {
				local3 += local16 + 1 - 97;
			} else if (local16 >= 48 && local16 <= 57) {
				local3 += local16 + 27 - 48;
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)Lclient!rd;")
	public Class64 method1493() {
		@Pc(16) Class64 local16 = new Class64();
		local16.anInt2086 = this.anInt2086;
		local16.aByteArray24 = new byte[this.anInt2086];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2086; local27++) {
			local16.aByteArray24[local27] = 42;
		}
		return local16;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)Lclient!rd;")
	public Class64 method1495() {
		if (!this.aBoolean127) {
			throw new IllegalArgumentException();
		}
		this.anInt2091 = 0;
		if (this.anInt2086 != this.aByteArray24.length) {
			@Pc(34) byte[] local34 = new byte[this.anInt2086];
			Static124.method523(this.aByteArray24, 0, local34, 0, this.anInt2086);
			this.aByteArray24 = local34;
		}
		return this;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!rd;Z)Z")
	public boolean method1496(@OriginalArg(0) Class64 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2086 == arg0.anInt2086) {
			if (!this.aBoolean127 || !arg0.aBoolean127) {
				if (this.anInt2091 == 0) {
					this.anInt2091 = this.method1485();
					if (this.anInt2091 == 0) {
						this.anInt2091 = 1;
					}
				}
				if (arg0.anInt2091 == 0) {
					arg0.anInt2091 = arg0.method1485();
					if (arg0.anInt2091 == 0) {
						arg0.anInt2091 = 1;
					}
				}
				if (arg0.anInt2091 != this.anInt2091) {
					return false;
				}
			}
			for (@Pc(73) int local73 = 0; local73 < this.anInt2086; local73++) {
				if (this.aByteArray24[local73] != arg0.aByteArray24[local73]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
	public int method1497(@OriginalArg(0) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray24, 0, this.anInt2086, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local13 = new String(this.aByteArray24, 0, this.anInt2086);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!rd;B)Lclient!rd;")
	public Class64 method1498(@OriginalArg(0) Class64 arg0) {
		if (!this.aBoolean127) {
			throw new IllegalArgumentException();
		}
		this.anInt2091 = 0;
		if (this.anInt2086 + arg0.anInt2086 > this.aByteArray24.length) {
			@Pc(32) int local32;
			for (local32 = 1; local32 < this.anInt2086 + arg0.anInt2086; local32 += local32) {
			}
			@Pc(52) byte[] local52 = new byte[local32];
			Static124.method523(this.aByteArray24, 0, local52, 0, this.anInt2086);
			this.aByteArray24 = local52;
		}
		Static124.method523(arg0.aByteArray24, 0, this.aByteArray24, this.anInt2086, arg0.anInt2086);
		this.anInt2086 += arg0.anInt2086;
		return this;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(II)Lclient!rd;")
	public Class64 method1499(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(25) Class64 local25 = new Class64();
		local25.aByteArray24 = new byte[this.anInt2086 + 1];
		local25.anInt2086 = this.anInt2086 + 1;
		Static124.method523(this.aByteArray24, 0, local25.aByteArray24, 0, this.anInt2086);
		local25.aByteArray24[this.anInt2086] = (byte) arg0;
		return local25;
	}

	@OriginalMember(owner = "client!rd", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class64)) {
			throw new IllegalArgumentException();
		}
		return this.method1496((Class64) arg0);
	}

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "(I)J")
	private long method1500() {
		@Pc(11) long local11 = 0L;
		for (@Pc(13) int local13 = 0; local13 < this.anInt2086; local13++) {
			local11 = (local11 << 5) + (long) (this.aByteArray24[local13] & 0xFF) - local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Lclient!rd;Z)Z")
	public boolean method1501(@OriginalArg(0) Class64 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt2086 == this.anInt2086) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt2086; local27++) {
				@Pc(34) byte local34 = arg0.aByteArray24[local27];
				@Pc(39) byte local39 = this.aByteArray24[local27];
				if (local34 >= 65 && local34 <= 90 || local34 >= -64 && local34 <= -34 && local34 != -41) {
					local34 = (byte) (local34 + 32);
				}
				if (local39 >= 65 && local39 <= 90 || local39 >= -64 && local39 <= -34 && local39 != -41) {
					local39 = (byte) (local39 + 32);
				}
				if (local34 != local39) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(II)Z")
	private boolean method1502() {
		@Pc(3) boolean local3 = false;
		@Pc(19) boolean local19 = false;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt2086; local29++) {
			@Pc(38) int local38 = this.aByteArray24[local29] & 0xFF;
			if (local29 == 0) {
				if (local38 == 45) {
					local3 = true;
					continue;
				}
				if (local38 == 43) {
					continue;
				}
			}
			if (local38 >= 48 && local38 <= 57) {
				local38 -= 48;
			} else if (local38 >= 65 && local38 <= 90) {
				local38 -= 55;
			} else if (local38 >= 97 && local38 <= 122) {
				local38 -= 87;
			} else {
				return false;
			}
			if (local38 >= 10) {
				return false;
			}
			if (local3) {
				local38 = -local38;
			}
			@Pc(104) int local104 = local27 * 10 + local38;
			if (local27 != local104 / 10) {
				return false;
			}
			local27 = local104;
			local19 = true;
		}
		return local19;
	}

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "(I)Lclient!rd;")
	public Class64 method1503() {
		@Pc(18) Class64 local18 = new Class64();
		local18.anInt2086 = this.anInt2086;
		local18.aByteArray24 = new byte[this.anInt2086];
		for (@Pc(29) int local29 = 0; local29 < this.anInt2086; local29++) {
			@Pc(36) byte local36 = this.aByteArray24[local29];
			if (local36 >= 65 && local36 <= 90 || local36 >= -64 && local36 <= -34 && local36 != -41) {
				local36 = (byte) (local36 + 32);
			}
			local18.aByteArray24[local29] = local36;
		}
		return local18;
	}
}
