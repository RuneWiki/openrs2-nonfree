import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public final class Class70_Sub1 extends Class70 implements Interface15 {

	@OriginalMember(owner = "client!ica", name = "p", descriptor = "I")
	private int anInt4235;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lclient!ffa;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class70_Sub1(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt4235 = arg1;
	}

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lclient!ffa;I[BIZ)V")
	public Class70_Sub1(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt4235 = arg1;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)I")
	@Override
	public int method3617() {
		return this.anInt4235;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(BI[BI)V")
	@Override
	public void method3618(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method8196(arg1, arg2);
		this.anInt4235 = arg0;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)I")
	@Override
	public int method3616() {
		return super.anInt9554;
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(B)J")
	@Override
	public long method3619() {
		return 0L;
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(Z)V")
	@Override
	protected void method8193() {
		super.aClass57_Sub2_35.method2363(this);
	}
}
