import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public abstract class Class138 implements Interface16 {

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
	private int anInt9075;

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "J")
	private long aLong250;

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "Lclient!da;")
	private Class67 aClass67_13;

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "Lclient!cd;")
	protected final Class21 aClass21_5;

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "Lclient!uq;")
	private final Class362 aClass362_129;

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "Lclient!uq;")
	protected final Class362 aClass362_128;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!uq;Lclient!uq;Lclient!cd;)V")
	protected Class138(@OriginalArg(0) Class362 arg0, @OriginalArg(1) Class362 arg1, @OriginalArg(2) Class21 arg2) {
		this.aClass21_5 = arg2;
		this.aClass362_129 = arg1;
		this.aClass362_128 = arg0;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZI)V")
	@Override
	public final void method8282() {
		@Pc(18) int local18 = this.aClass21_5.aClass266_12.method5919(Static95.anInt9415, this.aClass21_5.anInt9572) + this.aClass21_5.anInt9576;
		@Pc(32) int local32 = this.aClass21_5.aClass131_23.method3034(this.aClass21_5.anInt9574, Static195.anInt3525) + this.aClass21_5.anInt9573;
		this.method7396(local18, local32);
		this.method7395(local18, local32);
		@Pc(50) String local50 = Static74.aClass191_1.method4361();
		if (Static15.method380() - this.aLong250 > 10000L) {
			local50 = local50 + " (" + Static74.aClass191_1.method4359().method3708() + ")";
		}
		this.aClass67_13.method7676(this.aClass21_5.anInt9571, local50, -1, this.aClass21_5.anInt9575 + local32 + this.aClass21_5.anInt9574 / 2 + 4, local18 - -(this.aClass21_5.anInt9572 / 2));
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZIII)V")
	protected abstract void method7395(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIZI)V")
	protected abstract void method7396(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
	@Override
	public void method8280() {
		@Pc(16) Class91 local16 = Static473.method6301(this.aClass21_5.anInt9570, this.aClass362_129);
		this.aClass67_13 = Static119.aClass95_4.method8032(local16, Static688.method8599(this.aClass362_128, this.aClass21_5.anInt9570));
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8281() {
		@Pc(11) boolean local11 = true;
		if (!this.aClass362_128.method8365(this.aClass21_5.anInt9570)) {
			local11 = false;
		}
		if (!this.aClass362_129.method8365(this.aClass21_5.anInt9570)) {
			local11 = false;
		}
		return local11;
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)I")
	protected final int method7400() {
		@Pc(9) int local9 = Static74.aClass191_1.method4352();
		@Pc(13) int local13 = local9 * 100;
		if (local9 == this.anInt9075 && local9 != 0) {
			@Pc(36) int local36 = Static74.aClass191_1.method4357();
			if (local9 < local36) {
				@Pc(52) long local52 = this.aLong250 - Static74.aClass191_1.method4365();
				if (local52 > 0L) {
					@Pc(70) long local70 = (long) (local36 - local9) * (local52 * 10000L / (long) local9);
					@Pc(79) long local79 = (Static15.method380() - this.aLong250) * 10000L;
					if (local70 <= local79) {
						local13 = local36 * 100;
					} else {
						local13 = (int) ((long) (local36 - local9) * local79 * 100L / local70 + (long) (local9 * 100));
					}
				}
			}
		} else {
			this.anInt9075 = local9;
			this.aLong250 = Static15.method380();
		}
		return local13;
	}
}
