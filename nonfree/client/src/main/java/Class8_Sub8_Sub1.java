import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class8_Sub8_Sub1 extends Class8_Sub8 {

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "Lclient!wn;")
	private Class182 aClass182_3 = new Class182();

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "Lclient!wn;")
	private Class182 aClass182_4 = new Class182();

	@OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
	private int anInt1142 = 0;

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
	private int anInt1141 = -1;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3707(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1141 < 0) {
				this.method833(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1142 + arg2 < this.anInt1141) {
				this.anInt1142 += arg2;
				this.method833(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1141 - this.anInt1142;
			this.method833(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1142 += local33;
			this.method835();
			@Pc(60) Class8_Sub13 local60 = (Class8_Sub13) this.aClass182_4.method4319();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1865(this);
				if (local68 < 0) {
					local60.anInt2361 = 0;
					this.method832(local60);
				} else {
					local60.anInt2361 = local68;
					this.method838(local60.aClass8_229, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "()I")
	@Override
	public int method3709() {
		return 0;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "()Lclient!kn;")
	@Override
	public Class8_Sub8 method3706() {
		return (Class8_Sub8) this.aClass182_3.method4319();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!im;)V")
	private void method832(@OriginalArg(0) Class8_Sub13 arg0) {
		arg0.method4273();
		arg0.method1864();
		@Pc(9) Class8 local9 = this.aClass182_4.aClass8_230.aClass8_229;
		if (local9 == this.aClass182_4.aClass8_230) {
			this.anInt1141 = -1;
		} else {
			this.anInt1141 = ((Class8_Sub13) local9).anInt2361;
		}
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "([III)V")
	private void method833(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class8_Sub8 local5 = (Class8_Sub8) this.aClass182_3.method4319(); local5 != null; local5 = (Class8_Sub8) this.aClass182_3.method4329()) {
			local5.method3703(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!kn;)V")
	public synchronized void method834(@OriginalArg(0) Class8_Sub8 arg0) {
		this.aClass182_3.method4325(arg0);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method3705(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1141 < 0) {
				this.method836(arg0);
				return;
			}
			if (this.anInt1142 + arg0 < this.anInt1141) {
				this.anInt1142 += arg0;
				this.method836(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1141 - this.anInt1142;
			this.method836(local29);
			arg0 -= local29;
			this.anInt1142 += local29;
			this.method835();
			@Pc(50) Class8_Sub13 local50 = (Class8_Sub13) this.aClass182_4.method4319();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1865(this);
				if (local58 < 0) {
					local50.anInt2361 = 0;
					this.method832(local50);
				} else {
					local50.anInt2361 = local58;
					this.method838(local50.aClass8_229, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "()V")
	private void method835() {
		if (this.anInt1142 <= 0) {
			return;
		}
		for (@Pc(8) Class8_Sub13 local8 = (Class8_Sub13) this.aClass182_4.method4319(); local8 != null; local8 = (Class8_Sub13) this.aClass182_4.method4329()) {
			local8.anInt2361 -= this.anInt1142;
		}
		this.anInt1141 -= this.anInt1142;
		this.anInt1142 = 0;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
	private void method836(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class8_Sub8 local5 = (Class8_Sub8) this.aClass182_3.method4319(); local5 != null; local5 = (Class8_Sub8) this.aClass182_3.method4329()) {
			local5.method3705(arg0);
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(Lclient!kn;)V")
	public synchronized void method837(@OriginalArg(0) Class8_Sub8 arg0) {
		arg0.method4273();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!vb;Lclient!im;)V")
	private void method838(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8_Sub13 arg1) {
		while (arg0 != this.aClass182_4.aClass8_230 && ((Class8_Sub13) arg0).anInt2361 <= arg1.anInt2361) {
			arg0 = arg0.aClass8_229;
		}
		Static88.method1443(arg1, arg0);
		this.anInt1141 = ((Class8_Sub13) this.aClass182_4.aClass8_230.aClass8_229).anInt2361;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "()Lclient!kn;")
	@Override
	public Class8_Sub8 method3704() {
		return (Class8_Sub8) this.aClass182_3.method4329();
	}
}
