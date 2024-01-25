import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public final class Class5_Sub49 extends Class5 {

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
	public int anInt8670;

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
	public int anInt8671;

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
	public int anInt8672;

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
	public int anInt8673;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
	public int anInt8674;

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "Z")
	public boolean aBoolean571 = false;

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
	public int anInt8675 = -1;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(I)V")
	public Class5_Sub49(@OriginalArg(0) int arg0) {
		this.anInt8675 = arg0;
	}
}
