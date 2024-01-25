import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public final class Class34_Sub2 extends Class34 implements Interface17 {

	@OriginalMember(owner = "client!uia", name = "p", descriptor = "I")
	private int anInt9774;

	@OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(Lclient!vf;I[BIZ)V")
	public Class34_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt9774 = arg1;
	}

	@OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(Lclient!vf;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class34_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt9774 = arg1;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method8313(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method8308(arg1, arg0);
		this.anInt9774 = arg2;
	}

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "(B)I")
	@Override
	public int method8310() {
		return super.anInt9768;
	}

	@OriginalMember(owner = "client!uia", name = "d", descriptor = "(I)V")
	@Override
	protected void method8309() {
		super.aClass100_Sub3_42.method8719(this);
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)J")
	@Override
	public long method8312() {
		return 0L;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(B)I")
	@Override
	public int method8311() {
		return this.anInt9774;
	}
}
