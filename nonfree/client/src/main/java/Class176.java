import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class176 {

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
	public int anInt4975 = 0;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
	public int anInt4973 = 0;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
	public int anInt4976 = 2048;

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
	public int anInt4978 = 2048;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!nn;I)V")
	public void method4005(@OriginalArg(0) Class10_Sub8 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2502();
			if (local15 == 0) {
				return;
			}
			this.method4006(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!nn;I)V")
	private void method4006(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt4973 = arg1.method2502();
		} else if (arg0 == 2) {
			this.anInt4978 = arg1.method2485();
		} else if (arg0 == 3) {
			this.anInt4976 = arg1.method2485();
		} else if (arg0 == 4) {
			this.anInt4975 = arg1.method2492();
		}
	}
}
