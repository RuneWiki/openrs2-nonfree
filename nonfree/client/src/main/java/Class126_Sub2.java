import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public final class Class126_Sub2 extends Class126 implements Interface8 {

	@OriginalMember(owner = "client!tn", name = "D", descriptor = "I")
	private int anInt8824;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!lj;I[BIZ)V")
	public Class126_Sub2(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt8824 = arg1;
	}

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!lj;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class126_Sub2(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt8824 = arg1;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)I")
	@Override
	public int method7525() {
		return this.anInt8824;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)I")
	@Override
	public int method7526() {
		return super.anInt8815;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)J")
	@Override
	public long method7524() {
		return 0L;
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(I)V")
	@Override
	protected void method7118() {
		super.aClass78_Sub3_38.method4561(this);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method7523(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method7119(arg1, arg2);
		this.anInt8824 = arg0;
	}
}
