import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class219 {

	@OriginalMember(owner = "client!mda", name = "l", descriptor = "[J")
	public static final long[] aLongArray4 = new long[256];

	@OriginalMember(owner = "client!mda", name = "e", descriptor = "Lclient!eh;")
	private Class4_Sub9 aClass4_Sub9_5;

	@OriginalMember(owner = "client!mda", name = "n", descriptor = "[Lclient!n;")
	private Class235_Sub1[] aClass235_Sub1Array2;

	@OriginalMember(owner = "client!mda", name = "m", descriptor = "Lclient!lfa;")
	private final Class207 aClass207_2;

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger5;

	@OriginalMember(owner = "client!mda", name = "k", descriptor = "Lclient!de;")
	private final Class70 aClass70_1;

	@OriginalMember(owner = "client!mda", name = "g", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger6;

	@OriginalMember(owner = "client!mda", name = "i", descriptor = "Lclient!ve;")
	private Class4_Sub7_Sub7_Sub2 aClass4_Sub7_Sub7_Sub2_2;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(12) long local12 = (long) local8;
			for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
				if ((local12 & 0x1L) == 1L) {
					local12 = local12 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local12 >>>= 0x1;
				}
			}
			aLongArray4[local8] = local12;
		}
	}

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!lfa;Lclient!de;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class219(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass207_2 = arg0;
		this.aBigInteger5 = arg3;
		this.aClass70_1 = arg1;
		this.aBigInteger6 = arg2;
		if (!this.aClass207_2.method4640()) {
			this.aClass4_Sub7_Sub7_Sub2_2 = this.aClass207_2.method4635(255, true, (byte) 0, 255);
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)V")
	public void method4891() {
		if (this.aClass235_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass235_Sub1Array2.length; local11++) {
			if (this.aClass235_Sub1Array2[local11] != null) {
				this.aClass235_Sub1Array2[local11].method5085();
			}
		}
		for (@Pc(32) int local32 = 0; local32 < this.aClass235_Sub1Array2.length; local32++) {
			if (this.aClass235_Sub1Array2[local32] != null) {
				this.aClass235_Sub1Array2[local32].method5084();
			}
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILclient!cc;ILclient!cc;)Lclient!n;")
	public Class235_Sub1 method4894(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(3) Class47 arg2) {
		return this.method4895(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!cc;ILclient!cc;ZB)Lclient!n;")
	private Class235_Sub1 method4895(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47 arg2) {
		if (this.aClass4_Sub9_5 == null) {
			throw new RuntimeException();
		} else if (arg1 < 0 || this.aClass235_Sub1Array2.length <= arg1) {
			throw new RuntimeException();
		} else if (this.aClass235_Sub1Array2[arg1] == null) {
			this.aClass4_Sub9_5.anInt7219 = arg1 * 72 + 6;
			@Pc(50) int local50 = this.aClass4_Sub9_5.method6026();
			@Pc(55) int local55 = this.aClass4_Sub9_5.method6026();
			@Pc(58) byte[] local58 = new byte[64];
			this.aClass4_Sub9_5.method5966(64, local58);
			@Pc(80) Class235_Sub1 local80 = new Class235_Sub1(arg1, arg2, arg0, this.aClass207_2, this.aClass70_1, local50, local58, local55, true);
			this.aClass235_Sub1Array2[arg1] = local80;
			return local80;
		} else {
			return this.aClass235_Sub1Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(Z)Z")
	public boolean method4897() {
		if (this.aClass4_Sub9_5 != null) {
			return true;
		}
		if (this.aClass4_Sub7_Sub7_Sub2_2 == null) {
			if (this.aClass207_2.method4640()) {
				return false;
			}
			this.aClass4_Sub7_Sub7_Sub2_2 = this.aClass207_2.method4635(255, true, (byte) 0, 255);
		}
		if (this.aClass4_Sub7_Sub7_Sub2_2.aBoolean642) {
			return false;
		}
		@Pc(44) Class4_Sub9 local44 = new Class4_Sub9(this.aClass4_Sub7_Sub7_Sub2_2.method7629());
		local44.anInt7219 = 5;
		@Pc(51) int local51 = local44.method6015();
		local44.anInt7219 += local51 * 72;
		@Pc(74) byte[] local74 = new byte[local44.aByteArray97.length - local44.anInt7219];
		local44.method5966(local74.length, local74);
		@Pc(89) byte[] local89;
		if (this.aBigInteger6 == null || this.aBigInteger5 == null) {
			local89 = local74;
		} else {
			@Pc(96) BigInteger local96 = new BigInteger(local74);
			@Pc(103) BigInteger local103 = local96.modPow(this.aBigInteger6, this.aBigInteger5);
			local89 = local103.toByteArray();
		}
		if (local89.length != 65) {
			throw new RuntimeException();
		}
		@Pc(130) byte[] local130 = Static188.method3457(5, local44.anInt7219 - local74.length - 5, local44.aByteArray97);
		for (@Pc(132) int local132 = 0; local132 < 64; local132++) {
			if (local130[local132] != local89[local132 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass4_Sub9_5 = local44;
		this.aClass235_Sub1Array2 = new Class235_Sub1[local51];
		return true;
	}
}
