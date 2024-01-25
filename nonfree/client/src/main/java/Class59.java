import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public final class Class59 {

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "Lclient!ga;")
	private final Class111 aClass111_17;

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
	public final int anInt1870;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;)V")
	public Class59(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2) {
		new Class326(64);
		this.aClass111_17 = arg2;
		this.anInt1870 = this.aClass111_17.method2442(15);
	}
}
