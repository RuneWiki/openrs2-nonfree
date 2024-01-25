import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public final class Class3_Sub50 extends Class3 {

	@OriginalMember(owner = "client!wba", name = "q", descriptor = "I")
	public final int anInt10096;

	@OriginalMember(owner = "client!wba", name = "o", descriptor = "I")
	public final int anInt10094;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(II)V")
	public Class3_Sub50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10096 = arg1;
		this.anInt10094 = arg0;
	}
}
