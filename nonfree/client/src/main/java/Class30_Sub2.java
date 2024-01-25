import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public final class Class30_Sub2 extends Class30 implements Interface15 {

	@OriginalMember(owner = "client!tha", name = "q", descriptor = "I")
	private int anInt9317;

	@OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(Lclient!kv;I[BIZ)V")
	public Class30_Sub2(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt9317 = arg1;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Z)I")
	@Override
	public int method8492() {
		return this.anInt9317;
	}

	@OriginalMember(owner = "client!tha", name = "c", descriptor = "(I)V")
	@Override
	protected void method7792() {
		super.aClass143_Sub2_37.method4952(this);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(I)I")
	@Override
	public int method8491() {
		return super.anInt9308;
	}

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "(I)J")
	@Override
	public long method8494() {
		return 0L;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(BII[B)V")
	@Override
	public void method8493(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method7791(arg0, arg1);
		this.anInt9317 = 5123;
	}
}
