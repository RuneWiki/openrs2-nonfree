import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class38_Sub1 extends Class38 implements Interface15 {

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
	private int anInt739;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!ffa;I[BI)V")
	public Class38_Sub1(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt739 = arg1;
	}

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!ffa;ILclient!jaclib/memory/Buffer;)V")
	public Class38_Sub1(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt739 = arg1;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI[BI)V")
	@Override
	public void method3618(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method4664(arg1, arg2);
		this.anInt739 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)I")
	@Override
	public int method3617() {
		return this.anInt739;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I")
	@Override
	public int method3616() {
		return 0;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)J")
	@Override
	public long method3619() {
		return super.aBuffer3.getAddress();
	}
}
