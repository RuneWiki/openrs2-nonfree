import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class195 {

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "[Lclient!ida;")
	private Class146_Sub1[] aClass146_Sub1Array2;

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "Lclient!un;")
	private Class4_Sub11 aClass4_Sub11_3;

	@OriginalMember(owner = "client!kp", name = "i", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger6;

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "Lclient!qc;")
	private final Class269 aClass269_2;

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger7;

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "Lclient!uh;")
	private final Class329 aClass329_2;

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "Lclient!cga;")
	private Class4_Sub5_Sub3_Sub1 aClass4_Sub5_Sub3_Sub1_1;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!uh;Lclient!qc;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class195(@OriginalArg(0) Class329 arg0, @OriginalArg(1) Class269 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger6 = arg2;
		this.aClass269_2 = arg1;
		this.aBigInteger7 = arg3;
		this.aClass329_2 = arg0;
		if (!this.aClass329_2.method7767()) {
			this.aClass4_Sub5_Sub3_Sub1_1 = this.aClass329_2.method7772(255, 255, true, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
	public void method4823() {
		if (this.aClass146_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass146_Sub1Array2.length; local11++) {
			if (this.aClass146_Sub1Array2[local11] != null) {
				this.aClass146_Sub1Array2[local11].method3528();
			}
		}
		for (@Pc(41) int local41 = 0; local41 < this.aClass146_Sub1Array2.length; local41++) {
			if (this.aClass146_Sub1Array2[local41] != null) {
				this.aClass146_Sub1Array2[local41].method3527();
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZLclient!vp;IZLclient!vp;)Lclient!ida;")
	private Class146_Sub1 method4825(@OriginalArg(1) Class345 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class345 arg2) {
		if (this.aClass4_Sub11_3 == null) {
			throw new RuntimeException();
		} else if (arg1 < 0 || arg1 >= this.aClass146_Sub1Array2.length) {
			throw new RuntimeException();
		} else if (this.aClass146_Sub1Array2[arg1] == null) {
			this.aClass4_Sub11_3.anInt5831 = arg1 * 72 + 6;
			@Pc(47) int local47 = this.aClass4_Sub11_3.method4931();
			@Pc(52) int local52 = this.aClass4_Sub11_3.method4931();
			@Pc(60) byte[] local60 = new byte[64];
			this.aClass4_Sub11_3.method4926(64, local60);
			@Pc(82) Class146_Sub1 local82 = new Class146_Sub1(arg1, arg2, arg0, this.aClass329_2, this.aClass269_2, local47, local60, local52, true);
			this.aClass146_Sub1Array2[arg1] = local82;
			return local82;
		} else {
			return this.aClass146_Sub1Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!vp;IILclient!vp;)Lclient!ida;")
	public Class146_Sub1 method4826(@OriginalArg(0) Class345 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class345 arg2) {
		return this.method4825(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(B)Z")
	public boolean method4828() {
		if (this.aClass4_Sub11_3 != null) {
			return true;
		}
		if (this.aClass4_Sub5_Sub3_Sub1_1 == null) {
			if (this.aClass329_2.method7767()) {
				return false;
			}
			this.aClass4_Sub5_Sub3_Sub1_1 = this.aClass329_2.method7772(255, 255, true, (byte) 0);
		}
		if (this.aClass4_Sub5_Sub3_Sub1_1.aBoolean279) {
			return false;
		}
		@Pc(44) Class4_Sub11 local44 = new Class4_Sub11(this.aClass4_Sub5_Sub3_Sub1_1.method2841());
		local44.anInt5831 = 5;
		@Pc(51) int local51 = local44.method4905();
		local44.anInt5831 += local51 * 72;
		@Pc(68) byte[] local68 = new byte[local44.aByteArray68.length - local44.anInt5831];
		local44.method4926(local68.length, local68);
		@Pc(88) byte[] local88;
		if (this.aBigInteger6 == null || this.aBigInteger7 == null) {
			local88 = local68;
		} else {
			@Pc(95) BigInteger local95 = new BigInteger(local68);
			@Pc(102) BigInteger local102 = local95.modPow(this.aBigInteger6, this.aBigInteger7);
			local88 = local102.toByteArray();
		}
		if (local88.length != 65) {
			throw new RuntimeException();
		}
		@Pc(127) byte[] local127 = Static560.method8057(local44.anInt5831 - local68.length - 5, local44.aByteArray68, 5);
		for (@Pc(129) int local129 = 0; local129 < 64; local129++) {
			if (local88[local129 + 1] != local127[local129]) {
				throw new RuntimeException();
			}
		}
		this.aClass146_Sub1Array2 = new Class146_Sub1[local51];
		this.aClass4_Sub11_3 = local44;
		return true;
	}
}
