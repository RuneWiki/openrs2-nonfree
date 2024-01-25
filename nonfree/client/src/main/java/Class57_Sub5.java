import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class57_Sub5 extends Class57 {

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "Z")
	private boolean aBoolean450 = false;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!uv;)V")
	public Class57_Sub5(@OriginalArg(0) Class5_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8709() {
		return true;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V")
	@Override
	public void method8710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILclient!bl;)V")
	@Override
	public void method8706(@OriginalArg(1) int arg0, @OriginalArg(2) Interface4 arg1) {
		super.aClass5_Sub2_23.method4008(arg1);
		super.aClass5_Sub2_23.method4018(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8707(@OriginalArg(1) boolean arg0) {
		super.aClass5_Sub2_23.method4022(Static503.aClass144_4, Static438.aClass144_3);
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V")
	@Override
	public void method8703() {
		if (this.aBoolean450) {
			super.aClass5_Sub2_23.method3954(1);
			super.aClass5_Sub2_23.method3967(Static190.aClass52_67);
			super.aClass5_Sub2_23.method4022(Static438.aClass144_3, Static438.aClass144_3);
			super.aClass5_Sub2_23.method4054(2, Static347.aClass80_2);
			super.aClass5_Sub2_23.method3956(Static522.aClass80_4, 0);
			super.aClass5_Sub2_23.method3988();
			super.aClass5_Sub2_23.method4008((Interface4) null);
			super.aClass5_Sub2_23.method3954(0);
			this.aBoolean450 = false;
		} else {
			super.aClass5_Sub2_23.method3956(Static522.aClass80_4, 0);
		}
		super.aClass5_Sub2_23.method4022(Static438.aClass144_3, Static438.aClass144_3);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8712(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface24 local8 = super.aClass5_Sub2_23.method3942();
		if (local8 == null || !arg0) {
			super.aClass5_Sub2_23.method3956(Static512.aClass80_3, 0);
			return;
		}
		super.aClass5_Sub2_23.method3954(1);
		super.aClass5_Sub2_23.method4008(local8);
		super.aClass5_Sub2_23.method3967(Static372.aClass52_103);
		super.aClass5_Sub2_23.method3954(1);
		super.aClass5_Sub2_23.method4022(Static503.aClass144_4, Static558.aClass144_5);
		super.aClass5_Sub2_23.method4029(2, true, Static115.aClass80_1, false);
		super.aClass5_Sub2_23.method3956(Static512.aClass80_3, 0);
		@Pc(59) Class115_Sub3 local59 = super.aClass5_Sub2_23.method3960();
		local59.method6321(super.aClass5_Sub2_23.method4026());
		super.aClass5_Sub2_23.method4011(Static281.aClass272_4);
		super.aClass5_Sub2_23.method3954(0);
		this.aBoolean450 = true;
	}
}
