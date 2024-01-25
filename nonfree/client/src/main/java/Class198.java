import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class198 {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
	public int anInt5889;

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
	public int anInt5890;

	@OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
	public int anInt5895;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!gw;)V")
	public void method5099(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method3043();
			if (local3 == 0) {
				return;
			}
			this.method5101(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!gw;II)V")
	private void method5101(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5895 = arg0.method3056();
			this.anInt5889 = arg0.method3043();
			this.anInt5890 = arg0.method3043();
		}
	}
}
