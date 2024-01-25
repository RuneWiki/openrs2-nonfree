import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public abstract class Class222 implements Interface4 {

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "[Lclient!sk;")
	public static final Class309[] aClass309Array5 = new Class309[5];

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
	private int anInt8024;

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "Lclient!la;")
	private Class117 aClass117_10;

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "J")
	private long aLong232;

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "Lclient!om;")
	protected final Class246 aClass246_236;

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "Lclient!om;")
	private final Class246 aClass246_237;

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "Lclient!fga;")
	protected final Class94 aClass94_5;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass309Array5.length; local4++) {
			aClass309Array5[local4] = new Class309();
		}
	}

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!om;Lclient!om;Lclient!fga;)V")
	protected Class222(@OriginalArg(0) Class246 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class94 arg2) {
		this.aClass246_236 = arg0;
		this.aClass246_237 = arg1;
		this.aClass94_5 = arg2;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
	@Override
	public void method7789() {
		@Pc(15) Class58 local15 = Static213.method3761(this.aClass94_5.anInt8269, this.aClass246_237);
		this.aClass117_10 = Static4.aClass43_1.method7139(local15, Static606.method7589(this.aClass246_236, this.aClass94_5.anInt8269));
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIZI)V")
	protected abstract void method6781(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIZ)V")
	protected abstract void method6783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7790() {
		@Pc(11) boolean local11 = true;
		if (!this.aClass246_236.method5667(this.aClass94_5.anInt8269)) {
			local11 = false;
		}
		if (!this.aClass246_237.method5667(this.aClass94_5.anInt8269)) {
			local11 = false;
		}
		return local11;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZZ)V")
	@Override
	public final void method7788() {
		@Pc(18) int local18 = this.aClass94_5.aClass300_13.method6502(this.aClass94_5.anInt8263, Static1.anInt7) + this.aClass94_5.anInt8266;
		@Pc(33) int local33 = this.aClass94_5.aClass140_15.method3723(Static283.anInt2480, this.aClass94_5.anInt8262) + this.aClass94_5.anInt8265;
		this.method6781(local18, local33);
		this.method6783(local18, local33);
		@Pc(49) String local49 = Static268.aClass366_1.method7794();
		if (Static587.method7753() - this.aLong232 > 10000L) {
			local49 = local49 + " (" + Static268.aClass366_1.method7801().method6260() + ")";
		}
		this.aClass117_10.method7655(this.aClass94_5.anInt8262 / 2 + local33 + this.aClass94_5.anInt8268 + 4, -1, local18 + this.aClass94_5.anInt8263 / 2, local49, this.aClass94_5.anInt8267);
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(B)I")
	protected final int method6786() {
		@Pc(17) int local17 = Static268.aClass366_1.method7804();
		@Pc(21) int local21 = local17 * 100;
		if (this.anInt8024 == local17 && local17 != 0) {
			@Pc(35) int local35 = Static268.aClass366_1.method7799();
			if (local35 > local17) {
				@Pc(49) long local49 = this.aLong232 - Static268.aClass366_1.method7805();
				if (local49 > 0L) {
					@Pc(65) long local65 = local49 * 10000L / (long) local17 * (long) (local35 - local17);
					@Pc(73) long local73 = (Static587.method7753() - this.aLong232) * 10000L;
					if (local65 <= local73) {
						local21 = local35 * 100;
					} else {
						local21 = (int) (local73 * 100L * (long) (local35 - local17) / local65 + (long) (local17 * 100));
					}
				}
			}
		} else {
			this.anInt8024 = local17;
			this.aLong232 = Static587.method7753();
		}
		return local21;
	}
}
