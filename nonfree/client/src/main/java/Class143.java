import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class143 {

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "Lclient!hi;")
	public Class143 aClass143_1;

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "Lclient!ofa;")
	public Class117 aClass117_3;

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
	public int anInt3654;

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
	public int anInt3655;

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
	public int anInt3661;

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
	public final int anInt3656;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
	public final int anInt3651;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(II)V")
	public Class143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3656 = arg0;
		this.anInt3651 = arg1;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)Lclient!hi;")
	public Class143 method3228(@OriginalArg(0) int arg0) {
		return new Class143(this.anInt3656, arg0);
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)Lclient!se;")
	public Class313 method3233() {
		return Static584.method8185(this.anInt3656);
	}
}
