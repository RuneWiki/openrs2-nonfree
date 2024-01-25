import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public class Class4_Sub30 extends Class4 {

	@OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
	public int anInt6244 = 0;

	@OriginalMember(owner = "client!tl", name = "x", descriptor = "[B")
	public byte[] aByteArray79;

	static {
		new Class242("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
		new Class242("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(I)V")
	public Class4_Sub30(@OriginalArg(0) int arg0) {
		this.aByteArray79 = Static96.method1569(arg0);
	}

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "([B)V")
	public Class4_Sub30(@OriginalArg(0) byte[] arg0) {
		this.aByteArray79 = arg0;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)I")
	public final int method4827() {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = this.method4844();
		while (local16 == 32767) {
			local16 = this.method4844();
			local7 += 32767;
		}
		return local7 + local16;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
	public final void method4828(@OriginalArg(1) int arg0) {
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 + 128);
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)I")
	public final int method4829() {
		return -this.aByteArray79[this.anInt6244++] & 0xFF;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)V")
	public final void method4830(@OriginalArg(1) int arg0) {
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 16);
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 8);
		this.aByteArray79[this.anInt6244++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)I")
	public final int method4832() {
		this.anInt6244 += 2;
		@Pc(38) int local38 = ((this.aByteArray79[this.anInt6244 - 2] & 0xFF) << 8) + (this.aByteArray79[this.anInt6244 - 1] - 128 & 0xFF);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)I")
	public final int method4833() {
		@Pc(25) byte local25 = this.aByteArray79[this.anInt6244++];
		@Pc(27) int local27 = 0;
		while (local25 < 0) {
			local27 = (local27 | local25 & 0x7F) << 7;
			local25 = this.aByteArray79[this.anInt6244++];
		}
		return local25 | local27;
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(II)V")
	public final void method4834(@OriginalArg(1) int arg0) {
		this.aByteArray79[this.anInt6244++] = (byte) arg0;
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 8);
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 16);
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZ)V")
	public final void method4835(@OriginalArg(0) int arg0) {
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 8);
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)Ljava/lang/String;")
	public final String method4836() {
		if (this.aByteArray79[this.anInt6244] == 0) {
			this.anInt6244++;
			return null;
		} else {
			return this.method4867();
		}
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(B)I")
	public final int method4837() {
		this.anInt6244 += 4;
		return ((this.aByteArray79[this.anInt6244 - 1] & 0xFF) << 8) + ((this.aByteArray79[this.anInt6244 - 3] & 0xFF) << 24) + ((this.aByteArray79[this.anInt6244 + -4] & 0xFF) << 16) + (this.aByteArray79[this.anInt6244 + -2] & 0xFF);
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(II)V")
	public final void method4839(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method4871(arg0 >>> 28 | 0x80);
					}
					this.method4871(arg0 >>> 21 | 0x80);
				}
				this.method4871(arg0 >>> 14 | 0x80);
			}
			this.method4871(arg0 >>> 7 | 0x80);
		}
		this.method4871(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZI)V")
	public final void method4840(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method4871(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method4846(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)Z")
	public final boolean method4841() {
		this.anInt6244 -= 4;
		@Pc(22) int local22 = Static331.method4495(0, this.anInt6244, this.aByteArray79);
		@Pc(26) int local26 = this.method4872();
		return local26 == local22;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(IZ)V")
	public final void method4842(@OriginalArg(0) int arg0) {
		this.aByteArray79[this.anInt6244 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I[BZI)V")
	public final void method4843(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			this.aByteArray79[this.anInt6244++] = arg0[local7];
		}
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(Z)I")
	public final int method4844() {
		@Pc(18) int local18 = this.aByteArray79[this.anInt6244] & 0xFF;
		return local18 >= 128 ? this.method4877() - 32768 : this.method4864();
	}

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)I")
	public final int method4845() {
		this.anInt6244 += 2;
		@Pc(38) int local38 = (this.aByteArray79[this.anInt6244 - 2] - 128 & 0xFF) + ((this.aByteArray79[this.anInt6244 - 1] & 0xFF) << 8);
		if (local38 > 32767) {
			local38 -= 65536;
		}
		return local38;
	}

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "(II)V")
	public final void method4846(@OriginalArg(0) int arg0) {
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 8);
		this.aByteArray79[this.anInt6244++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "(B)Ljava/lang/String;")
	public final String method4847() {
		@Pc(14) byte local14 = this.aByteArray79[this.anInt6244++];
		if (local14 != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		@Pc(27) int local27 = this.anInt6244;
		while (this.aByteArray79[this.anInt6244++] != 0) {
		}
		@Pc(50) int local50 = this.anInt6244 - local27 - 1;
		return local50 == 0 ? "" : Static166.method2458(this.aByteArray79, local27, local50);
	}

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "(II)V")
	public final void method4848(@OriginalArg(0) int arg0) {
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/String;)V")
	public final void method4849(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = arg0.indexOf(0);
		if (local7 >= 0) {
			throw new IllegalArgumentException("NUL character at " + local7 + " - cannot pjstr");
		}
		this.anInt6244 += Static281.method3756(this.aByteArray79, arg0, arg0.length(), this.anInt6244);
		this.aByteArray79[this.anInt6244++] = 0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
	public final void method4850(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(6) int local6 = this.anInt6244;
		this.anInt6244 = 0;
		@Pc(12) byte[] local12 = new byte[local6];
		this.method4863(local6, local12);
		@Pc(23) BigInteger local23 = new BigInteger(local12);
		@Pc(33) BigInteger local33 = local23.modPow(arg0, arg1);
		@Pc(36) byte[] local36 = local33.toByteArray();
		this.anInt6244 = 0;
		this.method4871(local36.length);
		this.method4843(local36, local36.length);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II[BI)V")
	public final void method4851(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(12) int local12 = arg1 - 1; local12 >= 0; local12--) {
			arg0[local12] = (byte) (this.aByteArray79[this.anInt6244++] - 128);
		}
	}

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "(B)I")
	public final int method4852() {
		this.anInt6244 += 2;
		return ((this.aByteArray79[this.anInt6244 - 1] & 0xFF) << 8) + (this.aByteArray79[this.anInt6244 - 2] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "(I)J")
	public final long method4853() {
		@Pc(15) long local15 = (long) this.method4872() & 0xFFFFFFFFL;
		@Pc(22) long local22 = (long) this.method4872() & 0xFFFFFFFFL;
		return local22 + (local15 << 32);
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(Z)I")
	public final int method4854() {
		return 128 - this.aByteArray79[this.anInt6244++] & 0xFF;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIJ)V")
	public final void method4855(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(2) int local2 = arg0 - 1;
		if (local2 < 0 || local2 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(27) int local27 = local2 * 8; local27 >= 0; local27 -= 8) {
			this.aByteArray79[this.anInt6244++] = (byte) (arg1 >> local27);
		}
	}

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "(I)I")
	public final int method4856() {
		this.anInt6244 += 2;
		return ((this.aByteArray79[this.anInt6244 - 2] & 0xFF) << 8) + (this.aByteArray79[this.anInt6244 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "(II)V")
	public final void method4857(@OriginalArg(1) int arg0) {
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 8);
		this.aByteArray79[this.anInt6244++] = (byte) arg0;
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 24);
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)J")
	public final long method4858(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 - 1;
		if (local13 < 0 || local13 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(31) int local31 = local13 * 8;
		@Pc(33) long local33 = 0L;
		while (local31 >= 0) {
			local33 |= ((long) this.aByteArray79[this.anInt6244++] & 0xFFL) << local31;
			local31 -= 8;
		}
		return local33;
	}

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "(II)V")
	public final void method4859(@OriginalArg(0) int arg0) {
		this.aByteArray79[this.anInt6244 - arg0 - 4] = (byte) (arg0 >> 24);
		this.aByteArray79[this.anInt6244 - arg0 - 3] = (byte) (arg0 >> 16);
		this.aByteArray79[this.anInt6244 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray79[this.anInt6244 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(JZ)V")
	public final void method4860(@OriginalArg(0) long arg0) {
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 56);
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 48);
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 40);
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 32);
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 24);
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 16);
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 8);
		this.aByteArray79[this.anInt6244++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "(II)V")
	public final void method4861(@OriginalArg(1) int arg0) {
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 24);
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 16);
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 8);
		this.aByteArray79[this.anInt6244++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "(B)I")
	public final int method4862() {
		@Pc(19) int local19 = this.aByteArray79[this.anInt6244] & 0xFF;
		return local19 >= 128 ? this.method4877() - 49152 : this.method4864() + -64;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIZ[B)V")
	public final void method4863(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			arg1[local13] = this.aByteArray79[this.anInt6244++];
		}
	}

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "(B)I")
	public final int method4864() {
		return this.aByteArray79[this.anInt6244++] & 0xFF;
	}

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "(B)B")
	public final byte method4865() {
		return this.aByteArray79[this.anInt6244++];
	}

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "(I)B")
	public final byte method4866() {
		return (byte) -this.aByteArray79[this.anInt6244++];
	}

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "(I)Ljava/lang/String;")
	public final String method4867() {
		@Pc(11) int local11 = this.anInt6244;
		while (this.aByteArray79[this.anInt6244++] != 0) {
		}
		@Pc(33) int local33 = this.anInt6244 - local11 - 1;
		return local33 == 0 ? "" : Static166.method2458(this.aByteArray79, local11, local33);
	}

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "(B)I")
	public final int method4868() {
		this.anInt6244 += 3;
		return (this.aByteArray79[this.anInt6244 - 2] & 0xFF) + ((this.aByteArray79[this.anInt6244 - 1] & 0xFF) << 8) + ((this.aByteArray79[this.anInt6244 + -3] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I[IBI)V")
	public final void method4869(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1) {
		@Pc(16) int local16 = this.anInt6244;
		this.anInt6244 = 5;
		@Pc(26) int local26 = (arg1 - 5) / 8;
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = this.method4872();
			@Pc(38) int local38 = this.method4872();
			@Pc(40) int local40 = -957401312;
			@Pc(44) int local44 = 32;
			while (local44-- > 0) {
				local38 -= arg0[local40 >>> 11 & 0x10C00003] + local40 ^ (local34 >>> 5 ^ local34 << 4) - -local34;
				local40 -= -1640531527;
				local34 -= local40 + arg0[local40 & 0x3] ^ (local38 << 4 ^ local38 >>> 5) - -local38;
			}
			this.anInt6244 -= 8;
			this.method4861(local34);
			this.method4861(local38);
		}
		this.anInt6244 = local16;
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(IZ)V")
	public final void method4871(@OriginalArg(0) int arg0) {
		this.aByteArray79[this.anInt6244++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "(B)I")
	public final int method4872() {
		this.anInt6244 += 4;
		return ((this.aByteArray79[this.anInt6244 - 4] & 0xFF) << 24) + ((this.aByteArray79[this.anInt6244 - 3] & 0xFF) << 16) + ((this.aByteArray79[this.anInt6244 + -2] & 0xFF) << 8) + (this.aByteArray79[this.anInt6244 + -1] & 0xFF);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "([IB)V")
	public final void method4873(@OriginalArg(0) int[] arg0) {
		@Pc(10) int local10 = this.anInt6244 / 8;
		this.anInt6244 = 0;
		for (@Pc(15) int local15 = 0; local15 < local10; local15++) {
			@Pc(26) int local26 = this.method4872();
			@Pc(30) int local30 = this.method4872();
			@Pc(32) int local32 = 0;
			@Pc(36) int local36 = 32;
			while (local36-- > 0) {
				local26 += arg0[local32 & 0x3] + local32 ^ local30 + (local30 << 4 ^ local30 >>> 5);
				local32 += -1640531527;
				local30 += arg0[local32 >>> 11 & 0x3] + local32 ^ local26 + (local26 << 4 ^ local26 >>> 5);
			}
			this.anInt6244 -= 8;
			this.method4861(local26);
			this.method4861(local30);
		}
	}

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "(II)V")
	public final void method4874(@OriginalArg(1) int arg0) {
		this.aByteArray79[this.anInt6244++] = (byte) arg0;
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BI)V")
	public final void method4875(@OriginalArg(1) int arg0) {
		this.aByteArray79[this.anInt6244++] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "(I)B")
	public final byte method4876() {
		return (byte) (128 - this.aByteArray79[this.anInt6244++]);
	}

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "(I)I")
	public final int method4877() {
		this.anInt6244 += 2;
		return (this.aByteArray79[this.anInt6244 - 1] & 0xFF) + ((this.aByteArray79[this.anInt6244 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "(II)V")
	public final void method4878(@OriginalArg(0) int arg0) {
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 16);
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 24);
		this.aByteArray79[this.anInt6244++] = (byte) arg0;
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "(I)B")
	public final byte method4879() {
		return (byte) (this.aByteArray79[this.anInt6244++] - 128);
	}

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "(I)I")
	public final int method4880() {
		this.anInt6244 += 2;
		return ((this.aByteArray79[this.anInt6244 - 1] & 0xFF) << 8) + (this.aByteArray79[this.anInt6244 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(BI)V")
	public final void method4881(@OriginalArg(1) int arg0) {
		this.aByteArray79[this.anInt6244++] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "(I)I")
	public final int method4882() {
		return this.aByteArray79[this.anInt6244++] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(BI)V")
	public final void method4883(@OriginalArg(1) int arg0) {
		this.aByteArray79[this.anInt6244++] = (byte) arg0;
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "(II)V")
	public final void method4884(@OriginalArg(1) int arg0) {
		this.aByteArray79[this.anInt6244 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray79[this.anInt6244 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(IB)I")
	public final int method4885(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = Static331.method4495(arg0, this.anInt6244, this.aByteArray79);
		this.method4861(local19);
		return local19;
	}

	@OriginalMember(owner = "client!tl", name = "p", descriptor = "(I)I")
	public final int method4886() {
		this.anInt6244 += 4;
		return ((this.aByteArray79[this.anInt6244 - 3] & 0xFF) << 8) + ((this.aByteArray79[this.anInt6244 - 2] & 0xFF) << 16) + ((this.aByteArray79[this.anInt6244 + -1] & 0xFF) << 24) + (this.aByteArray79[this.anInt6244 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "(I)I")
	public final int method4887() {
		this.anInt6244 += 3;
		return ((this.aByteArray79[this.anInt6244 - 3] & 0xFF) << 16) + ((this.aByteArray79[this.anInt6244 - 2] & 0xFF) << 8) + (this.aByteArray79[this.anInt6244 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!tl", name = "r", descriptor = "(I)I")
	public final int method4888() {
		this.anInt6244 += 4;
		return (this.aByteArray79[this.anInt6244 - 3] & 0xFF) + ((this.aByteArray79[this.anInt6244 - 1] & 0xFF) << 16) + ((this.aByteArray79[this.anInt6244 + -2] & 0xFF) << 24) + ((this.aByteArray79[this.anInt6244 + -4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "(B)I")
	public final int method4889() {
		this.anInt6244 += 2;
		@Pc(39) int local39 = ((this.aByteArray79[this.anInt6244 - 2] & 0xFF) << 8) + (this.aByteArray79[this.anInt6244 - 1] & 0xFF);
		if (local39 > 32767) {
			local39 -= 65536;
		}
		return local39;
	}

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "(II)V")
	public final void method4890(@OriginalArg(0) int arg0) {
		this.aByteArray79[this.anInt6244++] = (byte) arg0;
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 8);
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 16);
		this.aByteArray79[this.anInt6244++] = (byte) (arg0 >> 24);
	}
}
