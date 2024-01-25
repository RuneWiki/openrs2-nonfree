import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class5_Sub17_Sub3 extends Class5_Sub17 {

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "Lclient!vn;")
	private final Class211 aClass211_16 = new Class211();

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "Lclient!vn;")
	private final Class211 aClass211_17 = new Class211();

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
	private int anInt3865 = -1;

	@OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
	private int anInt3864 = 0;

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V")
	private void method3543(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class5_Sub17 local5 = (Class5_Sub17) this.aClass211_16.method5608(); local5 != null; local5 = (Class5_Sub17) this.aClass211_16.method5603()) {
			local5.method4465(arg0);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!nf;)V")
	public synchronized void method3544(@OriginalArg(0) Class5_Sub17 arg0) {
		arg0.method5803();
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "()I")
	@Override
	public int method4459() {
		return 0;
	}

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "()V")
	private void method3545() {
		if (this.anInt3864 <= 0) {
			return;
		}
		for (@Pc(8) Class5_Sub8 local8 = (Class5_Sub8) this.aClass211_17.method5608(); local8 != null; local8 = (Class5_Sub8) this.aClass211_17.method5603()) {
			local8.anInt1184 -= this.anInt3864;
		}
		this.anInt3865 -= this.anInt3864;
		this.anInt3864 = 0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!cq;)V")
	private void method3546(@OriginalArg(0) Class5_Sub8 arg0) {
		arg0.method5803();
		arg0.method1042();
		@Pc(9) Class5 local9 = this.aClass211_17.aClass5_235.aClass5_247;
		if (local9 == this.aClass211_17.aClass5_235) {
			this.anInt3865 = -1;
		} else {
			this.anInt3865 = ((Class5_Sub8) local9).anInt1184;
		}
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "()Lclient!nf;")
	@Override
	public Class5_Sub17 method4461() {
		return (Class5_Sub17) this.aClass211_16.method5603();
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(Lclient!nf;)V")
	public synchronized void method3547(@OriginalArg(0) Class5_Sub17 arg0) {
		this.aClass211_16.method5607(arg0);
	}

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "()Lclient!nf;")
	@Override
	public Class5_Sub17 method4463() {
		return (Class5_Sub17) this.aClass211_16.method5608();
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!qs;Lclient!cq;)V")
	private void method3548(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5_Sub8 arg1) {
		while (arg0 != this.aClass211_17.aClass5_235 && ((Class5_Sub8) arg0).anInt1184 <= arg1.anInt1184) {
			arg0 = arg0.aClass5_247;
		}
		Static220.method3857(arg1, arg0);
		this.anInt3865 = ((Class5_Sub8) this.aClass211_17.aClass5_235.aClass5_247).anInt1184;
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4464(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3865 < 0) {
				this.method3549(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3864 + arg2 < this.anInt3865) {
				this.anInt3864 += arg2;
				this.method3549(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3865 - this.anInt3864;
			this.method3549(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3864 += local33;
			this.method3545();
			@Pc(60) Class5_Sub8 local60 = (Class5_Sub8) this.aClass211_17.method5608();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1041(this);
				if (local68 < 0) {
					local60.anInt1184 = 0;
					this.method3546(local60);
				} else {
					local60.anInt1184 = local68;
					this.method3548(local60.aClass5_247, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4465(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3865 < 0) {
				this.method3543(arg0);
				return;
			}
			if (this.anInt3864 + arg0 < this.anInt3865) {
				this.anInt3864 += arg0;
				this.method3543(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3865 - this.anInt3864;
			this.method3543(local29);
			arg0 -= local29;
			this.anInt3864 += local29;
			this.method3545();
			@Pc(50) Class5_Sub8 local50 = (Class5_Sub8) this.aClass211_17.method5608();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1041(this);
				if (local58 < 0) {
					local50.anInt1184 = 0;
					this.method3546(local50);
				} else {
					local50.anInt1184 = local58;
					this.method3548(local50.aClass5_247, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "([III)V")
	private void method3549(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class5_Sub17 local5 = (Class5_Sub17) this.aClass211_16.method5608(); local5 != null; local5 = (Class5_Sub17) this.aClass211_16.method5603()) {
			local5.method4460(arg0, arg1, arg2);
		}
	}
}
