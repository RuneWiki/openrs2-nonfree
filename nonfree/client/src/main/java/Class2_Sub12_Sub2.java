import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class2_Sub12_Sub2 extends Class2_Sub12 {

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "Lclient!rk;")
	private final Class249 aClass249_12 = new Class249();

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "Lclient!rk;")
	private final Class249 aClass249_13 = new Class249();

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
	private int anInt2115 = -1;

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
	private int anInt2116 = 0;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!ft;)V")
	public synchronized void method2086(@OriginalArg(0) Class2_Sub12 arg0) {
		this.aClass249_12.method6520(arg0);
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "()Lclient!ft;")
	@Override
	public Class2_Sub12 method7195() {
		return (Class2_Sub12) this.aClass249_12.method6527();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!ov;)V")
	private void method2087(@OriginalArg(0) Class2_Sub36 arg0) {
		arg0.method7802();
		arg0.method5789();
		@Pc(9) Class2 local9 = this.aClass249_13.aClass2_224.aClass2_284;
		if (local9 == this.aClass249_13.aClass2_224) {
			this.anInt2115 = -1;
		} else {
			this.anInt2115 = ((Class2_Sub36) local9).anInt6800;
		}
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "()Lclient!ft;")
	@Override
	public Class2_Sub12 method7196() {
		return (Class2_Sub12) this.aClass249_12.method6525();
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(Lclient!ft;)V")
	public synchronized void method2088(@OriginalArg(0) Class2_Sub12 arg0) {
		arg0.method7802();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!jd;Lclient!ov;)V")
	private void method2089(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub36 arg1) {
		while (arg0 != this.aClass249_13.aClass2_224 && ((Class2_Sub36) arg0).anInt6800 <= arg1.anInt6800) {
			arg0 = arg0.aClass2_284;
		}
		Static270.method7136(arg0, arg1);
		this.anInt2115 = ((Class2_Sub36) this.aClass249_13.aClass2_224.aClass2_284).anInt6800;
	}

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "()I")
	public synchronized int method2090() {
		return this.aClass249_12.method6522();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7193(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2115 < 0) {
				this.method2091(arg0);
				return;
			}
			if (this.anInt2116 + arg0 < this.anInt2115) {
				this.anInt2116 += arg0;
				this.method2091(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2115 - this.anInt2116;
			this.method2091(local29);
			arg0 -= local29;
			this.anInt2116 += local29;
			this.method2093();
			@Pc(50) Class2_Sub36 local50 = (Class2_Sub36) this.aClass249_13.method6527();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method5790(this);
				if (local58 < 0) {
					local50.anInt6800 = 0;
					this.method2087(local50);
				} else {
					local50.anInt6800 = local58;
					this.method2089(local50.aClass2_284, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7192(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt2115 < 0) {
				this.method2092(arg0, arg1, arg2);
				return;
			}
			if (this.anInt2116 + arg2 < this.anInt2115) {
				this.anInt2116 += arg2;
				this.method2092(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt2115 - this.anInt2116;
			this.method2092(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2116 += local33;
			this.method2093();
			@Pc(60) Class2_Sub36 local60 = (Class2_Sub36) this.aClass249_13.method6527();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method5790(this);
				if (local68 < 0) {
					local60.anInt6800 = 0;
					this.method2087(local60);
				} else {
					local60.anInt6800 = local68;
					this.method2089(local60.aClass2_284, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "()I")
	@Override
	public int method7191() {
		return 0;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
	private void method2091(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub12 local5 = (Class2_Sub12) this.aClass249_12.method6527(); local5 != null; local5 = (Class2_Sub12) this.aClass249_12.method6525()) {
			local5.method7193(arg0);
		}
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "([III)V")
	private void method2092(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub12 local5 = (Class2_Sub12) this.aClass249_12.method6527(); local5 != null; local5 = (Class2_Sub12) this.aClass249_12.method6525()) {
			local5.method7194(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "()V")
	private void method2093() {
		if (this.anInt2116 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub36 local8 = (Class2_Sub36) this.aClass249_13.method6527(); local8 != null; local8 = (Class2_Sub36) this.aClass249_13.method6525()) {
			local8.anInt6800 -= this.anInt2116;
		}
		this.anInt2115 -= this.anInt2116;
		this.anInt2116 = 0;
	}
}
