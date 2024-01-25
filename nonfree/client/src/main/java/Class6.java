import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public final class Class6 {

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "Lclient!mk;")
	public Class70 aClass70_1;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
	public int anInt84;

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
	public int anInt86;

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "Lclient!ae;")
	public Class6 aClass6_1;

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
	public int anInt90;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
	public final int anInt81;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
	public final int anInt78;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(II)V")
	public Class6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt81 = arg0;
		this.anInt78 = arg1;
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!ae;I)V")
	public Class6(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1) {
		this.aClass6_1 = arg0;
		this.aClass70_1 = this.aClass6_1.aClass70_1;
		this.anInt81 = this.aClass6_1.anInt81;
		this.anInt78 = arg1 + this.aClass6_1.anInt78;
	}
}
