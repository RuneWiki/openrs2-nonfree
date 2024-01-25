import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class295 {

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "Lclient!sl;")
	private Class3_Sub3 aClass3_Sub3_8;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "[Lclient!rl;")
	private Class147_Sub1[] aClass147_Sub1Array1;

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "Lclient!oh;")
	private final Class248 aClass248_2;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger7;

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "Lclient!pt;")
	private final Class266 aClass266_3;

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger8;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "Lclient!wl;")
	private Class3_Sub4_Sub9_Sub2 aClass3_Sub4_Sub9_Sub2_2;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!oh;Lclient!pt;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class295(@OriginalArg(0) Class248 arg0, @OriginalArg(1) Class266 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass248_2 = arg0;
		this.aBigInteger7 = arg2;
		this.aClass266_3 = arg1;
		this.aBigInteger8 = arg3;
		if (!this.aClass248_2.method6457()) {
			this.aClass3_Sub4_Sub9_Sub2_2 = this.aClass248_2.method6461((byte) 0, 255, true, 255);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!lp;ILclient!lp;Z)Lclient!rl;")
	private Class147_Sub1 method7325(@OriginalArg(0) int arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(3) Class209 arg2) {
		if (this.aClass3_Sub3_8 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || this.aClass147_Sub1Array1.length <= arg0) {
			throw new RuntimeException();
		} else if (this.aClass147_Sub1Array1[arg0] == null) {
			this.aClass3_Sub3_8.anInt4736 = arg0 * 72 + 6;
			@Pc(44) int local44 = this.aClass3_Sub3_8.method4207();
			@Pc(49) int local49 = this.aClass3_Sub3_8.method4207();
			@Pc(52) byte[] local52 = new byte[64];
			this.aClass3_Sub3_8.method4206(local52, 64, 0);
			@Pc(74) Class147_Sub1 local74 = new Class147_Sub1(arg0, arg2, arg1, this.aClass248_2, this.aClass266_3, local44, local52, local49, true);
			this.aClass147_Sub1Array1[arg0] = local74;
			return local74;
		} else {
			return this.aClass147_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
	public void method7326() {
		if (this.aClass147_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass147_Sub1Array1.length; local11++) {
			if (this.aClass147_Sub1Array1[local11] != null) {
				this.aClass147_Sub1Array1[local11].method7348();
			}
		}
		for (@Pc(41) int local41 = 0; local41 < this.aClass147_Sub1Array1.length; local41++) {
			if (this.aClass147_Sub1Array1[local41] != null) {
				this.aClass147_Sub1Array1[local41].method7346();
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)Z")
	public boolean method7327() {
		if (this.aClass3_Sub3_8 != null) {
			return true;
		}
		if (this.aClass3_Sub4_Sub9_Sub2_2 == null) {
			if (this.aClass248_2.method6457()) {
				return false;
			}
			this.aClass3_Sub4_Sub9_Sub2_2 = this.aClass248_2.method6461((byte) 0, 255, true, 255);
		}
		if (this.aClass3_Sub4_Sub9_Sub2_2.aBoolean724) {
			return false;
		}
		@Pc(44) Class3_Sub3 local44 = new Class3_Sub3(this.aClass3_Sub4_Sub9_Sub2_2.method8677());
		local44.anInt4736 = 5;
		@Pc(51) int local51 = local44.method4225();
		local44.anInt4736 += local51 * 72;
		@Pc(67) byte[] local67 = new byte[local44.aByteArray54.length - local44.anInt4736];
		local44.method4206(local67, local67.length, 0);
		@Pc(82) byte[] local82;
		if (this.aBigInteger7 == null || this.aBigInteger8 == null) {
			local82 = local67;
		} else {
			@Pc(89) BigInteger local89 = new BigInteger(local67);
			@Pc(96) BigInteger local96 = local89.modPow(this.aBigInteger7, this.aBigInteger8);
			local82 = local96.toByteArray();
		}
		if (local82.length != 65) {
			throw new RuntimeException();
		}
		@Pc(121) byte[] local121 = Static331.method5406(local44.anInt4736 - local67.length - 5, local44.aByteArray54, 5);
		for (@Pc(123) int local123 = 0; local123 < 64; local123++) {
			if (local82[local123 + 1] != local121[local123]) {
				throw new RuntimeException();
			}
		}
		this.aClass3_Sub3_8 = local44;
		this.aClass147_Sub1Array1 = new Class147_Sub1[local51];
		return true;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!lp;BILclient!lp;)Lclient!rl;")
	public Class147_Sub1 method7329(@OriginalArg(0) Class209 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class209 arg2) {
		return this.method7325(arg1, arg2, arg0);
	}
}
