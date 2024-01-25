import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class3_Sub37 extends Class3 {

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
	public int anInt7016;

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
	public int anInt7017;

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
	public int anInt7018;

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "[I")
	public int[] anIntArray449;

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "Lclient!dg;")
	public Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "Z")
	public boolean aBoolean592;

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "Lclient!pda;")
	public Class3_Sub14_Sub2 aClass3_Sub14_Sub2_3;

	@OriginalMember(owner = "client!nf", name = "u", descriptor = "Lclient!bp;")
	public Class3_Sub6_Sub1 aClass3_Sub6_Sub1_3;

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
	public int anInt7019;

	@OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
	public int anInt7020;

	@OriginalMember(owner = "client!nf", name = "x", descriptor = "Lclient!pca;")
	public Class2_Sub2_Sub1_Sub2 aClass2_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
	public int anInt7021;

	@OriginalMember(owner = "client!nf", name = "A", descriptor = "Z")
	public boolean aBoolean593;

	@OriginalMember(owner = "client!nf", name = "B", descriptor = "Lclient!gw;")
	public Class3_Sub16 aClass3_Sub16_2;

	@OriginalMember(owner = "client!nf", name = "C", descriptor = "Lclient!bp;")
	public Class3_Sub6_Sub1 aClass3_Sub6_Sub1_4;

	@OriginalMember(owner = "client!nf", name = "D", descriptor = "I")
	public int anInt7023;

	@OriginalMember(owner = "client!nf", name = "E", descriptor = "I")
	public int anInt7024;

	@OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
	public int anInt7025;

	@OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
	public int anInt7027;

	@OriginalMember(owner = "client!nf", name = "J", descriptor = "Lclient!pda;")
	public Class3_Sub14_Sub2 aClass3_Sub14_Sub2_4;

	@OriginalMember(owner = "client!nf", name = "L", descriptor = "Z")
	public boolean aBoolean594;

	@OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
	public int anInt7029;

	@OriginalMember(owner = "client!nf", name = "N", descriptor = "Lclient!gw;")
	public Class3_Sub16 aClass3_Sub16_3;

	@OriginalMember(owner = "client!nf", name = "O", descriptor = "Lclient!sa;")
	public Class292 aClass292_1;

	@OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
	public int anInt7028 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public void method5842() {
		@Pc(6) int local6 = this.anInt7024;
		@Pc(9) boolean local9 = this.aBoolean592;
		if (this.aClass292_1 != null) {
			@Pc(105) Class292 local105 = this.aClass292_1.method7198(Static588.aClass322_1);
			if (local105 == null) {
				this.aBoolean593 = false;
				this.anInt7025 = 0;
				this.anInt7024 = -1;
				this.aBoolean592 = false;
				this.anInt7016 = 0;
				this.anInt7017 = 0;
				this.anIntArray449 = null;
				this.anInt7018 = 0;
			} else {
				this.anInt7017 = local105.anInt8787;
				this.anInt7018 = local105.anInt8748 << 9;
				this.anInt7024 = local105.anInt8756;
				this.anInt7016 = local105.anInt8764;
				this.anInt7025 = local105.anInt8747;
				this.aBoolean592 = local105.aBoolean734;
				this.anIntArray449 = local105.anIntArray572;
				this.aBoolean593 = local105.aBoolean731;
			}
		} else if (this.aClass2_Sub2_Sub1_Sub2_1 != null) {
			@Pc(20) int local20 = Static79.method8447(this.aClass2_Sub2_Sub1_Sub2_1);
			if (local20 != local6) {
				this.anInt7024 = local20;
				@Pc(34) Class169 local34 = this.aClass2_Sub2_Sub1_Sub2_1.aClass169_1;
				if (local34.anIntArray306 != null) {
					local34 = local34.method4177(Static588.aClass322_1);
				}
				if (local34 == null) {
					this.aBoolean592 = this.aClass2_Sub2_Sub1_Sub2_1.aClass169_1.aBoolean421;
					this.anInt7025 = this.anInt7018 = 0;
				} else {
					this.anInt7018 = local34.anInt5001 << 9;
					this.anInt7025 = local34.anInt4999;
					this.aBoolean592 = local34.aBoolean421;
				}
			}
		} else if (this.aClass2_Sub2_Sub1_Sub1_1 != null) {
			this.anInt7024 = Static569.method8163(this.aClass2_Sub2_Sub1_Sub1_1);
			this.anInt7018 = this.aClass2_Sub2_Sub1_Sub1_1.anInt2198 << 9;
			this.aBoolean592 = this.aClass2_Sub2_Sub1_Sub1_1.aBoolean173;
			this.anInt7025 = this.aClass2_Sub2_Sub1_Sub1_1.anInt2214;
		}
		if (local6 == this.anInt7024 && this.aBoolean592 == local9) {
			return;
		}
		if (this.aClass3_Sub14_Sub2_4 == null) {
			return;
		}
		Static485.aClass3_Sub14_Sub1_2.method2816(this.aClass3_Sub14_Sub2_4);
		this.aClass3_Sub6_Sub1_3 = null;
		this.aClass3_Sub14_Sub2_4 = null;
		this.aClass3_Sub16_3 = null;
	}
}
