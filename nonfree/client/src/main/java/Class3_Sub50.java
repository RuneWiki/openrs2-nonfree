import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public final class Class3_Sub50 extends Class3 {

	@OriginalMember(owner = "client!tha", name = "j", descriptor = "I")
	public final int anInt9937;

	@OriginalMember(owner = "client!tha", name = "m", descriptor = "I")
	public int anInt9936;

	@OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(II)V")
	public Class3_Sub50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9937 = arg0;
		this.anInt9936 = arg1;
	}
}
