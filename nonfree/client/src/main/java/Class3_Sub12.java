import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public final class Class3_Sub12 extends Class3 {

	@OriginalMember(owner = "client!cda", name = "m", descriptor = "I")
	public final int anInt1096;

	@OriginalMember(owner = "client!cda", name = "o", descriptor = "I")
	public final int anInt1098;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(II)V")
	public Class3_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1096 = arg0;
		this.anInt1098 = arg1;
	}
}
