import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class194 {

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
	public int anInt6001;

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
	public int anInt6002;

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
	public int anInt6004;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILclient!rt;I)V")
	private void method5024(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27 arg1) {
		if (arg0 == 1) {
			this.anInt6002 = arg1.method7591();
			this.anInt6001 = arg1.method7548();
			this.anInt6004 = arg1.method7548();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!rt;B)V")
	public void method5025(@OriginalArg(0) Class3_Sub27 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7548();
			if (local5 == 0) {
				return;
			}
			this.method5024(local5, arg0);
		}
	}
}
