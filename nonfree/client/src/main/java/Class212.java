import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public final class Class212 {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
	public int anInt6640;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
	public int anInt6641;

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "Lclient!ic;")
	public Class61 aClass61_6;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
	public int anInt6646;

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "Lclient!wg;")
	public Class212 aClass212_2;

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
	public final int anInt6645;

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
	public final int anInt6648;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(II)V")
	public Class212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6645 = arg0;
		this.anInt6648 = arg1;
	}

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!wg;I)V")
	public Class212(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1) {
		this.aClass212_2 = arg0;
		this.aClass61_6 = this.aClass212_2.aClass61_6;
		this.anInt6645 = this.aClass212_2.anInt6645;
		this.anInt6648 = arg1 + this.aClass212_2.anInt6648;
	}
}
