import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public final class Class23_Sub27 extends Class23 {

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!ts;)V")
	public Class23_Sub27(@OriginalArg(0) Class3_Sub48 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(ILclient!ts;)V")
	public Class23_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub48 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)I")
	public int method7666() {
		return super.anInt10359;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)I")
	@Override
	public int method8502(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	@Override
	public void method8506() {
		super.anInt10359 = this.method8501();
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)V")
	@Override
	protected void method8503(@OriginalArg(1) int arg0) {
		super.anInt10359 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)I")
	@Override
	protected int method8501() {
		return super.aClass3_Sub48_31.method7828() ? 1 : 0;
	}
}
