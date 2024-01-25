import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class172_Sub1 extends Class172 implements Interface12 {

	@OriginalMember(owner = "client!id", name = "i", descriptor = "I")
	private int anInt4070;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!uja;I[BI)V")
	public Class172_Sub1(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4070 = arg1;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)I")
	@Override
	public int method7100() {
		return this.anInt4070;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB[BI)V")
	@Override
	public void method7099(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method8066(arg0, arg1);
		this.anInt4070 = 5123;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(B)J")
	@Override
	public long method7101() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)I")
	@Override
	public int method7102() {
		return 0;
	}
}
