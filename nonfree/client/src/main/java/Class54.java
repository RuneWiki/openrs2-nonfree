import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public final class Class54 {

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "I")
	public int anInt2247;

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "I")
	public int anInt2248;

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "I")
	public int anInt2249;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "()V")
	public Class54() {
	}

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lclient!daa;)V")
	public Class54(@OriginalArg(0) Class54 arg0) {
		this.anInt2247 = arg0.anInt2247;
		this.anInt2249 = arg0.anInt2249;
		this.anInt2248 = arg0.anInt2248;
	}
}
