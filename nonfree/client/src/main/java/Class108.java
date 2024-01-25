import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class108 {

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "Z")
	public boolean aBoolean242 = false;

	@OriginalMember(owner = "client!fba", name = "h", descriptor = "Z")
	public boolean aBoolean243 = false;

	@OriginalMember(owner = "client!fba", name = "e", descriptor = "I")
	public int anInt3070 = -1;

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "I")
	public int anInt3068 = 1;

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "I")
	public int anInt3071 = 2;

	@OriginalMember(owner = "client!fba", name = "p", descriptor = "I")
	public int anInt3079 = 64;

	@OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
	public int anInt3075 = 64;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILclient!sl;I)V")
	public void method2636(@OriginalArg(1) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(15) int local15 = arg0.method2859();
			if (local15 == 0) {
				return;
			}
			this.method2639(local15, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIILclient!sl;)V")
	private void method2639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub17 arg2) {
		if (arg0 == 1) {
			this.anInt3070 = arg2.method2825();
			if (this.anInt3070 == 65535) {
				this.anInt3070 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt3075 = arg2.method2825() + 1;
			this.anInt3079 = arg2.method2825() + 1;
		} else if (arg0 == 3) {
			arg2.method2860();
		} else if (arg0 == 4) {
			this.anInt3071 = arg2.method2859();
		} else if (arg0 == 5) {
			this.anInt3068 = arg2.method2859();
		} else if (arg0 == 6) {
			this.aBoolean242 = true;
		} else if (arg0 == 7) {
			this.aBoolean243 = true;
		}
	}
}
