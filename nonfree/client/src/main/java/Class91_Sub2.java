import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public final class Class91_Sub2 extends Class91 implements Interface14 {

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "I")
	private int anInt9225;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lclient!en;I[BIZ)V")
	public Class91_Sub2(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt9225 = arg1;
	}

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lclient!en;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class91_Sub2(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt9225 = arg1;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method7306(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method7305(arg1, arg2);
		this.anInt9225 = arg0;
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)I")
	@Override
	public int method7309() {
		return super.anInt9219;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)J")
	@Override
	public long method7307() {
		return 0L;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)I")
	@Override
	public int method7308() {
		return this.anInt9225;
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(Z)V")
	@Override
	protected void method7304() {
		super.aClass90_Sub1_41.method2079(this);
	}
}
