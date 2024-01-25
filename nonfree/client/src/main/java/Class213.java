import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class213 {

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "Ljava/lang/String;")
	public String aString71;

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
	public int anInt6063;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "Z")
	public boolean aBoolean461 = true;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!daa;Z)V")
	public void method5075(@OriginalArg(0) Class12_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5216();
			if (local9 == 0) {
				return;
			}
			this.method5079(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)Z")
	public boolean method5078() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLclient!daa;I)V")
	private void method5079(@OriginalArg(1) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static485.method7249(arg0.method5173());
		} else if (arg1 == 2) {
			this.anInt6063 = arg0.method5225();
		} else if (arg1 == 4) {
			this.aBoolean461 = false;
		} else if (arg1 == 5) {
			this.aString71 = arg0.method5206();
			return;
		}
	}
}
