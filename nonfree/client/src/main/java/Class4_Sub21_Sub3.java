import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class4_Sub21_Sub3 extends Class4_Sub21 {

	@OriginalMember(owner = "client!op", name = "u", descriptor = "Lclient!au;")
	private final Class22 aClass22_50 = new Class22();

	@OriginalMember(owner = "client!op", name = "v", descriptor = "Lclient!au;")
	private final Class22 aClass22_51 = new Class22();

	@OriginalMember(owner = "client!op", name = "x", descriptor = "I")
	private int anInt7534 = 0;

	@OriginalMember(owner = "client!op", name = "w", descriptor = "I")
	private int anInt7533 = -1;

	@OriginalMember(owner = "client!op", name = "e", descriptor = "()V")
	private void method5925() {
		if (this.anInt7534 <= 0) {
			return;
		}
		for (@Pc(8) Class4_Sub26 local8 = (Class4_Sub26) this.aClass22_51.method895(); local8 != null; local8 = (Class4_Sub26) this.aClass22_51.method889()) {
			local8.anInt4557 -= this.anInt7534;
		}
		this.anInt7533 -= this.anInt7534;
		this.anInt7534 = 0;
	}

	@OriginalMember(owner = "client!op", name = "d", descriptor = "()Lclient!nr;")
	@Override
	public Class4_Sub21 method6162() {
		return (Class4_Sub21) this.aClass22_50.method889();
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "()I")
	@Override
	public int method6160() {
		return 0;
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "([III)V")
	private void method5926(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class4_Sub21 local5 = (Class4_Sub21) this.aClass22_50.method895(); local5 != null; local5 = (Class4_Sub21) this.aClass22_50.method889()) {
			local5.method6159(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!nr;)V")
	public synchronized void method5927(@OriginalArg(0) Class4_Sub21 arg0) {
		this.aClass22_50.method892(arg0);
	}

	@OriginalMember(owner = "client!op", name = "f", descriptor = "()I")
	public synchronized int method5928() {
		return this.aClass22_50.method880();
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
	private void method5929(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4_Sub21 local5 = (Class4_Sub21) this.aClass22_50.method895(); local5 != null; local5 = (Class4_Sub21) this.aClass22_50.method889()) {
			local5.method6156(arg0);
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!ih;)V")
	private void method5930(@OriginalArg(0) Class4_Sub26 arg0) {
		arg0.method8193();
		arg0.method3526();
		@Pc(9) Class4 local9 = this.aClass22_51.aClass4_13.aClass4_286;
		if (local9 == this.aClass22_51.aClass4_13) {
			this.anInt7533 = -1;
		} else {
			this.anInt7533 = ((Class4_Sub26) local9).anInt4557;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6158(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt7533 < 0) {
				this.method5926(arg0, arg1, arg2);
				return;
			}
			if (this.anInt7534 + arg2 < this.anInt7533) {
				this.anInt7534 += arg2;
				this.method5926(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt7533 - this.anInt7534;
			this.method5926(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt7534 += local33;
			this.method5925();
			@Pc(60) Class4_Sub26 local60 = (Class4_Sub26) this.aClass22_51.method895();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method3525(this);
				if (local68 < 0) {
					local60.anInt4557 = 0;
					this.method5930(local60);
				} else {
					local60.anInt4557 = local68;
					this.method5932(local60.aClass4_286, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "()Lclient!nr;")
	@Override
	public Class4_Sub21 method6157() {
		return (Class4_Sub21) this.aClass22_50.method895();
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6156(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt7533 < 0) {
				this.method5929(arg0);
				return;
			}
			if (this.anInt7534 + arg0 < this.anInt7533) {
				this.anInt7534 += arg0;
				this.method5929(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt7533 - this.anInt7534;
			this.method5929(local29);
			arg0 -= local29;
			this.anInt7534 += local29;
			this.method5925();
			@Pc(50) Class4_Sub26 local50 = (Class4_Sub26) this.aClass22_51.method895();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method3525(this);
				if (local58 < 0) {
					local50.anInt4557 = 0;
					this.method5930(local50);
				} else {
					local50.anInt4557 = local58;
					this.method5932(local50.aClass4_286, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(Lclient!nr;)V")
	public synchronized void method5931(@OriginalArg(0) Class4_Sub21 arg0) {
		arg0.method8193();
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!tv;Lclient!ih;)V")
	private void method5932(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4_Sub26 arg1) {
		while (arg0 != this.aClass22_51.aClass4_13 && ((Class4_Sub26) arg0).anInt4557 <= arg1.anInt4557) {
			arg0 = arg0.aClass4_286;
		}
		Static246.method3938(arg1, arg0);
		this.anInt7533 = ((Class4_Sub26) this.aClass22_51.aClass4_13.aClass4_286).anInt4557;
	}
}
