import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class216 {

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
	public int anInt6714;

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
	public int anInt6716;

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
	public int anInt6717;

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
	public int anInt6720;

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
	public int anInt6721;

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "Z")
	public boolean aBoolean425;

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
	public int anInt6722 = 8;

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
	public int anInt6723 = 16777215;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!kh;BI)V")
	public void method5678(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method5185();
			if (local5 == 0) {
				return;
			}
			this.method5680(arg0, local5, arg1);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!kh;IIB)V")
	private void method5680(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt6722 = arg0.method5187();
		} else if (arg1 == 2) {
			this.aBoolean425 = true;
		} else if (arg1 == 3) {
			this.anInt6714 = arg0.method5220();
			this.anInt6717 = arg0.method5220();
			this.anInt6716 = arg0.method5220();
		} else if (arg1 == 4) {
			this.anInt6720 = arg0.method5185();
		} else if (arg1 == 5) {
			this.anInt6721 = arg0.method5187();
			return;
		} else if (arg1 == 6) {
			this.anInt6723 = arg0.method5221();
			return;
		}
	}
}
