import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class322 {

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "Ljava/lang/String;")
	public String aString106;

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
	public int anInt9033;

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "C")
	private char aChar4;

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "Z")
	public boolean aBoolean707 = true;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!jp;I)V")
	public void method7883(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8632();
			if (local5 == 0) {
				return;
			}
			this.method7887(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)Z")
	public boolean method7885() {
		return this.aChar4 == 's';
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!jp;II)V")
	private void method7887(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static375.method5437(arg0.method8621());
		} else if (arg1 == 2) {
			this.anInt9033 = arg0.method8618();
		} else if (arg1 == 4) {
			this.aBoolean707 = false;
		} else if (arg1 == 5) {
			this.aString106 = arg0.method8613();
		}
	}
}
