import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public final class Class3_Sub14 extends Class3 {

	@OriginalMember(owner = "client!i", name = "p", descriptor = "I")
	public int anInt2096;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "I")
	public int anInt2098;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(II)V")
	public Class3_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2096 = arg1;
		this.anInt2098 = arg0;
	}
}
