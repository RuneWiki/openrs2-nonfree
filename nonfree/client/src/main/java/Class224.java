import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class224 implements Interface2 {

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "Lclient!hl;")
	private Class96 aClass96_33 = new Class96(128);

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "[I")
	public final int[] anIntArray506 = new int[Static99.aClass50_1.anInt1693];

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "[I")
	private final int[] anIntArray505 = new int[Static99.aClass50_1.anInt1693];

	static {
		new Class21("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V")
	public void method5155() {
		for (@Pc(9) int local9 = 0; local9 < Static99.aClass50_1.anInt1693; local9++) {
			@Pc(16) Class167 local16 = Static99.aClass50_1.method1529(local9);
			if (local16 != null && local16.anInt4982 == 0) {
				this.anIntArray505[local9] = 0;
				this.anIntArray506[local9] = 0;
			}
		}
		this.aClass96_33 = new Class96(128);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BZ)I")
	public int method5156(@OriginalArg(1) boolean arg0) {
		@Pc(13) long local13 = Static167.method2929();
		for (@Pc(27) Class4_Sub25 local27 = arg0 ? (Class4_Sub25) this.aClass96_33.method2798() : (Class4_Sub25) this.aClass96_33.method2796(); local27 != null; local27 = (Class4_Sub25) this.aClass96_33.method2796()) {
			if ((local27.aLong145 & 0x3FFFFFFFFFFFFFFFL) < local13) {
				if ((local27.aLong145 & 0x4000000000000000L) != 0L) {
					@Pc(54) int local54 = (int) local27.aLong228;
					this.anIntArray506[local54] = this.anIntArray505[local54];
					local27.method6330();
					return local54;
				}
				local27.method6330();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)V")
	public void method5158(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class211 local8 = Static166.aClass86_3.method2418(arg0);
		@Pc(11) int local11 = local8.anInt5978;
		@Pc(14) int local14 = local8.anInt5983;
		@Pc(17) int local17 = local8.anInt5981;
		@Pc(28) int local28 = Class4_Sub1_Sub7.anIntArray183[local17 - local14];
		if (arg1 < 0 || arg1 > local28) {
			arg1 = 0;
		}
		local28 <<= local14;
		this.method5161(arg1 << local14 & local28 | ~local28 & this.anIntArray505[local11], local11);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IBI)V")
	public void method5159(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray506[arg0] = arg1;
		@Pc(16) Class4_Sub25 local16 = (Class4_Sub25) this.aClass96_33.method2797((long) arg0);
		if (local16 == null) {
			local16 = new Class4_Sub25(Static167.method2929() + 500L);
			this.aClass96_33.method2805((long) arg0, local16);
		} else {
			local16.aLong145 = Static167.method2929() + 500L;
		}
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(II)I")
	@Override
	public int method5154(@OriginalArg(0) int arg0) {
		@Pc(8) Class211 local8 = Static166.aClass86_3.method2418(arg0);
		@Pc(18) int local18 = local8.anInt5978;
		@Pc(21) int local21 = local8.anInt5983;
		@Pc(24) int local24 = local8.anInt5981;
		@Pc(30) int local30 = Class4_Sub1_Sub7.anIntArray183[local24 - local21];
		return this.anIntArray506[local18] >> local21 & local30;
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(III)V")
	public void method5160(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class211 local8 = Static166.aClass86_3.method2418(arg0);
		@Pc(11) int local11 = local8.anInt5978;
		@Pc(14) int local14 = local8.anInt5983;
		@Pc(17) int local17 = local8.anInt5981;
		@Pc(32) int local32 = Class4_Sub1_Sub7.anIntArray183[local17 - local14];
		if (arg1 < 0 || local32 < arg1) {
			arg1 = 0;
		}
		local32 <<= local14;
		this.method5159(local11, ~local32 & this.anIntArray506[local11] | local32 & arg1 << local14);
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(IBI)V")
	public void method5161(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray505[arg1] = arg0;
		@Pc(20) Class4_Sub25 local20 = (Class4_Sub25) this.aClass96_33.method2797((long) arg1);
		if (local20 == null) {
			local20 = new Class4_Sub25(4611686018427387905L);
			this.aClass96_33.method2805((long) arg1, local20);
		} else if (local20.aLong145 != 4611686018427387905L) {
			local20.aLong145 = Static167.method2929() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)I")
	@Override
	public int method5153(@OriginalArg(1) int arg0) {
		return this.anIntArray506[arg0];
	}
}
