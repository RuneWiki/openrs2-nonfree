import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class3_Sub2_Sub8 extends Class3_Sub2 {

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "[I")
	private int[] anIntArray148;

	@OriginalMember(owner = "client!hb", name = "T", descriptor = "F")
	private float aFloat1;

	@OriginalMember(owner = "client!hb", name = "P", descriptor = "Z")
	public boolean aBoolean55 = false;

	@OriginalMember(owner = "client!hb", name = "W", descriptor = "Lclient!lb;")
	private final Class51 aClass51_1;

	@OriginalMember(owner = "client!hb", name = "Q", descriptor = "Z")
	public boolean aBoolean56;

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "Z")
	public final boolean aBoolean54;

	@OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
	public final int anInt1540;

	@OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
	public int anInt1543;

	@OriginalMember(owner = "client!hb", name = "Z", descriptor = "I")
	private int anInt1551;

	@OriginalMember(owner = "client!hb", name = "V", descriptor = "I")
	private int anInt1548;

	@OriginalMember(owner = "client!hb", name = "Y", descriptor = "I")
	private int anInt1550;

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
	private int anInt1533;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class3_Sub2_Sub8(@OriginalArg(0) Class3_Sub4 arg0) {
		this.aClass51_1 = new Class51(arg0);
		@Pc(14) int local14 = arg0.method191();
		this.aBoolean56 = (local14 & 0x2) != 0;
		this.aBoolean54 = (local14 & 0x1) != 0;
		this.anInt1540 = arg0.method191();
		this.anInt1543 = arg0.method208();
		this.anInt1551 = arg0.method191();
		if (this.anInt1551 == 255) {
			this.anInt1551 = 256;
		}
		@Pc(60) int local60 = arg0.method191();
		@Pc(64) int local64 = arg0.method191();
		this.anInt1548 = local64 >> 6 & 0x3;
		this.anInt1550 = local60 >> 6 & 0x3;
		this.anInt1533 = (local64 & 0x3F) - 6;
		arg0.method191();
		arg0.method191();
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub8() {
		this.aClass51_1 = new Class51();
		this.aBoolean54 = true;
		this.anInt1540 = 1;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)V")
	public void method1062(@OriginalArg(1) int arg0) {
		if (this.anIntArray148 == null) {
			return;
		}
		@Pc(34) short local34;
		@Pc(42) int local42;
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(62) int local62;
		@Pc(71) int local71;
		@Pc(89) int[] local89;
		if (this.anInt1548 != 0) {
			if (Static44.anIntArray112 == null || Static44.anIntArray112.length < this.anIntArray148.length) {
				Static44.anIntArray112 = new int[this.anIntArray148.length];
			}
			if (this.anIntArray148.length == 4096) {
				local34 = 64;
			} else {
				local34 = 128;
			}
			local42 = this.anIntArray148.length;
			local49 = this.anInt1533 * local34 * arg0;
			local53 = local42 - 1;
			if (this.anInt1548 == 2) {
				local49 = -local49;
			}
			for (local62 = 0; local62 < local42; local62++) {
				local71 = local62 + local49 & local53;
				Static44.anIntArray112[local62] = this.anIntArray148[local71];
			}
			local89 = this.anIntArray148;
			this.anIntArray148 = Static44.anIntArray112;
			Static44.anIntArray112 = local89;
		}
		if (this.anInt1550 == 0) {
			return;
		}
		if (Static44.anIntArray112 == null || Static44.anIntArray112.length < this.anIntArray148.length) {
			Static44.anIntArray112 = new int[this.anIntArray148.length];
		}
		local42 = this.anIntArray148.length;
		local49 = arg0 * this.anInt1533;
		if (this.anInt1550 == 1) {
			local49 = -local49;
		}
		if (this.anIntArray148.length == 4096) {
			local34 = 64;
		} else {
			local34 = 128;
		}
		local53 = local34 - 1;
		for (local62 = 0; local62 < local42; local62 += local34) {
			for (local71 = 0; local71 < local34; local71++) {
				@Pc(153) int local153 = local62 + local71;
				@Pc(161) int local161 = local62 + (local49 + local71 & local53);
				Static44.anIntArray112[local153] = this.anIntArray148[local161];
			}
		}
		local89 = this.anIntArray148;
		this.anIntArray148 = Static44.anIntArray112;
		Static44.anIntArray112 = local89;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!rh;Lclient!jg;I)Z")
	public boolean method1065(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class44 arg1) {
		return this.aClass51_1.method1477(arg1, arg0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!jg;BFLclient!rh;I)[I")
	public int[] method1066(@OriginalArg(0) Class44 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Interface3 arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray148 == null || this.aFloat1 != arg1) {
			if (!this.aClass51_1.method1477(arg0, arg2)) {
				return null;
			}
			@Pc(29) int local29 = this.anInt1540 > arg3 ? arg3 : this.anInt1540;
			this.anIntArray148 = this.aClass51_1.method1480(arg0, local29, arg2, true, local29, (double) arg1);
			this.aFloat1 = arg1;
		}
		return this.anIntArray148;
	}

	@OriginalMember(owner = "client!hb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!jg;Lclient!rh;I)[I")
	public int[] method1070(@OriginalArg(1) Class44 arg0, @OriginalArg(2) Interface3 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass51_1.method1477(arg0, arg1)) {
			@Pc(23) int local23 = arg2 >= this.anInt1540 ? this.anInt1540 : arg2;
			return this.aClass51_1.method1480(arg0, local23, arg1, false, local23, 1.0D);
		} else {
			return null;
		}
	}
}
