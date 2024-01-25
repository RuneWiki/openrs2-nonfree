import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public final class Class4_Sub14 extends Class4 {

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "I")
	public int anInt1542 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
	public int anInt1539 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!dr", name = "r", descriptor = "I")
	public int anInt1544 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
	public int anInt1541 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!dr", name = "q", descriptor = "I")
	public int anInt1543 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!dr", name = "n", descriptor = "I")
	public int anInt1540 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!dr", name = "v", descriptor = "I")
	public int anInt1546 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
	public int anInt1538 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!dr", name = "u", descriptor = "Lclient!aq;")
	public final Class4_Sub3 aClass4_Sub3_1;

	static {
		new Class83("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!aq;)V")
	public Class4_Sub14(@OriginalArg(0) Class4_Sub3 arg0) {
		this.aClass4_Sub3_1 = arg0;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)Z")
	public boolean method1370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= this.anInt1538 && this.anInt1539 >= arg1 && arg0 >= this.anInt1544 && arg0 <= this.anInt1542) {
			return true;
		} else {
			return arg1 >= this.anInt1541 && this.anInt1546 >= arg1 && arg0 >= this.anInt1543 && this.anInt1540 >= arg0;
		}
	}
}
