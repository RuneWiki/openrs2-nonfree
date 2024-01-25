import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public final class Class130_Sub2 extends Class130 implements Interface5 {

	@OriginalMember(owner = "client!vda", name = "s", descriptor = "I")
	private int anInt9139;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lclient!ok;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class130_Sub2(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt9139 = arg1;
	}

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lclient!ok;I[BIZ)V")
	public Class130_Sub2(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt9139 = arg1;
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)J")
	@Override
	public long method7487() {
		return 0L;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)I")
	@Override
	public int method7486() {
		return this.anInt9139;
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(B)V")
	@Override
	protected void method7483() {
		super.aClass134_Sub2_41.method5245(this);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)I")
	@Override
	public int method7485() {
		return super.anInt9128;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(BII[B)V")
	@Override
	public void method7484(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method7481(arg0, arg2);
		this.anInt9139 = arg1;
	}
}
