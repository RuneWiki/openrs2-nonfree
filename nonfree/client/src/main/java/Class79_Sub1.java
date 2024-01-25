import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public final class Class79_Sub1 extends Class79 implements Interface10 {

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
	private int anInt2667;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!uca;I[BI)V")
	public Class79_Sub1(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2667 = arg1;
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!uca;ILclient!jaclib/memory/Buffer;)V")
	public Class79_Sub1(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt2667 = arg1;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)J")
	@Override
	public long method2291() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)I")
	@Override
	public int method2293() {
		return 0;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)I")
	@Override
	public int method2294() {
		return this.anInt2667;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method2292(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method5342(arg1, arg2);
		this.anInt2667 = arg0;
	}
}
