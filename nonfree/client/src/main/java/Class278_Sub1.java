import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public final class Class278_Sub1 extends Class278 implements Interface10 {

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
	private int anInt10413;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!rs;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class278_Sub1(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt10413 = arg1;
	}

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!rs;I[BIZ)V")
	public Class278_Sub1(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt10413 = arg1;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([BBII)V")
	@Override
	public void method8855(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method8969(arg0, arg2);
		this.anInt10413 = arg1;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V")
	@Override
	protected void method8970() {
		super.aClass133_Sub3_43.method7370(this);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)I")
	@Override
	public int method8856() {
		return super.anInt10552;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)I")
	@Override
	public int method8854() {
		return this.anInt10413;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)J")
	@Override
	public long method8857() {
		return 0L;
	}
}
