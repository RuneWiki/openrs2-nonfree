import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wga")
public abstract class Class190 implements Interface7 {

	@OriginalMember(owner = "client!wga", name = "i", descriptor = "J")
	private long aLong197;

	@OriginalMember(owner = "client!wga", name = "k", descriptor = "Lclient!da;")
	private Class69 aClass69_12;

	@OriginalMember(owner = "client!wga", name = "m", descriptor = "I")
	private int anInt6960;

	@OriginalMember(owner = "client!wga", name = "g", descriptor = "Lclient!gj;")
	private final Class143 aClass143_100;

	@OriginalMember(owner = "client!wga", name = "l", descriptor = "Lclient!gj;")
	protected final Class143 aClass143_101;

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "Lclient!dl;")
	protected final Class84 aClass84_5;

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Lclient!gj;Lclient!gj;Lclient!dl;)V")
	protected Class190(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class84 arg2) {
		this.aClass143_100 = arg1;
		this.aClass143_101 = arg0;
		this.aClass84_5 = arg2;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7984() {
		@Pc(11) boolean local11 = true;
		if (!this.aClass143_101.method3130(this.aClass84_5.anInt10346)) {
			local11 = false;
		}
		if (!this.aClass143_100.method3130(this.aClass84_5.anInt10346)) {
			local11 = false;
		}
		return local11;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIZ)V")
	protected abstract void method5816(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZI)V")
	@Override
	public final void method7985() {
		@Pc(18) int local18 = this.aClass84_5.aClass92_13.method2199(Static507.anInt8484, this.aClass84_5.anInt10343) + this.aClass84_5.anInt10347;
		@Pc(32) int local32 = this.aClass84_5.aClass65_17.method1786(Static581.anInt9218, this.aClass84_5.anInt10342) + this.aClass84_5.anInt10345;
		this.method5818(local32, local18);
		this.method5816(local32, local18);
		@Pc(50) String local50 = Static12.aClass124_1.method2774();
		if (Static131.method2268() - this.aLong197 > 10000L) {
			local50 = local50 + " (" + Static12.aClass124_1.method2771().method8274() + ")";
		}
		this.aClass69_12.method7467(this.aClass84_5.anInt10343 / 2 + local18, -1, local50, this.aClass84_5.anInt10349, this.aClass84_5.anInt10344 + local32 + this.aClass84_5.anInt10342 / 2 + 4);
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V")
	@Override
	public void method7986() {
		@Pc(15) Class202 local15 = Static199.method8735(this.aClass84_5.anInt10346, this.aClass143_100);
		this.aClass69_12 = Static582.aClass16_12.method8117(local15, Static683.method3281(this.aClass143_101, this.aClass84_5.anInt10346));
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZZII)V")
	protected abstract void method5818(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "(I)I")
	protected final int method5819() {
		@Pc(9) int local9 = Static12.aClass124_1.method2780();
		@Pc(19) int local19 = local9 * 100;
		if (local9 == this.anInt6960 && local9 != 0) {
			@Pc(42) int local42 = Static12.aClass124_1.method2770();
			if (local42 > local9) {
				@Pc(57) long local57 = this.aLong197 - Static12.aClass124_1.method2773();
				if (local57 > 0L) {
					@Pc(76) long local76 = local57 * 10000L / (long) local9 * (long) (local42 - local9);
					@Pc(85) long local85 = (Static131.method2268() - this.aLong197) * 10000L;
					if (local76 > local85) {
						local19 = (int) ((long) (local9 * 100) + (long) (local42 - local9) * 100L * local85 / local76);
					} else {
						local19 = local42 * 100;
					}
				}
			}
		} else {
			this.anInt6960 = local9;
			this.aLong197 = Static131.method2268();
		}
		return local19;
	}
}
