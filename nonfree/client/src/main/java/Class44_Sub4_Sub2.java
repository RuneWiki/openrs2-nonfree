import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class44_Sub4_Sub2 extends Class44_Sub4 {

	@OriginalMember(owner = "client!lg", name = "T", descriptor = "Lclient!bl;")
	private Class20_Sub2 aClass20_Sub2_2;

	@OriginalMember(owner = "client!lg", name = "U", descriptor = "I")
	private int anInt3268 = 0;

	@OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
	private final int anInt3263 = -1;

	@OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
	private int anInt3267 = -32768;

	@OriginalMember(owner = "client!lg", name = "bb", descriptor = "Z")
	public boolean aBoolean234 = false;

	@OriginalMember(owner = "client!lg", name = "ab", descriptor = "I")
	private int anInt3273 = 0;

	@OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
	private final int anInt3260;

	@OriginalMember(owner = "client!lg", name = "cb", descriptor = "I")
	public final int anInt3274;

	@OriginalMember(owner = "client!lg", name = "db", descriptor = "Lclient!bq;")
	private Class24 aClass24_2;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class44_Sub4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt3260 = arg0;
		this.anInt3274 = arg2 + arg1;
		@Pc(41) int local41 = Static62.method999(this.anInt3260).anInt4753;
		if (local41 == -1) {
			this.aBoolean234 = true;
		} else {
			this.aBoolean234 = false;
			this.aClass24_2 = Static209.method3737(local41);
		}
		if (arg2 == this.anInt3274) {
			Static203.method3667(this.anInt3268, super.anInt6339, this.aClass24_2, super.anInt6340, false);
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5783() {
		return false;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!rc;Lclient!ja;B)V")
	private void method3387(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class81 arg1) {
		@Pc(6) Class157[] local6 = arg0.method4662();
		@Pc(9) Class22[] local9 = arg0.method4650();
		if ((this.aClass20_Sub2_2 == null || this.aClass20_Sub2_2.aBoolean35) && (local6 != null || local9 != null)) {
			this.aClass20_Sub2_2 = new Class20_Sub2(Static76.anInt2853);
		}
		if (this.aClass20_Sub2_2 != null) {
			this.aClass20_Sub2_2.method446(arg1, (long) Static76.anInt2853, local6, local9);
			this.aClass20_Sub2_2.method451(super.aByte90, super.aShort90, super.aShort87, super.aShort89, super.aShort88);
		}
	}

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "(B)V")
	public void method3389() {
		if (this.aClass20_Sub2_2 != null) {
			this.aClass20_Sub2_2.method453();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!ja;II)Z")
	@Override
	public boolean method5778(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)V")
	public void method3390(@OriginalArg(1) int arg0) {
		if (this.aBoolean234) {
			return;
		}
		this.anInt3273 += arg0;
		while (this.anInt3273 > this.aClass24_2.anIntArray66[this.anInt3268]) {
			this.anInt3273 -= this.aClass24_2.anIntArray66[this.anInt3268];
			this.anInt3268++;
			if (this.anInt3268 >= this.aClass24_2.anIntArray64.length) {
				this.aBoolean234 = true;
				break;
			}
		}
		if (!this.aBoolean234) {
			Static203.method3667(this.anInt3268, super.anInt6339, this.aClass24_2, super.anInt6340, false);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBZIILclient!nf;Lclient!ja;)V")
	@Override
	public void method5780(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class44 arg4, @OriginalArg(6) Class81 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLclient!ja;)Lclient!kh;")
	@Override
	public Class20_Sub6 method5779(@OriginalArg(1) Class81 arg0) {
		@Pc(9) Class78 local9 = this.method3393(arg0, 1024);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class72 local16 = arg0.method2990();
		local16.method4067(super.anInt6340, super.anInt6335, super.anInt6339);
		if (this.aClass20_Sub2_2 == null) {
			local9.method4649(local16, null, 0);
		} else {
			@Pc(43) Class90 local43 = this.aClass20_Sub2_2.method449();
			arg0.method2979(local9, local43, local16, null);
		}
		this.anInt3267 = local9.method4639();
		this.method3387(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V")
	@Override
	public void method5777() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "(I)I")
	@Override
	public int method5784() {
		return this.anInt3267;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!ja;)V")
	@Override
	public void method5775(@OriginalArg(1) Class81 arg0) {
		@Pc(17) Class78 local17 = this.method3393(arg0, 0);
		if (local17 != null) {
			this.method3387(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!lg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass20_Sub2_2 != null) {
			this.aClass20_Sub2_2.method453();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!ja;II)Lclient!rc;")
	private Class78 method3393(@OriginalArg(0) Class81 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class166 local8 = Static62.method999(this.anInt3260);
		return this.aBoolean234 ? local8.method4372(arg0, arg1, -1, 0, -1) : local8.method4372(arg0, arg1, this.anInt3263, this.anInt3273, this.anInt3268);
	}
}
