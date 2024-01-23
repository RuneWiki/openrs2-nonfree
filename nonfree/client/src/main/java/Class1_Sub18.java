import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
	public int anInt2809;

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "[Lclient!dl;")
	public Class40[] aClass40Array2;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I[Lclient!dl;)V")
	public Class1_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Class40[] arg1) {
		this.anInt2809 = arg0;
		this.aClass40Array2 = arg1;
	}
}
