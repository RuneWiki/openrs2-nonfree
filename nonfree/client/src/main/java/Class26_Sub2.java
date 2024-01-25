import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public final class Class26_Sub2 extends Class26 implements Interface4 {

	@OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
	private int anInt4626;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!da;I[BI)V")
	public Class26_Sub2(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4626 = arg1;
	}

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!da;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class26_Sub2(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt4626 = arg1;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "([BIII)V")
	@Override
	public void method5476(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method3738(arg0, arg1);
		this.anInt4626 = arg2;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)I")
	@Override
	public int method5477() {
		return 0;
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)I")
	@Override
	public int method5478() {
		return this.anInt4626;
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(I)J")
	@Override
	public long method5479() {
		return super.aNativeBuffer4.a();
	}
}
