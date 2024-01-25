import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class108_Sub2 extends Class108 {

	@OriginalMember(owner = "client!gea", name = "t", descriptor = "Z")
	private boolean aBoolean267 = false;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Lclient!rv;)V")
	public Class108_Sub2(@OriginalArg(0) Class126_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(III)V")
	@Override
	public void method8700(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(Z)V")
	@Override
	public void method8708() {
		if (this.aBoolean267) {
			super.aClass126_Sub2_23.method5560(1);
			super.aClass126_Sub2_23.method5519(Static372.aClass199_3);
			super.aClass126_Sub2_23.method5475(Static101.aClass10_2, Static101.aClass10_2);
			super.aClass126_Sub2_23.method5466(2, Static645.aClass294_5);
			super.aClass126_Sub2_23.method5471(Static256.aClass294_4, 0);
			super.aClass126_Sub2_23.method5445();
			super.aClass126_Sub2_23.method5449((Interface27) null);
			super.aClass126_Sub2_23.method5560(0);
			this.aBoolean267 = false;
		} else {
			super.aClass126_Sub2_23.method5471(Static256.aClass294_4, 0);
		}
		super.aClass126_Sub2_23.method5475(Static101.aClass10_2, Static101.aClass10_2);
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8699() {
		return true;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!wc;IB)V")
	@Override
	public void method8709(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) int arg1) {
		super.aClass126_Sub2_23.method5449(arg0);
		super.aClass126_Sub2_23.method5513(arg1);
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8702(@OriginalArg(0) boolean arg0) {
		super.aClass126_Sub2_23.method5475(Static247.aClass10_4, Static101.aClass10_2);
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8710(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface18 local8 = super.aClass126_Sub2_23.method5494();
		if (local8 == null || !arg0) {
			super.aClass126_Sub2_23.method5471(Static18.aClass294_1, 0);
			return;
		}
		super.aClass126_Sub2_23.method5560(1);
		super.aClass126_Sub2_23.method5449(local8);
		super.aClass126_Sub2_23.method5519(Static559.aClass199_5);
		super.aClass126_Sub2_23.method5560(1);
		super.aClass126_Sub2_23.method5475(Static247.aClass10_4, Static646.aClass10_5);
		super.aClass126_Sub2_23.method5537(2, Static131.aClass294_2, false, true);
		super.aClass126_Sub2_23.method5471(Static18.aClass294_1, 0);
		@Pc(69) Class117_Sub2 local69 = super.aClass126_Sub2_23.method5542();
		local69.method3866(super.aClass126_Sub2_23.method5478());
		super.aClass126_Sub2_23.method5504(Static530.aClass52_5);
		super.aClass126_Sub2_23.method5560(0);
		this.aBoolean267 = true;
	}
}
