import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class76 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
	public int anInt2237;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
	public int anInt2238;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
	public int anInt2240;

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
	public int anInt2242;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	public Class76() {
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!ic;)V")
	public Class76(@OriginalArg(0) Class76 arg0) {
		this.anInt2238 = arg0.anInt2238;
		this.anInt2242 = arg0.anInt2242;
		this.anInt2237 = arg0.anInt2237;
		this.anInt2240 = arg0.anInt2240;
	}
}
