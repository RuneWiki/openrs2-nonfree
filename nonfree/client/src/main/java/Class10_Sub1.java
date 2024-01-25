import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public final class Class10_Sub1 extends Class10 implements Interface8 {

	@OriginalMember(owner = "client!df", name = "i", descriptor = "I")
	private int anInt1244;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!vd;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class10_Sub1(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt1244 = arg1;
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!vd;I[BI)V")
	public Class10_Sub1(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt1244 = arg1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Z[BII)V")
	@Override
	public void method4988(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1767(arg0, arg1);
		this.anInt1244 = arg2;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)I")
	@Override
	public int method4987() {
		return 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I")
	@Override
	public int method4985() {
		return this.anInt1244;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)J")
	@Override
	public long method4986() {
		return super.aNativeBuffer3.a();
	}
}
