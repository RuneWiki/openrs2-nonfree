import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class13 {

	@OriginalMember(owner = "client!as", name = "d", descriptor = "I")
	public int anInt372;

	@OriginalMember(owner = "client!as", name = "e", descriptor = "I")
	public int anInt373;

	@OriginalMember(owner = "client!as", name = "f", descriptor = "I")
	public int anInt374;

	@OriginalMember(owner = "client!as", name = "g", descriptor = "I")
	public int anInt375;

	@OriginalMember(owner = "client!as", name = "k", descriptor = "I")
	public int anInt378;

	@OriginalMember(owner = "client!as", name = "o", descriptor = "Z")
	public boolean aBoolean33;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "I")
	public int anInt371 = 16777215;

	@OriginalMember(owner = "client!as", name = "h", descriptor = "I")
	public int anInt376 = 8;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!kk;II)V")
	private void method304(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt376 = arg0.method5312();
		} else if (arg1 == 2) {
			this.aBoolean33 = true;
		} else if (arg1 == 3) {
			this.anInt373 = arg0.method5341();
			this.anInt375 = arg0.method5341();
			this.anInt374 = arg0.method5341();
		} else if (arg1 == 4) {
			this.anInt372 = arg0.method5350();
		} else if (arg1 == 5) {
			this.anInt378 = arg0.method5312();
		} else if (arg1 == 6) {
			this.anInt371 = arg0.method5356();
			return;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!kk;B)V")
	public void method306(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5350();
			if (local13 == 0) {
				return;
			}
			this.method304(arg0, local13);
		}
	}
}
