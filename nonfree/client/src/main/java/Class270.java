import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class270 {

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
	public int anInt7314;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
	public int anInt7320;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
	public int anInt7321;

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "Lclient!qg;")
	public Class270 aClass270_2;

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "Lclient!q;")
	public Class68 aClass68_6;

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
	public final int anInt7315;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
	public final int anInt7311;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(II)V")
	public Class270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7315 = arg0;
		this.anInt7311 = arg1;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)Lclient!qg;")
	public Class270 method6127(@OriginalArg(0) int arg0) {
		return new Class270(this.anInt7315, arg0);
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)Lclient!vj;")
	public Class349 method6130() {
		return Static185.method7626(this.anInt7315);
	}
}
