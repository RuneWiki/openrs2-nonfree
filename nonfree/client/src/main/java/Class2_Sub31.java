import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class2_Sub31 extends Class2 {

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
	public int anInt4059;

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
	public int anInt4060;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
	public int anInt4063;

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
	public int anInt4064;

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
	public int anInt4065;

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
	public int anInt4062 = -1;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "Z")
	public boolean aBoolean363 = false;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(I)V")
	public Class2_Sub31(@OriginalArg(0) int arg0) {
		this.anInt4062 = arg0;
	}
}
