import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class3_Sub3_Sub4 extends Class3_Sub3 {

	@OriginalMember(owner = "client!we", name = "K", descriptor = "Lclient!ja;")
	private final Class37 aClass37_13 = new Class37();

	@OriginalMember(owner = "client!we", name = "L", descriptor = "Lclient!ja;")
	private final Class37 aClass37_14 = new Class37();

	@OriginalMember(owner = "client!we", name = "M", descriptor = "I")
	private int anInt3230 = -1;

	@OriginalMember(owner = "client!we", name = "N", descriptor = "I")
	private int anInt3231 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!sa;Lclient!ic;)V")
	private void method2064(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub9 arg1) {
		while (arg0 != this.aClass37_14.aClass3_55 && ((Class3_Sub9) arg0).anInt1456 <= arg1.anInt1456) {
			arg0 = arg0.aClass3_116;
		}
		this.aClass37_14.method986(arg1, arg0);
		this.anInt3230 = ((Class3_Sub9) this.aClass37_14.aClass3_55.aClass3_116).anInt1456;
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2057(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3230 < 0) {
				this.method2065(arg0);
				return;
			}
			if (this.anInt3231 + arg0 < this.anInt3230) {
				this.anInt3231 += arg0;
				this.method2065(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3230 - this.anInt3231;
			this.method2065(local29);
			arg0 -= local29;
			this.anInt3231 += local29;
			this.method2066();
			@Pc(50) Class3_Sub9 local50 = (Class3_Sub9) this.aClass37_14.method989();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method916(this);
				if (local58 < 0) {
					local50.anInt1456 = 0;
					this.method2067(local50);
				} else {
					local50.anInt1456 = local58;
					this.method2064(local50.aClass3_116, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
	private void method2065(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub3 local5 = (Class3_Sub3) this.aClass37_13.method989(); local5 != null; local5 = (Class3_Sub3) this.aClass37_13.method990()) {
			local5.method2057(arg0);
		}
	}

	@OriginalMember(owner = "client!we", name = "e", descriptor = "()V")
	private void method2066() {
		if (this.anInt3231 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub9 local8 = (Class3_Sub9) this.aClass37_14.method989(); local8 != null; local8 = (Class3_Sub9) this.aClass37_14.method990()) {
			local8.anInt1456 -= this.anInt3231;
		}
		this.anInt3230 -= this.anInt3231;
		this.anInt3231 = 0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!ic;)V")
	private void method2067(@OriginalArg(0) Class3_Sub9 arg0) {
		arg0.method2055();
		arg0.method917();
		@Pc(9) Class3 local9 = this.aClass37_14.aClass3_55.aClass3_116;
		if (local9 == this.aClass37_14.aClass3_55) {
			this.anInt3230 = -1;
		} else {
			this.anInt3230 = ((Class3_Sub9) local9).anInt1456;
		}
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "()I")
	@Override
	public int method2063() {
		return 0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!be;)V")
	public synchronized void method2068(@OriginalArg(0) Class3_Sub3 arg0) {
		this.aClass37_13.method991(arg0);
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "()Lclient!be;")
	@Override
	public Class3_Sub3 method2060() {
		return (Class3_Sub3) this.aClass37_13.method989();
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2062(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3230 < 0) {
				this.method2070(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3231 + arg2 < this.anInt3230) {
				this.anInt3231 += arg2;
				this.method2070(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3230 - this.anInt3231;
			this.method2070(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3231 += local33;
			this.method2066();
			@Pc(60) Class3_Sub9 local60 = (Class3_Sub9) this.aClass37_14.method989();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method916(this);
				if (local68 < 0) {
					local60.anInt1456 = 0;
					this.method2067(local60);
				} else {
					local60.anInt1456 = local68;
					this.method2064(local60.aClass3_116, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(Lclient!be;)V")
	public synchronized void method2069(@OriginalArg(0) Class3_Sub3 arg0) {
		arg0.method2055();
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "()Lclient!be;")
	@Override
	public Class3_Sub3 method2059() {
		return (Class3_Sub3) this.aClass37_13.method990();
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "([III)V")
	private void method2070(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub3 local5 = (Class3_Sub3) this.aClass37_13.method989(); local5 != null; local5 = (Class3_Sub3) this.aClass37_13.method990()) {
			local5.method2061(arg0, arg1, arg2);
		}
	}
}
