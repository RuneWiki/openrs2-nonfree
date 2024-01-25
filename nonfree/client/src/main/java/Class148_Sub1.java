import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public final class Class148_Sub1 extends Class148 implements Interface2 {

	@OriginalMember(owner = "client!l", name = "p", descriptor = "I")
	private int anInt5071;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!uq;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class148_Sub1(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5071 = arg1;
	}

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!uq;I[BIZ)V")
	public Class148_Sub1(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5071 = arg1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)I")
	@Override
	public int method4389() {
		return this.anInt5071;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method4390(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method6542(arg0, arg2);
		this.anInt5071 = arg1;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
	@Override
	protected void method6544() {
		super.aClass122_Sub3_37.method6893(this);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)I")
	@Override
	public int method4392() {
		return super.anInt7868;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)J")
	@Override
	public long method4391() {
		return 0L;
	}
}
