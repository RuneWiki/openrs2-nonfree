import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class276 {

	@OriginalMember(owner = "client!so", name = "i", descriptor = "[Lclient!iw;")
	private Class117_Sub1[] aClass117_Sub1Array5;

	@OriginalMember(owner = "client!so", name = "l", descriptor = "Lclient!daa;")
	private Class12_Sub8 aClass12_Sub8_6;

	@OriginalMember(owner = "client!so", name = "c", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger5;

	@OriginalMember(owner = "client!so", name = "e", descriptor = "Lclient!ni;")
	private final Class217 aClass217_3;

	@OriginalMember(owner = "client!so", name = "j", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger6;

	@OriginalMember(owner = "client!so", name = "f", descriptor = "Lclient!ef;")
	private final Class86 aClass86_3;

	@OriginalMember(owner = "client!so", name = "m", descriptor = "Lclient!uca;")
	private Class12_Sub4_Sub9_Sub2 aClass12_Sub4_Sub9_Sub2_2;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!ef;Lclient!ni;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class276(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class217 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger5 = arg2;
		this.aClass217_3 = arg1;
		this.aBigInteger6 = arg3;
		this.aClass86_3 = arg0;
		if (!this.aClass86_3.method2321()) {
			this.aClass12_Sub4_Sub9_Sub2_2 = this.aClass86_3.method2310(true, 255, (byte) 0, 255);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B)Z")
	public boolean method6855() {
		if (this.aClass12_Sub8_6 != null) {
			return true;
		}
		if (this.aClass12_Sub4_Sub9_Sub2_2 == null) {
			if (this.aClass86_3.method2321()) {
				return false;
			}
			this.aClass12_Sub4_Sub9_Sub2_2 = this.aClass86_3.method2310(true, 255, (byte) 0, 255);
		}
		if (this.aClass12_Sub4_Sub9_Sub2_2.aBoolean623) {
			return false;
		}
		@Pc(44) Class12_Sub8 local44 = new Class12_Sub8(this.aClass12_Sub4_Sub9_Sub2_2.method7280());
		local44.anInt6217 = 5;
		@Pc(51) int local51 = local44.method5216();
		local44.anInt6217 += local51 * 72;
		@Pc(67) byte[] local67 = new byte[local44.aByteArray82.length - local44.anInt6217];
		local44.method5181(local67.length, local67);
		@Pc(90) byte[] local90;
		if (this.aBigInteger5 == null || this.aBigInteger6 == null) {
			local90 = local67;
		} else {
			@Pc(97) BigInteger local97 = new BigInteger(local67);
			@Pc(104) BigInteger local104 = local97.modPow(this.aBigInteger5, this.aBigInteger6);
			local90 = local104.toByteArray();
		}
		if (local90.length != 65) {
			throw new RuntimeException();
		}
		@Pc(129) byte[] local129 = Static344.method5423(5, local44.anInt6217 - local67.length - 5, local44.aByteArray82);
		for (@Pc(131) int local131 = 0; local131 < 64; local131++) {
			if (local90[local131 + 1] != local129[local131]) {
				throw new RuntimeException();
			}
		}
		this.aClass12_Sub8_6 = local44;
		this.aClass117_Sub1Array5 = new Class117_Sub1[local51];
		return true;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!oba;Lclient!oba;IIZ)Lclient!iw;")
	private Class117_Sub1 method6856(@OriginalArg(0) Class224 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) int arg2) {
		if (this.aClass12_Sub8_6 == null) {
			throw new RuntimeException();
		} else if (arg2 < 0 || this.aClass117_Sub1Array5.length <= arg2) {
			throw new RuntimeException();
		} else if (this.aClass117_Sub1Array5[arg2] == null) {
			this.aClass12_Sub8_6.anInt6217 = arg2 * 72 + 6;
			@Pc(47) int local47 = this.aClass12_Sub8_6.method5225();
			@Pc(52) int local52 = this.aClass12_Sub8_6.method5225();
			@Pc(55) byte[] local55 = new byte[64];
			this.aClass12_Sub8_6.method5181(64, local55);
			@Pc(77) Class117_Sub1 local77 = new Class117_Sub1(arg2, arg1, arg0, this.aClass86_3, this.aClass217_3, local47, local55, local52, true);
			this.aClass117_Sub1Array5[arg2] = local77;
			return local77;
		} else {
			return this.aClass117_Sub1Array5[arg2];
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!oba;ZILclient!oba;)Lclient!iw;")
	public Class117_Sub1 method6857(@OriginalArg(0) Class224 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class224 arg2) {
		return this.method6856(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)V")
	public void method6862() {
		if (this.aClass117_Sub1Array5 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass117_Sub1Array5.length; local11++) {
			if (this.aClass117_Sub1Array5[local11] != null) {
				this.aClass117_Sub1Array5[local11].method4003();
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.aClass117_Sub1Array5.length; local36++) {
			if (this.aClass117_Sub1Array5[local36] != null) {
				this.aClass117_Sub1Array5[local36].method4010();
			}
		}
	}
}
