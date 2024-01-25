import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class256 {

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "Ljava/lang/String;")
	public String aString64;

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
	public int anInt7437;

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "Z")
	public boolean aBoolean477 = true;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)Z")
	public boolean method5759() {
		return this.aChar5 == 's';
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!lh;I)V")
	private void method5761(@OriginalArg(1) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar5 = Static423.method5682(arg0.method4112());
		} else if (arg1 == 2) {
			this.anInt7437 = arg0.method4087();
		} else if (arg1 == 4) {
			this.aBoolean477 = false;
		} else if (arg1 == 5) {
			this.aString64 = arg0.method4137();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!lh;)V")
	public void method5762(@OriginalArg(1) Class1_Sub1 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4130();
			if (local9 == 0) {
				return;
			}
			this.method5761(arg0, local9);
		}
	}
}
