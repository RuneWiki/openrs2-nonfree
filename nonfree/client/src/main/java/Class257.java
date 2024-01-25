import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class257 {

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "[Lclient!mha;")
	private Class229_Sub1[] aClass229_Sub1Array2;

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "Lclient!dt;")
	private Class3_Sub4 aClass3_Sub4_3;

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "Lclient!ff;")
	private final Class113 aClass113_2;

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger5;

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger6;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "Lclient!cr;")
	private final Class66 aClass66_3;

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "Lclient!qga;")
	private Class3_Sub5_Sub2_Sub2 aClass3_Sub5_Sub2_Sub2_2;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!ff;Lclient!cr;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class257(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass113_2 = arg0;
		this.aBigInteger5 = arg3;
		this.aBigInteger6 = arg2;
		this.aClass66_3 = arg1;
		if (!this.aClass113_2.method2596()) {
			this.aClass3_Sub5_Sub2_Sub2_2 = this.aClass113_2.method2592(255, 255, (byte) 0, true);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
	public void method5621() {
		if (this.aClass229_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass229_Sub1Array2.length; local11++) {
			if (this.aClass229_Sub1Array2[local11] != null) {
				this.aClass229_Sub1Array2[local11].method5285();
			}
		}
		for (@Pc(44) int local44 = 0; local44 < this.aClass229_Sub1Array2.length; local44++) {
			if (this.aClass229_Sub1Array2[local44] != null) {
				this.aClass229_Sub1Array2[local44].method5282();
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)Z")
	public boolean method5622() {
		if (this.aClass3_Sub4_3 != null) {
			return true;
		}
		if (this.aClass3_Sub5_Sub2_Sub2_2 == null) {
			if (this.aClass113_2.method2596()) {
				return false;
			}
			this.aClass3_Sub5_Sub2_Sub2_2 = this.aClass113_2.method2592(255, 255, (byte) 0, true);
		}
		if (this.aClass3_Sub5_Sub2_Sub2_2.aBoolean541) {
			return false;
		}
		@Pc(44) Class3_Sub4 local44 = new Class3_Sub4(this.aClass3_Sub5_Sub2_Sub2_2.method6440());
		local44.anInt9739 = 5;
		@Pc(51) int local51 = local44.method7954();
		local44.anInt9739 += local51 * 72;
		@Pc(67) byte[] local67 = new byte[local44.aByteArray90.length - local44.anInt9739];
		local44.method7958(0, local67, local67.length);
		@Pc(95) byte[] local95;
		if (this.aBigInteger6 == null || this.aBigInteger5 == null) {
			local95 = local67;
		} else {
			@Pc(85) BigInteger local85 = new BigInteger(local67);
			@Pc(92) BigInteger local92 = local85.modPow(this.aBigInteger6, this.aBigInteger5);
			local95 = local92.toByteArray();
		}
		if (local95.length != 65) {
			throw new RuntimeException();
		}
		@Pc(123) byte[] local123 = Static318.method4562(local44.aByteArray90, local44.anInt9739 - local67.length - 5, 5);
		for (@Pc(125) int local125 = 0; local125 < 64; local125++) {
			if (local123[local125] != local95[local125 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass229_Sub1Array2 = new Class229_Sub1[local51];
		this.aClass3_Sub4_3 = local44;
		return true;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!naa;ILclient!naa;)Lclient!mha;")
	public Class229_Sub1 method5623(@OriginalArg(0) int arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(3) Class241 arg2) {
		return this.method5626(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!naa;ZLclient!naa;I)Lclient!mha;")
	private Class229_Sub1 method5626(@OriginalArg(0) int arg0, @OriginalArg(1) Class241 arg1, @OriginalArg(3) Class241 arg2) {
		if (this.aClass3_Sub4_3 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass229_Sub1Array2.length) {
			throw new RuntimeException();
		} else if (this.aClass229_Sub1Array2[arg0] == null) {
			this.aClass3_Sub4_3.anInt9739 = arg0 * 72 + 6;
			@Pc(48) int local48 = this.aClass3_Sub4_3.method7895();
			@Pc(53) int local53 = this.aClass3_Sub4_3.method7895();
			@Pc(56) byte[] local56 = new byte[64];
			this.aClass3_Sub4_3.method7958(0, local56, 64);
			@Pc(78) Class229_Sub1 local78 = new Class229_Sub1(arg0, arg2, arg1, this.aClass113_2, this.aClass66_3, local48, local56, local53, true);
			this.aClass229_Sub1Array2[arg0] = local78;
			return local78;
		} else {
			return this.aClass229_Sub1Array2[arg0];
		}
	}
}
