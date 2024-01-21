import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!cb", name = "P", descriptor = "F")
	private float aFloat1;

	@OriginalMember(owner = "client!cb", name = "gb", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!cb", name = "lb", descriptor = "Z")
	public boolean aBoolean29 = false;

	@OriginalMember(owner = "client!cb", name = "U", descriptor = "Lclient!dg;")
	private final Class17 aClass17_1;

	@OriginalMember(owner = "client!cb", name = "N", descriptor = "Z")
	public boolean aBoolean26;

	@OriginalMember(owner = "client!cb", name = "fb", descriptor = "Z")
	public final boolean aBoolean28;

	@OriginalMember(owner = "client!cb", name = "nb", descriptor = "I")
	public final int anInt697;

	@OriginalMember(owner = "client!cb", name = "qb", descriptor = "Z")
	private boolean aBoolean31;

	@OriginalMember(owner = "client!cb", name = "Y", descriptor = "Z")
	private boolean aBoolean27;

	@OriginalMember(owner = "client!cb", name = "hb", descriptor = "I")
	public int anInt693;

	@OriginalMember(owner = "client!cb", name = "kb", descriptor = "I")
	private int anInt695;

	@OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
	private int anInt689;

	@OriginalMember(owner = "client!cb", name = "pb", descriptor = "I")
	private int anInt698;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!wa;)V")
	public Class1_Sub2_Sub4(@OriginalArg(0) Class1_Sub14 arg0) {
		this.aClass17_1 = new Class17(arg0);
		@Pc(14) int local14 = arg0.method1738();
		this.aBoolean26 = (local14 & 0x2) != 0;
		this.aBoolean28 = (local14 & 0x1) != 0;
		@Pc(48) int local48 = arg0.method1738();
		this.anInt697 = 0x1 << (local48 & 0x7) + 1;
		this.aBoolean31 = (local48 & 0x8) != 0;
		this.aBoolean27 = (local48 & 0x80) != 0;
		this.anInt693 = arg0.method1753();
		this.anInt695 = arg0.method1738();
		if (this.anInt695 == 255) {
			this.anInt695 = 256;
		}
		this.anInt689 = arg0.method1720();
		this.anInt698 = arg0.method1720();
		arg0.method1738();
		arg0.method1738();
		arg0.method1738();
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub4() {
		this.aClass17_1 = new Class17();
		this.aBoolean28 = true;
		this.anInt697 = 64;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!j;FLclient!sd;B)[I")
	public int[] method414(@OriginalArg(0) int arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class60 arg3) {
		if (this.anIntArray72 == null || this.aFloat1 != arg2) {
			if (!this.aClass17_1.method681(arg1, arg3)) {
				return null;
			}
			@Pc(44) int local44 = arg0 >= this.anInt697 ? this.anInt697 : arg0;
			this.anIntArray72 = this.aClass17_1.method682(local44, this.aBoolean27, arg3, arg1, true, local44, (double) arg2);
			this.aFloat1 = arg2;
			if (this.aBoolean31) {
				@Pc(68) int[] local68 = new int[local44];
				@Pc(71) int[] local71 = new int[local44];
				@Pc(76) int[] local76 = new int[local44 * local44];
				@Pc(79) int[] local79 = new int[local44];
				@Pc(85) int local85 = local44 - 1;
				@Pc(90) int local90 = local44;
				@Pc(91) int local91 = local44;
				@Pc(95) int local95 = local44 * local44;
				@Pc(101) int local101;
				for (@Pc(97) int local97 = 2; local97 >= 0; local97--) {
					for (local101 = local85; local101 >= 0; local101--) {
						local90--;
						@Pc(109) int local109 = this.anIntArray72[local90];
						local68[local101] += local109 >> 16 & 0xFF;
						local79[local101] += local109 >> 8 & 0xFF;
						local71[local101] += local109 & 0xFF;
					}
					if (local90 == 0) {
						local90 = local95;
					}
				}
				@Pc(160) int local160 = local44 - 1;
				@Pc(162) int local162 = local95;
				for (@Pc(164) int local164 = local160; local164 >= 0; local164--) {
					@Pc(168) int local168 = 1;
					@Pc(170) int local170 = 1;
					@Pc(173) int local173 = 0;
					@Pc(175) int local175 = 0;
					@Pc(176) int local176 = 0;
					for (local101 = 2; local101 >= 0; local101--) {
						local168--;
						local173 += local79[local168];
						local175 += local71[local168];
						local176 += local68[local168];
						if (local168 == 0) {
							local168 = local44;
						}
					}
					for (local101 = local85; local101 >= 0; local101--) {
						@Pc(220) int local220 = local176 / 9;
						@Pc(224) int local224 = local175 / 9;
						local170--;
						local168--;
						@Pc(230) int local230 = local173 / 9;
						local162--;
						local76[local162] = local220 << 16 | local230 << 8 | local224;
						local173 += local79[local168] - local79[local170];
						local175 += local71[local168] - local71[local170];
						local176 += local68[local168] - local68[local170];
						if (local170 == 0) {
							local170 = local44;
						}
						if (local168 == 0) {
							local168 = local44;
						}
					}
					for (local101 = local85; local101 >= 0; local101--) {
						local91--;
						@Pc(298) int local298 = this.anIntArray72[local91];
						local90--;
						@Pc(304) int local304 = this.anIntArray72[local90];
						local68[local101] += (local304 >> 16 & 0xFF) - ((local298 & 0xFFF22C) >> 16);
						local79[local101] += (local304 >> 8 & 0xFF) - (local298 >> 8 & 0xFF);
						local71[local101] += (local304 & 0xFF) - (local298 & 0xFF);
					}
					if (local91 == 0) {
						local91 = local95;
					}
					if (local90 == 0) {
						local90 = local95;
					}
				}
				this.anIntArray72 = local76;
			}
		}
		return this.anIntArray72;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!j;Lclient!sd;)Z")
	public boolean method416(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) Class60 arg1) {
		return this.aClass17_1.method681(arg0, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)V")
	public void method417(@OriginalArg(1) int arg0) {
		if (this.anIntArray72 == null || this.anInt698 == 0 && this.anInt689 == 0) {
			return;
		}
		@Pc(28) int local28 = arg0 * this.anInt689;
		if (Static157.anIntArray491 == null || Static157.anIntArray491.length < this.anIntArray72.length) {
			Static157.anIntArray491 = new int[this.anIntArray72.length];
		}
		@Pc(49) int local49 = this.anIntArray72.length;
		@Pc(60) int local60 = this.anIntArray72.length == 4096 ? 64 : 128;
		@Pc(67) int local67 = arg0 * local60 * this.anInt698;
		@Pc(71) int local71 = local49 - 1;
		@Pc(75) int local75 = local60 - 1;
		for (@Pc(77) int local77 = 0; local77 < local49; local77 += local60) {
			@Pc(85) int local85 = local71 & local77 + local67;
			for (@Pc(87) int local87 = 0; local87 < local60; local87++) {
				@Pc(94) int local94 = local77 + local87;
				@Pc(103) int local103 = local85 + (local75 & local87 + local28);
				Static157.anIntArray491[local94] = this.anIntArray72[local103];
			}
		}
		@Pc(128) int[] local128 = this.anIntArray72;
		this.anIntArray72 = Static157.anIntArray491;
		Static157.anIntArray491 = local128;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!j;Lclient!sd;BI)[I")
	public int[] method421(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass17_1.method681(arg0, arg1)) {
			@Pc(26) int local26 = arg2 < this.anInt697 ? arg2 : this.anInt697;
			return this.aClass17_1.method682(local26, this.aBoolean27, arg1, arg0, false, local26, 1.0D);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}
}
