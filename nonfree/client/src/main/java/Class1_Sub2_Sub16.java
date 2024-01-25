import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rv", name = "y", descriptor = "I")
	public int anInt5923;

	@OriginalMember(owner = "client!rv", name = "A", descriptor = "I")
	public int anInt5925;

	@OriginalMember(owner = "client!rv", name = "D", descriptor = "I")
	public int anInt5928;

	@OriginalMember(owner = "client!rv", name = "H", descriptor = "I")
	public int anInt5930;

	@OriginalMember(owner = "client!rv", name = "L", descriptor = "I")
	public int anInt5931;

	@OriginalMember(owner = "client!rv", name = "x", descriptor = "Lclient!dv;")
	public final Class57 aClass57_2;

	@OriginalMember(owner = "client!rv", name = "I", descriptor = "Lclient!hf;")
	public final Class102 aClass102_1;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!dv;Lclient!mq;)V")
	public Class1_Sub2_Sub16(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class4_Sub7 arg1) {
		this.aClass57_2 = arg0;
		this.aClass102_1 = this.aClass57_2.method1591();
		this.method4941();
	}

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "(I)V")
	public void method4941() {
		this.anInt5930 = this.aClass57_2.anInt1831;
		this.anInt5931 = this.aClass57_2.anInt1828;
		this.anInt5925 = this.aClass57_2.anInt1830;
		if (this.aClass57_2.aClass33_1 != null) {
			this.aClass57_2.aClass33_1.p(this.aClass102_1.anInt2790, this.aClass102_1.anInt2785, this.aClass102_1.anInt2792, Static118.anIntArray189);
		}
		this.anInt5923 = Static118.anIntArray189[0];
		this.anInt5928 = Static118.anIntArray189[2];
	}
}
