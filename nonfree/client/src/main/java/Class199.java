import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class199 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
	public int anInt5496;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
	public int anInt5497;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
	public int anInt5502;

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "Lclient!qe;")
	public Class199 aClass199_2;

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "Lclient!c;")
	public Class31 aClass31_4;

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
	public final int anInt5505;

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
	public final int anInt5506;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(II)V")
	public Class199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5505 = arg1;
		this.anInt5506 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!qe;I)V")
	public Class199(@OriginalArg(0) Class199 arg0, @OriginalArg(1) int arg1) {
		this.aClass199_2 = arg0;
		this.anInt5505 = arg1 + this.aClass199_2.anInt5505;
		this.anInt5506 = this.aClass199_2.anInt5506;
		this.aClass31_4 = this.aClass199_2.aClass31_4;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Lclient!sq;")
	public Class228 method4353() {
		return Static103.method1478(this.anInt5506);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)Lclient!qe;")
	public Class199 method4354(@OriginalArg(1) int arg0) {
		return new Class199(this.anInt5506, arg0);
	}
}
