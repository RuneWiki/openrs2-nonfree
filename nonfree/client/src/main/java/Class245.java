import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class245 implements Interface4 {

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "Lclient!la;")
	private Class117 aClass117_5;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "Lclient!om;")
	private final Class246 aClass246_182;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "Lclient!ti;")
	private final Class322 aClass322_1;

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "Lclient!om;")
	private final Class246 aClass246_183;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!om;Lclient!om;Lclient!ti;)V")
	public Class245(@OriginalArg(0) Class246 arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class322 arg2) {
		this.aClass246_182 = arg0;
		this.aClass322_1 = arg2;
		this.aClass246_183 = arg1;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7788() {
		@Pc(25) int local25 = this.aClass322_1.aClass300_12.method6502(this.aClass322_1.anInt8077, Static1.anInt7) + this.aClass322_1.anInt8075;
		@Pc(40) int local40 = this.aClass322_1.aClass140_14.method3723(Static283.anInt2480, this.aClass322_1.anInt8078) + this.aClass322_1.anInt8079;
		this.aClass117_5.method7650(this.aClass322_1.anInt8068, local40, null, this.aClass322_1.anInt8069, this.aClass322_1.anInt8071, this.aClass322_1.anInt8078, this.aClass322_1.aString110, null, null, this.aClass322_1.anInt8076, this.aClass322_1.anInt8077, 0, local25, this.aClass322_1.anInt8070, 0);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
	@Override
	public void method7789() {
		@Pc(15) Class58 local15 = Static213.method3761(this.aClass322_1.anInt8072, this.aClass246_183);
		this.aClass117_5 = Static4.aClass43_1.method7139(local15, Static606.method7589(this.aClass246_182, this.aClass322_1.anInt8072));
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7790() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass246_182.method5667(this.aClass322_1.anInt8072)) {
			local5 = false;
		}
		if (!this.aClass246_183.method5667(this.aClass322_1.anInt8072)) {
			local5 = false;
		}
		return local5;
	}
}
