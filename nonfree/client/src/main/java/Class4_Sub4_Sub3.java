import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public final class Class4_Sub4_Sub3 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ep", name = "B", descriptor = "I")
	public int anInt2060;

	@OriginalMember(owner = "client!ep", name = "I", descriptor = "I")
	public int anInt2062;

	@OriginalMember(owner = "client!ep", name = "N", descriptor = "I")
	public int anInt2065;

	@OriginalMember(owner = "client!ep", name = "S", descriptor = "I")
	public int anInt2068;

	@OriginalMember(owner = "client!ep", name = "T", descriptor = "I")
	public int anInt2069;

	@OriginalMember(owner = "client!ep", name = "C", descriptor = "Lclient!rl;")
	public final Class175 aClass175_1;

	@OriginalMember(owner = "client!ep", name = "L", descriptor = "Lclient!vd;")
	public final Class208 aClass208_1;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!rl;Lclient!nl;)V")
	public Class4_Sub4_Sub3(@OriginalArg(0) Class175 arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		this.aClass175_1 = arg0;
		this.aClass208_1 = Static198.method3733(arg0.anInt5509);
		this.method1879();
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
	public void method1879() {
		this.anInt2068 = this.aClass175_1.anInt5507;
		this.anInt2062 = this.aClass175_1.anInt5501;
		this.anInt2069 = this.aClass175_1.anInt5505;
		if (this.aClass175_1.aClass57_3 != null) {
			this.aClass175_1.aClass57_3.method4203(this.aClass208_1.anInt6373, this.aClass208_1.anInt6376, this.aClass208_1.anInt6372, Static242.anIntArray477);
		}
		this.anInt2060 = Static242.anIntArray477[2];
		this.anInt2065 = Static242.anIntArray477[0];
	}
}
