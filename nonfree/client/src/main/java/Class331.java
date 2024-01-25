import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public final class Class331 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Lclient!aa;")
	public final Class1 aClass1_1;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "[I")
	public final int[] anIntArray523;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
	public final int[] anIntArray524;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	public final int anInt9432;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	public final int anInt9431;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(II[I[ILclient!aa;)V")
	public Class331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class1 arg4) {
		this.aClass1_1 = arg4;
		this.anIntArray523 = arg2;
		this.anIntArray524 = arg3;
		this.anInt9432 = arg0;
		this.anInt9431 = arg1;
	}
}
