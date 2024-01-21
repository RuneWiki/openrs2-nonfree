import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class6_Sub3_Sub6 extends Class6_Sub3 {

	@OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
	public int anInt1202;

	@OriginalMember(owner = "client!fd", name = "lb", descriptor = "I")
	public int anInt1212;

	@OriginalMember(owner = "client!fd", name = "nb", descriptor = "I")
	public int anInt1214;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!bf;I)V")
	public void method864(@OriginalArg(0) Class6_Sub4 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method1321();
			if (local16 == 0) {
				return;
			}
			this.method865(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILclient!bf;)V")
	private void method865(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt1212 = arg1.method1306();
			this.anInt1202 = arg1.method1321();
			this.anInt1214 = arg1.method1321();
		}
	}
}
