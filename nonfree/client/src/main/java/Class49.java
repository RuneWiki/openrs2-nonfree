import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class49 implements Interface3 {

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
	private int anInt2025;

	@OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
	public int anInt2058;

	@OriginalMember(owner = "client!lf", name = "Y", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!lf", name = "E", descriptor = "Z")
	private boolean aBoolean86 = true;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!lf;I)I")
	public int method1640(@OriginalArg(0) Class49 arg0) {
		@Pc(13) int local13;
		if (this.anInt2058 > arg0.anInt2058) {
			local13 = arg0.anInt2058;
		} else {
			local13 = this.anInt2058;
		}
		for (@Pc(24) int local24 = 0; local24 < local13; local24++) {
			if ((this.aByteArray28[local24] & 0xFF) < (arg0.aByteArray28[local24] & 0xFF)) {
				return -1;
			}
			if ((this.aByteArray28[local24] & 0xFF) > (arg0.aByteArray28[local24] & 0xFF)) {
				return 1;
			}
		}
		if (this.anInt2058 < arg0.anInt2058) {
			return -1;
		} else if (arg0.anInt2058 < this.anInt2058) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)Lclient!lf;")
	public Class49 method1641() {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = this.anInt2058;
		while (this.anInt2058 > local7 && (this.aByteArray28[local7] >= 0 && this.aByteArray28[local7] <= 32 || (this.aByteArray28[local7] & 0xFF) == 160)) {
			local7++;
		}
		while (local10 > local7 && (this.aByteArray28[local10 - 1] >= 0 && this.aByteArray28[local10 - 1] <= 32 || (this.aByteArray28[local10 - 1] & 0xFF) == 160)) {
			local10--;
		}
		if (local7 == 0 && this.anInt2058 == local10) {
			return this;
		}
		@Pc(83) Class49 local83 = new Class49();
		local83.anInt2058 = local10 - local7;
		local83.aByteArray28 = new byte[local83.anInt2058];
		for (@Pc(101) int local101 = 0; local101 < local83.anInt2058; local101++) {
			local83.aByteArray28[local101] = this.aByteArray28[local7 + local101];
		}
		return local83;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)Lclient!lf;")
	public Class49 method1642() {
		@Pc(3) long local3 = this.method1672();
		@Pc(16) Class local16 = lf.class;
		synchronized (lf.class) {
			@Pc(26) Class2_Sub4 local26;
			if (Static1.aClass25_1 == null) {
				Static1.aClass25_1 = new Class25(4096);
			} else {
				for (local26 = (Class2_Sub4) Static1.aClass25_1.method836(local3); local26 != null; local26 = (Class2_Sub4) Static1.aClass25_1.method830()) {
					if (this.method1676(local26.aClass49_81)) {
						return local26.aClass49_81;
					}
				}
			}
			local26 = new Class2_Sub4();
			this.aBoolean86 = false;
			local26.aClass49_81 = this;
			Static1.aClass25_1.method838(local3, local26);
			return this;
		}
	}

	@OriginalMember(owner = "client!lf", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1670();
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)Lclient!lf;")
	public Class49 method1643() {
		@Pc(12) Class49 local12 = new Class49();
		local12.anInt2058 = this.anInt2058;
		local12.aByteArray28 = new byte[this.anInt2058];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2058; local27++) {
			@Pc(34) byte local34 = this.aByteArray28[local27];
			if (local34 >= 65 && local34 <= 90 || local34 >= -64 && local34 <= -34 && local34 != -41) {
				local34 = (byte) (local34 + 32);
			}
			local12.aByteArray28[local27] = local34;
		}
		return local12;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)I")
	public int method1644(@OriginalArg(0) int arg0) {
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt2058; local28++) {
			@Pc(37) int local37 = this.aByteArray28[local28] & 0xFF;
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
				throw new NumberFormatException();
			}
			if (arg0 <= local37) {
				throw new NumberFormatException();
			}
			if (local22) {
				local37 = -local37;
			}
			@Pc(103) int local103 = arg0 * local26 + local37;
			if (local26 != local103 / arg0) {
				throw new NumberFormatException();
			}
			local26 = local103;
			local24 = true;
		}
		if (!local24) {
			throw new NumberFormatException();
		}
		return local26;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLclient!lf;)Z")
	public boolean method1645(@OriginalArg(1) Class49 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2058 == arg0.anInt2058) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt2058; local20++) {
				@Pc(30) byte local30 = arg0.aByteArray28[local20];
				@Pc(35) byte local35 = this.aByteArray28[local20];
				if (local30 >= 65 && local30 <= 90 || local30 >= -64 && local30 <= -34 && local30 != -41) {
					local30 = (byte) (local30 + 32);
				}
				if (local35 >= 65 && local35 <= 90 || local35 >= -64 && local35 <= -34 && local35 != -41) {
					local35 = (byte) (local35 + 32);
				}
				if (local35 != local30) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)I")
	public int method1646(@OriginalArg(1) int arg0) {
		return this.aByteArray28[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)I")
	public int method1648() {
		return this.method1644(10);
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)Z")
	public boolean method1649() {
		return this.method1652();
	}

	@OriginalMember(owner = "client!lf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBI)I")
	public int method1650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte local8 = (byte) arg0;
		for (@Pc(15) int local15 = arg1; local15 < this.anInt2058; local15++) {
			if (this.aByteArray28[local15] == local8) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)J")
	public long method1651() {
		@Pc(3) long local3 = 0L;
		for (@Pc(5) int local5 = 0; local5 < this.anInt2058 && local5 < 12; local5++) {
			local3 *= 37L;
			@Pc(16) byte local16 = this.aByteArray28[local5];
			if (local16 >= 65 && local16 <= 90) {
				local3 += local16 + 1 - 65;
			} else if (local16 >= 97 && local16 <= 122) {
				local3 += local16 - 96;
			} else if (local16 >= 48 && local16 <= 57) {
				local3 += local16 - 21;
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)Z")
	private boolean method1652() {
		@Pc(11) boolean local11 = false;
		@Pc(17) boolean local17 = false;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anInt2058; local26++) {
			@Pc(35) int local35 = this.aByteArray28[local26] & 0xFF;
			if (local26 == 0) {
				if (local35 == 45) {
					local11 = true;
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
			if (local11) {
				local35 = -local35;
			}
			@Pc(102) int local102 = local35 + local24 * 10;
			if (local24 != local102 / 10) {
				return false;
			}
			local24 = local102;
			local17 = true;
		}
		return local17;
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)I")
	public int method1653() {
		return this.anInt2058;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)Lclient!lf;")
	public Class49 method1654() {
		@Pc(5) Class49 local5 = new Class49();
		local5.anInt2058 = this.anInt2058;
		local5.aByteArray28 = new byte[this.anInt2058];
		for (@Pc(25) int local25 = 0; local25 < this.anInt2058; local25++) {
			local5.aByteArray28[local25] = 42;
		}
		return local5;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/awt/FontMetrics;B)I")
	public int method1655(@OriginalArg(0) FontMetrics arg0) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray28, 0, this.anInt2058, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray28, 0, this.anInt2058);
		}
		return arg0.stringWidth(local18);
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)Ljava/net/URL;")
	public URL method1656() throws MalformedURLException {
		return new URL(new String(this.aByteArray28, 0, this.anInt2058));
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[BIIB)I")
	public int method1657(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		Static191.method1826(this.aByteArray28, 0, arg1, arg0, arg2);
		return arg2;
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)Lclient!lf;")
	public Class49 method1658() {
		if (!this.aBoolean86) {
			throw new IllegalArgumentException();
		}
		this.anInt2025 = 0;
		if (this.aByteArray28.length != this.anInt2058) {
			@Pc(28) byte[] local28 = new byte[this.anInt2058];
			Static191.method1826(this.aByteArray28, 0, local28, 0, this.anInt2058);
			this.aByteArray28 = local28;
		}
		return this;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	public void method1659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2) {
		@Pc(9) String local9;
		try {
			local9 = new String(this.aByteArray28, 0, this.anInt2058, "ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = new String(this.aByteArray28, 0, this.anInt2058);
		}
		arg2.drawString(local9, arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(BLclient!lf;)Z")
	public boolean method1660(@OriginalArg(1) Class49 arg0) {
		if (arg0.anInt2058 > this.anInt2058) {
			return false;
		}
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2058; local25++) {
			if (arg0.aByteArray28[local25] != this.aByteArray28[local25]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)Lclient!lf;")
	public Class49 method1661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class49 local3 = new Class49();
		local3.aByteArray28 = new byte[arg0 - arg1];
		local3.anInt2058 = arg0 - arg1;
		Static191.method1826(this.aByteArray28, arg1, local3.aByteArray28, 0, local3.anInt2058);
		return local3;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Lclient!lf;I)Lclient!lf;")
	public Class49 method1662(@OriginalArg(0) Class49 arg0) {
		if (!this.aBoolean86) {
			throw new IllegalArgumentException();
		}
		this.anInt2025 = 0;
		if (this.aByteArray28.length < this.anInt2058 + arg0.anInt2058) {
			@Pc(35) int local35;
			for (local35 = 1; local35 < this.anInt2058 + arg0.anInt2058; local35 += local35) {
			}
			@Pc(52) byte[] local52 = new byte[local35];
			Static191.method1826(this.aByteArray28, 0, local52, 0, this.anInt2058);
			this.aByteArray28 = local52;
		}
		Static191.method1826(arg0.aByteArray28, 0, this.aByteArray28, this.anInt2058, arg0.anInt2058);
		this.anInt2058 += arg0.anInt2058;
		return this;
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(Z)Lclient!lf;")
	public Class49 method1664() {
		@Pc(14) Class49 local14 = Static120.method2046(this.method1651());
		return local14 == null ? Static144.aClass49_1384 : local14;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)Lclient!lf;")
	public Class49 method1665(@OriginalArg(1) int arg0) {
		return this.method1661(this.anInt2058, arg0);
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(Lclient!lf;I)I")
	public int method1666(@OriginalArg(0) Class49 arg0) {
		return this.method1671(0, arg0);
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(II)Lclient!lf;")
	public Class49 method1667(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(27) Class49 local27 = new Class49();
		local27.aByteArray28 = new byte[this.anInt2058 + 1];
		local27.anInt2058 = this.anInt2058 + 1;
		Static191.method1826(this.aByteArray28, 0, local27.aByteArray28, 0, this.anInt2058);
		local27.aByteArray28[this.anInt2058] = (byte) arg0;
		return local27;
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(Lclient!lf;I)Z")
	public boolean method1668(@OriginalArg(0) Class49 arg0) {
		if (this.anInt2058 < arg0.anInt2058) {
			return false;
		}
		@Pc(19) int local19 = this.anInt2058 - arg0.anInt2058;
		for (@Pc(21) int local21 = 0; local21 < arg0.anInt2058; local21++) {
			if (this.aByteArray28[local21 + local19] != arg0.aByteArray28[local21]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(II)Lclient!lf;")
	public Class49 method1669(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean86) {
			this.anInt2025 = 0;
			if (this.aByteArray28.length == this.anInt2058) {
				@Pc(50) int local50;
				for (local50 = 1; local50 <= this.anInt2058; local50 += local50) {
				}
				@Pc(67) byte[] local67 = new byte[local50];
				Static191.method1826(this.aByteArray28, 0, local67, 0, this.anInt2058);
				this.aByteArray28 = local67;
			}
			this.aByteArray28[this.anInt2058++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "(I)I")
	public int method1670() {
		@Pc(1) int local1 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2058; local12++) {
			local1 = (local1 << 5) + (this.aByteArray28[local12] & 0xFF) - local1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!lf", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class49)) {
			throw new IllegalArgumentException();
		}
		return this.method1676((Class49) arg0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILclient!lf;)I")
	public int method1671(@OriginalArg(1) int arg0, @OriginalArg(2) Class49 arg1) {
		@Pc(9) int[] local9 = new int[arg1.anInt2058];
		@Pc(12) int[] local12 = new int[256];
		@Pc(16) int[] local16 = new int[arg1.anInt2058];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			local12[local18] = arg1.anInt2058;
		}
		for (@Pc(36) int local36 = 1; local36 <= arg1.anInt2058; local36++) {
			local9[local36 - 1] = (arg1.anInt2058 << 1) - local36;
			local12[arg1.aByteArray28[local36 - 1] & 0xFF] = arg1.anInt2058 - local36;
		}
		@Pc(77) int local77 = arg1.anInt2058 + 1;
		for (@Pc(80) int local80 = arg1.anInt2058; local80 > 0; local80--) {
			local16[local80 - 1] = local77;
			while (arg1.anInt2058 >= local77 && arg1.aByteArray28[local80 - 1] != arg1.aByteArray28[local77 - 1]) {
				if (arg1.anInt2058 - local80 <= local9[local77 - 1]) {
					local9[local77 - 1] = arg1.anInt2058 - local80;
				}
				local77 = local16[local77 - 1];
			}
			local77--;
		}
		@Pc(144) int local144 = 1;
		@Pc(146) int local146 = local77;
		@Pc(148) int local148 = 0;
		local77 = arg1.anInt2058 + 1 - local77;
		for (@Pc(157) int local157 = 1; local157 <= local77; local157++) {
			local16[local157 - 1] = local148;
			while (local148 >= 1 && arg1.aByteArray28[local148 - 1] != arg1.aByteArray28[local157 - 1]) {
				local148 = local16[local148 - 1];
			}
			local148++;
		}
		@Pc(198) int local198;
		while (local146 < arg1.anInt2058) {
			for (local198 = local144; local198 <= local146; local198++) {
				if (arg1.anInt2058 + local146 - local198 <= local9[local198 + -1]) {
					local9[local198 - 1] = local146 + arg1.anInt2058 - local198;
				}
			}
			local144 = local146 + 1;
			local146 = local77 + local146 - local16[local77 - 1];
			local77 = local16[local77 - 1];
		}
		@Pc(272) int local272;
		for (local198 = arg1.anInt2058 + arg0 - 1; local198 < this.anInt2058; local198 += Math.max(local12[this.aByteArray28[local198] & 0xFF], local9[local272])) {
			for (local272 = arg1.anInt2058 - 1; local272 >= 0 && this.aByteArray28[local198] == arg1.aByteArray28[local272]; local272--) {
				local198--;
			}
			if (local272 == -1) {
				return local198 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "(I)J")
	private long method1672() {
		@Pc(1) long local1 = 0L;
		for (@Pc(15) int local15 = 0; local15 < this.anInt2058; local15++) {
			local1 = (local1 << 5) + (long) (this.aByteArray28[local15] & 0xFF) - local1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!lf;)I")
	public int method1673(@OriginalArg(1) Class49 arg0) {
		@Pc(13) int local13;
		if (arg0.anInt2058 < this.anInt2058) {
			local13 = arg0.anInt2058;
		} else {
			local13 = this.anInt2058;
		}
		for (@Pc(25) int local25 = 0; local25 < local13; local25++) {
			if (Static38.anIntArray84[this.aByteArray28[local25] & 0xFF] < Static38.anIntArray84[arg0.aByteArray28[local25] & 0xFF]) {
				return -1;
			}
			if (Static38.anIntArray84[arg0.aByteArray28[local25] & 0xFF] < Static38.anIntArray84[this.aByteArray28[local25] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt2058 < arg0.anInt2058) {
			return -1;
		} else if (this.anInt2058 > arg0.anInt2058) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)[B")
	public byte[] method1674() {
		@Pc(8) byte[] local8 = new byte[this.anInt2058];
		Static191.method1826(this.aByteArray28, 0, local8, 0, this.anInt2058);
		return local8;
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)Lclient!lf;")
	public Class49 method1675() {
		@Pc(5) Class49 local5 = new Class49();
		@Pc(16) byte local16 = 2;
		local5.anInt2058 = this.anInt2058;
		local5.aByteArray28 = new byte[this.anInt2058];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2058; local27++) {
			@Pc(34) byte local34 = this.aByteArray28[local27];
			if (local34 >= 97 && local34 <= 122 || local34 >= -32 && local34 <= -2 && local34 != -9) {
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
			local5.aByteArray28[local27] = local34;
		}
		return local5;
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(Lclient!lf;I)Z")
	public boolean method1676(@OriginalArg(0) Class49 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2058 == arg0.anInt2058) {
			if (!this.aBoolean86 || !arg0.aBoolean86) {
				if (this.anInt2025 == 0) {
					this.anInt2025 = this.method1670();
					if (this.anInt2025 == 0) {
						this.anInt2025 = 1;
					}
				}
				if (arg0.anInt2025 == 0) {
					arg0.anInt2025 = arg0.method1670();
					if (arg0.anInt2025 == 0) {
						arg0.anInt2025 = 1;
					}
				}
				if (this.anInt2025 != arg0.anInt2025) {
					return false;
				}
			}
			for (@Pc(73) int local73 = 0; local73 < this.anInt2058; local73++) {
				if (this.aByteArray28[local73] != arg0.aByteArray28[local73]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(Z)Lclient!lf;")
	public Class49 method1677() {
		@Pc(9) Class49 local9 = new Class49();
		local9.anInt2058 = this.anInt2058;
		local9.aByteArray28 = new byte[this.anInt2058];
		@Pc(20) boolean local20 = true;
		for (@Pc(22) int local22 = 0; local22 < this.anInt2058; local22++) {
			@Pc(29) byte local29 = this.aByteArray28[local22];
			if (local29 == 95) {
				local20 = true;
				local9.aByteArray28[local22] = 32;
			} else if (local29 >= 97 && local29 <= 122 && local20) {
				local9.aByteArray28[local22] = (byte) (local29 - 32);
				local20 = false;
			} else {
				local20 = false;
				local9.aByteArray28[local22] = local29;
			}
		}
		return local9;
	}
}
