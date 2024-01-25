import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class93_Sub8 extends Class93 {

	@OriginalMember(owner = "client!vr", name = "t", descriptor = "Z")
	private boolean aBoolean671 = false;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!ej;)V")
	public Class93_Sub8(@OriginalArg(0) Class66_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7998() {
		return true;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BII)V")
	@Override
	public void method7996(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IILclient!nq;)V")
	@Override
	public void method7995(@OriginalArg(0) int arg0, @OriginalArg(2) Interface15 arg1) {
		super.aClass66_Sub1_19.method6979(arg1);
		super.aClass66_Sub1_19.method6920(arg0);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7997(@OriginalArg(0) boolean arg0) {
		super.aClass66_Sub1_19.method6997(Static152.aClass240_1, Static174.aClass240_2);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8000(@OriginalArg(0) boolean arg0) {
		@Pc(14) Interface22 local14 = super.aClass66_Sub1_19.method6882();
		if (local14 == null || !arg0) {
			super.aClass66_Sub1_19.method6866(Static184.aClass120_3, 0);
			return;
		}
		super.aClass66_Sub1_19.method6895(1);
		super.aClass66_Sub1_19.method6979(local14);
		super.aClass66_Sub1_19.method6990(Static487.aClass221_3);
		super.aClass66_Sub1_19.method6895(1);
		super.aClass66_Sub1_19.method6997(Static440.aClass240_3, Static174.aClass240_2);
		super.aClass66_Sub1_19.method6959(2, true, false, Static232.aClass120_4);
		super.aClass66_Sub1_19.method6866(Static184.aClass120_3, 0);
		@Pc(67) Class134_Sub1 local67 = super.aClass66_Sub1_19.method6953();
		local67.method3400(super.aClass66_Sub1_19.method6982());
		super.aClass66_Sub1_19.method6933(Static209.aClass81_8);
		super.aClass66_Sub1_19.method6895(0);
		this.aBoolean671 = true;
	}

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)V")
	@Override
	public void method8002() {
		if (this.aBoolean671) {
			super.aClass66_Sub1_19.method6895(1);
			super.aClass66_Sub1_19.method6990(Static342.aClass221_4);
			super.aClass66_Sub1_19.method6997(Static152.aClass240_1, Static152.aClass240_1);
			super.aClass66_Sub1_19.method6923(Static19.aClass120_1, 2);
			super.aClass66_Sub1_19.method6866(Static22.aClass120_2, 0);
			super.aClass66_Sub1_19.method6888();
			super.aClass66_Sub1_19.method6979(null);
			super.aClass66_Sub1_19.method6895(0);
			this.aBoolean671 = false;
		} else {
			super.aClass66_Sub1_19.method6866(Static22.aClass120_2, 0);
		}
		super.aClass66_Sub1_19.method6997(Static152.aClass240_1, Static152.aClass240_1);
	}
}
