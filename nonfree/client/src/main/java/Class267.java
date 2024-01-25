import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class267 {

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	public int anInt7201;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	public int anInt7202;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public int anInt7206;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ee;BI)V")
	private void method6386(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7202 = arg0.method8631();
			this.anInt7201 = arg0.method8645();
			this.anInt7206 = arg0.method8645();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!ee;)V")
	public void method6387(@OriginalArg(1) Class5_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8645();
			if (local5 == 0) {
				return;
			}
			this.method6386(arg0, local5);
		}
	}
}
