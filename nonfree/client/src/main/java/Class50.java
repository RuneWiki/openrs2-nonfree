import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public abstract class Class50 implements Interface24 {

	@OriginalMember(owner = "client!us", name = "e", descriptor = "Lclient!la;")
	private Class54 aClass54_13;

	@OriginalMember(owner = "client!us", name = "i", descriptor = "I")
	private int anInt8166;

	@OriginalMember(owner = "client!us", name = "m", descriptor = "J")
	private long aLong239;

	@OriginalMember(owner = "client!us", name = "j", descriptor = "Lclient!tf;")
	private final Class322 aClass322_137;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "Lclient!tf;")
	protected final Class322 aClass322_136;

	@OriginalMember(owner = "client!us", name = "k", descriptor = "Lclient!dd;")
	protected final Class65 aClass65_5;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!tf;Lclient!tf;Lclient!dd;)V")
	protected Class50(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Class322 arg1, @OriginalArg(2) Class65 arg2) {
		this.aClass322_137 = arg1;
		this.aClass322_136 = arg0;
		this.aClass65_5 = arg2;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IZIZ)V")
	protected abstract void method6781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIZ)V")
	protected abstract void method6782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
	@Override
	public void method6872() {
		@Pc(18) Class134 local18 = Static149.method2843(this.aClass65_5.anInt5459, this.aClass322_137);
		this.aClass54_13 = Static505.aClass45_11.method7394(local18, Static604.method6158(this.aClass322_136, this.aClass65_5.anInt5459));
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI)V")
	@Override
	public final void method6873() {
		@Pc(20) int local20 = this.aClass65_5.aClass63_16.method1678(Static245.anInt4333, this.aClass65_5.anInt5462) + this.aClass65_5.anInt5457;
		@Pc(42) int local42 = this.aClass65_5.aClass249_16.method5777(this.aClass65_5.anInt5461, Static66.anInt1531) + this.aClass65_5.anInt5460;
		this.method6781(local42, local20);
		this.method6782(local42, local20);
		@Pc(60) String local60 = Static143.aClass275_1.method6095();
		if (Static158.method2936() - this.aLong239 > 10000L) {
			local60 = local60 + " (" + Static143.aClass275_1.method6099().method3631() + ")";
		}
		this.aClass54_13.method7803(local60, this.aClass65_5.anInt5458, -1, this.aClass65_5.anInt5461 / 2 + local42 + this.aClass65_5.anInt5463 + 4, local20 - -(this.aClass65_5.anInt5462 / 2));
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(B)I")
	protected final int method6783() {
		@Pc(16) int local16 = Static143.aClass275_1.method6094();
		@Pc(20) int local20 = local16 * 100;
		if (local16 == this.anInt8166 && local16 != 0) {
			@Pc(46) int local46 = Static143.aClass275_1.method6097();
			if (local16 < local46) {
				@Pc(57) long local57 = this.aLong239 - Static143.aClass275_1.method6098();
				if (local57 > 0L) {
					@Pc(76) long local76 = local57 * 10000L / (long) local16 * (long) (local46 - local16);
					@Pc(85) long local85 = (Static158.method2936() - this.aLong239) * 10000L;
					if (local76 <= local85) {
						local20 = local46 * 100;
					} else {
						local20 = (int) ((long) (local46 - local16) * local85 * 100L / local76 + (long) (local16 * 100));
					}
				}
			}
		} else {
			this.anInt8166 = local16;
			this.aLong239 = Static158.method2936();
		}
		return local20;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6871() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass322_136.method6797(this.aClass65_5.anInt5459)) {
			local5 = false;
		}
		if (!this.aClass322_137.method6797(this.aClass65_5.anInt5459)) {
			local5 = false;
		}
		return local5;
	}
}
