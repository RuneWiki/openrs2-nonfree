import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class Class209 {

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
	public int anInt6543;

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
	public int anInt6546;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
	public int anInt6547;

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
	public int anInt6548;

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
	public int anInt6549;

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
	public int anInt6551;

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
	public int anInt6552;

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
	public int anInt6554;

	@OriginalMember(owner = "client!sm", name = "t", descriptor = "Lclient!sm;")
	public Class209 aClass209_2;

	@OriginalMember(owner = "client!sm", name = "w", descriptor = "I")
	public int anInt6559;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "B")
	public final byte aByte87;

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
	public final int anInt6557;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
	private final int anInt6553;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
	public final int anInt6544;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
	public final int anInt6545;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(IIIIB)V")
	public Class209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte87 = arg4;
		this.anInt6557 = arg2;
		this.anInt6553 = arg0;
		this.anInt6544 = arg3;
		this.anInt6545 = arg1;
	}

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!sm;I)V")
	public Class209(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1) {
		this.aClass209_2 = arg0;
		this.aByte87 = this.aClass209_2.aByte87;
		this.anInt6553 = this.aClass209_2.anInt6553;
		this.anInt6544 = this.aClass209_2.anInt6544 + arg1;
		this.anInt6557 = arg1 + this.aClass209_2.anInt6557;
		this.anInt6545 = arg1 + this.aClass209_2.anInt6545;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIII)Lclient!sm;")
	public Class209 method5148(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class209(this.anInt6553, arg0, arg2, arg1, this.aByte87);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)Lclient!tv;")
	public Class230 method5149() {
		return Static117.method2134(this.anInt6553);
	}
}
