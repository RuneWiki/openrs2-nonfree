import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class2_Sub35 extends Class2 {

	@OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
	public int anInt4550;

	@OriginalMember(owner = "client!nt", name = "j", descriptor = "Lclient!jm;")
	public Class3_Sub4_Sub1_Sub1 aClass3_Sub4_Sub1_Sub1_2;

	@OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
	public int anInt4551;

	@OriginalMember(owner = "client!nt", name = "m", descriptor = "[I")
	public int[] anIntArray389;

	@OriginalMember(owner = "client!nt", name = "n", descriptor = "Lclient!pf;")
	public Class3_Sub4_Sub1_Sub2 aClass3_Sub4_Sub1_Sub2_2;

	@OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
	public int anInt4553;

	@OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
	public int anInt4554;

	@OriginalMember(owner = "client!nt", name = "q", descriptor = "Lclient!es;")
	public Class2_Sub1_Sub3 aClass2_Sub1_Sub3_3;

	@OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
	public int anInt4555;

	@OriginalMember(owner = "client!nt", name = "s", descriptor = "Lclient!es;")
	public Class2_Sub1_Sub3 aClass2_Sub1_Sub3_4;

	@OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
	public int anInt4556;

	@OriginalMember(owner = "client!nt", name = "u", descriptor = "Lclient!pm;")
	public Class192 aClass192_1;

	@OriginalMember(owner = "client!nt", name = "y", descriptor = "I")
	public int anInt4559;

	@OriginalMember(owner = "client!nt", name = "A", descriptor = "I")
	public int anInt4561;

	@OriginalMember(owner = "client!nt", name = "B", descriptor = "I")
	public int anInt4562;

	@OriginalMember(owner = "client!nt", name = "C", descriptor = "Z")
	public boolean aBoolean324;

	@OriginalMember(owner = "client!nt", name = "D", descriptor = "I")
	public int anInt4563;

	@OriginalMember(owner = "client!nt", name = "F", descriptor = "I")
	public int anInt4565;

	@OriginalMember(owner = "client!nt", name = "E", descriptor = "I")
	public int anInt4564 = 0;

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "(B)V")
	public void method3719() {
		@Pc(12) int local12 = this.anInt4551;
		if (this.aClass192_1 != null) {
			@Pc(92) Class192 local92 = this.aClass192_1.method4228(Static138.aClass268_1);
			if (local92 == null) {
				this.anIntArray389 = null;
				this.anInt4550 = 0;
				this.anInt4554 = 0;
				this.anInt4562 = 0;
				this.anInt4555 = 0;
				this.anInt4551 = -1;
			} else {
				this.anInt4562 = local92.anInt5333 << 7;
				this.anInt4551 = local92.anInt5345;
				this.anInt4554 = local92.anInt5319;
				this.anInt4550 = local92.anInt5351;
				this.anIntArray389 = local92.anIntArray438;
				this.anInt4555 = local92.anInt5323;
			}
		} else if (this.aClass3_Sub4_Sub1_Sub1_2 != null) {
			@Pc(23) int local23 = Static397.method5062(this.aClass3_Sub4_Sub1_Sub1_2);
			if (local23 != local12) {
				this.anInt4551 = local23;
				@Pc(33) Class245 local33 = this.aClass3_Sub4_Sub1_Sub1_2.aClass245_1;
				if (local33.anIntArray560 != null) {
					local33 = local33.method5205(Static138.aClass268_1);
				}
				if (local33 == null) {
					this.anInt4554 = this.anInt4562 = 0;
				} else {
					this.anInt4562 = local33.lb << 7;
					this.anInt4554 = local33.anInt6719;
				}
			}
		} else if (this.aClass3_Sub4_Sub1_Sub2_2 != null) {
			this.anInt4551 = Static351.method4669(this.aClass3_Sub4_Sub1_Sub2_2);
			this.anInt4554 = this.aClass3_Sub4_Sub1_Sub2_2.anInt4993;
			this.anInt4562 = this.aClass3_Sub4_Sub1_Sub2_2.anInt5013 << 7;
		}
		if (local12 != this.anInt4551 && this.aClass2_Sub1_Sub3_3 != null) {
			Static421.aClass2_Sub1_Sub4_2.method3237(this.aClass2_Sub1_Sub3_3);
			this.aClass2_Sub1_Sub3_3 = null;
		}
	}
}
