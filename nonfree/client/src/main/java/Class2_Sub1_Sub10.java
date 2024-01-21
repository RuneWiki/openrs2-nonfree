import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class2_Sub1_Sub10 extends Class2_Sub1 {

	@OriginalMember(owner = "client!g", name = "M", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!g", name = "bb", descriptor = "F")
	private float aFloat2;

	@OriginalMember(owner = "client!g", name = "ab", descriptor = "Z")
	public boolean aBoolean75 = false;

	@OriginalMember(owner = "client!g", name = "D", descriptor = "Lclient!l;")
	private final Class48 aClass48_1;

	@OriginalMember(owner = "client!g", name = "F", descriptor = "Z")
	public boolean aBoolean72;

	@OriginalMember(owner = "client!g", name = "E", descriptor = "Z")
	public final boolean aBoolean71;

	@OriginalMember(owner = "client!g", name = "P", descriptor = "I")
	public final int anInt1815;

	@OriginalMember(owner = "client!g", name = "H", descriptor = "Z")
	private boolean aBoolean73;

	@OriginalMember(owner = "client!g", name = "Z", descriptor = "I")
	public int anInt1822;

	@OriginalMember(owner = "client!g", name = "U", descriptor = "I")
	private int anInt1819;

	@OriginalMember(owner = "client!g", name = "T", descriptor = "I")
	private int anInt1818;

	@OriginalMember(owner = "client!g", name = "V", descriptor = "I")
	private int anInt1820;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!og;)V")
	public Class2_Sub1_Sub10(@OriginalArg(0) Class2_Sub3 arg0) {
		this.aClass48_1 = new Class48(arg0);
		@Pc(14) int local14 = arg0.method218();
		this.aBoolean72 = (local14 & 0x2) != 0;
		this.aBoolean71 = (local14 & 0x1) != 0;
		@Pc(39) int local39 = arg0.method218();
		this.anInt1815 = 0x1 << (local39 & 0x7) + 1;
		this.aBoolean73 = (local39 & 0x8) != 0;
		this.anInt1822 = arg0.method234();
		this.anInt1819 = arg0.method218();
		if (this.anInt1819 == 255) {
			this.anInt1819 = 256;
		}
		this.anInt1818 = arg0.method227();
		this.anInt1820 = arg0.method227();
		arg0.method218();
		arg0.method218();
		arg0.method218();
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub10() {
		this.aClass48_1 = new Class48();
		this.anInt1815 = 64;
		this.aBoolean71 = true;
	}

	@OriginalMember(owner = "client!g", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(IB)V")
	public void method1354(@OriginalArg(0) int arg0) {
		if (this.anIntArray172 == null || this.anInt1820 == 0 && this.anInt1818 == 0) {
			return;
		}
		if (Static94.anIntArray323 == null || this.anIntArray172.length > Static94.anIntArray323.length) {
			Static94.anIntArray323 = new int[this.anIntArray172.length];
		}
		@Pc(46) int local46 = this.anIntArray172.length == 4096 ? 64 : 128;
		@Pc(51) int local51 = this.anInt1818 * arg0;
		@Pc(55) int local55 = local46 - 1;
		@Pc(59) int local59 = this.anIntArray172.length;
		@Pc(63) int local63 = local59 - 1;
		@Pc(70) int local70 = arg0 * local46 * this.anInt1820;
		for (@Pc(72) int local72 = 0; local72 < local59; local72 += local46) {
			@Pc(80) int local80 = local63 & local72 + local70;
			for (@Pc(82) int local82 = 0; local82 < local46; local82++) {
				@Pc(89) int local89 = local72 + local82;
				@Pc(97) int local97 = (local55 & local82 + local51) + local80;
				Static94.anIntArray323[local89] = this.anIntArray172[local97];
			}
		}
		@Pc(122) int[] local122 = this.anIntArray172;
		this.anIntArray172 = Static94.anIntArray323;
		Static94.anIntArray323 = local122;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!of;FIILclient!pe;)[I")
	public int[] method1357(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class13 arg3) {
		if (this.anIntArray172 == null || this.aFloat2 != arg1) {
			if (!this.aClass48_1.method2271(arg3, arg0)) {
				return null;
			}
			@Pc(40) int local40 = arg2 >= this.anInt1815 ? this.anInt1815 : arg2;
			this.anIntArray172 = this.aClass48_1.method2273(arg3, local40, (double) arg1, true, arg0, local40);
			this.aFloat2 = arg1;
			if (this.aBoolean73) {
				@Pc(62) int[] local62 = new int[local40];
				@Pc(65) int[] local65 = new int[local40];
				@Pc(68) int[] local68 = new int[local40];
				@Pc(73) int[] local73 = new int[local40 * local40];
				@Pc(78) int local78 = local40;
				@Pc(79) int local79 = local40;
				@Pc(85) int local85 = local40 - 1;
				@Pc(89) int local89 = local40 * local40;
				@Pc(95) int local95;
				for (@Pc(91) int local91 = 2; local91 >= 0; local91--) {
					for (local95 = local85; local95 >= 0; local95--) {
						local78--;
						@Pc(103) int local103 = this.anIntArray172[local78];
						local62[local95] += local103 >> 16 & 0xFF;
						local65[local95] += local103 >> 8 & 0xFF;
						local68[local95] += local103 & 0xFF;
					}
					if (local78 == 0) {
						local78 = local89;
					}
				}
				@Pc(151) int local151 = local40 - 1;
				@Pc(153) int local153 = local89;
				for (@Pc(155) int local155 = local151; local155 >= 0; local155--) {
					@Pc(160) int local160 = 0;
					@Pc(162) int local162 = 0;
					@Pc(163) int local163 = 0;
					@Pc(165) int local165 = 1;
					@Pc(167) int local167 = 1;
					for (local95 = 2; local95 >= 0; local95--) {
						local167--;
						local162 += local68[local167];
						local163 += local62[local167];
						local160 += local65[local167];
						if (local167 == 0) {
							local167 = local40;
						}
					}
					for (local95 = local85; local95 >= 0; local95--) {
						local167--;
						local165--;
						@Pc(207) int local207 = local162 / 9;
						@Pc(211) int local211 = local163 / 9;
						@Pc(215) int local215 = local160 / 9;
						local153--;
						local73[local153] = local211 << 16 | local215 << 8 | local207;
						local162 += local68[local167] - local68[local165];
						local163 += local62[local167] - local62[local165];
						local160 += local65[local167] - local65[local165];
						if (local165 == 0) {
							local165 = local40;
						}
						if (local167 == 0) {
							local167 = local40;
						}
					}
					for (local95 = local85; local95 >= 0; local95--) {
						local79--;
						@Pc(287) int local287 = this.anIntArray172[local79];
						local78--;
						@Pc(293) int local293 = this.anIntArray172[local78];
						local62[local95] += (local293 >> 16 & 0xFF) - (local287 >> 16 & 0xFF);
						local65[local95] += (local293 >> 8 & 0xFF) - ((local287 & 0xFF1C) >> 8);
						local68[local95] += (local293 & 0xFF) - (local287 & 0xFF);
					}
					if (local78 == 0) {
						local78 = local89;
					}
					if (local79 == 0) {
						local79 = local89;
					}
				}
				this.anIntArray172 = local73;
			}
		}
		return this.anIntArray172;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!pe;BLclient!of;)Z")
	public boolean method1358(@OriginalArg(0) Class13 arg0, @OriginalArg(2) Interface1 arg1) {
		return this.aClass48_1.method2271(arg0, arg1);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!pe;ILclient!of;)[I")
	public int[] method1359(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(3) Interface1 arg2) {
		if (this.aClass48_1.method2271(arg1, arg2)) {
			@Pc(21) int local21 = this.anInt1815 <= arg0 ? this.anInt1815 : arg0;
			return this.aClass48_1.method2273(arg1, local21, 1.0D, false, arg2, local21);
		} else {
			return null;
		}
	}
}
