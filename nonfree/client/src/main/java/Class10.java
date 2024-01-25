import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public abstract class Class10 implements Interface13 {

	@OriginalMember(owner = "client!afa", name = "j", descriptor = "J")
	private long aLong259;

	@OriginalMember(owner = "client!afa", name = "o", descriptor = "Lclient!da;")
	private Class62 aClass62_14;

	@OriginalMember(owner = "client!afa", name = "p", descriptor = "I")
	private int anInt9806;

	@OriginalMember(owner = "client!afa", name = "f", descriptor = "Lclient!la;")
	private final Class196 aClass196_128;

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "Lclient!ada;")
	protected final Class6 aClass6_5;

	@OriginalMember(owner = "client!afa", name = "e", descriptor = "Lclient!la;")
	protected final Class196 aClass196_127;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!ada;)V")
	protected Class10(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class6 arg2) {
		this.aClass196_128 = arg1;
		this.aClass6_5 = arg2;
		this.aClass196_127 = arg0;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)V")
	@Override
	public void method8396() {
		@Pc(11) Class282 local11 = Static95.method2093(this.aClass196_128, this.aClass6_5.anInt2439);
		this.aClass62_14 = Static323.aClass5_9.method7515(local11, Static645.method2768(this.aClass196_127, this.aClass6_5.anInt2439));
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8398() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass196_127.method5111(this.aClass6_5.anInt2439)) {
			local5 = false;
		}
		if (!this.aClass196_128.method5111(this.aClass6_5.anInt2439)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IBIZ)V")
	protected abstract void method8401(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZB)V")
	@Override
	public final void method8397() {
		@Pc(18) int local18 = this.aClass6_5.aClass83_8.method2416(Static612.anInt9912, this.aClass6_5.anInt2440) + this.aClass6_5.anInt2442;
		@Pc(33) int local33 = this.aClass6_5.aClass50_7.method1701(this.aClass6_5.anInt2436, Static90.anInt2181) + this.aClass6_5.anInt2443;
		this.method8404(local18, local33);
		this.method8401(local33, local18);
		@Pc(57) String local57 = Static101.aClass59_1.method1965();
		if (Static374.method6036() - this.aLong259 > 10000L) {
			local57 = local57 + " (" + Static101.aClass59_1.method1957().method7732() + ")";
		}
		this.aClass62_14.method8363(-1, this.aClass6_5.anInt2436 / 2 + local33 + this.aClass6_5.anInt2437 + 4, local18 + this.aClass6_5.anInt2440 / 2, local57, this.aClass6_5.anInt2444);
	}

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "(B)I")
	protected final int method8402() {
		@Pc(11) int local11 = Static101.aClass59_1.method1961();
		@Pc(15) int local15 = local11 * 100;
		if (local11 == this.anInt9806 && local11 != 0) {
			@Pc(43) int local43 = Static101.aClass59_1.method1955();
			if (local11 < local43) {
				@Pc(53) long local53 = this.aLong259 - Static101.aClass59_1.method1960();
				if (local53 > 0L) {
					@Pc(72) long local72 = local53 * 10000L / (long) local11 * (long) (local43 - local11);
					@Pc(81) long local81 = (Static374.method6036() - this.aLong259) * 10000L;
					if (local72 > local81) {
						local15 = (int) ((long) (local11 * 100) + (long) (local43 - local11) * 100L * local81 / local72);
					} else {
						local15 = local43 * 100;
					}
				}
			}
		} else {
			this.anInt9806 = local11;
			this.aLong259 = Static374.method6036();
		}
		return local15;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZIII)V")
	protected abstract void method8404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
