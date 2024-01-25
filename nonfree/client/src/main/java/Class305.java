import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class305 implements Interface1 {

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "Z")
	private boolean aBoolean640;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "Lclient!ha;")
	private Class101 aClass101_12;

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "Lclient!sga;")
	private final Class333 aClass333_1;

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "[Lclient!jq;")
	private final Interface9[] anInterface9Array1;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!sga;Lclient!ho;)V")
	public Class305(@OriginalArg(0) Class333 arg0, @OriginalArg(1) Class151 arg1) {
		this.aClass333_1 = arg0;
		this.anInterface9Array1 = new Interface9[this.aClass333_1.anInterface27Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface9Array1.length; local15++) {
			this.anInterface9Array1[local15] = arg1.method4177(this.aClass333_1.anInterface27Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
	@Override
	public void method7815() {
		if (Static607.aClass101_15 != this.aClass101_12) {
			this.aClass101_12 = Static607.aClass101_15;
			this.aBoolean640 = true;
		}
		this.aClass101_12.GA(0);
		@Pc(26) Interface9[] local26 = this.anInterface9Array1;
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			@Pc(34) Interface9 local34 = local26[local28];
			if (local34 != null) {
				local34.method7670();
			}
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)I")
	@Override
	public int method7816() {
		@Pc(7) int local7 = 0;
		@Pc(10) Interface9[] local10 = this.anInterface9Array1;
		for (@Pc(18) int local18 = 0; local18 < local10.length; local18++) {
			@Pc(24) Interface9 local24 = local10[local18];
			if (local24 == null || local24.method7668()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface9Array1.length;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
	@Override
	public void method7814() {
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7813(@OriginalArg(1) boolean arg0) {
		@Pc(17) Interface9[] local17 = this.anInterface9Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(25) Interface9 local25 = local17[local19];
			if (local25 != null) {
				local25.method7669();
			}
		}
		this.aBoolean640 = false;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)I")
	@Override
	public int method7812() {
		return this.aClass333_1.anInt9480;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(JZ)Z")
	@Override
	public boolean method7817(@OriginalArg(0) long arg0) {
		return Static99.method1701() >= (long) this.aClass333_1.anInt9485 + arg0;
	}
}
