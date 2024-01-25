import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public final class Class245 {

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
	public int anInt6586;

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
	public int anInt6587;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
	public int anInt6588;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
	public int anInt6589;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
	public Class245() {
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!uk;)V")
	public Class245(@OriginalArg(0) Class245 arg0) {
		this.anInt6587 = arg0.anInt6587;
		this.anInt6589 = arg0.anInt6589;
		this.anInt6586 = arg0.anInt6586;
		this.anInt6588 = arg0.anInt6588;
	}
}
