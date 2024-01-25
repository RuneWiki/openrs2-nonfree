import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class4_Sub1_Sub3 extends Class4_Sub1 {

	@OriginalMember(owner = "client!lk", name = "s", descriptor = "Lclient!kn;")
	private final Class116 aClass116_31 = new Class116();

	@OriginalMember(owner = "client!lk", name = "t", descriptor = "Lclient!kn;")
	private final Class116 aClass116_32 = new Class116();

	@OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
	private int anInt3862 = 0;

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
	private int anInt3863 = -1;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!kb;)V")
	public synchronized void method3505(@OriginalArg(0) Class4_Sub1 arg0) {
		this.aClass116_31.method3276(arg0);
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "([III)V")
	private void method3506(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class4_Sub1 local5 = (Class4_Sub1) this.aClass116_31.method3270(); local5 != null; local5 = (Class4_Sub1) this.aClass116_31.method3272()) {
			local5.method3785(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3781(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3863 < 0) {
				this.method3506(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3862 + arg2 < this.anInt3863) {
				this.anInt3862 += arg2;
				this.method3506(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3863 - this.anInt3862;
			this.method3506(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3862 += local33;
			this.method3508();
			@Pc(60) Class4_Sub31 local60 = (Class4_Sub31) this.aClass116_32.method3270();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method4099(this);
				if (local68 < 0) {
					local60.anInt4638 = 0;
					this.method3509(local60);
				} else {
					local60.anInt4638 = local68;
					this.method3511(local60.aClass4_252, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V")
	private void method3507(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class4_Sub1 local5 = (Class4_Sub1) this.aClass116_31.method3270(); local5 != null; local5 = (Class4_Sub1) this.aClass116_31.method3272()) {
			local5.method3783(arg0);
		}
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "()V")
	private void method3508() {
		if (this.anInt3862 <= 0) {
			return;
		}
		for (@Pc(8) Class4_Sub31 local8 = (Class4_Sub31) this.aClass116_32.method3270(); local8 != null; local8 = (Class4_Sub31) this.aClass116_32.method3272()) {
			local8.anInt4638 -= this.anInt3862;
		}
		this.anInt3863 -= this.anInt3862;
		this.anInt3862 = 0;
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "()I")
	@Override
	public int method3786() {
		return 0;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!ol;)V")
	private void method3509(@OriginalArg(0) Class4_Sub31 arg0) {
		arg0.method5687();
		arg0.method4100();
		@Pc(9) Class4 local9 = this.aClass116_32.aClass4_121.aClass4_252;
		if (local9 == this.aClass116_32.aClass4_121) {
			this.anInt3863 = -1;
		} else {
			this.anInt3863 = ((Class4_Sub31) local9).anInt4638;
		}
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "()Lclient!kb;")
	@Override
	public Class4_Sub1 method3787() {
		return (Class4_Sub1) this.aClass116_31.method3272();
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(Lclient!kb;)V")
	public synchronized void method3510(@OriginalArg(0) Class4_Sub1 arg0) {
		arg0.method5687();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method3783(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3863 < 0) {
				this.method3507(arg0);
				return;
			}
			if (this.anInt3862 + arg0 < this.anInt3863) {
				this.anInt3862 += arg0;
				this.method3507(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3863 - this.anInt3862;
			this.method3507(local29);
			arg0 -= local29;
			this.anInt3862 += local29;
			this.method3508();
			@Pc(50) Class4_Sub31 local50 = (Class4_Sub31) this.aClass116_32.method3270();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method4099(this);
				if (local58 < 0) {
					local50.anInt4638 = 0;
					this.method3509(local50);
				} else {
					local50.anInt4638 = local58;
					this.method3511(local50.aClass4_252, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "()Lclient!kb;")
	@Override
	public Class4_Sub1 method3784() {
		return (Class4_Sub1) this.aClass116_31.method3270();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!ge;Lclient!ol;)V")
	private void method3511(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4_Sub31 arg1) {
		while (arg0 != this.aClass116_32.aClass4_121 && ((Class4_Sub31) arg0).anInt4638 <= arg1.anInt4638) {
			arg0 = arg0.aClass4_252;
		}
		Static262.method4565(arg1, arg0);
		this.anInt3863 = ((Class4_Sub31) this.aClass116_32.aClass4_121.aClass4_252).anInt4638;
	}
}
