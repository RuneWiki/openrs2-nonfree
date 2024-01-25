import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class178 {

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "Lclient!xa;")
	private Class119 aClass119_18;

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
	private int anInt5706;

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
	private int anInt5708;

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
	private int anInt5707 = -1;

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "Z")
	private boolean aBoolean367 = true;

	@OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
	private final int anInt5710;

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "[Lclient!rk;")
	private final Class258[] aClass258Array1;

	@OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
	private final int anInt5712;

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
	private final int anInt5702;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
	private final int anInt5703;

	@OriginalMember(owner = "client!ll", name = "o", descriptor = "[Lclient!rk;")
	private final Class258[] aClass258Array2;

	@OriginalMember(owner = "client!ll", name = "r", descriptor = "Lclient!rk;")
	private final Class258 aClass258_1;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(I[Lclient!rk;IIII)V")
	public Class178(@OriginalArg(0) int arg0, @OriginalArg(1) Class258[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5710 = arg5;
		this.aClass258Array1 = arg1;
		this.anInt5712 = arg3;
		this.anInt5702 = arg4;
		this.anInt5703 = arg0;
		if (arg1 == null) {
			this.aClass258Array2 = null;
			this.aClass258_1 = null;
		} else {
			this.aClass258Array2 = new Class258[arg1.length];
			this.aClass258_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!oa;Z)Z")
	public boolean method4788(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1) {
		if (arg0 != this.anInt5707) {
			this.anInt5707 = arg0;
			@Pc(16) int local16 = Static27.method797(arg0);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (this.anInt5708 != local16) {
				this.anInt5708 = local16;
				this.aClass119_18 = null;
			}
			if (this.aClass258Array1 != null) {
				this.anInt5706 = 0;
				@Pc(53) int[] local53 = new int[this.aClass258Array1.length];
				for (@Pc(55) int local55 = 0; local55 < this.aClass258Array1.length; local55++) {
					@Pc(62) Class258 local62 = this.aClass258Array1[local55];
					if (local62.method6487(this.anInt5712, this.anInt5702, this.anInt5710, this.anInt5707)) {
						local53[this.anInt5706] = local62.anInt7840;
						this.aClass258Array2[this.anInt5706++] = local62;
					}
				}
				Static346.method5506(this.anInt5706 - 1, 0, this.aClass258Array2, local53);
			}
			this.aBoolean367 = true;
		}
		@Pc(117) boolean local117 = false;
		if (this.aBoolean367) {
			this.aBoolean367 = false;
			for (@Pc(128) int local128 = this.anInt5706 - 1; local128 >= 0; local128--) {
				@Pc(139) boolean local139 = this.aClass258Array2[local128].method6488(arg1, this.aClass258_1);
				this.aBoolean367 |= !local139;
				local117 |= local139;
			}
		}
		return local117;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
	public void method4790() {
		if (this.aClass258Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass258Array1.length; local10++) {
				this.aClass258Array1[local10].method6490();
			}
		}
		this.aClass119_18 = null;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIIILclient!oa;II)V")
	public void method4793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class5 arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg3 + arg8 & 0x3FFF;
		if (this.anInt5703 == -1) {
			arg7.C(arg1, arg2, arg0, arg5, arg6, 0);
		} else {
			@Pc(34) Class238 local34 = Static488.anInterface4_13.method6712(this.anInt5703);
			if (this.aClass119_18 == null && Static488.anInterface4_13.method6708(this.anInt5703)) {
				@Pc(70) int[] local70 = local34.aBoolean465 ? Static488.anInterface4_13.method6707(this.anInt5708, this.anInt5703, this.anInt5708, 0.7F) : Static488.anInterface4_13.method6711(this.anInt5708, 0.7F, this.anInt5703, this.anInt5708, false);
				this.aClass119_18 = arg7.method7483(local70, this.anInt5708, this.anInt5708, this.anInt5708);
			}
			if (local34.aBoolean465) {
				arg7.C(arg1, arg2, arg0, arg5, arg6, 0);
			}
			if (this.aClass119_18 != null) {
				@Pc(103) int local103 = local34.aBoolean465 ? 1 : 0;
				@Pc(109) int local109 = arg5 * arg4 / -4096;
				@Pc(122) int local122;
				for (local122 = (arg0 - arg5) / 2 + arg5 * local7 / 4096; local122 > arg5; local122 -= arg5) {
				}
				while (local122 < 0) {
					local122 += arg5;
				}
				while (local109 > arg5) {
					local109 -= arg5;
				}
				while (local109 < 0) {
					local109 += arg5;
				}
				for (@Pc(171) int local171 = local122 - arg5; local171 < arg0; local171 += arg5) {
					for (@Pc(178) int local178 = local109 - arg5; local178 < arg5; local178 += arg5) {
						this.aClass119_18.KA(local171 + arg1, arg2 + local178, arg5, arg5, 1, 0, local103);
					}
				}
			}
		}
		for (@Pc(217) int local217 = this.anInt5706 - 1; local217 >= 0; local217--) {
			this.aClass258Array2[local217].method6495(arg7, arg1, arg2, arg0, arg5, arg4, local7);
		}
	}
}
