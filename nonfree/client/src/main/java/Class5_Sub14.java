import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public final class Class5_Sub14 extends Class5 {

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
	public final int anInt2237;

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
	public final int anInt2238;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(II)V")
	public Class5_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2237 = arg1;
		this.anInt2238 = arg0;
	}
}
