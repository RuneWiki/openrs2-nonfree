import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class56 implements Interface23 {

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "Lclient!ha;")
	private Class67 aClass67_3;

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "Z")
	private boolean aBoolean125;

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "Lclient!dg;")
	private final Class69 aClass69_1;

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "[Lclient!kg;")
	private final Interface14[] anInterface14Array1;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!dg;Lclient!tca;)V")
	public Class56(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class351 arg1) {
		this.aClass69_1 = arg0;
		this.anInterface14Array1 = new Interface14[this.aClass69_1.anInterface18Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface14Array1.length; local15++) {
			this.anInterface14Array1[local15] = arg1.method8307(this.aClass69_1.anInterface18Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V")
	@Override
	public void method8327() {
		if (this.aClass67_3 != Static488.aClass67_12) {
			this.aBoolean125 = true;
			this.aClass67_3 = Static488.aClass67_12;
		}
		this.aClass67_3.GA(0);
		@Pc(31) Interface14[] local31 = this.anInterface14Array1;
		for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
			@Pc(39) Interface14 local39 = local31[local33];
			if (local39 != null) {
				local39.method8745();
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8326(@OriginalArg(0) boolean arg0) {
		@Pc(10) Interface14[] local10 = this.anInterface14Array1;
		for (@Pc(20) int local20 = 0; local20 < local10.length; local20++) {
			@Pc(26) Interface14 local26 = local10[local20];
			if (local26 != null) {
				local26.method8743();
			}
		}
		this.aBoolean125 = false;
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)I")
	@Override
	public int method8330() {
		return this.aClass69_1.anInt2194;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method8328(@OriginalArg(0) long arg0) {
		return (long) this.aClass69_1.anInt2196 + arg0 <= Static626.method8479();
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)I")
	@Override
	public int method8331() {
		@Pc(15) int local15 = 0;
		@Pc(18) Interface14[] local18 = this.anInterface14Array1;
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Interface14 local26 = local18[local20];
			if (local26 == null || local26.method8744()) {
				local15++;
			}
		}
		return local15 * 100 / this.anInterface14Array1.length;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	@Override
	public void method8329() {
	}
}
