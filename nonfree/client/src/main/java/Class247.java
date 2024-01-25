import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class247 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "I")
	public int anInt7035;

	@OriginalMember(owner = "client!v", name = "h", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!v", name = "j", descriptor = "Ljava/lang/String;")
	public String aString69;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "Z")
	public boolean aBoolean475 = true;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!tl;B)V")
	public void method5428(@OriginalArg(0) Class4_Sub30 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4864();
			if (local9 == 0) {
				return;
			}
			this.method5429(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!tl;II)V")
	private void method5429(@OriginalArg(0) Class4_Sub30 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static414.method5433(arg0.method4865());
		} else if (arg1 == 2) {
			this.anInt7035 = arg0.method4872();
		} else if (arg1 == 4) {
			this.aBoolean475 = false;
		} else if (arg1 == 5) {
			this.aString69 = arg0.method4867();
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Z")
	public boolean method5431() {
		return this.aChar5 == 's';
	}
}
