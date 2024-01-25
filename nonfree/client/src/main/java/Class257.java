import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class257 {

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "Ljava/lang/String;")
	public String aString77;

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "C")
	private char aChar2;

	@OriginalMember(owner = "client!nw", name = "l", descriptor = "I")
	public int anInt6617;

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "Z")
	public boolean aBoolean508 = true;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!es;II)V")
	private void method5755(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static305.method4280(arg0.method8861());
		} else if (arg1 == 2) {
			this.anInt6617 = arg0.method8850();
		} else if (arg1 == 4) {
			this.aBoolean508 = false;
		} else if (arg1 == 5) {
			this.aString77 = arg0.method8853();
		}
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(B)Z")
	public boolean method5757() {
		return this.aChar2 == 's';
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILclient!es;)V")
	public void method5758(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8865();
			if (local9 == 0) {
				return;
			}
			this.method5755(arg0, local9);
		}
	}
}
