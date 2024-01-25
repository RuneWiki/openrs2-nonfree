import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!oi", name = "z", descriptor = "Lclient!cf;")
	public final Class30 aClass30_36 = new Class30();

	@OriginalMember(owner = "client!oi", name = "J", descriptor = "Lclient!ab;")
	public final Class2_Sub2_Sub1 aClass2_Sub2_Sub1_1 = new Class2_Sub2_Sub1();

	@OriginalMember(owner = "client!oi", name = "x", descriptor = "Lclient!vg;")
	private final Class2_Sub2_Sub4 aClass2_Sub2_Sub4_26;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!vg;)V")
	public Class2_Sub2_Sub3(@OriginalArg(0) Class2_Sub2_Sub4 arg0) {
		this.aClass2_Sub2_Sub4_26 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "()I")
	@Override
	public int method5267() {
		return 0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "([III)V")
	@Override
	public void method5269(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub2_Sub1_1.method5269(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub24 local17 = (Class2_Sub24) this.aClass30_36.method694(); local17 != null; local17 = (Class2_Sub24) this.aClass30_36.method682()) {
			if (!this.aClass2_Sub2_Sub4_26.method5292(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt2947 >= local27) {
						this.method3934(local17, local29 + local27, arg0, local29, local27);
						local17.anInt2947 -= local27;
						break;
					}
					this.method3934(local17, local29 + local27, arg0, local29, local17.anInt2947);
					local29 += local17.anInt2947;
					local27 -= local17.anInt2947;
				} while (!this.aClass2_Sub2_Sub4_26.method5298(arg0, local27, local17, local29));
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!io;IZ[III)V")
	private void method3934(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub2_Sub4_26.anIntArray1292[arg0.anInt2946] & 0x4) != 0 && arg0.anInt2932 < 0) {
			@Pc(29) int local29 = this.aClass2_Sub2_Sub4_26.anIntArray1281[arg0.anInt2946] / Static42.anInt4820;
			while (true) {
				@Pc(39) int local39 = (local29 + 1048575 - arg0.anInt2938) / local29;
				if (arg4 < local39) {
					arg0.anInt2938 += arg4 * local29;
					break;
				}
				arg0.aClass2_Sub2_Sub2_1.method5269(arg2, arg3, local39);
				arg3 += local39;
				arg4 -= local39;
				arg0.anInt2938 += local39 * local29 - 1048576;
				@Pc(70) int local70 = Static42.anInt4820 / 100;
				@Pc(74) int local74 = 262144 / local29;
				if (local70 > local74) {
					local70 = local74;
				}
				@Pc(86) Class2_Sub2_Sub2 local86 = arg0.aClass2_Sub2_Sub2_1;
				if (this.aClass2_Sub2_Sub4_26.anIntArray1285[arg0.anInt2946] == 0) {
					arg0.aClass2_Sub2_Sub2_1 = Static402.method3394(arg0.aClass2_Sub15_Sub1_1, local86.method3405(), local86.method3414(), local86.method3396());
				} else {
					arg0.aClass2_Sub2_Sub2_1 = Static402.method3394(arg0.aClass2_Sub15_Sub1_1, local86.method3405(), 0, local86.method3396());
					this.aClass2_Sub2_Sub4_26.method5295(arg0, arg0.aClass2_Sub18_1.aShortArray31[arg0.anInt2930] < 0);
					arg0.aClass2_Sub2_Sub2_1.method3427(local70, local86.method3414());
				}
				if (arg0.aClass2_Sub18_1.aShortArray31[arg0.anInt2930] < 0) {
					arg0.aClass2_Sub2_Sub2_1.method3419(-1);
				}
				local86.method3398(local70);
				local86.method5269(arg2, arg3, arg1 - arg3);
				if (local86.method3418()) {
					this.aClass2_Sub2_Sub1_1.method59(local86);
				}
			}
		}
		arg0.aClass2_Sub2_Sub2_1.method5269(arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "()Lclient!oe;")
	@Override
	public Class2_Sub2 method5266() {
		@Pc(9) Class2_Sub24 local9 = (Class2_Sub24) this.aClass30_36.method694();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub2_Sub2_1 == null) {
			return this.method5268();
		} else {
			return local9.aClass2_Sub2_Sub2_1;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!io;BI)V")
	private void method3935(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass2_Sub2_Sub4_26.anIntArray1292[arg0.anInt2946] & 0x4) != 0 && arg0.anInt2932 < 0) {
			@Pc(20) int local20 = this.aClass2_Sub2_Sub4_26.anIntArray1281[arg0.anInt2946] / Static42.anInt4820;
			@Pc(30) int local30 = (local20 + 1048575 - arg0.anInt2938) / local20;
			arg0.anInt2938 = arg1 * local20 + arg0.anInt2938 & 0xFFFFF;
			if (arg1 >= local30) {
				if (this.aClass2_Sub2_Sub4_26.anIntArray1285[arg0.anInt2946] == 0) {
					arg0.aClass2_Sub2_Sub2_1 = Static402.method3394(arg0.aClass2_Sub15_Sub1_1, arg0.aClass2_Sub2_Sub2_1.method3405(), arg0.aClass2_Sub2_Sub2_1.method3414(), arg0.aClass2_Sub2_Sub2_1.method3396());
				} else {
					arg0.aClass2_Sub2_Sub2_1 = Static402.method3394(arg0.aClass2_Sub15_Sub1_1, arg0.aClass2_Sub2_Sub2_1.method3405(), 0, arg0.aClass2_Sub2_Sub2_1.method3396());
					this.aClass2_Sub2_Sub4_26.method5295(arg0, arg0.aClass2_Sub18_1.aShortArray31[arg0.anInt2930] < 0);
				}
				if (arg0.aClass2_Sub18_1.aShortArray31[arg0.anInt2930] < 0) {
					arg0.aClass2_Sub2_Sub2_1.method3419(-1);
				}
				arg1 = arg0.anInt2938 / local20;
			}
		}
		arg0.aClass2_Sub2_Sub2_1.method5271(arg1);
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "()Lclient!oe;")
	@Override
	public Class2_Sub2 method5268() {
		@Pc(9) Class2_Sub24 local9;
		do {
			local9 = (Class2_Sub24) this.aClass30_36.method682();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub2_Sub2_1 == null);
		return local9.aClass2_Sub2_Sub2_1;
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V")
	@Override
	public void method5271(@OriginalArg(0) int arg0) {
		this.aClass2_Sub2_Sub1_1.method5271(arg0);
		for (@Pc(15) Class2_Sub24 local15 = (Class2_Sub24) this.aClass30_36.method694(); local15 != null; local15 = (Class2_Sub24) this.aClass30_36.method682()) {
			if (!this.aClass2_Sub2_Sub4_26.method5292(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt2947 >= local25) {
						this.method3935(local15, local25);
						local15.anInt2947 -= local25;
						break;
					}
					this.method3935(local15, local15.anInt2947);
					local25 -= local15.anInt2947;
				} while (!this.aClass2_Sub2_Sub4_26.method5298(null, local25, local15, 0));
			}
		}
	}
}
