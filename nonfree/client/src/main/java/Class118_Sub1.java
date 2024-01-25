import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public final class Class118_Sub1 extends Class118 implements Interface8 {

	@OriginalMember(owner = "client!to", name = "s", descriptor = "I")
	private int anInt6272;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!vd;I[BIZ)V")
	public Class118_Sub1(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6272 = arg1;
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!vd;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class118_Sub1(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6272 = arg1;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)I")
	@Override
	public int method4987() {
		return super.anInt7447;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)J")
	@Override
	public long method4986() {
		return 0L;
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(I)V")
	@Override
	protected void method5742() {
		super.aClass51_Sub2_41.method5380(this);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I")
	@Override
	public int method4985() {
		return this.anInt6272;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Z[BII)V")
	@Override
	public void method4988(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method5740(arg0, arg1);
		this.anInt6272 = arg2;
	}
}
