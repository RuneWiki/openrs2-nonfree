import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class39 {

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Z")
	public boolean aBoolean90 = true;

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
	public final int anInt1253;

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
	public final int anInt1256;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
	public final int anInt1248;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
	public final int anInt1252;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
	public final int anInt1246;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
	public final int anInt1249;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1253 = arg4;
		this.anInt1256 = arg0;
		this.anInt1248 = arg3;
		this.anInt1252 = arg2;
		this.aBoolean90 = arg6;
		this.anInt1246 = arg5;
		this.anInt1249 = arg1;
	}
}
