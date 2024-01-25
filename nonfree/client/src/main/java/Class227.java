import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public final class Class227 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
	public int anInt6347;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
	public int anInt6348;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
	public int anInt6349;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
	public int anInt6350;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public Class227() {
	}

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!tb;)V")
	public Class227(@OriginalArg(0) Class227 arg0) {
		this.anInt6350 = arg0.anInt6350;
		this.anInt6349 = arg0.anInt6349;
		this.anInt6347 = arg0.anInt6347;
		this.anInt6348 = arg0.anInt6348;
	}
}
