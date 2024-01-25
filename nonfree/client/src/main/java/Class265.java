import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class265 {

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "Lclient!oq;")
	public Class265 aClass265_1;

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
	public int anInt7790;

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
	public int anInt7791;

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
	public int anInt7792;

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "Lclient!qja;")
	public Class26 aClass26_10;

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
	public final int anInt7793;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
	public final int anInt7789;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(II)V")
	public Class265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7793 = arg0;
		this.anInt7789 = arg1;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)Lclient!ej;")
	public Class93 method6432() {
		return Static310.method4523(this.anInt7793);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BI)Lclient!oq;")
	public Class265 method6433(@OriginalArg(1) int arg0) {
		return new Class265(this.anInt7793, arg0);
	}
}
