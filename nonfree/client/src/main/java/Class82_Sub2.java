import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public final class Class82_Sub2 extends Class82 implements Interface5 {

	@OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
	private int anInt5637;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!bl;I[BIZ)V")
	public Class82_Sub2(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5637 = arg1;
	}

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!bl;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class82_Sub2(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5637 = arg1;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)J")
	@Override
	public long method4749() {
		return 0L;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)I")
	@Override
	public int method4748() {
		return super.anInt5625;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)I")
	@Override
	public int method4747() {
		return this.anInt5637;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "([BIII)V")
	@Override
	public void method4746(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method4741(arg1, arg0);
		this.anInt5637 = arg2;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)V")
	@Override
	protected void method4743() {
		super.aClass28_Sub1_31.method686(this);
	}
}
