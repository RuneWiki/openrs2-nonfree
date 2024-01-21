import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class61 implements Interface2 {

	@OriginalMember(owner = "client!r", name = "ib", descriptor = "[I")
	public static int[] anIntArray331 = new int[256];

	@OriginalMember(owner = "client!r", name = "g", descriptor = "I")
	private int anInt2654;

	@OriginalMember(owner = "client!r", name = "C", descriptor = "I")
	public int anInt2675;

	@OriginalMember(owner = "client!r", name = "G", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!r", name = "S", descriptor = "Z")
	private boolean aBoolean97 = true;

	static {
		for (@Pc(39) int local39 = 0; local39 < 256; local39++) {
			@Pc(42) int local42 = local39;
			for (@Pc(44) int local44 = 0; local44 < 8; local44++) {
				if ((local42 & 0x1) == 1) {
					local42 = local42 >>> 1 ^ 0xEDB88320;
				} else {
					local42 >>>= 0x1;
				}
			}
			anIntArray331[local39] = local42;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Lclient!r;")
	public Class61 method1701() {
		@Pc(9) Class61 local9 = new Class61();
		@Pc(19) boolean local19 = true;
		local9.anInt2675 = this.anInt2675;
		local9.aByteArray38 = new byte[this.anInt2675];
		for (@Pc(30) int local30 = 0; local30 < this.anInt2675; local30++) {
			@Pc(37) byte local37 = this.aByteArray38[local30];
			if (local37 == 95) {
				local9.aByteArray38[local30] = 32;
				local19 = true;
			} else if (local37 >= 97 && local37 <= 122 && local19) {
				local9.aByteArray38[local30] = (byte) (local37 - 32);
				local19 = false;
			} else {
				local9.aByteArray38[local30] = local37;
				local19 = false;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)I")
	public int method1702() {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt2675; local15++) {
			local13 = (local13 << 5) + (this.aByteArray38[local15] & 0xFF) - local13;
		}
		return local13;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)Lclient!r;")
	public Class61 method1703(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean97) {
			this.anInt2654 = 0;
			if (this.anInt2675 == this.aByteArray38.length) {
				@Pc(49) int local49;
				for (local49 = 1; local49 <= this.anInt2675; local49 += local49) {
				}
				@Pc(62) byte[] local62 = new byte[local49];
				Static136.method893(this.aByteArray38, 0, local62, 0, this.anInt2675);
				this.aByteArray38 = local62;
			}
			this.aByteArray38[this.anInt2675++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)I")
	public int method1704() {
		return this.method1712(10);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!r;B)I")
	public int method1705(@OriginalArg(0) int arg0, @OriginalArg(1) Class61 arg1) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(12) int[] local12 = new int[arg1.anInt2675];
		@Pc(16) int[] local16 = new int[arg1.anInt2675];
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			local8[local18] = arg1.anInt2675;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg1.anInt2675; local36++) {
			local12[local36 - 1] = (arg1.anInt2675 << 1) - local36;
			local8[arg1.aByteArray38[local36 - 1] & 0xFF] = arg1.anInt2675 - local36;
		}
		@Pc(79) int local79 = arg1.anInt2675 + 1;
		for (@Pc(82) int local82 = arg1.anInt2675; local82 > 0; local82--) {
			local16[local82 - 1] = local79;
			while (arg1.anInt2675 >= local79 && arg1.aByteArray38[local82 - 1] != arg1.aByteArray38[local79 - 1]) {
				if (arg1.anInt2675 - local82 <= local12[local79 + -1]) {
					local12[local79 - 1] = arg1.anInt2675 - local82;
				}
				local79 = local16[local79 - 1];
			}
			local79--;
		}
		@Pc(154) int local154 = 0;
		@Pc(156) int local156 = 1;
		@Pc(158) int local158 = local79;
		local79 = arg1.anInt2675 + 1 - local79;
		@Pc(167) int local167 = 1;
		while (local167 <= local79) {
			local16[local167 - 1] = local154;
			while (local154 >= 1 && arg1.aByteArray38[local167 - 1] != arg1.aByteArray38[local154 - 1]) {
				local154 = local16[local154 - 1];
			}
			local167++;
			local154++;
		}
		@Pc(218) int local218;
		while (arg1.anInt2675 > local158) {
			for (local218 = local156; local218 <= local158; local218++) {
				if (local12[local218 - 1] >= local158 + arg1.anInt2675 - local218) {
					local12[local218 - 1] = arg1.anInt2675 + local158 - local218;
				}
			}
			local156 = local158 + 1;
			local158 = local158 + local79 - local16[local79 - 1];
			local79 = local16[local79 - 1];
		}
		@Pc(297) int local297;
		for (local218 = arg1.anInt2675 + arg0 - 1; local218 < this.anInt2675; local218 += Math.max(local8[this.aByteArray38[local218] & 0xFF], local12[local297])) {
			for (local297 = arg1.anInt2675 - 1; local297 >= 0 && this.aByteArray38[local218] == arg1.aByteArray38[local297]; local297--) {
				local218--;
			}
			if (local297 == -1) {
				return local218 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)J")
	private long method1706() {
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2675; local12++) {
			local10 = (long) (this.aByteArray38[local12] & 0xFF) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!r;I)I")
	public int method1708(@OriginalArg(0) Class61 arg0) {
		@Pc(7) int local7;
		if (this.anInt2675 > arg0.anInt2675) {
			local7 = arg0.anInt2675;
		} else {
			local7 = this.anInt2675;
		}
		for (@Pc(17) int local17 = 0; local17 < local7; local17++) {
			if ((this.aByteArray38[local17] & 0xFF) < (arg0.aByteArray38[local17] & 0xFF)) {
				return -1;
			}
			if ((arg0.aByteArray38[local17] & 0xFF) < (this.aByteArray38[local17] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.anInt2675 > this.anInt2675) {
			return -1;
		} else if (this.anInt2675 > arg0.anInt2675) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Lclient!r;I)Z")
	public boolean method1709(@OriginalArg(0) Class61 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt2675 == this.anInt2675) {
			for (@Pc(25) int local25 = 0; local25 < this.anInt2675; local25++) {
				@Pc(31) byte local31 = arg0.aByteArray38[local25];
				if (local31 >= 65 && local31 <= 90 || local31 >= -64 && local31 <= -34 && local31 != -41) {
					local31 = (byte) (local31 + 32);
				}
				@Pc(58) byte local58 = this.aByteArray38[local25];
				if (local58 >= 65 && local58 <= 90 || local58 >= -64 && local58 <= -34 && local58 != -41) {
					local58 = (byte) (local58 + 32);
				}
				if (local31 != local58) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!r;)Z")
	public boolean method1710(@OriginalArg(1) Class61 arg0) {
		if (arg0.anInt2675 > this.anInt2675) {
			return false;
		}
		@Pc(24) int local24 = this.anInt2675 - arg0.anInt2675;
		for (@Pc(26) int local26 = 0; local26 < arg0.anInt2675; local26++) {
			if (arg0.aByteArray38[local26] != this.aByteArray38[local26 + local24]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!r", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1702();
	}

	@OriginalMember(owner = "client!r", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)Lclient!r;")
	public Class61 method1711() {
		@Pc(5) Class61 local5 = new Class61();
		local5.anInt2675 = this.anInt2675;
		local5.aByteArray38 = new byte[this.anInt2675];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2675; local16++) {
			@Pc(23) byte local23 = this.aByteArray38[local16];
			if (local23 >= 65 && local23 <= 90 || local23 >= -64 && local23 <= -34 && local23 != -41) {
				local23 = (byte) (local23 + 32);
			}
			local5.aByteArray38[local16] = local23;
		}
		return local5;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)I")
	public int method1712(@OriginalArg(1) int arg0) {
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		for (@Pc(30) int local30 = 0; local30 < this.anInt2675; local30++) {
			@Pc(39) int local39 = this.aByteArray38[local30] & 0xFF;
			if (local30 == 0) {
				if (local39 == 45) {
					local19 = true;
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
			if (arg0 <= local39) {
				throw new NumberFormatException();
			}
			if (local19) {
				local39 = -local39;
			}
			@Pc(117) int local117 = local39 + local23 * arg0;
			if (local117 / arg0 != local23) {
				throw new NumberFormatException();
			}
			local23 = local117;
			local21 = true;
		}
		if (!local21) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!r;B)Z")
	public boolean method1713(@OriginalArg(0) Class61 arg0) {
		if (arg0.anInt2675 > this.anInt2675) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < arg0.anInt2675; local18++) {
			if (arg0.aByteArray38[local18] != this.aByteArray38[local18]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
	public int method1714(@OriginalArg(1) int arg0) {
		return this.aByteArray38[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)Z")
	public boolean method1715() {
		return this.method1739();
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)Lclient!r;")
	public Class61 method1716() {
		@Pc(8) int local8 = this.anInt2675;
		@Pc(10) int local10;
		for (local10 = 0; this.anInt2675 > local10 && (this.aByteArray38[local10] >= 0 && this.aByteArray38[local10] <= 32 || (this.aByteArray38[local10] & 0xFF) == 160); local10++) {
		}
		while (local8 > local10 && (this.aByteArray38[local8 - 1] >= 0 && this.aByteArray38[local8 - 1] <= 32 || (this.aByteArray38[local8 - 1] & 0xFF) == 160)) {
			local8--;
		}
		if (local10 == 0 && this.anInt2675 == local8) {
			return this;
		}
		@Pc(91) Class61 local91 = new Class61();
		local91.anInt2675 = local8 - local10;
		local91.aByteArray38 = new byte[local91.anInt2675];
		for (@Pc(104) int local104 = 0; local104 < local91.anInt2675; local104++) {
			local91.aByteArray38[local104] = this.aByteArray38[local10 + local104];
		}
		return local91;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(ILclient!r;)I")
	public int method1717(@OriginalArg(1) Class61 arg0) {
		@Pc(18) int local18;
		if (this.anInt2675 > arg0.anInt2675) {
			local18 = arg0.anInt2675;
		} else {
			local18 = this.anInt2675;
		}
		for (@Pc(25) int local25 = 0; local25 < local18; local25++) {
			if (Static43.anIntArray181[this.aByteArray38[local25] & 0xFF] < Static43.anIntArray181[arg0.aByteArray38[local25] & 0xFF]) {
				return -1;
			}
			if (Static43.anIntArray181[arg0.aByteArray38[local25] & 0xFF] < Static43.anIntArray181[this.aByteArray38[local25] & 0xFF]) {
				return 1;
			}
		}
		if (arg0.anInt2675 > this.anInt2675) {
			return -1;
		} else if (arg0.anInt2675 < this.anInt2675) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(B)Lclient!r;")
	public Class61 method1718() {
		if (!this.aBoolean97) {
			throw new IllegalArgumentException();
		}
		this.anInt2654 = 0;
		if (this.aByteArray38.length != this.anInt2675) {
			@Pc(33) byte[] local33 = new byte[this.anInt2675];
			Static136.method893(this.aByteArray38, 0, local33, 0, this.anInt2675);
			this.aByteArray38 = local33;
		}
		return this;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)[B")
	public byte[] method1719() {
		@Pc(14) byte[] local14 = new byte[this.anInt2675];
		Static136.method893(this.aByteArray38, 0, local14, 0, this.anInt2675);
		return local14;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IB)Lclient!r;")
	public Class61 method1720(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(22) Class61 local22 = new Class61();
		local22.aByteArray38 = new byte[this.anInt2675 + 1];
		local22.anInt2675 = this.anInt2675 + 1;
		Static136.method893(this.aByteArray38, 0, local22.aByteArray38, 0, this.anInt2675);
		local22.aByteArray38[this.anInt2675] = (byte) arg0;
		return local22;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(ILclient!r;)Lclient!r;")
	public Class61 method1721(@OriginalArg(1) Class61 arg0) {
		if (!this.aBoolean97) {
			throw new IllegalArgumentException();
		}
		this.anInt2654 = 0;
		if (this.aByteArray38.length < this.anInt2675 + arg0.anInt2675) {
			@Pc(31) int local31;
			for (local31 = 1; local31 < this.anInt2675 + arg0.anInt2675; local31 += local31) {
			}
			@Pc(52) byte[] local52 = new byte[local31];
			Static136.method893(this.aByteArray38, 0, local52, 0, this.anInt2675);
			this.aByteArray38 = local52;
		}
		Static136.method893(arg0.aByteArray38, 0, this.aByteArray38, this.anInt2675, arg0.anInt2675);
		this.anInt2675 += arg0.anInt2675;
		return this;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
	public int method1722(@OriginalArg(1) FontMetrics arg0) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray38, 0, this.anInt2675, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray38, 0, this.anInt2675);
		}
		return arg0.stringWidth(local18);
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)J")
	public long method1723() {
		@Pc(3) long local3 = 0L;
		for (@Pc(9) int local9 = 0; local9 < this.anInt2675 && local9 < 12; local9++) {
			local3 *= 37L;
			@Pc(20) byte local20 = this.aByteArray38[local9];
			if (local20 >= 65 && local20 <= 90) {
				local3 += local20 + 1 - 65;
			} else if (local20 >= 97 && local20 <= 122) {
				local3 += local20 + 1 - 97;
			} else if (local20 >= 48 && local20 <= 57) {
				local3 += local20 - 21;
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(IB)Lclient!r;")
	public Class61 method1724(@OriginalArg(0) int arg0) {
		return this.method1730(this.anInt2675, arg0);
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)Lclient!r;")
	public Class61 method1726() {
		@Pc(9) Class61 local9 = new Class61();
		local9.aByteArray38 = new byte[12];
		@Pc(15) int local15 = 0;
		local9.anInt2675 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt2675; local26++) {
			if (this.aByteArray38[local26] >= 65 && this.aByteArray38[local26] <= 90) {
				local9.aByteArray38[local15++] = (byte) (this.aByteArray38[local26] + 97 - 65);
				local9.anInt2675 = local15;
			} else if (this.aByteArray38[local26] >= 97 && this.aByteArray38[local26] <= 122 || this.aByteArray38[local26] >= 48 && this.aByteArray38[local26] <= 57) {
				local9.aByteArray38[local15++] = this.aByteArray38[local26];
				local9.anInt2675 = local15;
			} else if (local15 > 0) {
				local9.aByteArray38[local15++] = 95;
			}
			if (local15 == 12) {
				break;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIB)I")
	public int method1727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte local4 = (byte) arg0;
		for (@Pc(10) int local10 = arg1; local10 < this.anInt2675; local10++) {
			if (this.aByteArray38[local10] == local4) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)Lclient!r;")
	public Class61 method1728() {
		@Pc(9) Class61 local9 = new Class61();
		local9.anInt2675 = this.anInt2675;
		local9.aByteArray38 = new byte[this.anInt2675];
		for (@Pc(28) int local28 = 0; local28 < this.anInt2675; local28++) {
			local9.aByteArray38[local28] = 42;
		}
		return local9;
	}

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(I)Ljava/net/URL;")
	public URL method1729() throws MalformedURLException {
		return new URL(new String(this.aByteArray38, 0, this.anInt2675));
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBI)Lclient!r;")
	public Class61 method1730(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class61 local7 = new Class61();
		local7.anInt2675 = arg0 - arg1;
		local7.aByteArray38 = new byte[arg0 - arg1];
		Static136.method893(this.aByteArray38, arg1, local7.aByteArray38, 0, local7.anInt2675);
		return local7;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BLclient!r;)I")
	public int method1731(@OriginalArg(1) Class61 arg0) {
		return this.method1705(0, arg0);
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(B)Lclient!r;")
	public Class61 method1732() {
		@Pc(7) long local7 = this.method1706();
		@Pc(16) Class local16 = r.class;
		synchronized (r.class) {
			@Pc(32) Class5_Sub23 local32;
			if (Static113.aClass20_13 == null) {
				Static113.aClass20_13 = new Class20(4096);
			} else {
				for (local32 = (Class5_Sub23) Static113.aClass20_13.method656(local7); local32 != null; local32 = (Class5_Sub23) Static113.aClass20_13.method653()) {
					if (this.method1736(local32.aClass61_983)) {
						return local32.aClass61_983;
					}
				}
			}
			local32 = new Class5_Sub23();
			local32.aClass61_983 = this;
			this.aBoolean97 = false;
			Static113.aClass20_13.method647(local32, local7);
			return this;
		}
	}

	@OriginalMember(owner = "client!r", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class61)) {
			throw new IllegalArgumentException();
		}
		return this.method1736((Class61) arg0);
	}

	@OriginalMember(owner = "client!r", name = "i", descriptor = "(I)I")
	public int method1733() {
		return this.anInt2675;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIZ[B)I")
	public int method1734(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2) {
		Static136.method893(this.aByteArray38, 0, arg2, arg1, arg0);
		return arg0;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(BLclient!r;)Z")
	public boolean method1736(@OriginalArg(1) Class61 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2675 == arg0.anInt2675) {
			if (!this.aBoolean97 || !arg0.aBoolean97) {
				if (this.anInt2654 == 0) {
					this.anInt2654 = this.method1702();
					if (this.anInt2654 == 0) {
						this.anInt2654 = 1;
					}
				}
				if (arg0.anInt2654 == 0) {
					arg0.anInt2654 = arg0.method1702();
					if (arg0.anInt2654 == 0) {
						arg0.anInt2654 = 1;
					}
				}
				if (this.anInt2654 != arg0.anInt2654) {
					return false;
				}
			}
			for (@Pc(76) int local76 = 0; local76 < this.anInt2675; local76++) {
				if (this.aByteArray38[local76] != arg0.aByteArray38[local76]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(B)Lclient!r;")
	public Class61 method1737() {
		@Pc(5) Class61 local5 = new Class61();
		local5.anInt2675 = this.anInt2675;
		local5.aByteArray38 = new byte[this.anInt2675];
		@Pc(27) byte local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < this.anInt2675; local29++) {
			@Pc(36) byte local36 = this.aByteArray38[local29];
			if (local36 >= 97 && local36 <= 122 || !(local36 < -32 || local36 > -2 || local36 == -9)) {
				if (local27 == 2) {
					local36 = (byte) (local36 - 32);
				}
				local27 = 0;
			} else if (local36 >= 65 && local36 <= 90 || !(local36 < -64 || local36 > -34 || local36 == -41)) {
				if (local27 == 0) {
					local36 = (byte) (local36 + 32);
				}
				local27 = 0;
			} else if (local36 == 46 || local36 == 33 || local36 == 63) {
				local27 = 2;
			} else if (local36 != 32) {
				local27 = 1;
			} else if (local27 != 2) {
				local27 = 1;
			}
			local5.aByteArray38[local29] = local36;
		}
		return local5;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
	public void method1738(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) int arg2) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray38, 0, this.anInt2675, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray38, 0, this.anInt2675);
		}
		arg1.drawString(local13, arg0, arg2);
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)Z")
	private boolean method1739() {
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt2675; local27++) {
			@Pc(35) int local35 = this.aByteArray38[local27] & 0xFF;
			if (local27 == 0) {
				if (local35 == 45) {
					local13 = true;
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
				return false;
			}
			if (local35 >= 10) {
				return false;
			}
			if (local13) {
				local35 = -local35;
			}
			@Pc(107) int local107 = local35 + local25 * 10;
			if (local107 / 10 != local25) {
				return false;
			}
			local25 = local107;
			local15 = true;
		}
		return local15;
	}
}
