import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class229 {

	@OriginalMember(owner = "client!st", name = "c", descriptor = "I")
	public int anInt6325;

	@OriginalMember(owner = "client!st", name = "d", descriptor = "I")
	public int anInt6326;

	@OriginalMember(owner = "client!st", name = "g", descriptor = "I")
	public int anInt6329;

	@OriginalMember(owner = "client!st", name = "h", descriptor = "I")
	public int anInt6330;

	@OriginalMember(owner = "client!st", name = "i", descriptor = "Z")
	public boolean aBoolean437;

	@OriginalMember(owner = "client!st", name = "k", descriptor = "I")
	public int anInt6332;

	@OriginalMember(owner = "client!st", name = "f", descriptor = "I")
	public int anInt6328 = 8;

	@OriginalMember(owner = "client!st", name = "b", descriptor = "I")
	public int anInt6324 = 16777215;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!si;)V")
	public void method5016(@OriginalArg(1) Class2_Sub23 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5495();
			if (local15 == 0) {
				return;
			}
			this.method5018(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IILclient!si;)V")
	private void method5018(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt6328 = arg1.method5500();
		} else if (arg0 == 2) {
			this.aBoolean437 = true;
		} else if (arg0 == 3) {
			this.anInt6330 = arg1.method5458();
			this.anInt6329 = arg1.method5458();
			this.anInt6326 = arg1.method5458();
		} else if (arg0 == 4) {
			this.anInt6325 = arg1.method5495();
		} else if (arg0 == 5) {
			this.anInt6332 = arg1.method5500();
		} else if (arg0 == 6) {
			this.anInt6324 = arg1.method5485();
			return;
		}
	}
}
