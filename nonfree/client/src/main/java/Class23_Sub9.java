import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public final class Class23_Sub9 extends Class23 {

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(ILclient!ts;)V")
	public Class23_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub48 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!ts;)V")
	public Class23_Sub9(@OriginalArg(0) Class3_Sub48 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
	@Override
	public void method8506() {
		if (super.anInt10359 < 1 || super.anInt10359 > 3) {
			super.anInt10359 = this.method8501();
		}
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(II)V")
	@Override
	protected void method8503(@OriginalArg(1) int arg0) {
		super.anInt10359 = arg0;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)I")
	@Override
	protected int method8501() {
		return super.aClass3_Sub48_31.method7827().method8476() ? 3 : 2;
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(B)I")
	public int method3448() {
		return super.anInt10359;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(II)I")
	@Override
	public int method8502(@OriginalArg(0) int arg0) {
		return 1;
	}
}
