import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public class Class227 implements Interface6 {

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "Lclient!f;")
	protected Class10 aClass10_34;

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "Lclient!ga;")
	private final Class111 aClass111_100;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "Lclient!tba;")
	protected final Class251 aClass251_2;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!ga;Lclient!tba;)V")
	public Class227(@OriginalArg(0) Class111 arg0, @OriginalArg(1) Class251 arg1) {
		this.aClass111_100 = arg0;
		this.aClass251_2 = arg1;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)Z")
	@Override
	public final boolean method6805() {
		return this.aClass111_100.method2434(this.aClass251_2.anInt6885);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6803() {
		@Pc(16) int local16 = this.aClass251_2.aClass314_12.method7035(this.aClass10_34.A(), Static483.anInt8133) + this.aClass251_2.anInt6883;
		@Pc(30) int local30 = this.aClass251_2.aClass103_18.method2391(this.aClass10_34.ca(), Static443.anInt7712) + this.aClass251_2.anInt6884;
		this.aClass10_34.method7679(local16, local30);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	@Override
	public final void method6804() {
		this.aClass10_34 = Static543.method7365(this.aClass111_100, this.aClass251_2.anInt6885);
	}
}
