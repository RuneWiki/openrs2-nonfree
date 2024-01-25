import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class76_Sub2 extends Class76 implements Interface12 {

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	private int anInt2765;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!kd;I[BI)V")
	public Class76_Sub2(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2765 = arg1;
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!kd;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class76_Sub2(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt2765 = arg1;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)I")
	@Override
	public int method5067() {
		return 0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([BIIZ)V")
	@Override
	public void method5068(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method2379(arg0, arg1);
		this.anInt2765 = arg2;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)I")
	@Override
	public int method5065() {
		return this.anInt2765;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)J")
	@Override
	public long method5066() {
		return super.aNativeBuffer3.b();
	}
}
