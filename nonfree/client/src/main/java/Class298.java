import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Class298 {

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "Lclient!tb;")
	private final Class313 aClass313_47 = new Class313(256);

	@OriginalMember(owner = "client!sda", name = "e", descriptor = "Lclient!en;")
	private final Class100_Sub1 aClass100_Sub1_20;

	@OriginalMember(owner = "client!sda", name = "j", descriptor = "Lclient!fa;")
	private final Interface5 anInterface5_11;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lclient!en;Lclient!fa;)V")
	public Class298(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Interface5 arg1) {
		this.aClass100_Sub1_20 = arg0;
		this.anInterface5_11 = arg1;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V")
	public void method6785() {
		this.aClass313_47.method6982(5);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)Lclient!ls;")
	public Interface14 method6786(@OriginalArg(0) int arg0) {
		@Pc(15) Object local15 = this.aClass313_47.method6989((long) arg0);
		if (local15 != null) {
			return (Interface14) local15;
		} else if (this.anInterface5_11.method914(arg0)) {
			@Pc(34) Class343 local34 = this.anInterface5_11.method917(arg0);
			@Pc(43) int local43 = local34.aBoolean700 ? 64 : this.aClass100_Sub1_20.anInt5762;
			@Pc(80) Interface14 local80;
			if (local34.aBoolean703 && this.aClass100_Sub1_20.method6248()) {
				@Pc(60) float[] local60 = this.anInterface5_11.method913(local43, 0.7F, local43, arg0);
				local80 = this.aClass100_Sub1_20.method4771(local43, local60, Static356.aClass88_11, local34.aByte116 != 0, local43);
			} else {
				@Pc(110) int[] local110 = !local34.aBoolean702 && Static242.method3760(local34.aByte117) ? this.anInterface5_11.method916(arg0, 0.7F, true, local43, local43) : this.anInterface5_11.method915(0.7F, local43, local43, arg0);
				local80 = this.aClass100_Sub1_20.method4838(local43, local34.aByte116 != 0, local43, local110);
			}
			local80.method7067(local34.aBoolean701, local34.aBoolean699);
			this.aClass313_47.method6980((long) arg0, local80);
			return local80;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "(I)V")
	public void method6788() {
		this.aClass313_47.method6977();
	}
}
