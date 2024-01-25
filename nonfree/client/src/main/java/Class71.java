import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public abstract class Class71 implements Interface13 {

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
	private int anInt8152;

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "Lclient!da;")
	private Class72 aClass72_12;

	@OriginalMember(owner = "client!kba", name = "m", descriptor = "J")
	private long aLong252;

	@OriginalMember(owner = "client!kba", name = "j", descriptor = "Lclient!fc;")
	protected final Class110 aClass110_5;

	@OriginalMember(owner = "client!kba", name = "f", descriptor = "Lclient!cb;")
	private final Class50 aClass50_135;

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "Lclient!cb;")
	protected final Class50 aClass50_134;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lclient!cb;Lclient!cb;Lclient!fc;)V")
	protected Class71(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) Class110 arg2) {
		this.aClass110_5 = arg2;
		this.aClass50_135 = arg1;
		this.aClass50_134 = arg0;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIBZ)V")
	protected abstract void method6931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z)V")
	@Override
	public void method8562() {
		@Pc(11) Class198 local11 = Static249.method3522(this.aClass50_135, this.aClass110_5.anInt8732);
		this.aClass72_12 = Static563.aClass143_13.method6194(local11, Static684.method7229(this.aClass50_134, this.aClass110_5.anInt8732));
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZB)V")
	@Override
	public final void method8561() {
		@Pc(25) int local25 = this.aClass110_5.aClass112_16.method2278(Static345.anInt6198, this.aClass110_5.anInt8729) + this.aClass110_5.anInt8734;
		@Pc(40) int local40 = this.aClass110_5.aClass4_11.method49(Static427.anInt10577, this.aClass110_5.anInt8731) + this.aClass110_5.anInt8739;
		this.method6932(local25, local40);
		this.method6931(local40, local25);
		@Pc(56) String local56 = Static459.aClass204_1.method4784();
		if (Static124.method1947() - this.aLong252 > 10000L) {
			local56 = local56 + " (" + Static459.aClass204_1.method4780().method5877() + ")";
		}
		this.aClass72_12.method6919(this.aClass110_5.anInt8733, this.aClass110_5.anInt8729 / 2 + local25, local56, this.aClass110_5.anInt8738 + this.aClass110_5.anInt8731 / 2 + local40 + 4, -1);
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IZII)V")
	protected abstract void method6932(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)I")
	protected final int method6933() {
		@Pc(9) int local9 = Static459.aClass204_1.method4778();
		@Pc(13) int local13 = local9 * 100;
		if (this.anInt8152 == local9 && local9 != 0) {
			@Pc(28) int local28 = Static459.aClass204_1.method4783();
			if (local9 < local28) {
				@Pc(39) long local39 = this.aLong252 - Static459.aClass204_1.method4785();
				if (local39 > 0L) {
					@Pc(58) long local58 = local39 * 10000L / (long) local9 * (long) (local28 - local9);
					@Pc(69) long local69 = (Static124.method1947() - this.aLong252) * 10000L;
					if (local69 < local58) {
						local13 = (int) ((long) (local9 * 100) + local69 * (long) (local28 - local9) * 100L / local58);
					} else {
						local13 = local28 * 100;
					}
				}
			}
		} else {
			this.anInt8152 = local9;
			this.aLong252 = Static124.method1947();
		}
		return local13;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8563() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass50_134.method897(this.aClass110_5.anInt8732)) {
			local5 = false;
		}
		if (!this.aClass50_135.method897(this.aClass110_5.anInt8732)) {
			local5 = false;
		}
		return local5;
	}
}
