import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public final class Class2_Sub28 extends Class2 {

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
	public int anInt5515;

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "[Lclient!sm;")
	public Class160[] aClass160Array2;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I[Lclient!sm;)V")
	public Class2_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) Class160[] arg1) {
		this.anInt5515 = arg0;
		this.aClass160Array2 = arg1;
	}
}
