import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class15_Sub1 extends Class15 implements Interface1 {

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
	private int anInt717 = 50;

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "Lclient!hc;")
	private Class51 aClass51_8;

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "Lclient!hc;")
	private Class51 aClass51_7;

	@OriginalMember(owner = "client!bf", name = "N", descriptor = "Lclient!ic;")
	private Class58 aClass58_5;

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "Lclient!ic;")
	private Class58 aClass58_4;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!hc;Lclient!hc;Lclient!hc;IZ)V")
	public Class15_Sub1(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg1, arg0, arg2);
		this.aBoolean38 = arg4;
		this.anInt717 = arg3;
		this.aClass51_8 = arg0;
		this.aClass51_7 = arg2;
		this.aClass58_5 = new Class58(this.anInt717);
		this.aClass58_4 = null;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(II)V")
	public void method395(@OriginalArg(1) int arg0) {
		for (@Pc(7) Class1_Sub2_Sub6 local7 = (Class1_Sub2_Sub6) this.aClass58_5.method2087(); local7 != null; local7 = (Class1_Sub2_Sub6) this.aClass58_5.method2092()) {
			if (local7.aBoolean118) {
				local7.method1441(arg0);
				local7.aBoolean118 = false;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)Lclient!bl;")
	@Override
	protected Class1_Sub2_Sub3 method379(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub2_Sub6 local4 = this.method397(arg0);
		return local4 == null ? null : local4.aClass1_Sub2_Sub3_1;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method393(@OriginalArg(0) int arg0) {
		return this.aBoolean38 || this.method376(arg0).aBoolean211;
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(II)Lclient!fj;")
	private Class1_Sub2_Sub6 method397(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub2_Sub6 local13 = (Class1_Sub2_Sub6) this.aClass58_5.method2093((long) arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(24) byte[] local24 = this.aClass51_8.method1874(arg0, 0);
		if (local24 == null) {
			return null;
		} else {
			local13 = new Class1_Sub2_Sub6(new Class1_Sub13(local24));
			this.aClass58_5.method2089((long) arg0, local13);
			return local13;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZIFII)Lclient!q;")
	@Override
	public Class1_Sub2_Sub4_Sub1 method390(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(13) Class1_Sub2_Sub6 local13 = this.method397(arg1);
		if (local13 != null && local13.method1443(this, this.aClass51_7)) {
			return arg0 ? local13.aClass1_Sub2_Sub3_1.method502(arg3, this.aClass51_7, arg3, this, (double) arg2) : local13.aClass1_Sub2_Sub3_1.method504(arg3, this.aClass51_7, this, (double) arg2, arg3);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method389(@OriginalArg(0) int arg0) {
		return this.method376(arg0).aBoolean210;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I")
	@Override
	public int method391(@OriginalArg(1) int arg0) {
		return this.method376(arg0).aShort19 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIF)[I")
	@Override
	public int[] method394(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1) {
		@Pc(9) Class1_Sub2_Sub6 local9 = this.method397(arg0);
		if (local9 == null) {
			return null;
		} else {
			local9.aBoolean118 = true;
			return local9.method1442(this, this.aClass51_7, arg1, this.aBoolean38 || this.method376(arg0).aBoolean211);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
	public void method399() {
		this.aClass58_5.method2090();
		if (this.aClass58_4 != null) {
			this.aClass58_4.method2090();
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IB)Z")
	@Override
	public boolean method392(@OriginalArg(0) int arg0) {
		return !this.method376(arg0).aBoolean214;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IZ)V")
	public void method401(@OriginalArg(1) boolean arg0) {
		this.aBoolean38 = arg0;
		this.method399();
	}
}
