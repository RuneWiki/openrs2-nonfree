import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class2_Sub39 extends Class2 {

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "Z")
	public boolean aBoolean609;

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
	public int anInt7741;

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "Lclient!oaa;")
	public Class2_Sub7_Sub1 aClass2_Sub7_Sub1_2;

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
	public int anInt7743;

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
	public int anInt7744;

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
	public int anInt7745;

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "Lclient!go;")
	public Class2_Sub20 aClass2_Sub20_1;

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
	public int anInt7747;

	@OriginalMember(owner = "client!ql", name = "u", descriptor = "Z")
	public boolean aBoolean610;

	@OriginalMember(owner = "client!ql", name = "v", descriptor = "Lclient!bda;")
	public Class32 aClass32_1;

	@OriginalMember(owner = "client!ql", name = "w", descriptor = "Lclient!hw;")
	public Class2_Sub10_Sub4 aClass2_Sub10_Sub4_2;

	@OriginalMember(owner = "client!ql", name = "x", descriptor = "Z")
	public boolean aBoolean611;

	@OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
	public int anInt7748;

	@OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
	public int anInt7749;

	@OriginalMember(owner = "client!ql", name = "C", descriptor = "I")
	public int anInt7751;

	@OriginalMember(owner = "client!ql", name = "D", descriptor = "I")
	public int anInt7752;

	@OriginalMember(owner = "client!ql", name = "E", descriptor = "[I")
	public int[] anIntArray514;

	@OriginalMember(owner = "client!ql", name = "F", descriptor = "Lclient!qi;")
	public Class6_Sub1_Sub1_Sub1_Sub2 aClass6_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ql", name = "G", descriptor = "I")
	public int anInt7753;

	@OriginalMember(owner = "client!ql", name = "H", descriptor = "Lclient!ac;")
	public Class6_Sub1_Sub1_Sub1_Sub1 aClass6_Sub1_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!ql", name = "I", descriptor = "Lclient!go;")
	public Class2_Sub20 aClass2_Sub20_2;

	@OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
	public int anInt7754;

	@OriginalMember(owner = "client!ql", name = "K", descriptor = "Lclient!hw;")
	public Class2_Sub10_Sub4 aClass2_Sub10_Sub4_3;

	@OriginalMember(owner = "client!ql", name = "L", descriptor = "Lclient!oaa;")
	public Class2_Sub7_Sub1 aClass2_Sub7_Sub1_3;

	@OriginalMember(owner = "client!ql", name = "A", descriptor = "I")
	public int anInt7750 = 0;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
	public void method6368() {
		@Pc(12) int local12 = this.anInt7744;
		@Pc(15) boolean local15 = this.aBoolean611;
		if (this.aClass32_1 != null) {
			@Pc(24) Class32 local24 = this.aClass32_1.method552(Static70.aClass78_1);
			if (local24 == null) {
				this.anInt7754 = 0;
				this.anInt7741 = 0;
				this.anInt7743 = 0;
				this.aBoolean611 = false;
				this.anIntArray514 = null;
				this.aBoolean609 = false;
				this.anInt7744 = -1;
				this.anInt7747 = 0;
			} else {
				this.anInt7743 = local24.anInt804;
				this.anIntArray514 = local24.anIntArray46;
				this.aBoolean611 = local24.aBoolean54;
				this.anInt7754 = local24.anInt777;
				this.anInt7741 = local24.anInt825;
				this.anInt7744 = local24.anInt824;
				this.aBoolean609 = local24.aBoolean52;
				this.anInt7747 = local24.anInt806 << 9;
			}
		} else if (this.aClass6_Sub1_Sub1_Sub1_Sub1_2 != null) {
			@Pc(124) int local124 = Static505.method7026(this.aClass6_Sub1_Sub1_Sub1_Sub1_2);
			if (local124 != local12) {
				this.anInt7744 = local124;
				@Pc(134) Class86 local134 = this.aClass6_Sub1_Sub1_Sub1_Sub1_2.aClass86_1;
				if (local134.anIntArray136 != null) {
					local134 = local134.method1567(Static70.aClass78_1);
				}
				if (local134 == null) {
					this.anInt7754 = this.anInt7747 = 0;
					this.aBoolean611 = this.aClass6_Sub1_Sub1_Sub1_Sub1_2.aClass86_1.aBoolean194;
				} else {
					this.anInt7747 = local134.anInt2165 << 9;
					this.anInt7754 = local134.anInt2131;
					this.aBoolean611 = local134.aBoolean194;
				}
			}
		} else if (this.aClass6_Sub1_Sub1_Sub1_Sub2_1 != null) {
			this.anInt7744 = Static579.method7833(this.aClass6_Sub1_Sub1_Sub1_Sub2_1);
			this.anInt7747 = this.aClass6_Sub1_Sub1_Sub1_Sub2_1.anInt7450 << 9;
			this.anInt7754 = this.aClass6_Sub1_Sub1_Sub1_Sub2_1.anInt7462;
			this.aBoolean611 = this.aClass6_Sub1_Sub1_Sub1_Sub2_1.aBoolean576;
		}
		if (this.anInt7744 == local12 && this.aBoolean611 == local15) {
			return;
		}
		if (this.aClass2_Sub10_Sub4_3 == null) {
			return;
		}
		Static122.aClass2_Sub10_Sub1_2.method1012(this.aClass2_Sub10_Sub4_3);
		this.aClass2_Sub7_Sub1_2 = null;
		this.aClass2_Sub20_1 = null;
		this.aClass2_Sub10_Sub4_3 = null;
	}
}
