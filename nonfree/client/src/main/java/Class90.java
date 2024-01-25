import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public final class Class90 {

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
	public int anInt2971;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "Lclient!q;")
	public Class54 aClass54_5;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "Lclient!fd;")
	public Class90 aClass90_1;

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
	public int anInt2974;

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
	public int anInt2976;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
	public final int anInt2972;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
	public final int anInt2975;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(II)V")
	public Class90(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2972 = arg0;
		this.anInt2975 = arg1;
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!fd;I)V")
	public Class90(@OriginalArg(0) Class90 arg0, @OriginalArg(1) int arg1) {
		this.aClass90_1 = arg0;
		this.anInt2972 = this.aClass90_1.anInt2972;
		this.aClass54_5 = this.aClass90_1.aClass54_5;
		this.anInt2975 = this.aClass90_1.anInt2975 + arg1;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)Lclient!fd;")
	public Class90 method2597(@OriginalArg(1) int arg0) {
		return new Class90(this.anInt2972, arg0);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Lclient!cb;")
	public Class42 method2598() {
		return Static364.method5466(this.anInt2972);
	}
}
