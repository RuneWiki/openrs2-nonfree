import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public final class Class264 {

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
	public final int anInt7104;

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
	public final int anInt7107;

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
	public final int anInt7109;

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
	public final int anInt7105;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(IIII)V")
	public Class264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7104 = arg2;
		this.anInt7107 = arg3;
		this.anInt7109 = arg1;
		this.anInt7105 = arg0;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BI)Lclient!pn;")
	public Class264 method5645(@OriginalArg(1) int arg0) {
		return new Class264(this.anInt7105, arg0, this.anInt7104, this.anInt7107);
	}
}
