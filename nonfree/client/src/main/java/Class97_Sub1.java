import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public final class Class97_Sub1 extends Class97 implements Interface5 {

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
	private int anInt2281;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!bl;I[BI)V")
	public Class97_Sub1(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2281 = arg1;
	}

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!bl;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class97_Sub1(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt2281 = arg1;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)J")
	@Override
	public long method4749() {
		return super.aNativeBuffer3.b();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)I")
	@Override
	public int method4747() {
		return this.anInt2281;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)I")
	@Override
	public int method4748() {
		return 0;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([BIII)V")
	@Override
	public void method4746(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method4282(arg0, arg1);
		this.anInt2281 = arg2;
	}
}
