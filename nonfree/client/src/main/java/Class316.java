import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class316 implements Interface7 {

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "Lclient!oa;")
	private Class66 aClass66_15;

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "Z")
	private boolean aBoolean609;

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "Lclient!cca;")
	private final Class48 aClass48_1;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "[Lclient!ut;")
	private final Interface23[] anInterface23Array1;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!cca;Lclient!pfa;)V")
	public Class316(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class267 arg1) {
		this.aClass48_1 = arg0;
		this.anInterface23Array1 = new Interface23[this.aClass48_1.anInterface19Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface23Array1.length; local15++) {
			this.anInterface23Array1[local15] = arg1.method5860(this.aClass48_1.anInterface19Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)I")
	@Override
	public int method7203() {
		return this.aClass48_1.anInt967;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method7199(@OriginalArg(1) long arg0) {
		return (long) this.aClass48_1.anInt965 + arg0 <= Static184.method3422();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7200(@OriginalArg(0) boolean arg0) {
		@Pc(15) Interface23[] local15 = this.anInterface23Array1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Interface23 local23 = local15[local17];
			if (local23 != null) {
				local23.method7805();
			}
		}
		this.aBoolean609 = false;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
	@Override
	public void method7201() {
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)I")
	@Override
	public int method7202() {
		@Pc(7) int local7 = 0;
		@Pc(10) Interface23[] local10 = this.anInterface23Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface23 local18 = local10[local12];
			if (local18 == null || local18.method7806()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface23Array1.length;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V")
	@Override
	public void method7204() {
		if (this.aClass66_15 != Static185.aClass66_14) {
			this.aClass66_15 = Static185.aClass66_14;
			this.aBoolean609 = true;
		}
		this.aClass66_15.D(0);
		@Pc(22) Interface23[] local22 = this.anInterface23Array1;
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Interface23 local30 = local22[local24];
			if (local30 != null) {
				local30.method7804();
			}
		}
	}
}
