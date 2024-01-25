import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kca")
public final class Class189 {

	@OriginalMember(owner = "client!kca", name = "g", descriptor = "Lclient!gk;")
	private Class2_Sub7 aClass2_Sub7_1;

	@OriginalMember(owner = "client!kca", name = "o", descriptor = "[Lclient!tj;")
	private Class102_Sub1[] aClass102_Sub1Array2;

	@OriginalMember(owner = "client!kca", name = "p", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger3;

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger2;

	@OriginalMember(owner = "client!kca", name = "i", descriptor = "Lclient!jq;")
	private final Class181 aClass181_1;

	@OriginalMember(owner = "client!kca", name = "h", descriptor = "Lclient!oaa;")
	private final Class249 aClass249_1;

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "Lclient!laa;")
	private Class2_Sub2_Sub2_Sub2 aClass2_Sub2_Sub2_Sub2_1;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lclient!oaa;Lclient!jq;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class189(@OriginalArg(0) Class249 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger3 = arg2;
		this.aBigInteger2 = arg3;
		this.aClass181_1 = arg1;
		this.aClass249_1 = arg0;
		if (!this.aClass249_1.method5217()) {
			this.aClass2_Sub2_Sub2_Sub2_1 = this.aClass249_1.method5230(255, true, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ZILclient!nr;ILclient!nr;)Lclient!tj;")
	private Class102_Sub1 method3738(@OriginalArg(2) Class245 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class245 arg2) {
		if (this.aClass2_Sub7_1 == null) {
			throw new RuntimeException();
		} else if (arg1 < 0 || arg1 >= this.aClass102_Sub1Array2.length) {
			throw new RuntimeException();
		} else if (this.aClass102_Sub1Array2[arg1] == null) {
			this.aClass2_Sub7_1.anInt5186 = arg1 * 72 + 6;
			@Pc(56) int local56 = this.aClass2_Sub7_1.method4509();
			@Pc(61) int local61 = this.aClass2_Sub7_1.method4509();
			@Pc(64) byte[] local64 = new byte[64];
			this.aClass2_Sub7_1.method4504(64, local64);
			@Pc(86) Class102_Sub1 local86 = new Class102_Sub1(arg1, arg0, arg2, this.aClass249_1, this.aClass181_1, local56, local64, local61, true);
			this.aClass102_Sub1Array2[arg1] = local86;
			return local86;
		} else {
			return this.aClass102_Sub1Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ZLclient!nr;Lclient!nr;I)Lclient!tj;")
	public Class102_Sub1 method3740(@OriginalArg(1) Class245 arg0, @OriginalArg(2) Class245 arg1, @OriginalArg(3) int arg2) {
		return this.method3738(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)Z")
	public boolean method3741() {
		if (this.aClass2_Sub7_1 != null) {
			return true;
		}
		if (this.aClass2_Sub2_Sub2_Sub2_1 == null) {
			if (this.aClass249_1.method5217()) {
				return false;
			}
			this.aClass2_Sub2_Sub2_Sub2_1 = this.aClass249_1.method5230(255, true, 255, (byte) 0);
		}
		if (this.aClass2_Sub2_Sub2_Sub2_1.aBoolean390) {
			return false;
		}
		@Pc(44) Class2_Sub7 local44 = new Class2_Sub7(this.aClass2_Sub2_Sub2_Sub2_1.method4255());
		local44.anInt5186 = 5;
		@Pc(51) int local51 = local44.method4464();
		local44.anInt5186 += local51 * 72;
		@Pc(67) byte[] local67 = new byte[local44.aByteArray52.length - local44.anInt5186];
		local44.method4504(local67.length, local67);
		@Pc(82) byte[] local82;
		if (this.aBigInteger3 == null || this.aBigInteger2 == null) {
			local82 = local67;
		} else {
			@Pc(89) BigInteger local89 = new BigInteger(local67);
			@Pc(96) BigInteger local96 = local89.modPow(this.aBigInteger3, this.aBigInteger2);
			local82 = local96.toByteArray();
		}
		if (local82.length != 65) {
			throw new RuntimeException();
		}
		@Pc(134) byte[] local134 = Static531.method6992(local44.anInt5186 - local67.length - 5, 5, local44.aByteArray52);
		for (@Pc(136) int local136 = 0; local136 < 64; local136++) {
			if (local134[local136] != local82[local136 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass102_Sub1Array2 = new Class102_Sub1[local51];
		this.aClass2_Sub7_1 = local44;
		return true;
	}

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "(I)V")
	public void method3743() {
		if (this.aClass102_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass102_Sub1Array2.length; local11++) {
			if (this.aClass102_Sub1Array2[local11] != null) {
				this.aClass102_Sub1Array2[local11].method6635();
			}
		}
		for (@Pc(43) int local43 = 0; local43 < this.aClass102_Sub1Array2.length; local43++) {
			if (this.aClass102_Sub1Array2[local43] != null) {
				this.aClass102_Sub1Array2[local43].method6645();
			}
		}
	}
}
