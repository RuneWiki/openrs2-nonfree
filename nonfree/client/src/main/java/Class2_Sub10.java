import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public final class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
	public int anInt2177;

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
	public int anInt2178;

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
	public int anInt2182;

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
	public int anInt2184;

	@OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
	public int anInt2185;

	@OriginalMember(owner = "client!fg", name = "v", descriptor = "I")
	public int anInt2183 = -1;

	@OriginalMember(owner = "client!fg", name = "x", descriptor = "Z")
	public boolean aBoolean161 = false;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(I)V")
	public Class2_Sub10(@OriginalArg(0) int arg0) {
		this.anInt2183 = arg0;
	}
}
