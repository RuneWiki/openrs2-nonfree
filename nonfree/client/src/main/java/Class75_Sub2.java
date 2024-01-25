import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public final class Class75_Sub2 extends Class75 implements Interface21 {

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
	private int anInt10609;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!lf;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class75_Sub2(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt10609 = arg1;
	}

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!lf;I[BIZ)V")
	public Class75_Sub2(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt10609 = arg1;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)I")
	@Override
	public int method8696() {
		return super.anInt10605;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)I")
	@Override
	public int method8695() {
		return this.anInt10609;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "([BIZI)V")
	@Override
	public void method8698(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method8693(arg0, arg2);
		this.anInt10609 = arg1;
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(Z)J")
	@Override
	public long method8697() {
		return 0L;
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)V")
	@Override
	protected void method8692() {
		super.aClass95_Sub3_41.method4882(this);
	}
}
