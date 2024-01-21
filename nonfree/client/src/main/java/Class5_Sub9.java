import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class5_Sub9 extends Class5 {

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
	public int anInt1005;

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "Lclient!kc;")
	public Class5_Sub11_Sub1 aClass5_Sub11_Sub1_2;

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
	public int anInt1006;

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "Lclient!kc;")
	public Class5_Sub11_Sub1 aClass5_Sub11_Sub1_3;

	@OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
	public int anInt1008;

	@OriginalMember(owner = "client!ef", name = "v", descriptor = "Lclient!cg;")
	public Class5_Sub2_Sub7 aClass5_Sub2_Sub7_1;

	@OriginalMember(owner = "client!ef", name = "x", descriptor = "I")
	public int anInt1009;

	@OriginalMember(owner = "client!ef", name = "A", descriptor = "[I")
	public int[] anIntArray93;

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
	public int anInt1011;

	@OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
	public int anInt1012;

	@OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
	public int anInt1013;

	@OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
	public int anInt1014;

	@OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
	public int anInt1019;

	@OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
	public int anInt1020;

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V")
	public void method836() {
		@Pc(10) int local10 = this.anInt1005;
		@Pc(15) Class5_Sub2_Sub7 local15 = this.aClass5_Sub2_Sub7_1.method431();
		if (local15 == null) {
			this.anIntArray93 = null;
			this.anInt1005 = -1;
			this.anInt1008 = 0;
			this.anInt1009 = 0;
			this.anInt1012 = 0;
		} else {
			this.anInt1012 = local15.anInt535;
			this.anInt1005 = local15.anInt510;
			this.anInt1008 = local15.anInt540 * 128;
			this.anIntArray93 = local15.anIntArray38;
			this.anInt1009 = local15.anInt520;
		}
		if (this.anInt1005 != local10 && this.aClass5_Sub11_Sub1_2 != null) {
			Static43.aClass5_Sub11_Sub4_1.method2877(this.aClass5_Sub11_Sub1_2);
			this.aClass5_Sub11_Sub1_2 = null;
		}
	}
}
