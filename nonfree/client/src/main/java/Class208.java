import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public final class Class208 {

	@OriginalMember(owner = "client!np", name = "m", descriptor = "I")
	public final int anInt5964;

	@OriginalMember(owner = "client!np", name = "j", descriptor = "I")
	public final int anInt5962;

	@OriginalMember(owner = "client!np", name = "k", descriptor = "I")
	public final int anInt5963;

	@OriginalMember(owner = "client!np", name = "e", descriptor = "I")
	public final int anInt5959;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(IIII)V")
	public Class208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5964 = arg0;
		this.anInt5962 = arg1;
		this.anInt5963 = arg3;
		this.anInt5959 = arg2;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Lclient!np;")
	public Class208 method5049(@OriginalArg(1) int arg0) {
		return new Class208(this.anInt5964, arg0, this.anInt5959, this.anInt5963);
	}
}
