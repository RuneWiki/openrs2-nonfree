import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "Lclient!tm;")
	private final Class338 aClass338_19 = new Class338();

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "Lclient!tm;")
	private final Class338 aClass338_20 = new Class338();

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
	private int anInt831 = 0;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
	private int anInt832 = -1;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "([III)V")
	private void method928(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub1 local5 = (Class3_Sub1) this.aClass338_19.method8177(); local5 != null; local5 = (Class3_Sub1) this.aClass338_19.method8168()) {
			local5.method5784(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!st;)V")
	private void method929(@OriginalArg(0) Class3_Sub51 arg0) {
		arg0.method9380();
		arg0.method7946();
		@Pc(9) Class3 local9 = this.aClass338_20.aClass3_302.aClass3_337;
		if (local9 == this.aClass338_20.aClass3_302) {
			this.anInt832 = -1;
		} else {
			this.anInt832 = ((Class3_Sub51) local9).anInt9095;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!dba;Lclient!st;)V")
	private void method930(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub51 arg1) {
		while (arg0 != this.aClass338_20.aClass3_302 && ((Class3_Sub51) arg0).anInt9095 <= arg1.anInt9095) {
			arg0 = arg0.aClass3_337;
		}
		Static610.method8666(arg1, arg0);
		this.anInt832 = ((Class3_Sub51) this.aClass338_20.aClass3_302.aClass3_337).anInt9095;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!sia;)V")
	public synchronized void method931(@OriginalArg(0) Class3_Sub1 arg0) {
		arg0.method9380();
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "()I")
	@Override
	public int method5780() {
		return 0;
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "()Lclient!sia;")
	@Override
	public Class3_Sub1 method5782() {
		return (Class3_Sub1) this.aClass338_19.method8168();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5783(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt832 < 0) {
				this.method928(arg0, arg1, arg2);
				return;
			}
			if (this.anInt831 + arg2 < this.anInt832) {
				this.anInt831 += arg2;
				this.method928(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt832 - this.anInt831;
			this.method928(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt831 += local33;
			this.method935();
			@Pc(60) Class3_Sub51 local60 = (Class3_Sub51) this.aClass338_20.method8177();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method7945(this);
				if (local68 < 0) {
					local60.anInt9095 = 0;
					this.method929(local60);
				} else {
					local60.anInt9095 = local68;
					this.method930(local60.aClass3_337, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "()I")
	public synchronized int method932() {
		return this.aClass338_19.method8164();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "()Lclient!sia;")
	@Override
	public Class3_Sub1 method5778() {
		return (Class3_Sub1) this.aClass338_19.method8177();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5779(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt832 < 0) {
				this.method933(arg0);
				return;
			}
			if (this.anInt831 + arg0 < this.anInt832) {
				this.anInt831 += arg0;
				this.method933(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt832 - this.anInt831;
			this.method933(local29);
			arg0 -= local29;
			this.anInt831 += local29;
			this.method935();
			@Pc(50) Class3_Sub51 local50 = (Class3_Sub51) this.aClass338_20.method8177();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method7945(this);
				if (local58 < 0) {
					local50.anInt9095 = 0;
					this.method929(local50);
				} else {
					local50.anInt9095 = local58;
					this.method930(local50.aClass3_337, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	private void method933(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub1 local5 = (Class3_Sub1) this.aClass338_19.method8177(); local5 != null; local5 = (Class3_Sub1) this.aClass338_19.method8168()) {
			local5.method5779(arg0);
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(Lclient!sia;)V")
	public synchronized void method934(@OriginalArg(0) Class3_Sub1 arg0) {
		this.aClass338_19.method8176(arg0);
	}

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "()V")
	private void method935() {
		if (this.anInt831 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub51 local8 = (Class3_Sub51) this.aClass338_20.method8177(); local8 != null; local8 = (Class3_Sub51) this.aClass338_20.method8168()) {
			local8.anInt9095 -= this.anInt831;
		}
		this.anInt832 -= this.anInt831;
		this.anInt831 = 0;
	}
}
