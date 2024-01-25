import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class247 {

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
	public int anInt6901;

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "Ljava/lang/String;")
	public String aString72;

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "Z")
	public boolean aBoolean489 = true;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Z")
	public boolean method5556() {
		return this.aChar5 == 's';
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method5557(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5007();
			if (local13 == 0) {
				return;
			}
			this.method5558(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IBLclient!fh;)V")
	private void method5558(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static57.method814(arg1.method5063());
		} else if (arg0 == 2) {
			this.anInt6901 = arg1.method4997();
		} else if (arg0 == 4) {
			this.aBoolean489 = false;
		} else if (arg0 == 5) {
			this.aString72 = arg1.method5038();
		}
	}
}
