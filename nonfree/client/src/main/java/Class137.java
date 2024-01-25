import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public abstract class Class137 implements Interface14 {

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
	private int anInt10034;

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "J")
	private long aLong274;

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "Lclient!da;")
	private Class62 aClass62_23;

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "Lclient!wia;")
	protected final Class69 aClass69_5;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "Lclient!wu;")
	private final Class380 aClass380_132;

	@OriginalMember(owner = "client!hp", name = "l", descriptor = "Lclient!wu;")
	protected final Class380 aClass380_133;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!wu;Lclient!wu;Lclient!wia;)V")
	protected Class137(@OriginalArg(0) Class380 arg0, @OriginalArg(1) Class380 arg1, @OriginalArg(2) Class69 arg2) {
		this.aClass69_5 = arg2;
		this.aClass380_132 = arg1;
		this.aClass380_133 = arg0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZIII)V")
	protected abstract void method8360(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
	@Override
	public void method8644() {
		@Pc(20) Class256 local20 = Static3.method8590(this.aClass380_132, this.aClass69_5.anInt9613);
		this.aClass62_23 = Static192.aClass95_4.method6956(local20, Static655.method7422(this.aClass380_133, this.aClass69_5.anInt9613));
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BZII)V")
	protected abstract void method8362(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZZ)V")
	@Override
	public final void method8643() {
		@Pc(17) int local17 = this.aClass69_5.aClass361_10.method8101(Static66.anInt10099, this.aClass69_5.anInt9616) + this.aClass69_5.anInt9605;
		@Pc(31) int local31 = this.aClass69_5.aClass306_13.method6899(this.aClass69_5.anInt9604, Static364.anInt5763) + this.aClass69_5.anInt9611;
		this.method8362(local17, local31);
		this.method8360(local31, local17);
		@Pc(47) String local47 = Static77.aClass252_2.method5491();
		if (Static476.method6413() - this.aLong274 > 10000L) {
			local47 = local47 + " (" + Static77.aClass252_2.method5484().method7297() + ")";
		}
		this.aClass62_23.method5691(this.aClass69_5.anInt9616 / 2 + local17, this.aClass69_5.anInt9612, local47, -1, this.aClass69_5.anInt9610 + this.aClass69_5.anInt9604 / 2 + local31 + 4);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8642() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass380_133.method8638(this.aClass69_5.anInt9613)) {
			local5 = false;
		}
		if (!this.aClass380_132.method8638(this.aClass69_5.anInt9613)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)I")
	protected final int method8364() {
		@Pc(9) int local9 = Static77.aClass252_2.method5485();
		@Pc(18) int local18 = local9 * 100;
		if (local9 == this.anInt10034 && local9 != 0) {
			@Pc(32) int local32 = Static77.aClass252_2.method5488();
			if (local9 < local32) {
				@Pc(46) long local46 = this.aLong274 - Static77.aClass252_2.method5490();
				if (local46 > 0L) {
					@Pc(65) long local65 = (long) (local32 - local9) * (local46 * 10000L / (long) local9);
					@Pc(73) long local73 = (Static476.method6413() - this.aLong274) * 10000L;
					if (local65 > local73) {
						local18 = (int) ((long) (local9 * 100) + local73 * (long) (local32 - local9) * 100L / local65);
					} else {
						local18 = local32 * 100;
					}
				}
			}
		} else {
			this.anInt10034 = local9;
			this.aLong274 = Static476.method6413();
		}
		return local18;
	}
}
