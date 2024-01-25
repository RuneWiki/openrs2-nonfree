import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Class319 {

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "I")
	public int anInt8807;

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "I")
	public int anInt8809;

	@OriginalMember(owner = "client!sda", name = "e", descriptor = "I")
	public int anInt8810;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lclient!fca;IZ)V")
	private void method7472(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt8809 = arg0.method4858();
			this.anInt8810 = arg0.method4888();
			this.anInt8807 = arg0.method4888();
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILclient!fca;)V")
	public void method7473(@OriginalArg(1) Class3_Sub17 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4888();
			if (local14 == 0) {
				return;
			}
			this.method7472(arg0, local14);
		}
	}
}
