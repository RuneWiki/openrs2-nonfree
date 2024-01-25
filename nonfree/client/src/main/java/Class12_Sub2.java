import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public final class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!am", name = "m", descriptor = "I")
	public int anInt257 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!am", name = "p", descriptor = "I")
	public int anInt259 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!am", name = "q", descriptor = "I")
	public int anInt260 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!am", name = "r", descriptor = "I")
	public int anInt261 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!am", name = "s", descriptor = "I")
	public int anInt262 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!am", name = "u", descriptor = "I")
	public int anInt264 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!am", name = "t", descriptor = "I")
	public int anInt263 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!am", name = "w", descriptor = "I")
	public int anInt265 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!am", name = "o", descriptor = "Lclient!du;")
	public final Class12_Sub12 aClass12_Sub12_1;

	static {
		new Class88(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!du;)V")
	public Class12_Sub2(@OriginalArg(0) Class12_Sub12 arg0) {
		this.aClass12_Sub12_1 = arg0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BII)Z")
	public boolean method380(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt264 <= arg1 && arg1 <= this.anInt261 && this.anInt263 <= arg0 && arg0 <= this.anInt257) {
			return true;
		} else {
			return this.anInt262 <= arg1 && this.anInt260 >= arg1 && this.anInt265 <= arg0 && arg0 <= this.anInt259;
		}
	}
}
