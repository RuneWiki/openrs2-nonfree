import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!pca", name = "e", descriptor = "Lclient!bw;")
	public final Interface2 anInterface2_5;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!lba;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface2_5 = arg0.method7550(arg1, arg2, arg3, false, Static447.aClass265_15);
		this.anInterface2_5.method8901(false, false);
	}

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!lba;II[I)V")
	public Class1_Sub3(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface2_5 = arg0.method7590(arg2, arg1, false, arg3);
		this.anInterface2_5.method8901(false, false);
	}
}
