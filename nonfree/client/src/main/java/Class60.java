import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class60 implements Interface1 {

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
	public int anInt2310;

	@OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
	private int anInt2320;

	@OriginalMember(owner = "client!qc", name = "P", descriptor = "Z")
	private boolean aBoolean106 = true;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)I")
	public int method1634(@OriginalArg(0) int arg0) {
		return this.aByteArray89[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)I")
	private int method1635(@OriginalArg(1) int arg0) {
		@Pc(8) byte local8 = (byte) arg0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt2310; local17++) {
			if (local8 == this.aByteArray89[local17]) {
				return local17;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)J")
	private long method1636() {
		@Pc(5) long local5 = 0L;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2310; local12++) {
			local5 = (local5 << 5) - (local5 - (long) (this.aByteArray89[local12] & 0xFF));
		}
		return local5;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Lclient!qc;")
	public Class60 method1637() {
		@Pc(5) long local5 = this.method1636();
		@Pc(18) Class local18 = qc.class;
		synchronized (qc.class) {
			@Pc(34) Class4_Sub8 local34;
			if (Static130.aClass66_14 == null) {
				Static130.aClass66_14 = new Class66(4096);
			} else {
				for (local34 = (Class4_Sub8) Static130.aClass66_14.method1834(local5); local34 != null; local34 = (Class4_Sub8) Static130.aClass66_14.method1839()) {
					if (this.method1660(local34.aClass60_330)) {
						return local34.aClass60_330;
					}
				}
			}
			local34 = new Class4_Sub8();
			local34.aClass60_330 = this;
			this.aBoolean106 = false;
			Static130.aClass66_14.method1830(local34, local5);
			return this;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)Lclient!qc;")
	public Class60 method1638(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(28) Class60 local28 = new Class60();
		local28.aByteArray89 = new byte[this.anInt2310 + 1];
		local28.anInt2310 = this.anInt2310 + 1;
		Static135.method1053(this.aByteArray89, 0, local28.aByteArray89, 0, this.anInt2310);
		local28.aByteArray89[this.anInt2310] = (byte) arg0;
		return local28;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)I")
	public int method1639() {
		return this.method1654(10);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)I")
	public int method1640() {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2310; local12++) {
			local10 = (local10 << 5) + (this.aByteArray89[local12] & 0xFF) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!qc", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class60)) {
			throw new IllegalArgumentException();
		}
		return this.method1660((Class60) arg0);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZLclient!qc;)I")
	private int method1641(@OriginalArg(2) Class60 arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(12) int[] local12 = new int[arg0.anInt2310];
		@Pc(16) int[] local16 = new int[arg0.anInt2310];
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			local8[local18] = arg0.anInt2310;
		}
		for (@Pc(32) int local32 = 1; local32 <= arg0.anInt2310; local32++) {
			local12[local32 - 1] = (arg0.anInt2310 << 1) - local32;
			local8[arg0.aByteArray89[local32 - 1] & 0xFF] = arg0.anInt2310 - local32;
		}
		@Pc(74) int local74 = arg0.anInt2310 + 1;
		@Pc(77) int local77 = arg0.anInt2310;
		while (local77 > 0) {
			local16[local77 - 1] = local74;
			while (local74 <= arg0.anInt2310 && arg0.aByteArray89[local74 - 1] != arg0.aByteArray89[local77 - 1]) {
				if (local12[local74 - 1] >= arg0.anInt2310 - local77) {
					local12[local74 - 1] = arg0.anInt2310 - local77;
				}
				local74 = local16[local74 - 1];
			}
			local77--;
			local74--;
		}
		@Pc(137) int local137 = 1;
		@Pc(139) int local139 = 0;
		@Pc(141) int local141 = local74;
		local74 = arg0.anInt2310 + 1 - local74;
		for (@Pc(151) int local151 = 1; local151 <= local74; local151++) {
			local16[local151 - 1] = local139;
			while (local139 >= 1 && arg0.aByteArray89[local139 - 1] != arg0.aByteArray89[local151 - 1]) {
				local139 = local16[local139 - 1];
			}
			local139++;
		}
		@Pc(203) int local203;
		while (local141 < arg0.anInt2310) {
			for (local203 = local137; local203 <= local141; local203++) {
				if (arg0.anInt2310 + local141 - local203 <= local12[local203 - 1]) {
					local12[local203 - 1] = arg0.anInt2310 + local141 - local203;
				}
			}
			local137 = local141 + 1;
			local141 = local74 + local141 - local16[local74 - 1];
			local74 = local16[local74 - 1];
		}
		@Pc(283) int local283;
		for (local203 = arg0.anInt2310 - 1; local203 < this.anInt2310; local203 += Math.max(local8[this.aByteArray89[local203] & 0xFF], local12[local283])) {
			for (local283 = arg0.anInt2310 - 1; local283 >= 0 && arg0.aByteArray89[local283] == this.aByteArray89[local203]; local283--) {
				local203--;
			}
			if (local283 == -1) {
				return local203 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)Ljava/net/URL;")
	public URL method1642() throws MalformedURLException {
		return new URL(new String(this.aByteArray89, 0, this.anInt2310));
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLclient!qc;)I")
	public int method1643(@OriginalArg(1) Class60 arg0) {
		@Pc(25) int local25;
		if (this.anInt2310 <= arg0.anInt2310) {
			local25 = this.anInt2310;
		} else {
			local25 = arg0.anInt2310;
		}
		for (@Pc(32) int local32 = 0; local32 < local25; local32++) {
			if ((arg0.aByteArray89[local32] & 0xFF) > (this.aByteArray89[local32] & 0xFF)) {
				return -1;
			}
			if ((arg0.aByteArray89[local32] & 0xFF) < (this.aByteArray89[local32] & 0xFF)) {
				return 1;
			}
		}
		if (arg0.anInt2310 > this.anInt2310) {
			return -1;
		} else if (this.anInt2310 > arg0.anInt2310) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)I")
	public int method1644() {
		return this.anInt2310;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)Lclient!qc;")
	public Class60 method1645() {
		@Pc(5) Class60 local5 = new Class60();
		local5.anInt2310 = this.anInt2310;
		local5.aByteArray89 = new byte[this.anInt2310];
		for (@Pc(20) int local20 = 0; local20 < this.anInt2310; local20++) {
			@Pc(27) byte local27 = this.aByteArray89[local20];
			if (local27 >= 65 && local27 <= 90 || local27 >= -64 && local27 <= -34 && local27 != -41) {
				local27 = (byte) (local27 + 32);
			}
			local5.aByteArray89[local20] = local27;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!qc;B)Z")
	public boolean method1646(@OriginalArg(0) Class60 arg0) {
		if (this.anInt2310 < arg0.anInt2310) {
			return false;
		}
		for (@Pc(23) int local23 = 0; local23 < arg0.anInt2310; local23++) {
			if (this.aByteArray89[local23] != arg0.aByteArray89[local23]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)Lclient!qc;")
	public Class60 method1647() {
		@Pc(14) Class60 local14 = new Class60();
		local14.anInt2310 = this.anInt2310;
		local14.aByteArray89 = new byte[this.anInt2310];
		for (@Pc(25) int local25 = 0; local25 < this.anInt2310; local25++) {
			local14.aByteArray89[local25] = 42;
		}
		return local14;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)Z")
	private boolean method1648() {
		@Pc(3) boolean local3 = false;
		@Pc(9) boolean local9 = false;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anInt2310; local25++) {
			@Pc(34) int local34 = this.aByteArray89[local25] & 0xFF;
			if (local25 == 0) {
				if (local34 == 45) {
					local3 = true;
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
				return false;
			}
			if (local34 >= 10) {
				return false;
			}
			if (local3) {
				local34 = -local34;
			}
			@Pc(103) int local103 = local23 * 10 + local34;
			if (local103 / 10 != local23) {
				return false;
			}
			local9 = true;
			local23 = local103;
		}
		return local9;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(BLclient!qc;)I")
	public int method1649(@OriginalArg(1) Class60 arg0) {
		return this.method1641(arg0);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
	public void method1650(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) String local17;
		try {
			local17 = new String(this.aByteArray89, 0, this.anInt2310, "ISO-8859-1");
		} catch (@Pc(19) UnsupportedEncodingException local19) {
			local17 = new String(this.aByteArray89, 0, this.anInt2310);
		}
		arg0.drawString(local17, arg2, arg1);
	}

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)Lclient!qc;")
	public Class60 method1651() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class60 local11 = new Class60();
		local11.anInt2310 = this.anInt2310;
		local11.aByteArray89 = new byte[this.anInt2310];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2310; local27++) {
			@Pc(34) byte local34 = this.aByteArray89[local27];
			if (local34 == 95) {
				local11.aByteArray89[local27] = 32;
				local7 = true;
			} else if (local34 >= 97 && local34 <= 122 && local7) {
				local7 = false;
				local11.aByteArray89[local27] = (byte) (local34 - 32);
			} else {
				local11.aByteArray89[local27] = local34;
				local7 = false;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "(I)Lclient!qc;")
	public Class60 method1652() {
		if (!this.aBoolean106) {
			throw new IllegalArgumentException();
		}
		this.anInt2320 = 0;
		if (this.anInt2310 != this.aByteArray89.length) {
			@Pc(28) byte[] local28 = new byte[this.anInt2310];
			Static135.method1053(this.aByteArray89, 0, local28, 0, this.anInt2310);
			this.aByteArray89 = local28;
		}
		return this;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLjava/awt/FontMetrics;)I")
	public int method1653(@OriginalArg(1) FontMetrics arg0) {
		@Pc(18) String local18;
		try {
			local18 = new String(this.aByteArray89, 0, this.anInt2310, "ISO-8859-1");
		} catch (@Pc(20) UnsupportedEncodingException local20) {
			local18 = new String(this.aByteArray89, 0, this.anInt2310);
		}
		return arg0.stringWidth(local18);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)I")
	public int method1654(@OriginalArg(0) int arg0) {
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = 0; local33 < this.anInt2310; local33++) {
			@Pc(42) int local42 = this.aByteArray89[local33] & 0xFF;
			if (local33 == 0) {
				if (local42 == 45) {
					local27 = true;
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
				throw new NumberFormatException();
			}
			if (arg0 <= local42) {
				throw new NumberFormatException();
			}
			if (local27) {
				local42 = -local42;
			}
			@Pc(118) int local118 = arg0 * local31 + local42;
			if (local118 / arg0 != local31) {
				throw new NumberFormatException();
			}
			local31 = local118;
			local29 = true;
		}
		if (!local29) {
			throw new NumberFormatException();
		}
		return local31;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)[B")
	public byte[] method1655() {
		@Pc(13) byte[] local13 = new byte[this.anInt2310];
		Static135.method1053(this.aByteArray89, 0, local13, 0, this.anInt2310);
		return local13;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(II)I")
	public int method1656(@OriginalArg(0) int arg0) {
		return this.method1635(arg0);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIZ)Lclient!qc;")
	public Class60 method1657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class60 local12 = new Class60();
		local12.anInt2310 = arg0 - arg1;
		local12.aByteArray89 = new byte[arg0 - arg1];
		Static135.method1053(this.aByteArray89, arg1, local12.aByteArray89, 0, local12.anInt2310);
		return local12;
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(II)Lclient!qc;")
	public Class60 method1658(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char:" + arg0);
		} else if (this.aBoolean106) {
			this.anInt2320 = 0;
			if (this.anInt2310 == this.aByteArray89.length) {
				@Pc(41) int local41;
				for (local41 = 1; local41 <= this.anInt2310; local41 += local41) {
				}
				@Pc(58) byte[] local58 = new byte[local41];
				Static135.method1053(this.aByteArray89, 0, local58, 0, this.anInt2310);
				this.aByteArray89 = local58;
			}
			this.aByteArray89[this.anInt2310++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1640();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!qc;Z)Lclient!qc;")
	public Class60 method1659(@OriginalArg(0) Class60 arg0) {
		if (!this.aBoolean106) {
			throw new IllegalArgumentException();
		}
		this.anInt2320 = 0;
		if (this.aByteArray89.length < this.anInt2310 + arg0.anInt2310) {
			@Pc(25) int local25;
			for (local25 = 1; local25 < arg0.anInt2310 + this.anInt2310; local25 += local25) {
			}
			@Pc(44) byte[] local44 = new byte[local25];
			Static135.method1053(this.aByteArray89, 0, local44, 0, this.anInt2310);
			this.aByteArray89 = local44;
		}
		Static135.method1053(arg0.aByteArray89, 0, this.aByteArray89, this.anInt2310, arg0.anInt2310);
		this.anInt2310 += arg0.anInt2310;
		return this;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(BLclient!qc;)Z")
	public boolean method1660(@OriginalArg(1) Class60 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2310 == arg0.anInt2310) {
			if (!this.aBoolean106 || !arg0.aBoolean106) {
				if (this.anInt2320 == 0) {
					this.anInt2320 = this.method1640();
					if (this.anInt2320 == 0) {
						this.anInt2320 = 1;
					}
				}
				if (arg0.anInt2320 == 0) {
					arg0.anInt2320 = arg0.method1640();
					if (arg0.anInt2320 == 0) {
						arg0.anInt2320 = 1;
					}
				}
				if (this.anInt2320 != arg0.anInt2320) {
					return false;
				}
			}
			for (@Pc(82) int local82 = 0; local82 < this.anInt2310; local82++) {
				if (this.aByteArray89[local82] != arg0.aByteArray89[local82]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(BLclient!qc;)Z")
	public boolean method1661(@OriginalArg(1) Class60 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt2310 == this.anInt2310) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt2310; local22++) {
				@Pc(29) byte local29 = this.aByteArray89[local22];
				if (local29 >= 65 && local29 <= 90 || local29 >= -64 && local29 <= -34 && local29 != -41) {
					local29 = (byte) (local29 + 32);
				}
				@Pc(54) byte local54 = arg0.aByteArray89[local22];
				if (local54 >= 65 && local54 <= 90 || local54 >= -64 && local54 <= -34 && local54 != -41) {
					local54 = (byte) (local54 + 32);
				}
				if (local29 != local54) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(II)Lclient!qc;")
	public Class60 method1662(@OriginalArg(0) int arg0) {
		return this.method1657(this.anInt2310, arg0);
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)Lclient!qc;")
	public Class60 method1663() {
		@Pc(9) Class60 local9 = new Class60();
		@Pc(11) byte local11 = 2;
		local9.anInt2310 = this.anInt2310;
		local9.aByteArray89 = new byte[this.anInt2310];
		for (@Pc(22) int local22 = 0; local22 < this.anInt2310; local22++) {
			@Pc(29) byte local29 = this.aByteArray89[local22];
			if (local29 >= 97 && local29 <= 122 || !(local29 < -32 || local29 > -2 || local29 == -9)) {
				if (local11 == 2) {
					local29 = (byte) (local29 - 32);
				}
				local11 = 0;
			} else if (local29 >= 65 && local29 <= 90 || !(local29 < -64 || local29 > -34 || local29 == -41)) {
				if (local11 == 0) {
					local29 = (byte) (local29 + 32);
				}
				local11 = 0;
			} else if (local29 == 46 || local29 == 33 || local29 == 63) {
				local11 = 2;
			} else if (local29 != 32) {
				local11 = 1;
			} else if (local11 != 2) {
				local11 = 1;
			}
			local9.aByteArray89[local22] = local29;
		}
		return local9;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II[BZI)I")
	public int method1664(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2) {
		Static135.method1053(this.aByteArray89, 0, arg1, arg0, arg2);
		return arg2;
	}

	@OriginalMember(owner = "client!qc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "(I)J")
	public long method1665() {
		@Pc(8) long local8 = (long) 0;
		for (@Pc(10) int local10 = 0; this.anInt2310 > local10 && local10 < 12; local10++) {
			local8 *= 37L;
			@Pc(21) byte local21 = this.aByteArray89[local10];
			if (local21 >= 65 && local21 <= 90) {
				local8 += local21 + 1 - 65;
			} else if (local21 >= 97 && local21 <= 122) {
				local8 += local21 + 1 - 97;
			} else if (local21 >= 48 && local21 <= 57) {
				local8 += local21 + 27 - 48;
			}
		}
		while (local8 % 37L == 0L && local8 != 0L) {
			local8 /= 37L;
		}
		return local8;
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)Lclient!qc;")
	public Class60 method1666() {
		@Pc(4) int local4 = this.anInt2310;
		@Pc(10) int local10;
		for (local10 = 0; local10 < this.anInt2310 && (this.aByteArray89[local10] >= 0 && this.aByteArray89[local10] <= 32 || (this.aByteArray89[local10] & 0xFF) == 160); local10++) {
		}
		while (local10 < local4 && (this.aByteArray89[local4 - 1] >= 0 && this.aByteArray89[local4 - 1] <= 32 || (this.aByteArray89[local4 - 1] & 0xFF) == 160)) {
			local4--;
		}
		if (local10 == 0 && local4 == this.anInt2310) {
			return this;
		}
		@Pc(101) Class60 local101 = new Class60();
		local101.anInt2310 = local4 - local10;
		local101.aByteArray89 = new byte[local101.anInt2310];
		for (@Pc(114) int local114 = 0; local114 < local101.anInt2310; local114++) {
			local101.aByteArray89[local114] = this.aByteArray89[local114 + local10];
		}
		return local101;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)Lclient!qc;")
	public Class60 method1668() {
		@Pc(9) Class60 local9 = new Class60();
		local9.aByteArray89 = new byte[12];
		local9.anInt2310 = 0;
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.anInt2310; local20++) {
			if (this.aByteArray89[local20] >= 65 && this.aByteArray89[local20] <= 90) {
				local9.aByteArray89[local18++] = (byte) (this.aByteArray89[local20] + 97 - 65);
				local9.anInt2310 = local18;
			} else if (this.aByteArray89[local20] >= 97 && this.aByteArray89[local20] <= 122 || this.aByteArray89[local20] >= 48 && this.aByteArray89[local20] <= 57) {
				local9.aByteArray89[local18++] = this.aByteArray89[local20];
				local9.anInt2310 = local18;
			} else if (local18 > 0) {
				local9.aByteArray89[local18++] = 95;
			}
			if (local18 == 12) {
				break;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLclient!qc;)I")
	public int method1669(@OriginalArg(1) Class60 arg0) {
		@Pc(9) int local9;
		if (arg0.anInt2310 < this.anInt2310) {
			local9 = arg0.anInt2310;
		} else {
			local9 = this.anInt2310;
		}
		for (@Pc(20) int local20 = 0; local20 < local9; local20++) {
			if (Static131.anIntArray340[arg0.aByteArray89[local20] & 0xFF] > Static131.anIntArray340[this.aByteArray89[local20] & 0xFF]) {
				return -1;
			}
			if (Static131.anIntArray340[arg0.aByteArray89[local20] & 0xFF] < Static131.anIntArray340[this.aByteArray89[local20] & 0xFF]) {
				return 1;
			}
		}
		if (this.anInt2310 < arg0.anInt2310) {
			return -1;
		} else if (this.anInt2310 > arg0.anInt2310) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!qc;I)Z")
	public boolean method1670(@OriginalArg(0) Class60 arg0) {
		if (arg0.anInt2310 > this.anInt2310) {
			return false;
		}
		@Pc(23) int local23 = this.anInt2310 - arg0.anInt2310;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2310; local25++) {
			if (arg0.aByteArray89[local25] != this.aByteArray89[local23 + local25]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "(I)Z")
	public boolean method1671() {
		return this.method1648();
	}
}
