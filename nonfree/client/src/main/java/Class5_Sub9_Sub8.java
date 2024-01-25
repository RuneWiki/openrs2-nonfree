import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class5_Sub9_Sub8 extends Class5_Sub9 {

	@OriginalMember(owner = "client!gg", name = "J", descriptor = "[I")
	public static final int[] anIntArray130 = new int[99];

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
	public int anInt2227 = 12800;

	@OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
	public int anInt2226 = 0;

	@OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
	public int anInt2234 = -1;

	@OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
	public int anInt2228 = 12800;

	@OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
	public int anInt2231 = 0;

	@OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
	public int anInt2235 = -1;

	@OriginalMember(owner = "client!gg", name = "I", descriptor = "Z")
	public boolean aBoolean143 = true;

	@OriginalMember(owner = "client!gg", name = "M", descriptor = "Ljava/lang/String;")
	public final String aString136;

	@OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
	public final int anInt2233;

	@OriginalMember(owner = "client!gg", name = "H", descriptor = "Ljava/lang/String;")
	public final String aString135;

	@OriginalMember(owner = "client!gg", name = "C", descriptor = "I")
	public final int anInt2237;

	@OriginalMember(owner = "client!gg", name = "D", descriptor = "Lclient!vn;")
	public final Class211 aClass211_9;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) (Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D + (double) local11);
			local4 += local24;
			anIntArray130[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class5_Sub9_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.aString136 = arg1;
		this.anInt2233 = arg0;
		this.aBoolean143 = arg5;
		this.aString135 = arg2;
		this.anInt2234 = arg6;
		this.anInt2237 = arg3;
		this.anInt2235 = arg4;
		if (this.anInt2234 == 255) {
			this.anInt2234 = 0;
		}
		this.aClass211_9 = new Class211();
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[IIIZ)Z")
	public boolean method2046(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(16) Class5_Sub3 local16 = (Class5_Sub3) this.aClass211_9.method5608(); local16 != null; local16 = (Class5_Sub3) this.aClass211_9.method5603()) {
			if (local16.method571(arg2, arg3, arg0)) {
				local16.method574(arg1, arg2, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II[IB)Z")
	public boolean method2050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		for (@Pc(16) Class5_Sub3 local16 = (Class5_Sub3) this.aClass211_9.method5608(); local16 != null; local16 = (Class5_Sub3) this.aClass211_9.method5603()) {
			if (local16.method568(arg1, arg0)) {
				local16.method572(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([IIII)Z")
	public boolean method2051(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(18) Class5_Sub3 local18 = (Class5_Sub3) this.aClass211_9.method5608(); local18 != null; local18 = (Class5_Sub3) this.aClass211_9.method5603()) {
			if (local18.method570(arg2, arg1)) {
				local18.method574(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)Z")
	public boolean method2052(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class5_Sub3 local11 = (Class5_Sub3) this.aClass211_9.method5608(); local11 != null; local11 = (Class5_Sub3) this.aClass211_9.method5603()) {
			if (local11.method570(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)V")
	public void method2054() {
		this.anInt2227 = 12800;
		this.anInt2231 = 0;
		this.anInt2226 = 0;
		this.anInt2228 = 12800;
		for (@Pc(23) Class5_Sub3 local23 = (Class5_Sub3) this.aClass211_9.method5608(); local23 != null; local23 = (Class5_Sub3) this.aClass211_9.method5603()) {
			if (local23.anInt575 < this.anInt2228) {
				this.anInt2228 = local23.anInt575;
			}
			if (local23.anInt580 > this.anInt2231) {
				this.anInt2231 = local23.anInt580;
			}
			if (this.anInt2226 < local23.anInt572) {
				this.anInt2226 = local23.anInt572;
			}
			if (this.anInt2227 > local23.anInt570) {
				this.anInt2227 = local23.anInt570;
			}
		}
	}
}
