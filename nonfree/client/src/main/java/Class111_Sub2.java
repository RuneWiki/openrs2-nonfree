import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class111_Sub2 extends Class111 implements Interface21 {

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
	private int anInt4483;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!vj;ILclient!jaclib/memory/Buffer;)V")
	public Class111_Sub2(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt4483 = arg1;
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!vj;I[BI)V")
	public Class111_Sub2(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4483 = arg1;
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)J")
	@Override
	public long method7595() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method7596(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method3889(arg1, arg0);
		this.anInt4483 = arg2;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)I")
	@Override
	public int method7593() {
		return this.anInt4483;
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)I")
	@Override
	public int method7594() {
		return 0;
	}
}
