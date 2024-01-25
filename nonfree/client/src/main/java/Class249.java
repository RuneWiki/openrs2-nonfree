import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class249 {

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "Lclient!dn;")
	private final Class56 aClass56_88;

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
	public final int anInt7293;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!gt;ILclient!dn;)V")
	public Class249(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2) {
		new Class5(64);
		this.aClass56_88 = arg2;
		this.anInt7293 = this.aClass56_88.method1373(15);
	}
}
