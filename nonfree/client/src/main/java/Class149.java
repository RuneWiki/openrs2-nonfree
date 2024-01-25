import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public final class Class149 {

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
	public int anInt3914;

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
	public int anInt3915;

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
	public int anInt3916;

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
	public int anInt3918;

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
	public int anInt3919;

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
	public int anInt3920;

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
	public int anInt3921;

	@OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
	public int anInt3926;

	@OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
	public int anInt3927;

	@OriginalMember(owner = "client!hs", name = "q", descriptor = "I")
	public int anInt3928;

	@OriginalMember(owner = "client!hs", name = "r", descriptor = "I")
	public int anInt3929;

	@OriginalMember(owner = "client!hs", name = "s", descriptor = "I")
	public int anInt3930;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!hs;B)Z")
	public boolean method3379(@OriginalArg(0) Class149 arg0) {
		return arg0.anInt3914 == this.anInt3914 && this.anInt3919 == arg0.anInt3919 && arg0.anInt3915 == this.anInt3915;
	}
}
