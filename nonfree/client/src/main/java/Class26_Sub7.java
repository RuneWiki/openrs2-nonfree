import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class26_Sub7 extends Class26 {

	@OriginalMember(owner = "client!lw", name = "q", descriptor = "Z")
	private boolean aBoolean501 = false;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!lb;)V")
	public Class26_Sub7(@OriginalArg(0) Class145_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(Z)V")
	@Override
	public void method8009() {
		if (this.aBoolean501) {
			super.aClass145_Sub1_21.method9745(1);
			super.aClass145_Sub1_21.method9736(Static153.aClass175_4);
			super.aClass145_Sub1_21.method9725(Static105.aClass293_3, Static105.aClass293_3);
			super.aClass145_Sub1_21.method9813(Static45.aClass352_1, 2);
			super.aClass145_Sub1_21.method9795(0, Static231.aClass352_5);
			super.aClass145_Sub1_21.method9837();
			super.aClass145_Sub1_21.method9754((Interface9) null);
			super.aClass145_Sub1_21.method9745(0);
			this.aBoolean501 = false;
		} else {
			super.aClass145_Sub1_21.method9795(0, Static231.aClass352_5);
		}
		super.aClass145_Sub1_21.method9725(Static105.aClass293_3, Static105.aClass293_3);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(III)V")
	@Override
	public void method8007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!iba;BI)V")
	@Override
	public void method8004(@OriginalArg(0) Interface9 arg0, @OriginalArg(2) int arg1) {
		super.aClass145_Sub1_21.method9754(arg0);
		super.aClass145_Sub1_21.method9797(arg1);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7998(@OriginalArg(0) boolean arg0) {
		super.aClass145_Sub1_21.method9725(Static105.aClass293_3, Static162.aClass293_4);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8006(@OriginalArg(1) boolean arg0) {
		@Pc(18) Interface18 local18 = super.aClass145_Sub1_21.method9785();
		if (local18 == null || !arg0) {
			super.aClass145_Sub1_21.method9795(0, Static150.aClass352_4);
			return;
		}
		super.aClass145_Sub1_21.method9745(1);
		super.aClass145_Sub1_21.method9754(local18);
		super.aClass145_Sub1_21.method9736(Static540.aClass175_5);
		super.aClass145_Sub1_21.method9745(1);
		super.aClass145_Sub1_21.method9725(Static62.aClass293_1, Static162.aClass293_4);
		super.aClass145_Sub1_21.method9829(2, false, Static240.aClass352_6, true);
		super.aClass145_Sub1_21.method9795(0, Static150.aClass352_4);
		@Pc(73) Class86_Sub2 local73 = super.aClass145_Sub1_21.method9821();
		local73.method2726(super.aClass145_Sub1_21.method9759());
		super.aClass145_Sub1_21.method9750(Static576.aClass146_9);
		super.aClass145_Sub1_21.method9745(0);
		this.aBoolean501 = true;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8001() {
		return true;
	}
}
