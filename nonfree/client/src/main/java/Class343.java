import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class343 implements Interface27 {

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "Lclient!ha;")
	private Class16 aClass16_13;

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "Z")
	private boolean aBoolean697;

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "Lclient!rm;")
	private final Class311 aClass311_1;

	@OriginalMember(owner = "client!tt", name = "l", descriptor = "[Lclient!ef;")
	private final Interface7[] anInterface7Array1;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!rm;Lclient!hea;)V")
	public Class343(@OriginalArg(0) Class311 arg0, @OriginalArg(1) Class156 arg1) {
		this.aClass311_1 = arg0;
		this.anInterface7Array1 = new Interface7[this.aClass311_1.anInterface9Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface7Array1.length; local15++) {
			this.anInterface7Array1[local15] = arg1.method3414(this.aClass311_1.anInterface9Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)I")
	@Override
	public int method7909() {
		@Pc(7) int local7 = 0;
		@Pc(15) Interface7[] local15 = this.anInterface7Array1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Interface7 local23 = local15[local17];
			if (local23 == null || local23.method7984()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface7Array1.length;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(JB)Z")
	@Override
	public boolean method7913(@OriginalArg(0) long arg0) {
		return Static131.method2268() >= arg0 + (long) this.aClass311_1.anInt8694;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7914(@OriginalArg(1) boolean arg0) {
		@Pc(10) Interface7[] local10 = this.anInterface7Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface7 local18 = local10[local12];
			if (local18 != null) {
				local18.method7985();
			}
		}
		this.aBoolean697 = false;
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)V")
	@Override
	public void method7912() {
		if (Static582.aClass16_12 != this.aClass16_13) {
			this.aBoolean697 = true;
			this.aClass16_13 = Static582.aClass16_12;
		}
		this.aClass16_13.GA(0);
		@Pc(30) Interface7[] local30 = this.anInterface7Array1;
		for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
			@Pc(38) Interface7 local38 = local30[local32];
			if (local38 != null) {
				local38.method7986();
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)I")
	@Override
	public int method7910() {
		return this.aClass311_1.anInt8696;
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V")
	@Override
	public void method7911() {
	}
}
