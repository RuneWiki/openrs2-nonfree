import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public final class Class114 {

	@OriginalMember(owner = "client!fda", name = "h", descriptor = "I")
	public final int anInt2887;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "I")
	public final int anInt2885;

	@OriginalMember(owner = "client!fda", name = "k", descriptor = "[I")
	public final int[] anIntArray216;

	@OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
	public final int anInt2886;

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "Lclient!aa;")
	public final Class1 aClass1_1;

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "[I")
	public final int[] anIntArray215;

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(II[I[ILclient!aa;I)V")
	public Class114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(5) int arg5) {
		this.anInt2887 = arg1;
		this.anInt2885 = arg5;
		this.anIntArray216 = arg3;
		this.anInt2886 = arg0;
		this.aClass1_1 = arg4;
		this.anIntArray215 = arg2;
	}
}
