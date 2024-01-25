import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class331 {

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Lclient!tn;")
	private Class3_Sub15 aClass3_Sub15_10;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "[Lclient!gu;")
	private Class120_Sub1[] aClass120_Sub1Array2;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger8;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "Lclient!dm;")
	private final Class65 aClass65_3;

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "Lclient!he;")
	private final Class126 aClass126_4;

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "Ljava/math/BigInteger;")
	private final BigInteger aBigInteger9;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "Lclient!me;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_2;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!dm;Lclient!he;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class331(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) BigInteger arg2, @OriginalArg(3) BigInteger arg3) {
		this.aBigInteger8 = arg2;
		this.aClass65_3 = arg0;
		this.aClass126_4 = arg1;
		this.aBigInteger9 = arg3;
		if (!this.aClass65_3.method2523()) {
			this.aClass3_Sub1_Sub3_Sub1_2 = this.aClass65_3.method2529(255, (byte) 0, true, 255);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!wea;Lclient!wea;II)Lclient!gu;")
	public Class120_Sub1 method7985(@OriginalArg(0) Class370 arg0, @OriginalArg(1) Class370 arg1, @OriginalArg(2) int arg2) {
		return this.method7988(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)Z")
	public boolean method7987() {
		if (this.aClass3_Sub15_10 != null) {
			return true;
		}
		if (this.aClass3_Sub1_Sub3_Sub1_2 == null) {
			if (this.aClass65_3.method2523()) {
				return false;
			}
			this.aClass3_Sub1_Sub3_Sub1_2 = this.aClass65_3.method2529(255, (byte) 0, true, 255);
		}
		if (this.aClass3_Sub1_Sub3_Sub1_2.aBoolean830) {
			return false;
		}
		@Pc(48) Class3_Sub15 local48 = new Class3_Sub15(this.aClass3_Sub1_Sub3_Sub1_2.method8168());
		local48.anInt10282 = 5;
		@Pc(57) int local57 = local48.method8401();
		local48.anInt10282 += local57 * 72;
		@Pc(79) byte[] local79 = new byte[local48.aByteArray106.length - local48.anInt10282];
		local48.method8403(local79.length, 0, local79);
		@Pc(107) byte[] local107;
		if (this.aBigInteger8 == null || this.aBigInteger9 == null) {
			local107 = local79;
		} else {
			@Pc(97) BigInteger local97 = new BigInteger(local79);
			@Pc(104) BigInteger local104 = local97.modPow(this.aBigInteger8, this.aBigInteger9);
			local107 = local104.toByteArray();
		}
		if (local107.length != 65) {
			throw new RuntimeException();
		}
		@Pc(135) byte[] local135 = Static341.method5638(5, local48.anInt10282 - local79.length - 5, local48.aByteArray106);
		for (@Pc(137) int local137 = 0; local137 < 64; local137++) {
			if (local135[local137] != local107[local137 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass120_Sub1Array2 = new Class120_Sub1[local57];
		this.aClass3_Sub15_10 = local48;
		return true;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!wea;Lclient!wea;ZI)Lclient!gu;")
	private Class120_Sub1 method7988(@OriginalArg(1) Class370 arg0, @OriginalArg(2) Class370 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass3_Sub15_10 == null) {
			throw new RuntimeException();
		} else if (arg2 < 0 || this.aClass120_Sub1Array2.length <= arg2) {
			throw new RuntimeException();
		} else if (this.aClass120_Sub1Array2[arg2] == null) {
			this.aClass3_Sub15_10.anInt10282 = arg2 * 72 + 6;
			@Pc(51) int local51 = this.aClass3_Sub15_10.method8402();
			@Pc(56) int local56 = this.aClass3_Sub15_10.method8402();
			@Pc(59) byte[] local59 = new byte[64];
			this.aClass3_Sub15_10.method8403(64, 0, local59);
			@Pc(87) Class120_Sub1 local87 = new Class120_Sub1(arg2, arg0, arg1, this.aClass65_3, this.aClass126_4, local51, local59, local56, true);
			this.aClass120_Sub1Array2[arg2] = local87;
			return local87;
		} else {
			return this.aClass120_Sub1Array2[arg2];
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	public void method7989() {
		if (this.aClass120_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass120_Sub1Array2.length; local11++) {
			if (this.aClass120_Sub1Array2[local11] != null) {
				this.aClass120_Sub1Array2[local11].method3843();
			}
		}
		for (@Pc(32) int local32 = 0; local32 < this.aClass120_Sub1Array2.length; local32++) {
			if (this.aClass120_Sub1Array2[local32] != null) {
				this.aClass120_Sub1Array2[local32].method3837();
			}
		}
	}
}
