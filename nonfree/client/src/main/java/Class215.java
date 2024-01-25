import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Class215 {

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
	public int anInt6701;

	@OriginalMember(owner = "client!naa", name = "e", descriptor = "I")
	public int anInt6704;

	@OriginalMember(owner = "client!naa", name = "k", descriptor = "I")
	public int anInt6707;

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!rg;I)V")
	public void method5755(@OriginalArg(0) Class6_Sub40 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method8604();
			if (local16 == 0) {
				return;
			}
			this.method5756(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(ILclient!rg;B)V")
	private void method5756(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub40 arg1) {
		if (arg0 == 1) {
			this.anInt6701 = arg1.method8571();
			this.anInt6704 = arg1.method8604();
			this.anInt6707 = arg1.method8604();
		}
	}
}
