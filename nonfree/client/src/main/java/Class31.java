import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public final class Class31 {

	@OriginalMember(owner = "client!bca", name = "j", descriptor = "[I")
	public final int[] anIntArray28;

	@OriginalMember(owner = "client!bca", name = "g", descriptor = "Lclient!aa;")
	public final Class1 aClass1_1;

	@OriginalMember(owner = "client!bca", name = "f", descriptor = "[I")
	public final int[] anIntArray29;

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "I")
	public final int anInt541;

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "I")
	public final int anInt542;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(II[I[ILclient!aa;)V")
	public Class31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class1 arg4) {
		this.anIntArray28 = arg3;
		this.aClass1_1 = arg4;
		this.anIntArray29 = arg2;
		this.anInt541 = arg0;
		this.anInt542 = arg1;
	}
}
