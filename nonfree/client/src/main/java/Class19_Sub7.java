import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class19_Sub7 extends Class19 {

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "F")
	private float aFloat145 = 0.0F;

	@OriginalMember(owner = "client!nm", name = "z", descriptor = "Lclient!ep;")
	private final Class96 aClass96_4;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!rl;Lclient!ep;)V")
	public Class19_Sub7(@OriginalArg(0) Class82_Sub3 arg0, @OriginalArg(1) Class96 arg1) {
		super(arg0);
		this.aClass96_4 = arg1;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(III)V")
	@Override
	public void method8281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aClass82_Sub3_23.method4946(1);
		if ((arg1 & 0x80) != 0) {
			super.aClass82_Sub3_23.method4972((Interface10) null);
		} else if ((arg0 & 0x1) == 1) {
			if (this.aClass96_4.aBoolean215) {
				this.aFloat145 = (float) (super.aClass82_Sub3_23.anInt5838 % 4000) / 4000.0F;
				super.aClass82_Sub3_23.method4972(this.aClass96_4.anInterface20_1);
			} else {
				@Pc(61) int local61 = super.aClass82_Sub3_23.anInt5838 % 4000 * 16 / 4000;
				super.aClass82_Sub3_23.method4972(this.aClass96_4.anInterface6Array2[local61]);
			}
		} else if (this.aClass96_4.aBoolean215) {
			super.aClass82_Sub3_23.method4972(this.aClass96_4.anInterface20_1);
		} else {
			super.aClass82_Sub3_23.method4972(this.aClass96_4.anInterface6Array2[0]);
		}
		super.aClass82_Sub3_23.method4946(0);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IILclient!hba;)V")
	@Override
	public void method8273(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
		super.aClass82_Sub3_23.method4972(arg1);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
	@Override
	public void method8288() {
		if (super.aClass82_Sub3_23.method4999() != 0) {
			return;
		}
		@Pc(16) Class31_Sub2 local16 = super.aClass82_Sub3_23.method4981();
		super.aClass82_Sub3_23.method4946(1);
		@Pc(26) Class31_Sub2 local26 = super.aClass82_Sub3_23.method4931();
		local26.method7934(local16);
		local26.method7657(1.0F, 0.125F, 0.125F);
		local26.method7661(this.aFloat145, 0.0F, 0.0F);
		super.aClass82_Sub3_23.method4974(Static647.aClass193_9);
		super.aClass82_Sub3_23.method4946(0);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)V")
	@Override
	public void method8277() {
		super.aClass82_Sub3_23.method4946(1);
		super.aClass82_Sub3_23.method4908(Static131.aClass88_1, Static131.aClass88_1);
		super.aClass82_Sub3_23.method4928(0, Static527.aClass165_4);
		super.aClass82_Sub3_23.method5028(Static527.aClass165_4, 0);
		super.aClass82_Sub3_23.method5038(1);
		super.aClass82_Sub3_23.method4972((Interface10) null);
		super.aClass82_Sub3_23.method4946(0);
		super.aClass82_Sub3_23.method5028(Static527.aClass165_4, 0);
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8282() {
		return this.aClass96_4.method2362();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8286(@OriginalArg(0) boolean arg0) {
		super.aClass82_Sub3_23.method4946(1);
		super.aClass82_Sub3_23.method4908(Static443.aClass88_3, Static418.aClass88_2);
		super.aClass82_Sub3_23.method5034(0, true, Static527.aClass165_4, false);
		super.aClass82_Sub3_23.method5028(Static430.aClass165_3, 0);
		super.aClass82_Sub3_23.method5038(0);
		super.aClass82_Sub3_23.method4946(0);
		super.aClass82_Sub3_23.method4933(-16777216);
		super.aClass82_Sub3_23.method5028(Static302.aClass165_1, 0);
		this.method8288();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8274(@OriginalArg(1) boolean arg0) {
		super.aClass82_Sub3_23.method4908(Static443.aClass88_3, Static131.aClass88_1);
	}
}
