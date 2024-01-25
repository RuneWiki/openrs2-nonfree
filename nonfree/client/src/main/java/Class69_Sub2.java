import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public final class Class69_Sub2 extends Class69 implements Interface4 {

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
	private int anInt6976;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!da;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class69_Sub2(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6976 = arg1;
	}

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!da;I[BIZ)V")
	public Class69_Sub2(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt6976 = arg1;
	}

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "(I)V")
	@Override
	protected void method5475() {
		super.aClass50_Sub1_39.method1272(this);
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)J")
	@Override
	public long method5479() {
		return 0L;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "([BIII)V")
	@Override
	public void method5476(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method5472(arg0, arg1);
		this.anInt6976 = arg2;
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)I")
	@Override
	public int method5478() {
		return this.anInt6976;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)I")
	@Override
	public int method5477() {
		return super.anInt6969;
	}
}
