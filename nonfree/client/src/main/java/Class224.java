import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class224 {

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "Lclient!ud;")
	private Class2_Sub34 aClass2_Sub34_13;

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "[Lclient!rfa;")
	private Class167_Sub1[] aClass167_Sub1Array2;

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "Lclient!kha;")
	private final Class190 aClass190_2;

	@OriginalMember(owner = "client!mr", name = "m", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger6;

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger5;

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "Lclient!tl;")
	private final Class325 aClass325_1;

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "Lclient!gq;")
	private Class2_Sub5_Sub6_Sub1 aClass2_Sub5_Sub6_Sub1_2;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!kha;Lclient!tl;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class224(@OriginalArg(0) Class190 arg0, @OriginalArg(1) Class325 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass190_2 = arg0;
		this.aBigInteger6 = arg2;
		this.aBigInteger5 = arg3;
		this.aClass325_1 = arg1;
		if (!this.aClass190_2.method4613()) {
			this.aClass2_Sub5_Sub6_Sub1_2 = this.aClass190_2.method4607((byte) 0, 255, 255, true);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!pk;ILclient!pk;IZ)Lclient!rfa;")
	private Class167_Sub1 method5480(@OriginalArg(0) Class262 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class262 arg2) {
		if (this.aClass2_Sub34_13 == null) {
			throw new RuntimeException();
		} else if (arg1 < 0 || arg1 >= this.aClass167_Sub1Array2.length) {
			throw new RuntimeException();
		} else if (this.aClass167_Sub1Array2[arg1] == null) {
			this.aClass2_Sub34_13.anInt8188 = arg1 * 72 + 6;
			@Pc(55) int local55 = this.aClass2_Sub34_13.method6865();
			@Pc(60) int local60 = this.aClass2_Sub34_13.method6865();
			@Pc(63) byte[] local63 = new byte[64];
			this.aClass2_Sub34_13.method6891(local63, 64, 0);
			@Pc(85) Class167_Sub1 local85 = new Class167_Sub1(arg1, arg0, arg2, this.aClass190_2, this.aClass325_1, local55, local63, local60, true);
			this.aClass167_Sub1Array2[arg1] = local85;
			return local85;
		} else {
			return this.aClass167_Sub1Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZLclient!pk;ILclient!pk;)Lclient!rfa;")
	public Class167_Sub1 method5481(@OriginalArg(1) Class262 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class262 arg2) {
		return this.method5480(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
	public void method5482() {
		if (this.aClass167_Sub1Array2 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.aClass167_Sub1Array2.length; local19++) {
			if (this.aClass167_Sub1Array2[local19] != null) {
				this.aClass167_Sub1Array2[local19].method6965();
			}
		}
		for (@Pc(44) int local44 = 0; local44 < this.aClass167_Sub1Array2.length; local44++) {
			if (this.aClass167_Sub1Array2[local44] != null) {
				this.aClass167_Sub1Array2[local44].method6964();
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)Z")
	public boolean method5483() {
		if (this.aClass2_Sub34_13 != null) {
			return true;
		}
		if (this.aClass2_Sub5_Sub6_Sub1_2 == null) {
			if (this.aClass190_2.method4613()) {
				return false;
			}
			this.aClass2_Sub5_Sub6_Sub1_2 = this.aClass190_2.method4607((byte) 0, 255, 255, true);
		}
		if (this.aClass2_Sub5_Sub6_Sub1_2.aBoolean400) {
			return false;
		}
		@Pc(42) Class2_Sub34 local42 = new Class2_Sub34(this.aClass2_Sub5_Sub6_Sub1_2.method4188());
		local42.anInt8188 = 5;
		@Pc(49) int local49 = local42.method6904();
		local42.anInt8188 += local49 * 72;
		@Pc(66) byte[] local66 = new byte[local42.aByteArray77.length - local42.anInt8188];
		local42.method6891(local66, local66.length, 0);
		@Pc(81) byte[] local81;
		if (this.aBigInteger6 == null || this.aBigInteger5 == null) {
			local81 = local66;
		} else {
			@Pc(87) BigInteger local87 = new BigInteger(local66);
			@Pc(94) BigInteger local94 = local87.modPow(this.aBigInteger6, this.aBigInteger5);
			local81 = local94.toByteArray();
		}
		if (local81.length != 65) {
			throw new RuntimeException();
		}
		@Pc(121) byte[] local121 = Static575.method7996(local42.anInt8188 - local66.length - 5, local42.aByteArray77, 5);
		for (@Pc(123) int local123 = 0; local123 < 64; local123++) {
			if (local81[local123 + 1] != local121[local123]) {
				throw new RuntimeException();
			}
		}
		this.aClass167_Sub1Array2 = new Class167_Sub1[local49];
		this.aClass2_Sub34_13 = local42;
		return true;
	}
}
