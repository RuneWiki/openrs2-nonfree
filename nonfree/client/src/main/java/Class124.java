import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public abstract class Class124 implements Interface27 {

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "J")
	private long aLong204;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
	private int anInt7746;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Lclient!da;")
	private Class63 aClass63_12;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "Lclient!uu;")
	private final Class343 aClass343_214;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "Lclient!cv;")
	protected final Class35 aClass35_5;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "Lclient!uu;")
	protected final Class343 aClass343_213;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!uu;Lclient!uu;Lclient!cv;)V")
	protected Class124(@OriginalArg(0) Class343 arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) Class35 arg2) {
		this.aClass343_214 = arg1;
		this.aClass35_5 = arg2;
		this.aClass343_213 = arg0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	@Override
	public void method8107() {
		@Pc(11) Class93 local11 = Static382.method6021(this.aClass35_5.anInt9045, this.aClass343_214);
		this.aClass63_12 = Static266.aClass82_8.method6127(local11, Static656.method6341(this.aClass343_213, this.aClass35_5.anInt9045));
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZII)V")
	protected abstract void method6753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8109() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass343_213.method8138(this.aClass35_5.anInt9045)) {
			local5 = false;
		}
		if (!this.aClass343_214.method8138(this.aClass35_5.anInt9045)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BZ)V")
	@Override
	public final void method8108() {
		@Pc(17) int local17 = this.aClass35_5.aClass293_11.method7212(Static623.anInt9971, this.aClass35_5.anInt9053) + this.aClass35_5.anInt9052;
		@Pc(32) int local32 = this.aClass35_5.aClass15_12.method259(this.aClass35_5.anInt9046, Static269.anInt5258) + this.aClass35_5.anInt9054;
		this.method6753(local32, local17);
		this.method6755(local32, local17);
		@Pc(53) String local53 = Static369.aClass302_1.method7396();
		if (Static191.method3071() - this.aLong204 > 10000L) {
			local53 = local53 + " (" + Static369.aClass302_1.method7392().method1252() + ")";
		}
		this.aClass63_12.method7754(local53, local32 + this.aClass35_5.anInt9046 / 2 + this.aClass35_5.anInt9050 + 4, this.aClass35_5.anInt9055, -1, this.aClass35_5.anInt9053 / 2 + local17);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIZB)V")
	protected abstract void method6755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)I")
	protected final int method6756() {
		@Pc(9) int local9 = Static369.aClass302_1.method7398();
		@Pc(13) int local13 = local9 * 100;
		if (this.anInt7746 == local9 && local9 != 0) {
			@Pc(36) int local36 = Static369.aClass302_1.method7390();
			if (local9 < local36) {
				@Pc(46) long local46 = this.aLong204 - Static369.aClass302_1.method7394();
				if (local46 > 0L) {
					@Pc(62) long local62 = local46 * 10000L / (long) local9 * (long) (local36 - local9);
					@Pc(71) long local71 = (Static191.method3071() - this.aLong204) * 10000L;
					if (local62 <= local71) {
						local13 = local36 * 100;
					} else {
						local13 = (int) ((long) (local9 * 100) + local71 * (long) (local36 - local9) * 100L / local62);
					}
				}
			}
		} else {
			this.anInt7746 = local9;
			this.aLong204 = Static191.method3071();
		}
		return local13;
	}
}
