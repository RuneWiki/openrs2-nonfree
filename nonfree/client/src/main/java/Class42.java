import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public final class Class42 {

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
	public int anInt959;

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
	public int anInt960;

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
	public int anInt961;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V")
	public Class42() {
	}

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!cs;)V")
	public Class42(@OriginalArg(0) Class42 arg0) {
		this.anInt960 = arg0.anInt960;
		this.anInt959 = arg0.anInt959;
		this.anInt961 = arg0.anInt961;
	}
}
