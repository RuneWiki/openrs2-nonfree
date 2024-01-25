import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class74 {

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
	public int anInt2419;

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
	public int anInt2420;

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "Lclient!ok;")
	public Class172 aClass172_1;

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
	private int anInt2423;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!iv;I)V")
	public void method2056(@OriginalArg(0) Class4_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2490();
			if (local5 == 0) {
				return;
			}
			this.method2060(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILclient!iv;)V")
	private void method2060(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt2423 = arg1.method2536();
		} else if (arg0 == 2) {
			this.anInt2420 = arg1.method2490();
			this.anInt2419 = arg1.method2490();
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)Lclient!bb;")
	public synchronized Class18 method2061() {
		@Pc(13) Class18 local13 = (Class18) this.aClass172_1.aClass68_31.method1787((long) this.anInt2423);
		if (local13 != null) {
			return local13;
		}
		local13 = Static456.method318(this.aClass172_1.aClass76_59, this.anInt2423, 0);
		if (local13 != null) {
			this.aClass172_1.aClass68_31.method1779((long) this.anInt2423, local13);
		}
		return local13;
	}
}
