import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public class Class2_Sub23 extends Class2 {

	@OriginalMember(owner = "client!si", name = "s", descriptor = "[B")
	public byte[] aByteArray130;

	@OriginalMember(owner = "client!si", name = "hb", descriptor = "I")
	public int anInt6952;

	static {
		new Class209("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V")
	public Class2_Sub23(@OriginalArg(0) int arg0) {
		this.aByteArray130 = Static137.method2322(arg0);
		this.anInt6952 = 0;
	}

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "([B)V")
	public Class2_Sub23(@OriginalArg(0) byte[] arg0) {
		this.anInt6952 = 0;
		this.aByteArray130 = arg0;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
	public final void method5448(@OriginalArg(0) int arg0) {
		this.aByteArray130[this.anInt6952 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(II)V")
	public final void method5449(@OriginalArg(1) int arg0) {
		this.aByteArray130[this.anInt6952++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(JB)V")
	public final void method5450(@OriginalArg(0) long arg0) {
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 56);
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 48);
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 40);
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 32);
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 24);
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 16);
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 8);
		this.aByteArray130[this.anInt6952++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public final String method5451() {
		if (this.aByteArray130[this.anInt6952] == 0) {
			this.anInt6952++;
			return null;
		} else {
			return this.method5494();
		}
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(I)I")
	public final int method5452() {
		return 128 - this.aByteArray130[this.anInt6952++] & 0xFF;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)J")
	public final long method5453() {
		@Pc(15) long local15 = (long) this.method5508() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method5508() & 0xFFFFFFFFL;
		return (local15 << 32) + local22;
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(II)V")
	public final void method5454(@OriginalArg(0) int arg0) {
		this.aByteArray130[this.anInt6952++] = (byte) arg0;
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(B)I")
	public final int method5455() {
		@Pc(14) byte local14 = this.aByteArray130[this.anInt6952++];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local14 & 0x7F | local16) << 7;
			local14 = this.aByteArray130[this.anInt6952++];
		}
		return local14 | local16;
	}

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(I)I")
	public final int method5456() {
		this.anInt6952 += 2;
		@Pc(41) int local41 = ((this.aByteArray130[this.anInt6952 - 1] & 0xFF) << 8) + (this.aByteArray130[this.anInt6952 - 2] - 128 & 0xFF);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)V")
	public final void method5457(@OriginalArg(1) int arg0) {
		this.aByteArray130[this.anInt6952++] = (byte) arg0;
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(B)I")
	public final int method5458() {
		this.anInt6952 += 2;
		@Pc(39) int local39 = (this.aByteArray130[this.anInt6952 - 1] & 0xFF) + ((this.aByteArray130[this.anInt6952 - 2] & 0xFF) << 8);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(BI)V")
	public final void method5459(@OriginalArg(1) int arg0) {
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!si", name = "e", descriptor = "(I)I")
	public final int method5460() {
		this.anInt6952 += 2;
		return ((this.aByteArray130[this.anInt6952 - 1] & 0xFF) << 8) + (this.aByteArray130[this.anInt6952 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(BI)V")
	public final void method5461(@OriginalArg(1) int arg0) {
		this.aByteArray130[this.anInt6952 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray130[this.anInt6952 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray130[this.anInt6952 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray130[this.anInt6952 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II[BI)V")
	public final void method5462(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aByteArray130[this.anInt6952++] = arg1[local7];
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V")
	public final void method5463(@OriginalArg(0) int arg0) {
		this.aByteArray130[this.anInt6952++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!si", name = "f", descriptor = "(I)I")
	public final int method5464() {
		return -this.aByteArray130[this.anInt6952++] & 0xFF;
	}

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(BI)V")
	public final void method5465(@OriginalArg(1) int arg0) {
		this.aByteArray130[this.anInt6952 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray130[this.anInt6952 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public final String method5467() {
		@Pc(14) byte local14 = this.aByteArray130[this.anInt6952++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt6952;
		while (this.aByteArray130[this.anInt6952++] != 0) {
		}
		@Pc(54) int local54 = this.anInt6952 - local27 - 1;
		return local54 == 0 ? "" : Static148.method2444(this.aByteArray130, local54, local27);
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(Z)I")
	public final int method5468() {
		this.anInt6952 += 4;
		return (this.aByteArray130[this.anInt6952 - 3] & 0xFF) + ((this.aByteArray130[this.anInt6952 - 2] & 0xFF) << 24) + ((this.aByteArray130[this.anInt6952 + -1] & 0xFF) << 16) + ((this.aByteArray130[this.anInt6952 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!si", name = "e", descriptor = "(B)I")
	public final int method5469() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11;
		for (local11 = this.method5479(); local11 == 32767; local11 = this.method5479()) {
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!si", name = "e", descriptor = "(II)V")
	public final void method5470(@OriginalArg(0) int arg0) {
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 8);
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!si", name = "g", descriptor = "(I)B")
	public final byte method5471() {
		return (byte) (this.aByteArray130[this.anInt6952++] - 128);
	}

	@OriginalMember(owner = "client!si", name = "h", descriptor = "(I)I")
	public final int method5472() {
		this.anInt6952 += 4;
		return ((this.aByteArray130[this.anInt6952 - 1] & 0xFF) << 8) + ((this.aByteArray130[this.anInt6952 - 3] & 0xFF) << 24) + ((this.aByteArray130[this.anInt6952 + -4] & 0xFF) << 16) + (this.aByteArray130[this.anInt6952 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!si", name = "e", descriptor = "(BI)V")
	public final void method5473(@OriginalArg(1) int arg0) {
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 16);
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 8);
		this.aByteArray130[this.anInt6952++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZI)V")
	public final void method5475(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5449(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5502(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!si", name = "f", descriptor = "(II)V")
	public final void method5476(@OriginalArg(1) int arg0) {
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 8);
		this.aByteArray130[this.anInt6952++] = (byte) arg0;
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 24);
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ[BI)V")
	public final void method5477(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(15) int local15 = arg1 - 1; local15 >= 0; local15--) {
			arg0[local15] = this.aByteArray130[this.anInt6952++];
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)V")
	public final void method5478(@OriginalArg(0) int arg0) {
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 16);
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 24);
		this.aByteArray130[this.anInt6952++] = (byte) arg0;
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!si", name = "i", descriptor = "(I)I")
	public final int method5479() {
		@Pc(11) int local11 = this.aByteArray130[this.anInt6952] & 0xFF;
		return local11 >= 128 ? this.method5500() - 32768 : this.method5495();
	}

	@OriginalMember(owner = "client!si", name = "f", descriptor = "(BI)I")
	public final int method5480(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = Static394.method5208(this.aByteArray130, arg0, this.anInt6952);
		this.method5506(local18);
		return local18;
	}

	@OriginalMember(owner = "client!si", name = "j", descriptor = "(I)I")
	public final int method5482() {
		this.anInt6952 += 3;
		return (this.aByteArray130[this.anInt6952 - 2] & 0xFF) + ((this.aByteArray130[this.anInt6952 - 3] & 0xFF) << 16) + ((this.aByteArray130[this.anInt6952 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!si", name = "g", descriptor = "(II)J")
	public final long method5483(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = arg0 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(21) int local21 = local6 * 8;
		@Pc(23) long local23 = 0L;
		while (local21 >= 0) {
			local23 |= ((long) this.aByteArray130[this.anInt6952++] & 0xFFL) << local21;
			local21 -= 8;
		}
		return local23;
	}

	@OriginalMember(owner = "client!si", name = "k", descriptor = "(I)B")
	public final byte method5484() {
		return this.aByteArray130[this.anInt6952++];
	}

	@OriginalMember(owner = "client!si", name = "e", descriptor = "(Z)I")
	public final int method5485() {
		this.anInt6952 += 3;
		return ((this.aByteArray130[this.anInt6952 - 3] & 0xFF) << 16) - (-((this.aByteArray130[this.anInt6952 - 2] & 0xFF) << 8) - (this.aByteArray130[this.anInt6952 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!si", name = "h", descriptor = "(II)V")
	public final void method5486(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5449(arg0 >>> 28 | 0x80);
					}
					this.method5449(arg0 >>> 21 | 0x80);
				}
				this.method5449(arg0 >>> 14 | 0x80);
			}
			this.method5449(arg0 >>> 7 | 0x80);
		}
		this.method5449(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!si", name = "f", descriptor = "(B)I")
	public final int method5487() {
		this.anInt6952 += 2;
		@Pc(37) int local37 = (this.aByteArray130[this.anInt6952 - 1] - 128 & 0xFF) + ((this.aByteArray130[this.anInt6952 - 2] & 0xFF) << 8);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "([IIII)V")
	public final void method5488(@OriginalArg(0) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt6952;
		this.anInt6952 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method5508();
			@Pc(30) int local30 = this.method5508();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= local32 + arg0[local32 >>> 11 & 0x3] ^ (local26 >>> 5 ^ local26 << 4) + local26;
				local32 -= -1640531527;
				local26 -= (local30 >>> 5 ^ local30 << 4) + local30 ^ local32 + arg0[local32 & 0x3];
			}
			this.anInt6952 -= 8;
			this.method5506(local26);
			this.method5506(local30);
		}
		this.anInt6952 = local8;
	}

	@OriginalMember(owner = "client!si", name = "i", descriptor = "(II)V")
	public final void method5489(@OriginalArg(1) int arg0) {
		this.aByteArray130[this.anInt6952++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(JII)V")
	public final void method5490(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 - 1;
		if (local6 < 0 || local6 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(26) int local26 = local6 * 8; local26 >= 0; local26 -= 8) {
			this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> local26);
		}
	}

	@OriginalMember(owner = "client!si", name = "l", descriptor = "(I)Z")
	public final boolean method5491() {
		this.anInt6952 -= 4;
		@Pc(22) int local22 = Static394.method5208(this.aByteArray130, 0, this.anInt6952);
		@Pc(26) int local26 = this.method5508();
		return local26 == local22;
	}

	@OriginalMember(owner = "client!si", name = "m", descriptor = "(I)I")
	public final int method5492() {
		this.anInt6952 += 2;
		return (this.aByteArray130[this.anInt6952 - 1] - 128 & 0xFF) + ((this.aByteArray130[this.anInt6952 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!si", name = "g", descriptor = "(B)I")
	public final int method5493() {
		this.anInt6952 += 2;
		return ((this.aByteArray130[this.anInt6952 - 1] & 0xFF) << 8) + (this.aByteArray130[this.anInt6952 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!si", name = "h", descriptor = "(B)Ljava/lang/String;")
	public final String method5494() {
		@Pc(14) int local14 = this.anInt6952;
		while (this.aByteArray130[this.anInt6952++] != 0) {
		}
		@Pc(37) int local37 = this.anInt6952 - local14 - 1;
		return local37 == 0 ? "" : Static148.method2444(this.aByteArray130, local37, local14);
	}

	@OriginalMember(owner = "client!si", name = "n", descriptor = "(I)I")
	public final int method5495() {
		return this.aByteArray130[this.anInt6952++] & 0xFF;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public final void method5496(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt6952 += Static282.method4102(this.aByteArray130, this.anInt6952, arg0.length(), arg0);
		this.aByteArray130[this.anInt6952++] = 0;
	}

	@OriginalMember(owner = "client!si", name = "i", descriptor = "(B)B")
	public final byte method5497() {
		return (byte) -this.aByteArray130[this.anInt6952++];
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(IB)V")
	public final void method5498(@OriginalArg(0) int arg0) {
		this.aByteArray130[this.anInt6952++] = (byte) arg0;
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 8);
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 16);
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!si", name = "j", descriptor = "(B)I")
	public final int method5499() {
		return this.aByteArray130[this.anInt6952++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!si", name = "k", descriptor = "(B)I")
	public final int method5500() {
		this.anInt6952 += 2;
		return ((this.aByteArray130[this.anInt6952 - 2] & 0xFF) << 8) + (this.aByteArray130[this.anInt6952 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!si", name = "l", descriptor = "(B)I")
	public final int method5501() {
		@Pc(11) int local11 = this.aByteArray130[this.anInt6952] & 0xFF;
		return local11 < 128 ? this.method5495() - 64 : this.method5500() - 49152;
	}

	@OriginalMember(owner = "client!si", name = "j", descriptor = "(II)V")
	public final void method5502(@OriginalArg(1) int arg0) {
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 8);
		this.aByteArray130[this.anInt6952++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "([BIBI)V")
	public final void method5503(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			arg0[local12] = (byte) (this.aByteArray130[this.anInt6952++] - 128);
		}
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(IB)V")
	public final void method5504(@OriginalArg(0) int arg0) {
		this.aByteArray130[this.anInt6952++] = (byte) arg0;
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 8);
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 16);
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!si", name = "o", descriptor = "(I)I")
	public final int method5505() {
		this.anInt6952 += 4;
		return ((this.aByteArray130[this.anInt6952 - 3] & 0xFF) << 8) + ((this.aByteArray130[this.anInt6952 - 2] & 0xFF) << 16) + ((this.aByteArray130[this.anInt6952 + -1] & 0xFF) << 24) + (this.aByteArray130[this.anInt6952 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!si", name = "k", descriptor = "(II)V")
	public final void method5506(@OriginalArg(0) int arg0) {
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 24);
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 16);
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 8);
		this.aByteArray130[this.anInt6952++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!si", name = "l", descriptor = "(II)V")
	public final void method5507(@OriginalArg(1) int arg0) {
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 + 128);
		this.aByteArray130[this.anInt6952++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!si", name = "m", descriptor = "(B)I")
	public final int method5508() {
		this.anInt6952 += 4;
		return ((this.aByteArray130[this.anInt6952 - 4] & 0xFF) << 24) + ((this.aByteArray130[this.anInt6952 - 3] & 0xFF) << 16) + ((this.aByteArray130[this.anInt6952 + -2] & 0xFF) << 8) + (this.aByteArray130[this.anInt6952 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I[BIB)V")
	public final void method5509(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = this.aByteArray130[this.anInt6952++];
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method5510(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt6952;
		this.anInt6952 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method5509(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(35) BigInteger local35 = local23.modPow(arg1, arg0);
		@Pc(38) byte[] local38 = local35.toByteArray();
		this.anInt6952 = 0;
		this.method5449(local38.length);
		this.method5462(local38.length, local38);
	}

	@OriginalMember(owner = "client!si", name = "p", descriptor = "(I)B")
	public final byte method5511() {
		return (byte) (128 - this.aByteArray130[this.anInt6952++]);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "([IZ)V")
	public final void method5512(@OriginalArg(0) int[] arg0) {
		@Pc(14) int local14 = this.anInt6952 / 8;
		this.anInt6952 = 0;
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			@Pc(25) int local25 = this.method5508();
			@Pc(29) int local29 = this.method5508();
			@Pc(31) int local31 = 0;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local25 += arg0[local31 & 0x3] + local31 ^ local29 + (local29 >>> 5 ^ local29 << 4);
				local31 += -1640531527;
				local29 += (local25 << 4 ^ local25 >>> 5) + local25 ^ local31 + arg0[local31 >>> 11 & 0x3];
			}
			this.anInt6952 -= 8;
			this.method5506(local25);
			this.method5506(local29);
		}
	}
}
