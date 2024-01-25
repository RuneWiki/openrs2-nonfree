import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class7_Sub4 extends Class7 {

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "Z")
	private boolean aBoolean365 = false;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!pga;)V")
	public Class7_Sub4(@OriginalArg(0) Class95_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILclient!lo;)V")
	@Override
	public void method8126(@OriginalArg(0) int arg0, @OriginalArg(2) Interface17 arg1) {
		super.aClass95_Sub3_23.method7112(arg1);
		super.aClass95_Sub3_23.method7026(arg0);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8125(@OriginalArg(1) boolean arg0) {
		super.aClass95_Sub3_23.method7023(Static225.aClass136_3, Static483.aClass136_6);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8135() {
		return true;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
	@Override
	public void method8127() {
		if (this.aBoolean365) {
			super.aClass95_Sub3_23.method7145(1);
			super.aClass95_Sub3_23.method7046(Static160.aClass266_2);
			super.aClass95_Sub3_23.method7023(Static483.aClass136_6, Static483.aClass136_6);
			super.aClass95_Sub3_23.method7139(2, Static185.aClass291_3);
			super.aClass95_Sub3_23.method7095(0, Static634.aClass291_4);
			super.aClass95_Sub3_23.method7105();
			super.aClass95_Sub3_23.method7112(null);
			super.aClass95_Sub3_23.method7145(0);
			this.aBoolean365 = false;
		} else {
			super.aClass95_Sub3_23.method7095(0, Static634.aClass291_4);
		}
		super.aClass95_Sub3_23.method7023(Static483.aClass136_6, Static483.aClass136_6);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8120(@OriginalArg(1) boolean arg0) {
		@Pc(16) Interface23 local16 = super.aClass95_Sub3_23.method7055();
		if (local16 == null || !arg0) {
			super.aClass95_Sub3_23.method7095(0, Static113.aClass291_2);
			return;
		}
		super.aClass95_Sub3_23.method7145(1);
		super.aClass95_Sub3_23.method7112(local16);
		super.aClass95_Sub3_23.method7046(Static566.aClass266_4);
		super.aClass95_Sub3_23.method7145(1);
		super.aClass95_Sub3_23.method7023(Static225.aClass136_3, Static504.aClass136_8);
		super.aClass95_Sub3_23.method7028(2, true, Static10.aClass291_1, false);
		super.aClass95_Sub3_23.method7095(0, Static113.aClass291_2);
		@Pc(65) Class177_Sub1 local65 = super.aClass95_Sub3_23.method7017();
		local65.method3827(super.aClass95_Sub3_23.method7101());
		super.aClass95_Sub3_23.method7099(Static55.aClass85_2);
		super.aClass95_Sub3_23.method7145(0);
		this.aBoolean365 = true;
	}
}
