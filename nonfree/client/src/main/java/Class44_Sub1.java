import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public final class Class44_Sub1 extends Class44 implements Interface10 {

	@OriginalMember(owner = "client!bw", name = "v", descriptor = "I")
	private int anInt1296;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!wh;I[BIZ)V")
	public Class44_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt1296 = arg1;
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)J")
	@Override
	public long method1318() {
		return 0L;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)I")
	@Override
	public int method1315() {
		return this.anInt1296;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)I")
	@Override
	public int method1316() {
		return super.anInt5455;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method1317(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method4865(arg0, arg1);
		this.anInt1296 = 5123;
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)V")
	@Override
	protected void method4862() {
		super.aClass100_Sub3_30.method8862(this);
	}
}
