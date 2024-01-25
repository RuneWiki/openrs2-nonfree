import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public final class Class69_Sub2 extends Class69 implements Interface12 {

	@OriginalMember(owner = "client!uq", name = "A", descriptor = "I")
	private int anInt6972;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!tt;I[BIZ)V")
	public Class69_Sub2(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6972 = arg1;
	}

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!tt;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class69_Sub2(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6972 = arg1;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)J")
	@Override
	public long method5508() {
		return 0L;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)I")
	@Override
	public int method5510() {
		return super.anInt6959;
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
	@Override
	protected void method5504() {
		super.aClass200_Sub2_40.method5348(this);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(III[B)V")
	@Override
	public void method5507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		this.method5505(arg2, arg0);
		this.anInt6972 = arg1;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)I")
	@Override
	public int method5509() {
		return this.anInt6972;
	}
}
