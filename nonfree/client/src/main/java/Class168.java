import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jfa")
public final class Class168 {

	@OriginalMember(owner = "client!jfa", name = "h", descriptor = "[Lclient!ww;")
	private Class252_Sub1[] aClass252_Sub1Array1;

	@OriginalMember(owner = "client!jfa", name = "m", descriptor = "Lclient!io;")
	private Class1_Sub20 aClass1_Sub20_3;

	@OriginalMember(owner = "client!jfa", name = "i", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger2;

	@OriginalMember(owner = "client!jfa", name = "f", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger1;

	@OriginalMember(owner = "client!jfa", name = "e", descriptor = "Lclient!gb;")
	private final Class113 aClass113_1;

	@OriginalMember(owner = "client!jfa", name = "l", descriptor = "Lclient!qt;")
	private final Class274 aClass274_2;

	@OriginalMember(owner = "client!jfa", name = "k", descriptor = "Lclient!wd;")
	private Class1_Sub3_Sub11_Sub2 aClass1_Sub3_Sub11_Sub2_2;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lclient!gb;Lclient!qt;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class168(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger2 = arg2;
		this.aBigInteger1 = arg3;
		this.aClass113_1 = arg0;
		this.aClass274_2 = arg1;
		if (!this.aClass113_1.method2485()) {
			this.aClass1_Sub3_Sub11_Sub2_2 = this.aClass113_1.method2486(255, 255, (byte) 0, true);
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!cr;Lclient!cr;II)Lclient!ww;")
	public Class252_Sub1 method3972(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(3) int arg2) {
		return this.method3974(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!cr;BLclient!cr;ZI)Lclient!ww;")
	private Class252_Sub1 method3974(@OriginalArg(0) Class57 arg0, @OriginalArg(2) Class57 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass1_Sub20_3 == null) {
			throw new RuntimeException();
		} else if (arg2 < 0 || this.aClass252_Sub1Array1.length <= arg2) {
			throw new RuntimeException();
		} else if (this.aClass252_Sub1Array1[arg2] == null) {
			this.aClass1_Sub20_3.anInt5238 = arg2 * 72 + 6;
			@Pc(52) int local52 = this.aClass1_Sub20_3.method4371();
			@Pc(57) int local57 = this.aClass1_Sub20_3.method4371();
			@Pc(60) byte[] local60 = new byte[64];
			this.aClass1_Sub20_3.method4425(local60, 64);
			@Pc(82) Class252_Sub1 local82 = new Class252_Sub1(arg2, arg0, arg1, this.aClass113_1, this.aClass274_2, local52, local60, local57, true);
			this.aClass252_Sub1Array1[arg2] = local82;
			return local82;
		} else {
			return this.aClass252_Sub1Array1[arg2];
		}
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)V")
	public void method3975() {
		if (this.aClass252_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass252_Sub1Array1.length; local11++) {
			if (this.aClass252_Sub1Array1[local11] != null) {
				this.aClass252_Sub1Array1[local11].method7936();
			}
		}
		for (@Pc(43) int local43 = 0; local43 < this.aClass252_Sub1Array1.length; local43++) {
			if (this.aClass252_Sub1Array1[local43] != null) {
				this.aClass252_Sub1Array1[local43].method7935();
			}
		}
	}

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "(B)Z")
	public boolean method3977() {
		if (this.aClass1_Sub20_3 != null) {
			return true;
		}
		if (this.aClass1_Sub3_Sub11_Sub2_2 == null) {
			if (this.aClass113_1.method2485()) {
				return false;
			}
			this.aClass1_Sub3_Sub11_Sub2_2 = this.aClass113_1.method2486(255, 255, (byte) 0, true);
		}
		if (this.aClass1_Sub3_Sub11_Sub2_2.aBoolean684) {
			return false;
		}
		@Pc(44) Class1_Sub20 local44 = new Class1_Sub20(this.aClass1_Sub3_Sub11_Sub2_2.method7748());
		local44.anInt5238 = 5;
		@Pc(51) int local51 = local44.method4393();
		local44.anInt5238 += local51 * 72;
		@Pc(68) byte[] local68 = new byte[local44.aByteArray52.length - local44.anInt5238];
		local44.method4425(local68, local68.length);
		@Pc(101) byte[] local101;
		if (this.aBigInteger2 == null || this.aBigInteger1 == null) {
			local101 = local68;
		} else {
			@Pc(91) BigInteger local91 = new BigInteger(local68);
			@Pc(98) BigInteger local98 = local91.modPow(this.aBigInteger2, this.aBigInteger1);
			local101 = local98.toByteArray();
		}
		if (local101.length != 65) {
			throw new RuntimeException();
		}
		@Pc(129) byte[] local129 = Static149.method2389(local44.anInt5238 - local68.length - 5, local44.aByteArray52, 5);
		for (@Pc(131) int local131 = 0; local131 < 64; local131++) {
			if (local101[local131 + 1] != local129[local131]) {
				throw new RuntimeException();
			}
		}
		this.aClass1_Sub20_3 = local44;
		this.aClass252_Sub1Array1 = new Class252_Sub1[local51];
		return true;
	}
}
