import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class6_Sub17_Sub3 extends Class6_Sub17 {

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "Lclient!tf;")
	private final Class340 aClass340_38 = new Class340();

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "Lclient!tf;")
	private final Class340 aClass340_39 = new Class340();

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
	private int anInt5094 = -1;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
	private int anInt5093 = 0;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8139(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt5094 < 0) {
				this.method4659(arg0, arg1, arg2);
				return;
			}
			if (this.anInt5093 + arg2 < this.anInt5094) {
				this.anInt5093 += arg2;
				this.method4659(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt5094 - this.anInt5093;
			this.method4659(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt5093 += local33;
			this.method4657();
			@Pc(60) Class6_Sub34 local60 = (Class6_Sub34) this.aClass340_39.method8124();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method5514(this);
				if (local68 < 0) {
					local60.anInt6124 = 0;
					this.method4656(local60);
				} else {
					local60.anInt6124 = local68;
					this.method4662(local60.aClass6_339, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8144(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt5094 < 0) {
				this.method4660(arg0);
				return;
			}
			if (this.anInt5093 + arg0 < this.anInt5094) {
				this.anInt5093 += arg0;
				this.method4660(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt5094 - this.anInt5093;
			this.method4660(local29);
			arg0 -= local29;
			this.anInt5093 += local29;
			this.method4657();
			@Pc(50) Class6_Sub34 local50 = (Class6_Sub34) this.aClass340_39.method8124();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method5514(this);
				if (local58 < 0) {
					local50.anInt6124 = 0;
					this.method4656(local50);
				} else {
					local50.anInt6124 = local58;
					this.method4662(local50.aClass6_339, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!ma;)V")
	private void method4656(@OriginalArg(0) Class6_Sub34 arg0) {
		arg0.method9051();
		arg0.method5515();
		@Pc(9) Class6 local9 = this.aClass340_39.aClass6_283.aClass6_339;
		if (local9 == this.aClass340_39.aClass6_283) {
			this.anInt5094 = -1;
		} else {
			this.anInt5094 = ((Class6_Sub34) local9).anInt6124;
		}
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "()V")
	private void method4657() {
		if (this.anInt5093 <= 0) {
			return;
		}
		for (@Pc(8) Class6_Sub34 local8 = (Class6_Sub34) this.aClass340_39.method8124(); local8 != null; local8 = (Class6_Sub34) this.aClass340_39.method8134()) {
			local8.anInt6124 -= this.anInt5093;
		}
		this.anInt5094 -= this.anInt5093;
		this.anInt5093 = 0;
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "()I")
	public synchronized int method4658() {
		return this.aClass340_38.method8128();
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "([III)V")
	private void method4659(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class6_Sub17 local5 = (Class6_Sub17) this.aClass340_38.method8124(); local5 != null; local5 = (Class6_Sub17) this.aClass340_38.method8134()) {
			local5.method8145(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "()Lclient!jn;")
	@Override
	public Class6_Sub17 method8140() {
		return (Class6_Sub17) this.aClass340_38.method8124();
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
	private void method4660(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class6_Sub17 local5 = (Class6_Sub17) this.aClass340_38.method8124(); local5 != null; local5 = (Class6_Sub17) this.aClass340_38.method8134()) {
			local5.method8144(arg0);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!jn;)V")
	public synchronized void method4661(@OriginalArg(0) Class6_Sub17 arg0) {
		this.aClass340_38.method8130(arg0);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!wb;Lclient!ma;)V")
	private void method4662(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6_Sub34 arg1) {
		while (arg0 != this.aClass340_39.aClass6_283 && ((Class6_Sub34) arg0).anInt6124 <= arg1.anInt6124) {
			arg0 = arg0.aClass6_339;
		}
		Static201.method3741(arg0, arg1);
		this.anInt5094 = ((Class6_Sub34) this.aClass340_39.aClass6_283.aClass6_339).anInt6124;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "()Lclient!jn;")
	@Override
	public Class6_Sub17 method8143() {
		return (Class6_Sub17) this.aClass340_38.method8134();
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(Lclient!jn;)V")
	public synchronized void method4663(@OriginalArg(0) Class6_Sub17 arg0) {
		arg0.method9051();
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "()I")
	@Override
	public int method8141() {
		return 0;
	}
}
