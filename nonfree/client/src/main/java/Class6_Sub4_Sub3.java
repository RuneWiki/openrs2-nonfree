import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class6_Sub4_Sub3 extends Class6_Sub4 {

	@OriginalMember(owner = "client!la", name = "o", descriptor = "Lclient!kba;")
	private final Class163 aClass163_32 = new Class163();

	@OriginalMember(owner = "client!la", name = "p", descriptor = "Lclient!kba;")
	private final Class163 aClass163_33 = new Class163();

	@OriginalMember(owner = "client!la", name = "r", descriptor = "I")
	private int anInt6209 = -1;

	@OriginalMember(owner = "client!la", name = "q", descriptor = "I")
	private int anInt6208 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!mha;)V")
	public synchronized void method5194(@OriginalArg(0) Class6_Sub4 arg0) {
		this.aClass163_32.method4971(arg0);
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8635(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt6209 < 0) {
				this.method5199(arg0, arg1, arg2);
				return;
			}
			if (this.anInt6208 + arg2 < this.anInt6209) {
				this.anInt6208 += arg2;
				this.method5199(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt6209 - this.anInt6208;
			this.method5199(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt6208 += local33;
			this.method5198();
			@Pc(60) Class6_Sub41 local60 = (Class6_Sub41) this.aClass163_33.method4966();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method6770(this);
				if (local68 < 0) {
					local60.anInt8047 = 0;
					this.method5201(local60);
				} else {
					local60.anInt8047 = local68;
					this.method5195(local60.aClass6_300, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!gda;Lclient!pr;)V")
	private void method5195(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6_Sub41 arg1) {
		while (arg0 != this.aClass163_33.aClass6_178 && ((Class6_Sub41) arg0).anInt8047 <= arg1.anInt8047) {
			arg0 = arg0.aClass6_300;
		}
		Static492.method7159(arg0, arg1);
		this.anInt6209 = ((Class6_Sub41) this.aClass163_33.aClass6_178.aClass6_300).anInt8047;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	private void method5196(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class6_Sub4 local5 = (Class6_Sub4) this.aClass163_32.method4966(); local5 != null; local5 = (Class6_Sub4) this.aClass163_32.method4965()) {
			local5.method8631(arg0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8631(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt6209 < 0) {
				this.method5196(arg0);
				return;
			}
			if (this.anInt6208 + arg0 < this.anInt6209) {
				this.anInt6208 += arg0;
				this.method5196(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt6209 - this.anInt6208;
			this.method5196(local29);
			arg0 -= local29;
			this.anInt6208 += local29;
			this.method5198();
			@Pc(50) Class6_Sub41 local50 = (Class6_Sub41) this.aClass163_33.method4966();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method6770(this);
				if (local58 < 0) {
					local50.anInt8047 = 0;
					this.method5201(local50);
				} else {
					local50.anInt8047 = local58;
					this.method5195(local50.aClass6_300, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(Lclient!mha;)V")
	public synchronized void method5197(@OriginalArg(0) Class6_Sub4 arg0) {
		arg0.method8792();
	}

	@OriginalMember(owner = "client!la", name = "e", descriptor = "()V")
	private void method5198() {
		if (this.anInt6208 <= 0) {
			return;
		}
		for (@Pc(8) Class6_Sub41 local8 = (Class6_Sub41) this.aClass163_33.method4966(); local8 != null; local8 = (Class6_Sub41) this.aClass163_33.method4965()) {
			local8.anInt8047 -= this.anInt6208;
		}
		this.anInt6209 -= this.anInt6208;
		this.anInt6208 = 0;
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "()Lclient!mha;")
	@Override
	public Class6_Sub4 method8637() {
		return (Class6_Sub4) this.aClass163_32.method4965();
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "()I")
	@Override
	public int method8636() {
		return 0;
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "([III)V")
	private void method5199(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class6_Sub4 local5 = (Class6_Sub4) this.aClass163_32.method4966(); local5 != null; local5 = (Class6_Sub4) this.aClass163_32.method4965()) {
			local5.method8634(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!la", name = "f", descriptor = "()I")
	public synchronized int method5200() {
		return this.aClass163_32.method4972();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "()Lclient!mha;")
	@Override
	public Class6_Sub4 method8632() {
		return (Class6_Sub4) this.aClass163_32.method4966();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!pr;)V")
	private void method5201(@OriginalArg(0) Class6_Sub41 arg0) {
		arg0.method8792();
		arg0.method6769();
		@Pc(9) Class6 local9 = this.aClass163_33.aClass6_178.aClass6_300;
		if (local9 == this.aClass163_33.aClass6_178) {
			this.anInt6209 = -1;
		} else {
			this.anInt6209 = ((Class6_Sub41) local9).anInt8047;
		}
	}
}
