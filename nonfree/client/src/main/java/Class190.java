import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class190 {

	@OriginalMember(owner = "client!km", name = "b", descriptor = "I")
	public int anInt5118;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "I")
	public int anInt5121;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "I")
	public int anInt5122;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BLclient!qh;)V")
	public void method4449(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3118();
			if (local5 == 0) {
				return;
			}
			this.method4450(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!qh;I)V")
	private void method4450(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt5118 = arg1.method3109();
			this.anInt5122 = arg1.method3118();
			this.anInt5121 = arg1.method3118();
		}
	}
}
