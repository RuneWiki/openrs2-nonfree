import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public class Class3_Sub26 extends Class3 {

	@OriginalMember(owner = "client!ie", name = "yb", descriptor = "[B")
	public byte[] aByteArray213;

	@OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
	public int anInt8703;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V")
	public Class3_Sub26(@OriginalArg(0) int arg0) {
		this.aByteArray213 = Static38.method1057(arg0);
		this.anInt8703 = 0;
	}

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "([B)V")
	public Class3_Sub26(@OriginalArg(0) byte[] arg0) {
		this.aByteArray213 = arg0;
		this.anInt8703 = 0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)V")
	public final void method6768(@OriginalArg(0) int arg0) {
		this.aByteArray213[this.anInt8703 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)V")
	public final void method6769(@OriginalArg(1) int arg0) {
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 8);
		this.aByteArray213[this.anInt8703++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)V")
	public final void method6770(@OriginalArg(1) int arg0) {
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 16);
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 24);
		this.aByteArray213[this.anInt8703++] = (byte) arg0;
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public final void method6772(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt8703 += Static581.method7906(this.aByteArray213, arg0, this.anInt8703, arg0.length());
		this.aByteArray213[this.anInt8703++] = 0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
	public final void method6773(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method6809(arg0 >>> 28 | 0x80);
					}
					this.method6809(arg0 >>> 21 | 0x80);
				}
				this.method6809(arg0 >>> 14 | 0x80);
			}
			this.method6809(arg0 >>> 7 | 0x80);
		}
		this.method6809(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)I")
	public final int method6774() {
		this.anInt8703 += 4;
		return (this.aByteArray213[this.anInt8703 - 2] & 0xFF) + ((this.aByteArray213[this.anInt8703 - 1] & 0xFF) << 8) + ((this.aByteArray213[this.anInt8703 + -4] & 0xFF) << 16) + ((this.aByteArray213[-3 + this.anInt8703] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)B")
	public final byte method6775() {
		return (byte) -this.aByteArray213[this.anInt8703++];
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)I")
	public final int method6776() {
		this.anInt8703 += 3;
		@Pc(50) int local50 = (this.aByteArray213[this.anInt8703 - 1] & 0xFF) + ((this.aByteArray213[this.anInt8703 - 2] & 0xFF) << 8) + ((this.aByteArray213[this.anInt8703 + -3] & 0xFF) << 16);
		if (local50 > 8388607) {
			local50 -= 16777216;
		}
		return local50;
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)I")
	public final int method6777() {
		return this.aByteArray213[this.anInt8703++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V")
	public final void method6778(@OriginalArg(1) int arg0) {
		this.aByteArray213[this.anInt8703++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)Z")
	public final boolean method6779() {
		this.anInt8703 -= 4;
		@Pc(19) int local19 = Static361.method5137(0, this.anInt8703, this.aByteArray213);
		@Pc(25) int local25 = this.method6816();
		return local25 == local19;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(BI)V")
	public final void method6780(@OriginalArg(1) int arg0) {
		this.aByteArray213[this.anInt8703++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)I")
	public final int method6781() {
		this.anInt8703 += 4;
		return ((this.aByteArray213[this.anInt8703 - 3] & 0xFF) << 8) + ((this.aByteArray213[this.anInt8703 - 2] & 0xFF) << 16) + ((this.aByteArray213[this.anInt8703 + -1] & 0xFF) << 24) + (this.aByteArray213[this.anInt8703 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(JI)V")
	public final void method6782(@OriginalArg(0) long arg0) {
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 56);
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 48);
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 40);
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 32);
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 24);
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 16);
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 8);
		this.aByteArray213[this.anInt8703++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(B)I")
	public final int method6783() {
		this.anInt8703 += 2;
		return ((this.aByteArray213[this.anInt8703 - 1] & 0xFF) << 8) + (this.aByteArray213[this.anInt8703 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)I")
	public final int method6784() {
		@Pc(16) int local16 = this.aByteArray213[this.anInt8703] & 0xFF;
		return local16 < 128 ? this.method6814() - 64 : this.method6811() + -49152;
	}

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "(I)I")
	public final int method6785() {
		this.anInt8703 += 4;
		return ((this.aByteArray213[this.anInt8703 - 2] & 0xFF) << 24) + (this.aByteArray213[this.anInt8703 - 3] & 0xFF) - (-((this.aByteArray213[this.anInt8703 - 1] & 0xFF) << 16) - ((this.aByteArray213[this.anInt8703 - 4] & 0xFF) << 8));
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(B)Ljava/lang/String;")
	public final String method6786() {
		@Pc(11) int local11 = this.anInt8703;
		while (this.aByteArray213[this.anInt8703++] != 0) {
		}
		@Pc(30) int local30 = this.anInt8703 - local11 - 1;
		return local30 == 0 ? "" : Static172.method3065(local30, this.aByteArray213, local11);
	}

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "(I)I")
	public final int method6787() {
		this.anInt8703 += 3;
		return (this.aByteArray213[this.anInt8703 - 3] & 0xFF) + ((this.aByteArray213[this.anInt8703 - 1] & 0xFF) << 16) + ((this.aByteArray213[this.anInt8703 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "(I)Ljava/lang/String;")
	public final String method6788() {
		if (this.aByteArray213[this.anInt8703] == 0) {
			this.anInt8703++;
			return null;
		} else {
			return this.method6786();
		}
	}

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "(I)I")
	public final int method6789() {
		this.anInt8703 += 2;
		@Pc(32) int local32 = ((this.aByteArray213[this.anInt8703 - 2] & 0xFF) << 8) + (this.aByteArray213[this.anInt8703 - 1] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "(I)I")
	public final int method6790() {
		this.anInt8703 += 2;
		@Pc(41) int local41 = ((this.aByteArray213[this.anInt8703 - 2] & 0xFF) << 8) + (this.aByteArray213[this.anInt8703 - 1] - 128 & 0xFF);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)V")
	public final void method6791(@OriginalArg(0) int arg0) {
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 16);
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 8);
		this.aByteArray213[this.anInt8703++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "(B)B")
	public final byte method6792() {
		return (byte) (128 - this.aByteArray213[this.anInt8703++]);
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(II)V")
	public final void method6793(@OriginalArg(1) int arg0) {
		this.aByteArray213[this.anInt8703++] = (byte) arg0;
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([BIIB)V")
	public final void method6794(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			arg0[local14] = this.aByteArray213[this.anInt8703++];
		}
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(II)V")
	public final void method6795(@OriginalArg(1) int arg0) {
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 8);
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(II)V")
	public final void method6796(@OriginalArg(0) int arg0) {
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "(B)Ljava/lang/String;")
	public final String method6797() {
		@Pc(14) byte local14 = this.aByteArray213[this.anInt8703++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt8703;
		while (this.aByteArray213[this.anInt8703++] != 0) {
		}
		@Pc(51) int local51 = this.anInt8703 - local27 - 1;
		return local51 == 0 ? "" : Static172.method3065(local51, this.aByteArray213, local27);
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(BI)V")
	public final void method6798(@OriginalArg(1) int arg0) {
		this.aByteArray213[this.anInt8703 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray213[this.anInt8703 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray213[this.anInt8703 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray213[this.anInt8703 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "(I)I")
	public final int method6799() {
		this.anInt8703 += 4;
		return ((this.aByteArray213[this.anInt8703 - 3] & 0xFF) << 8) + ((this.aByteArray213[this.anInt8703 - 2] & 0xFF) << 16) + ((this.aByteArray213[this.anInt8703 + -1] & 0xFF) << 24) + (this.aByteArray213[this.anInt8703 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)V")
	public final void method6800(@OriginalArg(0) int arg0) {
		this.aByteArray213[this.anInt8703++] = (byte) arg0;
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "(B)I")
	public final int method6801() {
		this.anInt8703 += 2;
		@Pc(40) int local40 = (this.aByteArray213[this.anInt8703 - 2] - 128 & 0xFF) + ((this.aByteArray213[this.anInt8703 - 1] & 0xFF) << 8);
		if (local40 > 32767) {
			local40 -= 65536;
		}
		return local40;
	}

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "(I)Ljava/lang/String;")
	public final String method6802() {
		@Pc(14) byte local14 = this.aByteArray213[this.anInt8703++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(28) int local28 = this.method6806();
		if (this.aByteArray213.length < local28 + this.anInt8703) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(55) String local55 = Static151.method2838(local28, this.anInt8703, this.aByteArray213);
		this.anInt8703 += local28;
		return local55;
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(BI)V")
	public final void method6803(@OriginalArg(1) int arg0) {
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 8);
		this.aByteArray213[this.anInt8703++] = (byte) arg0;
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 24);
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)I")
	public final int method6804() {
		@Pc(13) int local13 = 0;
		@Pc(17) int local17;
		for (local17 = this.method6832(); local17 == 32767; local17 = this.method6832()) {
			local13 += 32767;
		}
		return local13 + local17;
	}

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "(II)J")
	public final long method6805(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(22) int local22 = local2 * 8;
		@Pc(24) long local24 = 0L;
		while (local22 >= 0) {
			local24 |= ((long) this.aByteArray213[this.anInt8703++] & 0xFFL) << local22;
			local22 -= 8;
		}
		return local24;
	}

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "(B)I")
	public final int method6806() {
		@Pc(23) byte local23 = this.aByteArray213[this.anInt8703++];
		@Pc(25) int local25 = 0;
		while (local23 < 0) {
			local25 = (local23 & 0x7F | local25) << 7;
			local23 = this.aByteArray213[this.anInt8703++];
		}
		return local23 | local25;
	}

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "(II)V")
	public final void method6808(@OriginalArg(0) int arg0) {
		this.aByteArray213[this.anInt8703++] = (byte) arg0;
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 8);
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 16);
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "(II)V")
	public final void method6809(@OriginalArg(0) int arg0) {
		this.aByteArray213[this.anInt8703++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(IB)V")
	public final void method6810(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method6809(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method6769(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "(I)I")
	public final int method6811() {
		this.anInt8703 += 2;
		return (this.aByteArray213[this.anInt8703 - 1] & 0xFF) + ((this.aByteArray213[this.anInt8703 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "(I)I")
	public final int method6812() {
		this.anInt8703 += 2;
		return (this.aByteArray213[this.anInt8703 - 1] - 128 & 0xFF) + ((this.aByteArray213[this.anInt8703 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "(I)J")
	public final long method6813() {
		@Pc(17) long local17 = (long) this.method6816() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method6816() & 0xFFFFFFFFL;
		return (local17 << 32) + local24;
	}

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "(I)I")
	public final int method6814() {
		return this.aByteArray213[this.anInt8703++] & 0xFF;
	}

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "(II)I")
	public final int method6815(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = Static361.method5137(arg0, this.anInt8703, this.aByteArray213);
		this.method6826(local18);
		return local18;
	}

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "(I)I")
	public final int method6816() {
		this.anInt8703 += 4;
		return (this.aByteArray213[this.anInt8703 - 1] & 0xFF) + ((this.aByteArray213[this.anInt8703 - 2] & 0xFF) << 8) + ((this.aByteArray213[this.anInt8703 + -4] & 0xFF) << 24) + ((this.aByteArray213[this.anInt8703 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(JII)V")
	public final void method6817(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(2) int local2 = arg1 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(22) int local22 = local2 * 8; local22 >= 0; local22 -= 8) {
			this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> local22);
		}
	}

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "(B)V")
	public final void method6818() {
		if (this.aByteArray213 != null) {
			Static38.method1058(this.aByteArray213);
		}
		this.aByteArray213 = null;
	}

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "(I)I")
	public final int method6819() {
		return 128 - this.aByteArray213[this.anInt8703++] & 0xFF;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(ZI)V")
	public final void method6820(@OriginalArg(1) int arg0) {
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 + 128);
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "(B)I")
	public final int method6821() {
		return -this.aByteArray213[this.anInt8703++] & 0xFF;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(Z)I")
	public final int method6822() {
		this.anInt8703 += 2;
		return ((this.aByteArray213[this.anInt8703 - 1] & 0xFF) << 8) + (this.aByteArray213[this.anInt8703 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public final void method6823(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = Static472.method6448(arg0);
		this.aByteArray213[this.anInt8703++] = 0;
		this.method6773(local7);
		this.anInt8703 += Static457.method6284(this.aByteArray213, arg0, this.anInt8703);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[BII)V")
	public final void method6824(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aByteArray213[this.anInt8703++] = arg0[local12];
		}
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(Z)B")
	public final byte method6825() {
		return this.aByteArray213[this.anInt8703++];
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(ZI)V")
	public final void method6826(@OriginalArg(1) int arg0) {
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 24);
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 16);
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 8);
		this.aByteArray213[this.anInt8703++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(IB)V")
	public final void method6827(@OriginalArg(0) int arg0) {
		this.aByteArray213[this.anInt8703++] = (byte) arg0;
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 8);
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 16);
		this.aByteArray213[this.anInt8703++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "(II)V")
	public final void method6828(@OriginalArg(0) int arg0) {
		this.aByteArray213[this.anInt8703 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray213[this.anInt8703 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(Z)B")
	public final byte method6829() {
		return (byte) (this.aByteArray213[this.anInt8703++] - 128);
	}

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "(I)I")
	public final int method6830() {
		this.anInt8703 += 3;
		return (this.aByteArray213[this.anInt8703 - 1] & 0xFF) + ((this.aByteArray213[this.anInt8703 - 2] & 0xFF) << 8) + ((this.aByteArray213[this.anInt8703 - 3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([IIII)V")
	public final void method6831(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt8703;
		this.anInt8703 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method6816();
			@Pc(32) int local32 = this.method6816();
			@Pc(34) int local34 = -957401312;
			@Pc(38) int local38 = 32;
			while (local38-- > 0) {
				local32 -= local26 + (local26 << 4 ^ local26 >>> 5) ^ local34 - -arg0[local34 >>> 11 & 0xCB000003];
				local34 -= -1640531527;
				local26 -= (local32 >>> 5 ^ local32 << 4) + local32 ^ local34 - -arg0[local34 & 0x3];
			}
			this.anInt8703 -= 8;
			this.method6826(local26);
			this.method6826(local32);
		}
		this.anInt8703 = local8;
	}

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "(B)I")
	public final int method6832() {
		@Pc(16) int local16 = this.aByteArray213[this.anInt8703] & 0xFF;
		return local16 < 128 ? this.method6814() : this.method6811() - 32768;
	}

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "(I)I")
	public final int method6833() {
		@Pc(13) int local13 = Static361.method5137(0, this.anInt8703, this.aByteArray213);
		this.method6826(local13);
		return local13;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method6834(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray213[this.anInt8703++] = 0;
		this.anInt8703 += Static581.method7906(this.aByteArray213, arg0, this.anInt8703, arg0.length());
		this.aByteArray213[this.anInt8703++] = 0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method6835(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt8703;
		this.anInt8703 = 0;
		@Pc(19) byte[] local19 = new byte[local6];
		this.method6794(local19, local6);
		@Pc(30) BigInteger local30 = new BigInteger(local19);
		@Pc(35) BigInteger local35 = local30.modPow(arg1, arg0);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt8703 = 0;
		this.method6769(local38.length);
		this.method6824(local38, local38.length);
	}
}
