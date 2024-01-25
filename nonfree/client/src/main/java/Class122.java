import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qga")
public abstract class Class122 implements Interface20 {

	@OriginalMember(owner = "client!qga", name = "j", descriptor = "J")
	private long aLong232;

	@OriginalMember(owner = "client!qga", name = "l", descriptor = "Lclient!da;")
	private Class64 aClass64_13;

	@OriginalMember(owner = "client!qga", name = "m", descriptor = "I")
	private int anInt8445;

	@OriginalMember(owner = "client!qga", name = "n", descriptor = "Lclient!eq;")
	protected final Class97 aClass97_127;

	@OriginalMember(owner = "client!qga", name = "c", descriptor = "Lclient!pd;")
	protected final Class8 aClass8_5;

	@OriginalMember(owner = "client!qga", name = "d", descriptor = "Lclient!eq;")
	private final Class97 aClass97_126;

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lclient!eq;Lclient!eq;Lclient!pd;)V")
	protected Class122(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class8 arg2) {
		this.aClass97_127 = arg0;
		this.aClass8_5 = arg2;
		this.aClass97_126 = arg1;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8023() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass97_127.method2564(this.aClass8_5.anInt5337)) {
			local5 = false;
		}
		if (!this.aClass97_126.method2564(this.aClass8_5.anInt5337)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
	@Override
	public void method8024() {
		@Pc(11) Class114 local11 = Static528.method7370(this.aClass97_126, this.aClass8_5.anInt5337);
		this.aClass64_13 = Static600.aClass87_15.method7965(local11, Static647.method3073(this.aClass97_127, this.aClass8_5.anInt5337));
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Z)I")
	protected final int method7099() {
		@Pc(9) int local9 = Static368.aClass349_2.method8064();
		@Pc(13) int local13 = local9 * 100;
		if (local9 == this.anInt8445 && local9 != 0) {
			@Pc(30) int local30 = Static368.aClass349_2.method8065();
			if (local30 > local9) {
				@Pc(44) long local44 = this.aLong232 - Static368.aClass349_2.method8068();
				if (local44 > 0L) {
					@Pc(63) long local63 = (long) (local30 - local9) * (local44 * 10000L / (long) local9);
					@Pc(71) long local71 = (Static438.method6517() - this.aLong232) * 10000L;
					if (local63 <= local71) {
						local13 = local30 * 100;
					} else {
						local13 = (int) (local71 * (long) (local30 - local9) * 100L / local63 + (long) (local9 * 100));
					}
				}
			}
		} else {
			this.anInt8445 = local9;
			this.aLong232 = Static438.method6517();
		}
		return local13;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IBZI)V")
	protected abstract void method7101(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(ZI)V")
	@Override
	public final void method8022() {
		@Pc(18) int local18 = this.aClass8_5.aClass174_11.method4260(Static386.anInt6961, this.aClass8_5.anInt5334) + this.aClass8_5.anInt5338;
		@Pc(32) int local32 = this.aClass8_5.aClass176_10.method4289(this.aClass8_5.anInt5330, Static135.anInt3053) + this.aClass8_5.anInt5331;
		this.method7105(local32, local18);
		this.method7101(local18, local32);
		@Pc(54) String local54 = Static368.aClass349_2.method8063();
		if (Static438.method6517() - this.aLong232 > 10000L) {
			local54 = local54 + " (" + Static368.aClass349_2.method8074().method8483() + ")";
		}
		this.aClass64_13.method7493(this.aClass8_5.anInt5334 / 2 + local18, local32 + (this.aClass8_5.anInt5330 / 2 - -4) + this.aClass8_5.anInt5340, local54, this.aClass8_5.anInt5341, -1);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIZI)V")
	protected abstract void method7105(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1);
}
