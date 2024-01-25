import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class218 {

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "[Lclient!fe;")
	private Class87_Sub1[] aClass87_Sub1Array2;

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "Lclient!gw;")
	private Class1_Sub13 aClass1_Sub13_5;

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "Lclient!hca;")
	private final Class115 aClass115_3;

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger5;

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger6;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "Lclient!je;")
	private final Class147 aClass147_3;

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "Lclient!ud;")
	private Class1_Sub1_Sub11_Sub2 aClass1_Sub1_Sub11_Sub2_2;

	static {
		new Class114(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!hca;Lclient!je;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class218(@OriginalArg(0) Class115 arg0, @OriginalArg(1) Class147 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass115_3 = arg0;
		this.aBigInteger5 = arg2;
		this.aBigInteger6 = arg3;
		this.aClass147_3 = arg1;
		if (!this.aClass115_3.method3353()) {
			this.aClass1_Sub1_Sub11_Sub2_2 = this.aClass115_3.method3355(255, 255, true, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZLclient!cw;ZLclient!cw;)Lclient!fe;")
	private Class87_Sub1 method5551(@OriginalArg(0) int arg0, @OriginalArg(2) Class51 arg1, @OriginalArg(4) Class51 arg2) {
		if (this.aClass1_Sub13_5 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || this.aClass87_Sub1Array2.length <= arg0) {
			throw new RuntimeException();
		} else if (this.aClass87_Sub1Array2[arg0] == null) {
			this.aClass1_Sub13_5.anInt3400 = arg0 * 72 + 6;
			@Pc(44) int local44 = this.aClass1_Sub13_5.method3037();
			@Pc(54) int local54 = this.aClass1_Sub13_5.method3037();
			@Pc(57) byte[] local57 = new byte[64];
			this.aClass1_Sub13_5.method3071(local57, 64);
			@Pc(79) Class87_Sub1 local79 = new Class87_Sub1(arg0, arg1, arg2, this.aClass115_3, this.aClass147_3, local44, local57, local54, true);
			this.aClass87_Sub1Array2[arg0] = local79;
			return local79;
		} else {
			return this.aClass87_Sub1Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!cw;ILclient!cw;I)Lclient!fe;")
	public Class87_Sub1 method5553(@OriginalArg(0) Class51 arg0, @OriginalArg(2) Class51 arg1, @OriginalArg(3) int arg2) {
		return this.method5551(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)Z")
	public boolean method5554() {
		if (this.aClass1_Sub13_5 != null) {
			return true;
		}
		if (this.aClass1_Sub1_Sub11_Sub2_2 == null) {
			if (this.aClass115_3.method3353()) {
				return false;
			}
			this.aClass1_Sub1_Sub11_Sub2_2 = this.aClass115_3.method3355(255, 255, true, (byte) 0);
		}
		if (this.aClass1_Sub1_Sub11_Sub2_2.aBoolean562) {
			return false;
		}
		@Pc(52) Class1_Sub13 local52 = new Class1_Sub13(this.aClass1_Sub1_Sub11_Sub2_2.method6987());
		local52.anInt3400 = 5;
		@Pc(59) int local59 = local52.method3043();
		local52.anInt3400 += local59 * 72;
		@Pc(76) byte[] local76 = new byte[local52.aByteArray45.length - local52.anInt3400];
		local52.method3071(local76, local76.length);
		@Pc(104) byte[] local104;
		if (this.aBigInteger5 == null || this.aBigInteger6 == null) {
			local104 = local76;
		} else {
			@Pc(94) BigInteger local94 = new BigInteger(local76);
			@Pc(101) BigInteger local101 = local94.modPow(this.aBigInteger5, this.aBigInteger6);
			local104 = local101.toByteArray();
		}
		if (local104.length != 65) {
			throw new RuntimeException();
		}
		@Pc(131) byte[] local131 = Static528.method7532(local52.aByteArray45, local52.anInt3400 - local76.length - 5, 5);
		for (@Pc(133) int local133 = 0; local133 < 64; local133++) {
			if (local131[local133] != local104[local133 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass1_Sub13_5 = local52;
		this.aClass87_Sub1Array2 = new Class87_Sub1[local59];
		return true;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V")
	public void method5555() {
		if (this.aClass87_Sub1Array2 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < this.aClass87_Sub1Array2.length; local9++) {
			if (this.aClass87_Sub1Array2[local9] != null) {
				this.aClass87_Sub1Array2[local9].method2842();
			}
		}
		for (@Pc(29) int local29 = 0; local29 < this.aClass87_Sub1Array2.length; local29++) {
			if (this.aClass87_Sub1Array2[local29] != null) {
				this.aClass87_Sub1Array2[local29].method2843();
			}
		}
	}
}
