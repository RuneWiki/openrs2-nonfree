import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class2_Sub31 extends Class2 {

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "Lclient!dc;")
	public Class2_Sub14 aClass2_Sub14_1;

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
	public int anInt5780;

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
	public int anInt5781;

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
	public int anInt5782;

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "Z")
	public boolean aBoolean436;

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
	public int anInt5784;

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
	public int anInt5785;

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "Lclient!tf;")
	public Class2_Sub2_Sub5 aClass2_Sub2_Sub5_2;

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
	public int anInt5786;

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
	public int anInt5787;

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
	public int anInt5788;

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
	public int anInt5789;

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
	public int anInt5790;

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "Z")
	public boolean aBoolean437;

	@OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
	public int anInt5791;

	@OriginalMember(owner = "client!lf", name = "x", descriptor = "Lclient!cj;")
	public Class2_Sub12_Sub1 aClass2_Sub12_Sub1_2;

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "Lclient!fca;")
	public Class11_Sub1_Sub1_Sub2_Sub2 aClass11_Sub1_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
	public int anInt5792;

	@OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
	public int anInt5793;

	@OriginalMember(owner = "client!lf", name = "B", descriptor = "[I")
	public int[] anIntArray397;

	@OriginalMember(owner = "client!lf", name = "C", descriptor = "Z")
	public boolean aBoolean438;

	@OriginalMember(owner = "client!lf", name = "D", descriptor = "Lclient!ak;")
	public Class11_Sub1_Sub1_Sub2_Sub1 aClass11_Sub1_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!lf", name = "F", descriptor = "Lclient!dc;")
	public Class2_Sub14 aClass2_Sub14_2;

	@OriginalMember(owner = "client!lf", name = "G", descriptor = "Lclient!cj;")
	public Class2_Sub12_Sub1 aClass2_Sub12_Sub1_3;

	@OriginalMember(owner = "client!lf", name = "I", descriptor = "Lclient!tf;")
	public Class2_Sub2_Sub5 aClass2_Sub2_Sub5_3;

	@OriginalMember(owner = "client!lf", name = "J", descriptor = "Lclient!uw;")
	public Class350 aClass350_1;

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
	public int anInt5783 = 0;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
	public void method4826() {
		@Pc(6) int local6 = this.anInt5792;
		@Pc(15) boolean local15 = this.aBoolean437;
		if (this.aClass350_1 != null) {
			@Pc(24) Class350 local24 = this.aClass350_1.method8080(Static438.aClass198_1);
			if (local24 == null) {
				this.anInt5787 = 0;
				this.aBoolean438 = false;
				this.anInt5792 = -1;
				this.anInt5780 = 0;
				this.anIntArray397 = null;
				this.anInt5784 = 0;
				this.anInt5782 = 256;
				this.anInt5793 = 0;
				this.aBoolean437 = false;
				this.anInt5786 = 256;
			} else {
				this.aBoolean437 = local24.aBoolean707;
				this.anInt5786 = local24.anInt9653;
				this.anInt5784 = local24.anInt9651;
				this.anInt5780 = local24.anInt9628 << 9;
				this.anInt5793 = local24.anInt9627;
				this.anInt5787 = local24.anInt9644;
				this.anIntArray397 = local24.anIntArray667;
				this.anInt5782 = local24.anInt9617;
				this.aBoolean438 = local24.aBoolean712;
				this.anInt5792 = local24.anInt9610;
			}
		} else if (this.aClass11_Sub1_Sub1_Sub2_Sub2_1 != null) {
			@Pc(108) int local108 = Static324.method4895(this.aClass11_Sub1_Sub1_Sub2_Sub2_1);
			if (local108 != local6) {
				this.anInt5792 = local108;
				@Pc(122) Class236 local122 = this.aClass11_Sub1_Sub1_Sub2_Sub2_1.aClass236_1;
				if (local122.anIntArray462 != null) {
					local122 = local122.method5779(Static438.aClass198_1);
				}
				if (local122 == null) {
					this.aBoolean437 = this.aClass11_Sub1_Sub1_Sub2_Sub2_1.aClass236_1.aBoolean519;
					this.anInt5786 = 256;
					this.anInt5782 = 256;
					this.anInt5793 = this.anInt5780 = 0;
				} else {
					this.anInt5793 = local122.anInt6918;
					this.anInt5782 = local122.anInt6931;
					this.anInt5786 = local122.anInt6900;
					this.aBoolean437 = local122.aBoolean519;
					this.anInt5780 = local122.anInt6916 << 9;
				}
			}
		} else if (this.aClass11_Sub1_Sub1_Sub2_Sub1_1 != null) {
			this.anInt5792 = Static617.method8394(this.aClass11_Sub1_Sub1_Sub2_Sub1_1);
			this.anInt5786 = 256;
			this.anInt5793 = this.aClass11_Sub1_Sub1_Sub2_Sub1_1.anInt567;
			this.aBoolean437 = this.aClass11_Sub1_Sub1_Sub2_Sub1_1.aBoolean45;
			this.anInt5782 = 256;
			this.anInt5780 = this.aClass11_Sub1_Sub1_Sub2_Sub1_1.anInt553 << 9;
		}
		if (local6 == this.anInt5792 && this.aBoolean437 == local15) {
			return;
		}
		if (this.aClass2_Sub2_Sub5_3 == null) {
			return;
		}
		Static1.aClass2_Sub2_Sub2_6.method1042(this.aClass2_Sub2_Sub5_3);
		this.aClass2_Sub14_2 = null;
		this.aClass2_Sub12_Sub1_3 = null;
		this.aClass2_Sub2_Sub5_3 = null;
	}
}
