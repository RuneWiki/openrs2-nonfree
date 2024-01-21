import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
	public int anInt72;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
	public int anInt73;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	public int anInt74;

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
	public int anInt78;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	public Class3() {
	}

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!ab;)V")
	public Class3(@OriginalArg(0) Class3 arg0) {
		this.anInt73 = arg0.anInt73;
		this.anInt78 = arg0.anInt78;
		this.anInt72 = arg0.anInt72;
		this.anInt74 = arg0.anInt74;
	}
}
