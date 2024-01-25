import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class306 {

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
	public int anInt8191;

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "Z")
	public boolean aBoolean599;

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
	public int anInt8196;

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
	public int anInt8197;

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
	public int anInt8200;

	@OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
	public int anInt8202;

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
	public int anInt8192 = 16777215;

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
	public int anInt8201 = 8;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!sl;B)V")
	private void method7043(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt8201 = arg1.method2825();
		} else if (arg0 == 2) {
			this.aBoolean599 = true;
		} else if (arg0 == 3) {
			this.anInt8191 = arg1.method2836();
			this.anInt8196 = arg1.method2836();
			this.anInt8200 = arg1.method2836();
		} else if (arg0 == 4) {
			this.anInt8197 = arg1.method2859();
		} else if (arg0 == 5) {
			this.anInt8202 = arg1.method2825();
		} else if (arg0 == 6) {
			this.anInt8192 = arg1.method2835();
			return;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!sl;I)V")
	public void method7045(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2859();
			if (local13 == 0) {
				return;
			}
			this.method7043(local13, arg0);
		}
	}
}
