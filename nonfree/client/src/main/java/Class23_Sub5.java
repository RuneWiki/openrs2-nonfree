import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public final class Class23_Sub5 extends Class23 {

	@OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(ILclient!ts;)V")
	public Class23_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub48 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(Lclient!ts;)V")
	public Class23_Sub5(@OriginalArg(0) Class3_Sub48 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dha", name = "c", descriptor = "(II)V")
	@Override
	protected void method8503(@OriginalArg(1) int arg0) {
		super.anInt10359 = arg0;
	}

	@OriginalMember(owner = "client!dha", name = "c", descriptor = "(B)I")
	public int method2481() {
		return super.anInt10359;
	}

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "(II)I")
	@Override
	public int method8502(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(I)V")
	@Override
	public void method8506() {
		if (super.anInt10359 < 0 || super.anInt10359 > 4) {
			super.anInt10359 = this.method8501();
		}
	}

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "(B)I")
	@Override
	protected int method8501() {
		return 0;
	}
}
