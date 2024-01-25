import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class155 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
	public int anInt4273;

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
	public int anInt4274;

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
	public int anInt4275;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V")
	public Class155() {
	}

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!lo;)V")
	public Class155(@OriginalArg(0) Class155 arg0) {
		this.anInt4274 = arg0.anInt4274;
		this.anInt4275 = arg0.anInt4275;
		this.anInt4273 = arg0.anInt4273;
	}
}
