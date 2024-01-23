import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class9_Sub6 extends Class9 {

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "Lclient!nl;")
	private Class96_Sub1 aClass96_Sub1_5;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
	private int anInt2889 = 0;

	@OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
	private int anInt2907 = -1;

	@OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
	private int anInt2903 = -32768;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "Z")
	public boolean aBoolean155 = false;

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
	private int anInt2898 = 0;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
	private int anInt2891;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
	public int anInt2890;

	@OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
	public int anInt2902;

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
	public int anInt2894;

	@OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
	public int anInt2908;

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
	public int anInt2901;

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "Lclient!gj;")
	private Class49 aClass49_2;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIIIIII)V")
	public Class9_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2891 = arg0;
		this.anInt2890 = arg1;
		this.anInt2902 = arg2;
		this.anInt2894 = arg5 + arg6;
		this.anInt2908 = arg4;
		this.anInt2901 = arg3;
		@Pc(42) int local42 = Static172.method2975(this.anInt2891).anInt634;
		if (local42 == -1) {
			this.aBoolean155 = true;
		} else {
			this.aBoolean155 = false;
			this.aClass49_2 = Static131.method697(local42);
		}
		if (arg6 == this.anInt2894) {
			Static232.method3865(this.anInt2901, this.anInt2902, false, this.anInt2889, this.aClass49_2);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "()I")
	@Override
	public int method3587() {
		return this.anInt2903;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(IB)V")
	public void method2227(@OriginalArg(0) int arg0) {
		if (this.aBoolean155) {
			return;
		}
		this.anInt2898 += arg0;
		while (this.anInt2898 > this.aClass49_2.anIntArray170[this.anInt2889]) {
			this.anInt2898 -= this.aClass49_2.anIntArray170[this.anInt2889];
			this.anInt2889++;
			if (this.aClass49_2.anIntArray168.length <= this.anInt2889) {
				this.aBoolean155 = true;
				break;
			}
		}
		if (!this.aBoolean155) {
			Static232.method3865(this.anInt2901, this.anInt2902, false, this.anInt2889, this.aClass49_2);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIIJILclient!nl;)V")
	@Override
	public void method3588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class96_Sub1 arg10) {
		@Pc(7) Class9_Sub5 local7 = this.method2230();
		if (local7 != null) {
			local7.method3588(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass96_Sub1_5);
			this.anInt2903 = local7.method3587();
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)Lclient!gh;")
	private Class9_Sub5 method2230() {
		@Pc(8) Class14 local8 = Static172.method2975(this.anInt2891);
		@Pc(24) Class9_Sub5 local24;
		if (this.aBoolean155) {
			local24 = local8.method332(-1, -1, 0);
		} else {
			local24 = local8.method332(this.anInt2907, this.anInt2889, this.anInt2898);
		}
		return local24 == null ? null : local24;
	}
}
