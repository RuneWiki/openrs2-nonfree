import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class5_Sub27 extends Class5 {

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
	public int anInt3730;

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
	public int anInt3731;

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
	public int anInt3732;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
	public int anInt3733;

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
	public int anInt3734;

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "Lclient!gj;")
	public Class5_Sub17_Sub1 aClass5_Sub17_Sub1_1;

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "[I")
	public int[] anIntArray277;

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
	public int anInt3735;

	@OriginalMember(owner = "client!mg", name = "s", descriptor = "Lclient!nj;")
	public Class25_Sub1_Sub1_Sub1 aClass25_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "Lclient!re;")
	public Class25_Sub1_Sub1_Sub2 aClass25_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
	public int anInt3737;

	@OriginalMember(owner = "client!mg", name = "w", descriptor = "Lclient!nl;")
	public Class137 aClass137_1;

	@OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
	public int anInt3738;

	@OriginalMember(owner = "client!mg", name = "A", descriptor = "Z")
	public boolean aBoolean265;

	@OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
	public int anInt3740;

	@OriginalMember(owner = "client!mg", name = "G", descriptor = "Lclient!gj;")
	public Class5_Sub17_Sub1 aClass5_Sub17_Sub1_2;

	@OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
	public int anInt3745;

	@OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
	public int anInt3746;

	@OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
	public int anInt3741 = 0;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	public void method3460() {
		@Pc(13) int local13 = this.anInt3737;
		if (this.aClass137_1 != null) {
			@Pc(23) Class137 local23 = this.aClass137_1.method3720();
			if (local23 == null) {
				this.anInt3740 = 0;
				this.anIntArray277 = null;
				this.anInt3745 = 0;
				this.anInt3733 = 0;
				this.anInt3732 = 0;
				this.anInt3737 = -1;
			} else {
				this.anIntArray277 = local23.anIntArray299;
				this.anInt3740 = local23.anInt4165;
				this.anInt3737 = local23.anInt4156;
				this.anInt3733 = local23.anInt4153 * 128;
				this.anInt3745 = local23.anInt4161;
				this.anInt3732 = local23.anInt4146;
			}
		} else if (this.aClass25_Sub1_Sub1_Sub2_1 != null) {
			@Pc(104) int local104 = Static118.method2321(this.aClass25_Sub1_Sub1_Sub2_1);
			if (local104 != local13) {
				this.anInt3737 = local104;
				@Pc(114) Class216 local114 = this.aClass25_Sub1_Sub1_Sub2_1.aClass216_1;
				if (local114.anIntArray562 != null) {
					local114 = local114.method5777();
				}
				if (local114 == null) {
					this.anInt3732 = this.anInt3733 = 0;
				} else {
					this.anInt3733 = local114.anInt6560 * 128;
					this.anInt3732 = local114.lb;
				}
			}
		} else if (this.aClass25_Sub1_Sub1_Sub1_2 != null) {
			this.anInt3737 = Static139.method5471(this.aClass25_Sub1_Sub1_Sub1_2);
			this.anInt3732 = this.aClass25_Sub1_Sub1_Sub1_2.anInt4072;
			this.anInt3733 = this.aClass25_Sub1_Sub1_Sub1_2.anInt4079 * 128;
		}
		if (local13 != this.anInt3737 && this.aClass5_Sub17_Sub1_1 != null) {
			Static5.aClass5_Sub17_Sub3_1.method3544(this.aClass5_Sub17_Sub1_1);
			this.aClass5_Sub17_Sub1_1 = null;
		}
	}
}
