import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!as", name = "g", descriptor = "Lclient!dh;")
	public final Class44_Sub1_Sub1 aClass44_Sub1_Sub1_1;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!nf;II[B)V")
	public Class15_Sub1(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass44_Sub1_Sub1_1 = Static358.method1074(arg3, arg0, arg1, arg2);
		this.aClass44_Sub1_Sub1_1.method1072(false, false);
	}
}
