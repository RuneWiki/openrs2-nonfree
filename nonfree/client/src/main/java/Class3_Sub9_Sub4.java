import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class3_Sub9_Sub4 extends Class3_Sub9 {

	@OriginalMember(owner = "client!qe", name = "v", descriptor = "Lclient!sc;")
	private final Class72 aClass72_41 = new Class72();

	@OriginalMember(owner = "client!qe", name = "w", descriptor = "Lclient!sc;")
	private final Class72 aClass72_42 = new Class72();

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
	private int anInt3073 = 0;

	@OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
	private int anInt3074 = -1;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "()I")
	@Override
	public int method2214() {
		return 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!tb;)V")
	public synchronized void method2221(@OriginalArg(0) Class3_Sub9 arg0) {
		arg0.method2783();
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method2215(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt3074 < 0) {
				this.method2227(arg0);
				return;
			}
			if (this.anInt3073 + arg0 < this.anInt3074) {
				this.anInt3073 += arg0;
				this.method2227(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt3074 - this.anInt3073;
			this.method2227(local29);
			arg0 -= local29;
			this.anInt3073 += local29;
			this.method2224();
			@Pc(50) Class3_Sub25 local50 = (Class3_Sub25) this.aClass72_42.method2401();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method2582(this);
				if (local58 < 0) {
					local50.anInt3570 = 0;
					this.method2226(local50);
				} else {
					local50.anInt3570 = local58;
					this.method2222(local50.aClass3_210, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!od;Lclient!uf;)V")
	private void method2222(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub25 arg1) {
		while (arg0 != this.aClass72_42.aClass3_177 && ((Class3_Sub25) arg0).anInt3570 <= arg1.anInt3570) {
			arg0 = arg0.aClass3_210;
		}
		this.aClass72_42.method2405(arg1, arg0);
		this.anInt3074 = ((Class3_Sub25) this.aClass72_42.aClass3_177.aClass3_210).anInt3570;
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "()Lclient!tb;")
	@Override
	public Class3_Sub9 method2219() {
		return (Class3_Sub9) this.aClass72_41.method2401();
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Lclient!tb;)V")
	public synchronized void method2223(@OriginalArg(0) Class3_Sub9 arg0) {
		this.aClass72_41.method2397(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "()V")
	private void method2224() {
		if (this.anInt3073 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub25 local8 = (Class3_Sub25) this.aClass72_42.method2401(); local8 != null; local8 = (Class3_Sub25) this.aClass72_42.method2407()) {
			local8.anInt3570 -= this.anInt3073;
		}
		this.anInt3074 -= this.anInt3073;
		this.anInt3073 = 0;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "([III)V")
	private void method2225(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub9 local5 = (Class3_Sub9) this.aClass72_41.method2401(); local5 != null; local5 = (Class3_Sub9) this.aClass72_41.method2407()) {
			local5.method2216(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "()Lclient!tb;")
	@Override
	public Class3_Sub9 method2218() {
		return (Class3_Sub9) this.aClass72_41.method2407();
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2220(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt3074 < 0) {
				this.method2225(arg0, arg1, arg2);
				return;
			}
			if (this.anInt3073 + arg2 < this.anInt3074) {
				this.anInt3073 += arg2;
				this.method2225(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt3074 - this.anInt3073;
			this.method2225(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt3073 += local33;
			this.method2224();
			@Pc(60) Class3_Sub25 local60 = (Class3_Sub25) this.aClass72_42.method2401();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method2582(this);
				if (local68 < 0) {
					local60.anInt3570 = 0;
					this.method2226(local60);
				} else {
					local60.anInt3570 = local68;
					this.method2222(local60.aClass3_210, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!uf;)V")
	private void method2226(@OriginalArg(0) Class3_Sub25 arg0) {
		arg0.method2783();
		arg0.method2583();
		@Pc(9) Class3 local9 = this.aClass72_42.aClass3_177.aClass3_210;
		if (local9 == this.aClass72_42.aClass3_177) {
			this.anInt3074 = -1;
		} else {
			this.anInt3074 = ((Class3_Sub25) local9).anInt3570;
		}
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V")
	private void method2227(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub9 local5 = (Class3_Sub9) this.aClass72_41.method2401(); local5 != null; local5 = (Class3_Sub9) this.aClass72_41.method2407()) {
			local5.method2215(arg0);
		}
	}
}
