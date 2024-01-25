import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public final class Class34_Sub1 extends Class34 implements Interface6 {

	@OriginalMember(owner = "client!fw", name = "t", descriptor = "I")
	private int anInt3267;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lclient!vf;I[BIZ)V")
	public Class34_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt3267 = arg1;
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)I")
	@Override
	public int method7653() {
		return this.anInt3267;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)J")
	@Override
	public long method7655() {
		return 0L;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)I")
	@Override
	public int method7652() {
		return super.anInt9768;
	}

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "(I)V")
	@Override
	protected void method8309() {
		super.aClass100_Sub3_42.method8736(this);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIZ[B)V")
	@Override
	public void method7654(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method8308(arg1, arg0);
		this.anInt3267 = 5123;
	}
}
