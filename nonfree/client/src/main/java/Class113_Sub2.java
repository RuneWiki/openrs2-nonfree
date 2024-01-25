import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public final class Class113_Sub2 extends Class113 implements Interface6 {

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "I")
	private int anInt7404;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lclient!jj;I[BI)V")
	public Class113_Sub2(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt7404 = arg1;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Z)I")
	@Override
	public int method6018() {
		return 0;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)J")
	@Override
	public long method6020() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(Z)I")
	@Override
	public int method6019() {
		return this.anInt7404;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(BII[B)V")
	@Override
	public void method6017(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method6016(arg1, arg0);
		this.anInt7404 = 5123;
	}
}
