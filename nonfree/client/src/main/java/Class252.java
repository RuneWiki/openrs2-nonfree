import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mla")
public final class Class252 {

	@OriginalMember(owner = "client!mla", name = "i", descriptor = "[I")
	public final int[] anIntArray490;

	@OriginalMember(owner = "client!mla", name = "e", descriptor = "I")
	public final int anInt6388;

	@OriginalMember(owner = "client!mla", name = "g", descriptor = "I")
	public final int anInt6384;

	@OriginalMember(owner = "client!mla", name = "c", descriptor = "[I")
	public final int[] anIntArray489;

	@OriginalMember(owner = "client!mla", name = "b", descriptor = "I")
	public final int anInt6385;

	@OriginalMember(owner = "client!mla", name = "j", descriptor = "Lclient!aa;")
	public final Class1 aClass1_1;

	@OriginalMember(owner = "client!mla", name = "<init>", descriptor = "(II[I[ILclient!aa;I)V")
	public Class252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(5) int arg5) {
		this.anIntArray490 = arg2;
		this.anInt6388 = arg1;
		this.anInt6384 = arg0;
		this.anIntArray489 = arg3;
		this.anInt6385 = arg5;
		this.aClass1_1 = arg4;
	}
}
