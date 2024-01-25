import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public final class Class23_Sub8 extends Class23 {

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!ts;)V")
	public Class23_Sub8(@OriginalArg(0) Class3_Sub48 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(ILclient!ts;)V")
	public Class23_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub48 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(II)V")
	@Override
	protected void method8503(@OriginalArg(1) int arg0) {
		super.anInt10359 = arg0;
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)I")
	@Override
	protected int method8501() {
		return 127;
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(B)I")
	public int method3378() {
		return super.anInt10359;
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(II)I")
	@Override
	public int method8502(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
	@Override
	public void method8506() {
		if (super.anInt10359 < 0 && super.anInt10359 > 127) {
			super.anInt10359 = this.method8501();
		}
	}
}
