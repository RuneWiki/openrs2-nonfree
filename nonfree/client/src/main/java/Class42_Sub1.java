import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public final class Class42_Sub1 extends Class42 implements Interface11 {

	@OriginalMember(owner = "client!co", name = "s", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!pg;I[BIZ)V")
	public Class42_Sub1(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt1054 = arg1;
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!pg;ILclient!jaggl/memory/NativeBuffer;IZ)V")
	public Class42_Sub1(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt1054 = arg1;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(B)J")
	@Override
	public long method1892() {
		return 0L;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II[BB)V")
	@Override
	public void method1891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.method5168(arg0, arg2);
		this.anInt1054 = arg1;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(B)V")
	@Override
	protected void method5171() {
		super.aClass163_Sub2_40.method4140(this);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)I")
	@Override
	public int method1890() {
		return super.anInt6666;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)I")
	@Override
	public int method1893() {
		return this.anInt1054;
	}
}
