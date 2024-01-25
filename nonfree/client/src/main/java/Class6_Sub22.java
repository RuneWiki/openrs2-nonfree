import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class6_Sub22 extends Class6 {

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "Z")
	public boolean aBoolean211;

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "Lclient!ud;")
	public Class29_Sub2_Sub1_Sub2 aClass29_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "Lclient!va;")
	public Class6_Sub50 aClass6_Sub50_1;

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "[I")
	public int[] anIntArray346;

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "Z")
	public boolean aBoolean212;

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "Lclient!hl;")
	public Class6_Sub19_Sub2 aClass6_Sub19_Sub2_1;

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
	public int anInt3144;

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "Lclient!dw;")
	public Class29_Sub2_Sub1_Sub1 aClass29_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "Lclient!mda;")
	public Class6_Sub12_Sub1 aClass6_Sub12_Sub1_1;

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
	public int anInt3145;

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "Lclient!va;")
	public Class6_Sub50 aClass6_Sub50_2;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
	public int anInt3147;

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
	public int anInt3148;

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
	public int anInt3149;

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "Lclient!uca;")
	public Class313 aClass313_1;

	@OriginalMember(owner = "client!ha", name = "D", descriptor = "Lclient!mda;")
	public Class6_Sub12_Sub1 aClass6_Sub12_Sub1_2;

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
	public int anInt3150;

	@OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
	public int anInt3152;

	@OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
	public int anInt3155;

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
	public int anInt3156;

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "Z")
	public boolean aBoolean213;

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
	public int anInt3157;

	@OriginalMember(owner = "client!ha", name = "Q", descriptor = "I")
	public int anInt3159;

	@OriginalMember(owner = "client!ha", name = "R", descriptor = "Lclient!hl;")
	public Class6_Sub19_Sub2 aClass6_Sub19_Sub2_2;

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
	public int anInt3142 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public void method2700() {
		@Pc(14) int local14 = this.anInt3144;
		@Pc(17) boolean local17 = this.aBoolean213;
		if (this.aClass313_1 != null) {
			@Pc(116) Class313 local116 = this.aClass313_1.method6967(Static505.aClass30_1);
			if (local116 == null) {
				this.anInt3149 = 0;
				this.anInt3144 = -1;
				this.anInt3155 = 0;
				this.anInt3148 = 0;
				this.aBoolean213 = false;
				this.anIntArray346 = null;
				this.anInt3145 = 0;
				this.aBoolean211 = false;
			} else {
				this.anInt3149 = local116.anInt8487;
				this.anInt3155 = local116.anInt8483;
				this.anIntArray346 = local116.anIntArray652;
				this.aBoolean213 = local116.aBoolean591;
				this.aBoolean211 = local116.aBoolean580;
				this.anInt3148 = local116.anInt8462;
				this.anInt3144 = local116.anInt8459;
				this.anInt3145 = local116.anInt8486 << 9;
			}
		} else if (this.aClass29_Sub2_Sub1_Sub1_1 != null) {
			@Pc(60) int local60 = Static439.method6316(this.aClass29_Sub2_Sub1_Sub1_1);
			if (local60 != local14) {
				this.anInt3144 = local60;
				@Pc(70) Class257 local70 = this.aClass29_Sub2_Sub1_Sub1_1.aClass257_1;
				if (local70.anIntArray571 != null) {
					local70 = local70.method5935(Static505.aClass30_1);
				}
				if (local70 == null) {
					this.aBoolean213 = this.aClass29_Sub2_Sub1_Sub1_1.aClass257_1.aBoolean500;
					this.anInt3148 = this.anInt3145 = 0;
				} else {
					this.anInt3145 = local70.anInt7139 << 9;
					this.anInt3148 = local70.anInt7154;
					this.aBoolean213 = local70.aBoolean500;
				}
			}
		} else if (this.aClass29_Sub2_Sub1_Sub2_1 != null) {
			this.anInt3144 = Static441.method6342(this.aClass29_Sub2_Sub1_Sub2_1);
			this.anInt3145 = this.aClass29_Sub2_Sub1_Sub2_1.anInt8619 << 9;
			this.anInt3148 = this.aClass29_Sub2_Sub1_Sub2_1.anInt8618;
			this.aBoolean213 = this.aClass29_Sub2_Sub1_Sub2_1.aBoolean604;
		}
		if (this.anInt3144 == local14 && this.aBoolean213 == local17) {
			return;
		}
		if (this.aClass6_Sub19_Sub2_2 == null) {
			return;
		}
		Static144.aClass6_Sub19_Sub3_2.method6424(this.aClass6_Sub19_Sub2_2);
		this.aClass6_Sub12_Sub1_2 = null;
		this.aClass6_Sub19_Sub2_2 = null;
		this.aClass6_Sub50_2 = null;
	}
}
