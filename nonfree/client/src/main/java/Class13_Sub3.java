import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Class13_Sub3 extends Class13 {

	@OriginalMember(owner = "client!hda", name = "p", descriptor = "Z")
	private boolean aBoolean279 = false;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class13_Sub3(@OriginalArg(0) Class57_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V")
	@Override
	public void method8261() {
		if (this.aBoolean279) {
			super.aClass57_Sub3_21.method7795(1);
			super.aClass57_Sub3_21.method7778(Static497.aClass188_46);
			super.aClass57_Sub3_21.method7733(Static313.aClass34_88, Static313.aClass34_88);
			super.aClass57_Sub3_21.method7866(2, Static291.aClass312_3);
			super.aClass57_Sub3_21.method7781(0, Static57.aClass312_1);
			super.aClass57_Sub3_21.method7850();
			super.aClass57_Sub3_21.method7813((Interface22) null);
			super.aClass57_Sub3_21.method7795(0);
			this.aBoolean279 = false;
		} else {
			super.aClass57_Sub3_21.method7781(0, Static57.aClass312_1);
		}
		super.aClass57_Sub3_21.method7733(Static313.aClass34_88, Static313.aClass34_88);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8262(@OriginalArg(0) boolean arg0) {
		super.aClass57_Sub3_21.method7733(Static362.aClass34_172, Static313.aClass34_88);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8273(@OriginalArg(0) boolean arg0) {
		@Pc(16) Interface24 local16 = super.aClass57_Sub3_21.method7811();
		if (local16 == null || !arg0) {
			super.aClass57_Sub3_21.method7781(0, Static625.aClass312_4);
			return;
		}
		super.aClass57_Sub3_21.method7795(1);
		super.aClass57_Sub3_21.method7813(local16);
		super.aClass57_Sub3_21.method7778(Static307.aClass188_20);
		super.aClass57_Sub3_21.method7795(1);
		super.aClass57_Sub3_21.method7733(Static362.aClass34_172, Static141.aClass34_77);
		super.aClass57_Sub3_21.method7750(false, 2, true, Static79.aClass312_2);
		super.aClass57_Sub3_21.method7781(0, Static625.aClass312_4);
		@Pc(79) Class203_Sub1 local79 = super.aClass57_Sub3_21.method7829();
		local79.method4833(super.aClass57_Sub3_21.method7812());
		super.aClass57_Sub3_21.method7822(Static310.aClass357_4);
		super.aClass57_Sub3_21.method7795(0);
		this.aBoolean279 = true;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8270() {
		return true;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IILclient!rca;)V")
	@Override
	public void method8274(@OriginalArg(0) int arg0, @OriginalArg(2) Interface22 arg1) {
		super.aClass57_Sub3_21.method7813(arg1);
		super.aClass57_Sub3_21.method7764(arg0);
	}
}
