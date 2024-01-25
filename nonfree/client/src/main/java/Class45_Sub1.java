import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public final class Class45_Sub1 extends Class45 implements Interface6 {

	@OriginalMember(owner = "client!df", name = "c", descriptor = "I")
	private int anInt1741;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!bv;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class45_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt1741 = arg1;
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!bv;I[BI)V")
	public Class45_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt1741 = arg1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)I")
	@Override
	public int method2117() {
		return 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)J")
	@Override
	public long method2116() {
		return super.aNativeBuffer4.a();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I")
	@Override
	public int method2115() {
		return this.anInt1741;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method2114(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method3513(arg0, arg1);
		this.anInt1741 = arg2;
	}
}
