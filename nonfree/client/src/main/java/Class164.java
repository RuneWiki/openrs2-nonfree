import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class164 {

	@OriginalMember(owner = "client!js", name = "a", descriptor = "[Lclient!mn;")
	private Class210_Sub1[] aClass210_Sub1Array4;

	@OriginalMember(owner = "client!js", name = "d", descriptor = "Lclient!ig;")
	private Class8_Sub8 aClass8_Sub8_7;

	@OriginalMember(owner = "client!js", name = "e", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger6;

	@OriginalMember(owner = "client!js", name = "g", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger7;

	@OriginalMember(owner = "client!js", name = "m", descriptor = "Lclient!gd;")
	private final Class113 aClass113_1;

	@OriginalMember(owner = "client!js", name = "o", descriptor = "Lclient!oj;")
	private final Class239 aClass239_1;

	@OriginalMember(owner = "client!js", name = "b", descriptor = "Lclient!oe;")
	private Class8_Sub5_Sub13_Sub1 aClass8_Sub5_Sub13_Sub1_2;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lclient!gd;Lclient!oj;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class164(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class239 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger6 = arg3;
		this.aBigInteger7 = arg2;
		this.aClass113_1 = arg0;
		this.aClass239_1 = arg1;
		if (!this.aClass113_1.method3339()) {
			this.aClass8_Sub5_Sub13_Sub1_2 = this.aClass113_1.method3335(255, (byte) 0, 255, true);
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
	public void method4607() {
		if (this.aClass210_Sub1Array4 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.aClass210_Sub1Array4.length; local17++) {
			if (this.aClass210_Sub1Array4[local17] != null) {
				this.aClass210_Sub1Array4[local17].method5516();
			}
		}
		for (@Pc(40) int local40 = 0; local40 < this.aClass210_Sub1Array4.length; local40++) {
			if (this.aClass210_Sub1Array4[local40] != null) {
				this.aClass210_Sub1Array4[local40].method5509();
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!rfa;BLclient!rfa;)Lclient!mn;")
	public Class210_Sub1 method4610(@OriginalArg(0) int arg0, @OriginalArg(1) Class291 arg1, @OriginalArg(3) Class291 arg2) {
		return this.method4613(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!js", name = "d", descriptor = "(I)Z")
	public boolean method4611() {
		if (this.aClass8_Sub8_7 != null) {
			return true;
		}
		if (this.aClass8_Sub5_Sub13_Sub1_2 == null) {
			if (this.aClass113_1.method3339()) {
				return false;
			}
			this.aClass8_Sub5_Sub13_Sub1_2 = this.aClass113_1.method3335(255, (byte) 0, 255, true);
		}
		if (this.aClass8_Sub5_Sub13_Sub1_2.aBoolean624) {
			return false;
		}
		@Pc(44) Class8_Sub8 local44 = new Class8_Sub8(this.aClass8_Sub5_Sub13_Sub1_2.method7301());
		local44.anInt10588 = 5;
		@Pc(58) int local58 = local44.method8525();
		local44.anInt10588 += local58 * 72;
		@Pc(75) byte[] local75 = new byte[local44.aByteArray107.length - local44.anInt10588];
		local44.method8563(0, local75, local75.length);
		@Pc(103) byte[] local103;
		if (this.aBigInteger7 == null || this.aBigInteger6 == null) {
			local103 = local75;
		} else {
			@Pc(93) BigInteger local93 = new BigInteger(local75);
			@Pc(100) BigInteger local100 = local93.modPow(this.aBigInteger7, this.aBigInteger6);
			local103 = local100.toByteArray();
		}
		if (local103.length != 65) {
			throw new RuntimeException();
		}
		@Pc(129) byte[] local129 = Static212.method4042(5, local44.anInt10588 - local75.length - 5, local44.aByteArray107);
		for (@Pc(131) int local131 = 0; local131 < 64; local131++) {
			if (local129[local131] != local103[local131 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass8_Sub8_7 = local44;
		this.aClass210_Sub1Array4 = new Class210_Sub1[local58];
		return true;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZILclient!rfa;ILclient!rfa;)Lclient!mn;")
	private Class210_Sub1 method4613(@OriginalArg(1) int arg0, @OriginalArg(2) Class291 arg1, @OriginalArg(4) Class291 arg2) {
		if (this.aClass8_Sub8_7 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || this.aClass210_Sub1Array4.length <= arg0) {
			throw new RuntimeException();
		} else if (this.aClass210_Sub1Array4[arg0] == null) {
			this.aClass8_Sub8_7.anInt10588 = arg0 * 72 + 6;
			@Pc(56) int local56 = this.aClass8_Sub8_7.method8540();
			@Pc(61) int local61 = this.aClass8_Sub8_7.method8540();
			@Pc(64) byte[] local64 = new byte[64];
			this.aClass8_Sub8_7.method8563(0, local64, 64);
			@Pc(86) Class210_Sub1 local86 = new Class210_Sub1(arg0, arg2, arg1, this.aClass113_1, this.aClass239_1, local56, local64, local61, true);
			this.aClass210_Sub1Array4[arg0] = local86;
			return local86;
		} else {
			return this.aClass210_Sub1Array4[arg0];
		}
	}
}
