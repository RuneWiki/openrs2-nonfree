import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public class Class11_Sub25 extends Class11 {

	@OriginalMember(owner = "client!kh", name = "jb", descriptor = "[B")
	public byte[] aByteArray93;

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
	public int anInt6076;

	static {
		new Class117("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(I)V")
	public Class11_Sub25(@OriginalArg(0) int arg0) {
		this.aByteArray93 = Static151.method2282(arg0);
		this.anInt6076 = 0;
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "([B)V")
	public Class11_Sub25(@OriginalArg(0) byte[] arg0) {
		this.anInt6076 = 0;
		this.aByteArray93 = arg0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)J")
	public final long method5166(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(29) int local29 = local2 * 8;
		@Pc(31) long local31 = 0L;
		while (local29 >= 0) {
			local31 |= ((long) this.aByteArray93[this.anInt6076++] & 0xFFL) << local29;
			local29 -= 8;
		}
		return local31;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
	public final void method5167(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt6076++] = (byte) arg0;
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)V")
	public final void method5168(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt6076++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)B")
	public final byte method5169() {
		return (byte) (128 - this.aByteArray93[this.anInt6076++]);
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(II)V")
	public final void method5170(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt6076++] = (byte) arg0;
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)I")
	public final int method5171() {
		this.anInt6076 += 2;
		return (this.aByteArray93[this.anInt6076 - 1] - 128 & 0xFF) + ((this.aByteArray93[this.anInt6076 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "([IB)V")
	public final void method5172(@OriginalArg(0) int[] arg0) {
		@Pc(14) int local14 = this.anInt6076 / 8;
		this.anInt6076 = 0;
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			@Pc(25) int local25 = this.method5198();
			@Pc(29) int local29 = this.method5198();
			@Pc(31) int local31 = 0;
			@Pc(35) int local35 = 32;
			while (local35-- > 0) {
				local25 += (local29 >>> 5 ^ local29 << 4) + local29 ^ arg0[local31 & 0x3] + local31;
				local31 += -1640531527;
				local29 += arg0[local31 >>> 11 & 0xF8200003] + local31 ^ (local25 >>> 5 ^ local25 << 4) + local25;
			}
			this.anInt6076 -= 8;
			this.method5168(local25);
			this.method5168(local29);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public final void method5173(@OriginalArg(0) String arg0) {
		@Pc(12) int local12 = arg0.indexOf(0);
		if (local12 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local12 + " - cannot pjstr");
		}
		this.anInt6076 += Static239.method4237(this.aByteArray93, arg0.length(), this.anInt6076, arg0);
		this.aByteArray93[this.anInt6076++] = 0;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(Z)J")
	public final long method5174() {
		@Pc(17) long local17 = (long) this.method5198() & 0xFFFFFFFFL;
		@Pc(24) long local24 = (long) this.method5198() & 0xFFFFFFFFL;
		return local24 + (local17 << 32);
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)B")
	public final byte method5175() {
		return this.aByteArray93[this.anInt6076++];
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(II)I")
	public final int method5176(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static55.method826(this.anInt6076, this.aByteArray93, arg0);
		this.method5168(local16);
		return local16;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(BI)V")
	public final void method5177(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method5186(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method5204(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(JB)V")
	public final void method5178(@OriginalArg(0) long arg0) {
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 56);
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 48);
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 40);
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 32);
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt6076++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(Z)I")
	public final int method5179() {
		this.anInt6076 += 2;
		return ((this.aByteArray93[this.anInt6076 - 1] & 0xFF) << 8) + (this.aByteArray93[this.anInt6076 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(BI)V")
	public final void method5180(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt6076++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public final void method5181(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt6076;
		this.anInt6076 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method5209(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg0, arg1);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt6076 = 0;
		this.method5186(local31.length);
		this.method5226(local31, local31.length);
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(II)V")
	public final void method5182(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt6076++] = (byte) arg0;
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(BI)V")
	public final void method5183(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt6076 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)Ljava/lang/String;")
	public final String method5184() {
		@Pc(11) int local11 = this.anInt6076;
		while (this.aByteArray93[this.anInt6076++] != 0) {
		}
		@Pc(34) int local34 = this.anInt6076 - local11 - 1;
		return local34 == 0 ? "" : Static216.method4853(local34, local11, this.aByteArray93);
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)I")
	public final int method5185() {
		return this.aByteArray93[this.anInt6076++] & 0xFF;
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(II)V")
	public final void method5186(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt6076++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)I")
	public final int method5187() {
		this.anInt6076 += 2;
		return (this.aByteArray93[this.anInt6076 - 1] & 0xFF) + ((this.aByteArray93[this.anInt6076 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)I")
	public final int method5188() {
		@Pc(11) int local11 = this.aByteArray93[this.anInt6076] & 0xFF;
		return local11 < 128 ? this.method5185() : this.method5187() - 32768;
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(BI)V")
	public final void method5189(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt6076++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(B)I")
	public final int method5190() {
		return this.aByteArray93[this.anInt6076++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "(II)V")
	public final void method5191(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 + 128);
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(Z)B")
	public final byte method5192() {
		return (byte) (this.aByteArray93[this.anInt6076++] - 128);
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(Z)I")
	public final int method5193() {
		@Pc(12) int local12 = 0;
		@Pc(16) int local16 = this.method5188();
		while (local16 == 32767) {
			local16 = this.method5188();
			local12 += 32767;
		}
		return local12 + local16;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III[B)V")
	public final void method5194(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = (byte) (this.aByteArray93[this.anInt6076++] - 128);
		}
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(BI)V")
	public final void method5195(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt6076 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt6076 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt6076 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt6076 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ)V")
	public final void method5196(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(B)I")
	public final int method5197() {
		this.anInt6076 += 2;
		@Pc(34) int local34 = ((this.aByteArray93[this.anInt6076 - 2] & 0xFF) << 8) + (this.aByteArray93[this.anInt6076 - 1] - 128 & 0xFF);
		if (local34 > 32767) {
			local34 -= 65536;
		}
		return local34;
	}

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)I")
	public final int method5198() {
		this.anInt6076 += 4;
		return ((this.aByteArray93[this.anInt6076 - 2] & 0xFF) << 8) + (this.aByteArray93[this.anInt6076 - 3] << 16 & 0xFF0000) + ((this.aByteArray93[this.anInt6076 + -4] & 0xFF) << 24) + (this.aByteArray93[this.anInt6076 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II[IB)V")
	public final void method5199(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(8) int local8 = this.anInt6076;
		this.anInt6076 = 5;
		@Pc(18) int local18 = (arg0 - 5) / 8;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(26) int local26 = this.method5198();
			@Pc(30) int local30 = this.method5198();
			@Pc(32) int local32 = -957401312;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local30 -= local26 + (local26 << 4 ^ local26 >>> 5) ^ local32 + arg1[local32 >>> 11 & 0x3];
				local32 -= -1640531527;
				local26 -= local30 + (local30 >>> 5 ^ local30 << 4) ^ arg1[local32 & 0x3] + local32;
			}
			this.anInt6076 -= 8;
			this.method5168(local26);
			this.method5168(local30);
		}
		this.anInt6076 = local8;
	}

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)I")
	public final int method5200() {
		return 128 - this.aByteArray93[this.anInt6076++] & 0xFF;
	}

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "(I)I")
	public final int method5201() {
		this.anInt6076 += 2;
		return ((this.aByteArray93[this.anInt6076 - 1] & 0xFF) << 8) + (this.aByteArray93[this.anInt6076 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "(I)Ljava/lang/String;")
	public final String method5202() {
		if (this.aByteArray93[this.anInt6076] == 0) {
			this.anInt6076++;
			return null;
		} else {
			return this.method5184();
		}
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(B)I")
	public final int method5203() {
		this.anInt6076 += 2;
		@Pc(41) int local41 = (this.aByteArray93[this.anInt6076 - 2] - 128 & 0xFF) + ((this.aByteArray93[this.anInt6076 - 1] & 0xFF) << 8);
		if (local41 > 32767) {
			local41 -= 65536;
		}
		return local41;
	}

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "(II)V")
	public final void method5204(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt6076++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "(II)V")
	public final void method5205(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method5186(arg0 >>> 28 | 0x80);
					}
					this.method5186(arg0 >>> 21 | 0x80);
				}
				this.method5186(arg0 >>> 14 | 0x80);
			}
			this.method5186(arg0 >>> 7 | 0x80);
		}
		this.method5186(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "(I)I")
	public final int method5206() {
		@Pc(23) byte local23 = this.aByteArray93[this.anInt6076++];
		@Pc(25) int local25 = 0;
		while (local23 < 0) {
			local25 = (local25 | local23 & 0x7F) << 7;
			local23 = this.aByteArray93[this.anInt6076++];
		}
		return local23 | local25;
	}

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "(I)I")
	public final int method5207() {
		this.anInt6076 += 4;
		return (this.aByteArray93[this.anInt6076 - 3] & 0xFF) + ((this.aByteArray93[this.anInt6076 - 4] & 0xFF) << 8) + ((this.aByteArray93[this.anInt6076 - 2] & 0xFF) << 24) + ((this.aByteArray93[this.anInt6076 + -1] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "(II)V")
	public final void method5208(@OriginalArg(1) int arg0) {
		this.aByteArray93[this.anInt6076++] = (byte) arg0;
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 8);
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "([BIII)V")
	public final void method5209(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1; local8++) {
			arg0[local8] = this.aByteArray93[this.anInt6076++];
		}
	}

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "(II)V")
	public final void method5210(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "(II)V")
	public final void method5211(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 16);
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 24);
		this.aByteArray93[this.anInt6076++] = (byte) arg0;
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "(B)I")
	public final int method5212() {
		@Pc(18) int local18 = this.aByteArray93[this.anInt6076] & 0xFF;
		return local18 >= 128 ? this.method5187() - 49152 : this.method5185() - 64;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIJ)V")
	public final void method5213(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(24) int local24 = local2 * 8; local24 >= 0; local24 -= 8) {
			this.aByteArray93[this.anInt6076++] = (byte) (arg1 >> local24);
		}
	}

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "(II)V")
	public final void method5214(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt6076++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "(I)I")
	public final int method5215() {
		this.anInt6076 += 4;
		return (this.aByteArray93[this.anInt6076 - 4] & 0xFF) + ((this.aByteArray93[this.anInt6076 - 3] & 0xFF) << 8) + ((this.aByteArray93[-1 + this.anInt6076] & 0xFF) << 24) + ((this.aByteArray93[this.anInt6076 + -2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "([BIIB)V")
	public final void method5216(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = arg1 - 1; local7 >= 0; local7--) {
			arg0[local7] = (byte) (this.aByteArray93[this.anInt6076++] - 128);
		}
	}

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "(I)Z")
	public final boolean method5217() {
		this.anInt6076 -= 4;
		@Pc(17) int local17 = Static55.method826(this.anInt6076, this.aByteArray93, 0);
		@Pc(21) int local21 = this.method5198();
		return local21 == local17;
	}

	@OriginalMember(owner = "client!kh", name = "o", descriptor = "(I)I")
	public final int method5218() {
		this.anInt6076 += 4;
		return (this.aByteArray93[this.anInt6076 - 2] & 0xFF) + ((this.aByteArray93[this.anInt6076 - 3] & 0xFF) << 24) + ((this.aByteArray93[this.anInt6076 + -4] & 0xFF) << 16) + ((this.aByteArray93[this.anInt6076 + -1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!kh", name = "p", descriptor = "(I)I")
	public final int method5219() {
		return -this.aByteArray93[this.anInt6076++] & 0xFF;
	}

	@OriginalMember(owner = "client!kh", name = "q", descriptor = "(I)I")
	public final int method5220() {
		this.anInt6076 += 2;
		@Pc(37) int local37 = ((this.aByteArray93[this.anInt6076 - 2] & 0xFF) << 8) + (this.aByteArray93[this.anInt6076 - 1] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!kh", name = "r", descriptor = "(I)I")
	public final int method5221() {
		this.anInt6076 += 3;
		return ((this.aByteArray93[this.anInt6076 - 3] & 0xFF) << 16) - (-((this.aByteArray93[this.anInt6076 - 2] & 0xFF) << 8) - (this.aByteArray93[this.anInt6076 - 1] & 0xFF));
	}

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "(B)I")
	public final int method5222() {
		this.anInt6076 += 2;
		@Pc(37) int local37 = (this.aByteArray93[this.anInt6076 - 2] & 0xFF) + ((this.aByteArray93[this.anInt6076 - 1] & 0xFF) << 8);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "(II)V")
	public final void method5223(@OriginalArg(0) int arg0) {
		this.aByteArray93[this.anInt6076++] = (byte) arg0;
		this.aByteArray93[this.anInt6076++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!kh", name = "s", descriptor = "(I)I")
	public final int method5224() {
		this.anInt6076 += 3;
		return ((this.aByteArray93[this.anInt6076 - 2] & 0xFF) << 8) + ((this.aByteArray93[this.anInt6076 - 1] << 16 & 0xFF0000) + (this.aByteArray93[this.anInt6076 - 3] & 0xFF));
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(Z)Ljava/lang/String;")
	public final String method5225() {
		@Pc(14) byte local14 = this.aByteArray93[this.anInt6076++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(24) int local24 = this.anInt6076;
		while (this.aByteArray93[this.anInt6076++] != 0) {
		}
		@Pc(49) int local49 = this.anInt6076 - local24 - 1;
		return local49 == 0 ? "" : Static216.method4853(local49, local24, this.aByteArray93);
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "([BIII)V")
	public final void method5226(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			this.aByteArray93[this.anInt6076++] = arg0[local11];
		}
	}
}
