import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class228 {

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
	public int anInt6420 = 2048;

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
	public int anInt6423 = 0;

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
	public int anInt6422 = 0;

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
	public int anInt6424 = 2048;

	static {
		new Class174(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!nj;I)V")
	public void method5287(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4096();
			if (local11 == 0) {
				return;
			}
			this.method5289(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILclient!nj;)V")
	private void method5289(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub25 arg1) {
		if (arg0 == 1) {
			this.anInt6422 = arg1.method4096();
		} else if (arg0 == 2) {
			this.anInt6424 = arg1.method4083();
		} else if (arg0 == 3) {
			this.anInt6420 = arg1.method4083();
			return;
		} else if (arg0 == 4) {
			this.anInt6423 = arg1.method4065();
			return;
		}
	}
}
