import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class67_Sub1_Sub1 extends Class67_Sub1 implements Interface7 {

	@OriginalMember(owner = "client!li", name = "G", descriptor = "Lclient!bi;")
	public final Class25 aClass25_2;

	@OriginalMember(owner = "client!li", name = "M", descriptor = "Z")
	private final boolean aBoolean223;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!uo;Lclient!gm;IIIIIIIZIIII)V")
	public Class67_Sub1_Sub1(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg6, arg7, arg8, arg10, arg11, arg12, Static272.method4439(arg2, arg3));
		this.aClass25_2 = new Class25(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
		this.aBoolean223 = arg1.anInt2016 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)I")
	@Override
	public int method5410() {
		return this.aClass25_2.anInt392;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5412() {
		return this.aClass25_2.method313();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IILclient!uo;I)Z")
	@Override
	public boolean method5400(@OriginalArg(0) int arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class126 local16 = this.aClass25_2.method321(super.anInt5252, false, 65536, arg1, false, super.anInt5256);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class61 local28 = arg1.method4979();
			local28.method3666(super.anInt5255 + super.anInt5252, super.anInt5243, super.anInt5247 + super.anInt5256);
			return local16.method3160(arg2, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!uo;I)Lclient!mj;")
	@Override
	public Class126 method5411(@OriginalArg(0) int arg0, @OriginalArg(1) Class129 arg1) {
		return this.aClass25_2.method321(0, false, arg0, arg1, false, 0);
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5395(@OriginalArg(0) Class129 arg0) {
		@Pc(16) Class126 local16 = this.aClass25_2.method321(super.anInt5252, true, 131072, arg0, false, super.anInt5256);
		if (local16 != null) {
			this.aClass25_2.method323(false, super.anInt5252 >> 7, super.anInt5256 >> 7, arg0, super.anInt5252 >> 7, super.anInt5256 >> 7, local16);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLclient!uo;)Lclient!aj;")
	@Override
	public Class10_Sub1 method5401(@OriginalArg(1) Class129 arg0) {
		@Pc(20) Class126 local20 = this.aClass25_2.method321(super.anInt5252, true, 1024, arg0, false, super.anInt5256);
		if (local20 == null) {
			return null;
		}
		@Pc(27) Class61 local27 = arg0.method4979();
		local27.method3666(super.anInt5255 + super.anInt5252, super.anInt5243, super.anInt5247 + super.anInt5256);
		@Pc(43) Class10_Sub1 local43 = null;
		if (this.aBoolean223) {
			local43 = Static55.method830(1);
		}
		if (this.aClass25_2.aClass10_Sub2_1 == null) {
			local20.method3139(local27, local43 == null ? null : local43.aClass10_Sub8Array1[0], 0);
		} else {
			@Pc(59) Class136 local59 = this.aClass25_2.aClass10_Sub2_1.method981();
			arg0.method4977(local20, local59, local27, local43 == null ? null : local43.aClass10_Sub8Array1[0]);
		}
		this.aClass25_2.method323(true, super.anInt5252 >> 7, super.anInt5256 >> 7, arg0, super.anInt5252 >> 7, super.anInt5256 >> 7, local20);
		return local43;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)I")
	@Override
	public int method5414() {
		return this.aClass25_2.anInt412;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)I")
	@Override
	public int method5413() {
		return this.aClass25_2.anInt413;
	}

	@OriginalMember(owner = "client!li", name = "e", descriptor = "(I)I")
	@Override
	public int method4498() {
		return this.aClass25_2.method320();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5417(@OriginalArg(0) Class129 arg0) {
		this.aClass25_2.method322(arg0);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!uo;)V")
	@Override
	public void method5415(@OriginalArg(1) Class129 arg0) {
		this.aClass25_2.method316(arg0);
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
	@Override
	public void method5416() {
	}
}
