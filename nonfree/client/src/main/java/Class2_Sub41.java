import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class2_Sub41 extends Class2 {

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
	public int anInt6930;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "Lclient!cj;")
	public Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_2;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
	public int anInt6931;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "Lclient!qo;")
	public Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
	public int anInt6932;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
	public int anInt6934;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "[I")
	public int[] anIntArray581;

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
	public int anInt6936;

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "Z")
	public boolean aBoolean486;

	@OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
	public int anInt6938;

	@OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
	public int anInt6939;

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "Lclient!jr;")
	public Class2_Sub11_Sub2 aClass2_Sub11_Sub2_2;

	@OriginalMember(owner = "client!wc", name = "F", descriptor = "Lclient!cu;")
	public Class47 aClass47_1;

	@OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
	public int anInt6941;

	@OriginalMember(owner = "client!wc", name = "H", descriptor = "I")
	public int anInt6942;

	@OriginalMember(owner = "client!wc", name = "I", descriptor = "Lclient!jr;")
	public Class2_Sub11_Sub2 aClass2_Sub11_Sub2_3;

	@OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
	public int anInt6943;

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
	public int anInt6945;

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
	public int anInt6935 = 0;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
	public void method5986() {
		@Pc(8) int local8 = this.anInt6936;
		if (this.aClass47_1 != null) {
			@Pc(17) Class47 local17 = this.aClass47_1.method903(Static179.aClass115_1);
			if (local17 == null) {
				this.anIntArray581 = null;
				this.anInt6945 = 0;
				this.anInt6936 = -1;
				this.anInt6942 = 0;
				this.anInt6934 = 0;
				this.anInt6931 = 0;
			} else {
				this.anInt6942 = local17.anInt1242 * 128;
				this.anInt6934 = local17.anInt1280;
				this.anIntArray581 = local17.anIntArray94;
				this.anInt6931 = local17.anInt1238;
				this.anInt6936 = local17.anInt1233;
				this.anInt6945 = local17.anInt1282;
			}
		} else if (this.aClass1_Sub2_Sub1_Sub2_1 != null) {
			@Pc(98) int local98 = Static350.method5583(this.aClass1_Sub2_Sub1_Sub2_1);
			if (local8 != local98) {
				this.anInt6936 = local98;
				@Pc(112) Class197 local112 = this.aClass1_Sub2_Sub1_Sub2_1.aClass197_1;
				if (local112.anIntArray468 != null) {
					local112 = local112.method4832(Static179.aClass115_1);
				}
				if (local112 == null) {
					this.anInt6931 = this.anInt6942 = 0;
				} else {
					this.anInt6931 = local112.anInt5483;
					this.anInt6942 = local112.anInt5500 * 128;
				}
			}
		} else if (this.aClass1_Sub2_Sub1_Sub1_2 != null) {
			this.anInt6936 = Static369.method5879(this.aClass1_Sub2_Sub1_Sub1_2);
			this.anInt6942 = this.aClass1_Sub2_Sub1_Sub1_2.anInt964 * 128;
			this.anInt6931 = this.aClass1_Sub2_Sub1_Sub1_2.anInt955;
		}
		if (this.anInt6936 != local8 && this.aClass2_Sub11_Sub2_3 != null) {
			Static192.aClass2_Sub11_Sub4_1.method4879(this.aClass2_Sub11_Sub2_3);
			this.aClass2_Sub11_Sub2_3 = null;
		}
	}
}
