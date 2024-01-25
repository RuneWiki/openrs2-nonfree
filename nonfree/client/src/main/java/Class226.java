import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public final class Class226 {

	@OriginalMember(owner = "client!mca", name = "k", descriptor = "I")
	public final int anInt5502;

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "I")
	public final int anInt5494;

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "I")
	public final int anInt5493;

	@OriginalMember(owner = "client!mca", name = "j", descriptor = "I")
	public final int anInt5501;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(IIII)V")
	public Class226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5502 = arg0;
		this.anInt5494 = arg3;
		this.anInt5493 = arg1;
		this.anInt5501 = arg2;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZI)Lclient!mca;")
	public Class226 method4837(@OriginalArg(1) int arg0) {
		return new Class226(this.anInt5502, arg0, this.anInt5501, this.anInt5494);
	}
}
