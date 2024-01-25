import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class216 {

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
	public int anInt5361;

	@OriginalMember(owner = "client!kt", name = "i", descriptor = "I")
	public int anInt5363;

	@OriginalMember(owner = "client!kt", name = "m", descriptor = "I")
	public int anInt5369;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILclient!et;)V")
	public void method4809(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8581(-17416);
			if (local13 == 0) {
				return;
			}
			this.method4810(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZLclient!et;)V")
	private void method4810(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt5369 = arg1.method8575();
			this.anInt5363 = arg1.method8581(-17416);
			this.anInt5361 = arg1.method8581(-17416);
		}
	}
}
