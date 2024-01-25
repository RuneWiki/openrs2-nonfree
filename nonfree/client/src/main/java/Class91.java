import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class91 {

	@OriginalMember(owner = "client!er", name = "b", descriptor = "Lclient!co;")
	private Class5_Sub3 aClass5_Sub3_8;

	@OriginalMember(owner = "client!er", name = "i", descriptor = "[Lclient!ef;")
	private Class79_Sub1[] aClass79_Sub1Array1;

	@OriginalMember(owner = "client!er", name = "d", descriptor = "Lclient!cq;")
	private final Class55 aClass55_2;

	@OriginalMember(owner = "client!er", name = "f", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger3;

	@OriginalMember(owner = "client!er", name = "c", descriptor = "Lclient!pt;")
	private final Class237 aClass237_2;

	@OriginalMember(owner = "client!er", name = "m", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger4;

	@OriginalMember(owner = "client!er", name = "h", descriptor = "Lclient!ii;")
	private Class5_Sub2_Sub2_Sub2 aClass5_Sub2_Sub2_Sub2_2;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!cq;Lclient!pt;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class91(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aClass55_2 = arg0;
		this.aBigInteger3 = arg2;
		this.aClass237_2 = arg1;
		this.aBigInteger4 = arg3;
		if (!this.aClass55_2.method1335()) {
			this.aClass5_Sub2_Sub2_Sub2_2 = this.aClass55_2.method1345((byte) 0, true, 255, 255);
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(B)V")
	public void method2316() {
		if (this.aClass79_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass79_Sub1Array1.length; local11++) {
			if (this.aClass79_Sub1Array1[local11] != null) {
				this.aClass79_Sub1Array1[local11].method2227();
			}
		}
		for (@Pc(44) int local44 = 0; local44 < this.aClass79_Sub1Array1.length; local44++) {
			if (this.aClass79_Sub1Array1[local44] != null) {
				this.aClass79_Sub1Array1[local44].method2222();
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!gg;Lclient!gg;IZ)Lclient!ef;")
	private Class79_Sub1 method2317(@OriginalArg(1) Class112 arg0, @OriginalArg(2) Class112 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass5_Sub3_8 == null) {
			throw new RuntimeException();
		} else if (arg2 < 0 || arg2 >= this.aClass79_Sub1Array1.length) {
			throw new RuntimeException();
		} else if (this.aClass79_Sub1Array1[arg2] == null) {
			this.aClass5_Sub3_8.anInt4960 = arg2 * 72 + 6;
			@Pc(44) int local44 = this.aClass5_Sub3_8.method4230();
			@Pc(49) int local49 = this.aClass5_Sub3_8.method4230();
			@Pc(52) byte[] local52 = new byte[64];
			this.aClass5_Sub3_8.method4177(local52, 64);
			@Pc(74) Class79_Sub1 local74 = new Class79_Sub1(arg2, arg0, arg1, this.aClass55_2, this.aClass237_2, local44, local52, local49, true);
			this.aClass79_Sub1Array1[arg2] = local74;
			return local74;
		} else {
			return this.aClass79_Sub1Array1[arg2];
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IILclient!gg;Lclient!gg;)Lclient!ef;")
	public Class79_Sub1 method2318(@OriginalArg(1) int arg0, @OriginalArg(2) Class112 arg1, @OriginalArg(3) Class112 arg2) {
		return this.method2317(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)Z")
	public boolean method2319() {
		if (this.aClass5_Sub3_8 != null) {
			return true;
		}
		if (this.aClass5_Sub2_Sub2_Sub2_2 == null) {
			if (this.aClass55_2.method1335()) {
				return false;
			}
			this.aClass5_Sub2_Sub2_Sub2_2 = this.aClass55_2.method1345((byte) 0, true, 255, 255);
		}
		if (this.aClass5_Sub2_Sub2_Sub2_2.aBoolean234) {
			return false;
		}
		@Pc(44) Class5_Sub3 local44 = new Class5_Sub3(this.aClass5_Sub2_Sub2_Sub2_2.method3373());
		local44.anInt4960 = 5;
		@Pc(53) int local53 = local44.method4220();
		local44.anInt4960 += local53 * 72;
		@Pc(69) byte[] local69 = new byte[local44.aByteArray66.length - local44.anInt4960];
		local44.method4177(local69, local69.length);
		@Pc(97) byte[] local97;
		if (this.aBigInteger3 == null || this.aBigInteger4 == null) {
			local97 = local69;
		} else {
			@Pc(87) BigInteger local87 = new BigInteger(local69);
			@Pc(94) BigInteger local94 = local87.modPow(this.aBigInteger3, this.aBigInteger4);
			local97 = local94.toByteArray();
		}
		if (local97.length != 65) {
			throw new RuntimeException();
		}
		@Pc(128) byte[] local128 = Static263.method4382(local44.anInt4960 - local69.length - 5, local44.aByteArray66, 5);
		for (@Pc(130) int local130 = 0; local130 < 64; local130++) {
			if (local97[local130 + 1] != local128[local130]) {
				throw new RuntimeException();
			}
		}
		this.aClass5_Sub3_8 = local44;
		this.aClass79_Sub1Array1 = new Class79_Sub1[local53];
		return true;
	}
}
