import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public final class Class204_Sub1 extends Class204 {

	@OriginalMember(owner = "client!lda", name = "j", descriptor = "Lclient!ot;")
	public final Class40_Sub3_Sub1 aClass40_Sub3_Sub1_4;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lclient!ok;II[B)V")
	public Class204_Sub1(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass40_Sub3_Sub1_4 = Static295.method4129(arg2, arg1, arg3, arg0);
		this.aClass40_Sub3_Sub1_4.method5391(false, false);
	}
}
