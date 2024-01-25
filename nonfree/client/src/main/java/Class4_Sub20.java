import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public final class Class4_Sub20 extends Class4 {

	@OriginalMember(owner = "client!fu", name = "q", descriptor = "I")
	public int anInt3259;

	@OriginalMember(owner = "client!fu", name = "r", descriptor = "I")
	public int anInt3260;

	@OriginalMember(owner = "client!fu", name = "w", descriptor = "I")
	public int anInt3263;

	@OriginalMember(owner = "client!fu", name = "x", descriptor = "I")
	public int anInt3264;

	@OriginalMember(owner = "client!fu", name = "y", descriptor = "I")
	public int anInt3265;

	@OriginalMember(owner = "client!fu", name = "z", descriptor = "I")
	public int anInt3266 = -1;

	@OriginalMember(owner = "client!fu", name = "s", descriptor = "Z")
	public boolean aBoolean239 = false;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(I)V")
	public Class4_Sub20(@OriginalArg(0) int arg0) {
		this.anInt3266 = arg0;
	}
}
