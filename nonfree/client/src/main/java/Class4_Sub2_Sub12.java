import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public final class Class4_Sub2_Sub12 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
	public int anInt3971;

	@OriginalMember(owner = "client!ls", name = "v", descriptor = "I")
	public int anInt3973;

	@OriginalMember(owner = "client!ls", name = "w", descriptor = "I")
	public int anInt3974;

	@OriginalMember(owner = "client!ls", name = "z", descriptor = "I")
	public int anInt3977;

	@OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
	public int anInt3978;

	@OriginalMember(owner = "client!ls", name = "q", descriptor = "Lclient!fs;")
	public final Class88 aClass88_2;

	@OriginalMember(owner = "client!ls", name = "u", descriptor = "Lclient!rh;")
	public final Class218 aClass218_1;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!fs;Lclient!hk;)V")
	public Class4_Sub2_Sub12(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class20_Sub3 arg1) {
		this.aClass88_2 = arg0;
		this.aClass218_1 = this.aClass88_2.method1696();
		this.method3164();
	}

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "(I)V")
	public void method3164() {
		this.anInt3977 = this.aClass88_2.anInt2133;
		this.anInt3973 = this.aClass88_2.anInt2130;
		this.anInt3974 = this.aClass88_2.anInt2127;
		if (this.aClass88_2.aClass35_1 != null) {
			this.aClass88_2.aClass35_1.p(this.aClass218_1.anInt5715, this.aClass218_1.anInt5724, this.aClass218_1.anInt5716, Static17.anIntArray16);
		}
		this.anInt3971 = Static17.anIntArray16[0];
		this.anInt3978 = Static17.anIntArray16[2];
	}
}
