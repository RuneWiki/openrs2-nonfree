import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public final class Class84_Sub3 extends Class84 {

	@OriginalMember(owner = "client!kba", name = "j", descriptor = "Lclient!ei;")
	public final Class3_Sub1_Sub1 aClass3_Sub1_Sub1_1;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lclient!uca;II[B)V")
	public Class84_Sub3(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass3_Sub1_Sub1_1 = Static62.method1079(arg2, arg1, arg0, arg3);
		this.aClass3_Sub1_Sub1_1.method1720(false, false);
	}
}
