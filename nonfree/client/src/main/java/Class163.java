import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class163 {

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
	public int anInt4820;

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
	public int anInt4824;

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
	public int anInt4826;

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
	public int anInt4827;

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
	public int anInt4828;

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "Z")
	public boolean aBoolean334;

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
	public int anInt4821 = 8;

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
	public int anInt4829 = 16777215;

	static {
		new Class21(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILclient!wn;B)V")
	private void method4107(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt4821 = arg1.method4560();
		} else if (arg0 == 2) {
			this.aBoolean334 = true;
		} else if (arg0 == 3) {
			this.anInt4820 = arg1.method4586();
			this.anInt4828 = arg1.method4586();
			this.anInt4826 = arg1.method4586();
		} else if (arg0 == 4) {
			this.anInt4827 = arg1.method4614();
		} else if (arg0 == 5) {
			this.anInt4824 = arg1.method4560();
		} else if (arg0 == 6) {
			this.anInt4829 = arg1.method4582();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!wn;Z)V")
	public void method4110(@OriginalArg(0) Class4_Sub20 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4614();
			if (local15 == 0) {
				return;
			}
			this.method4107(local15, arg0);
		}
	}
}
