import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class32_Sub9 extends Class32 {

	@OriginalMember(owner = "client!tca", name = "z", descriptor = "Z")
	private boolean aBoolean586 = false;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lclient!rr;)V")
	public Class32_Sub9(@OriginalArg(0) Class31_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7459(@OriginalArg(1) boolean arg0) {
		super.aClass31_Sub1_22.method7136(Static514.aClass266_6, Static486.aClass266_5);
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(III)V")
	@Override
	public void method7458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tca", name = "f", descriptor = "(I)V")
	@Override
	public void method7460() {
		if (this.aBoolean586) {
			super.aClass31_Sub1_22.method7092(1);
			super.aClass31_Sub1_22.method7067(Static595.aClass273_3);
			super.aClass31_Sub1_22.method7136(Static486.aClass266_5, Static486.aClass266_5);
			super.aClass31_Sub1_22.method7155(2, Static438.aClass179_14);
			super.aClass31_Sub1_22.method7185(Static402.aClass179_23, 0);
			super.aClass31_Sub1_22.method7120();
			super.aClass31_Sub1_22.method7129(null);
			super.aClass31_Sub1_22.method7092(0);
			this.aBoolean586 = false;
		} else {
			super.aClass31_Sub1_22.method7185(Static402.aClass179_23, 0);
		}
		super.aClass31_Sub1_22.method7136(Static486.aClass266_5, Static486.aClass266_5);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IZLclient!wq;)V")
	@Override
	public void method7453(@OriginalArg(0) int arg0, @OriginalArg(2) Interface24 arg1) {
		super.aClass31_Sub1_22.method7129(arg1);
		super.aClass31_Sub1_22.method7141(arg0);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7454() {
		return true;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7446(@OriginalArg(0) boolean arg0) {
		@Pc(10) Interface18 local10 = super.aClass31_Sub1_22.method7098();
		if (local10 == null || !arg0) {
			super.aClass31_Sub1_22.method7185(Static138.aClass179_11, 0);
			return;
		}
		super.aClass31_Sub1_22.method7092(1);
		super.aClass31_Sub1_22.method7129(local10);
		super.aClass31_Sub1_22.method7067(Static401.aClass273_2);
		super.aClass31_Sub1_22.method7092(1);
		super.aClass31_Sub1_22.method7136(Static514.aClass266_6, Static336.aClass266_4);
		super.aClass31_Sub1_22.method7083(Static415.aClass179_24, 2, false, true);
		super.aClass31_Sub1_22.method7185(Static138.aClass179_11, 0);
		@Pc(59) Class42_Sub3 local59 = super.aClass31_Sub1_22.method7146();
		local59.method7531(super.aClass31_Sub1_22.method7074());
		super.aClass31_Sub1_22.method7161(Static496.aClass51_17);
		super.aClass31_Sub1_22.method7092(0);
		this.aBoolean586 = true;
	}
}
