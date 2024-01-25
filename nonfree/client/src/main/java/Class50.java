import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class50 {

	@OriginalMember(owner = "client!d", name = "w", descriptor = "[Lclient!fa;")
	private static final Class76[] aClass76Array1 = new Class76[32];

	@OriginalMember(owner = "client!d", name = "a", descriptor = "I")
	public int anInt1127;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "Lclient!nm;")
	public Class28_Sub1 aClass28_Sub1_1;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "Lclient!d;")
	public Class50 aClass50_2;

	static {
		@Pc(108) Class76[] local108 = Static99.method1656();
		for (@Pc(110) int local110 = 0; local110 < local108.length; local110++) {
			aClass76Array1[local108[local110].anInt1930] = local108[local110];
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public void method1009() {
		if (Static390.anInt6088 >= 500) {
			return;
		}
		this.aClass28_Sub1_1 = null;
		this.aClass50_2 = Static121.aClass50_3;
		this.anInt1127 = 0;
		Static121.aClass50_3 = this;
		Static390.anInt6088++;
	}
}
