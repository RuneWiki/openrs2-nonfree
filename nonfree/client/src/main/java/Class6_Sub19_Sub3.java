import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class6_Sub19_Sub3 extends Class6_Sub19 {

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "Lclient!rh;")
	private final Class275 aClass275_165 = new Class275();

	@OriginalMember(owner = "client!ro", name = "o", descriptor = "Lclient!rh;")
	private final Class275 aClass275_166 = new Class275();

	@OriginalMember(owner = "client!ro", name = "q", descriptor = "I")
	private int anInt7756 = -1;

	@OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
	private int anInt7755 = 0;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!sf;Lclient!nw;)V")
	private void method6421(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6_Sub40 arg1) {
		while (arg0 != this.aClass275_166.aClass6_229 && ((Class6_Sub40) arg0).anInt6150 <= arg1.anInt6150) {
			arg0 = arg0.aClass6_284;
		}
		Static105.method1694(arg1, arg0);
		this.anInt7756 = ((Class6_Sub40) this.aClass275_166.aClass6_229.aClass6_284).anInt6150;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!nw;)V")
	private void method6422(@OriginalArg(0) Class6_Sub40 arg0) {
		arg0.method7849();
		arg0.method5221();
		@Pc(9) Class6 local9 = this.aClass275_166.aClass6_229.aClass6_284;
		if (local9 == this.aClass275_166.aClass6_229) {
			this.anInt7756 = -1;
		} else {
			this.anInt7756 = ((Class6_Sub40) local9).anInt6150;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7697(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt7756 < 0) {
				this.method6426(arg0);
				return;
			}
			if (this.anInt7755 + arg0 < this.anInt7756) {
				this.anInt7755 += arg0;
				this.method6426(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt7756 - this.anInt7755;
			this.method6426(local29);
			arg0 -= local29;
			this.anInt7755 += local29;
			this.method6423();
			@Pc(50) Class6_Sub40 local50 = (Class6_Sub40) this.aClass275_166.method6366();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method5220(this);
				if (local58 < 0) {
					local50.anInt6150 = 0;
					this.method6422(local50);
				} else {
					local50.anInt6150 = local58;
					this.method6421(local50.aClass6_284, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "()V")
	private void method6423() {
		if (this.anInt7755 <= 0) {
			return;
		}
		for (@Pc(8) Class6_Sub40 local8 = (Class6_Sub40) this.aClass275_166.method6366(); local8 != null; local8 = (Class6_Sub40) this.aClass275_166.method6364()) {
			local8.anInt6150 -= this.anInt7755;
		}
		this.anInt7756 -= this.anInt7755;
		this.anInt7755 = 0;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method7698(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt7756 < 0) {
				this.method6428(arg0, arg1, arg2);
				return;
			}
			if (this.anInt7755 + arg2 < this.anInt7756) {
				this.anInt7755 += arg2;
				this.method6428(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt7756 - this.anInt7755;
			this.method6428(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt7755 += local33;
			this.method6423();
			@Pc(60) Class6_Sub40 local60 = (Class6_Sub40) this.aClass275_166.method6366();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method5220(this);
				if (local68 < 0) {
					local60.anInt6150 = 0;
					this.method6422(local60);
				} else {
					local60.anInt6150 = local68;
					this.method6421(local60.aClass6_284, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!wi;)V")
	public synchronized void method6424(@OriginalArg(0) Class6_Sub19 arg0) {
		arg0.method7849();
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(Lclient!wi;)V")
	public synchronized void method6425(@OriginalArg(0) Class6_Sub19 arg0) {
		this.aClass275_165.method6368(arg0);
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V")
	private void method6426(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class6_Sub19 local5 = (Class6_Sub19) this.aClass275_165.method6366(); local5 != null; local5 = (Class6_Sub19) this.aClass275_165.method6364()) {
			local5.method7697(arg0);
		}
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "()I")
	@Override
	public int method7695() {
		return 0;
	}

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "()I")
	public synchronized int method6427() {
		return this.aClass275_165.method6361();
	}

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "()Lclient!wi;")
	@Override
	public Class6_Sub19 method7700() {
		return (Class6_Sub19) this.aClass275_165.method6366();
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "()Lclient!wi;")
	@Override
	public Class6_Sub19 method7694() {
		return (Class6_Sub19) this.aClass275_165.method6364();
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "([III)V")
	private void method6428(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class6_Sub19 local5 = (Class6_Sub19) this.aClass275_165.method6366(); local5 != null; local5 = (Class6_Sub19) this.aClass275_165.method6364()) {
			local5.method7696(arg0, arg1, arg2);
		}
	}
}
