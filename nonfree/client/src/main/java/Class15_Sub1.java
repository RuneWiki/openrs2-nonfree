import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "Lclient!an;")
	public final Class11_Sub1_Sub1 aClass11_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!po;II[B)V")
	public Class15_Sub1(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass11_Sub1_Sub1_1 = Static356.method390(arg0, arg2, arg3, arg1);
		this.aClass11_Sub1_Sub1_1.method387(false, false);
	}
}
