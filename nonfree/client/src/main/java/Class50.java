import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public class Class50 implements Interface4 {

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "Lclient!f;")
	protected Class46 aClass46_8;

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "Lclient!wn;")
	protected final Class91 aClass91_2;

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "Lclient!om;")
	private final Class246 aClass246_100;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!om;Lclient!wn;)V")
	public Class50(@OriginalArg(0) Class246 arg0, @OriginalArg(1) Class91 arg1) {
		this.aClass91_2 = arg1;
		this.aClass246_100 = arg0;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method7790() {
		return this.aClass246_100.method5667(this.aClass91_2.anInt2863);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
	@Override
	public final void method7789() {
		this.aClass46_8 = Static292.method4651(this.aClass246_100, this.aClass91_2.anInt2863);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7788() {
		@Pc(25) int local25 = this.aClass91_2.aClass300_5.method6502(this.aClass46_8.A(), Static1.anInt7) + this.aClass91_2.anInt2858;
		@Pc(40) int local40 = this.aClass91_2.aClass140_2.method3723(Static283.anInt2480, this.aClass46_8.ca()) + this.aClass91_2.anInt2857;
		this.aClass46_8.method7606(local25, local40);
	}
}
