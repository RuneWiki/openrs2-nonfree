import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public final class Class59_Sub1 extends Class59 implements Interface1 {

	@OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
	private int anInt2036;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!ht;I[BI)V")
	public Class59_Sub1(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2036 = arg1;
	}

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!ht;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class59_Sub1(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt2036 = arg1;
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(B)I")
	@Override
	public int method3255() {
		return 0;
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)I")
	@Override
	public int method3254() {
		return this.anInt2036;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)J")
	@Override
	public long method3253() {
		return super.aNativeBuffer4.c();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B[BII)V")
	@Override
	public void method3256(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method5606(arg0, arg2);
		this.anInt2036 = arg1;
	}
}
