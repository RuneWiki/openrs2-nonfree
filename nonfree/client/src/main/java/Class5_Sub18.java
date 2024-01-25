import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public final class Class5_Sub18 extends Class5 {

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
	public int anInt3136;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
	public int anInt3137;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	public int anInt3142;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
	public int anInt3143;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
	public int anInt3144;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public int anInt3138 = -1;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "Z")
	public boolean aBoolean207 = false;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(I)V")
	public Class5_Sub18(@OriginalArg(0) int arg0) {
		this.anInt3138 = arg0;
	}
}
