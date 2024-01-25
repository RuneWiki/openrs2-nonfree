import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public final class Class243 {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
	public int anInt7531;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "Lclient!ql;")
	public Class154 aClass154_7;

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
	public int anInt7533;

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
	public int anInt7534;

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "Lclient!ol;")
	public Class243 aClass243_2;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
	public final int anInt7535;

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
	public final int anInt7539;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(II)V")
	public Class243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7535 = arg0;
		this.anInt7539 = arg1;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)Lclient!fl;")
	public Class103 method6506() {
		return Static424.method6658(this.anInt7535);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Lclient!ol;")
	public Class243 method6507(@OriginalArg(0) int arg0) {
		return new Class243(this.anInt7535, arg0);
	}
}
