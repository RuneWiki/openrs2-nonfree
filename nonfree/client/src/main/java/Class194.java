import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class194 {

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
	public final int anInt5152;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
	public final int anInt5147;

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
	public final int anInt5148;

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
	public final int anInt5151;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(IIII)V")
	public Class194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5152 = arg3;
		this.anInt5147 = arg2;
		this.anInt5148 = arg1;
		this.anInt5151 = arg0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)Lclient!pm;")
	public Class194 method4076(@OriginalArg(1) int arg0) {
		return new Class194(this.anInt5151, arg0, this.anInt5147, this.anInt5152);
	}
}
