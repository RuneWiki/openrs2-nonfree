import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class256 {

	@OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
	private int anInt7250;

	@OriginalMember(owner = "client!vv", name = "k", descriptor = "I")
	private int anInt7252;

	@OriginalMember(owner = "client!vv", name = "q", descriptor = "Lclient!f;")
	private Class49 aClass49_21;

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "Z")
	private boolean aBoolean595 = true;

	@OriginalMember(owner = "client!vv", name = "i", descriptor = "I")
	private int anInt7251 = -1;

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
	private final int anInt7248;

	@OriginalMember(owner = "client!vv", name = "g", descriptor = "I")
	private final int anInt7249;

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
	private final int anInt7244;

	@OriginalMember(owner = "client!vv", name = "o", descriptor = "I")
	private final int anInt7254;

	@OriginalMember(owner = "client!vv", name = "m", descriptor = "[Lclient!oo;")
	private final Class181[] aClass181Array2;

	@OriginalMember(owner = "client!vv", name = "l", descriptor = "[Lclient!oo;")
	private final Class181[] aClass181Array1;

	@OriginalMember(owner = "client!vv", name = "p", descriptor = "Lclient!oo;")
	private final Class181 aClass181_1;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(I[Lclient!oo;IIII)V")
	public Class256(@OriginalArg(0) int arg0, @OriginalArg(1) Class181[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7248 = arg0;
		this.anInt7249 = arg4;
		this.anInt7244 = arg5;
		this.anInt7254 = arg3;
		this.aClass181Array2 = arg1;
		if (arg1 == null) {
			this.aClass181Array1 = null;
			this.aClass181_1 = null;
		} else {
			this.aClass181Array1 = new Class181[arg1.length];
			this.aClass181_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
	public void method5473() {
		if (this.aClass181Array2 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.aClass181Array2.length; local16++) {
				this.aClass181Array2[local16].method3827();
			}
		}
		this.aClass49_21 = null;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILclient!qa;IIIIBIII)V")
	public void method5476(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) int local8 = arg4 + arg0 & 0x3FFF;
		@Pc(91) int local91;
		if (this.anInt7248 == -1) {
			arg1.NA(arg6, arg3, arg5, arg8, arg2, 0);
		} else {
			@Pc(22) Class201 local22 = Static234.anInterface8_7.method1375(this.anInt7248);
			if (this.aClass49_21 == null && Static234.anInterface8_7.method1376(this.anInt7248)) {
				@Pc(58) int[] local58 = local22.aBoolean433 ? Static234.anInterface8_7.method1374(this.anInt7252, false, this.anInt7252, 0.7F, this.anInt7248) : Static234.anInterface8_7.method1373(this.anInt7252, this.anInt7252, this.anInt7248, 0.7F);
				this.aClass49_21 = arg1.method3572(local58, this.anInt7252, this.anInt7252, this.anInt7252);
			}
			if (!local22.aBoolean433) {
				arg1.NA(arg6, arg3, arg5, arg8, arg2, 0);
			}
			if (this.aClass49_21 != null) {
				local91 = local22.aBoolean433 ? 0 : 1;
				@Pc(97) int local97 = arg8 * arg7 / -4096;
				@Pc(109) int local109;
				for (local109 = local8 * arg8 / 4096 + (arg5 - arg8) / 2; local109 > arg8; local109 -= arg8) {
				}
				while (local97 > arg8) {
					local97 -= arg8;
				}
				while (local109 < 0) {
					local109 += arg8;
				}
				while (local97 < 0) {
					local97 += arg8;
				}
				for (@Pc(147) int local147 = local109 - arg8; local147 < arg5; local147 += arg8) {
					for (@Pc(154) int local154 = local97 - arg8; local154 < arg8; local154 += arg8) {
						this.aClass49_21.M(local147 + arg6, local154 - -arg3, arg8, arg8, 1, 0, local91);
					}
				}
			}
		}
		for (local91 = this.anInt7250 - 1; local91 >= 0; local91--) {
			this.aClass181Array1[local91].method3828(arg1, arg6, arg3, arg5, arg8, arg7, local8);
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(BLclient!qa;I)Z")
	public boolean method5477(@OriginalArg(1) Class128 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt7251 != arg1) {
			this.anInt7251 = arg1;
			@Pc(16) int local16 = Static88.method1286(arg1);
			if (arg1 < local16) {
				local16 = Static320.method4122(arg1);
			}
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 != this.anInt7252) {
				this.aClass49_21 = null;
				this.anInt7252 = local16;
			}
			if (this.aClass181Array2 != null) {
				this.anInt7250 = 0;
				@Pc(49) int[] local49 = new int[this.aClass181Array2.length];
				for (@Pc(51) int local51 = 0; local51 < this.aClass181Array2.length; local51++) {
					@Pc(58) Class181 local58 = this.aClass181Array2[local51];
					if (local58.method3830(this.anInt7254, this.anInt7249, this.anInt7244, this.anInt7251)) {
						local49[this.anInt7250] = local58.anInt4836;
						this.aClass181Array1[this.anInt7250++] = local58;
					}
				}
				Static417.method1207(this.anInt7250 - 1, 0, this.aClass181Array1, local49);
			}
			this.aBoolean595 = true;
		}
		@Pc(118) boolean local118 = false;
		if (this.aBoolean595) {
			this.aBoolean595 = false;
			for (@Pc(129) int local129 = this.anInt7250 - 1; local129 >= 0; local129--) {
				@Pc(140) boolean local140 = this.aClass181Array1[local129].method3832(arg0, this.aClass181_1);
				local118 |= local140;
				this.aBoolean595 |= !local140;
			}
		}
		return local118;
	}
}
