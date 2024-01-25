import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class4_Sub32 extends Class4 {

	@OriginalMember(owner = "client!on", name = "k", descriptor = "I")
	public int anInt7357 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!on", name = "j", descriptor = "I")
	public int anInt7356 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!on", name = "p", descriptor = "I")
	public int anInt7362 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!on", name = "n", descriptor = "I")
	public int anInt7360 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!on", name = "m", descriptor = "I")
	public int anInt7359 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!on", name = "q", descriptor = "I")
	public int anInt7363 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!on", name = "o", descriptor = "I")
	public int anInt7361 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!on", name = "r", descriptor = "I")
	public int anInt7364 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!on", name = "t", descriptor = "Lclient!ff;")
	public final Class4_Sub17 aClass4_Sub17_1;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!ff;)V")
	public Class4_Sub32(@OriginalArg(0) Class4_Sub17 arg0) {
		this.aClass4_Sub17_1 = arg0;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(III)Z")
	public boolean method6073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt7359 <= arg0 && arg0 <= this.anInt7363 && arg1 >= this.anInt7357 && this.anInt7364 >= arg1) {
			return true;
		} else {
			return arg0 >= this.anInt7356 && arg0 <= this.anInt7362 && arg1 >= this.anInt7361 && arg1 <= this.anInt7360;
		}
	}
}
