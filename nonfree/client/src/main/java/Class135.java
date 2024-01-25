import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public final class Class135 {

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "Lclient!la;")
	private final Class207 aClass207_45;

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
	public final int anInt3881;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;)V")
	public Class135(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2) {
		new Class87(64);
		this.aClass207_45 = arg2;
		this.anInt3881 = this.aClass207_45.method4672(15);
	}
}
