import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class3_Sub2_Sub2 extends Class3_Sub2 {

	@OriginalMember(owner = "client!f", name = "o", descriptor = "Lclient!m;")
	private final Class127 aClass127_4 = new Class127();

	@OriginalMember(owner = "client!f", name = "p", descriptor = "Lclient!m;")
	private final Class127 aClass127_5 = new Class127();

	@OriginalMember(owner = "client!f", name = "r", descriptor = "I")
	private int anInt1698 = 0;

	@OriginalMember(owner = "client!f", name = "q", descriptor = "I")
	private int anInt1697 = -1;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "([III)V")
	private void method1364(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class3_Sub2 local5 = (Class3_Sub2) this.aClass127_4.method3402(); local5 != null; local5 = (Class3_Sub2) this.aClass127_4.method3400()) {
			local5.method5107(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ob;Lclient!r;)V")
	private void method1365(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub36 arg1) {
		while (arg0 != this.aClass127_5.aClass3_156 && ((Class3_Sub36) arg0).anInt5265 <= arg1.anInt5265) {
			arg0 = arg0.aClass3_248;
		}
		Static109.method1874(arg0, arg1);
		this.anInt1697 = ((Class3_Sub36) this.aClass127_5.aClass3_156.aClass3_248).anInt5265;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!mq;)V")
	public synchronized void method1366(@OriginalArg(0) Class3_Sub2 arg0) {
		this.aClass127_4.method3403(arg0);
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Lclient!mq;)V")
	public synchronized void method1367(@OriginalArg(0) Class3_Sub2 arg0) {
		arg0.method5717();
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5109(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1697 < 0) {
				this.method1364(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1698 + arg2 < this.anInt1697) {
				this.anInt1698 += arg2;
				this.method1364(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1697 - this.anInt1698;
			this.method1364(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1698 += local33;
			this.method1368();
			@Pc(60) Class3_Sub36 local60 = (Class3_Sub36) this.aClass127_5.method3402();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method4425(this);
				if (local68 < 0) {
					local60.anInt5265 = 0;
					this.method1369(local60);
				} else {
					local60.anInt5265 = local68;
					this.method1365(local60.aClass3_248, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "()V")
	private void method1368() {
		if (this.anInt1698 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub36 local8 = (Class3_Sub36) this.aClass127_5.method3402(); local8 != null; local8 = (Class3_Sub36) this.aClass127_5.method3400()) {
			local8.anInt5265 -= this.anInt1698;
		}
		this.anInt1697 -= this.anInt1698;
		this.anInt1698 = 0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!r;)V")
	private void method1369(@OriginalArg(0) Class3_Sub36 arg0) {
		arg0.method5717();
		arg0.method4424();
		@Pc(9) Class3 local9 = this.aClass127_5.aClass3_156.aClass3_248;
		if (local9 == this.aClass127_5.aClass3_156) {
			this.anInt1697 = -1;
		} else {
			this.anInt1697 = ((Class3_Sub36) local9).anInt5265;
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
	private void method1370(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class3_Sub2 local5 = (Class3_Sub2) this.aClass127_4.method3402(); local5 != null; local5 = (Class3_Sub2) this.aClass127_4.method3400()) {
			local5.method5108(arg0);
		}
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "()I")
	@Override
	public int method5113() {
		return 0;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "()Lclient!mq;")
	@Override
	public Class3_Sub2 method5111() {
		return (Class3_Sub2) this.aClass127_4.method3400();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "()Lclient!mq;")
	@Override
	public Class3_Sub2 method5110() {
		return (Class3_Sub2) this.aClass127_4.method3402();
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method5108(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1697 < 0) {
				this.method1370(arg0);
				return;
			}
			if (this.anInt1698 + arg0 < this.anInt1697) {
				this.anInt1698 += arg0;
				this.method1370(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1697 - this.anInt1698;
			this.method1370(local29);
			arg0 -= local29;
			this.anInt1698 += local29;
			this.method1368();
			@Pc(50) Class3_Sub36 local50 = (Class3_Sub36) this.aClass127_5.method3402();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method4425(this);
				if (local58 < 0) {
					local50.anInt5265 = 0;
					this.method1369(local50);
				} else {
					local50.anInt5265 = local58;
					this.method1365(local50.aClass3_248, local50);
				}
			}
		} while (arg0 != 0);
	}
}
