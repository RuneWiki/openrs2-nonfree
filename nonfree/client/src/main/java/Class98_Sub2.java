import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public final class Class98_Sub2 extends Class98 implements Interface9 {

	@OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
	private int anInt3687;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!ug;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class98_Sub2(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt3687 = arg1;
	}

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!ug;I[BIZ)V")
	public Class98_Sub2(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt3687 = arg1;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)I")
	@Override
	public int method2933() {
		return super.anInt3685;
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)I")
	@Override
	public int method2934() {
		return this.anInt3687;
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)V")
	@Override
	protected void method2930() {
		super.aClass135_Sub2_18.method5484(this);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "([BIIB)V")
	@Override
	public void method2936(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method2931(arg2, arg0);
		this.anInt3687 = arg1;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)J")
	@Override
	public long method2935() {
		return 0L;
	}
}
