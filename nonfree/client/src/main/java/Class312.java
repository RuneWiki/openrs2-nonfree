import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public final class Class312 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
	public int anInt8756;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
	public int anInt8757;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
	public int anInt8759;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
	public int anInt8760;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
	public int anInt8761;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
	public int anInt8763;

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
	public int anInt8764;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
	public int anInt8765;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
	public int anInt8766;

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
	public int anInt8767;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
	public int anInt8768;

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
	public int anInt8769;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!tc;I)Z")
	public boolean method6843(@OriginalArg(0) Class312 arg0) {
		return arg0.anInt8757 == this.anInt8757 && arg0.anInt8769 == this.anInt8769 && this.anInt8764 == arg0.anInt8764;
	}
}
