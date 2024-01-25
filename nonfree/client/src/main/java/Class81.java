import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class81 {

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
	public int anInt2663 = 0;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
	public int anInt2661 = 0;

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "Lclient!fa;")
	private final Class68 aClass68_12 = new Class68(64);

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "Lclient!lo;")
	private Interface8 anInterface8_1 = null;

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "Lclient!fs;")
	private final Class76 aClass76_30;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "Lclient!fs;")
	private final Class76 aClass76_31;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(ILclient!fs;Lclient!fs;Lclient!lo;)V")
	public Class81(@OriginalArg(0) int arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) Interface8 arg3) {
		this.anInterface8_1 = arg3;
		this.aClass76_30 = arg1;
		this.aClass76_31 = arg2;
		if (this.aClass76_30 != null) {
			this.anInt2661 = this.aClass76_30.method2108(1);
		}
		if (this.aClass76_31 != null) {
			this.anInt2663 = this.aClass76_31.method2108(1);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!ho;B[IJ)Ljava/lang/String;")
	public String method2255(@OriginalArg(0) Class98 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2) {
		if (this.anInterface8_1 != null) {
			@Pc(22) String local22 = this.anInterface8_1.method3205(arg2, arg1, arg0);
			if (local22 != null) {
				return local22;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)Lclient!au;")
	public Class4_Sub1_Sub3 method2258(@OriginalArg(0) int arg0) {
		@Pc(11) Class4_Sub1_Sub3 local11 = (Class4_Sub1_Sub3) this.aClass68_12.method1787((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(36) byte[] local36;
		if (arg0 >= 32768) {
			local36 = this.aClass76_31.method2104(arg0 & 0x7FFF, 1);
		} else {
			local36 = this.aClass76_30.method2104(arg0, 1);
		}
		local11 = new Class4_Sub1_Sub3();
		local11.aClass81_1 = this;
		if (local36 != null) {
			local11.method232(new Class4_Sub12(local36));
		}
		if (arg0 >= 32768) {
			local11.method228();
		}
		this.aClass68_12.method1779((long) arg0, local11);
		return local11;
	}
}
