import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public abstract class Class12 implements Interface6 {

	@OriginalMember(owner = "client!um", name = "b", descriptor = "I")
	private int anInt7158;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "Lclient!la;")
	private Class96 aClass96_11;

	@OriginalMember(owner = "client!um", name = "f", descriptor = "J")
	private long aLong172;

	@OriginalMember(owner = "client!um", name = "m", descriptor = "Lclient!bf;")
	protected final Class23 aClass23_5;

	@OriginalMember(owner = "client!um", name = "n", descriptor = "Lclient!sea;")
	protected final Class308 aClass308_144;

	@OriginalMember(owner = "client!um", name = "l", descriptor = "Lclient!sea;")
	private final Class308 aClass308_143;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!sea;Lclient!sea;Lclient!bf;)V")
	protected Class12(@OriginalArg(0) Class308 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) Class23 arg2) {
		this.aClass23_5 = arg2;
		this.aClass308_144 = arg0;
		this.aClass308_143 = arg1;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7886() {
		@Pc(12) boolean local12 = true;
		if (!this.aClass308_144.method6538(this.aClass23_5.anInt8311)) {
			local12 = false;
		}
		if (!this.aClass308_143.method6538(this.aClass23_5.anInt8311)) {
			local12 = false;
		}
		return local12;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	@Override
	public void method7888() {
		@Pc(17) Class352 local17 = Static342.method5100(this.aClass23_5.anInt8311, this.aClass308_143);
		this.aClass96_11 = Static31.aClass78_18.method6837(local17, Static604.method6024(this.aClass308_144, this.aClass23_5.anInt8311));
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZZ)V")
	@Override
	public final void method7887() {
		@Pc(24) int local24 = this.aClass23_5.aClass259_12.method5515(this.aClass23_5.anInt8314, Static318.anInt5819) + this.aClass23_5.anInt8315;
		@Pc(38) int local38 = this.aClass23_5.aClass216_12.method4653(this.aClass23_5.anInt8309, Static192.anInt3766) + this.aClass23_5.anInt8308;
		this.method5757(local24, local38);
		this.method5758(local24, local38);
		@Pc(54) String local54 = Static520.aClass247_5.method5330();
		if (Static480.method6650() - this.aLong172 > 10000L) {
			local54 = local54 + " (" + Static520.aClass247_5.method5321().method5315() + ")";
		}
		this.aClass96_11.method7252(-1, local54, this.aClass23_5.anInt8312 + local38 + this.aClass23_5.anInt8309 / 2 + 4, this.aClass23_5.anInt8310, local24 + this.aClass23_5.anInt8314 / 2);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIZI)V")
	protected abstract void method5757(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIIB)V")
	protected abstract void method5758(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)I")
	protected final int method5760() {
		@Pc(17) int local17 = Static520.aClass247_5.method5326();
		@Pc(21) int local21 = local17 * 100;
		if (this.anInt7158 == local17 && local17 != 0) {
			@Pc(43) int local43 = Static520.aClass247_5.method5329();
			if (local17 < local43) {
				@Pc(53) long local53 = this.aLong172 - Static520.aClass247_5.method5322();
				if (local53 > 0L) {
					@Pc(70) long local70 = local53 * 10000L / (long) local17 * (long) (local43 - local17);
					@Pc(79) long local79 = (Static480.method6650() - this.aLong172) * 10000L;
					if (local70 <= local79) {
						local21 = local43 * 100;
					} else {
						local21 = (int) ((long) (local43 - local17) * local79 * 100L / local70 + (long) (local17 * 100));
					}
				}
			}
		} else {
			this.anInt7158 = local17;
			this.aLong172 = Static480.method6650();
		}
		return local21;
	}
}
