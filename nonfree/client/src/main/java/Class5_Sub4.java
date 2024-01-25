import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!jba", name = "v", descriptor = "Z")
	private boolean aBoolean310 = false;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lclient!kw;)V")
	public Class5_Sub4(@OriginalArg(0) Class39_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7081(@OriginalArg(0) boolean arg0) {
		@Pc(8) Interface4 local8 = super.aClass39_Sub2_20.method6210();
		if (local8 == null || !arg0) {
			super.aClass39_Sub2_20.method6085(Static463.aClass111_4, 0);
			return;
		}
		super.aClass39_Sub2_20.method6191(1);
		super.aClass39_Sub2_20.method6179(local8);
		super.aClass39_Sub2_20.method6189(Static421.aClass316_3);
		super.aClass39_Sub2_20.method6191(1);
		super.aClass39_Sub2_20.method6093(Static72.aClass165_1, Static99.aClass165_2);
		super.aClass39_Sub2_20.method6119(Static409.aClass111_3, false, 2, true);
		super.aClass39_Sub2_20.method6085(Static463.aClass111_4, 0);
		@Pc(65) Class181_Sub2 local65 = super.aClass39_Sub2_20.method6133();
		local65.method5400(super.aClass39_Sub2_20.method6212());
		super.aClass39_Sub2_20.method6091(Static237.aClass224_3);
		super.aClass39_Sub2_20.method6191(0);
		this.aBoolean310 = true;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7091(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7085() {
		return true;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7092(@OriginalArg(1) boolean arg0) {
		super.aClass39_Sub2_20.method6093(Static389.aClass165_3, Static99.aClass165_2);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZILclient!mn;)V")
	@Override
	public void method7083(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		super.aClass39_Sub2_20.method6179(arg1);
		super.aClass39_Sub2_20.method6164(arg0);
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(B)V")
	@Override
	public void method7087() {
		if (this.aBoolean310) {
			super.aClass39_Sub2_20.method6191(1);
			super.aClass39_Sub2_20.method6189(Static139.aClass316_1);
			super.aClass39_Sub2_20.method6093(Static389.aClass165_3, Static389.aClass165_3);
			super.aClass39_Sub2_20.method6192(2, Static254.aClass111_2);
			super.aClass39_Sub2_20.method6085(Static132.aClass111_1, 0);
			super.aClass39_Sub2_20.method6111();
			super.aClass39_Sub2_20.method6179(null);
			super.aClass39_Sub2_20.method6191(0);
			this.aBoolean310 = false;
		} else {
			super.aClass39_Sub2_20.method6085(Static132.aClass111_1, 0);
		}
		super.aClass39_Sub2_20.method6093(Static389.aClass165_3, Static389.aClass165_3);
	}
}
