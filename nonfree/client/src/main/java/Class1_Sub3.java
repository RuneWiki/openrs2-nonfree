import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!ac", name = "yb", descriptor = "I")
	public int anInt9802;

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "[B")
	public byte[] aByteArray104;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(I)V")
	public Class1_Sub3(@OriginalArg(0) int arg0) {
		this.anInt9802 = 0;
		this.aByteArray104 = Static277.method4018(arg0);
	}

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "([B)V")
	public Class1_Sub3(@OriginalArg(0) byte[] arg0) {
		this.aByteArray104 = arg0;
		this.anInt9802 = 0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V")
	public final void method7911(@OriginalArg(1) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method7917(arg0 >>> 28 | 0x80);
					}
					this.method7917(arg0 >>> 21 | 0x80);
				}
				this.method7917(arg0 >>> 14 | 0x80);
			}
			this.method7917(arg0 >>> 7 | 0x80);
		}
		this.method7917(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V")
	public final void method7912(@OriginalArg(1) int arg0) {
		this.aByteArray104[this.anInt9802++] = (byte) arg0;
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)J")
	public final long method7913(@OriginalArg(1) int arg0) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(29) int local29 = local2 * 8;
		@Pc(31) long local31 = 0L;
		while (local29 >= 0) {
			local31 |= ((long) this.aByteArray104[this.anInt9802++] & 0xFFL) << local29;
			local29 -= 8;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)Ljava/lang/String;")
	public final String method7914() {
		@Pc(14) byte local14 = this.aByteArray104[this.anInt9802++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gUTF8");
		}
		@Pc(33) int local33 = this.method7929();
		if (this.aByteArray104.length < this.anInt9802 + local33) {
			throw new IllegalStateException("Length of string is longer than available data");
		}
		@Pc(54) String local54 = Static522.method7235(this.anInt9802, local33, this.aByteArray104);
		this.anInt9802 += local33;
		return local54;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)I")
	public final int method7915() {
		this.anInt9802 += 4;
		return ((this.aByteArray104[this.anInt9802 - 4] & 0xFF) << 8) + ((this.aByteArray104[this.anInt9802 - 2] & 0xFF) << 24) + ((this.aByteArray104[this.anInt9802 - 1] & 0xFF) << 16) + (this.aByteArray104[this.anInt9802 + -3] & 0xFF);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)I")
	public final int method7916() {
		this.anInt9802 += 2;
		return ((this.aByteArray104[this.anInt9802 - 2] & 0xFF) << 8) + (this.aByteArray104[this.anInt9802 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)V")
	public final void method7917(@OriginalArg(0) int arg0) {
		this.aByteArray104[this.anInt9802++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(II)V")
	public final void method7918(@OriginalArg(0) int arg0) {
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 + 128);
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)I")
	public final int method7919() {
		this.anInt9802 += 3;
		return ((this.aByteArray104[this.anInt9802 - 3] & 0xFF) << 16) + ((this.aByteArray104[this.anInt9802 - 2] & 0xFF) << 8) + (this.aByteArray104[this.anInt9802 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method7920(@OriginalArg(1) String arg0) {
		@Pc(15) int local15 = arg0.indexOf(0);
		if (local15 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local15 + " - cannot pjstr");
		}
		this.anInt9802 += Static467.method4894(arg0.length(), this.aByteArray104, this.anInt9802, arg0);
		this.aByteArray104[this.anInt9802++] = 0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLjava/lang/String;)V")
	public final void method7921(@OriginalArg(1) String arg0) {
		@Pc(14) int local14 = Static132.method2307(arg0);
		this.aByteArray104[this.anInt9802++] = 0;
		this.method7911(local14);
		this.anInt9802 += Static188.method3044(this.anInt9802, arg0, this.aByteArray104);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)V")
	public final void method7922(@OriginalArg(0) int arg0) {
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(II)V")
	public final void method7923(@OriginalArg(0) int arg0) {
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 8);
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
	public final void method7924(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt9802;
		this.anInt9802 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method7957(local12, local6);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(28) BigInteger local28 = local23.modPow(arg1, arg0);
		@Pc(31) byte[] local31 = local28.toByteArray();
		this.anInt9802 = 0;
		this.method7937(local31.length);
		this.method7973(local31.length, local31);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI[II)V")
	public final void method7925(@OriginalArg(2) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int local8 = this.anInt9802;
		this.anInt9802 = 5;
		@Pc(18) int local18 = (arg1 - 5) / 8;
		for (@Pc(25) int local25 = 0; local25 < local18; local25++) {
			@Pc(31) int local31 = this.method7940();
			@Pc(35) int local35 = this.method7940();
			@Pc(37) int local37 = -957401312;
			@Pc(41) int local41 = 32;
			while (local41-- > 0) {
				local35 -= local31 + (local31 >>> 5 ^ local31 << 4) ^ local37 - -arg0[local37 >>> 11 & 0x3];
				local37 -= -1640531527;
				local31 -= (local35 >>> 5 ^ local35 << 4) + local35 ^ arg0[local37 & 0x3] + local37;
			}
			this.anInt9802 -= 8;
			this.method7936(local31);
			this.method7936(local35);
		}
		this.anInt9802 = local8;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZI)V")
	public final void method7926(@OriginalArg(1) int arg0) {
		this.aByteArray104[this.anInt9802++] = (byte) arg0;
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 8);
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 16);
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)B")
	public final byte method7927() {
		return (byte) (128 - this.aByteArray104[this.anInt9802++]);
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)I")
	public final int method7928() {
		this.anInt9802 += 4;
		return ((this.aByteArray104[this.anInt9802 - 1] & 0xFF) << 24) + ((this.aByteArray104[this.anInt9802 - 2] & 0xFF) << 16) + ((this.aByteArray104[this.anInt9802 - 3] & 0xFF) << 8) + (this.aByteArray104[this.anInt9802 + -4] & 0xFF);
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)I")
	public final int method7929() {
		@Pc(21) byte local21 = this.aByteArray104[this.anInt9802++];
		@Pc(23) int local23 = 0;
		while (local21 < 0) {
			local23 = (local21 & 0x7F | local23) << 7;
			local21 = this.aByteArray104[this.anInt9802++];
		}
		return local21 | local23;
	}

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)I")
	public final int method7930() {
		this.anInt9802 += 2;
		@Pc(33) int local33 = ((this.aByteArray104[this.anInt9802 - 2] & 0xFF) << 8) + (this.aByteArray104[this.anInt9802 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)I")
	public final int method7931() {
		return -this.aByteArray104[this.anInt9802++] & 0xFF;
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(II)V")
	public final void method7932(@OriginalArg(1) int arg0) {
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 16);
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 8);
		this.aByteArray104[this.anInt9802++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(ZI)V")
	public final void method7933(@OriginalArg(1) int arg0) {
		this.aByteArray104[this.anInt9802++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(JI)V")
	public final void method7934(@OriginalArg(0) long arg0) {
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 56);
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 48);
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 40);
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 32);
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 24);
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 16);
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 8);
		this.aByteArray104[this.anInt9802++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)I")
	public final int method7935() {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = this.method7971();
		while (local11 == 32767) {
			local11 = this.method7971();
			local7 += 32767;
		}
		return local7 + local11;
	}

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "(II)V")
	public final void method7936(@OriginalArg(0) int arg0) {
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 24);
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 16);
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 8);
		this.aByteArray104[this.anInt9802++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "(II)V")
	public final void method7937(@OriginalArg(0) int arg0) {
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 8);
		this.aByteArray104[this.anInt9802++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(B)I")
	public final int method7938() {
		return 128 - this.aByteArray104[this.anInt9802++] & 0xFF;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public final String method7939() {
		@Pc(14) byte local14 = this.aByteArray104[this.anInt9802++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(34) int local34 = this.anInt9802;
		while (this.aByteArray104[this.anInt9802++] != 0) {
		}
		@Pc(56) int local56 = this.anInt9802 - local34 - 1;
		return local56 == 0 ? "" : Static8.method4852(local56, this.aByteArray104, local34);
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(Z)I")
	public final int method7940() {
		this.anInt9802 += 4;
		return (this.aByteArray104[this.anInt9802 - 1] & 0xFF) + ((this.aByteArray104[this.anInt9802 - 2] & 0xFF) << 8) + ((this.aByteArray104[this.anInt9802 - 4] & 0xFF) << 24) + ((this.aByteArray104[this.anInt9802 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(Z)V")
	public final void method7941() {
		if (this.aByteArray104 != null) {
			Static277.method4019(this.aByteArray104);
		}
		this.aByteArray104 = null;
	}

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "(I)I")
	public final int method7942() {
		this.anInt9802 += 2;
		@Pc(37) int local37 = ((this.aByteArray104[this.anInt9802 - 1] & 0xFF) << 8) + (this.aByteArray104[this.anInt9802 - 2] & 0xFF);
		if (local37 > 32767) {
			local37 -= 65536;
		}
		return local37;
	}

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "(I)I")
	public final int method7943() {
		return this.aByteArray104[this.anInt9802++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(IB)I")
	public final int method7944(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = Static420.method5960(arg0, this.anInt9802, this.aByteArray104);
		this.method7936(local16);
		return local16;
	}

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "(I)I")
	public final int method7945() {
		this.anInt9802 += 2;
		return ((this.aByteArray104[this.anInt9802 - 2] & 0xFF) << 8) + (this.aByteArray104[this.anInt9802 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(B)I")
	public final int method7946() {
		this.anInt9802 += 2;
		return (this.aByteArray104[this.anInt9802 - 2] - 128 & 0xFF) + ((this.aByteArray104[this.anInt9802 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "(II)V")
	public final void method7947(@OriginalArg(1) int arg0) {
		this.aByteArray104[this.anInt9802 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)V")
	public final void method7948(@OriginalArg(1) int arg0) {
		this.aByteArray104[this.anInt9802++] = (byte) arg0;
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "(I)J")
	public final long method7949() {
		@Pc(10) long local10 = (long) this.method7940() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method7940() & 0xFFFFFFFFL;
		return (local10 << 32) + local22;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public final void method7950(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr2");
		}
		this.aByteArray104[this.anInt9802++] = 0;
		this.anInt9802 += Static467.method4894(arg0.length(), this.aByteArray104, this.anInt9802, arg0);
		this.aByteArray104[this.anInt9802++] = 0;
	}

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "(B)Ljava/lang/String;")
	public final String method7951() {
		@Pc(6) int local6 = this.anInt9802;
		while (this.aByteArray104[this.anInt9802++] != 0) {
		}
		@Pc(29) int local29 = this.anInt9802 - local6 - 1;
		return local29 == 0 ? "" : Static8.method4852(local29, this.aByteArray104, local6);
	}

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "(B)I")
	public final int method7953() {
		this.anInt9802 += 4;
		return (this.aByteArray104[this.anInt9802 - 4] & 0xFF) + ((this.aByteArray104[this.anInt9802 - 2] & 0xFF) << 16) + ((this.aByteArray104[this.anInt9802 - 1] & 0xFF) << 24) + ((this.aByteArray104[this.anInt9802 + -3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(Z)Z")
	public final boolean method7954() {
		this.anInt9802 -= 4;
		@Pc(17) int local17 = Static420.method5960(0, this.anInt9802, this.aByteArray104);
		@Pc(21) int local21 = this.method7940();
		return local21 == local17;
	}

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "(B)I")
	public final int method7955() {
		@Pc(16) int local16 = this.aByteArray104[this.anInt9802] & 0xFF;
		return local16 >= 128 ? this.method7945() - 49152 : this.method7974() - 64;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(IB)V")
	public final void method7956(@OriginalArg(0) int arg0) {
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 8);
		this.aByteArray104[this.anInt9802++] = (byte) arg0;
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 24);
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([BIBI)V")
	public final void method7957(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = this.aByteArray104[this.anInt9802++];
		}
	}

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "(B)I")
	public final int method7958() {
		this.anInt9802 += 4;
		return ((this.aByteArray104[this.anInt9802 - 1] & 0xFF) << 8) + ((this.aByteArray104[this.anInt9802 - 4] & 0xFF) << 16) + ((this.aByteArray104[this.anInt9802 + -3] & 0xFF) << 24) + (this.aByteArray104[this.anInt9802 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "(II)V")
	public final void method7959(@OriginalArg(1) int arg0) {
		this.aByteArray104[this.anInt9802++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(IB)V")
	public final void method7960(@OriginalArg(0) int arg0) {
		this.aByteArray104[this.anInt9802++] = (byte) arg0;
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 8);
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 16);
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "(I)Ljava/lang/String;")
	public final String method7961() {
		if (this.aByteArray104[this.anInt9802] == 0) {
			this.anInt9802++;
			return null;
		} else {
			return this.method7951();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIJ)V")
	public final void method7962(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(24) int local24 = local2 * 8; local24 >= 0; local24 -= 8) {
			this.aByteArray104[this.anInt9802++] = (byte) (arg1 >> local24);
		}
	}

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "(I)B")
	public final byte method7963() {
		return this.aByteArray104[this.anInt9802++];
	}

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "(II)V")
	public final void method7964(@OriginalArg(0) int arg0) {
		this.aByteArray104[this.anInt9802 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray104[this.anInt9802 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray104[this.anInt9802 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray104[this.anInt9802 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(IB)V")
	public final void method7965(@OriginalArg(0) int arg0) {
		this.aByteArray104[this.anInt9802 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray104[this.anInt9802 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "(I)I")
	public final int method7966() {
		this.anInt9802 += 3;
		@Pc(51) int local51 = ((this.aByteArray104[this.anInt9802 - 3] & 0xFF) << 16) + ((this.aByteArray104[this.anInt9802 - 2] & 0xFF) << 8) + (this.aByteArray104[this.anInt9802 - 1] & 0xFF);
		if (local51 > 8388607) {
			local51 -= 16777216;
		}
		return local51;
	}

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "(I)I")
	public final int method7967() {
		this.anInt9802 += 2;
		return (this.aByteArray104[this.anInt9802 - 2] & 0xFF) + ((this.aByteArray104[this.anInt9802 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "(B)I")
	public final int method7968() {
		this.anInt9802 += 3;
		return ((this.aByteArray104[this.anInt9802 - 3] & 0xFF) << 16) - (-((this.aByteArray104[this.anInt9802 - 1] & 0xFF) << 8) - (this.aByteArray104[this.anInt9802 - 2] & 0xFF));
	}

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "(II)V")
	public final void method7969(@OriginalArg(1) int arg0) {
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 16);
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 24);
		this.aByteArray104[this.anInt9802++] = (byte) arg0;
		this.aByteArray104[this.anInt9802++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "(B)B")
	public final byte method7970() {
		return (byte) (this.aByteArray104[this.anInt9802++] - 128);
	}

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "(B)I")
	public final int method7971() {
		@Pc(16) int local16 = this.aByteArray104[this.anInt9802] & 0xFF;
		return local16 >= 128 ? this.method7945() - 32768 : this.method7974();
	}

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "(B)I")
	public final int method7972() {
		@Pc(16) int local16 = Static420.method5960(0, this.anInt9802, this.aByteArray104);
		this.method7936(local16);
		return local16;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[BI)V")
	public final void method7973(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aByteArray104[this.anInt9802++] = arg1[local3];
		}
	}

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "(B)I")
	public final int method7974() {
		return this.aByteArray104[this.anInt9802++] & 0xFF;
	}

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "(Z)I")
	public final int method7975() {
		this.anInt9802 += 2;
		@Pc(32) int local32 = ((this.aByteArray104[this.anInt9802 - 2] & 0xFF) << 8) + (this.aByteArray104[this.anInt9802 - 1] & 0xFF);
		if (local32 > 32767) {
			local32 -= 65536;
		}
		return local32;
	}

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "(B)B")
	public final byte method7976() {
		return (byte) -this.aByteArray104[this.anInt9802++];
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(IB)V")
	public final void method7977(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method7917(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method7937(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
