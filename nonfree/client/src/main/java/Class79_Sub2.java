import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public final class Class79_Sub2 extends Class79 implements Interface21 {

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
	private int anInt6387;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!uca;I[BI)V")
	public Class79_Sub2(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt6387 = arg1;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)J")
	@Override
	public long method5346() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)I")
	@Override
	public int method5343() {
		return 0;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method5344(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method5342(arg1, arg0);
		this.anInt6387 = 5123;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)I")
	@Override
	public int method5345() {
		return this.anInt6387;
	}
}
