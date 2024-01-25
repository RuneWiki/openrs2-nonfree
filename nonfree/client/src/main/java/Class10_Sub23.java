import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class10_Sub23 extends Class10 {

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
	public int anInt3989;

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
	public int anInt3990;

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
	public int anInt3991;

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "Lclient!bs;")
	public Class10_Sub7_Sub1 aClass10_Sub7_Sub1_2;

	@OriginalMember(owner = "client!jq", name = "o", descriptor = "[I")
	public int[] anIntArray396;

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
	public int anInt3992;

	@OriginalMember(owner = "client!jq", name = "r", descriptor = "Lclient!jc;")
	public Class126 aClass126_1;

	@OriginalMember(owner = "client!jq", name = "s", descriptor = "Lclient!ig;")
	public Class24_Sub3_Sub2_Sub1 aClass24_Sub3_Sub2_Sub1_1;

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
	public int anInt3995;

	@OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
	public int anInt3996;

	@OriginalMember(owner = "client!jq", name = "w", descriptor = "I")
	public int anInt3997;

	@OriginalMember(owner = "client!jq", name = "B", descriptor = "I")
	public int anInt4002;

	@OriginalMember(owner = "client!jq", name = "C", descriptor = "Lclient!sf;")
	public Class24_Sub3_Sub2_Sub2 aClass24_Sub3_Sub2_Sub2_3;

	@OriginalMember(owner = "client!jq", name = "D", descriptor = "I")
	public int anInt4003;

	@OriginalMember(owner = "client!jq", name = "E", descriptor = "I")
	public int anInt4004;

	@OriginalMember(owner = "client!jq", name = "F", descriptor = "Lclient!bs;")
	public Class10_Sub7_Sub1 aClass10_Sub7_Sub1_3;

	@OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
	public int anInt4005;

	@OriginalMember(owner = "client!jq", name = "I", descriptor = "Z")
	public boolean aBoolean269;

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "I")
	public int anInt3994 = 0;

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)V")
	public void method3170() {
		@Pc(8) int local8 = this.anInt3996;
		if (this.aClass126_1 != null) {
			@Pc(23) Class126 local23 = this.aClass126_1.method3009(Static329.aClass201_9);
			if (local23 == null) {
				this.anInt4003 = 0;
				this.anInt3990 = 0;
				this.anInt4004 = 0;
				this.anInt3996 = -1;
				this.anIntArray396 = null;
				this.anInt3991 = 0;
			} else {
				this.anInt3996 = local23.anInt3760;
				this.anIntArray396 = local23.anIntArray381;
				this.anInt4004 = local23.anInt3771;
				this.anInt3990 = local23.anInt3809;
				this.anInt4003 = local23.anInt3776;
				this.anInt3991 = local23.anInt3763 << 7;
			}
		} else if (this.aClass24_Sub3_Sub2_Sub1_1 != null) {
			@Pc(104) int local104 = Static109.method1900(this.aClass24_Sub3_Sub2_Sub1_1);
			if (local104 != local8) {
				this.anInt3996 = local104;
				@Pc(118) Class222 local118 = this.aClass24_Sub3_Sub2_Sub1_1.aClass222_1;
				if (local118.anIntArray613 != null) {
					local118 = local118.method4938(Static329.aClass201_9);
				}
				if (local118 == null) {
					this.anInt4003 = this.anInt3991 = 0;
				} else {
					this.anInt4003 = local118.anInt6353;
					this.anInt3991 = local118.anInt6348 << 7;
				}
			}
		} else if (this.aClass24_Sub3_Sub2_Sub2_3 != null) {
			this.anInt3996 = Static125.method2191(this.aClass24_Sub3_Sub2_Sub2_3);
			this.anInt4003 = this.aClass24_Sub3_Sub2_Sub2_3.anInt6302;
			this.anInt3991 = this.aClass24_Sub3_Sub2_Sub2_3.anInt6328 << 7;
		}
		if (this.anInt3996 != local8 && this.aClass10_Sub7_Sub1_2 != null) {
			Static461.aClass10_Sub7_Sub2_5.method1841(this.aClass10_Sub7_Sub1_2);
			this.aClass10_Sub7_Sub1_2 = null;
		}
	}
}
