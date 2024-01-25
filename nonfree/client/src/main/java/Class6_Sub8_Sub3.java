import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kca")
public final class Class6_Sub8_Sub3 extends Class6_Sub8 {

	@OriginalMember(owner = "client!kca", name = "n", descriptor = "Lclient!v;")
	private final Class362 aClass362_23 = new Class362();

	@OriginalMember(owner = "client!kca", name = "o", descriptor = "Lclient!v;")
	private final Class362 aClass362_24 = new Class362();

	@OriginalMember(owner = "client!kca", name = "p", descriptor = "I")
	private int anInt4978 = -1;

	@OriginalMember(owner = "client!kca", name = "q", descriptor = "I")
	private int anInt4979 = 0;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method9119(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt4978 < 0) {
				this.method4257(arg0);
				return;
			}
			if (this.anInt4979 + arg0 < this.anInt4978) {
				this.anInt4979 += arg0;
				this.method4257(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt4978 - this.anInt4979;
			this.method4257(local29);
			arg0 -= local29;
			this.anInt4979 += local29;
			this.method4251();
			@Pc(50) Class6_Sub38 local50 = (Class6_Sub38) this.aClass362_24.method8538();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method5330(this);
				if (local58 < 0) {
					local50.anInt6307 = 0;
					this.method4253(local50);
				} else {
					local50.anInt6307 = local58;
					this.method4252(local50.aClass6_338, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!kca", name = "e", descriptor = "()V")
	private void method4251() {
		if (this.anInt4979 <= 0) {
			return;
		}
		for (@Pc(8) Class6_Sub38 local8 = (Class6_Sub38) this.aClass362_24.method8538(); local8 != null; local8 = (Class6_Sub38) this.aClass362_24.method8530()) {
			local8.anInt6307 -= this.anInt4979;
		}
		this.anInt4978 -= this.anInt4979;
		this.anInt4979 = 0;
	}

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "()Lclient!qp;")
	@Override
	public Class6_Sub8 method9124() {
		return (Class6_Sub8) this.aClass362_23.method8530();
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!sja;Lclient!mi;)V")
	private void method4252(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6_Sub38 arg1) {
		while (arg0 != this.aClass362_24.aClass6_312 && ((Class6_Sub38) arg0).anInt6307 <= arg1.anInt6307) {
			arg0 = arg0.aClass6_338;
		}
		Static651.method8874(arg0, arg1);
		this.anInt4978 = ((Class6_Sub38) this.aClass362_24.aClass6_312.aClass6_338).anInt6307;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!mi;)V")
	private void method4253(@OriginalArg(0) Class6_Sub38 arg0) {
		arg0.method9174();
		arg0.method5329();
		@Pc(9) Class6 local9 = this.aClass362_24.aClass6_312.aClass6_338;
		if (local9 == this.aClass362_24.aClass6_312) {
			this.anInt4978 = -1;
		} else {
			this.anInt4978 = ((Class6_Sub38) local9).anInt6307;
		}
	}

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "([III)V")
	private void method4254(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class6_Sub8 local5 = (Class6_Sub8) this.aClass362_23.method8538(); local5 != null; local5 = (Class6_Sub8) this.aClass362_23.method8530()) {
			local5.method9122(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!kca", name = "f", descriptor = "()I")
	public synchronized int method4255() {
		return this.aClass362_23.method8533();
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!qp;)V")
	public synchronized void method4256(@OriginalArg(0) Class6_Sub8 arg0) {
		this.aClass362_23.method8539(arg0);
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)V")
	private void method4257(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class6_Sub8 local5 = (Class6_Sub8) this.aClass362_23.method8538(); local5 != null; local5 = (Class6_Sub8) this.aClass362_23.method8530()) {
			local5.method9119(arg0);
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "()Lclient!qp;")
	@Override
	public Class6_Sub8 method9121() {
		return (Class6_Sub8) this.aClass362_23.method8538();
	}

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "()I")
	@Override
	public int method9125() {
		return 0;
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(Lclient!qp;)V")
	public synchronized void method4258(@OriginalArg(0) Class6_Sub8 arg0) {
		arg0.method9174();
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method9120(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt4978 < 0) {
				this.method4254(arg0, arg1, arg2);
				return;
			}
			if (this.anInt4979 + arg2 < this.anInt4978) {
				this.anInt4979 += arg2;
				this.method4254(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt4978 - this.anInt4979;
			this.method4254(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt4979 += local33;
			this.method4251();
			@Pc(60) Class6_Sub38 local60 = (Class6_Sub38) this.aClass362_24.method8538();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method5330(this);
				if (local68 < 0) {
					local60.anInt6307 = 0;
					this.method4253(local60);
				} else {
					local60.anInt6307 = local68;
					this.method4252(local60.aClass6_338, local60);
				}
			}
		} while (arg2 != 0);
	}
}
