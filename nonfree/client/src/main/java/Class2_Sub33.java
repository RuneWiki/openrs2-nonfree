import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public final class Class2_Sub33 extends Class2 {

	@OriginalMember(owner = "client!se", name = "w", descriptor = "I")
	public final int anInt5921;

	@OriginalMember(owner = "client!se", name = "v", descriptor = "I")
	public final int anInt5920;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(II)V", line = 294)
	public Class2_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5921 = arg1;
		this.anInt5920 = arg0;
	}
}
