import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public final class Class110 {

	@OriginalMember(owner = "client!md", name = "h", descriptor = "Z")
	public boolean aBoolean228 = true;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "I")
	public int anInt3168;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "I")
	public int anInt3161;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "I")
	public int anInt3165;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "I")
	public int anInt3162;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "I")
	public int anInt3169;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "I")
	public int anInt3160;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean228 = arg6;
		this.anInt3168 = arg3;
		this.anInt3161 = arg5;
		this.anInt3165 = arg4;
		this.anInt3162 = arg0;
		this.anInt3169 = arg2;
		this.anInt3160 = arg1;
	}
}
