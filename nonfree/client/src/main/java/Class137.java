import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public abstract class Class137 implements Interface16 {

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
	private int anInt9022;

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "Lclient!la;")
	private Class37 aClass37_17;

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "J")
	private long aLong254;

	@OriginalMember(owner = "client!kl", name = "o", descriptor = "Lclient!mv;")
	protected final Class229 aClass229_123;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "Lclient!pv;")
	protected final Class153 aClass153_5;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "Lclient!mv;")
	private final Class229 aClass229_122;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!mv;Lclient!mv;Lclient!pv;)V")
	protected Class137(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) Class153 arg2) {
		this.aClass229_123 = arg0;
		this.aClass153_5 = arg2;
		this.aClass229_122 = arg1;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZII)V")
	protected abstract void method7223(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
	@Override
	public void method7258() {
		@Pc(15) Class112 local15 = Static308.method4410(this.aClass229_122, this.aClass153_5.anInt9313);
		this.aClass37_17 = Static417.aClass162_17.method6864(local15, Static603.method7126(this.aClass229_123, this.aClass153_5.anInt9313));
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7257() {
		@Pc(10) boolean local10 = true;
		if (!this.aClass229_123.method4954(this.aClass153_5.anInt9313)) {
			local10 = false;
		}
		if (!this.aClass229_122.method4954(this.aClass153_5.anInt9313)) {
			local10 = false;
		}
		return local10;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)I")
	protected final int method7224() {
		@Pc(16) int local16 = Static573.aClass264_1.method5515();
		@Pc(20) int local20 = local16 * 100;
		if (this.anInt9022 == local16 && local16 != 0) {
			@Pc(33) int local33 = Static573.aClass264_1.method5509();
			if (local16 < local33) {
				@Pc(48) long local48 = this.aLong254 - Static573.aClass264_1.method5511();
				if (local48 > 0L) {
					@Pc(64) long local64 = local48 * 10000L / (long) local16 * (long) (local33 - local16);
					@Pc(72) long local72 = (Static362.method5133() - this.aLong254) * 10000L;
					if (local64 <= local72) {
						local20 = local33 * 100;
					} else {
						local20 = (int) ((long) (local33 - local16) * local72 * 100L / local64 + (long) (local16 * 100));
					}
				}
			}
		} else {
			this.anInt9022 = local16;
			this.aLong254 = Static362.method5133();
		}
		return local20;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZ)V")
	@Override
	public final void method7259() {
		@Pc(17) int local17 = this.aClass153_5.aClass322_13.method6534(Static14.anInt330, this.aClass153_5.anInt9316) + this.aClass153_5.anInt9314;
		@Pc(32) int local32 = this.aClass153_5.aClass347_13.method7305(Static370.anInt6187, this.aClass153_5.anInt9312) + this.aClass153_5.anInt9315;
		this.method7226(local17, local32);
		this.method7223(local32, local17);
		@Pc(59) String local59 = Static573.aClass264_1.method5513();
		if (Static362.method5133() - this.aLong254 > 10000L) {
			local59 = local59 + " (" + Static573.aClass264_1.method5521().method5483() + ")";
		}
		this.aClass37_17.method7724(this.aClass153_5.anInt9310, -1, local59, local32 + this.aClass153_5.anInt9312 / 2 + this.aClass153_5.anInt9317 + 4, local17 - -(this.aClass153_5.anInt9316 / 2));
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZIII)V")
	protected abstract void method7226(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1);
}
