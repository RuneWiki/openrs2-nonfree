import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class27 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
	public int anInt801;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "[Lclient!dl;")
	private Class40[] aClass40Array1;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
	private int anInt802;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(I[Lclient!dl;)V")
	public Class27(@OriginalArg(0) int arg0, @OriginalArg(1) Class40[] arg1) {
		this.anInt801 = arg0;
		this.aClass40Array1 = arg1;
		this.anInt802 = Static237.anInt5216;
	}

	@OriginalMember(owner = "client!ce", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static237.method4097(this.anInt801, this.aClass40Array1, this.anInt802);
		super.finalize();
	}
}
