import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!qq;)V")
	public Class3_Sub4(@OriginalArg(0) Class12_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7533(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface12 local8 = super.aClass12_Sub2_23.method6208();
		if (local8 == null || !arg0) {
			super.aClass12_Sub2_23.method6234(0, Static328.aClass84_3);
			return;
		}
		super.aClass12_Sub2_23.method6196(1);
		super.aClass12_Sub2_23.method6159(local8);
		super.aClass12_Sub2_23.method6157(Static361.aClass74_3);
		super.aClass12_Sub2_23.method6196(1);
		super.aClass12_Sub2_23.method6241(Static240.aClass108_5, Static6.aClass108_7);
		super.aClass12_Sub2_23.method6280(2, Static266.aClass84_5, false, true);
		super.aClass12_Sub2_23.method6234(0, Static328.aClass84_3);
		@Pc(65) Class209_Sub2 local65 = super.aClass12_Sub2_23.method6270();
		local65.method4913(super.aClass12_Sub2_23.method6180());
		super.aClass12_Sub2_23.method6162(Static566.aClass296_6);
		super.aClass12_Sub2_23.method6196(0);
		this.aBoolean195 = true;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7535(@OriginalArg(0) boolean arg0) {
		super.aClass12_Sub2_23.method6241(Static240.aClass108_5, Static9.aClass108_2);
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7531() {
		return true;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ot;BI)V")
	@Override
	public void method7528(@OriginalArg(0) Interface18 arg0, @OriginalArg(2) int arg1) {
		super.aClass12_Sub2_23.method6159(arg0);
		super.aClass12_Sub2_23.method6249(arg1);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
	@Override
	public void method7529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
	@Override
	public void method7534() {
		if (this.aBoolean195) {
			super.aClass12_Sub2_23.method6196(1);
			super.aClass12_Sub2_23.method6157(Static26.aClass74_1);
			super.aClass12_Sub2_23.method6241(Static9.aClass108_2, Static9.aClass108_2);
			super.aClass12_Sub2_23.method6179(Static135.aClass84_1, 2);
			super.aClass12_Sub2_23.method6234(0, Static587.aClass84_6);
			super.aClass12_Sub2_23.method6237();
			super.aClass12_Sub2_23.method6159(null);
			super.aClass12_Sub2_23.method6196(0);
			this.aBoolean195 = false;
		} else {
			super.aClass12_Sub2_23.method6234(0, Static587.aClass84_6);
		}
		super.aClass12_Sub2_23.method6241(Static9.aClass108_2, Static9.aClass108_2);
	}
}
