import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public final class Class41 {

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "I")
	public int anInt863;

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
	public int anInt864;

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
	public int anInt865;

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "I")
	public int anInt866;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "()V")
	public Class41() {
	}

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lclient!cba;)V")
	public Class41(@OriginalArg(0) Class41 arg0) {
		this.anInt866 = arg0.anInt866;
		this.anInt865 = arg0.anInt865;
		this.anInt864 = arg0.anInt864;
		this.anInt863 = arg0.anInt863;
	}
}
