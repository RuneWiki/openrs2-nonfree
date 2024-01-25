import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class238 {

	@OriginalMember(owner = "client!np", name = "e", descriptor = "I")
	public int anInt6043;

	@OriginalMember(owner = "client!np", name = "f", descriptor = "Ljava/lang/String;")
	public String aString83;

	@OriginalMember(owner = "client!np", name = "i", descriptor = "C")
	private char aChar3;

	@OriginalMember(owner = "client!np", name = "b", descriptor = "Z")
	public boolean aBoolean440 = true;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!vj;B)V")
	public void method5152(@OriginalArg(0) Class2_Sub22 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8547();
			if (local5 == 0) {
				return;
			}
			this.method5154(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)Z")
	public boolean method5153() {
		return this.aChar3 == 's';
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BLclient!vj;I)V")
	private void method5154(@OriginalArg(1) Class2_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static212.method2950(arg0.method8548());
		} else if (arg1 == 2) {
			this.anInt6043 = arg0.method8542();
		} else if (arg1 == 4) {
			this.aBoolean440 = false;
		} else if (arg1 == 5) {
			this.aString83 = arg0.method8549();
		}
	}
}
