import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class139 {

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
	private int anInt4355 = 0;

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
	private int anInt4353 = 0;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
	private int anInt4354 = 0;

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "Lclient!uda;")
	private Class132 aClass132_1 = null;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "Lclient!ap;")
	private final Class9_Sub2 aClass9_Sub2_15;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "Lclient!um;")
	private final Class319 aClass319_1;

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "[Lclient!qk;")
	private final Class104[] aClass104Array1;

	@OriginalMember(owner = "client!hn", name = "p", descriptor = "Lclient!ff;")
	public final Class104_Sub1 aClass104_Sub1_1;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!ap;)V")
	public Class139(@OriginalArg(0) Class9_Sub2 arg0) {
		this.aClass9_Sub2_15 = arg0;
		this.aClass319_1 = new Class319(arg0);
		this.aClass104Array1 = new Class104[10];
		this.aClass104Array1[1] = new Class104_Sub7(arg0);
		this.aClass104Array1[2] = new Class104_Sub5(arg0, this.aClass319_1);
		this.aClass104Array1[4] = new Class104_Sub9(arg0, this.aClass319_1);
		this.aClass104Array1[5] = new Class104_Sub8(arg0, this.aClass319_1);
		this.aClass104Array1[6] = new Class104_Sub4(arg0);
		this.aClass104Array1[7] = new Class104_Sub6(arg0);
		this.aClass104Array1[3] = this.aClass104_Sub1_1 = new Class104_Sub1(arg0);
		this.aClass104Array1[8] = new Class104_Sub2(arg0, this.aClass319_1);
		this.aClass104Array1[9] = new Class104_Sub3(arg0, this.aClass319_1);
		if (!this.aClass104Array1[8].method7865()) {
			this.aClass104Array1[8] = this.aClass104Array1[4];
		}
		if (!this.aClass104Array1[9].method7865()) {
			this.aClass104Array1[9] = this.aClass104Array1[8];
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IBZIIZ)V")
	public void method3795(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(5) boolean local5 = arg4 & this.aClass9_Sub2_15.method5462();
		if (!local5 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg3 = arg2;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg1) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (arg0 != this.anInt4353) {
			if (this.anInt4353 != 0) {
				this.aClass104Array1[Integer.MAX_VALUE & this.anInt4353].method7868();
			}
			if (arg0 != 0) {
				this.aClass104Array1[Integer.MAX_VALUE & arg0].method7867(arg1);
				this.aClass104Array1[Integer.MAX_VALUE & arg0].method7871(arg1);
				this.aClass104Array1[Integer.MAX_VALUE & arg0].method7866(arg2, arg3);
			}
			this.anInt4355 = arg2;
			this.anInt4354 = arg3;
			this.anInt4353 = arg0;
			this.aClass132_1 = null;
		} else if (this.anInt4353 != 0) {
			this.aClass104Array1[Integer.MAX_VALUE & this.anInt4353].method7871(arg1);
			if (this.anInt4355 != arg2 || arg3 != this.anInt4354) {
				this.aClass104Array1[this.anInt4353 & Integer.MAX_VALUE].method7866(arg2, arg3);
				this.anInt4355 = arg2;
				this.anInt4354 = arg3;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILclient!uda;I)Z")
	public boolean method3796(@OriginalArg(1) Class132 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4353 == 0) {
			return false;
		}
		if (arg0 != this.aClass132_1) {
			this.aClass104Array1[Integer.MAX_VALUE & this.anInt4353].method7872(arg1, arg0);
			this.aClass132_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)Z")
	public boolean method3797() {
		return this.aClass104Array1[3].method7865();
	}
}
