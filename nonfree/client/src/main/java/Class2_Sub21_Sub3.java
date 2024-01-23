import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class2_Sub21_Sub3 extends Class2_Sub21 {

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "Lclient!he;")
	private Class44 aClass44_53 = new Class44();

	@OriginalMember(owner = "client!sc", name = "A", descriptor = "Lclient!he;")
	private Class44 aClass44_54 = new Class44();

	@OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
	private int anInt4284 = -1;

	@OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
	private int anInt4285 = 0;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "()V")
	private void method3386() {
		if (this.anInt4285 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub19 local8 = (Class2_Sub19) this.aClass44_54.method1359(); local8 != null; local8 = (Class2_Sub19) this.aClass44_54.method1356()) {
			local8.anInt2089 -= this.anInt4285;
		}
		this.anInt4284 -= this.anInt4285;
		this.anInt4285 = 0;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "([III)V")
	private void method3387(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub21 local5 = (Class2_Sub21) this.aClass44_53.method1359(); local5 != null; local5 = (Class2_Sub21) this.aClass44_53.method1356()) {
			local5.method3839(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lc;)V")
	public synchronized void method3388(@OriginalArg(0) Class2_Sub21 arg0) {
		this.aClass44_53.method1354(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!ii;)V")
	private void method3389(@OriginalArg(0) Class2_Sub19 arg0) {
		arg0.method3986();
		arg0.method1660();
		@Pc(9) Class2 local9 = this.aClass44_54.aClass2_83.aClass2_219;
		if (local9 == this.aClass44_54.aClass2_83) {
			this.anInt4284 = -1;
		} else {
			this.anInt4284 = ((Class2_Sub19) local9).anInt2089;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "()Lclient!lc;")
	@Override
	public Class2_Sub21 method3840() {
		return (Class2_Sub21) this.aClass44_53.method1359();
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!lc;)V")
	public synchronized void method3390(@OriginalArg(0) Class2_Sub21 arg0) {
		arg0.method3986();
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method3845(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt4284 < 0) {
				this.method3391(arg0);
				return;
			}
			if (this.anInt4285 + arg0 < this.anInt4284) {
				this.anInt4285 += arg0;
				this.method3391(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt4284 - this.anInt4285;
			this.method3391(local29);
			arg0 -= local29;
			this.anInt4285 += local29;
			this.method3386();
			@Pc(50) Class2_Sub19 local50 = (Class2_Sub19) this.aClass44_54.method1359();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1659(this);
				if (local58 < 0) {
					local50.anInt2089 = 0;
					this.method3389(local50);
				} else {
					local50.anInt2089 = local58;
					this.method3392(local50.aClass2_219, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "()Lclient!lc;")
	@Override
	public Class2_Sub21 method3842() {
		return (Class2_Sub21) this.aClass44_53.method1356();
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V")
	private void method3391(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub21 local5 = (Class2_Sub21) this.aClass44_53.method1359(); local5 != null; local5 = (Class2_Sub21) this.aClass44_53.method1356()) {
			local5.method3845(arg0);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!lf;Lclient!ii;)V")
	private void method3392(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub19 arg1) {
		while (arg0 != this.aClass44_54.aClass2_83 && ((Class2_Sub19) arg0).anInt2089 <= arg1.anInt2089) {
			arg0 = arg0.aClass2_219;
		}
		this.aClass44_54.method1358(arg1, arg0);
		this.anInt4284 = ((Class2_Sub19) this.aClass44_54.aClass2_83.aClass2_219).anInt2089;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3844(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt4284 < 0) {
				this.method3387(arg0, arg1, arg2);
				return;
			}
			if (this.anInt4285 + arg2 < this.anInt4284) {
				this.anInt4285 += arg2;
				this.method3387(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt4284 - this.anInt4285;
			this.method3387(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt4285 += local33;
			this.method3386();
			@Pc(60) Class2_Sub19 local60 = (Class2_Sub19) this.aClass44_54.method1359();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1659(this);
				if (local68 < 0) {
					local60.anInt2089 = 0;
					this.method3389(local60);
				} else {
					local60.anInt2089 = local68;
					this.method3392(local60.aClass2_219, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "()I")
	@Override
	public int method3843() {
		return 0;
	}
}
