import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public abstract class Class100 implements Interface7 {

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Lclient!ta;")
	private Class92 aClass92_12;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "J")
	private long aLong180;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	private int anInt6500;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "Lclient!au;")
	protected final Class18 aClass18_5;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "Lclient!pfa;")
	protected final Class251 aClass251_87;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_86;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!pfa;Lclient!pfa;Lclient!au;)V")
	protected Class100(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Class18 arg2) {
		this.aClass18_5 = arg2;
		this.aClass251_87 = arg0;
		this.aClass251_86 = arg1;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	@Override
	public void method7570() {
		@Pc(11) Class327 local11 = Static18.method427(this.aClass18_5.anInt6641, this.aClass251_86);
		this.aClass92_12 = Static240.aClass14_7.method6854(local11, Static604.method3618(this.aClass251_87, this.aClass18_5.anInt6641));
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)I")
	protected final int method5520() {
		@Pc(13) int local13 = Static509.aClass236_6.method5509();
		@Pc(17) int local17 = local13 * 100;
		if (local13 == this.anInt6500 && local13 != 0) {
			@Pc(30) int local30 = Static509.aClass236_6.method5514();
			if (local30 > local13) {
				@Pc(41) long local41 = this.aLong180 - Static509.aClass236_6.method5515();
				if (local41 > 0L) {
					@Pc(58) long local58 = (long) (local30 - local13) * (local41 * 10000L / (long) local13);
					@Pc(67) long local67 = (Static8.method201() - this.aLong180) * 10000L;
					if (local58 <= local67) {
						local17 = local30 * 100;
					} else {
						local17 = (int) ((long) (local13 * 100) + (long) (local30 - local13) * 100L * local67 / local58);
					}
				}
			}
		} else {
			this.anInt6500 = local13;
			this.aLong180 = Static8.method201();
		}
		return local17;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZBII)V")
	protected abstract void method5521(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZZ)V")
	protected abstract void method5522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7572() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass251_87.method5782(this.aClass18_5.anInt6641)) {
			local5 = false;
		}
		if (!this.aClass251_86.method5782(this.aClass18_5.anInt6641)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZB)V")
	@Override
	public final void method7571() {
		@Pc(21) int local21 = this.aClass18_5.aClass319_12.method7077(Static592.anInt9585, this.aClass18_5.anInt6645) + this.aClass18_5.anInt6642;
		@Pc(35) int local35 = this.aClass18_5.aClass247_12.method5723(Static579.anInt9514, this.aClass18_5.anInt6643) + this.aClass18_5.anInt6646;
		this.method5522(local35, local21);
		this.method5521(local21, local35);
		@Pc(51) String local51 = Static509.aClass236_6.method5513();
		if (Static8.method201() - this.aLong180 > 10000L) {
			local51 = local51 + " (" + Static509.aClass236_6.method5510().method4392() + ")";
		}
		this.aClass92_12.method6387(this.aClass18_5.anInt6645 / 2 + local21, local51, this.aClass18_5.anInt6640, -1, this.aClass18_5.anInt6639 + local35 + this.aClass18_5.anInt6643 / 2 + 4);
	}
}
