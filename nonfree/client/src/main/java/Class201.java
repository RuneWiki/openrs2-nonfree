import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class201 {

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
	public int anInt5872;

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
	private int anInt5877;

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
	public int anInt5881;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIILclient!eb;)V")
	private void method5157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub7 arg2) {
		if (arg0 == 1) {
			this.anInt5877 = arg2.method3115();
		} else if (arg0 == 2) {
			this.anInt5881 = arg2.method3141();
			this.anInt5872 = arg2.method3141();
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!eb;I)V")
	public void method5158(@OriginalArg(1) Class1_Sub7 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method3141();
			if (local5 == 0) {
				return;
			}
			this.method5157(local5, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)Lclient!nc;")
	public Class138 method5163() {
		@Pc(16) Class138 local16 = (Class138) Static113.aClass140_64.method3816((long) this.anInt5877);
		if (local16 != null) {
			return local16;
		}
		local16 = Static363.method3785(Static172.aClass165_91, this.anInt5877, 0);
		if (local16 != null) {
			Static113.aClass140_64.method3817((long) this.anInt5877, local16);
		}
		return local16;
	}
}
