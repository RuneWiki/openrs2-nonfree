import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class256 {

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Ljava/lang/String;")
	public String aString67;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
	public int anInt6961;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "Z")
	public boolean aBoolean468 = true;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BILclient!gk;)V")
	private void method5443(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static395.method5018(arg1.method3930());
		} else if (arg0 == 2) {
			this.anInt6961 = arg1.method3938();
		} else if (arg0 == 4) {
			this.aBoolean468 = false;
		} else if (arg0 == 5) {
			this.aString67 = arg1.method3986();
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)Z")
	public boolean method5444() {
		return this.aChar5 == 's';
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!gk;I)V")
	public void method5445(@OriginalArg(0) Class7_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3981();
			if (local9 == 0) {
				return;
			}
			this.method5443(local9, arg0);
		}
	}
}
