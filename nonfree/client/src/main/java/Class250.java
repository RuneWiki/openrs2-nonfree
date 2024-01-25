import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class250 {

	@OriginalMember(owner = "client!va", name = "b", descriptor = "Z")
	public boolean aBoolean625;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "I")
	public int anInt7331;

	@OriginalMember(owner = "client!va", name = "h", descriptor = "I")
	public int anInt7334;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "I")
	public int anInt7339;

	@OriginalMember(owner = "client!va", name = "q", descriptor = "I")
	public int anInt7340;

	@OriginalMember(owner = "client!va", name = "t", descriptor = "I")
	public int anInt7343;

	@OriginalMember(owner = "client!va", name = "r", descriptor = "I")
	public int anInt7341 = 16777215;

	@OriginalMember(owner = "client!va", name = "s", descriptor = "I")
	public int anInt7342 = 8;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!ti;)V")
	public void method5653(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method4548();
			if (local10 == 0) {
				return;
			}
			this.method5654(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!ti;II)V")
	private void method5654(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt7342 = arg0.method4498();
		} else if (arg1 == 2) {
			this.aBoolean625 = true;
		} else if (arg1 == 3) {
			this.anInt7331 = arg0.method4531();
			this.anInt7334 = arg0.method4531();
			this.anInt7343 = arg0.method4531();
		} else if (arg1 == 4) {
			this.anInt7339 = arg0.method4548();
			return;
		} else if (arg1 == 5) {
			this.anInt7340 = arg0.method4498();
			return;
		} else if (arg1 == 6) {
			this.anInt7341 = arg0.method4496();
			return;
		}
	}
}
