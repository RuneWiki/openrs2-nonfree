import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public final class Class3_Sub42 extends Class3 {

	@OriginalMember(owner = "client!sha", name = "m", descriptor = "I")
	public int anInt9027 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sha", name = "o", descriptor = "I")
	public int anInt9029 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sha", name = "k", descriptor = "I")
	public int anInt9025 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sha", name = "j", descriptor = "I")
	public int anInt9024 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sha", name = "l", descriptor = "I")
	public int anInt9026 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sha", name = "p", descriptor = "I")
	public int anInt9030 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sha", name = "r", descriptor = "I")
	public int anInt9031 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sha", name = "u", descriptor = "I")
	public int anInt9033 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sha", name = "q", descriptor = "Lclient!gba;")
	public final Class3_Sub22 aClass3_Sub22_1;

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lclient!gba;)V")
	public Class3_Sub42(@OriginalArg(0) Class3_Sub22 arg0) {
		this.aClass3_Sub22_1 = arg0;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(BII)Z")
	public boolean method7436(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= this.anInt9033 && this.anInt9026 >= arg1 && this.anInt9024 <= arg0 && this.anInt9030 >= arg0) {
			return true;
		} else {
			return this.anInt9031 <= arg1 && arg1 <= this.anInt9025 && this.anInt9027 <= arg0 && this.anInt9029 >= arg0;
		}
	}
}
