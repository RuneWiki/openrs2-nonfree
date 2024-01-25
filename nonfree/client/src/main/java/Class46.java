import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public abstract class Class46 implements Interface5 {

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "J")
	private long aLong255;

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "Lclient!da;")
	private Class70 aClass70_12;

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
	private int anInt8701;

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "Lclient!gda;")
	protected final Class126 aClass126_251;

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "Lclient!gda;")
	private final Class126 aClass126_250;

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "Lclient!gm;")
	protected final Class132 aClass132_5;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!gda;Lclient!gda;Lclient!gm;)V")
	protected Class46(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) Class132 arg2) {
		this.aClass126_251 = arg0;
		this.aClass126_250 = arg1;
		this.aClass132_5 = arg2;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)I")
	protected final int method7488() {
		@Pc(15) int local15 = Static510.aClass216_1.method4931();
		@Pc(19) int local19 = local15 * 100;
		if (local15 == this.anInt8701 && local15 != 0) {
			@Pc(49) int local49 = Static510.aClass216_1.method4938();
			if (local15 < local49) {
				@Pc(59) long local59 = this.aLong255 - Static510.aClass216_1.method4941();
				if (local59 > 0L) {
					@Pc(78) long local78 = local59 * 10000L / (long) local15 * (long) (local49 - local15);
					@Pc(87) long local87 = (Static480.method6763() - this.aLong255) * 10000L;
					if (local78 <= local87) {
						local19 = local49 * 100;
					} else {
						local19 = (int) ((long) (local49 - local15) * local87 * 100L / local78 + (long) (local15 * 100));
					}
				}
			}
		} else {
			this.anInt8701 = local15;
			this.aLong255 = Static480.method6763();
		}
		return local19;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIIZ)V")
	protected abstract void method7489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8564() {
		@Pc(16) boolean local16 = true;
		if (!this.aClass126_251.method3077(this.aClass132_5.anInt10383)) {
			local16 = false;
		}
		if (!this.aClass126_250.method3077(this.aClass132_5.anInt10383)) {
			local16 = false;
		}
		return local16;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZII)V")
	protected abstract void method7491(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZZ)V")
	@Override
	public final void method8562() {
		@Pc(18) int local18 = this.aClass132_5.aClass189_13.method4461(Static592.anInt9548, this.aClass132_5.anInt10377) + this.aClass132_5.anInt10380;
		@Pc(32) int local32 = this.aClass132_5.aClass346_14.method7688(this.aClass132_5.anInt10374, Static401.anInt6745) + this.aClass132_5.anInt10382;
		this.method7489(local18, local32);
		this.method7491(local32, local18);
		@Pc(56) String local56 = Static510.aClass216_1.method4936();
		if (Static480.method6763() - this.aLong255 > 10000L) {
			local56 = local56 + " (" + Static510.aClass216_1.method4939().method774() + ")";
		}
		this.aClass70_12.method8434(this.aClass132_5.anInt10374 / 2 + local32 + this.aClass132_5.anInt10373 + 4, -1, local18 - -(this.aClass132_5.anInt10377 / 2), this.aClass132_5.anInt10378, local56);
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V")
	@Override
	public void method8563() {
		@Pc(11) Class196 local11 = Static321.method4907(this.aClass126_250, this.aClass132_5.anInt10383);
		this.aClass70_12 = Static273.aClass100_6.method8612(local11, Static692.method8270(this.aClass126_251, this.aClass132_5.anInt10383));
	}
}
