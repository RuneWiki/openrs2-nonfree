import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class202 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
	public int anInt6578 = 0;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBLclient!rg;)V")
	private void method5855(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		if (arg0 == 5) {
			this.anInt6578 = arg1.method5106();
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!rg;)V")
	public void method5857(@OriginalArg(1) Class5_Sub12 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method5115();
			if (local3 == 0) {
				return;
			}
			this.method5855(local3, arg0);
		}
	}
}
