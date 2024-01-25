import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public final class Class4_Sub20 extends Class4 {

	@OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
	public int anInt3078;

	@OriginalMember(owner = "client!ir", name = "o", descriptor = "I")
	public int anInt3079;

	@OriginalMember(owner = "client!ir", name = "q", descriptor = "I")
	public int anInt3080;

	@OriginalMember(owner = "client!ir", name = "z", descriptor = "I")
	public int anInt3084;

	@OriginalMember(owner = "client!ir", name = "A", descriptor = "I")
	public int anInt3085;

	@OriginalMember(owner = "client!ir", name = "u", descriptor = "Z")
	public boolean aBoolean260 = false;

	@OriginalMember(owner = "client!ir", name = "v", descriptor = "I")
	public int anInt3082 = -1;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(I)V")
	public Class4_Sub20(@OriginalArg(0) int arg0) {
		this.anInt3082 = arg0;
	}
}
