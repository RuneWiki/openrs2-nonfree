import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public final class Class7_Sub11 extends Class7 {

	@OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
	public int anInt1057;

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
	public int anInt1058;

	@OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
	public int anInt1059;

	@OriginalMember(owner = "client!cs", name = "r", descriptor = "I")
	public int anInt1063;

	@OriginalMember(owner = "client!cs", name = "w", descriptor = "I")
	public int anInt1067;

	@OriginalMember(owner = "client!cs", name = "p", descriptor = "I")
	public int anInt1062 = -1;

	@OriginalMember(owner = "client!cs", name = "q", descriptor = "Z")
	public boolean aBoolean65 = false;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(I)V")
	public Class7_Sub11(@OriginalArg(0) int arg0) {
		this.anInt1062 = arg0;
	}
}
