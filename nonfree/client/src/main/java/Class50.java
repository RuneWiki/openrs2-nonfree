import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class50 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
	public int anInt2188;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
	public int anInt2189;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
	public int anInt2192;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
	public int anInt2195;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class50() {
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!ne;)V")
	public Class50(@OriginalArg(0) Class50 arg0) {
		this.anInt2189 = arg0.anInt2189;
		this.anInt2195 = arg0.anInt2195;
		this.anInt2192 = arg0.anInt2192;
		this.anInt2188 = arg0.anInt2188;
	}
}
