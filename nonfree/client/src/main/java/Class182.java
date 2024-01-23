import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class182 {

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
	private int anInt5722;

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
	public int anInt5725;

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	public int anInt5728;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)Lclient!n;")
	public Class4_Sub2_Sub4_Sub2 method4592() {
		@Pc(11) Class4_Sub2_Sub4_Sub2 local11 = (Class4_Sub2_Sub4_Sub2) Static50.aClass172_9.method4347((long) this.anInt5722);
		if (local11 != null) {
			return local11;
		}
		local11 = Static160.method2586(Static104.aClass22_34, this.anInt5722);
		if (local11 != null) {
			Static50.aClass172_9.method4345(local11, (long) this.anInt5722);
		}
		return local11;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!pi;IIZ)V")
	private void method4593(@OriginalArg(0) Class4_Sub24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt5722 = arg0.method3085();
		} else if (arg1 == 2) {
			this.anInt5725 = arg0.method3110();
			this.anInt5728 = arg0.method3110();
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!pi;IB)V")
	public void method4595(@OriginalArg(0) Class4_Sub24 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method3110();
			if (local5 == 0) {
				return;
			}
			this.method4593(arg0, local5, arg1);
		}
	}
}
