import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class13_Sub10 extends Class13 {

	@OriginalMember(owner = "client!se", name = "q", descriptor = "Z")
	private boolean aBoolean684 = false;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!mj;)V")
	public Class13_Sub10(@OriginalArg(0) Class101_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8495(@OriginalArg(1) boolean arg0) {
		super.aClass101_Sub1_22.method5891(Static175.aClass381_3, Static512.aClass381_5);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8490(@OriginalArg(0) boolean arg0) {
		@Pc(13) Interface26 local13 = super.aClass101_Sub1_22.method5960();
		if (local13 == null || !arg0) {
			super.aClass101_Sub1_22.method5890(0, Static312.aClass118_3);
			return;
		}
		super.aClass101_Sub1_22.method5862(1);
		super.aClass101_Sub1_22.method5909(local13);
		super.aClass101_Sub1_22.method5889(Static610.aClass362_153);
		super.aClass101_Sub1_22.method5862(1);
		super.aClass101_Sub1_22.method5891(Static98.aClass381_1, Static512.aClass381_5);
		super.aClass101_Sub1_22.method5922(2, false, true, Static175.aClass118_2);
		super.aClass101_Sub1_22.method5890(0, Static312.aClass118_3);
		@Pc(69) Class76_Sub2 local69 = super.aClass101_Sub1_22.method5832();
		local69.method7337(super.aClass101_Sub1_22.method5881());
		super.aClass101_Sub1_22.method5902(Static647.aClass327_5);
		super.aClass101_Sub1_22.method5862(0);
		this.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!en;ZI)V")
	@Override
	public void method8494(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) int arg1) {
		super.aClass101_Sub1_22.method5909(arg0);
		super.aClass101_Sub1_22.method5840(arg1);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
	@Override
	public void method8488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
	@Override
	public void method8498() {
		if (this.aBoolean684) {
			super.aClass101_Sub1_22.method5862(1);
			super.aClass101_Sub1_22.method5889(Static267.aClass362_171);
			super.aClass101_Sub1_22.method5891(Static175.aClass381_3, Static175.aClass381_3);
			super.aClass101_Sub1_22.method5954(2, Static660.aClass118_5);
			super.aClass101_Sub1_22.method5890(0, Static44.aClass118_1);
			super.aClass101_Sub1_22.method5952();
			super.aClass101_Sub1_22.method5909((Interface5) null);
			super.aClass101_Sub1_22.method5862(0);
			this.aBoolean684 = false;
		} else {
			super.aClass101_Sub1_22.method5890(0, Static44.aClass118_1);
		}
		super.aClass101_Sub1_22.method5891(Static175.aClass381_3, Static175.aClass381_3);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8489() {
		return true;
	}
}
