import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class201 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
	public int anInt6207;

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "Z")
	public boolean aBoolean457;

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
	public int anInt6214;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
	public int anInt6215;

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
	public int anInt6219;

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
	public int anInt6224;

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
	public int anInt6208 = 16777215;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
	public int anInt6213 = 8;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IILclient!lf;I)V")
	private void method5264(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt6213 = arg1.method3401();
		} else if (arg0 == 2) {
			this.aBoolean457 = true;
		} else if (arg0 == 3) {
			this.anInt6207 = arg1.method3447();
			this.anInt6214 = arg1.method3447();
			this.anInt6224 = arg1.method3447();
			return;
		} else if (arg0 == 4) {
			this.anInt6215 = arg1.method3440();
			return;
		} else if (arg0 == 5) {
			this.anInt6219 = arg1.method3401();
			return;
		} else if (arg0 == 6) {
			this.anInt6208 = arg1.method3442();
			return;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBLclient!lf;)V")
	public void method5270(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method3440();
			if (local9 == 0) {
				return;
			}
			this.method5264(local9, arg1, arg0);
		}
	}
}
