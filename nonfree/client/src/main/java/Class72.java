import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public abstract class Class72 implements Interface6 {

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Lclient!la;")
	private Class35 aClass35_9;

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "J")
	private long aLong261;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
	private int anInt6019;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "Lclient!ga;")
	private final Class111 aClass111_79;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Lclient!ga;")
	protected final Class111 aClass111_80;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "Lclient!mga;")
	protected final Class175 aClass175_5;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!ga;Lclient!ga;Lclient!mga;)V")
	protected Class72(@OriginalArg(0) Class111 arg0, @OriginalArg(1) Class111 arg1, @OriginalArg(2) Class175 arg2) {
		this.aClass111_79 = arg1;
		this.aClass111_80 = arg0;
		this.aClass175_5 = arg2;
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)I")
	protected final int method5059() {
		@Pc(9) int local9 = Static137.aClass260_1.method5800();
		@Pc(22) int local22 = local9 * 100;
		if (local9 == this.anInt6019 && local9 != 0) {
			@Pc(35) int local35 = Static137.aClass260_1.method5792();
			if (local35 > local9) {
				@Pc(46) long local46 = this.aLong261 - Static137.aClass260_1.method5788();
				if (local46 > 0L) {
					@Pc(63) long local63 = local46 * 10000L / (long) local9 * (long) (local35 - local9);
					@Pc(72) long local72 = (Static255.method4035() - this.aLong261) * 10000L;
					if (local72 < local63) {
						local22 = (int) (local72 * (long) (local35 - local9) * 100L / local63 + (long) (local9 * 100));
					} else {
						local22 = local35 * 100;
					}
				}
			}
		} else {
			this.anInt6019 = local9;
			this.aLong261 = Static255.method4035();
		}
		return local22;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BZII)V")
	protected abstract void method5060(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	@Override
	public void method6804() {
		@Pc(11) Class13 local11 = Static252.method7834(this.aClass111_79, this.aClass175_5.anInt9463);
		this.aClass35_9 = Static136.aClass12_8.method6457(local11, Static604.method7069(this.aClass111_80, this.aClass175_5.anInt9463));
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZB)V")
	@Override
	public final void method6803() {
		@Pc(27) int local27 = this.aClass175_5.aClass314_13.method7035(this.aClass175_5.anInt9468, Static483.anInt8133) + this.aClass175_5.anInt9466;
		@Pc(41) int local41 = this.aClass175_5.aClass103_20.method2391(this.aClass175_5.anInt9476, Static443.anInt7712) + this.aClass175_5.anInt9470;
		this.method5061(local27, local41);
		this.method5060(local41, local27);
		@Pc(57) String local57 = Static137.aClass260_1.method5789();
		if (Static255.method4035() - this.aLong261 > 10000L) {
			local57 = local57 + " (" + Static137.aClass260_1.method5793().method7664() + ")";
		}
		this.aClass35_9.method4942(-1, this.aClass175_5.anInt9468 / 2 + local27, this.aClass175_5.anInt9474, local57, this.aClass175_5.anInt9477 + this.aClass175_5.anInt9476 / 2 + local41 + 4);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZIBI)V")
	protected abstract void method5061(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6805() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass111_80.method2434(this.aClass175_5.anInt9463)) {
			local5 = false;
		}
		if (!this.aClass111_79.method2434(this.aClass175_5.anInt9463)) {
			local5 = false;
		}
		return local5;
	}
}
