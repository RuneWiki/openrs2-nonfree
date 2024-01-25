import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public final class Class83_Sub2 extends Class83 implements Interface10 {

	@OriginalMember(owner = "client!gca", name = "s", descriptor = "I")
	private int anInt2536;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lclient!uca;I[BIZ)V")
	public Class83_Sub2(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt2536 = arg1;
	}

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lclient!uca;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class83_Sub2(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt2536 = arg1;
	}

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "(B)V")
	@Override
	protected void method2171() {
		super.aClass162_Sub3_18.method6938(this);
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)I")
	@Override
	public int method2294() {
		return this.anInt2536;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)I")
	@Override
	public int method2293() {
		return super.anInt2526;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method2292(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method2170(arg1, arg2);
		this.anInt2536 = arg0;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)J")
	@Override
	public long method2291() {
		return 0L;
	}
}
