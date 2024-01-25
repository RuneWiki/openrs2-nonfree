import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public class Class47 implements Interface23 {

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "Lclient!xa;")
	protected Class66 aClass66_15;

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "Lclient!kc;")
	protected final Class177 aClass177_2;

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "Lclient!jo;")
	private final Class168 aClass168_20;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!jo;Lclient!kc;)V")
	public Class47(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class177 arg1) {
		this.aClass177_2 = arg1;
		this.aClass168_20 = arg0;
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)Z")
	@Override
	public final boolean method8049() {
		return this.aClass168_20.method4427(this.aClass177_2.anInt9731);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
	@Override
	public final void method8048() {
		this.aClass66_15 = Static223.method4015(this.aClass168_20.method4438(this.aClass177_2.anInt9731));
		this.method8047();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8047() {
		@Pc(22) int local22 = this.aClass177_2.aClass148_11.method3982(Static419.anInt7811, this.aClass66_15.AA()) + this.aClass177_2.anInt9733;
		@Pc(37) int local37 = this.aClass177_2.aClass49_14.method1326(Static79.anInt9888, this.aClass66_15.a()) + this.aClass177_2.anInt9729;
		this.aClass66_15.method8066(local22, local37);
	}
}
