import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class23_Sub24 extends Class23 {

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!ts;)V")
	public Class23_Sub24(@OriginalArg(0) Class3_Sub48 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(ILclient!ts;)V")
	public Class23_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub48 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)I")
	@Override
	public int method8502(@OriginalArg(0) int arg0) {
		return Static487.method7151(super.aClass3_Sub48_31.aClass23_Sub18_2.method5152()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(II)V")
	@Override
	protected void method8503(@OriginalArg(1) int arg0) {
		super.anInt10359 = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	@Override
	public void method8506() {
		if (super.aClass3_Sub48_31.aClass23_Sub18_2.method5154() && !Static487.method7151(super.aClass3_Sub48_31.aClass23_Sub18_2.method5152())) {
			super.anInt10359 = 0;
		}
		if (super.anInt10359 < 0 || super.anInt10359 > 2) {
			super.anInt10359 = this.method8501();
		}
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)Z")
	public boolean method6646() {
		return Static487.method7151(super.aClass3_Sub48_31.aClass23_Sub18_2.method5152());
	}

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "(B)I")
	public int method6648() {
		return super.anInt10359;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)I")
	@Override
	protected int method8501() {
		return 0;
	}
}
