import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public final class Class1_Sub36 extends Class1 {

	@OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
	public final int anInt5324;

	@OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
	public final int anInt5323;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(II)V")
	public Class1_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5324 = arg0;
		this.anInt5323 = arg1;
	}
}
