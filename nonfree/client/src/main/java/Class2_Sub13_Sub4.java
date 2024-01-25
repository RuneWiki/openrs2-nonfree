import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sga")
public final class Class2_Sub13_Sub4 extends Class2_Sub13 {

	@OriginalMember(owner = "client!sga", name = "o", descriptor = "Lclient!fha;")
	private final Class109 aClass109_61 = new Class109();

	@OriginalMember(owner = "client!sga", name = "p", descriptor = "Lclient!fha;")
	private final Class109 aClass109_62 = new Class109();

	@OriginalMember(owner = "client!sga", name = "q", descriptor = "I")
	private int anInt8583 = 0;

	@OriginalMember(owner = "client!sga", name = "r", descriptor = "I")
	private int anInt8584 = -1;

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)V")
	private void method7224(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub13 local5 = (Class2_Sub13) this.aClass109_61.method2325(); local5 != null; local5 = (Class2_Sub13) this.aClass109_61.method2318()) {
			local5.method8176(arg0);
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8176(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt8584 < 0) {
				this.method7224(arg0);
				return;
			}
			if (this.anInt8583 + arg0 < this.anInt8584) {
				this.anInt8583 += arg0;
				this.method7224(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt8584 - this.anInt8583;
			this.method7224(local29);
			arg0 -= local29;
			this.anInt8583 += local29;
			this.method7228();
			@Pc(50) Class2_Sub3 local50 = (Class2_Sub3) this.aClass109_62.method2325();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method81(this);
				if (local58 < 0) {
					local50.anInt59 = 0;
					this.method7227(local50);
				} else {
					local50.anInt59 = local58;
					this.method7231(local50.aClass2_300, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!ua;)V")
	public synchronized void method7225(@OriginalArg(0) Class2_Sub13 arg0) {
		this.aClass109_61.method2331(arg0);
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(Lclient!ua;)V")
	public synchronized void method7226(@OriginalArg(0) Class2_Sub13 arg0) {
		arg0.method8653();
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "()I")
	@Override
	public int method8175() {
		return 0;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!aba;)V")
	private void method7227(@OriginalArg(0) Class2_Sub3 arg0) {
		arg0.method8653();
		arg0.method80();
		@Pc(9) Class2 local9 = this.aClass109_62.aClass2_78.aClass2_300;
		if (local9 == this.aClass109_62.aClass2_78) {
			this.anInt8584 = -1;
		} else {
			this.anInt8584 = ((Class2_Sub3) local9).anInt59;
		}
	}

	@OriginalMember(owner = "client!sga", name = "e", descriptor = "()V")
	private void method7228() {
		if (this.anInt8583 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub3 local8 = (Class2_Sub3) this.aClass109_62.method2325(); local8 != null; local8 = (Class2_Sub3) this.aClass109_62.method2318()) {
			local8.anInt59 -= this.anInt8583;
		}
		this.anInt8584 -= this.anInt8583;
		this.anInt8583 = 0;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "()Lclient!ua;")
	@Override
	public Class2_Sub13 method8174() {
		return (Class2_Sub13) this.aClass109_61.method2318();
	}

	@OriginalMember(owner = "client!sga", name = "f", descriptor = "()I")
	public synchronized int method7229() {
		return this.aClass109_61.method2320();
	}

	@OriginalMember(owner = "client!sga", name = "d", descriptor = "()Lclient!ua;")
	@Override
	public Class2_Sub13 method8178() {
		return (Class2_Sub13) this.aClass109_61.method2325();
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8180(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt8584 < 0) {
				this.method7230(arg0, arg1, arg2);
				return;
			}
			if (this.anInt8583 + arg2 < this.anInt8584) {
				this.anInt8583 += arg2;
				this.method7230(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt8584 - this.anInt8583;
			this.method7230(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt8583 += local33;
			this.method7228();
			@Pc(60) Class2_Sub3 local60 = (Class2_Sub3) this.aClass109_62.method2325();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method81(this);
				if (local68 < 0) {
					local60.anInt59 = 0;
					this.method7227(local60);
				} else {
					local60.anInt59 = local68;
					this.method7231(local60.aClass2_300, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "([III)V")
	private void method7230(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub13 local5 = (Class2_Sub13) this.aClass109_61.method2325(); local5 != null; local5 = (Class2_Sub13) this.aClass109_61.method2318()) {
			local5.method8179(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!tq;Lclient!aba;)V")
	private void method7231(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub3 arg1) {
		while (arg0 != this.aClass109_62.aClass2_78 && ((Class2_Sub3) arg0).anInt59 <= arg1.anInt59) {
			arg0 = arg0.aClass2_300;
		}
		Static451.method2192(arg1, arg0);
		this.anInt8584 = ((Class2_Sub3) this.aClass109_62.aClass2_78.aClass2_300).anInt59;
	}
}
