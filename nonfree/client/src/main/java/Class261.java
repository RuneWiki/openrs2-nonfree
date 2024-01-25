import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public final class Class261 {

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
	public final int anInt7578;

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
	public final int anInt7579;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
	public final int anInt7577;

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
	public final int anInt7575;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IIII)V")
	public Class261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7578 = arg2;
		this.anInt7579 = arg0;
		this.anInt7577 = arg3;
		this.anInt7575 = arg1;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)Lclient!ol;")
	public Class261 method6454(@OriginalArg(1) int arg0) {
		return new Class261(this.anInt7579, arg0, this.anInt7578, this.anInt7577);
	}
}
