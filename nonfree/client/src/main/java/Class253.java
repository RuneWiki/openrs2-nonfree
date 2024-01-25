import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public final class Class253 {

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
	public final int anInt6796;

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
	public final int anInt6797;

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
	public final int anInt6798;

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
	public final int anInt6800;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IIII)V")
	public Class253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6796 = arg2;
		this.anInt6797 = arg3;
		this.anInt6798 = arg1;
		this.anInt6800 = arg0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)Lclient!ol;")
	public Class253 method5685(@OriginalArg(1) int arg0) {
		return new Class253(this.anInt6800, arg0, this.anInt6796, this.anInt6797);
	}
}
