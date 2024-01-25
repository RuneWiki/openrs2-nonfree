import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public final class Class3_Sub40 extends Class3 {

	@OriginalMember(owner = "client!ut", name = "n", descriptor = "I")
	public int anInt6018;

	@OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
	public final int anInt6017;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(II)V")
	public Class3_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6018 = arg1;
		this.anInt6017 = arg0;
	}
}
