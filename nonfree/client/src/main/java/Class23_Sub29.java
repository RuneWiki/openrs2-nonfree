import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class23_Sub29 extends Class23 {

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!ts;)V")
	public Class23_Sub29(@OriginalArg(0) Class3_Sub48 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(ILclient!ts;)V")
	public Class23_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub48 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)I")
	@Override
	protected int method8501() {
		return 0;
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(B)Z")
	public boolean method8508() {
		@Pc(15) int local15 = super.aClass3_Sub48_31.method7827().method8480();
		return local15 >= 96;
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "(B)I")
	public int method8509() {
		return super.anInt10359;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	@Override
	public void method8506() {
		@Pc(10) int local10 = super.aClass3_Sub48_31.method7827().method8480();
		if (local10 < 96) {
			super.anInt10359 = 0;
		}
		if (super.anInt10359 > 1 && local10 < 128) {
			super.anInt10359 = 1;
		}
		if (super.anInt10359 > 2 && local10 < 192) {
			super.anInt10359 = 2;
		}
		if (super.anInt10359 < 0 || super.anInt10359 > 3) {
			super.anInt10359 = this.method8501();
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)I")
	@Override
	public int method8502(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = super.aClass3_Sub48_31.method7827().method8480();
		if (local10 < 96) {
			return 3;
		} else if (arg0 > 1 && local10 < 128) {
			return 3;
		} else if (arg0 > 3 && local10 < 192) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)V")
	@Override
	protected void method8503(@OriginalArg(1) int arg0) {
		super.anInt10359 = arg0;
	}
}
