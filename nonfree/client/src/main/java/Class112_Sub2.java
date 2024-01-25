import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public final class Class112_Sub2 extends Class112 implements Interface5 {

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
	private int anInt7516;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!rl;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class112_Sub2(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt7516 = arg1;
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!rl;I[BIZ)V")
	public Class112_Sub2(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt7516 = arg1;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)I")
	@Override
	public int method6168() {
		return this.anInt7516;
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V")
	@Override
	protected void method6161() {
		super.aClass66_Sub2_42.method5119(this);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)J")
	@Override
	public long method6165() {
		return 0L;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)I")
	@Override
	public int method6166() {
		return super.anInt7507;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II[BZ)V")
	@Override
	public void method6167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.method6164(arg2, arg0);
		this.anInt7516 = arg1;
	}
}
