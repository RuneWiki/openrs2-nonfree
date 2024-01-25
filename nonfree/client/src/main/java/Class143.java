import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class143 {

	@OriginalMember(owner = "client!je", name = "f", descriptor = "Lclient!ps;")
	private Class2_Sub29 aClass2_Sub29_5;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "[Lclient!ko;")
	private Class164_Sub1[] aClass164_Sub1Array2;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Lclient!fs;")
	private final Class94 aClass94_2;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "Lclient!dk;")
	private final Class57 aClass57_1;

	@OriginalMember(owner = "client!je", name = "i", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger3;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger2;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!paa;")
	private Class2_Sub13_Sub2_Sub2 aClass2_Sub13_Sub2_Sub2_2;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!fs;Lclient!dk;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class143(@OriginalArg(0) Class94 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass94_2 = arg0;
		this.aClass57_1 = arg1;
		this.aBigInteger3 = arg3;
		this.aBigInteger2 = arg2;
		if (!this.aClass94_2.method2501()) {
			this.aClass2_Sub13_Sub2_Sub2_2 = this.aClass94_2.method2495(255, (byte) 0, true, 255);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!saa;Lclient!saa;IB)Lclient!ko;")
	public Class164_Sub1 method3489(@OriginalArg(0) Class257 arg0, @OriginalArg(1) Class257 arg1, @OriginalArg(2) int arg2) {
		return this.method3491(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)Z")
	public boolean method3490() {
		if (this.aClass2_Sub29_5 != null) {
			return true;
		}
		if (this.aClass2_Sub13_Sub2_Sub2_2 == null) {
			if (this.aClass94_2.method2501()) {
				return false;
			}
			this.aClass2_Sub13_Sub2_Sub2_2 = this.aClass94_2.method2495(255, (byte) 0, true, 255);
		}
		if (this.aClass2_Sub13_Sub2_Sub2_2.aBoolean514) {
			return false;
		}
		@Pc(44) Class2_Sub29 local44 = new Class2_Sub29(this.aClass2_Sub13_Sub2_Sub2_2.method5809());
		local44.anInt6132 = 5;
		@Pc(51) int local51 = local44.method5170();
		local44.anInt6132 += local51 * 72;
		@Pc(67) byte[] local67 = new byte[local44.aByteArray96.length - local44.anInt6132];
		local44.method5184(local67.length, local67);
		@Pc(90) byte[] local90;
		if (this.aBigInteger2 == null || this.aBigInteger3 == null) {
			local90 = local67;
		} else {
			@Pc(97) BigInteger local97 = new BigInteger(local67);
			@Pc(104) BigInteger local104 = local97.modPow(this.aBigInteger2, this.aBigInteger3);
			local90 = local104.toByteArray();
		}
		if (local90.length != 65) {
			throw new RuntimeException();
		}
		@Pc(131) byte[] local131 = Static266.method4288(5, local44.anInt6132 - local67.length - 5, local44.aByteArray96);
		for (@Pc(133) int local133 = 0; local133 < 64; local133++) {
			if (local90[local133 + 1] != local131[local133]) {
				throw new RuntimeException();
			}
		}
		this.aClass2_Sub29_5 = local44;
		this.aClass164_Sub1Array2 = new Class164_Sub1[local51];
		return true;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!saa;IZLclient!saa;I)Lclient!ko;")
	private Class164_Sub1 method3491(@OriginalArg(0) Class257 arg0, @OriginalArg(3) Class257 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass2_Sub29_5 == null) {
			throw new RuntimeException();
		} else if (arg2 < 0 || arg2 >= this.aClass164_Sub1Array2.length) {
			throw new RuntimeException();
		} else if (this.aClass164_Sub1Array2[arg2] == null) {
			this.aClass2_Sub29_5.anInt6132 = arg2 * 72 + 6;
			@Pc(51) int local51 = this.aClass2_Sub29_5.method5198();
			@Pc(58) int local58 = this.aClass2_Sub29_5.method5198();
			@Pc(61) byte[] local61 = new byte[64];
			this.aClass2_Sub29_5.method5184(64, local61);
			@Pc(83) Class164_Sub1 local83 = new Class164_Sub1(arg2, arg1, arg0, this.aClass94_2, this.aClass57_1, local51, local61, local58, true);
			this.aClass164_Sub1Array2[arg2] = local83;
			return local83;
		} else {
			return this.aClass164_Sub1Array2[arg2];
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public void method3492() {
		if (this.aClass164_Sub1Array2 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.aClass164_Sub1Array2.length; local19++) {
			if (this.aClass164_Sub1Array2[local19] != null) {
				this.aClass164_Sub1Array2[local19].method4008();
			}
		}
		for (@Pc(44) int local44 = 0; local44 < this.aClass164_Sub1Array2.length; local44++) {
			if (this.aClass164_Sub1Array2[local44] != null) {
				this.aClass164_Sub1Array2[local44].method4009();
			}
		}
	}
}
