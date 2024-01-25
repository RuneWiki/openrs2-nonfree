import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class214 {

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "I")
	public int anInt6768;

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
	public int anInt6769;

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "I")
	public int anInt6770;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!ig;I)V")
	public void method5557(@OriginalArg(0) Class8_Sub8 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8525();
			if (local17 == 0) {
				return;
			}
			this.method5559(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IILclient!ig;)V")
	private void method5559(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt6769 = arg1.method8578();
			this.anInt6770 = arg1.method8525();
			this.anInt6768 = arg1.method8525();
		}
	}
}
