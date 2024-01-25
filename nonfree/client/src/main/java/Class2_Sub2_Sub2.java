import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "Lclient!nt;")
	private final Class238 aClass238_6 = new Class238();

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "Lclient!nt;")
	private final Class238 aClass238_7 = new Class238();

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
	private int anInt1168 = -1;

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
	private int anInt1169 = 0;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "()I")
	@Override
	public int method7541() {
		return 0;
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "()Lclient!ep;")
	@Override
	public Class2_Sub2 method7542() {
		return (Class2_Sub2) this.aClass238_6.method5838();
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "([III)V")
	private void method1038(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub2 local5 = (Class2_Sub2) this.aClass238_6.method5833(); local5 != null; local5 = (Class2_Sub2) this.aClass238_6.method5838()) {
			local5.method7540(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "()V")
	private void method1039() {
		if (this.anInt1169 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub9 local8 = (Class2_Sub9) this.aClass238_7.method5833(); local8 != null; local8 = (Class2_Sub9) this.aClass238_7.method5838()) {
			local8.anInt1044 -= this.anInt1169;
		}
		this.anInt1168 -= this.anInt1169;
		this.anInt1169 = 0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!bp;)V")
	private void method1040(@OriginalArg(0) Class2_Sub9 arg0) {
		arg0.method8599();
		arg0.method936();
		@Pc(9) Class2 local9 = this.aClass238_7.aClass2_201.aClass2_300;
		if (local9 == this.aClass238_7.aClass2_201) {
			this.anInt1168 = -1;
		} else {
			this.anInt1168 = ((Class2_Sub9) local9).anInt1044;
		}
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "()I")
	public synchronized int method1041() {
		return this.aClass238_6.method5842();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ep;)V")
	public synchronized void method1042(@OriginalArg(0) Class2_Sub2 arg0) {
		arg0.method8599();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!tq;Lclient!bp;)V")
	private void method1043(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub9 arg1) {
		while (arg0 != this.aClass238_7.aClass2_201 && ((Class2_Sub9) arg0).anInt1044 <= arg1.anInt1044) {
			arg0 = arg0.aClass2_300;
		}
		Static146.method2811(arg1, arg0);
		this.anInt1168 = ((Class2_Sub9) this.aClass238_7.aClass2_201.aClass2_300).anInt1044;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7538(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt1168 < 0) {
				this.method1038(arg0, arg1, arg2);
				return;
			}
			if (this.anInt1169 + arg2 < this.anInt1168) {
				this.anInt1169 += arg2;
				this.method1038(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt1168 - this.anInt1169;
			this.method1038(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1169 += local33;
			this.method1039();
			@Pc(60) Class2_Sub9 local60 = (Class2_Sub9) this.aClass238_7.method5833();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method935(this);
				if (local68 < 0) {
					local60.anInt1044 = 0;
					this.method1040(local60);
				} else {
					local60.anInt1044 = local68;
					this.method1043(local60.aClass2_300, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lclient!ep;)V")
	public synchronized void method1044(@OriginalArg(0) Class2_Sub2 arg0) {
		this.aClass238_6.method5835(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()Lclient!ep;")
	@Override
	public Class2_Sub2 method7539() {
		return (Class2_Sub2) this.aClass238_6.method5833();
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	private void method1045(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub2 local5 = (Class2_Sub2) this.aClass238_6.method5833(); local5 != null; local5 = (Class2_Sub2) this.aClass238_6.method5838()) {
			local5.method7544(arg0);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7544(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1168 < 0) {
				this.method1045(arg0);
				return;
			}
			if (this.anInt1169 + arg0 < this.anInt1168) {
				this.anInt1169 += arg0;
				this.method1045(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1168 - this.anInt1169;
			this.method1045(local29);
			arg0 -= local29;
			this.anInt1169 += local29;
			this.method1039();
			@Pc(50) Class2_Sub9 local50 = (Class2_Sub9) this.aClass238_7.method5833();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method935(this);
				if (local58 < 0) {
					local50.anInt1044 = 0;
					this.method1040(local50);
				} else {
					local50.anInt1044 = local58;
					this.method1043(local50.aClass2_300, local50);
				}
			}
		} while (arg0 != 0);
	}
}
