import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class145 implements Interface6 {

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "Lclient!la;")
	private Class35 aClass35_5;

	@OriginalMember(owner = "client!hu", name = "i", descriptor = "Lclient!ga;")
	private final Class111 aClass111_44;

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "Lclient!ga;")
	private final Class111 aClass111_43;

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "Lclient!nga;")
	private final Class226 aClass226_1;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!ga;Lclient!ga;Lclient!nga;)V")
	public Class145(@OriginalArg(0) Class111 arg0, @OriginalArg(1) Class111 arg1, @OriginalArg(2) Class226 arg2) {
		this.aClass111_44 = arg1;
		this.aClass111_43 = arg0;
		this.aClass226_1 = arg2;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
	@Override
	public void method6804() {
		@Pc(15) Class13 local15 = Static252.method7834(this.aClass111_44, this.aClass226_1.anInt6189);
		this.aClass35_5 = Static136.aClass12_8.method6457(local15, Static604.method7069(this.aClass111_43, this.aClass226_1.anInt6189));
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6805() {
		@Pc(10) boolean local10 = true;
		if (!this.aClass111_43.method2434(this.aClass226_1.anInt6189)) {
			local10 = false;
		}
		if (!this.aClass111_44.method2434(this.aClass226_1.anInt6189)) {
			local10 = false;
		}
		return local10;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6803() {
		@Pc(19) int local19 = this.aClass226_1.aClass314_8.method7035(this.aClass226_1.anInt6190, Static483.anInt8133) + this.aClass226_1.anInt6185;
		@Pc(34) int local34 = this.aClass226_1.aClass103_15.method2391(this.aClass226_1.anInt6180, Static443.anInt7712) + this.aClass226_1.anInt6179;
		this.aClass35_5.method4952(this.aClass226_1.anInt6190, local34, null, this.aClass226_1.aString64, null, this.aClass226_1.anInt6181, 0, 0, this.aClass226_1.anInt6180, this.aClass226_1.anInt6188, this.aClass226_1.anInt6187, null, local19, this.aClass226_1.anInt6184, this.aClass226_1.anInt6183);
	}
}
