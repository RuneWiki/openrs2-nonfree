import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class5_Sub2_Sub2 extends Class5_Sub2 {

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "Lclient!pb;")
	private final Class52 aClass52_8 = new Class52();

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "Lclient!pb;")
	private final Class52 aClass52_9 = new Class52();

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
	private int anInt1632 = -1;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
	private int anInt1631 = 0;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "()Lclient!eb;")
	@Override
	public Class5_Sub2 method1115() {
		return (Class5_Sub2) this.aClass52_8.method1358();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1113(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1632 < 0) {
				this.method1119(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1631 + arg2 < this.anInt1632) {
				this.anInt1631 += arg2;
				this.method1119(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1632 - this.anInt1631;
			this.method1119(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1631 += local33;
			this.method1123();
			@Pc(60) Class5_Sub12 local60 = (Class5_Sub12) this.aClass52_9.method1358();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1624(this);
				if (local68 < 0) {
					local60.anInt2351 = 0;
					this.method1125(local60);
				} else {
					local60.anInt2351 = local68;
					this.method1122(local60.aClass5_106, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1117(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1632 < 0) {
				this.method1120(arg0);
				return;
			}
			if (this.anInt1631 + arg0 < this.anInt1632) {
				this.anInt1631 += arg0;
				this.method1120(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1632 - this.anInt1631;
			this.method1120(local29);
			arg0 -= local29;
			this.anInt1631 += local29;
			this.method1123();
			@Pc(50) Class5_Sub12 local50 = (Class5_Sub12) this.aClass52_9.method1358();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1624(this);
				if (local58 < 0) {
					local50.anInt2351 = 0;
					this.method1125(local50);
				} else {
					local50.anInt2351 = local58;
					this.method1122(local50.aClass5_106, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "([III)V")
	private void method1119(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class5_Sub2 local5 = (Class5_Sub2) this.aClass52_8.method1358(); local5 != null; local5 = (Class5_Sub2) this.aClass52_8.method1363()) {
			local5.method1118(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	private void method1120(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class5_Sub2 local5 = (Class5_Sub2) this.aClass52_8.method1358(); local5 != null; local5 = (Class5_Sub2) this.aClass52_8.method1363()) {
			local5.method1117(arg0);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!eb;)V")
	public synchronized void method1121(@OriginalArg(0) Class5_Sub2 arg0) {
		arg0.method2002();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "()I")
	@Override
	public int method1112() {
		return 0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!qc;Lclient!sb;)V")
	private void method1122(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5_Sub12 arg1) {
		while (arg0 != this.aClass52_9.aClass5_65 && ((Class5_Sub12) arg0).anInt2351 <= arg1.anInt2351) {
			arg0 = arg0.aClass5_106;
		}
		this.aClass52_9.method1364(arg1, arg0);
		this.anInt1632 = ((Class5_Sub12) this.aClass52_9.aClass5_65.aClass5_106).anInt2351;
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "()V")
	private void method1123() {
		if (this.anInt1631 <= 0) {
			return;
		}
		for (@Pc(8) Class5_Sub12 local8 = (Class5_Sub12) this.aClass52_9.method1358(); local8 != null; local8 = (Class5_Sub12) this.aClass52_9.method1363()) {
			local8.anInt2351 -= this.anInt1631;
		}
		this.anInt1632 -= this.anInt1631;
		this.anInt1631 = 0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "()Lclient!eb;")
	@Override
	public Class5_Sub2 method1114() {
		return (Class5_Sub2) this.aClass52_8.method1363();
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Lclient!eb;)V")
	public synchronized void method1124(@OriginalArg(0) Class5_Sub2 arg0) {
		this.aClass52_8.method1354(arg0);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!sb;)V")
	private void method1125(@OriginalArg(0) Class5_Sub12 arg0) {
		arg0.method2002();
		arg0.method1625();
		@Pc(9) Class5 local9 = this.aClass52_9.aClass5_65.aClass5_106;
		if (local9 == this.aClass52_9.aClass5_65) {
			this.anInt1632 = -1;
		} else {
			this.anInt1632 = ((Class5_Sub12) local9).anInt2351;
		}
	}
}
