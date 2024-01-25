import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class Class181_Sub1 extends Class181 {

	@OriginalMember(owner = "client!k", name = "j", descriptor = "Lclient!cm;")
	public final Interface5 anInterface5_2;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!nv;II[B)V")
	public Class181_Sub1(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface5_2 = arg0.method6923(Static268.aClass271_7, arg3, arg2, false, arg1);
		this.anInterface5_2.method7314(false, false);
	}

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!nv;II[I)V")
	public Class181_Sub1(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface5_2 = arg0.method6874(false, arg3, arg2, arg1);
		this.anInterface5_2.method7314(false, false);
	}
}
