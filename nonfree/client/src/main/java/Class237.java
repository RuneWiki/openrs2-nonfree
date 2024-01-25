import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class237 {

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "Lclient!ofa;")
	private Class5_Sub22 aClass5_Sub22_9;

	@OriginalMember(owner = "client!mt", name = "h", descriptor = "[Lclient!me;")
	private Class229_Sub1[] aClass229_Sub1Array2;

	@OriginalMember(owner = "client!mt", name = "i", descriptor = "Lclient!rt;")
	private final Class309 aClass309_3;

	@OriginalMember(owner = "client!mt", name = "l", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger7;

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "Lclient!ih;")
	private final Class161 aClass161_2;

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger6;

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "Lclient!vea;")
	private Class5_Sub5_Sub8_Sub2 aClass5_Sub5_Sub8_Sub2_1;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!rt;Lclient!ih;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class237(@OriginalArg(0) Class309 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass309_3 = arg0;
		this.aBigInteger7 = arg2;
		this.aClass161_2 = arg1;
		this.aBigInteger6 = arg3;
		if (!this.aClass309_3.method7413()) {
			this.aClass5_Sub5_Sub8_Sub2_1 = this.aClass309_3.method7409(true, 255, (byte) 0, 255);
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
	public void method5273() {
		if (this.aClass229_Sub1Array2 == null) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < this.aClass229_Sub1Array2.length; local21++) {
			if (this.aClass229_Sub1Array2[local21] != null) {
				this.aClass229_Sub1Array2[local21].method5078();
			}
		}
		for (@Pc(42) int local42 = 0; local42 < this.aClass229_Sub1Array2.length; local42++) {
			if (this.aClass229_Sub1Array2[local42] != null) {
				this.aClass229_Sub1Array2[local42].method5079();
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIZLclient!id;Lclient!id;)Lclient!me;")
	private Class229_Sub1 method5274(@OriginalArg(0) int arg0, @OriginalArg(3) Class157 arg1, @OriginalArg(4) Class157 arg2) {
		if (this.aClass5_Sub22_9 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass229_Sub1Array2.length) {
			throw new RuntimeException();
		} else if (this.aClass229_Sub1Array2[arg0] == null) {
			this.aClass5_Sub22_9.anInt6629 = arg0 * 72 + 6;
			@Pc(49) int local49 = this.aClass5_Sub22_9.method5913();
			@Pc(54) int local54 = this.aClass5_Sub22_9.method5913();
			@Pc(57) byte[] local57 = new byte[64];
			this.aClass5_Sub22_9.method5915(0, 64, local57);
			@Pc(79) Class229_Sub1 local79 = new Class229_Sub1(arg0, arg1, arg2, this.aClass309_3, this.aClass161_2, local49, local57, local54, true);
			this.aClass229_Sub1Array2[arg0] = local79;
			return local79;
		} else {
			return this.aClass229_Sub1Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)Z")
	public boolean method5275() {
		if (this.aClass5_Sub22_9 != null) {
			return true;
		}
		if (this.aClass5_Sub5_Sub8_Sub2_1 == null) {
			if (this.aClass309_3.method7413()) {
				return false;
			}
			this.aClass5_Sub5_Sub8_Sub2_1 = this.aClass309_3.method7409(true, 255, (byte) 0, 255);
		}
		if (this.aClass5_Sub5_Sub8_Sub2_1.aBoolean706) {
			return false;
		}
		@Pc(54) Class5_Sub22 local54 = new Class5_Sub22(this.aClass5_Sub5_Sub8_Sub2_1.method8529());
		local54.anInt6629 = 5;
		@Pc(61) int local61 = local54.method5966();
		local54.anInt6629 += local61 * 72;
		@Pc(78) byte[] local78 = new byte[local54.aByteArray71.length - local54.anInt6629];
		local54.method5915(0, local78.length, local78);
		@Pc(106) byte[] local106;
		if (this.aBigInteger7 == null || this.aBigInteger6 == null) {
			local106 = local78;
		} else {
			@Pc(96) BigInteger local96 = new BigInteger(local78);
			@Pc(103) BigInteger local103 = local96.modPow(this.aBigInteger7, this.aBigInteger6);
			local106 = local103.toByteArray();
		}
		if (local106.length != 65) {
			throw new RuntimeException();
		}
		@Pc(132) byte[] local132 = Static430.method6207(local54.anInt6629 - local78.length - 5, 5, local54.aByteArray71);
		for (@Pc(134) int local134 = 0; local134 < 64; local134++) {
			if (local132[local134] != local106[local134 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass5_Sub22_9 = local54;
		this.aClass229_Sub1Array2 = new Class229_Sub1[local61];
		return true;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BLclient!id;Lclient!id;I)Lclient!me;")
	public Class229_Sub1 method5277(@OriginalArg(1) Class157 arg0, @OriginalArg(2) Class157 arg1, @OriginalArg(3) int arg2) {
		return this.method5274(arg2, arg1, arg0);
	}
}
