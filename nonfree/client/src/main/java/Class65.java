import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class65 implements Interface4 {

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
	private int anInt2875;

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
	public int anInt2878;

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "[B")
	public byte[] aByteArray70;

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "Z")
	private boolean aBoolean157 = true;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)I")
	public int method1755() {
		return this.method1763();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)J")
	private long method1756() {
		@Pc(5) long local5 = 0L;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2878; local7++) {
			local5 = (long) (this.aByteArray70[local7] & 0xFF) + (local5 << 5) - local5;
		}
		return local5;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
	public void method1758(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray70, 0, this.anInt2878, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray70, 0, this.anInt2878);
		}
		arg1.drawString(local13, arg0, arg2);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)I")
	public int method1759() {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anInt2878; local3++) {
			local1 = (this.aByteArray70[local3] & 0xFF) + (local1 << 5) - local1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)I")
	public int method1760() {
		return this.anInt2878;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)Lclient!wb;")
	public Class65 method1761() {
		@Pc(12) long local12 = this.method1756();
		@Pc(21) Class local21 = wb.class;
		synchronized (wb.class) {
			@Pc(31) Class2_Sub7 local31;
			if (Static97.aClass7_5 == null) {
				Static97.aClass7_5 = new Class7(4096);
			} else {
				for (local31 = (Class2_Sub7) Static97.aClass7_5.method165(local12); local31 != null; local31 = (Class2_Sub7) Static97.aClass7_5.method164()) {
					if (this.method1781(local31.aClass65_386)) {
						return local31.aClass65_386;
					}
				}
			}
			local31 = new Class2_Sub7();
			this.aBoolean157 = false;
			local31.aClass65_386 = this;
			Static97.aClass7_5.method167(local12, local31);
			return this;
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)Z")
	public boolean method1762() {
		return this.method1770();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)I")
	private int method1763() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(21) int local21 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt2878; local28++) {
			@Pc(37) int local37 = this.aByteArray70[local28] & 0xFF;
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
			if (local37 >= 10) {
				throw new NumberFormatException();
			}
			if (local7) {
				local37 = -local37;
			}
			@Pc(109) int local109 = local37 + local21 * 10;
			if (local109 / 10 != local21) {
				throw new NumberFormatException();
			}
			local9 = true;
			local21 = local109;
		}
		if (!local9) {
			throw new NumberFormatException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!wb;I)I")
	private int method1764(@OriginalArg(1) Class65 arg0) {
		@Pc(6) int[] local6 = new int[256];
		@Pc(10) int[] local10 = new int[arg0.anInt2878];
		@Pc(14) int[] local14 = new int[arg0.anInt2878];
		for (@Pc(16) int local16 = 0; local16 < local6.length; local16++) {
			local6[local16] = arg0.anInt2878;
		}
		for (@Pc(29) int local29 = 1; local29 <= arg0.anInt2878; local29++) {
			local10[local29 - 1] = (arg0.anInt2878 << 1) - local29;
			local6[arg0.aByteArray70[local29 - 1] & 0xFF] = arg0.anInt2878 - local29;
		}
		@Pc(71) int local71 = arg0.anInt2878 + 1;
		@Pc(74) int local74 = arg0.anInt2878;
		while (local74 > 0) {
			local14[local74 - 1] = local71;
			while (arg0.anInt2878 >= local71 && arg0.aByteArray70[local71 - 1] != arg0.aByteArray70[local74 - 1]) {
				if (local10[local71 - 1] >= arg0.anInt2878 - local74) {
					local10[local71 - 1] = arg0.anInt2878 - local74;
				}
				local71 = local14[local71 - 1];
			}
			local74--;
			local71--;
		}
		@Pc(143) int local143 = local71;
		local71 = arg0.anInt2878 + 1 - local71;
		@Pc(153) int local153 = 0;
		@Pc(155) int local155 = 1;
		while (local71 >= local155) {
			local14[local155 - 1] = local153;
			while (local153 >= 1 && arg0.aByteArray70[local153 - 1] != arg0.aByteArray70[local155 - 1]) {
				local153 = local14[local153 - 1];
			}
			local155++;
			local153++;
		}
		@Pc(196) int local196 = 1;
		@Pc(199) int local199;
		while (arg0.anInt2878 > local143) {
			for (local199 = local196; local199 <= local143; local199++) {
				if (local10[local199 - 1] >= arg0.anInt2878 + local143 - local199) {
					local10[local199 - 1] = local143 + arg0.anInt2878 - local199;
				}
			}
			local196 = local143 + 1;
			local143 = local143 + local71 - local14[local71 - 1];
			local71 = local14[local71 - 1];
		}
		@Pc(272) int local272;
		for (local199 = arg0.anInt2878 - 1; local199 < this.anInt2878; local199 += Math.max(local6[this.aByteArray70[local199] & 0xFF], local10[local272])) {
			for (local272 = arg0.anInt2878 - 1; local272 >= 0 && this.aByteArray70[local199] == arg0.aByteArray70[local272]; local272--) {
				local199--;
			}
			if (local272 == -1) {
				return local199 + 1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(B)[B")
	public byte[] method1765() {
		@Pc(14) byte[] local14 = new byte[this.anInt2878];
		Static118.method1745(this.aByteArray70, 0, local14, 0, this.anInt2878);
		return local14;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)I")
	public int method1766(@OriginalArg(1) int arg0) {
		return this.aByteArray70[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)I")
	public int method1767() {
		return this.method1780();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!wb;)Lclient!wb;")
	public Class65 method1768(@OriginalArg(1) Class65 arg0) {
		if (!this.aBoolean157) {
			throw new IllegalArgumentException();
		}
		this.anInt2875 = 0;
		if (this.aByteArray70.length < this.anInt2878 + arg0.anInt2878) {
			@Pc(26) int local26;
			for (local26 = 1; local26 < this.anInt2878 + arg0.anInt2878; local26 += local26) {
			}
			@Pc(46) byte[] local46 = new byte[local26];
			Static118.method1745(this.aByteArray70, 0, local46, 0, this.anInt2878);
			this.aByteArray70 = local46;
		}
		Static118.method1745(arg0.aByteArray70, 0, this.aByteArray70, this.anInt2878, arg0.anInt2878);
		this.anInt2878 += arg0.anInt2878;
		return this;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(B)Lclient!wb;")
	public Class65 method1769() {
		@Pc(3) int local3;
		for (local3 = 0; this.anInt2878 > local3 && (this.aByteArray70[local3] >= 0 && this.aByteArray70[local3] <= 32 || (this.aByteArray70[local3] & 0xFF) == 160); local3++) {
		}
		@Pc(38) int local38;
		for (local38 = this.anInt2878; local3 < local38 && (this.aByteArray70[local38 - 1] >= 0 && this.aByteArray70[local38 - 1] <= 32 || (this.aByteArray70[local38 - 1] & 0xFF) == 160); local38--) {
		}
		if (local3 == 0 && this.anInt2878 == local38) {
			return this;
		}
		@Pc(87) Class65 local87 = new Class65();
		local87.anInt2878 = local38 - local3;
		local87.aByteArray70 = new byte[local87.anInt2878];
		for (@Pc(104) int local104 = 0; local104 < local87.anInt2878; local104++) {
			local87.aByteArray70[local104] = this.aByteArray70[local3 + local104];
		}
		return local87;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZ)Z")
	private boolean method1770() {
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anInt2878; local25++) {
			@Pc(34) int local34 = this.aByteArray70[local25] & 0xFF;
			if (local25 == 0) {
				if (local34 == 45) {
					local21 = true;
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
			if (local21) {
				local34 = -local34;
			}
			@Pc(102) int local102 = local23 * 10 + local34;
			if (local102 / 10 != local23) {
				return false;
			}
			local23 = local102;
			local19 = true;
		}
		return local19;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)Lclient!wb;")
	public Class65 method1771() {
		@Pc(3) boolean local3 = true;
		@Pc(7) Class65 local7 = new Class65();
		local7.anInt2878 = this.anInt2878;
		local7.aByteArray70 = new byte[this.anInt2878];
		for (@Pc(22) int local22 = 0; local22 < this.anInt2878; local22++) {
			@Pc(29) byte local29 = this.aByteArray70[local22];
			if (local29 >= 97 && local29 <= 122 || local29 >= -32 && local29 <= -2 && local29 != -9) {
				if (local3) {
					local29 = (byte) (local29 - 32);
				}
				local3 = false;
			} else if (local29 >= 65 && local29 <= 90 || local29 >= -64 && local29 <= -34 && local29 != -41) {
				if (!local3) {
					local29 = (byte) (local29 + 32);
				}
				local3 = false;
			}
			local7.aByteArray70[local22] = local29;
			if (local29 == 46 || local29 == 33 || local29 == 63) {
				local3 = true;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZII)Lclient!wb;")
	public Class65 method1772(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class65 local7 = new Class65();
		local7.aByteArray70 = new byte[arg0 - arg1];
		local7.anInt2878 = arg0 - arg1;
		Static118.method1745(this.aByteArray70, arg1, local7.aByteArray70, 0, local7.anInt2878);
		return local7;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)Lclient!wb;")
	public Class65 method1774() {
		if (!this.aBoolean157) {
			throw new IllegalArgumentException();
		}
		this.anInt2875 = 0;
		if (this.aByteArray70.length != this.anInt2878) {
			@Pc(23) byte[] local23 = new byte[this.anInt2878];
			Static118.method1745(this.aByteArray70, 0, local23, 0, this.anInt2878);
			this.aByteArray70 = local23;
		}
		return this;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!wb;I)I")
	public int method1775(@OriginalArg(0) Class65 arg0) {
		return this.method1764(arg0);
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)Lclient!wb;")
	public Class65 method1776() {
		@Pc(14) Class65 local14 = new Class65();
		local14.anInt2878 = this.anInt2878;
		local14.aByteArray70 = new byte[this.anInt2878];
		for (@Pc(25) int local25 = 0; local25 < this.anInt2878; local25++) {
			@Pc(32) byte local32 = this.aByteArray70[local25];
			if (local32 >= 65 && local32 <= 90 || local32 >= -64 && local32 <= -34 && local32 != -41) {
				local32 = (byte) (local32 + 32);
			}
			local14.aByteArray70[local25] = local32;
		}
		return local14;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Lclient!wb;")
	public Class65 method1778(@OriginalArg(1) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		} else if (this.aBoolean157) {
			this.anInt2875 = 0;
			if (this.aByteArray70.length == this.anInt2878) {
				@Pc(38) int local38;
				for (local38 = 1; local38 <= this.anInt2878; local38 += local38) {
				}
				@Pc(51) byte[] local51 = new byte[local38];
				Static118.method1745(this.aByteArray70, 0, local51, 0, this.anInt2878);
				this.aByteArray70 = local51;
			}
			this.aByteArray70[this.anInt2878++] = (byte) arg0;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(IZ)Lclient!wb;")
	public Class65 method1779(@OriginalArg(0) int arg0) {
		return this.method1772(this.anInt2878, arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIB)I")
	private int method1780() {
		for (@Pc(10) int local10 = 0; local10 < this.anInt2878; local10++) {
			if (this.aByteArray70[local10] == 32) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Lclient!wb;I)Z")
	public boolean method1781(@OriginalArg(0) Class65 arg0) {
		if (arg0 == null) {
			return false;
		} else if (this.anInt2878 == arg0.anInt2878) {
			if (!this.aBoolean157 || !arg0.aBoolean157) {
				if (this.anInt2875 == 0) {
					this.anInt2875 = this.method1759();
					if (this.anInt2875 == 0) {
						this.anInt2875 = 1;
					}
				}
				if (arg0.anInt2875 == 0) {
					arg0.anInt2875 = arg0.method1759();
					if (arg0.anInt2875 == 0) {
						arg0.anInt2875 = 1;
					}
				}
				if (this.anInt2875 != arg0.anInt2875) {
					return false;
				}
			}
			for (@Pc(78) int local78 = 0; local78 < this.anInt2878; local78++) {
				if (arg0.aByteArray70[local78] != this.aByteArray70[local78]) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wb", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)Lclient!wb;")
	public Class65 method1782() {
		@Pc(14) Class65 local14 = new Class65();
		local14.anInt2878 = this.anInt2878;
		local14.aByteArray70 = new byte[this.anInt2878];
		for (@Pc(25) int local25 = 0; local25 < this.anInt2878; local25++) {
			local14.aByteArray70[local25] = 42;
		}
		return local14;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(ILclient!wb;)Z")
	public boolean method1783(@OriginalArg(1) Class65 arg0) {
		if (arg0.anInt2878 > this.anInt2878) {
			return false;
		}
		for (@Pc(23) int local23 = 0; local23 < arg0.anInt2878; local23++) {
			if (arg0.aByteArray70[local23] != this.aByteArray70[local23]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wb", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method1759();
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(ILclient!wb;)Z")
	public boolean method1784(@OriginalArg(1) Class65 arg0) {
		if (arg0.anInt2878 > this.anInt2878) {
			return false;
		}
		@Pc(23) int local23 = this.anInt2878 - arg0.anInt2878;
		for (@Pc(30) int local30 = 0; local30 < arg0.anInt2878; local30++) {
			if (this.aByteArray70[local30 + local23] != arg0.aByteArray70[local30]) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
	public int method1785(@OriginalArg(1) FontMetrics arg0) {
		@Pc(13) String local13;
		try {
			local13 = new String(this.aByteArray70, 0, this.anInt2878, "ISO-8859-1");
		} catch (@Pc(15) UnsupportedEncodingException local15) {
			local13 = new String(this.aByteArray70, 0, this.anInt2878);
		}
		return arg0.stringWidth(local13);
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)Lclient!wb;")
	public Class65 method1786() {
		@Pc(5) Class65 local5 = new Class65();
		local5.anInt2878 = 0;
		local5.aByteArray70 = new byte[12];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.anInt2878; local20++) {
			if (this.aByteArray70[local20] >= 65 && this.aByteArray70[local20] <= 90) {
				local5.aByteArray70[local18++] = (byte) (this.aByteArray70[local20] + 97 - 65);
				local5.anInt2878 = local18;
			} else if (this.aByteArray70[local20] >= 97 && this.aByteArray70[local20] <= 122 || this.aByteArray70[local20] >= 48 && this.aByteArray70[local20] <= 57) {
				local5.aByteArray70[local18++] = this.aByteArray70[local20];
				local5.anInt2878 = local18;
			} else if (local18 > 0) {
				local5.aByteArray70[local18++] = 95;
			}
			if (local18 == 12) {
				break;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)Lclient!wb;")
	public Class65 method1787() {
		@Pc(5) Class65 local5 = new Class65();
		@Pc(7) boolean local7 = true;
		local5.anInt2878 = this.anInt2878;
		local5.aByteArray70 = new byte[this.anInt2878];
		for (@Pc(22) int local22 = 0; local22 < this.anInt2878; local22++) {
			@Pc(29) byte local29 = this.aByteArray70[local22];
			if (local29 == 95) {
				local5.aByteArray70[local22] = 32;
				local7 = true;
			} else if (local29 >= 97 && local29 <= 122 && local7) {
				local5.aByteArray70[local22] = (byte) (local29 - 32);
				local7 = false;
			} else {
				local5.aByteArray70[local22] = local29;
				local7 = false;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(ILclient!wb;)Z")
	public boolean method1788(@OriginalArg(1) Class65 arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0.anInt2878 == this.anInt2878) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt2878; local23++) {
				@Pc(30) byte local30 = this.aByteArray70[local23];
				@Pc(35) byte local35 = arg0.aByteArray70[local23];
				if (local30 >= 65 && local30 <= 90 || local30 >= -64 && local30 <= -34 && local30 != -41) {
					local30 = (byte) (local30 + 32);
				}
				if (local35 >= 65 && local35 <= 90 || local35 >= -64 && local35 <= -34 && local35 != -41) {
					local35 = (byte) (local35 + 32);
				}
				if (local30 != local35) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "(I)J")
	public long method1790() {
		@Pc(3) long local3 = 0L;
		for (@Pc(9) int local9 = 0; this.anInt2878 > local9 && local9 < 12; local9++) {
			local3 *= 37L;
			@Pc(20) byte local20 = this.aByteArray70[local9];
			if (local20 >= 65 && local20 <= 90) {
				local3 += local20 - 64;
			} else if (local20 >= 97 && local20 <= 122) {
				local3 += local20 - 96;
			} else if (local20 >= 48 && local20 <= 57) {
				local3 += local20 + 27 - 48;
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!wb;II)Lclient!wb;")
	public Class65 method1791(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean157) {
			throw new IllegalArgumentException();
		} else if (arg1 > this.anInt2878) {
			throw new IllegalArgumentException();
		} else {
			this.anInt2875 = 0;
			if (this.aByteArray70.length < arg1 + arg0.anInt2878) {
				@Pc(50) int local50;
				for (local50 = 1; local50 < arg0.anInt2878 + arg1; local50 += local50) {
				}
				@Pc(69) byte[] local69 = new byte[local50];
				Static118.method1745(this.aByteArray70, 0, local69, 0, this.anInt2878);
				this.aByteArray70 = local69;
			}
			Static118.method1745(arg0.aByteArray70, 0, this.aByteArray70, arg1, arg0.anInt2878);
			if (arg0.anInt2878 + arg1 > this.anInt2878) {
				this.anInt2878 = arg1 + arg0.anInt2878;
			}
			return this;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([BIIII)I")
	public int method1792(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static118.method1745(this.aByteArray70, 0, arg0, arg1, arg2);
		return arg2;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)Lclient!wb;")
	public Class65 method1793(@OriginalArg(0) int arg0) {
		if (arg0 <= 0 || arg0 > 255) {
			throw new IllegalArgumentException("invalid char");
		}
		@Pc(17) Class65 local17 = new Class65();
		local17.aByteArray70 = new byte[this.anInt2878 + 1];
		local17.anInt2878 = this.anInt2878 + 1;
		Static118.method1745(this.aByteArray70, 0, local17.aByteArray70, 0, this.anInt2878);
		local17.aByteArray70[this.anInt2878] = (byte) arg0;
		return local17;
	}
}
