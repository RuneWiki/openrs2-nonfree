import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class172 {

	@OriginalMember(owner = "client!la", name = "h", descriptor = "[Lclient!qc;")
	private Class235_Sub1[] aClass235_Sub1Array2;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "Lclient!os;")
	private Class1_Sub17 aClass1_Sub17_5;

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger6;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "Lclient!gq;")
	private final Class117 aClass117_3;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger5;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Lclient!bj;")
	private final Class30 aClass30_1;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Lclient!pm;")
	private Class1_Sub2_Sub6_Sub2 aClass1_Sub2_Sub6_Sub2_2;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!gq;Lclient!bj;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class172(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger6 = arg2;
		this.aClass117_3 = arg0;
		this.aBigInteger5 = arg3;
		this.aClass30_1 = arg1;
		if (!this.aClass117_3.method2925()) {
			this.aClass1_Sub2_Sub6_Sub2_2 = this.aClass117_3.method2921((byte) 0, 255, 255, true);
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public void method4729() {
		if (this.aClass235_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass235_Sub1Array2.length; local11++) {
			if (this.aClass235_Sub1Array2[local11] != null) {
				this.aClass235_Sub1Array2[local11].method6226();
			}
		}
		for (@Pc(32) int local32 = 0; local32 < this.aClass235_Sub1Array2.length; local32++) {
			if (this.aClass235_Sub1Array2[local32] != null) {
				this.aClass235_Sub1Array2[local32].method6232();
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BIZLclient!es;Lclient!es;)Lclient!qc;")
	private Class235_Sub1 method4730(@OriginalArg(1) int arg0, @OriginalArg(3) Class90 arg1, @OriginalArg(4) Class90 arg2) {
		if (this.aClass1_Sub17_5 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass235_Sub1Array2.length) {
			throw new RuntimeException();
		} else if (this.aClass235_Sub1Array2[arg0] == null) {
			this.aClass1_Sub17_5.anInt4872 = arg0 * 72 + 6;
			@Pc(53) int local53 = this.aClass1_Sub17_5.method4481();
			@Pc(58) int local58 = this.aClass1_Sub17_5.method4481();
			@Pc(61) byte[] local61 = new byte[64];
			this.aClass1_Sub17_5.method4505(local61, 64);
			@Pc(83) Class235_Sub1 local83 = new Class235_Sub1(arg0, arg2, arg1, this.aClass117_3, this.aClass30_1, local53, local61, local58, true);
			this.aClass235_Sub1Array2[arg0] = local83;
			return local83;
		} else {
			return this.aClass235_Sub1Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)Z")
	public boolean method4731() {
		if (this.aClass1_Sub17_5 != null) {
			return true;
		}
		if (this.aClass1_Sub2_Sub6_Sub2_2 == null) {
			if (this.aClass117_3.method2925()) {
				return false;
			}
			this.aClass1_Sub2_Sub6_Sub2_2 = this.aClass117_3.method2921((byte) 0, 255, 255, true);
		}
		if (this.aClass1_Sub2_Sub6_Sub2_2.aBoolean497) {
			return false;
		}
		@Pc(44) Class1_Sub17 local44 = new Class1_Sub17(this.aClass1_Sub2_Sub6_Sub2_2.method6032());
		local44.anInt4872 = 5;
		@Pc(51) int local51 = local44.method4487();
		local44.anInt4872 += local51 * 72;
		@Pc(67) byte[] local67 = new byte[local44.aByteArray58.length - local44.anInt4872];
		local44.method4505(local67, local67.length);
		@Pc(82) byte[] local82;
		if (this.aBigInteger6 == null || this.aBigInteger5 == null) {
			local82 = local67;
		} else {
			@Pc(89) BigInteger local89 = new BigInteger(local67);
			@Pc(96) BigInteger local96 = local89.modPow(this.aBigInteger6, this.aBigInteger5);
			local82 = local96.toByteArray();
		}
		if (local82.length != 65) {
			throw new RuntimeException();
		}
		@Pc(121) byte[] local121 = Static271.method4826(5, local44.anInt4872 - local67.length - 5, local44.aByteArray58);
		for (@Pc(123) int local123 = 0; local123 < 64; local123++) {
			if (local82[local123 + 1] != local121[local123]) {
				throw new RuntimeException();
			}
		}
		this.aClass235_Sub1Array2 = new Class235_Sub1[local51];
		this.aClass1_Sub17_5 = local44;
		return true;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!es;ILclient!es;)Lclient!qc;")
	public Class235_Sub1 method4732(@OriginalArg(1) Class90 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class90 arg2) {
		return this.method4730(arg1, arg2, arg0);
	}
}
