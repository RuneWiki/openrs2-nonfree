import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public final class Class2_Sub2 extends Class2 implements Interface24 {

	@OriginalMember(owner = "client!vu", name = "p", descriptor = "I")
	private int anInt10947;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lclient!gia;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class2_Sub2(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt10947 = arg1;
	}

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lclient!gia;I[BIZ)V")
	public Class2_Sub2(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt10947 = arg1;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)I")
	@Override
	public int method9138() {
		return this.anInt10947;
	}

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "(I)V")
	@Override
	protected void method9129() {
		super.aClass67_Sub2_43.method3250(this);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Z)I")
	@Override
	public int method9136() {
		return super.anInt10937;
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)J")
	@Override
	public long method9137() {
		return 0L;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method9135(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method9134(arg1, arg0);
		this.anInt10947 = arg2;
	}
}
