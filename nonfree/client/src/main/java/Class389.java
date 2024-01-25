import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class389 {

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "Lclient!rba;")
	private Class3_Sub28 aClass3_Sub28_10;

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "[Lclient!ik;")
	private Class171_Sub1[] aClass171_Sub1Array2;

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger6;

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "Lclient!nn;")
	private final Class259 aClass259_3;

	@OriginalMember(owner = "client!vo", name = "h", descriptor = "Lclient!hja;")
	private final Class153 aClass153_3;

	@OriginalMember(owner = "client!vo", name = "m", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger4;

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "Lclient!hc;")
	private Class3_Sub4_Sub10_Sub1 aClass3_Sub4_Sub10_Sub1_2;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!hja;Lclient!nn;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class389(@OriginalArg(0) Class153 arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger6 = arg2;
		this.aClass259_3 = arg1;
		this.aClass153_3 = arg0;
		this.aBigInteger4 = arg3;
		if (!this.aClass153_3.method3743()) {
			this.aClass3_Sub4_Sub10_Sub1_2 = this.aClass153_3.method3747(255, true, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZLclient!dka;BILclient!dka;)Lclient!ik;")
	private Class171_Sub1 method9065(@OriginalArg(1) Class73 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class73 arg2) {
		if (this.aClass3_Sub28_10 == null) {
			throw new RuntimeException();
		} else if (arg1 < 0 || this.aClass171_Sub1Array2.length <= arg1) {
			throw new RuntimeException();
		} else if (this.aClass171_Sub1Array2[arg1] == null) {
			this.aClass3_Sub28_10.anInt6241 = arg1 * 72 + 6;
			@Pc(54) int local54 = this.aClass3_Sub28_10.method5312();
			@Pc(61) int local61 = this.aClass3_Sub28_10.method5312();
			@Pc(64) byte[] local64 = new byte[64];
			this.aClass3_Sub28_10.method5271(local64, 64, 0);
			@Pc(94) Class171_Sub1 local94 = new Class171_Sub1(arg1, arg0, arg2, this.aClass153_3, this.aClass259_3, local54, local64, local61, true);
			this.aClass171_Sub1Array2[arg1] = local94;
			return local94;
		} else {
			return this.aClass171_Sub1Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
	public void method9066() {
		if (this.aClass171_Sub1Array2 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aClass171_Sub1Array2.length; local12++) {
			if (this.aClass171_Sub1Array2[local12] != null) {
				this.aClass171_Sub1Array2[local12].method4221();
			}
		}
		for (@Pc(49) int local49 = 0; local49 < this.aClass171_Sub1Array2.length; local49++) {
			if (this.aClass171_Sub1Array2[local49] != null) {
				this.aClass171_Sub1Array2[local49].method4223();
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "(B)Z")
	public boolean method9069() {
		if (this.aClass3_Sub28_10 != null) {
			return true;
		}
		if (this.aClass3_Sub4_Sub10_Sub1_2 == null) {
			if (this.aClass153_3.method3743()) {
				return false;
			}
			this.aClass3_Sub4_Sub10_Sub1_2 = this.aClass153_3.method3747(255, true, 255, (byte) 0);
		}
		if (this.aClass3_Sub4_Sub10_Sub1_2.aBoolean389) {
			return false;
		}
		@Pc(62) Class3_Sub28 local62 = new Class3_Sub28(this.aClass3_Sub4_Sub10_Sub1_2.method3686());
		local62.anInt6241 = 5;
		@Pc(69) int local69 = local62.method5322(-107);
		local62.anInt6241 += local69 * 72;
		@Pc(86) byte[] local86 = new byte[local62.aByteArray50.length - local62.anInt6241];
		local62.method5271(local86, local86.length, 0);
		@Pc(116) byte[] local116;
		if (this.aBigInteger6 == null || this.aBigInteger4 == null) {
			local116 = local86;
		} else {
			@Pc(106) BigInteger local106 = new BigInteger(local86);
			@Pc(113) BigInteger local113 = local106.modPow(this.aBigInteger6, this.aBigInteger4);
			local116 = local113.toByteArray();
		}
		if (local116.length != 65) {
			throw new RuntimeException();
		}
		@Pc(143) byte[] local143 = Static79.method1032(5, local62.anInt6241 - local86.length - 5, local62.aByteArray50);
		for (@Pc(145) int local145 = 0; local145 < 64; local145++) {
			if (local116[local145 + 1] != local143[local145]) {
				throw new RuntimeException();
			}
		}
		this.aClass3_Sub28_10 = local62;
		this.aClass171_Sub1Array2 = new Class171_Sub1[local69];
		return true;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!dka;BLclient!dka;)Lclient!ik;")
	public Class171_Sub1 method9070(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(3) Class73 arg2) {
		return this.method9065(arg1, arg0, arg2);
	}
}
