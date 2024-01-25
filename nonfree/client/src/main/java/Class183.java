import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class183 {

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "Lclient!es;")
	private Class4_Sub11 aClass4_Sub11_7;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "[Lclient!eh;")
	private Class89_Sub1[] aClass89_Sub1Array1;

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger6;

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "Lclient!ob;")
	private final Class260 aClass260_2;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger5;

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "Lclient!rda;")
	private final Class309 aClass309_2;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "Lclient!kc;")
	private Class4_Sub5_Sub2_Sub1 aClass4_Sub5_Sub2_Sub1_1;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!ob;Lclient!rda;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class183(@OriginalArg(0) Class260 arg0, @OriginalArg(1) Class309 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger6 = arg3;
		this.aClass260_2 = arg0;
		this.aBigInteger5 = arg2;
		this.aClass309_2 = arg1;
		if (!this.aClass260_2.method5879()) {
			this.aClass4_Sub5_Sub2_Sub1_1 = this.aClass260_2.method5880(255, true, (byte) 0, 255);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!tc;Lclient!tc;IZ)Lclient!eh;")
	private Class89_Sub1 method4100(@OriginalArg(1) Class343 arg0, @OriginalArg(2) Class343 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass4_Sub11_7 == null) {
			throw new RuntimeException();
		} else if (arg2 < 0 || this.aClass89_Sub1Array1.length <= arg2) {
			throw new RuntimeException();
		} else if (this.aClass89_Sub1Array1[arg2] == null) {
			this.aClass4_Sub11_7.anInt10466 = arg2 * 72 + 6;
			@Pc(59) int local59 = this.aClass4_Sub11_7.method8850();
			@Pc(64) int local64 = this.aClass4_Sub11_7.method8850();
			@Pc(67) byte[] local67 = new byte[64];
			this.aClass4_Sub11_7.method8870(local67, 0, 64);
			@Pc(89) Class89_Sub1 local89 = new Class89_Sub1(arg2, arg0, arg1, this.aClass260_2, this.aClass309_2, local59, local67, local64, true);
			this.aClass89_Sub1Array1[arg2] = local89;
			return local89;
		} else {
			return this.aClass89_Sub1Array1[arg2];
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	public void method4101() {
		if (this.aClass89_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass89_Sub1Array1.length; local11++) {
			if (this.aClass89_Sub1Array1[local11] != null) {
				this.aClass89_Sub1Array1[local11].method2238();
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.aClass89_Sub1Array1.length; local36++) {
			if (this.aClass89_Sub1Array1[local36] != null) {
				this.aClass89_Sub1Array1[local36].method2237();
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!tc;Lclient!tc;II)Lclient!eh;")
	public Class89_Sub1 method4104(@OriginalArg(0) Class343 arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(3) int arg2) {
		return this.method4100(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)Z")
	public boolean method4105() {
		if (this.aClass4_Sub11_7 != null) {
			return true;
		}
		if (this.aClass4_Sub5_Sub2_Sub1_1 == null) {
			if (this.aClass260_2.method5879()) {
				return false;
			}
			this.aClass4_Sub5_Sub2_Sub1_1 = this.aClass260_2.method5880(255, true, (byte) 0, 255);
		}
		if (this.aClass4_Sub5_Sub2_Sub1_1.aBoolean535) {
			return false;
		}
		@Pc(44) Class4_Sub11 local44 = new Class4_Sub11(this.aClass4_Sub5_Sub2_Sub1_1.method6084());
		local44.anInt10466 = 5;
		@Pc(51) int local51 = local44.method8865();
		local44.anInt10466 += local51 * 72;
		@Pc(68) byte[] local68 = new byte[local44.aByteArray107.length - local44.anInt10466];
		local44.method8870(local68, 0, local68.length);
		@Pc(83) byte[] local83;
		if (this.aBigInteger5 == null || this.aBigInteger6 == null) {
			local83 = local68;
		} else {
			@Pc(90) BigInteger local90 = new BigInteger(local68);
			@Pc(97) BigInteger local97 = local90.modPow(this.aBigInteger5, this.aBigInteger6);
			local83 = local97.toByteArray();
		}
		if (local83.length != 65) {
			throw new RuntimeException();
		}
		@Pc(124) byte[] local124 = Static249.method3664(local44.aByteArray107, 5, local44.anInt10466 - local68.length - 5);
		for (@Pc(126) int local126 = 0; local126 < 64; local126++) {
			if (local83[local126 + 1] != local124[local126]) {
				throw new RuntimeException();
			}
		}
		this.aClass4_Sub11_7 = local44;
		this.aClass89_Sub1Array1 = new Class89_Sub1[local51];
		return true;
	}
}
