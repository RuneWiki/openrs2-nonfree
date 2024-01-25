import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class182 {

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "[Lclient!vba;")
	private Class131_Sub1[] aClass131_Sub1Array1;

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "Lclient!ge;")
	private Class1_Sub6 aClass1_Sub6_6;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger4;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "Lclient!gw;")
	private final Class114 aClass114_1;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "Lclient!bw;")
	private final Class38 aClass38_2;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger3;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "Lclient!fca;")
	private Class1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub4_Sub1_2;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!gw;Lclient!bw;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class182(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class38 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger4 = arg2;
		this.aClass114_1 = arg0;
		this.aClass38_2 = arg1;
		this.aBigInteger3 = arg3;
		if (!this.aClass114_1.method2594()) {
			this.aClass1_Sub1_Sub4_Sub1_2 = this.aClass114_1.method2603((byte) 0, 255, 255, true);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)Z")
	public boolean method4471() {
		if (this.aClass1_Sub6_6 != null) {
			return true;
		}
		if (this.aClass1_Sub1_Sub4_Sub1_2 == null) {
			if (this.aClass114_1.method2594()) {
				return false;
			}
			this.aClass1_Sub1_Sub4_Sub1_2 = this.aClass114_1.method2603((byte) 0, 255, 255, true);
		}
		if (this.aClass1_Sub1_Sub4_Sub1_2.aBoolean639) {
			return false;
		}
		@Pc(44) Class1_Sub6 local44 = new Class1_Sub6(this.aClass1_Sub1_Sub4_Sub1_2.method7512());
		local44.anInt4555 = 5;
		@Pc(51) int local51 = local44.method3922();
		local44.anInt4555 += local51 * 72;
		@Pc(68) byte[] local68 = new byte[local44.aByteArray66.length - local44.anInt4555];
		local44.method3963(local68, local68.length);
		@Pc(83) byte[] local83;
		if (this.aBigInteger4 == null || this.aBigInteger3 == null) {
			local83 = local68;
		} else {
			@Pc(90) BigInteger local90 = new BigInteger(local68);
			@Pc(97) BigInteger local97 = local90.modPow(this.aBigInteger4, this.aBigInteger3);
			local83 = local97.toByteArray();
		}
		if (local83.length != 65) {
			throw new RuntimeException();
		}
		@Pc(129) byte[] local129 = Static464.method4175(local44.anInt4555 - local68.length - 5, 5, local44.aByteArray66);
		for (@Pc(131) int local131 = 0; local131 < 64; local131++) {
			if (local129[local131] != local83[local131 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass1_Sub6_6 = local44;
		this.aClass131_Sub1Array1 = new Class131_Sub1[local51];
		return true;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!km;ILclient!km;Z)Lclient!vba;")
	private Class131_Sub1 method4472(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(3) Class167 arg2) {
		if (this.aClass1_Sub6_6 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass131_Sub1Array1.length) {
			throw new RuntimeException();
		} else if (this.aClass131_Sub1Array1[arg0] == null) {
			this.aClass1_Sub6_6.anInt4555 = arg0 * 72 + 6;
			@Pc(53) int local53 = this.aClass1_Sub6_6.method3925();
			@Pc(58) int local58 = this.aClass1_Sub6_6.method3925();
			@Pc(61) byte[] local61 = new byte[64];
			this.aClass1_Sub6_6.method3963(local61, 64);
			@Pc(83) Class131_Sub1 local83 = new Class131_Sub1(arg0, arg1, arg2, this.aClass114_1, this.aClass38_2, local53, local61, local58, true);
			this.aClass131_Sub1Array1[arg0] = local83;
			return local83;
		} else {
			return this.aClass131_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!km;ILclient!km;)Lclient!vba;")
	public Class131_Sub1 method4474(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(3) Class167 arg2) {
		return this.method4472(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	public void method4476() {
		if (this.aClass131_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass131_Sub1Array1.length; local11++) {
			if (this.aClass131_Sub1Array1[local11] != null) {
				this.aClass131_Sub1Array1[local11].method7017();
			}
		}
		for (@Pc(38) int local38 = 0; local38 < this.aClass131_Sub1Array1.length; local38++) {
			if (this.aClass131_Sub1Array1[local38] != null) {
				this.aClass131_Sub1Array1[local38].method7013();
			}
		}
	}
}
