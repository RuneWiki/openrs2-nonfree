import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class317 {

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Lclient!fca;")
	private Class3_Sub17 aClass3_Sub17_8;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "[Lclient!du;")
	private Class89_Sub1[] aClass89_Sub1Array1;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Lclient!ma;")
	private final Class233 aClass233_7;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "Lclient!us;")
	private final Class366 aClass366_2;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger3;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger4;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!bj;")
	private Class3_Sub6_Sub2_Sub1 aClass3_Sub6_Sub2_Sub1_1;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!us;Lclient!ma;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class317(@OriginalArg(0) Class366 arg0, @OriginalArg(1) Class233 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass233_7 = arg1;
		this.aClass366_2 = arg0;
		this.aBigInteger3 = arg3;
		this.aBigInteger4 = arg2;
		if (!this.aClass366_2.method8105()) {
			this.aClass3_Sub6_Sub2_Sub1_1 = this.aClass366_2.method8098(true, 255, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!rt;ZLclient!rt;)Lclient!du;")
	public Class89_Sub1 method7436(@OriginalArg(0) int arg0, @OriginalArg(1) Class313 arg1, @OriginalArg(3) Class313 arg2) {
		return this.method7441(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	public void method7439() {
		if (this.aClass89_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass89_Sub1Array1.length; local11++) {
			if (this.aClass89_Sub1Array1[local11] != null) {
				this.aClass89_Sub1Array1[local11].method2160();
			}
		}
		for (@Pc(40) int local40 = 0; local40 < this.aClass89_Sub1Array1.length; local40++) {
			if (this.aClass89_Sub1Array1[local40] != null) {
				this.aClass89_Sub1Array1[local40].method2161();
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Z")
	public boolean method7440() {
		if (this.aClass3_Sub17_8 != null) {
			return true;
		}
		if (this.aClass3_Sub6_Sub2_Sub1_1 == null) {
			if (this.aClass366_2.method8105()) {
				return false;
			}
			this.aClass3_Sub6_Sub2_Sub1_1 = this.aClass366_2.method8098(true, 255, 255, (byte) 0);
		}
		if (this.aClass3_Sub6_Sub2_Sub1_1.aBoolean677) {
			return false;
		}
		@Pc(46) Class3_Sub17 local46 = new Class3_Sub17(this.aClass3_Sub6_Sub2_Sub1_1.method7723());
		local46.lb = 5;
		@Pc(53) int local53 = local46.method4888();
		local46.lb += local53 * 72;
		@Pc(70) byte[] local70 = new byte[local46.aByteArray59.length - local46.lb];
		local46.method4832(local70, 0, local70.length);
		@Pc(100) byte[] local100;
		if (this.aBigInteger4 == null || this.aBigInteger3 == null) {
			local100 = local70;
		} else {
			@Pc(90) BigInteger local90 = new BigInteger(local70);
			@Pc(97) BigInteger local97 = local90.modPow(this.aBigInteger4, this.aBigInteger3);
			local100 = local97.toByteArray();
		}
		if (local100.length != 65) {
			throw new RuntimeException();
		}
		@Pc(126) byte[] local126 = Static62.method1526(local46.lb - local70.length - 5, local46.aByteArray59, 5);
		for (@Pc(128) int local128 = 0; local128 < 64; local128++) {
			if (local100[local128 + 1] != local126[local128]) {
				throw new RuntimeException();
			}
		}
		this.aClass3_Sub17_8 = local46;
		this.aClass89_Sub1Array1 = new Class89_Sub1[local53];
		return true;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!rt;ZBLclient!rt;)Lclient!du;")
	private Class89_Sub1 method7441(@OriginalArg(0) int arg0, @OriginalArg(1) Class313 arg1, @OriginalArg(4) Class313 arg2) {
		if (this.aClass3_Sub17_8 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || this.aClass89_Sub1Array1.length <= arg0) {
			throw new RuntimeException();
		} else if (this.aClass89_Sub1Array1[arg0] == null) {
			this.aClass3_Sub17_8.lb = arg0 * 72 + 6;
			@Pc(48) int local48 = this.aClass3_Sub17_8.method4868();
			@Pc(55) int local55 = this.aClass3_Sub17_8.method4868();
			@Pc(58) byte[] local58 = new byte[64];
			this.aClass3_Sub17_8.method4832(local58, 0, 64);
			@Pc(82) Class89_Sub1 local82 = new Class89_Sub1(arg0, arg2, arg1, this.aClass366_2, this.aClass233_7, local48, local58, local55, true);
			this.aClass89_Sub1Array1[arg0] = local82;
			return local82;
		} else {
			return this.aClass89_Sub1Array1[arg0];
		}
	}
}
