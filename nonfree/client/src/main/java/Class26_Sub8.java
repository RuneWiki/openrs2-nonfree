import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class26_Sub8 extends Class26 {

	@OriginalMember(owner = "client!of", name = "p", descriptor = "F")
	private float aFloat124 = 0.0F;

	@OriginalMember(owner = "client!of", name = "r", descriptor = "Lclient!oc;")
	private final Class270 aClass270_7;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!lb;Lclient!oc;)V")
	public Class26_Sub8(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) Class270 arg1) {
		super(arg0);
		this.aClass270_7 = arg1;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8006(@OriginalArg(1) boolean arg0) {
		super.aClass145_Sub1_21.method9745(1);
		super.aClass145_Sub1_21.method9725(Static679.aClass293_5, Static162.aClass293_4);
		super.aClass145_Sub1_21.method9829(0, false, Static231.aClass352_5, true);
		super.aClass145_Sub1_21.method9795(0, Static240.aClass352_6);
		super.aClass145_Sub1_21.method9804(0);
		super.aClass145_Sub1_21.method9745(0);
		super.aClass145_Sub1_21.method9769(-16777216);
		super.aClass145_Sub1_21.method9795(0, Static45.aClass352_1);
		this.method8008();
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(Z)V")
	@Override
	public void method8009() {
		super.aClass145_Sub1_21.method9745(1);
		super.aClass145_Sub1_21.method9725(Static105.aClass293_3, Static105.aClass293_3);
		super.aClass145_Sub1_21.method9813(Static231.aClass352_5, 0);
		super.aClass145_Sub1_21.method9795(0, Static231.aClass352_5);
		super.aClass145_Sub1_21.method9804(1);
		super.aClass145_Sub1_21.method9754((Interface9) null);
		super.aClass145_Sub1_21.method9745(0);
		super.aClass145_Sub1_21.method9795(0, Static231.aClass352_5);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8001() {
		return this.aClass270_7.method6535();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!iba;BI)V")
	@Override
	public void method8004(@OriginalArg(0) Interface9 arg0, @OriginalArg(2) int arg1) {
		super.aClass145_Sub1_21.method9754(arg0);
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(Z)V")
	@Override
	public void method8008() {
		if (super.aClass145_Sub1_21.method9812() != 0) {
			return;
		}
		@Pc(12) Class86_Sub2 local12 = super.aClass145_Sub1_21.method9756();
		super.aClass145_Sub1_21.method9745(1);
		@Pc(22) Class86_Sub2 local22 = super.aClass145_Sub1_21.method9821();
		local22.method7032(local12);
		local22.method2717(1.0F, 0.125F, 0.125F);
		local22.method2720(this.aFloat124, 0.0F, 0.0F);
		super.aClass145_Sub1_21.method9750(Static576.aClass146_9);
		super.aClass145_Sub1_21.method9745(0);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V")
	@Override
	public void method8007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aClass145_Sub1_21.method9745(1);
		if ((arg1 & 0x80) != 0) {
			super.aClass145_Sub1_21.method9754((Interface9) null);
		} else if ((arg0 & 0x1) == 1) {
			if (this.aClass270_7.aBoolean614) {
				this.aFloat124 = (float) (super.aClass145_Sub1_21.anInt11263 % 4000) / 4000.0F;
				super.aClass145_Sub1_21.method9754(this.aClass270_7.anInterface7_1);
			} else {
				@Pc(89) int local89 = super.aClass145_Sub1_21.anInt11263 % 4000 * 16 / 4000;
				super.aClass145_Sub1_21.method9754(this.aClass270_7.anInterface4Array2[local89]);
			}
		} else if (this.aClass270_7.aBoolean614) {
			super.aClass145_Sub1_21.method9754(this.aClass270_7.anInterface7_1);
		} else {
			super.aClass145_Sub1_21.method9754(this.aClass270_7.anInterface4Array2[0]);
		}
		super.aClass145_Sub1_21.method9745(0);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7998(@OriginalArg(0) boolean arg0) {
		super.aClass145_Sub1_21.method9725(Static105.aClass293_3, Static162.aClass293_4);
	}
}
