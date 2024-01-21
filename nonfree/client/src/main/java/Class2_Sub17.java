import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public class Class2_Sub17 extends Class2 {

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
	public int anInt2799;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I)V")
	public Class2_Sub17(@OriginalArg(0) int arg0) {
		this.aByteArray38 = Static122.method1967(arg0);
		this.anInt2799 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "([B)V")
	public Class2_Sub17(@OriginalArg(0) byte[] arg0) {
		this.aByteArray38 = arg0;
		this.anInt2799 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)V")
	public final void method1745(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 16);
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 24);
		this.aByteArray38[this.anInt2799++] = (byte) arg0;
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[BI)V")
	public final void method1746(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = this.aByteArray38[this.anInt2799++];
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)I")
	public final int method1747() {
		this.anInt2799 += 4;
		return (this.aByteArray38[this.anInt2799 - 1] & 0xFF) + ((this.aByteArray38[this.anInt2799 - 2] & 0xFF) << 8) + ((this.aByteArray38[this.anInt2799 + -3] & 0xFF) << 16) + ((this.aByteArray38[this.anInt2799 + -4] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)I")
	public final int method1748() {
		this.anInt2799 += 2;
		@Pc(39) int local39 = (this.aByteArray38[this.anInt2799 - 2] - 128 & 0xFF) + ((this.aByteArray38[this.anInt2799 - 1] & 0xFF) << 8);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)I")
	public final int method1751() {
		return 128 - this.aByteArray38[this.anInt2799++] & 0xFF;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
	public final int method1752(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static17.method323(arg0, this.aByteArray38, this.anInt2799);
		this.method1765(local7);
		return local7;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V")
	public final void method1753(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!wd;I)V")
	public final void method1754(@OriginalArg(0) Class80 arg0) {
		this.anInt2799 += arg0.method2034(this.anInt2799, this.aByteArray38, arg0.method1999());
		this.aByteArray38[this.anInt2799++] = 0;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)I")
	public final int method1756() {
		this.anInt2799 += 2;
		return ((this.aByteArray38[this.anInt2799 - 1] & 0xFF) << 8) + (this.aByteArray38[this.anInt2799 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(BI)V")
	public final void method1757(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt2799++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)B")
	public final byte method1758() {
		return (byte) -this.aByteArray38[this.anInt2799++];
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)B")
	public final byte method1759() {
		return (byte) (this.aByteArray38[this.anInt2799++] - 128);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[IB)V")
	public final void method1760(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(11) int local11 = (arg0 - 5) / 8;
		@Pc(14) int local14 = this.anInt2799;
		this.anInt2799 = 5;
		for (@Pc(19) int local19 = 0; local19 < local11; local19++) {
			@Pc(25) int local25 = this.method1747();
			@Pc(27) int local27 = 32;
			@Pc(29) int local29 = -957401312;
			@Pc(33) int local33 = this.method1747();
			while (local27-- > 0) {
				local33 -= local25 + (local25 << 4 ^ local25 >>> 5) ^ local29 - -arg1[local29 >>> 11 & 0xD0E00003];
				local29 -= -1640531527;
				local25 -= local29 + arg1[local29 & 0x3] ^ (local33 << 4 ^ local33 >>> 5) + local33;
			}
			this.anInt2799 -= 8;
			this.method1765(local25);
			this.method1765(local33);
		}
		this.anInt2799 = local14;
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)I")
	public final int method1761() {
		@Pc(16) byte local16 = this.aByteArray38[this.anInt2799++];
		@Pc(18) int local18 = 0;
		while (local16 < 0) {
			local18 = (local18 | local16 & 0x7F) << 7;
			local16 = this.aByteArray38[this.anInt2799++];
		}
		return local18 | local16;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(Z)I")
	public final int method1762() {
		this.anInt2799 += 3;
		return (this.aByteArray38[this.anInt2799 - 3] & 0xFF) + ((this.aByteArray38[this.anInt2799 - 2] & 0xFF) << 8) + ((this.aByteArray38[this.anInt2799 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public final void method1763(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt2799;
		this.anInt2799 = 0;
		@Pc(20) byte[] local20 = new byte[local6];
		this.method1746(local6, local20);
		@Pc(31) BigInteger local31 = new BigInteger(local20);
		@Pc(36) BigInteger local36 = local31.modPow(arg0, arg1);
		@Pc(39) byte[] local39 = local36.toByteArray();
		this.anInt2799 = 0;
		this.method1769(local39.length);
		this.method1773(local39, local39.length);
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)V")
	public final void method1764(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt2799 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray38[this.anInt2799 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray38[this.anInt2799 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt2799 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(BI)V")
	public final void method1765(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 24);
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 16);
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt2799++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(B)I")
	public final int method1766() {
		this.anInt2799 += 4;
		return (this.aByteArray38[this.anInt2799 - 4] & 0xFF) + ((this.aByteArray38[this.anInt2799 - 2] & 0xFF) << 16) + ((this.aByteArray38[this.anInt2799 + -1] & 0xFF) << 24) + ((this.aByteArray38[this.anInt2799 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)B")
	public final byte method1767() {
		return this.aByteArray38[this.anInt2799++];
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(II)V")
	public final void method1768(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt2799 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(II)V")
	public final void method1769(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt2799++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)I")
	public final int method1770() {
		return this.aByteArray38[this.anInt2799++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)V")
	public final void method1771(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 16);
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt2799++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(JZ)V")
	public final void method1772(@OriginalArg(0) long arg0) {
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 56);
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 48);
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 40);
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 32);
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 24);
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 16);
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt2799++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([BBII)V")
	public final void method1773(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			this.aByteArray38[this.anInt2799++] = arg0[local9];
		}
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(II)V")
	public final void method1774(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt2799++] = (byte) arg0;
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZ)V")
	public final void method1775(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt2799++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(II)V")
	public final void method1776(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "(I)B")
	public final byte method1777() {
		return (byte) (128 - this.aByteArray38[this.anInt2799++]);
	}

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "(I)I")
	public final int method1779() {
		this.anInt2799 += 2;
		return ((this.aByteArray38[this.anInt2799 - 2] & 0xFF) << 8) + (this.aByteArray38[this.anInt2799 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "(I)I")
	public final int method1780() {
		return this.aByteArray38[this.anInt2799++] & 0xFF;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)V")
	public final void method1781(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method1769(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method1757(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "(I)I")
	public final int method1783() {
		this.anInt2799 += 2;
		return ((this.aByteArray38[this.anInt2799 - 2] & 0xFF) << 8) + (this.aByteArray38[this.anInt2799 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(B)I")
	public final int method1784() {
		this.anInt2799 += 2;
		@Pc(31) int local31 = ((this.aByteArray38[this.anInt2799 - 2] & 0xFF) << 8) + (this.aByteArray38[this.anInt2799 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "(II)V")
	public final void method1785(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 + 128);
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(B)I")
	public final int method1786() {
		this.anInt2799 += 2;
		@Pc(36) int local36 = ((this.aByteArray38[this.anInt2799 - 1] & 0xFF) << 8) + (this.aByteArray38[this.anInt2799 - 2] & 0xFF);
		if (local36 > 32767) {
			local36 -= 65536;
		}
		return local36;
	}

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "(I)I")
	public final int method1787() {
		@Pc(11) int local11 = this.aByteArray38[this.anInt2799] & 0xFF;
		return local11 >= 128 ? this.method1783() - 32768 : this.method1780();
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(B)I")
	public final int method1788() {
		this.anInt2799 += 4;
		return (this.aByteArray38[this.anInt2799 - 2] & 0xFF) + ((this.aByteArray38[this.anInt2799 - 1] & 0xFF) << 8) + ((this.aByteArray38[this.anInt2799 + -4] & 0xFF) << 16) + ((this.aByteArray38[this.anInt2799 + -3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "(I)I")
	public final int method1789() {
		return -this.aByteArray38[this.anInt2799++] & 0xFF;
	}

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "(I)I")
	public final int method1790() {
		this.anInt2799 += 2;
		return (this.aByteArray38[this.anInt2799 - 2] & 0xFF) + ((this.aByteArray38[this.anInt2799 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "(I)I")
	public final int method1791() {
		@Pc(11) int local11 = this.aByteArray38[this.anInt2799] & 0xFF;
		return local11 < 128 ? this.method1780() - 64 : this.method1783() + -49152;
	}

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "(I)J")
	public final long method1792() {
		@Pc(15) long local15 = (long) this.method1747() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method1747() & 0xFFFFFFFFL;
		return local22 + (local15 << 32);
	}

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "(II)V")
	public final void method1793(@OriginalArg(1) int arg0) {
		this.aByteArray38[this.anInt2799++] = (byte) arg0;
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 16);
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(BI)V")
	public final void method1794(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method1769(arg0 >>> 28 | 0x80);
					}
					this.method1769(arg0 >>> 21 | 0x80);
				}
				this.method1769(arg0 >>> 14 | 0x80);
			}
			this.method1769(arg0 >>> 7 | 0x80);
		}
		this.method1769(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "(B)I")
	public final int method1795() {
		this.anInt2799 += 3;
		return (this.aByteArray38[this.anInt2799 - 1] & 0xFF) + ((this.aByteArray38[this.anInt2799 - 2] & 0xFF) << 8) + ((this.aByteArray38[this.anInt2799 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "(B)I")
	public final int method1796() {
		this.anInt2799 += 4;
		return ((this.aByteArray38[this.anInt2799 - 4] & 0xFF) << 8) + ((this.aByteArray38[this.anInt2799 - 1] & 0xFF) << 16) + ((this.aByteArray38[this.anInt2799 + -2] & 0xFF) << 24) + (this.aByteArray38[this.anInt2799 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "(B)Lclient!wd;")
	public final Class80 method1797() {
		@Pc(2) int local2 = this.anInt2799;
		while (this.aByteArray38[this.anInt2799++] != 0) {
		}
		return Static35.method628(this.aByteArray38, local2, this.anInt2799 - local2 - 1);
	}

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "(II)V")
	public final void method1798(@OriginalArg(0) int arg0) {
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 8);
		this.aByteArray38[this.anInt2799++] = (byte) arg0;
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 24);
		this.aByteArray38[this.anInt2799++] = (byte) (arg0 >> 16);
	}
}
