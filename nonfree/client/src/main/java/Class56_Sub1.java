import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public final class Class56_Sub1 extends Class56 implements Interface2 {

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
	private int anInt1358;

	static {
		new Class119(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!ur;I[BI)V")
	public Class56_Sub1(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt1358 = arg1;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)J")
	@Override
	public long method3823() {
		return super.aNativeBuffer3.b();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZI[BI)V")
	@Override
	public void method3824(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method5244(arg1, arg0);
		this.anInt1358 = 5123;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)I")
	@Override
	public int method3825() {
		return this.anInt1358;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)I")
	@Override
	public int method3826() {
		return 0;
	}
}
