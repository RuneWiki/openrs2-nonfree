import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class106 {

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
	public int anInt4169;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	public int anInt4170;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
	public int anInt4171;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
	public int anInt4173;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	public Class106() {
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!sb;)V")
	public Class106(@OriginalArg(0) Class106 arg0) {
		this.anInt4171 = arg0.anInt4171;
		this.anInt4173 = arg0.anInt4173;
		this.anInt4170 = arg0.anInt4170;
		this.anInt4169 = arg0.anInt4169;
	}
}
