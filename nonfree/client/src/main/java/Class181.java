import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class181 {

	@OriginalMember(owner = "client!lda", name = "h", descriptor = "[Lclient!lm;")
	private Class98_Sub1[] aClass98_Sub1Array1;

	@OriginalMember(owner = "client!lda", name = "k", descriptor = "Lclient!dga;")
	private Class6_Sub14 aClass6_Sub14_6;

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger2;

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "Lclient!mca;")
	private final Class195 aClass195_3;

	@OriginalMember(owner = "client!lda", name = "g", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger3;

	@OriginalMember(owner = "client!lda", name = "d", descriptor = "Lclient!kl;")
	private final Class175 aClass175_1;

	@OriginalMember(owner = "client!lda", name = "j", descriptor = "Lclient!ie;")
	private Class6_Sub1_Sub10_Sub1 aClass6_Sub1_Sub10_Sub1_2;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lclient!kl;Lclient!mca;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class181(@OriginalArg(0) Class175 arg0, @OriginalArg(1) Class195 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger2 = arg3;
		this.aClass195_3 = arg1;
		this.aBigInteger3 = arg2;
		this.aClass175_1 = arg0;
		if (!this.aClass175_1.method3746()) {
			this.aClass6_Sub1_Sub10_Sub1_2 = this.aClass175_1.method3736(255, true, (byte) 0, 255);
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!vh;Lclient!vh;II)Lclient!lm;")
	public Class98_Sub1 method3994(@OriginalArg(0) Class331 arg0, @OriginalArg(1) Class331 arg1, @OriginalArg(2) int arg2) {
		return this.method3997(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!vh;IZLclient!vh;Z)Lclient!lm;")
	private Class98_Sub1 method3997(@OriginalArg(0) Class331 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class331 arg2) {
		if (this.aClass6_Sub14_6 == null) {
			throw new RuntimeException();
		} else if (arg1 < 0 || this.aClass98_Sub1Array1.length <= arg1) {
			throw new RuntimeException();
		} else if (this.aClass98_Sub1Array1[arg1] == null) {
			this.aClass6_Sub14_6.anInt7244 = arg1 * 72 + 6;
			@Pc(47) int local47 = this.aClass6_Sub14_6.method6027();
			@Pc(52) int local52 = this.aClass6_Sub14_6.method6027();
			@Pc(55) byte[] local55 = new byte[64];
			this.aClass6_Sub14_6.method6018(64, local55);
			@Pc(83) Class98_Sub1 local83 = new Class98_Sub1(arg1, arg2, arg0, this.aClass175_1, this.aClass195_3, local47, local55, local52, true);
			this.aClass98_Sub1Array1[arg1] = local83;
			return local83;
		} else {
			return this.aClass98_Sub1Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)Z")
	public boolean method3998() {
		if (this.aClass6_Sub14_6 != null) {
			return true;
		}
		if (this.aClass6_Sub1_Sub10_Sub1_2 == null) {
			if (this.aClass175_1.method3746()) {
				return false;
			}
			this.aClass6_Sub1_Sub10_Sub1_2 = this.aClass175_1.method3736(255, true, (byte) 0, 255);
		}
		if (this.aClass6_Sub1_Sub10_Sub1_2.aBoolean607) {
			return false;
		}
		@Pc(44) Class6_Sub14 local44 = new Class6_Sub14(this.aClass6_Sub1_Sub10_Sub1_2.method7037());
		local44.anInt7244 = 5;
		@Pc(51) int local51 = local44.method6041();
		local44.anInt7244 += local51 * 72;
		@Pc(67) byte[] local67 = new byte[local44.aByteArray88.length - local44.anInt7244];
		local44.method6018(local67.length, local67);
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
		@Pc(123) byte[] local123 = Static139.method2085(local44.anInt7244 - local67.length - 5, 5, local44.aByteArray88);
		for (@Pc(130) int local130 = 0; local130 < 64; local130++) {
			if (local82[local130 + 1] != local123[local130]) {
				throw new RuntimeException();
			}
		}
		this.aClass98_Sub1Array1 = new Class98_Sub1[local51];
		this.aClass6_Sub14_6 = local44;
		return true;
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)V")
	public void method3999() {
		if (this.aClass98_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass98_Sub1Array1.length; local11++) {
			if (this.aClass98_Sub1Array1[local11] != null) {
				this.aClass98_Sub1Array1[local11].method4081();
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.aClass98_Sub1Array1.length; local36++) {
			if (this.aClass98_Sub1Array1[local36] != null) {
				this.aClass98_Sub1Array1[local36].method4087();
			}
		}
	}
}
