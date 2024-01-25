import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public final class Class2_Sub49 extends Class2 {

	@OriginalMember(owner = "client!tw", name = "k", descriptor = "I")
	public final int anInt9263;

	@OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
	public final int anInt9262;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(II)V")
	public Class2_Sub49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9263 = arg1;
		this.anInt9262 = arg0;
	}
}
