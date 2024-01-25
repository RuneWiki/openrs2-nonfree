import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public final class Class287 {

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
	public int anInt7570;

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
	public int anInt7571;

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
	public int anInt7572;

	@OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
	public int anInt7573;

	@OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
	public int anInt7577;

	@OriginalMember(owner = "client!pw", name = "j", descriptor = "I")
	public int anInt7579;

	@OriginalMember(owner = "client!pw", name = "l", descriptor = "I")
	public int anInt7581;

	@OriginalMember(owner = "client!pw", name = "n", descriptor = "I")
	public int anInt7583;

	@OriginalMember(owner = "client!pw", name = "o", descriptor = "I")
	public int anInt7584;

	@OriginalMember(owner = "client!pw", name = "p", descriptor = "I")
	public int anInt7585;

	@OriginalMember(owner = "client!pw", name = "q", descriptor = "I")
	public int anInt7586;

	@OriginalMember(owner = "client!pw", name = "r", descriptor = "I")
	public int anInt7587;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZLclient!pw;)Z")
	public boolean method6316(@OriginalArg(1) Class287 arg0) {
		return arg0.anInt7571 == this.anInt7571 && arg0.anInt7579 == this.anInt7579 && this.anInt7584 == arg0.anInt7584;
	}
}
