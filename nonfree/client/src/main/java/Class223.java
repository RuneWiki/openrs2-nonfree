import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class223 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	public int anInt6981;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	public int anInt6982;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	public int anInt6983;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	public Class223() {
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!nc;)V")
	public Class223(@OriginalArg(0) Class223 arg0) {
		this.anInt6981 = arg0.anInt6981;
		this.anInt6982 = arg0.anInt6982;
		this.anInt6983 = arg0.anInt6983;
	}
}
