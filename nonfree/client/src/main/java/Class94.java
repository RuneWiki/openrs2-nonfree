import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public abstract class Class94 implements Interface1 {

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
	private int anInt5464;

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "Lclient!la;")
	private Class63 aClass63_7;

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "J")
	private long aLong150;

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "Lclient!ri;")
	private final Class284 aClass284_90;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "Lclient!ri;")
	protected final Class284 aClass284_91;

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "Lclient!rc;")
	protected final Class38 aClass38_5;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!ri;Lclient!ri;Lclient!rc;)V")
	protected Class94(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class284 arg1, @OriginalArg(2) Class38 arg2) {
		this.aClass284_90 = arg1;
		this.aClass284_91 = arg0;
		this.aClass38_5 = arg2;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZIII)V")
	protected abstract void method4388(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)I")
	protected final int method4389() {
		@Pc(14) int local14 = Static372.aClass163_1.method4024();
		@Pc(18) int local18 = local14 * 100;
		if (this.anInt5464 == local14 && local14 != 0) {
			@Pc(40) int local40 = Static372.aClass163_1.method4028();
			if (local14 < local40) {
				@Pc(54) long local54 = this.aLong150 - Static372.aClass163_1.method4025();
				if (local54 > 0L) {
					@Pc(70) long local70 = (long) (local40 - local14) * (local54 * 10000L / (long) local14);
					@Pc(78) long local78 = (Static96.method2000() - this.aLong150) * 10000L;
					if (local78 < local70) {
						local18 = (int) ((long) (local14 * 100) + (long) (local40 - local14) * local78 * 100L / local70);
					} else {
						local18 = local40 * 100;
					}
				}
			}
		} else {
			this.anInt5464 = local14;
			this.aLong150 = Static96.method2000();
		}
		return local18;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZIZ)V")
	protected abstract void method4391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	@Override
	public void method7700() {
		@Pc(11) Class328 local11 = Static410.method5763(this.aClass38_5.anInt8024, this.aClass284_90);
		this.aClass63_7 = Static319.aClass31_11.method8027(local11, Static607.method8164(this.aClass284_91, this.aClass38_5.anInt8024));
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7701() {
		@Pc(11) boolean local11 = true;
		if (!this.aClass284_91.method6347(this.aClass38_5.anInt8024)) {
			local11 = false;
		}
		if (!this.aClass284_90.method6347(this.aClass38_5.anInt8024)) {
			local11 = false;
		}
		return local11;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZI)V")
	@Override
	public final void method7699() {
		@Pc(19) int local19 = this.aClass38_5.aClass154_12.method3814(this.aClass38_5.anInt8020, Static333.anInt6024) + this.aClass38_5.anInt8021;
		@Pc(38) int local38 = this.aClass38_5.aClass201_13.method4868(this.aClass38_5.anInt8019, Static473.anInt8221) + this.aClass38_5.anInt8017;
		this.method4391(local19, local38);
		this.method4388(local19, local38);
		@Pc(54) String local54 = Static372.aClass163_1.method4022();
		if (Static96.method2000() - this.aLong150 > 10000L) {
			local54 = local54 + " (" + Static372.aClass163_1.method4023().method2842() + ")";
		}
		this.aClass63_7.method6878(this.aClass38_5.anInt8022 + this.aClass38_5.anInt8019 / 2 + local38 + 4, -1, this.aClass38_5.anInt8023, local54, local19 + this.aClass38_5.anInt8020 / 2);
	}
}
