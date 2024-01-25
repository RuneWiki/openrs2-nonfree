import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class230 implements Interface15 {

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "Lclient!wu;")
	private final Class349 aClass349_1;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!wu;)V")
	public Class230(@OriginalArg(0) Class349 arg0) {
		this.aClass349_1 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6566() {
		return true;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	@Override
	public void method6567() {
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6565() {
		@Pc(5) Class56 local5 = Static408.aClass56_4;
		@Pc(17) int local17 = this.aClass349_1.aClass137_15.method2982(Static381.anInt6587, 12) + this.aClass349_1.anInt9613;
		@Pc(30) int local30 = this.aClass349_1.aClass277_12.method6409(Static282.anInt4679, 0) + this.aClass349_1.anInt9615;
		if (this.aClass349_1.aClass277_12 == Static315.aClass277_4) {
			local5.method7879(this.aClass349_1.aString121, local30, this.aClass349_1.anInt9612, local17, this.aClass349_1.anInt9614);
		} else if (Static415.aClass277_8 == this.aClass349_1.aClass277_12) {
			local5.method7866(local30, this.aClass349_1.anInt9614, this.aClass349_1.aString121, local17, this.aClass349_1.anInt9612);
		} else if (this.aClass349_1.aClass277_12 == Static330.aClass277_6) {
			local5.method7867(this.aClass349_1.aString121, this.aClass349_1.anInt9614, local17, local30, this.aClass349_1.anInt9612);
		}
	}
}
