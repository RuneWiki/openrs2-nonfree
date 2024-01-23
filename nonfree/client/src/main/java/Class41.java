import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class41 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
	public int anInt1162;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
	public int anInt1163;

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
	public int anInt1166;

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "Z")
	public boolean aBoolean90;

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
	public int anInt1167;

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
	public int anInt1172;

	@OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
	public int anInt1175 = 8;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
	public int anInt1169 = 16777215;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILclient!p;I)V")
	private void method955(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub17 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt1175 = arg1.method1837();
		} else if (arg2 == 2) {
			this.aBoolean90 = true;
		} else if (arg2 == 3) {
			this.anInt1172 = arg1.method1869();
			this.anInt1166 = arg1.method1869();
			this.anInt1162 = arg1.method1869();
		} else if (arg2 == 4) {
			this.anInt1167 = arg1.method1874();
		} else if (arg2 == 5) {
			this.anInt1163 = arg1.method1837();
		} else if (arg2 == 6) {
			this.anInt1169 = arg1.method1835();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!p;I)V")
	public void method960(@OriginalArg(1) Class4_Sub17 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(15) int local15 = arg0.method1874();
			if (local15 == 0) {
				return;
			}
			this.method955(arg1, arg0, local15);
		}
	}
}
