import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class10_Sub4_Sub2 extends Class10_Sub4 implements Interface4 {

	@OriginalMember(owner = "client!un", name = "x", descriptor = "Lclient!fs;")
	public final Class77 aClass77_4;

	@OriginalMember(owner = "client!un", name = "L", descriptor = "Z")
	private final boolean aBoolean524;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!ii;Lclient!ge;IIIIIIIZIIII)V")
	public Class10_Sub4_Sub2(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg6, arg7, arg8, arg10, arg11, arg12, Static125.method2000(arg3, arg2));
		this.aClass77_4 = new Class77(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
		this.aBoolean524 = arg1.anInt1863 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)I")
	@Override
	public int method5449() {
		return this.aClass77_4.anInt1797;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(Lclient!ii;I)Lclient!eb;")
	@Override
	public Class7_Sub3 method5821(@OriginalArg(0) Class105 arg0) {
		@Pc(16) Class40 local16 = this.aClass77_4.method1479(true, super.anInt6326, 1024, arg0, super.anInt6332, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class31 local23 = arg0.method4304();
		local23.method3187(super.anInt6326 + super.anInt6335, super.anInt6329, super.anInt6333 + super.anInt6332);
		@Pc(39) Class7_Sub3 local39 = null;
		if (this.aBoolean524) {
			local39 = Static44.method908(1);
		}
		if (this.aClass77_4.aClass7_Sub7_4 == null) {
			local16.method4587(local23, local39 == null ? null : local39.aClass7_Sub6Array1[0], 0);
		} else {
			@Pc(57) Class153 local57 = this.aClass77_4.aClass7_Sub7_4.method2817();
			arg0.method4276(local16, local57, local23, local39 == null ? null : local39.aClass7_Sub6Array1[0]);
		}
		this.aClass77_4.method1474(super.anInt6332 >> 7, true, super.anInt6326 >> 7, super.anInt6326 >> 7, local16, super.anInt6332 >> 7, arg0);
		return local39;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!ii;I)Lclient!dc;")
	@Override
	public Class40 method5448(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1) {
		return this.aClass77_4.method1479(false, 0, arg0, arg1, 0, false);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V")
	@Override
	public void method5450() {
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BLclient!ii;)V")
	@Override
	public void method5446(@OriginalArg(1) Class105 arg0) {
		this.aClass77_4.method1469(arg0);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!ii;I)V")
	@Override
	public void method5447(@OriginalArg(0) Class105 arg0) {
		this.aClass77_4.method1473(arg0);
	}

	@OriginalMember(owner = "client!un", name = "f", descriptor = "(I)I")
	@Override
	public int method5444() {
		return this.aClass77_4.method1472();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)I")
	@Override
	public int method5445() {
		return this.aClass77_4.anInt1773;
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(I)I")
	@Override
	public int method5452() {
		return this.aClass77_4.anInt1785;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIZLclient!ii;)Z")
	@Override
	public boolean method5826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class105 arg2) {
		@Pc(16) Class40 local16 = this.aClass77_4.method1479(false, super.anInt6326, 65536, arg2, super.anInt6332, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class31 local23 = arg2.method4304();
			local23.method3187(super.anInt6335 + super.anInt6326, super.anInt6329, super.anInt6332 + super.anInt6333);
			return local16.method4614(arg0, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5451() {
		return this.aClass77_4.method1476();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!ii;)V")
	@Override
	public void method5822(@OriginalArg(1) Class105 arg0) {
		@Pc(24) Class40 local24 = this.aClass77_4.method1479(true, super.anInt6326, 131072, arg0, super.anInt6332, false);
		if (local24 != null) {
			this.aClass77_4.method1474(super.anInt6332 >> 7, false, super.anInt6326 >> 7, super.anInt6326 >> 7, local24, super.anInt6332 >> 7, arg0);
		}
	}
}
