import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class3_Sub1_Sub6 extends Class3_Sub1 {

	@OriginalMember(owner = "client!de", name = "ab", descriptor = "I")
	public int anInt889;

	@OriginalMember(owner = "client!de", name = "qb", descriptor = "I")
	public int anInt894;

	@OriginalMember(owner = "client!de", name = "tb", descriptor = "I")
	public int anInt895;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!m;I)V")
	private void method511(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt894 = arg1.method974();
			this.anInt895 = arg1.method981();
			this.anInt889 = arg1.method981();
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!m;)V")
	public void method513(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method981();
			if (local5 == 0) {
				return;
			}
			this.method511(local5, arg0);
		}
	}
}
