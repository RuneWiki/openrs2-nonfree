import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class Class14_Sub2_Sub3 extends Class14_Sub2 {

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
	public int anInt1080;

	@OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
	public int anInt1081;

	@OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
	public int anInt1083;

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
	public int anInt1084;

	@OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
	public int anInt1086;

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "Lclient!ih;")
	public final Class172 aClass172_1;

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "Lclient!rha;")
	public final Class312 aClass312_1;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!ih;Lclient!ui;)V")
	public Class14_Sub2_Sub3(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class4_Sub8 arg1) {
		this.aClass172_1 = arg0;
		this.aClass312_1 = this.aClass172_1.method4231();
		this.method1108();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public void method1108() {
		this.anInt1083 = this.aClass172_1.anInt4756;
		this.anInt1080 = this.aClass172_1.anInt4758;
		this.anInt1086 = this.aClass172_1.anInt4763;
		if (this.aClass172_1.aClass263_3 != null) {
			this.aClass172_1.aClass263_3.method8438(this.aClass312_1.anInt9078, this.aClass312_1.anInt9077, this.aClass312_1.anInt9073, Static239.anIntArray232);
		}
		this.anInt1081 = Static239.anIntArray232[0];
		this.anInt1084 = Static239.anIntArray232[2];
	}
}
