import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public abstract class Class72 implements Interface12 {

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
	private int anInt5324;

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "Lclient!la;")
	private Class64 aClass64_9;

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "J")
	private long aLong171;

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "Lclient!pu;")
	private final Class270 aClass270_61;

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "Lclient!pu;")
	protected final Class270 aClass270_62;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "Lclient!tfa;")
	protected final Class54 aClass54_5;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!pu;Lclient!pu;Lclient!tfa;)V")
	protected Class72(@OriginalArg(0) Class270 arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) Class54 arg2) {
		this.aClass270_61 = arg1;
		this.aClass270_62 = arg0;
		this.aClass54_5 = arg2;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)I")
	protected final int method4318() {
		@Pc(9) int local9 = Static521.aClass163_1.method3470();
		@Pc(13) int local13 = local9 * 100;
		if (this.anInt5324 == local9 && local9 != 0) {
			@Pc(39) int local39 = Static521.aClass163_1.method3458();
			if (local9 < local39) {
				@Pc(54) long local54 = this.aLong171 - Static521.aClass163_1.method3462();
				if (local54 > 0L) {
					@Pc(71) long local71 = local54 * 10000L / (long) local9 * (long) (local39 - local9);
					@Pc(80) long local80 = (Static413.method5668() - this.aLong171) * 10000L;
					if (local80 < local71) {
						local13 = (int) (local80 * 100L * (long) (local39 - local9) / local71 + (long) (local9 * 100));
					} else {
						local13 = local39 * 100;
					}
				}
			}
		} else {
			this.anInt5324 = local9;
			this.aLong171 = Static413.method5668();
		}
		return local13;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BZ)V")
	@Override
	public final void method4317() {
		@Pc(18) int local18 = this.aClass54_5.aClass335_10.method7396(Static573.anInt9475, this.aClass54_5.anInt4145) + this.aClass54_5.anInt4146;
		@Pc(32) int local32 = this.aClass54_5.aClass122_9.method2394(Static103.anInt2084, this.aClass54_5.anInt4141) + this.aClass54_5.anInt4142;
		this.method4322(local18, local32);
		this.method4321(local32, local18);
		@Pc(56) String local56 = Static521.aClass163_1.method3471();
		if (Static413.method5668() - this.aLong171 > 10000L) {
			local56 = local56 + " (" + Static521.aClass163_1.method3463().method2088() + ")";
		}
		this.aClass64_9.method6605(-1, this.aClass54_5.anInt4139, local18 + this.aClass54_5.anInt4145 / 2, local56, this.aClass54_5.anInt4143 + this.aClass54_5.anInt4141 / 2 + local32 + 4);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
	@Override
	public void method4315() {
		@Pc(16) Class334 local16 = Static423.method5847(this.aClass270_61, this.aClass54_5.anInt4144);
		this.aClass64_9 = Static16.aClass134_1.method6899(local16, Static601.method2075(this.aClass270_62, this.aClass54_5.anInt4144));
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IZII)V")
	protected abstract void method4321(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIZ)V")
	protected abstract void method4322(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4316() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass270_62.method5694(this.aClass54_5.anInt4144)) {
			local5 = false;
		}
		if (!this.aClass270_61.method5694(this.aClass54_5.anInt4144)) {
			local5 = false;
		}
		return local5;
	}
}
