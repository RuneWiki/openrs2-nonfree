import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public final class Class84 {

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
	public int anInt2610;

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "[Lclient!ef;")
	private Class41[] aClass41Array1;

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
	private int anInt2611;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I[Lclient!ef;)V")
	public Class84(@OriginalArg(0) int arg0, @OriginalArg(1) Class41[] arg1) {
		this.anInt2610 = arg0;
		this.aClass41Array1 = arg1;
		this.anInt2611 = Static239.anInt4726;
	}

	@OriginalMember(owner = "client!jj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static239.method3683(this.anInt2610, this.aClass41Array1, this.anInt2611);
		super.finalize();
	}
}
