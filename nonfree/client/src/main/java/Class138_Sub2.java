import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public final class Class138_Sub2 extends Class138 implements Interface20 {

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
	private int anInt9435;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!mh;I[BI)V")
	public Class138_Sub2(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt9435 = arg1;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)I")
	@Override
	public int method8128() {
		return 0;
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)J")
	@Override
	public long method8131() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method8129(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method8127(arg1, arg0);
		this.anInt9435 = 5123;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)I")
	@Override
	public int method8130() {
		return this.anInt9435;
	}
}
