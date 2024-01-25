import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class3_Sub4_Sub2 extends Class3_Sub4 {

	@OriginalMember(owner = "client!bea", name = "o", descriptor = "Lclient!gk;")
	private final Class112 aClass112_9 = new Class112();

	@OriginalMember(owner = "client!bea", name = "p", descriptor = "Lclient!gk;")
	private final Class112 aClass112_10 = new Class112();

	@OriginalMember(owner = "client!bea", name = "q", descriptor = "I")
	private int anInt739 = -1;

	@OriginalMember(owner = "client!bea", name = "r", descriptor = "I")
	private int anInt740 = 0;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!nj;)V")
	public synchronized void method639(@OriginalArg(0) Class3_Sub4 arg0) {
		arg0.method7825();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6654(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt739 < 0) {
				this.method644(arg0, arg1, arg2);
				return;
			}
			if (this.anInt740 + arg2 < this.anInt739) {
				this.anInt740 += arg2;
				this.method644(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt739 - this.anInt740;
			this.method644(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt740 += local33;
			this.method643();
			@Pc(60) Class3_Sub30 local60 = (Class3_Sub30) this.aClass112_10.method3088();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method3802(this);
				if (local68 < 0) {
					local60.anInt4350 = 0;
					this.method646(local60);
				} else {
					local60.anInt4350 = local68;
					this.method640(local60.aClass3_286, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!gga;Lclient!jf;)V")
	private void method640(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub30 arg1) {
		while (arg0 != this.aClass112_10.aClass3_111 && ((Class3_Sub30) arg0).anInt4350 <= arg1.anInt4350) {
			arg0 = arg0.aClass3_286;
		}
		Static576.method7736(arg0, arg1);
		this.anInt739 = ((Class3_Sub30) this.aClass112_10.aClass3_111.aClass3_286).anInt4350;
	}

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "()Lclient!nj;")
	@Override
	public Class3_Sub4 method6660() {
		return (Class3_Sub4) this.aClass112_9.method3084();
	}

	@OriginalMember(owner = "client!bea", name = "e", descriptor = "()I")
	public synchronized int method641() {
		return this.aClass112_9.method3083();
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)V")
	private void method642(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub4 local5 = (Class3_Sub4) this.aClass112_9.method3088(); local5 != null; local5 = (Class3_Sub4) this.aClass112_9.method3084()) {
			local5.method6658(arg0);
		}
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "()Lclient!nj;")
	@Override
	public Class3_Sub4 method6656() {
		return (Class3_Sub4) this.aClass112_9.method3088();
	}

	@OriginalMember(owner = "client!bea", name = "f", descriptor = "()V")
	private void method643() {
		if (this.anInt740 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub30 local8 = (Class3_Sub30) this.aClass112_10.method3088(); local8 != null; local8 = (Class3_Sub30) this.aClass112_10.method3084()) {
			local8.anInt4350 -= this.anInt740;
		}
		this.anInt739 -= this.anInt740;
		this.anInt740 = 0;
	}

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "([III)V")
	private void method644(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub4 local5 = (Class3_Sub4) this.aClass112_9.method3088(); local5 != null; local5 = (Class3_Sub4) this.aClass112_9.method3084()) {
			local5.method6659(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(Lclient!nj;)V")
	public synchronized void method645(@OriginalArg(0) Class3_Sub4 arg0) {
		this.aClass112_9.method3091(arg0);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6658(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt739 < 0) {
				this.method642(arg0);
				return;
			}
			if (this.anInt740 + arg0 < this.anInt739) {
				this.anInt740 += arg0;
				this.method642(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt739 - this.anInt740;
			this.method642(local29);
			arg0 -= local29;
			this.anInt740 += local29;
			this.method643();
			@Pc(50) Class3_Sub30 local50 = (Class3_Sub30) this.aClass112_10.method3088();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method3802(this);
				if (local58 < 0) {
					local50.anInt4350 = 0;
					this.method646(local50);
				} else {
					local50.anInt4350 = local58;
					this.method640(local50.aClass3_286, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "()I")
	@Override
	public int method6655() {
		return 0;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!jf;)V")
	private void method646(@OriginalArg(0) Class3_Sub30 arg0) {
		arg0.method7825();
		arg0.method3801();
		@Pc(9) Class3 local9 = this.aClass112_10.aClass3_111.aClass3_286;
		if (local9 == this.aClass112_10.aClass3_111) {
			this.anInt739 = -1;
		} else {
			this.anInt739 = ((Class3_Sub30) local9).anInt4350;
		}
	}
}
