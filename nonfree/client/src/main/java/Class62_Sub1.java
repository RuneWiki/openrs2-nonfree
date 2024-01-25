import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public final class Class62_Sub1 extends Class62 implements Interface9 {

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
	private int anInt3350;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!ug;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class62_Sub1(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt3350 = arg1;
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!ug;I[BI)V")
	public Class62_Sub1(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt3350 = arg1;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)I")
	@Override
	public int method2934() {
		return this.anInt3350;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "([BIIB)V")
	@Override
	public void method2936(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method3825(arg0, arg2);
		this.anInt3350 = arg1;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)J")
	@Override
	public long method2935() {
		return super.aNativeBuffer3.c();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)I")
	@Override
	public int method2933() {
		return 0;
	}
}
