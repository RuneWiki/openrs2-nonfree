import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public final class Class146_Sub3 extends Class146 {

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "Lclient!dea;")
	public final Class34_Sub2_Sub1 aClass34_Sub2_Sub1_5;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!us;II[B)V")
	public Class146_Sub3(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass34_Sub2_Sub1_5 = Static57.method1110(arg1, arg2, arg0, arg3);
		this.aClass34_Sub2_Sub1_5.method1964(false, false);
	}
}
