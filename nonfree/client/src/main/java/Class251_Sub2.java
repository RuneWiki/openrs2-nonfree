import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public final class Class251_Sub2 extends Class251 implements Interface12 {

	@OriginalMember(owner = "client!to", name = "r", descriptor = "I")
	private int anInt9058;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!ep;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class251_Sub2(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt9058 = arg1;
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!ep;I[BIZ)V")
	public Class251_Sub2(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt9058 = arg1;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)I")
	@Override
	public int method7603() {
		return this.anInt9058;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)J")
	@Override
	public long method7602() {
		return 0L;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BII[B)V")
	@Override
	public void method7601(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method7599(arg1, arg2);
		this.anInt9058 = arg0;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I")
	@Override
	public int method7600() {
		return super.anInt9048;
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(I)V")
	@Override
	protected void method7596() {
		super.aClass95_Sub1_40.method2103(this);
	}
}
