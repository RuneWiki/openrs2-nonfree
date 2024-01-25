import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public final class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
	public int anInt2177;

	@OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
	public int anInt2178;

	@OriginalMember(owner = "client!cs", name = "p", descriptor = "I")
	public int anInt2180;

	@OriginalMember(owner = "client!cs", name = "q", descriptor = "I")
	public int anInt2181;

	@OriginalMember(owner = "client!cs", name = "s", descriptor = "I")
	public int anInt2183;

	@OriginalMember(owner = "client!cs", name = "j", descriptor = "Z")
	public boolean aBoolean182 = false;

	@OriginalMember(owner = "client!cs", name = "o", descriptor = "I")
	public int anInt2179 = -1;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(I)V")
	public Class2_Sub13(@OriginalArg(0) int arg0) {
		this.anInt2179 = arg0;
	}
}
