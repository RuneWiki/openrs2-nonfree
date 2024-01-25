import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public final class Class178 {

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
	public int anInt5410;

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "Lclient!ot;")
	public Class178 aClass178_2;

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "Lclient!ia;")
	public Class106 aClass106_4;

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
	public int anInt5414;

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
	public int anInt5415;

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
	public final int anInt5411;

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
	public final int anInt5412;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(II)V")
	public Class178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5411 = arg1;
		this.anInt5412 = arg0;
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!ot;I)V")
	public Class178(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1) {
		this.aClass178_2 = arg0;
		this.aClass106_4 = this.aClass178_2.aClass106_4;
		this.anInt5412 = this.aClass178_2.anInt5412;
		this.anInt5411 = arg1 + this.aClass178_2.anInt5411;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)Lclient!ot;")
	public Class178 method4371(@OriginalArg(0) int arg0) {
		return new Class178(this.anInt5412, arg0);
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)Lclient!it;")
	public Class115 method4372() {
		return Static142.method2553(this.anInt5412);
	}
}
