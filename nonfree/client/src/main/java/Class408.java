import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public final class Class408 implements Interface5 {

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "Lclient!ik;")
	private final Class182 aClass182_130;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!ik;)V")
	public Class408(@OriginalArg(0) Class182 arg0) {
		this.aClass182_130 = arg0;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)I")
	@Override
	public int method9564() {
		return this.aClass182_130.method3959() ? 100 : this.aClass182_130.method3983();
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)Lclient!bq;")
	@Override
	public Class46 method9563() {
		return Static59.aClass46_2;
	}
}
