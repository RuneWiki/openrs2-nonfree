import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public abstract class Class210 implements Interface12 {

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "Lclient!la;")
	private Class29 aClass29_14;

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "J")
	private long aLong233;

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
	private int anInt8441;

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "Lclient!iea;")
	protected final Class9 aClass9_5;

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "Lclient!pl;")
	private final Class259 aClass259_157;

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "Lclient!pl;")
	protected final Class259 aClass259_156;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!pl;Lclient!pl;Lclient!iea;)V")
	protected Class210(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) Class9 arg2) {
		this.aClass9_5 = arg2;
		this.aClass259_157 = arg1;
		this.aClass259_156 = arg0;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7015() {
		@Pc(12) boolean local12 = true;
		if (!this.aClass259_156.method5988(this.aClass9_5.anInt5027)) {
			local12 = false;
		}
		if (!this.aClass259_157.method5988(this.aClass9_5.anInt5027)) {
			local12 = false;
		}
		return local12;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
	@Override
	public void method7014() {
		@Pc(15) Class294 local15 = Static461.method6506(this.aClass259_157, this.aClass9_5.anInt5027);
		this.aClass29_14 = Static307.aClass100_6.method6225(local15, Static596.method248(this.aClass259_156, this.aClass9_5.anInt5027));
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIZI)V")
	protected abstract void method7019(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(IIZI)V")
	protected abstract void method7020(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZI)V")
	@Override
	public final void method7013() {
		@Pc(19) int local19 = this.aClass9_5.aClass62_10.method1173(Static26.anInt651, this.aClass9_5.anInt5034) + this.aClass9_5.anInt5035;
		@Pc(33) int local33 = this.aClass9_5.aClass279_9.method6456(Static554.anInt9119, this.aClass9_5.anInt5030) + this.aClass9_5.anInt5029;
		this.method7019(local19, local33);
		this.method7020(local33, local19);
		@Pc(54) String local54 = Static527.aClass175_1.method3945();
		if (Static548.method7437() - this.aLong233 > 10000L) {
			local54 = local54 + " (" + Static527.aClass175_1.method3944().method4549() + ")";
		}
		this.aClass29_14.method7118(this.aClass9_5.anInt5031, local19 + this.aClass9_5.anInt5034 / 2, -1, this.aClass9_5.anInt5032 + this.aClass9_5.anInt5030 / 2 + local33 - -4, local54);
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)I")
	protected final int method7022() {
		@Pc(16) int local16 = Static527.aClass175_1.method3947();
		@Pc(20) int local20 = local16 * 100;
		if (local16 == this.anInt8441 && local16 != 0) {
			@Pc(34) int local34 = Static527.aClass175_1.method3946();
			if (local16 < local34) {
				@Pc(49) long local49 = this.aLong233 - Static527.aClass175_1.method3941();
				if (local49 > 0L) {
					@Pc(68) long local68 = local49 * 10000L / (long) local16 * (long) (local34 - local16);
					@Pc(79) long local79 = (Static548.method7437() - this.aLong233) * 10000L;
					if (local68 <= local79) {
						local20 = local34 * 100;
					} else {
						local20 = (int) ((long) (local16 * 100) + local79 * (long) (local34 - local16) * 100L / local68);
					}
				}
			}
		} else {
			this.anInt8441 = local16;
			this.aLong233 = Static548.method7437();
		}
		return local20;
	}
}
