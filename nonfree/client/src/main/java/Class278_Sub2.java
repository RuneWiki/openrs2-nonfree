import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public final class Class278_Sub2 extends Class278 implements Interface21 {

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
	private int anInt10556;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!rs;I[BIZ)V")
	public Class278_Sub2(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt10556 = arg1;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)V")
	@Override
	protected void method8970() {
		super.aClass133_Sub3_43.method7335(this);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)J")
	@Override
	public long method8972() {
		return 0L;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)I")
	@Override
	public int method8971() {
		return this.anInt10556;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "([BIIZ)V")
	@Override
	public void method8974(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method8969(arg0, arg1);
		this.anInt10556 = 5123;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)I")
	@Override
	public int method8973() {
		return super.anInt10552;
	}
}
