import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class170 {

	@OriginalMember(owner = "client!laa", name = "f", descriptor = "Lclient!rt;")
	private Class3_Sub27 aClass3_Sub27_6;

	@OriginalMember(owner = "client!laa", name = "l", descriptor = "[Lclient!pb;")
	private Class113_Sub1[] aClass113_Sub1Array1;

	@OriginalMember(owner = "client!laa", name = "h", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger4;

	@OriginalMember(owner = "client!laa", name = "n", descriptor = "Lclient!kf;")
	private final Class162 aClass162_1;

	@OriginalMember(owner = "client!laa", name = "k", descriptor = "Lclient!jq;")
	private final Class153 aClass153_1;

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger3;

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "Lclient!bm;")
	private Class3_Sub10_Sub1_Sub1 aClass3_Sub10_Sub1_Sub1_2;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lclient!jq;Lclient!kf;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class170(@OriginalArg(0) Class153 arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger4 = arg2;
		this.aClass162_1 = arg1;
		this.aClass153_1 = arg0;
		this.aBigInteger3 = arg3;
		if (!this.aClass153_1.method4130()) {
			this.aClass3_Sub10_Sub1_Sub1_2 = this.aClass153_1.method4117(255, (byte) 0, 255, true);
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZILclient!ls;Lclient!ls;I)Lclient!pb;")
	private Class113_Sub1 method4633(@OriginalArg(2) Class182 arg0, @OriginalArg(3) Class182 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass3_Sub27_6 == null) {
			throw new RuntimeException();
		} else if (arg2 < 0 || this.aClass113_Sub1Array1.length <= arg2) {
			throw new RuntimeException();
		} else if (this.aClass113_Sub1Array1[arg2] == null) {
			this.aClass3_Sub27_6.anInt9191 = arg2 * 72 + 6;
			@Pc(47) int local47 = this.aClass3_Sub27_6.method7549();
			@Pc(52) int local52 = this.aClass3_Sub27_6.method7549();
			@Pc(55) byte[] local55 = new byte[64];
			this.aClass3_Sub27_6.method7571(local55, 64);
			@Pc(87) Class113_Sub1 local87 = new Class113_Sub1(arg2, arg0, arg1, this.aClass153_1, this.aClass162_1, local47, local55, local52, true);
			this.aClass113_Sub1Array1[arg2] = local87;
			return local87;
		} else {
			return this.aClass113_Sub1Array1[arg2];
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!ls;IZLclient!ls;)Lclient!pb;")
	public Class113_Sub1 method4634(@OriginalArg(0) Class182 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class182 arg2) {
		return this.method4633(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)V")
	public void method4636() {
		if (this.aClass113_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass113_Sub1Array1.length; local11++) {
			if (this.aClass113_Sub1Array1[local11] != null) {
				this.aClass113_Sub1Array1[local11].method5715();
			}
		}
		for (@Pc(32) int local32 = 0; local32 < this.aClass113_Sub1Array1.length; local32++) {
			if (this.aClass113_Sub1Array1[local32] != null) {
				this.aClass113_Sub1Array1[local32].method5714();
			}
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Z)Z")
	public boolean method4637() {
		if (this.aClass3_Sub27_6 != null) {
			return true;
		}
		if (this.aClass3_Sub10_Sub1_Sub1_2 == null) {
			if (this.aClass153_1.method4130()) {
				return false;
			}
			this.aClass3_Sub10_Sub1_Sub1_2 = this.aClass153_1.method4117(255, (byte) 0, 255, true);
		}
		if (this.aClass3_Sub10_Sub1_Sub1_2.aBoolean382) {
			return false;
		}
		@Pc(44) Class3_Sub27 local44 = new Class3_Sub27(this.aClass3_Sub10_Sub1_Sub1_2.method4927());
		local44.anInt9191 = 5;
		@Pc(51) int local51 = local44.method7548();
		local44.anInt9191 += local51 * 72;
		@Pc(68) byte[] local68 = new byte[local44.aByteArray114.length - local44.anInt9191];
		local44.method7571(local68, local68.length);
		@Pc(96) byte[] local96;
		if (this.aBigInteger4 == null || this.aBigInteger3 == null) {
			local96 = local68;
		} else {
			@Pc(86) BigInteger local86 = new BigInteger(local68);
			@Pc(93) BigInteger local93 = local86.modPow(this.aBigInteger4, this.aBigInteger3);
			local96 = local93.toByteArray();
		}
		if (local96.length != 65) {
			throw new RuntimeException();
		}
		@Pc(124) byte[] local124 = Static332.method5280(local44.anInt9191 - local68.length - 5, local44.aByteArray114, 5);
		for (@Pc(133) int local133 = 0; local133 < 64; local133++) {
			if (local96[local133 + 1] != local124[local133]) {
				throw new RuntimeException();
			}
		}
		this.aClass113_Sub1Array1 = new Class113_Sub1[local51];
		this.aClass3_Sub27_6 = local44;
		return true;
	}
}
