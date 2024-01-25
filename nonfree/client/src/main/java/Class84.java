import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class84 {

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "Lclient!cea;")
	private Class2_Sub11 aClass2_Sub11_1;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "[Lclient!bja;")
	private Class37_Sub1[] aClass37_Sub1Array2;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Lclient!aca;")
	private final Class5 aClass5_2;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger2;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger1;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "Lclient!tha;")
	private final Class329 aClass329_2;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "Lclient!mba;")
	private Class2_Sub6_Sub8_Sub1 aClass2_Sub6_Sub8_Sub1_1;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!tha;Lclient!aca;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class84(@OriginalArg(0) Class329 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass5_2 = arg1;
		this.aBigInteger2 = arg3;
		this.aBigInteger1 = arg2;
		this.aClass329_2 = arg0;
		if (!this.aClass329_2.method8125()) {
			this.aClass2_Sub6_Sub8_Sub1_1 = this.aClass329_2.method8131((byte) 0, true, 255, 255);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public void method2849() {
		if (this.aClass37_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass37_Sub1Array2.length; local11++) {
			if (this.aClass37_Sub1Array2[local11] != null) {
				this.aClass37_Sub1Array2[local11].method1664();
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.aClass37_Sub1Array2.length; local36++) {
			if (this.aClass37_Sub1Array2[local36] != null) {
				this.aClass37_Sub1Array2[local36].method1665();
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!nw;ILclient!nw;I)Lclient!bja;")
	public Class37_Sub1 method2852(@OriginalArg(0) Class233 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class233 arg2) {
		return this.method2854(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)Z")
	public boolean method2853() {
		if (this.aClass2_Sub11_1 != null) {
			return true;
		}
		if (this.aClass2_Sub6_Sub8_Sub1_1 == null) {
			if (this.aClass329_2.method8125()) {
				return false;
			}
			this.aClass2_Sub6_Sub8_Sub1_1 = this.aClass329_2.method8131((byte) 0, true, 255, 255);
		}
		if (this.aClass2_Sub6_Sub8_Sub1_1.aBoolean601) {
			return false;
		}
		@Pc(46) Class2_Sub11 local46 = new Class2_Sub11(this.aClass2_Sub6_Sub8_Sub1_1.method7144());
		local46.anInt10066 = 5;
		@Pc(55) int local55 = local46.method8383();
		local46.anInt10066 += local55 * 72;
		@Pc(71) byte[] local71 = new byte[local46.aByteArray128.length - local46.anInt10066];
		local46.method8385(0, local71.length, local71);
		@Pc(105) byte[] local105;
		if (this.aBigInteger1 == null || this.aBigInteger2 == null) {
			local105 = local71;
		} else {
			@Pc(95) BigInteger local95 = new BigInteger(local71);
			@Pc(102) BigInteger local102 = local95.modPow(this.aBigInteger1, this.aBigInteger2);
			local105 = local102.toByteArray();
		}
		if (local105.length != 65) {
			throw new RuntimeException();
		}
		@Pc(132) byte[] local132 = Static98.method2590(5, local46.aByteArray128, local46.anInt10066 - local71.length - 5);
		for (@Pc(134) int local134 = 0; local134 < 64; local134++) {
			if (local105[local134 + 1] != local132[local134]) {
				throw new RuntimeException();
			}
		}
		this.aClass2_Sub11_1 = local46;
		this.aClass37_Sub1Array2 = new Class37_Sub1[local55];
		return true;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BZILclient!nw;Lclient!nw;)Lclient!bja;")
	private Class37_Sub1 method2854(@OriginalArg(2) int arg0, @OriginalArg(3) Class233 arg1, @OriginalArg(4) Class233 arg2) {
		if (this.aClass2_Sub11_1 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass37_Sub1Array2.length) {
			throw new RuntimeException();
		} else if (this.aClass37_Sub1Array2[arg0] == null) {
			this.aClass2_Sub11_1.anInt10066 = arg0 * 72 + 6;
			@Pc(47) int local47 = this.aClass2_Sub11_1.method8381();
			@Pc(52) int local52 = this.aClass2_Sub11_1.method8381();
			@Pc(55) byte[] local55 = new byte[64];
			this.aClass2_Sub11_1.method8385(0, 64, local55);
			@Pc(82) Class37_Sub1 local82 = new Class37_Sub1(arg0, arg1, arg2, this.aClass329_2, this.aClass5_2, local47, local55, local52, true);
			this.aClass37_Sub1Array2[arg0] = local82;
			return local82;
		} else {
			return this.aClass37_Sub1Array2[arg0];
		}
	}
}
