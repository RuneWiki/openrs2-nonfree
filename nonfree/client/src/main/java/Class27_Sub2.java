import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public final class Class27_Sub2 extends Class27 implements Interface13 {

	@OriginalMember(owner = "client!rda", name = "q", descriptor = "I")
	private int anInt8584;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Lclient!uja;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class27_Sub2(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt8584 = arg1;
	}

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Lclient!uja;I[BIZ)V")
	public Class27_Sub2(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt8584 = arg1;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)J")
	@Override
	public long method8070() {
		return 0L;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method8068(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method7592(arg2, arg1);
		this.anInt8584 = arg0;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(B)I")
	@Override
	public int method8069() {
		return super.anInt8574;
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(B)V")
	@Override
	protected void method7591() {
		super.aClass145_Sub3_37.method8864(this);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)I")
	@Override
	public int method8067() {
		return this.anInt8584;
	}
}
