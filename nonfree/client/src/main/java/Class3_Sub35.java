import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public final class Class3_Sub35 extends Class3 {

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
	public int anInt6127;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
	public final int anInt6129;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(II)V")
	public Class3_Sub35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6127 = arg1;
		this.anInt6129 = arg0;
	}
}
