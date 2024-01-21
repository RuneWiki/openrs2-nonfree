import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class3_Sub27 extends Class3 {

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
	public int anInt4158;

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "Lclient!wb;")
	public Class3_Sub19_Sub4 aClass3_Sub19_Sub4_2;

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
	public int anInt4159;

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "Lclient!wb;")
	public Class3_Sub19_Sub4 aClass3_Sub19_Sub4_3;

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
	public int anInt4160;

	@OriginalMember(owner = "client!vi", name = "z", descriptor = "[I")
	public int[] anIntArray360;

	@OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
	public int anInt4162;

	@OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
	public int anInt4164;

	@OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
	public int anInt4165;

	@OriginalMember(owner = "client!vi", name = "H", descriptor = "I")
	public int anInt4166;

	@OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
	public int anInt4168;

	@OriginalMember(owner = "client!vi", name = "L", descriptor = "Lclient!eh;")
	public Class3_Sub3_Sub9 aClass3_Sub3_Sub9_1;

	@OriginalMember(owner = "client!vi", name = "O", descriptor = "I")
	public int anInt4170;

	@OriginalMember(owner = "client!vi", name = "P", descriptor = "I")
	public int anInt4171;

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "(B)V")
	public void method3234() {
		@Pc(6) int local6 = this.anInt4158;
		@Pc(11) Class3_Sub3_Sub9 local11 = this.aClass3_Sub3_Sub9_1.method769();
		if (local11 == null) {
			this.anInt4158 = -1;
			this.anInt4160 = 0;
			this.anInt4162 = 0;
			this.anIntArray360 = null;
			this.anInt4171 = 0;
		} else {
			this.anInt4158 = local11.anInt1006;
			this.anIntArray360 = local11.anIntArray54;
			this.anInt4162 = local11.anInt1028;
			this.anInt4171 = local11.anInt994 * 128;
			this.anInt4160 = local11.anInt1024;
		}
		if (local6 != this.anInt4158 && this.aClass3_Sub19_Sub4_2 != null) {
			Static169.aClass3_Sub19_Sub3_2.method2923(this.aClass3_Sub19_Sub4_2);
			this.aClass3_Sub19_Sub4_2 = null;
		}
	}
}
