import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public final class Class246 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
	public int anInt6985;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
	public int anInt6986;

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
	public int anInt6987;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	public Class246() {
	}

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!uj;)V")
	public Class246(@OriginalArg(0) Class246 arg0) {
		this.anInt6987 = arg0.anInt6987;
		this.anInt6985 = arg0.anInt6985;
		this.anInt6986 = arg0.anInt6986;
	}
}
