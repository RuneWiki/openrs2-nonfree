import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class382 {

	@OriginalMember(owner = "client!vw", name = "e", descriptor = "[Lclient!rn;")
	private Class51_Sub1[] aClass51_Sub1Array13;

	@OriginalMember(owner = "client!vw", name = "h", descriptor = "Lclient!ol;")
	private Class2_Sub8 aClass2_Sub8_9;

	@OriginalMember(owner = "client!vw", name = "j", descriptor = "Lclient!l;")
	private final Class206 aClass206_3;

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger4;

	@OriginalMember(owner = "client!vw", name = "n", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger5;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "Lclient!cda;")
	private final Class46 aClass46_3;

	@OriginalMember(owner = "client!vw", name = "l", descriptor = "Lclient!fu;")
	private Class2_Sub1_Sub6_Sub1 aClass2_Sub1_Sub6_Sub1_2;

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lclient!l;Lclient!cda;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class382(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass206_3 = arg0;
		this.aBigInteger4 = arg3;
		this.aBigInteger5 = arg2;
		this.aClass46_3 = arg1;
		if (!this.aClass206_3.method5425()) {
			this.aClass2_Sub1_Sub6_Sub1_2 = this.aClass206_3.method5417((byte) 0, 255, 255, true);
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lclient!ce;ILclient!ce;B)Lclient!rn;")
	public Class51_Sub1 method9529(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47 arg2) {
		return this.method9535(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V")
	public void method9530() {
		if (this.aClass51_Sub1Array13 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.aClass51_Sub1Array13.length; local15++) {
			if (this.aClass51_Sub1Array13[local15] != null) {
				this.aClass51_Sub1Array13[local15].method8057();
			}
		}
		for (@Pc(40) int local40 = 0; local40 < this.aClass51_Sub1Array13.length; local40++) {
			if (this.aClass51_Sub1Array13[local40] != null) {
				this.aClass51_Sub1Array13[local40].method8059();
			}
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)Z")
	public boolean method9534() {
		if (this.aClass2_Sub8_9 != null) {
			return true;
		}
		if (this.aClass2_Sub1_Sub6_Sub1_2 == null) {
			if (this.aClass206_3.method5425()) {
				return false;
			}
			this.aClass2_Sub1_Sub6_Sub1_2 = this.aClass206_3.method5417((byte) 0, 255, 255, true);
		}
		if (this.aClass2_Sub1_Sub6_Sub1_2.aBoolean566) {
			return false;
		}
		@Pc(44) Class2_Sub8 local44 = new Class2_Sub8(this.aClass2_Sub1_Sub6_Sub1_2.method6765());
		local44.anInt5725 = 5;
		@Pc(51) int local51 = local44.method5203();
		local44.anInt5725 += local51 * 72;
		@Pc(76) byte[] local76 = new byte[local44.lb.length - local44.anInt5725];
		local44.method5176(local76, 0, local76.length);
		@Pc(104) byte[] local104;
		if (this.aBigInteger5 == null || this.aBigInteger4 == null) {
			local104 = local76;
		} else {
			@Pc(94) BigInteger local94 = new BigInteger(local76);
			@Pc(101) BigInteger local101 = local94.modPow(this.aBigInteger5, this.aBigInteger4);
			local104 = local101.toByteArray();
		}
		if (local104.length != 65) {
			throw new RuntimeException();
		}
		@Pc(129) byte[] local129 = Static590.method8900(local44.lb, 5, local44.anInt5725 - local76.length - 5);
		for (@Pc(131) int local131 = 0; local131 < 64; local131++) {
			if (local104[local131 + 1] != local129[local131]) {
				throw new RuntimeException();
			}
		}
		this.aClass2_Sub8_9 = local44;
		this.aClass51_Sub1Array13 = new Class51_Sub1[local51];
		return true;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ZLclient!ce;ILclient!ce;Z)Lclient!rn;")
	private Class51_Sub1 method9535(@OriginalArg(1) Class47 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class47 arg2) {
		if (this.aClass2_Sub8_9 == null) {
			throw new RuntimeException();
		} else if (arg1 < 0 || arg1 >= this.aClass51_Sub1Array13.length) {
			throw new RuntimeException();
		} else if (this.aClass51_Sub1Array13[arg1] == null) {
			this.aClass2_Sub8_9.anInt5725 = arg1 * 72 + 6;
			@Pc(47) int local47 = this.aClass2_Sub8_9.method5172();
			@Pc(52) int local52 = this.aClass2_Sub8_9.method5172();
			@Pc(55) byte[] local55 = new byte[64];
			this.aClass2_Sub8_9.method5176(local55, 0, 64);
			@Pc(77) Class51_Sub1 local77 = new Class51_Sub1(arg1, arg2, arg0, this.aClass206_3, this.aClass46_3, local47, local55, local52, true);
			this.aClass51_Sub1Array13[arg1] = local77;
			return local77;
		} else {
			return this.aClass51_Sub1Array13[arg1];
		}
	}
}
