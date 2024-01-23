import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class1_Sub4_Sub2 extends Class1_Sub4 {

	@OriginalMember(owner = "client!de", name = "p", descriptor = "Lclient!bo;")
	private Class24 aClass24_2 = new Class24();

	@OriginalMember(owner = "client!de", name = "q", descriptor = "Lclient!bo;")
	private Class24 aClass24_3 = new Class24();

	@OriginalMember(owner = "client!de", name = "r", descriptor = "I")
	private int anInt841 = -1;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "I")
	private int anInt842 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!pn;)V")
	private void method770(@OriginalArg(0) Class1_Sub24 arg0) {
		arg0.method4616();
		arg0.method3436();
		@Pc(9) Class1 local9 = this.aClass24_3.aClass1_27.aClass1_233;
		if (local9 == this.aClass24_3.aClass1_27) {
			this.anInt841 = -1;
		} else {
			this.anInt841 = ((Class1_Sub24) local9).anInt4281;
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "()I")
	@Override
	public int method4188() {
		return 0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!mg;Lclient!pn;)V")
	private void method771(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1_Sub24 arg1) {
		while (arg0 != this.aClass24_3.aClass1_27 && ((Class1_Sub24) arg0).anInt4281 <= arg1.anInt4281) {
			arg0 = arg0.aClass1_233;
		}
		Static283.method4222(arg0, arg1);
		this.anInt841 = ((Class1_Sub24) this.aClass24_3.aClass1_27.aClass1_233).anInt4281;
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method4192(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt841 < 0) {
				this.method776(arg0);
				return;
			}
			if (this.anInt842 + arg0 < this.anInt841) {
				this.anInt842 += arg0;
				this.method776(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt841 - this.anInt842;
			this.method776(local29);
			arg0 -= local29;
			this.anInt842 += local29;
			this.method772();
			@Pc(50) Class1_Sub24 local50 = (Class1_Sub24) this.aClass24_3.method460();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method3435(this);
				if (local58 < 0) {
					local50.anInt4281 = 0;
					this.method770(local50);
				} else {
					local50.anInt4281 = local58;
					this.method771(local50.aClass1_233, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "()V")
	private void method772() {
		if (this.anInt842 <= 0) {
			return;
		}
		for (@Pc(8) Class1_Sub24 local8 = (Class1_Sub24) this.aClass24_3.method460(); local8 != null; local8 = (Class1_Sub24) this.aClass24_3.method464()) {
			local8.anInt4281 -= this.anInt842;
		}
		this.anInt841 -= this.anInt842;
		this.anInt842 = 0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "()Lclient!vc;")
	@Override
	public Class1_Sub4 method4186() {
		return (Class1_Sub4) this.aClass24_2.method464();
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "([III)V")
	private void method773(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class1_Sub4 local5 = (Class1_Sub4) this.aClass24_2.method460(); local5 != null; local5 = (Class1_Sub4) this.aClass24_2.method464()) {
			local5.method4187(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!vc;)V")
	public synchronized void method774(@OriginalArg(0) Class1_Sub4 arg0) {
		arg0.method4616();
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(Lclient!vc;)V")
	public synchronized void method775(@OriginalArg(0) Class1_Sub4 arg0) {
		this.aClass24_2.method466(arg0);
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "()Lclient!vc;")
	@Override
	public Class1_Sub4 method4189() {
		return (Class1_Sub4) this.aClass24_2.method460();
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
	private void method776(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class1_Sub4 local5 = (Class1_Sub4) this.aClass24_2.method460(); local5 != null; local5 = (Class1_Sub4) this.aClass24_2.method464()) {
			local5.method4192(arg0);
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4190(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt841 < 0) {
				this.method773(arg0, arg1, arg2);
				return;
			}
			if (this.anInt842 + arg2 < this.anInt841) {
				this.anInt842 += arg2;
				this.method773(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt841 - this.anInt842;
			this.method773(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt842 += local33;
			this.method772();
			@Pc(60) Class1_Sub24 local60 = (Class1_Sub24) this.aClass24_3.method460();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method3435(this);
				if (local68 < 0) {
					local60.anInt4281 = 0;
					this.method770(local60);
				} else {
					local60.anInt4281 = local68;
					this.method771(local60.aClass1_233, local60);
				}
			}
		} while (arg2 != 0);
	}
}
