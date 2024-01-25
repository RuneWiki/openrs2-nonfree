import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class56_Sub2 extends Class56 implements Interface10 {

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
	private int anInt6696;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!ur;I[BI)V")
	public Class56_Sub2(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt6696 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!ur;ILclient!jaggl/memory/NativeBuffer;)V")
	public Class56_Sub2(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) NativeBuffer arg2) {
		super(arg0, arg2);
		this.anInt6696 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)J")
	@Override
	public long method5247() {
		return super.aNativeBuffer3.b();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)I")
	@Override
	public int method5246() {
		return this.anInt6696;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)I")
	@Override
	public int method5248() {
		return 0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method5245(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method5244(arg0, arg2);
		this.anInt6696 = arg1;
	}
}
