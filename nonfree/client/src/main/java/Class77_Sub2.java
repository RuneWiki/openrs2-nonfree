import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class77_Sub2 extends Class77 implements Interface1 {

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
	private int anInt6303;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!jaa;ILclient!jaclib/memory/Buffer;)V")
	public Class77_Sub2(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt6303 = arg1;
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!jaa;I[BI)V")
	public Class77_Sub2(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt6303 = arg1;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III[B)V")
	@Override
	public void method5393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method5392(arg2, arg1);
		this.anInt6303 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)I")
	@Override
	public int method5394() {
		return this.anInt6303;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)I")
	@Override
	public int method5395() {
		return 0;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)J")
	@Override
	public long method5396() {
		return super.aBuffer3.getAddress();
	}
}
