import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EDDYSTCZ")
public final class Class6 {

	@OriginalMember(owner = "client!EDDYSTCZ", name = "f", descriptor = "Z")
	public boolean aBoolean29 = true;

	@OriginalMember(owner = "client!EDDYSTCZ", name = "a", descriptor = "I")
	public int anInt193;

	@OriginalMember(owner = "client!EDDYSTCZ", name = "b", descriptor = "I")
	public int anInt194;

	@OriginalMember(owner = "client!EDDYSTCZ", name = "c", descriptor = "I")
	public int anInt195;

	@OriginalMember(owner = "client!EDDYSTCZ", name = "d", descriptor = "I")
	public int anInt196;

	@OriginalMember(owner = "client!EDDYSTCZ", name = "e", descriptor = "I")
	public int anInt197;

	@OriginalMember(owner = "client!EDDYSTCZ", name = "g", descriptor = "I")
	public int anInt198;

	@OriginalMember(owner = "client!EDDYSTCZ", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt193 = arg0;
		this.anInt194 = arg1;
		this.anInt195 = arg2;
		this.anInt196 = arg3;
		this.anInt197 = arg4;
		this.anInt198 = arg5;
		this.aBoolean29 = arg6;
	}
}
