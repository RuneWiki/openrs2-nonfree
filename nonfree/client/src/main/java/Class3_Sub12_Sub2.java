import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lba")
public final class Class3_Sub12_Sub2 extends Class3_Sub12 {

	@OriginalMember(owner = "client!lba", name = "s", descriptor = "Lclient!qw;")
	public final Class302 aClass302_28 = new Class302();

	@OriginalMember(owner = "client!lba", name = "y", descriptor = "Lclient!dp;")
	public final Class3_Sub12_Sub1 aClass3_Sub12_Sub1_2 = new Class3_Sub12_Sub1();

	@OriginalMember(owner = "client!lba", name = "v", descriptor = "Lclient!tga;")
	private final Class3_Sub12_Sub3 aClass3_Sub12_Sub3_1;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Lclient!tga;)V")
	public Class3_Sub12_Sub2(@OriginalArg(0) Class3_Sub12_Sub3 arg0) {
		this.aClass3_Sub12_Sub3_1 = arg0;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
	@Override
	public void method8942(@OriginalArg(0) int arg0) {
		this.aClass3_Sub12_Sub1_2.method8942(arg0);
		for (@Pc(15) Class3_Sub16 local15 = (Class3_Sub16) this.aClass302_28.method6603(); local15 != null; local15 = (Class3_Sub16) this.aClass302_28.method6605()) {
			if (!this.aClass3_Sub12_Sub3_1.method7548(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt2830) {
						this.method4672(local25, local15);
						local15.anInt2830 -= local25;
						break;
					}
					this.method4672(local15.anInt2830, local15);
					local25 -= local15.anInt2830;
				} while (!this.aClass3_Sub12_Sub3_1.method7547(local25, 0, local15, (int[]) null));
			}
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILclient!ew;B)V")
	private void method4672(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub16 arg1) {
		if ((this.aClass3_Sub12_Sub3_1.anIntArray502[arg1.anInt2816] & 0x4) != 0 && arg1.anInt2828 < 0) {
			@Pc(36) int local36 = this.aClass3_Sub12_Sub3_1.anIntArray489[arg1.anInt2816] / Static16.anInt10139;
			@Pc(46) int local46 = (local36 + 1048575 - arg1.anInt2815) / local36;
			arg1.anInt2815 = local36 * arg0 + arg1.anInt2815 & 0xFFFFF;
			if (arg0 >= local46) {
				if (this.aClass3_Sub12_Sub3_1.anIntArray498[arg1.anInt2816] == 0) {
					arg1.aClass3_Sub12_Sub4_2 = Static687.method8546(arg1.aClass3_Sub39_Sub1_2, arg1.aClass3_Sub12_Sub4_2.method8531(), arg1.aClass3_Sub12_Sub4_2.method8527(), arg1.aClass3_Sub12_Sub4_2.method8559());
				} else {
					arg1.aClass3_Sub12_Sub4_2 = Static687.method8546(arg1.aClass3_Sub39_Sub1_2, arg1.aClass3_Sub12_Sub4_2.method8531(), 0, arg1.aClass3_Sub12_Sub4_2.method8559());
					this.aClass3_Sub12_Sub3_1.method7564(arg1.aClass3_Sub35_1.aShortArray72[arg1.anInt2831] < 0, arg1);
				}
				if (arg1.aClass3_Sub35_1.aShortArray72[arg1.anInt2831] < 0) {
					arg1.aClass3_Sub12_Sub4_2.method8528(-1);
				}
				arg0 = arg1.anInt2815 / local36;
			}
		}
		arg1.aClass3_Sub12_Sub4_2.method8942(arg0);
	}

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "()I")
	@Override
	public int method8947() {
		return 0;
	}

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "()Lclient!pp;")
	@Override
	public Class3_Sub12 method8946() {
		@Pc(9) Class3_Sub16 local9 = (Class3_Sub16) this.aClass302_28.method6603();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub12_Sub4_2 == null) {
			return this.method8945();
		} else {
			return local9.aClass3_Sub12_Sub4_2;
		}
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "()Lclient!pp;")
	@Override
	public Class3_Sub12 method8945() {
		@Pc(9) Class3_Sub16 local9;
		do {
			local9 = (Class3_Sub16) this.aClass302_28.method6605();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub12_Sub4_2 == null);
		return local9.aClass3_Sub12_Sub4_2;
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "([III)V")
	@Override
	public void method8948(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub12_Sub1_2.method8948(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub16 local17 = (Class3_Sub16) this.aClass302_28.method6603(); local17 != null; local17 = (Class3_Sub16) this.aClass302_28.method6605()) {
			if (!this.aClass3_Sub12_Sub3_1.method7548(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt2830 >= local29) {
						this.method4673(local27 + local29, local29, local17, local27, arg0);
						local17.anInt2830 -= local29;
						break;
					}
					this.method4673(local27 + local29, local17.anInt2830, local17, local27, arg0);
					local29 -= local17.anInt2830;
					local27 += local17.anInt2830;
				} while (!this.aClass3_Sub12_Sub3_1.method7547(local29, local27, local17, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IILclient!ew;BI[I)V")
	private void method4673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub16 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass3_Sub12_Sub3_1.anIntArray502[arg2.anInt2816] & 0x4) != 0 && arg2.anInt2828 < 0) {
			@Pc(25) int local25 = this.aClass3_Sub12_Sub3_1.anIntArray489[arg2.anInt2816] / Static16.anInt10139;
			while (true) {
				@Pc(35) int local35 = (local25 + 1048575 - arg2.anInt2815) / local25;
				if (arg1 < local35) {
					arg2.anInt2815 += arg1 * local25;
					break;
				}
				arg2.aClass3_Sub12_Sub4_2.method8948(arg4, arg3, local35);
				arg2.anInt2815 += local25 * local35 - 1048576;
				arg1 -= local35;
				arg3 += local35;
				@Pc(66) int local66 = Static16.anInt10139 / 100;
				@Pc(70) int local70 = 262144 / local25;
				if (local70 < local66) {
					local66 = local70;
				}
				@Pc(78) Class3_Sub12_Sub4 local78 = arg2.aClass3_Sub12_Sub4_2;
				if (this.aClass3_Sub12_Sub3_1.anIntArray498[arg2.anInt2816] == 0) {
					arg2.aClass3_Sub12_Sub4_2 = Static687.method8546(arg2.aClass3_Sub39_Sub1_2, local78.method8531(), local78.method8527(), local78.method8559());
				} else {
					arg2.aClass3_Sub12_Sub4_2 = Static687.method8546(arg2.aClass3_Sub39_Sub1_2, local78.method8531(), 0, local78.method8559());
					this.aClass3_Sub12_Sub3_1.method7564(arg2.aClass3_Sub35_1.aShortArray72[arg2.anInt2831] < 0, arg2);
					arg2.aClass3_Sub12_Sub4_2.method8557(local66, local78.method8527());
				}
				if (arg2.aClass3_Sub35_1.aShortArray72[arg2.anInt2831] < 0) {
					arg2.aClass3_Sub12_Sub4_2.method8528(-1);
				}
				local78.method8532(local66);
				local78.method8948(arg4, arg3, arg0 - arg3);
				if (local78.method8543()) {
					this.aClass3_Sub12_Sub1_2.method1765(local78);
				}
			}
		}
		arg2.aClass3_Sub12_Sub4_2.method8948(arg4, arg3, arg1);
	}
}
