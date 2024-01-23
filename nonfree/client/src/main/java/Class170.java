import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class170 {

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
	public int anInt5090;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
	public int anInt5095;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Z")
	public boolean aBoolean482 = false;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!fh;IZ)V")
	public void method4237(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method1853();
			if (local13 == 0) {
				return;
			}
			this.method4238(arg0, local13, arg1);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!fh;III)V")
	private void method4238(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt5090 = arg0.method1879();
		} else if (arg1 == 2) {
			this.anInt5095 = arg0.method1878();
		} else if (arg1 == 3) {
			this.aBoolean482 = true;
		} else if (arg1 == 4) {
			this.anInt5090 = -1;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZII)Lclient!fo;")
	public Class57_Sub1 method4243(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(23) Class57_Sub1 local23 = (Class57_Sub1) Static83.aClass175_11.method4295((long) ((arg0 ? 262144 : 0) | this.anInt5090 | arg1 << 16));
		if (local23 != null) {
			return local23;
		}
		Static125.aClass119_47.method3250(this.anInt5090);
		local23 = Static197.method3409(Static125.aClass119_47, this.anInt5090);
		if (local23 != null) {
			local23.method1663(Static135.anInt2658, Static112.anInt5358, Static90.anInt1907);
			local23.anInt3770 = local23.anInt3768;
			local23.anInt3763 = local23.anInt3766;
			if (arg0) {
				local23.method1651();
			}
			for (@Pc(65) int local65 = 0; local65 < arg1; local65++) {
				local23.method1658();
			}
			Static83.aClass175_11.method4285(local23, (long) ((arg0 ? 262144 : 0) | arg1 << 16 | this.anInt5090));
		}
		return local23;
	}
}
