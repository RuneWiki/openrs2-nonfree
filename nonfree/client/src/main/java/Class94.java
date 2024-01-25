import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public final class Class94 {

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "Lclient!gq;")
	public Class94 aClass94_1;

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
	public int anInt2883;

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
	public int anInt2885;

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
	public int anInt2886;

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "Lclient!gs;")
	public Class5 aClass5_1;

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
	public final int anInt2880;

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
	public final int anInt2879;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(II)V")
	public Class94(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2880 = arg1;
		this.anInt2879 = arg0;
	}

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!gq;I)V")
	public Class94(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1) {
		this.aClass94_1 = arg0;
		this.anInt2880 = this.aClass94_1.anInt2880 + arg1;
		this.anInt2879 = this.aClass94_1.anInt2879;
		this.aClass5_1 = this.aClass94_1.aClass5_1;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)Lclient!dj;")
	public Class49 method2406() {
		return Static92.method1653(this.anInt2879);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)Lclient!gq;")
	public Class94 method2408(@OriginalArg(0) int arg0) {
		return new Class94(this.anInt2879, arg0);
	}
}
