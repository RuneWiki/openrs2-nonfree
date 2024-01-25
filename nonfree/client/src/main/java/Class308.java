import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class308 {

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "Lclient!ie;")
	private Class3_Sub26 aClass3_Sub26_6;

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "[Lclient!lh;")
	private Class98_Sub1[] aClass98_Sub1Array2;

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "Lclient!gq;")
	private final Class117 aClass117_3;

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger9;

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger10;

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "Lclient!rs;")
	private final Class291 aClass291_2;

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "Lclient!nn;")
	private Class3_Sub7_Sub5_Sub1 aClass3_Sub7_Sub5_Sub1_2;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!gq;Lclient!rs;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class308(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class291 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass117_3 = arg0;
		this.aBigInteger9 = arg3;
		this.aBigInteger10 = arg2;
		this.aClass291_2 = arg1;
		if (!this.aClass117_3.method3170()) {
			this.aClass3_Sub7_Sub5_Sub1_2 = this.aClass117_3.method3176(255, true, (byte) 0, 255);
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
	public void method6723() {
		if (this.aClass98_Sub1Array2 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.aClass98_Sub1Array2.length; local15++) {
			if (this.aClass98_Sub1Array2[local15] != null) {
				this.aClass98_Sub1Array2[local15].method4620();
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.aClass98_Sub1Array2.length; local36++) {
			if (this.aClass98_Sub1Array2[local36] != null) {
				this.aClass98_Sub1Array2[local36].method4623();
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)Z")
	public boolean method6724() {
		if (this.aClass3_Sub26_6 != null) {
			return true;
		}
		if (this.aClass3_Sub7_Sub5_Sub1_2 == null) {
			if (this.aClass117_3.method3170()) {
				return false;
			}
			this.aClass3_Sub7_Sub5_Sub1_2 = this.aClass117_3.method3176(255, true, (byte) 0, 255);
		}
		if (this.aClass3_Sub7_Sub5_Sub1_2.aBoolean636) {
			return false;
		}
		@Pc(44) Class3_Sub26 local44 = new Class3_Sub26(this.aClass3_Sub7_Sub5_Sub1_2.method7579());
		local44.anInt8703 = 5;
		@Pc(61) int local61 = local44.method6814();
		local44.anInt8703 += local61 * 72;
		@Pc(78) byte[] local78 = new byte[local44.aByteArray213.length - local44.anInt8703];
		local44.method6794(local78, local78.length);
		@Pc(93) byte[] local93;
		if (this.aBigInteger10 == null || this.aBigInteger9 == null) {
			local93 = local78;
		} else {
			@Pc(100) BigInteger local100 = new BigInteger(local78);
			@Pc(107) BigInteger local107 = local100.modPow(this.aBigInteger10, this.aBigInteger9);
			local93 = local107.toByteArray();
		}
		if (local93.length != 65) {
			throw new RuntimeException();
		}
		@Pc(134) byte[] local134 = Static345.method5013(local44.aByteArray213, local44.anInt8703 - local78.length - 5, 5);
		for (@Pc(136) int local136 = 0; local136 < 64; local136++) {
			if (local134[local136] != local93[local136 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass3_Sub26_6 = local44;
		this.aClass98_Sub1Array2 = new Class98_Sub1[local61];
		return true;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!mu;ILclient!mu;B)Lclient!lh;")
	public Class98_Sub1 method6726(@OriginalArg(0) Class215 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class215 arg2) {
		return this.method6729(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BZILclient!mu;Lclient!mu;)Lclient!lh;")
	private Class98_Sub1 method6729(@OriginalArg(2) int arg0, @OriginalArg(3) Class215 arg1, @OriginalArg(4) Class215 arg2) {
		if (this.aClass3_Sub26_6 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || this.aClass98_Sub1Array2.length <= arg0) {
			throw new RuntimeException();
		} else if (this.aClass98_Sub1Array2[arg0] == null) {
			this.aClass3_Sub26_6.anInt8703 = arg0 * 72 + 6;
			@Pc(50) int local50 = this.aClass3_Sub26_6.method6816();
			@Pc(55) int local55 = this.aClass3_Sub26_6.method6816();
			@Pc(58) byte[] local58 = new byte[64];
			this.aClass3_Sub26_6.method6794(local58, 64);
			@Pc(80) Class98_Sub1 local80 = new Class98_Sub1(arg0, arg2, arg1, this.aClass117_3, this.aClass291_2, local50, local58, local55, true);
			this.aClass98_Sub1Array2[arg0] = local80;
			return local80;
		} else {
			return this.aClass98_Sub1Array2[arg0];
		}
	}
}
