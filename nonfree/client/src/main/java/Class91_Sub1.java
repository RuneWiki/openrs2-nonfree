import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public final class Class91_Sub1 extends Class91 implements Interface15 {

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
	private int anInt2499;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!en;I[BIZ)V")
	public Class91_Sub1(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt2499 = arg1;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)J")
	@Override
	public long method3358() {
		return 0L;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(Z)V")
	@Override
	protected void method7304() {
		super.aClass90_Sub1_41.method2091(this);
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)I")
	@Override
	public int method3359() {
		return super.anInt9219;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method3357(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method7305(arg1, arg0);
		this.anInt2499 = 5123;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)I")
	@Override
	public int method3356() {
		return this.anInt2499;
	}
}
