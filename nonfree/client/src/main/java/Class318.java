import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public final class Class318 {

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "[Lclient!hba;")
	private Class147_Sub1[] aClass147_Sub1Array2;

	@OriginalMember(owner = "client!rba", name = "l", descriptor = "Lclient!et;")
	private Class2_Sub20 aClass2_Sub20_10;

	@OriginalMember(owner = "client!rba", name = "f", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger29;

	@OriginalMember(owner = "client!rba", name = "n", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger28;

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "Lclient!dw;")
	private final Class92 aClass92_3;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "Lclient!qfa;")
	private final Class309 aClass309_3;

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "Lclient!as;")
	private Class2_Sub6_Sub1_Sub1 aClass2_Sub6_Sub1_Sub1_2;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!qfa;Lclient!dw;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class318(@OriginalArg(0) Class309 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger29 = arg3;
		this.aBigInteger28 = arg2;
		this.aClass92_3 = arg1;
		this.aClass309_3 = arg0;
		if (!this.aClass309_3.method7256()) {
			this.aClass2_Sub6_Sub1_Sub1_2 = this.aClass309_3.method7259(255, (byte) 0, true, 255);
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!wia;Lclient!wia;IIZ)Lclient!hba;")
	private Class147_Sub1 method7559(@OriginalArg(0) Class402 arg0, @OriginalArg(1) Class402 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass2_Sub20_10 == null) {
			throw new RuntimeException();
		} else if (arg2 < 0 || arg2 >= this.aClass147_Sub1Array2.length) {
			throw new RuntimeException();
		} else if (this.aClass147_Sub1Array2[arg2] == null) {
			this.aClass2_Sub20_10.anInt9723 = arg2 * 72 + 6;
			@Pc(56) int local56 = this.aClass2_Sub20_10.method8555(-9372);
			@Pc(61) int local61 = this.aClass2_Sub20_10.method8555(-9372);
			@Pc(64) byte[] local64 = new byte[64];
			this.aClass2_Sub20_10.method8573(64, 0, local64);
			@Pc(86) Class147_Sub1 local86 = new Class147_Sub1(arg2, arg0, arg1, this.aClass309_3, this.aClass92_3, local56, local64, local61, true);
			this.aClass147_Sub1Array2[arg2] = local86;
			return local86;
		} else {
			return this.aClass147_Sub1Array2[arg2];
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
	public void method7561() {
		if (this.aClass147_Sub1Array2 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aClass147_Sub1Array2.length; local12++) {
			if (this.aClass147_Sub1Array2[local12] != null) {
				this.aClass147_Sub1Array2[local12].method3251(-29973);
			}
		}
		if (50 != 50) {
			return;
		}
		for (@Pc(48) int local48 = 0; local48 < this.aClass147_Sub1Array2.length; local48++) {
			if (this.aClass147_Sub1Array2[local48] != null) {
				this.aClass147_Sub1Array2[local48].method3250();
			}
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!wia;Lclient!wia;BI)Lclient!hba;")
	public Class147_Sub1 method7562(@OriginalArg(0) Class402 arg0, @OriginalArg(1) Class402 arg1, @OriginalArg(3) int arg2) {
		return this.method7559(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(B)Z")
	public boolean method7565() {
		if (this.aClass2_Sub20_10 != null) {
			return true;
		}
		if (this.aClass2_Sub6_Sub1_Sub1_2 == null) {
			if (this.aClass309_3.method7256()) {
				return false;
			}
			this.aClass2_Sub6_Sub1_Sub1_2 = this.aClass309_3.method7259(255, (byte) 0, true, 255);
		}
		if (this.aClass2_Sub6_Sub1_Sub1_2.aBoolean842) {
			return false;
		}
		@Pc(51) Class2_Sub20 local51 = new Class2_Sub20(this.aClass2_Sub6_Sub1_Sub1_2.method8700());
		local51.anInt9723 = 5;
		@Pc(60) int local60 = local51.method8581(-17416);
		local51.anInt9723 += local60 * 72;
		@Pc(83) byte[] local83 = new byte[local51.aByteArray111.length - local51.anInt9723];
		local51.method8573(local83.length, 0, local83);
		@Pc(113) byte[] local113;
		if (this.aBigInteger28 == null || this.aBigInteger29 == null) {
			local113 = local83;
		} else {
			@Pc(103) BigInteger local103 = new BigInteger(local83);
			@Pc(110) BigInteger local110 = local103.modPow(this.aBigInteger28, this.aBigInteger29);
			local113 = local110.toByteArray();
		}
		if (local113.length != 65) {
			throw new RuntimeException();
		}
		@Pc(142) byte[] local142 = Static323.method4463(local51.aByteArray111, 5, local51.anInt9723 - local83.length - 5);
		for (@Pc(144) int local144 = 0; local144 < 64; local144++) {
			if (local113[local144 + 1] != local142[local144]) {
				throw new RuntimeException();
			}
		}
		this.aClass147_Sub1Array2 = new Class147_Sub1[local60];
		this.aClass2_Sub20_10 = local51;
		return true;
	}
}
