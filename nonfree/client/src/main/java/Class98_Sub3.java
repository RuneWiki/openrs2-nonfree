import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class98_Sub3 extends Class98 {

	@OriginalMember(owner = "client!on", name = "e", descriptor = "Lclient!mn;")
	public final Class114_Sub1_Sub1 aClass114_Sub1_Sub1_5;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!no;II[B)V")
	public Class98_Sub3(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass114_Sub1_Sub1_5 = Static443.method6271(arg2, arg1, arg0, arg3);
		this.aClass114_Sub1_Sub1_5.method5008(false, false);
	}
}
