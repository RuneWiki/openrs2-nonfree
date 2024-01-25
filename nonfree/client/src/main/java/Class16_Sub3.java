import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public final class Class16_Sub3 extends Class16 {

	@OriginalMember(owner = "client!kfa", name = "g", descriptor = "Lclient!mm;")
	public final Class35_Sub3_Sub1 aClass35_Sub3_Sub1_3;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lclient!pea;II[B)V")
	public Class16_Sub3(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass35_Sub3_Sub1_3 = Static503.method849(arg1, arg2, arg0, arg3);
		this.aClass35_Sub3_Sub1_3.method4857(false, false);
	}
}
