import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class72 {

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
	public int anInt2491;

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "[Lclient!ed;")
	private Class38[] aClass38Array1;

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
	private int anInt2492;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(I[Lclient!ed;)V")
	public Class72(@OriginalArg(0) int arg0, @OriginalArg(1) Class38[] arg1) {
		this.anInt2491 = arg0;
		this.aClass38Array1 = arg1;
		this.anInt2492 = Static124.anInt2871;
	}

	@OriginalMember(owner = "client!hi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static124.method2210(this.anInt2491, this.aClass38Array1, this.anInt2492);
		super.finalize();
	}
}
