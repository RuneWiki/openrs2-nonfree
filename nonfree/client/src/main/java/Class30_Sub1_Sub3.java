import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class30_Sub1_Sub3 extends Class30_Sub1 {

	@OriginalMember(owner = "client!li", name = "E", descriptor = "Lclient!cc;")
	private Class41_Sub1 aClass41_Sub1_6;

	@OriginalMember(owner = "client!li", name = "H", descriptor = "I")
	private int anInt4583 = 0;

	@OriginalMember(owner = "client!li", name = "P", descriptor = "Z")
	public boolean aBoolean294 = false;

	@OriginalMember(owner = "client!li", name = "L", descriptor = "I")
	private int anInt4587 = 0;

	@OriginalMember(owner = "client!li", name = "U", descriptor = "I")
	private final int anInt4593 = -1;

	@OriginalMember(owner = "client!li", name = "O", descriptor = "I")
	private int anInt4590 = 0;

	@OriginalMember(owner = "client!li", name = "M", descriptor = "I")
	private int anInt4588 = -32768;

	@OriginalMember(owner = "client!li", name = "x", descriptor = "I")
	public final int anInt4575;

	@OriginalMember(owner = "client!li", name = "K", descriptor = "I")
	private final int anInt4586;

	@OriginalMember(owner = "client!li", name = "C", descriptor = "I")
	private final int anInt4580;

	@OriginalMember(owner = "client!li", name = "R", descriptor = "Lclient!sq;")
	private Class235 aClass235_2;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class30_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt4587 = arg12;
		this.anInt4575 = arg2 + arg1;
		this.anInt4586 = arg0;
		this.anInt4580 = arg4;
		@Pc(49) Class223 local49 = Static145.aClass63_1.method1524(this.anInt4586);
		@Pc(52) int local52 = local49.anInt6642;
		if (local52 == -1) {
			this.aBoolean294 = true;
		} else {
			this.aClass235_2 = Static107.aClass239_1.method5420(local52);
			this.aBoolean294 = false;
		}
		if (arg2 == this.anInt4575) {
			Static290.method4258(super.anInt7488, this.anInt4583, super.aByte102, super.anInt7490, false, this.aClass235_2);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!za;Lclient!e;)V")
	private void method3528(@OriginalArg(1) Class106 arg0, @OriginalArg(2) Class17 arg1) {
		@Pc(6) Class94[] local6 = arg1.method6201();
		@Pc(9) Class114[] local9 = arg1.method6205();
		if ((this.aClass41_Sub1_6 == null || this.aClass41_Sub1_6.aBoolean73) && (local6 != null || local9 != null)) {
			this.aClass41_Sub1_6 = new Class41_Sub1(Static187.anInt3975);
		}
		if (this.aClass41_Sub1_6 != null) {
			this.aClass41_Sub1_6.method871(arg0, (long) Static187.anInt3975, local6, local9);
			this.aClass41_Sub1_6.method882(super.aByte102, super.aShort104, super.aShort105, super.aShort103, super.aShort102);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IILclient!za;IILclient!vl;Z)V")
	@Override
	public void method5718(@OriginalArg(1) int arg0, @OriginalArg(2) Class106 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class30 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!za;ZII)Lclient!e;")
	private Class17 method3529(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class223 local16 = Static145.aClass63_1.method1524(arg1);
		@Pc(21) Class96 local21 = Static262.aClass96Array3[super.aByte102];
		@Pc(36) Class96 local36 = this.anInt4580 < 3 ? Static262.aClass96Array3[this.anInt4580 + 1] : null;
		return this.aBoolean294 ? local16.method5077(local36, -1, arg2, local21, 0, -1, super.anInt7495, arg0, super.anInt7488, super.anInt7490, Static107.aClass239_1) : local16.method5077(local36, this.anInt4593, arg2, local21, this.anInt4590, this.anInt4583, super.anInt7495, arg0, super.anInt7488, super.anInt7490, Static107.aClass239_1);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	public void method3531() {
		if (this.aClass41_Sub1_6 != null) {
			this.aClass41_Sub1_6.method873();
		}
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(Z)V")
	@Override
	public void method5721() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(ILclient!za;)Lclient!sr;")
	@Override
	public Class41_Sub7 method5722(@OriginalArg(1) Class106 arg0) {
		@Pc(21) Class17 local21 = this.method3529(arg0, this.anInt4586, (this.anInt4587 == 0 ? 0 : 5) | 0x800);
		if (local21 == null) {
			return null;
		}
		if (this.anInt4587 != 0) {
			local21.ma(this.anInt4587 * 2048);
		}
		@Pc(37) Class40 local37 = arg0.method5918();
		local37.U(super.anInt7490, super.anInt7495, super.anInt7488);
		if (this.aClass41_Sub1_6 == null) {
			local21.method6189(local37, null, 0);
		} else {
			@Pc(58) Class51 local58 = this.aClass41_Sub1_6.method875();
			arg0.method5952(local21, local58, local37, null);
		}
		this.anInt4588 = local21.B();
		this.method3528(arg0, local21);
		return null;
	}

	@OriginalMember(owner = "client!li", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass41_Sub1_6 != null) {
			this.aClass41_Sub1_6.method873();
		}
	}

	@OriginalMember(owner = "client!li", name = "e", descriptor = "(I)I")
	@Override
	public int method5724() {
		return this.anInt4588;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)V")
	public void method3535(@OriginalArg(0) int arg0) {
		if (this.aBoolean294) {
			return;
		}
		this.anInt4590 += arg0;
		while (this.aClass235_2.anIntArray632[this.anInt4583] < this.anInt4590) {
			this.anInt4590 -= this.aClass235_2.anIntArray632[this.anInt4583];
			this.anInt4583++;
			if (this.anInt4583 >= this.aClass235_2.anIntArray633.length) {
				this.aBoolean294 = true;
				break;
			}
		}
		if (!this.aBoolean294) {
			Static290.method4258(super.anInt7488, this.anInt4583, super.aByte102, super.anInt7490, false, this.aClass235_2);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method5717(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(BLclient!za;)V")
	@Override
	public void method5716(@OriginalArg(1) Class106 arg0) {
		@Pc(23) Class17 local23 = this.method3529(arg0, this.anInt4586, 0);
		if (local23 != null) {
			this.method3528(arg0, local23);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5719() {
		return false;
	}
}
