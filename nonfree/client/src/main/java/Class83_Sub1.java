import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public final class Class83_Sub1 extends Class83 implements Interface11 {

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
	private int anInt2284;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!pg;I[BI)V")
	public Class83_Sub1(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2284 = arg1;
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!pg;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class83_Sub1(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt2284 = arg1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[BB)V")
	@Override
	public void method1891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.method4904(arg2, arg0);
		this.anInt2284 = arg1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)I")
	@Override
	public int method1890() {
		return 0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)J")
	@Override
	public long method1892() {
		return super.aNativeBuffer3.a();
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)I")
	@Override
	public int method1893() {
		return this.anInt2284;
	}
}
