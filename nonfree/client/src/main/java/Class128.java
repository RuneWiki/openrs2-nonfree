import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public abstract class Class128 implements Interface21 {

	@OriginalMember(owner = "client!mba", name = "f", descriptor = "J")
	private long aLong120;

	@OriginalMember(owner = "client!mba", name = "i", descriptor = "I")
	private int anInt4833;

	@OriginalMember(owner = "client!mba", name = "l", descriptor = "Lclient!da;")
	private Class73 aClass73_9;

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "Lclient!wm;")
	protected final Class390 aClass390_62;

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "Lclient!wm;")
	private final Class390 aClass390_63;

	@OriginalMember(owner = "client!mba", name = "g", descriptor = "Lclient!af;")
	protected final Class10 aClass10_5;

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!wm;Lclient!wm;Lclient!af;)V")
	protected Class128(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) Class10 arg2) {
		this.aClass390_62 = arg0;
		this.aClass390_63 = arg1;
		this.aClass10_5 = arg2;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZI)V")
	@Override
	public final void method7886() {
		@Pc(18) int local18 = this.aClass10_5.aClass275_17.method6449(Static613.anInt10005, this.aClass10_5.anInt10594) + this.aClass10_5.anInt10597;
		@Pc(33) int local33 = this.aClass10_5.aClass81_17.method2034(Static10.anInt152, this.aClass10_5.anInt10595) + this.aClass10_5.anInt10602;
		this.method4081(local18, local33);
		this.method4084(local18, local33);
		@Pc(51) String local51 = Static471.aClass352_41.method8265();
		if (Static547.method7619() - this.aLong120 > 10000L) {
			local51 = local51 + " (" + Static471.aClass352_41.method8258().method6132() + ")";
		}
		this.aClass73_9.method5781(local51, local33 + this.aClass10_5.anInt10595 / 2 + this.aClass10_5.anInt10598 + 4, local18 + this.aClass10_5.anInt10594 / 2, -1, this.aClass10_5.anInt10596);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIIZ)V")
	protected abstract void method4081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)V")
	@Override
	public void method7888() {
		@Pc(11) Class247 local11 = Static331.method5104(this.aClass390_63, this.aClass10_5.anInt10601);
		this.aClass73_9 = Static208.aClass65_7.method6886(local11, Static689.method8546(this.aClass390_62, this.aClass10_5.anInt10601));
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IZZI)V")
	protected abstract void method4084(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7887() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass390_62.method8905(this.aClass10_5.anInt10601)) {
			local5 = false;
		}
		if (!this.aClass390_63.method8905(this.aClass10_5.anInt10601)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)I")
	protected final int method4085() {
		@Pc(9) int local9 = Static471.aClass352_41.method8257();
		@Pc(13) int local13 = local9 * 100;
		if (local9 == this.anInt4833 && local9 != 0) {
			@Pc(23) int local23 = Static471.aClass352_41.method8262();
			if (local23 > local9) {
				@Pc(37) long local37 = this.aLong120 - Static471.aClass352_41.method8264();
				if (local37 > 0L) {
					@Pc(56) long local56 = local37 * 10000L / (long) local9 * (long) (local23 - local9);
					@Pc(64) long local64 = (Static547.method7619() - this.aLong120) * 10000L;
					if (local56 > local64) {
						local13 = (int) ((long) (local23 - local9) * local64 * 100L / local56 + (long) (local9 * 100));
					} else {
						local13 = local23 * 100;
					}
				}
			}
		} else {
			this.anInt4833 = local9;
			this.aLong120 = Static547.method7619();
		}
		return local13;
	}
}
