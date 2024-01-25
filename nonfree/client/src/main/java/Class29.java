import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public abstract class Class29 implements Interface23 {

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
	private int anInt9500;

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "J")
	private long aLong291;

	@OriginalMember(owner = "client!sj", name = "m", descriptor = "Lclient!ta;")
	private Class91 aClass91_10;

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "Lclient!bi;")
	private final Class31 aClass31_121;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "Lclient!bi;")
	protected final Class31 aClass31_120;

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "Lclient!vn;")
	protected final Class52 aClass52_5;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!bi;Lclient!bi;Lclient!vn;)V")
	protected Class29(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class52 arg2) {
		this.aClass31_121 = arg1;
		this.aClass31_120 = arg0;
		this.aClass52_5 = arg2;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7806() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass31_120.method679(this.aClass52_5.anInt8827)) {
			local5 = false;
		}
		if (!this.aClass31_121.method679(this.aClass52_5.anInt8827)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIZ)V")
	protected abstract void method7807(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)V")
	@Override
	public final void method7805() {
		@Pc(17) int local17 = this.aClass52_5.aClass297_12.method6544(this.aClass52_5.anInt8822, Static9.anInt8933) + this.aClass52_5.anInt8820;
		@Pc(31) int local31 = this.aClass52_5.aClass58_13.method1299(this.aClass52_5.anInt8828, Static576.anInt9547) + this.aClass52_5.anInt8826;
		this.method7812(local31, local17);
		this.method7807(local31, local17);
		@Pc(49) String local49 = Static466.aClass276_1.method6058();
		if (Static184.method3422() - this.aLong291 > 10000L) {
			local49 = local49 + " (" + Static466.aClass276_1.method6066().method4437() + ")";
		}
		this.aClass91_10.method7467(local49, local17 + this.aClass52_5.anInt8822 / 2, local31 + 4 + this.aClass52_5.anInt8828 / 2 + this.aClass52_5.anInt8824, this.aClass52_5.anInt8821, -1);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
	@Override
	public void method7804() {
		@Pc(17) Class196 local17 = Static533.method7421(this.aClass31_121, this.aClass52_5.anInt8827);
		this.aClass91_10 = Static185.aClass66_14.method6829(local17, Static607.method5871(this.aClass31_120, this.aClass52_5.anInt8827));
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(IIIZ)V")
	protected abstract void method7812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)I")
	protected final int method7813() {
		@Pc(16) int local16 = Static466.aClass276_1.method6056();
		@Pc(20) int local20 = local16 * 100;
		if (local16 == this.anInt9500 && local16 != 0) {
			@Pc(44) int local44 = Static466.aClass276_1.method6063();
			if (local16 < local44) {
				@Pc(59) long local59 = this.aLong291 - Static466.aClass276_1.method6065();
				if (local59 > 0L) {
					@Pc(76) long local76 = local59 * 10000L / (long) local16 * (long) (local44 - local16);
					@Pc(86) long local86 = (Static184.method3422() - this.aLong291) * 10000L;
					if (local86 >= local76) {
						local20 = local44 * 100;
					} else {
						local20 = (int) ((long) (local16 * 100) + local86 * (long) (local44 - local16) * 100L / local76);
					}
				}
			}
		} else {
			this.anInt9500 = local16;
			this.aLong291 = Static184.method3422();
		}
		return local20;
	}
}
