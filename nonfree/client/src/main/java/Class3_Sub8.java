import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
	public int anInt1151;

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
	public int anInt1152;

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
	public int anInt1153;

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
	public int anInt1154;

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
	public int anInt1155;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "Z")
	public boolean aBoolean94 = false;

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
	public int anInt1157 = -1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
	public Class3_Sub8(@OriginalArg(0) int arg0) {
		this.anInt1157 = arg0;
	}
}
