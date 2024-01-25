import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public final class Class51_Sub1 extends Class51 implements Interface10 {

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
	private int anInt1271;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!ur;I[BIZ)V")
	public Class51_Sub1(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt1271 = arg1;
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!ur;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class51_Sub1(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt1271 = arg1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I")
	@Override
	public int method5246() {
		return this.anInt1271;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method5245(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method3818(arg2, arg0);
		this.anInt1271 = arg1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)I")
	@Override
	public int method5248() {
		return super.anInt4878;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)J")
	@Override
	public long method5247() {
		return 0L;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
	@Override
	protected void method3821() {
		super.aClass34_Sub2_24.method5516(this);
	}
}
