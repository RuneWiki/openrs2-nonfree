import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public final class Class84_Sub2 extends Class84 {

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "Lclient!fj;")
	public final Interface11 anInterface11_2;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!um;II[B)V")
	public Class84_Sub2(@OriginalArg(0) Class162_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface11_2 = arg0.method3863(arg3, arg1, false, Static398.aClass366_10, arg2);
		this.anInterface11_2.method7639(false, false);
	}

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!um;II[I)V")
	public Class84_Sub2(@OriginalArg(0) Class162_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface11_2 = arg0.method3904(arg2, arg1, false, arg3);
		this.anInterface11_2.method7639(false, false);
	}
}
