import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public abstract class Class45 implements Interface7 {

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "J")
	private long aLong185;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "Lclient!la;")
	private Class58 aClass58_9;

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
	private int anInt7200;

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "Lclient!fs;")
	protected final Class108 aClass108_5;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "Lclient!jn;")
	protected final Class176 aClass176_100;

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "Lclient!jn;")
	private final Class176 aClass176_101;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lclient!jn;Lclient!jn;Lclient!fs;)V")
	protected Class45(@OriginalArg(0) Class176 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class108 arg2) {
		this.aClass108_5 = arg2;
		this.aClass176_100 = arg0;
		this.aClass176_101 = arg1;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZII)V")
	protected abstract void method5952(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIZZ)V")
	protected abstract void method5953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
	@Override
	public void method7416() {
		@Pc(19) Class114 local19 = Static503.method7393(this.aClass176_101, this.aClass108_5.anInt10013);
		this.aClass58_9 = Static440.aClass44_12.method4983(local19, Static598.method6316(this.aClass176_100, this.aClass108_5.anInt10013));
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BZ)V")
	@Override
	public final void method7418() {
		@Pc(18) int local18 = this.aClass108_5.aClass258_13.method6279(Static501.anInt6750, this.aClass108_5.anInt10015) + this.aClass108_5.anInt10009;
		@Pc(32) int local32 = this.aClass108_5.aClass250_13.method6077(this.aClass108_5.anInt10007, Static212.anInt3952) + this.aClass108_5.anInt10011;
		this.method5953(local18, local32);
		this.method5952(local18, local32);
		@Pc(55) String local55 = Static113.aClass282_1.method6821();
		if (Static574.method8210() - this.aLong185 > 10000L) {
			local55 = local55 + " (" + Static113.aClass282_1.method6822().method2634() + ")";
		}
		this.aClass58_9.method8167(local18 + this.aClass108_5.anInt10015 / 2, this.aClass108_5.anInt10008 + 4 + this.aClass108_5.anInt10007 / 2 + local32, local55, this.aClass108_5.anInt10014, -1);
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7417() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass176_100.method3996(this.aClass108_5.anInt10013)) {
			local5 = false;
		}
		if (!this.aClass176_101.method3996(this.aClass108_5.anInt10013)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)I")
	protected final int method5954() {
		@Pc(9) int local9 = Static113.aClass282_1.method6814();
		@Pc(13) int local13 = local9 * 100;
		if (this.anInt7200 == local9 && local9 != 0) {
			@Pc(39) int local39 = Static113.aClass282_1.method6815();
			if (local9 < local39) {
				@Pc(53) long local53 = this.aLong185 - Static113.aClass282_1.method6817();
				if (local53 > 0L) {
					@Pc(71) long local71 = (long) (local39 - local9) * (local53 * 10000L / (long) local9);
					@Pc(79) long local79 = (Static574.method8210() - this.aLong185) * 10000L;
					if (local79 >= local71) {
						local13 = local39 * 100;
					} else {
						local13 = (int) (local79 * (long) (local39 - local9) * 100L / local71 + (long) (local9 * 100));
					}
				}
			}
		} else {
			this.anInt7200 = local9;
			this.aLong185 = Static574.method8210();
		}
		return local13;
	}
}
