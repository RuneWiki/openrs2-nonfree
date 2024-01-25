import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public final class Class3_Sub32 extends Class3 {

	@OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
	public final int anInt5999;

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
	public int anInt5994;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(II)V")
	public Class3_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5999 = arg0;
		this.anInt5994 = arg1;
	}
}
