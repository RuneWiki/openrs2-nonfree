import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public final class Class11_Sub2 extends Class11 implements Interface1 {

	@OriginalMember(owner = "client!bu", name = "r", descriptor = "I")
	private int anInt691;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lclient!ef;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class11_Sub2(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt691 = arg1;
	}

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lclient!ef;I[BIZ)V")
	public Class11_Sub2(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt691 = arg1;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method691(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method585(arg2, arg0);
		this.anInt691 = arg1;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)I")
	@Override
	public int method693() {
		return super.anInt685;
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)V")
	@Override
	protected void method581() {
		super.aClass49_Sub2_4.method1612(this);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)J")
	@Override
	public long method692() {
		return 0L;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)I")
	@Override
	public int method690() {
		return this.anInt691;
	}
}
