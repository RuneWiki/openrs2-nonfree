import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class37 {

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
	public int anInt1053;

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
	public int anInt1056;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
	public int anInt1060;

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "Z")
	public boolean aBoolean76;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
	public int anInt1063;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
	public int anInt1064;

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
	public int anInt1061 = 8;

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
	public int anInt1066 = 16777215;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!wm;IIZ)V")
	private void method831(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt1061 = arg0.method4242();
		} else if (arg1 == 2) {
			this.aBoolean76 = true;
		} else if (arg1 == 3) {
			this.anInt1064 = arg0.method4255();
			this.anInt1063 = arg0.method4255();
			this.anInt1056 = arg0.method4255();
		} else if (arg1 == 4) {
			this.anInt1053 = arg0.method4261();
		} else if (arg1 == 5) {
			this.anInt1060 = arg0.method4242();
		} else if (arg1 == 6) {
			this.anInt1066 = arg0.method4245();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILclient!wm;)V")
	public void method834(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub26 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method4261();
			if (local5 == 0) {
				return;
			}
			this.method831(arg1, local5, arg0);
		}
	}
}
