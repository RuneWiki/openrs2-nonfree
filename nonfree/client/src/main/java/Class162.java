import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public final class Class162 {

	@OriginalMember(owner = "client!no", name = "d", descriptor = "I")
	public int anInt5041;

	@OriginalMember(owner = "client!no", name = "e", descriptor = "I")
	public int anInt5042;

	@OriginalMember(owner = "client!no", name = "g", descriptor = "I")
	public int anInt5044;

	@OriginalMember(owner = "client!no", name = "i", descriptor = "I")
	public int anInt5046;

	@OriginalMember(owner = "client!no", name = "m", descriptor = "I")
	public int anInt5050;

	@OriginalMember(owner = "client!no", name = "o", descriptor = "I")
	public int anInt5052;

	@OriginalMember(owner = "client!no", name = "q", descriptor = "I")
	public int anInt5054;

	@OriginalMember(owner = "client!no", name = "f", descriptor = "I")
	public int anInt5043 = 128;

	@OriginalMember(owner = "client!no", name = "b", descriptor = "I")
	public int anInt5039 = 128;

	@OriginalMember(owner = "client!no", name = "j", descriptor = "I")
	public int anInt5047;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(I)V")
	public Class162(@OriginalArg(0) int arg0) {
		this.anInt5047 = arg0;
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(IIIIII)V")
	private Class162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5042 = arg4;
		this.anInt5047 = arg0;
		this.anInt5039 = arg1;
		this.anInt5050 = arg3;
		this.anInt5043 = arg2;
		this.anInt5054 = arg5;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)Lclient!no;")
	public Class162 method3852() {
		return new Class162(this.anInt5047, this.anInt5039, this.anInt5043, this.anInt5050, this.anInt5042, this.anInt5054);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!no;)V")
	public void method3857(@OriginalArg(1) Class162 arg0) {
		this.anInt5047 = arg0.anInt5047;
		this.anInt5039 = arg0.anInt5039;
		this.anInt5043 = arg0.anInt5043;
		this.anInt5054 = arg0.anInt5054;
		this.anInt5042 = arg0.anInt5042;
		this.anInt5050 = arg0.anInt5050;
	}
}
