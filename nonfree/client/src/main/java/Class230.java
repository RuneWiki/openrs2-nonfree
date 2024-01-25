import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class230 {

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "Lclient!rg;")
	private Class6_Sub40 aClass6_Sub40_6;

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "[Lclient!nca;")
	private Class217_Sub1[] aClass217_Sub1Array8;

	@OriginalMember(owner = "client!nv", name = "m", descriptor = "Lclient!ro;")
	private final Class296 aClass296_4;

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "Lclient!hfa;")
	private final Class130 aClass130_3;

	@OriginalMember(owner = "client!nv", name = "j", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger4;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger3;

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "Lclient!dia;")
	private Class6_Sub2_Sub3_Sub2 aClass6_Sub2_Sub3_Sub2_1;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!ro;Lclient!hfa;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class230(@OriginalArg(0) Class296 arg0, @OriginalArg(1) Class130 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass296_4 = arg0;
		this.aClass130_3 = arg1;
		this.aBigInteger4 = arg3;
		this.aBigInteger3 = arg2;
		if (!this.aClass296_4.method7427()) {
			this.aClass6_Sub2_Sub3_Sub2_1 = this.aClass296_4.method7437(255, (byte) 0, true, 255);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
	public void method6217() {
		if (this.aClass217_Sub1Array8 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass217_Sub1Array8.length; local11++) {
			if (this.aClass217_Sub1Array8[local11] != null) {
				this.aClass217_Sub1Array8[local11].method5805();
			}
		}
		for (@Pc(47) int local47 = 0; local47 < this.aClass217_Sub1Array8.length; local47++) {
			if (this.aClass217_Sub1Array8[local47] != null) {
				this.aClass217_Sub1Array8[local47].method5803();
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!np;IBLclient!np;)Lclient!nca;")
	public Class217_Sub1 method6218(@OriginalArg(0) Class227 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class227 arg2) {
		return this.method6220(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!np;ILclient!np;BZ)Lclient!nca;")
	private Class217_Sub1 method6220(@OriginalArg(0) Class227 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class227 arg2) {
		if (this.aClass6_Sub40_6 == null) {
			throw new RuntimeException();
		} else if (arg1 < 0 || this.aClass217_Sub1Array8.length <= arg1) {
			throw new RuntimeException();
		} else if (this.aClass217_Sub1Array8[arg1] == null) {
			this.aClass6_Sub40_6.anInt10169 = arg1 * 72 + 6;
			@Pc(57) int local57 = this.aClass6_Sub40_6.method8579();
			@Pc(62) int local62 = this.aClass6_Sub40_6.method8579();
			@Pc(65) byte[] local65 = new byte[64];
			this.aClass6_Sub40_6.method8595(local65, 64, 0);
			@Pc(89) Class217_Sub1 local89 = new Class217_Sub1(arg1, arg0, arg2, this.aClass296_4, this.aClass130_3, local57, local65, local62, true);
			this.aClass217_Sub1Array8[arg1] = local89;
			return local89;
		} else {
			return this.aClass217_Sub1Array8[arg1];
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)Z")
	public boolean method6221() {
		if (this.aClass6_Sub40_6 != null) {
			return true;
		}
		if (this.aClass6_Sub2_Sub3_Sub2_1 == null) {
			if (this.aClass296_4.method7427()) {
				return false;
			}
			this.aClass6_Sub2_Sub3_Sub2_1 = this.aClass296_4.method7437(255, (byte) 0, true, 255);
		}
		if (this.aClass6_Sub2_Sub3_Sub2_1.aBoolean158) {
			return false;
		}
		@Pc(44) Class6_Sub40 local44 = new Class6_Sub40(this.aClass6_Sub2_Sub3_Sub2_1.method1736());
		local44.anInt10169 = 5;
		@Pc(51) int local51 = local44.method8604();
		local44.anInt10169 += local51 * 72;
		@Pc(68) byte[] local68 = new byte[local44.aByteArray113.length - local44.anInt10169];
		local44.method8595(local68, local68.length, 0);
		@Pc(96) byte[] local96;
		if (this.aBigInteger3 == null || this.aBigInteger4 == null) {
			local96 = local68;
		} else {
			@Pc(86) BigInteger local86 = new BigInteger(local68);
			@Pc(93) BigInteger local93 = local86.modPow(this.aBigInteger3, this.aBigInteger4);
			local96 = local93.toByteArray();
		}
		if (local96.length != 65) {
			throw new RuntimeException();
		}
		@Pc(122) byte[] local122 = Static231.method3959(5, local44.aByteArray113, local44.anInt10169 - local68.length - 5);
		for (@Pc(124) int local124 = 0; local124 < 64; local124++) {
			if (local96[local124 + 1] != local122[local124]) {
				throw new RuntimeException();
			}
		}
		this.aClass217_Sub1Array8 = new Class217_Sub1[local51];
		this.aClass6_Sub40_6 = local44;
		return true;
	}
}
