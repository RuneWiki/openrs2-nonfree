import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public final class Class254 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
	public int anInt7208;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
	public int anInt7210;

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "Lclient!vc;")
	public Class254 aClass254_2;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "Lclient!c;")
	public Class6 aClass6_4;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
	public int anInt7218;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
	public final int anInt7216;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
	public final int anInt7217;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(II)V")
	public Class254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7216 = arg0;
		this.anInt7217 = arg1;
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!vc;I)V")
	public Class254(@OriginalArg(0) Class254 arg0, @OriginalArg(1) int arg1) {
		this.aClass254_2 = arg0;
		this.anInt7217 = arg1 + this.aClass254_2.anInt7217;
		this.anInt7216 = this.aClass254_2.anInt7216;
		this.aClass6_4 = this.aClass254_2.aClass6_4;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Lclient!vc;")
	public Class254 method5787(@OriginalArg(0) int arg0) {
		return new Class254(this.anInt7216, arg0);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)Lclient!ab;")
	public Class3 method5790() {
		return Static119.method1947(this.anInt7216);
	}
}
