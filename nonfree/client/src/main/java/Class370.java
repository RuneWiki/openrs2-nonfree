import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class370 {

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
	public int anInt10488;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
	public int anInt10489;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
	public int anInt10491;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method8528(@OriginalArg(0) Class6_Sub8 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8246();
			if (local17 == 0) {
				return;
			}
			this.method8529(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZILclient!ji;)V")
	private void method8529(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt10488 = arg1.method8220();
			this.anInt10489 = arg1.method8246();
			this.anInt10491 = arg1.method8246();
		}
	}
}
