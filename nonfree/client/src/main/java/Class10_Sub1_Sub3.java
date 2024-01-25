import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class10_Sub1_Sub3 extends Class10_Sub1 implements Interface4 {

	@OriginalMember(owner = "client!lp", name = "S", descriptor = "Lclient!fs;")
	public final Class77 aClass77_3;

	@OriginalMember(owner = "client!lp", name = "Y", descriptor = "Z")
	private final boolean aBoolean281;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!ii;Lclient!ge;IIIIIIIZIIIII)V")
	public Class10_Sub1_Sub3(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg1.anInt1859 == 1, Static289.method5049(arg3, arg2));
		this.aClass77_3 = new Class77(arg0, arg1, arg2, arg3, super.aByte73, arg5, arg6, arg8, arg9, arg14);
		this.aBoolean281 = arg1.anInt1863 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIZLclient!ii;)Z")
	@Override
	public boolean method5826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class105 arg2) {
		@Pc(16) Class40 local16 = this.aClass77_3.method1479(false, super.anInt6728, 65536, arg2, super.anInt6726, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class31 local23 = arg2.method4304();
			local23.method3187(super.anInt6728, super.anInt6722, super.anInt6726);
			return local16.method4614(arg0, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5451() {
		return this.aClass77_3.method1476();
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLclient!ii;)V")
	@Override
	public void method5446(@OriginalArg(1) Class105 arg0) {
		this.aClass77_3.method1469(arg0);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)V")
	@Override
	public void method5819() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)I")
	@Override
	public int method5445() {
		return this.aClass77_3.anInt1773;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!ii;I)V")
	@Override
	public void method5447(@OriginalArg(0) Class105 arg0) {
		this.aClass77_3.method1473(arg0);
	}

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "(I)I")
	@Override
	public int method5829() {
		return this.aClass77_3.method1472();
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
	@Override
	public void method5450() {
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(Lclient!ii;I)Lclient!eb;")
	@Override
	public Class7_Sub3 method5821(@OriginalArg(0) Class105 arg0) {
		@Pc(16) Class40 local16 = this.aClass77_3.method1479(true, super.anInt6728, 1024, arg0, super.anInt6726, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class31 local23 = arg0.method4304();
		local23.method3187(super.anInt6728, super.anInt6722, super.anInt6726);
		@Pc(33) Class7_Sub3 local33 = null;
		if (this.aBoolean281) {
			local33 = Static44.method908(1);
		}
		if (this.aClass77_3.aClass7_Sub7_4 == null) {
			local16.method4587(local23, local33 == null ? null : local33.aClass7_Sub6Array1[0], 0);
		} else {
			@Pc(49) Class153 local49 = this.aClass77_3.aClass7_Sub7_4.method2817();
			arg0.method4276(local16, local49, local23, local33 == null ? null : local33.aClass7_Sub6Array1[0]);
		}
		this.aClass77_3.method1474(super.aShort92, true, super.aShort93, super.aShort94, local16, super.aShort91, arg0);
		return local33;
	}

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5824() {
		return false;
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "(I)I")
	@Override
	public int method5452() {
		return this.aClass77_3.anInt1785;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILclient!ii;I)Lclient!dc;")
	@Override
	public Class40 method5448(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1) {
		return this.aClass77_3.method1479(false, 0, arg0, arg1, 0, false);
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)I")
	@Override
	public int method5449() {
		return this.aClass77_3.anInt1797;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILclient!ii;)V")
	@Override
	public void method5822(@OriginalArg(1) Class105 arg0) {
		@Pc(25) Class40 local25 = this.aClass77_3.method1479(true, super.anInt6728, 131072, arg0, super.anInt6726, true);
		if (local25 != null) {
			this.aClass77_3.method1474(super.aShort92, false, super.aShort93, super.aShort94, local25, super.aShort91, arg0);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!ii;IIIILclient!nc;Z)V")
	@Override
	public void method5825(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}
}
