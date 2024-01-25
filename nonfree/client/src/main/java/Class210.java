import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public final class Class210 {

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
	public int anInt6286;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
	public int anInt6287;

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
	public int anInt6288;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	public Class210() {
	}

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!nj;)V")
	public Class210(@OriginalArg(0) Class210 arg0) {
		this.anInt6288 = arg0.anInt6288;
		this.anInt6287 = arg0.anInt6287;
		this.anInt6286 = arg0.anInt6286;
	}
}
