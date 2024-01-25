import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class5_Sub20 extends Class5 {

	@OriginalMember(owner = "client!eu", name = "k", descriptor = "Z")
	public boolean aBoolean182;

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "I")
	public int anInt2405;

	@OriginalMember(owner = "client!eu", name = "m", descriptor = "I")
	public int anInt2406;

	@OriginalMember(owner = "client!eu", name = "n", descriptor = "I")
	public int anInt2407;

	@OriginalMember(owner = "client!eu", name = "o", descriptor = "I")
	public int anInt2408;

	@OriginalMember(owner = "client!eu", name = "p", descriptor = "[I")
	public int[] anIntArray145;

	@OriginalMember(owner = "client!eu", name = "q", descriptor = "Lclient!kda;")
	public Class5_Sub29 aClass5_Sub29_1;

	@OriginalMember(owner = "client!eu", name = "r", descriptor = "Lclient!bfa;")
	public Class4_Sub2_Sub1_Sub1_Sub1 aClass4_Sub2_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!eu", name = "s", descriptor = "Lclient!so;")
	public Class5_Sub37_Sub1 aClass5_Sub37_Sub1_1;

	@OriginalMember(owner = "client!eu", name = "t", descriptor = "Lclient!sv;")
	public Class5_Sub1_Sub4 aClass5_Sub1_Sub4_1;

	@OriginalMember(owner = "client!eu", name = "u", descriptor = "I")
	public int anInt2409;

	@OriginalMember(owner = "client!eu", name = "v", descriptor = "I")
	public int anInt2410;

	@OriginalMember(owner = "client!eu", name = "w", descriptor = "I")
	public int anInt2411;

	@OriginalMember(owner = "client!eu", name = "y", descriptor = "Lclient!so;")
	public Class5_Sub37_Sub1 aClass5_Sub37_Sub1_2;

	@OriginalMember(owner = "client!eu", name = "z", descriptor = "I")
	public int anInt2413;

	@OriginalMember(owner = "client!eu", name = "A", descriptor = "Lclient!cca;")
	public Class4_Sub2_Sub1_Sub1_Sub2 aClass4_Sub2_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!eu", name = "B", descriptor = "I")
	public int anInt2414;

	@OriginalMember(owner = "client!eu", name = "C", descriptor = "Lclient!sv;")
	public Class5_Sub1_Sub4 aClass5_Sub1_Sub4_2;

	@OriginalMember(owner = "client!eu", name = "F", descriptor = "Lclient!kda;")
	public Class5_Sub29 aClass5_Sub29_2;

	@OriginalMember(owner = "client!eu", name = "G", descriptor = "I")
	public int anInt2417;

	@OriginalMember(owner = "client!eu", name = "H", descriptor = "I")
	public int anInt2418;

	@OriginalMember(owner = "client!eu", name = "I", descriptor = "Lclient!jl;")
	public Class181 aClass181_1;

	@OriginalMember(owner = "client!eu", name = "J", descriptor = "Z")
	public boolean aBoolean183;

	@OriginalMember(owner = "client!eu", name = "K", descriptor = "I")
	public int anInt2419;

	@OriginalMember(owner = "client!eu", name = "M", descriptor = "I")
	public int anInt2421;

	@OriginalMember(owner = "client!eu", name = "N", descriptor = "Z")
	public boolean aBoolean184;

	@OriginalMember(owner = "client!eu", name = "L", descriptor = "I")
	public int anInt2420 = 0;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
	public void method2018() {
		@Pc(12) int local12 = this.anInt2413;
		@Pc(15) boolean local15 = this.aBoolean183;
		if (this.aClass181_1 != null) {
			@Pc(24) Class181 local24 = this.aClass181_1.method4279(Static301.aClass59_1);
			if (local24 == null) {
				this.anInt2413 = -1;
				this.anInt2409 = 0;
				this.anInt2405 = 256;
				this.anIntArray145 = null;
				this.anInt2421 = 0;
				this.anInt2419 = 0;
				this.aBoolean183 = false;
				this.anInt2414 = 256;
				this.aBoolean184 = false;
				this.anInt2417 = 0;
			} else {
				this.anInt2409 = local24.anInt4735 << 9;
				this.anInt2417 = local24.anInt4759;
				this.anInt2419 = local24.anInt4762;
				this.anInt2405 = local24.anInt4746;
				this.aBoolean184 = local24.aBoolean342;
				this.anInt2421 = local24.anInt4765;
				this.aBoolean183 = local24.aBoolean341;
				this.anIntArray145 = local24.anIntArray239;
				this.anInt2413 = local24.anInt4751;
				this.anInt2414 = local24.anInt4768;
			}
		} else if (this.aClass4_Sub2_Sub1_Sub1_Sub2_2 != null) {
			@Pc(144) int local144 = Static65.method1091(this.aClass4_Sub2_Sub1_Sub1_Sub2_2);
			if (local12 != local144) {
				this.anInt2413 = local144;
				@Pc(158) Class225 local158 = this.aClass4_Sub2_Sub1_Sub1_Sub2_2.aClass225_1;
				if (local158.anIntArray304 != null) {
					local158 = local158.method4990(Static301.aClass59_1);
				}
				if (local158 == null) {
					this.anInt2417 = this.anInt2409 = 0;
					this.anInt2414 = 256;
					this.aBoolean183 = this.aClass4_Sub2_Sub1_Sub1_Sub2_2.aClass225_1.aBoolean411;
					this.anInt2405 = 256;
				} else {
					this.anInt2409 = local158.anInt5625 << 9;
					this.anInt2405 = local158.anInt5649;
					this.anInt2414 = local158.anInt5643;
					this.aBoolean183 = local158.aBoolean411;
					this.anInt2417 = local158.anInt5644;
				}
			}
		} else if (this.aClass4_Sub2_Sub1_Sub1_Sub1_1 != null) {
			this.anInt2413 = Static543.method7963(this.aClass4_Sub2_Sub1_Sub1_Sub1_1);
			this.anInt2417 = this.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt919;
			this.aBoolean183 = this.aClass4_Sub2_Sub1_Sub1_Sub1_1.aBoolean45;
			this.anInt2409 = this.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt926 << 9;
			this.anInt2405 = 256;
			this.anInt2414 = 256;
		}
		if (local12 == this.anInt2413 && local15 == this.aBoolean183) {
			return;
		}
		if (this.aClass5_Sub1_Sub4_2 == null) {
			return;
		}
		Static26.aClass5_Sub1_Sub2_1.method5052(this.aClass5_Sub1_Sub4_2);
		this.aClass5_Sub29_2 = null;
		this.aClass5_Sub1_Sub4_2 = null;
		this.aClass5_Sub37_Sub1_1 = null;
	}
}
