import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class347 implements Interface23 {

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "Lclient!kq;")
	private final Class189 aClass189_1;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!kq;)V")
	public Class347(@OriginalArg(0) Class189 arg0) {
		this.aClass189_1 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8049() {
		return true;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8047() {
		@Pc(5) Class73 local5 = Static489.aClass73_5;
		@Pc(17) int local17 = this.aClass189_1.aClass49_7.method1326(Static79.anInt9888, 12) + this.aClass189_1.anInt5389;
		@Pc(29) int local29 = this.aClass189_1.aClass148_6.method3982(Static419.anInt7811, 0) + this.aClass189_1.anInt5388;
		if (this.aClass189_1.aClass148_6 == Static413.aClass148_9) {
			local5.method7888(this.aClass189_1.aString63, this.aClass189_1.anInt5386, this.aClass189_1.anInt5387, local29, local17);
		} else if (Static58.aClass148_1 == this.aClass189_1.aClass148_6) {
			local5.method7892(local29, local17, this.aClass189_1.aString63, this.aClass189_1.anInt5386, this.aClass189_1.anInt5387);
		} else if (this.aClass189_1.aClass148_6 == Static246.aClass148_4) {
			local5.method7893(local29, this.aClass189_1.anInt5387, this.aClass189_1.aString63, this.aClass189_1.anInt5386, local17);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
	@Override
	public void method8048() {
	}
}
