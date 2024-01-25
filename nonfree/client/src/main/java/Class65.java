import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class65 {

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "[Lclient!mc;")
	private Class156_Sub1[] aClass156_Sub1Array1;

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "Lclient!ac;")
	private Class1_Sub3 aClass1_Sub3_1;

	@OriginalMember(owner = "client!dp", name = "m", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger6;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger5;

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "Lclient!lfa;")
	private final Class205 aClass205_1;

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "Lclient!mu;")
	private final Class228 aClass228_1;

	@OriginalMember(owner = "client!dp", name = "l", descriptor = "Lclient!qb;")
	private Class1_Sub8_Sub1_Sub2 aClass1_Sub8_Sub1_Sub2_1;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!lfa;Lclient!mu;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class65(@OriginalArg(0) Class205 arg0, @OriginalArg(1) Class228 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger6 = arg2;
		this.aBigInteger5 = arg3;
		this.aClass205_1 = arg0;
		this.aClass228_1 = arg1;
		if (!this.aClass205_1.method4367()) {
			this.aClass1_Sub8_Sub1_Sub2_1 = this.aClass205_1.method4366(true, 255, (byte) 0, 255);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)Z")
	public boolean method1453() {
		if (this.aClass1_Sub3_1 != null) {
			return true;
		}
		if (this.aClass1_Sub8_Sub1_Sub2_1 == null) {
			if (this.aClass205_1.method4367()) {
				return false;
			}
			this.aClass1_Sub8_Sub1_Sub2_1 = this.aClass205_1.method4366(true, 255, (byte) 0, 255);
		}
		if (this.aClass1_Sub8_Sub1_Sub2_1.aBoolean563) {
			return false;
		}
		@Pc(49) Class1_Sub3 local49 = new Class1_Sub3(this.aClass1_Sub8_Sub1_Sub2_1.method5914());
		local49.anInt9802 = 5;
		@Pc(56) int local56 = local49.method7974();
		local49.anInt9802 += local56 * 72;
		@Pc(73) byte[] local73 = new byte[local49.aByteArray104.length - local49.anInt9802];
		local49.method7957(local73, local73.length);
		@Pc(88) byte[] local88;
		if (this.aBigInteger6 == null || this.aBigInteger5 == null) {
			local88 = local73;
		} else {
			@Pc(95) BigInteger local95 = new BigInteger(local73);
			@Pc(102) BigInteger local102 = local95.modPow(this.aBigInteger6, this.aBigInteger5);
			local88 = local102.toByteArray();
		}
		if (local88.length != 65) {
			throw new RuntimeException();
		}
		@Pc(129) byte[] local129 = Static387.method5581(local49.aByteArray104, 5, local49.anInt9802 - local73.length - 5);
		for (@Pc(131) int local131 = 0; local131 < 64; local131++) {
			if (local129[local131] != local88[local131 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass1_Sub3_1 = local49;
		this.aClass156_Sub1Array1 = new Class156_Sub1[local56];
		return true;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!sp;ILclient!sp;IZ)Lclient!mc;")
	private Class156_Sub1 method1454(@OriginalArg(0) Class313 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class313 arg2) {
		if (this.aClass1_Sub3_1 == null) {
			throw new RuntimeException();
		} else if (arg1 < 0 || arg1 >= this.aClass156_Sub1Array1.length) {
			throw new RuntimeException();
		} else if (this.aClass156_Sub1Array1[arg1] == null) {
			this.aClass1_Sub3_1.anInt9802 = arg1 * 72 + 6;
			@Pc(47) int local47 = this.aClass1_Sub3_1.method7940();
			@Pc(52) int local52 = this.aClass1_Sub3_1.method7940();
			@Pc(55) byte[] local55 = new byte[64];
			this.aClass1_Sub3_1.method7957(local55, 64);
			@Pc(77) Class156_Sub1 local77 = new Class156_Sub1(arg1, arg2, arg0, this.aClass205_1, this.aClass228_1, local47, local55, local52, true);
			this.aClass156_Sub1Array1[arg1] = local77;
			return local77;
		} else {
			return this.aClass156_Sub1Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)V")
	public void method1455() {
		if (this.aClass156_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass156_Sub1Array1.length; local11++) {
			if (this.aClass156_Sub1Array1[local11] != null) {
				this.aClass156_Sub1Array1[local11].method4696();
			}
		}
		for (@Pc(32) int local32 = 0; local32 < this.aClass156_Sub1Array1.length; local32++) {
			if (this.aClass156_Sub1Array1[local32] != null) {
				this.aClass156_Sub1Array1[local32].method4693();
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!sp;ILclient!sp;)Lclient!mc;")
	public Class156_Sub1 method1457(@OriginalArg(0) int arg0, @OriginalArg(1) Class313 arg1, @OriginalArg(3) Class313 arg2) {
		return this.method1454(arg2, arg0, arg1);
	}
}
