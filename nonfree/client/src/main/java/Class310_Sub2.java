import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public final class Class310_Sub2 extends Class310 implements Interface21 {

	@OriginalMember(owner = "client!vp", name = "m", descriptor = "I")
	private int anInt9195;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!vj;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class310_Sub2(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt9195 = arg1;
	}

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!vj;I[BIZ)V")
	public Class310_Sub2(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt9195 = arg1;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)I")
	@Override
	public int method7594() {
		return super.anInt9188;
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)V")
	@Override
	protected void method7591() {
		super.aClass45_Sub3_43.method7499(this);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)I")
	@Override
	public int method7593() {
		return this.anInt9195;
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)J")
	@Override
	public long method7595() {
		return 0L;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method7596(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method7590(arg0, arg1);
		this.anInt9195 = arg2;
	}
}
