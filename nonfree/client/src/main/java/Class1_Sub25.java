import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
	public int anInt4119;

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
	public int anInt4120;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
	public int anInt4121;

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
	public int anInt4123;

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
	public int anInt4125;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Z")
	public boolean aBoolean349 = false;

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
	public int anInt4124 = -1;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(I)V")
	public Class1_Sub25(@OriginalArg(0) int arg0) {
		this.anInt4124 = arg0;
	}
}
