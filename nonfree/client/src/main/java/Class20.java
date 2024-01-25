import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public abstract class Class20 {

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	protected Class20() {
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZI)V")
	public abstract void method462(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)[B")
	public abstract byte[] method465(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)Lclient!sia;")
	public abstract Class319 method466();

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)I")
	public abstract int method467(@OriginalArg(0) int arg0);
}
