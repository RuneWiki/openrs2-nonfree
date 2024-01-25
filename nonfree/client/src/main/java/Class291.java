import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class291 {

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "Lclient!rv;")
	private Class5_Sub15 aClass5_Sub15_8;

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "[Lclient!ae;")
	private Class7_Sub1[] aClass7_Sub1Array3;

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger4;

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "Lclient!cca;")
	private final Class52 aClass52_3;

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "Lclient!ql;")
	private final Class288 aClass288_2;

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger5;

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "Lclient!te;")
	private Class5_Sub2_Sub14_Sub1 aClass5_Sub2_Sub14_Sub1_2;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!ql;Lclient!cca;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class291(@OriginalArg(0) Class288 arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger4 = arg2;
		this.aClass52_3 = arg1;
		this.aClass288_2 = arg0;
		this.aBigInteger5 = arg3;
		if (!this.aClass288_2.method7047()) {
			this.aClass5_Sub2_Sub14_Sub1_2 = this.aClass288_2.method7042(true, 255, (byte) 0, 255);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!qia;ZLclient!qia;BI)Lclient!ae;")
	private Class7_Sub1 method7093(@OriginalArg(0) Class287 arg0, @OriginalArg(2) Class287 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass5_Sub15_8 == null) {
			throw new RuntimeException();
		} else if (arg2 < 0 || arg2 >= this.aClass7_Sub1Array3.length) {
			throw new RuntimeException();
		} else if (this.aClass7_Sub1Array3[arg2] == null) {
			this.aClass5_Sub15_8.anInt4144 = arg2 * 72 + 6;
			@Pc(57) int local57 = this.aClass5_Sub15_8.method3671();
			@Pc(62) int local62 = this.aClass5_Sub15_8.method3671();
			@Pc(65) byte[] local65 = new byte[64];
			this.aClass5_Sub15_8.method3650(0, 64, local65);
			@Pc(89) Class7_Sub1 local89 = new Class7_Sub1(arg2, arg1, arg0, this.aClass288_2, this.aClass52_3, local57, local65, local62, true);
			this.aClass7_Sub1Array3[arg2] = local89;
			return local89;
		} else {
			return this.aClass7_Sub1Array3[arg2];
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)Z")
	public boolean method7095() {
		if (this.aClass5_Sub15_8 != null) {
			return true;
		}
		if (this.aClass5_Sub2_Sub14_Sub1_2 == null) {
			if (this.aClass288_2.method7047()) {
				return false;
			}
			this.aClass5_Sub2_Sub14_Sub1_2 = this.aClass288_2.method7042(true, 255, (byte) 0, 255);
		}
		if (this.aClass5_Sub2_Sub14_Sub1_2.aBoolean746) {
			return false;
		}
		@Pc(47) Class5_Sub15 local47 = new Class5_Sub15(this.aClass5_Sub2_Sub14_Sub1_2.method8575());
		local47.anInt4144 = 5;
		@Pc(54) int local54 = local47.method3642();
		local47.anInt4144 += local54 * 72;
		@Pc(71) byte[] local71 = new byte[local47.aByteArray45.length - local47.anInt4144];
		local47.method3650(0, local71.length, local71);
		@Pc(99) byte[] local99;
		if (this.aBigInteger4 == null || this.aBigInteger5 == null) {
			local99 = local71;
		} else {
			@Pc(89) BigInteger local89 = new BigInteger(local71);
			@Pc(96) BigInteger local96 = local89.modPow(this.aBigInteger4, this.aBigInteger5);
			local99 = local96.toByteArray();
		}
		if (local99.length != 65) {
			throw new RuntimeException();
		}
		@Pc(124) byte[] local124 = Static52.method800(local47.anInt4144 - local71.length - 5, 5, local47.aByteArray45);
		for (@Pc(126) int local126 = 0; local126 < 64; local126++) {
			if (local99[local126 + 1] != local124[local126]) {
				throw new RuntimeException();
			}
		}
		this.aClass5_Sub15_8 = local47;
		this.aClass7_Sub1Array3 = new Class7_Sub1[local54];
		return true;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
	public void method7096() {
		if (this.aClass7_Sub1Array3 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass7_Sub1Array3.length; local11++) {
			if (this.aClass7_Sub1Array3[local11] != null) {
				this.aClass7_Sub1Array3[local11].method164();
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.aClass7_Sub1Array3.length; local36++) {
			if (this.aClass7_Sub1Array3[local36] != null) {
				this.aClass7_Sub1Array3[local36].method163();
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BILclient!qia;Lclient!qia;)Lclient!ae;")
	public Class7_Sub1 method7098(@OriginalArg(1) int arg0, @OriginalArg(2) Class287 arg1, @OriginalArg(3) Class287 arg2) {
		return this.method7093(arg1, arg2, arg0);
	}
}
