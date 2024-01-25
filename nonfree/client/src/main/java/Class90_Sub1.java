import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public final class Class90_Sub1 extends Class90 implements Interface5 {

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
	private int anInt2783;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!rl;I[BI)V")
	public Class90_Sub1(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2783 = arg1;
	}

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!rl;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class90_Sub1(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt2783 = arg1;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II[BZ)V")
	@Override
	public void method6167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.method4585(arg2, arg0);
		this.anInt2783 = arg1;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)I")
	@Override
	public int method6166() {
		return 0;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)I")
	@Override
	public int method6168() {
		return this.anInt2783;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)J")
	@Override
	public long method6165() {
		return super.aNativeBuffer4.b();
	}
}
