import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class16 {

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
	public int anInt256;

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "Z")
	public boolean aBoolean11 = true;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)Z")
	public boolean method234() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!ofa;B)V")
	public void method236(@OriginalArg(0) Class5_Sub22 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method5966();
			if (local16 == 0) {
				return;
			}
			this.method237(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBLclient!ofa;)V")
	private void method237(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub22 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static644.method9020(arg1.method5963());
		} else if (arg0 == 2) {
			this.anInt256 = arg1.method5913();
		} else if (arg0 == 4) {
			this.aBoolean11 = false;
		} else if (arg0 == 5) {
			this.aString1 = arg1.method5937();
		}
	}
}
