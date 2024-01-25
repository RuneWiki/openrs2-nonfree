import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public final class Class2_Sub14 extends Class2 {

	@OriginalMember(owner = "client!gfa", name = "l", descriptor = "I")
	public int anInt3125;

	@OriginalMember(owner = "client!gfa", name = "m", descriptor = "I")
	public int anInt3126;

	@OriginalMember(owner = "client!gfa", name = "o", descriptor = "I")
	public int anInt3127;

	@OriginalMember(owner = "client!gfa", name = "r", descriptor = "I")
	public int anInt3129;

	@OriginalMember(owner = "client!gfa", name = "v", descriptor = "I")
	public int anInt3133;

	@OriginalMember(owner = "client!gfa", name = "p", descriptor = "I")
	public int anInt3128 = -1;

	@OriginalMember(owner = "client!gfa", name = "n", descriptor = "Z")
	public boolean aBoolean227 = false;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(I)V")
	public Class2_Sub14(@OriginalArg(0) int arg0) {
		this.anInt3128 = arg0;
	}
}
