import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!du", name = "s", descriptor = "I")
	public int anInt1503;

	@OriginalMember(owner = "client!du", name = "p", descriptor = "I")
	public final int anInt1501;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(II)V")
	public Class1_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1503 = arg1;
		this.anInt1501 = arg0;
	}
}
