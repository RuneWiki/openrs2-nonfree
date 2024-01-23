import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public final class Class151 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
	public int anInt4770;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
	public int anInt4774;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
	public int anInt4775;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
	public int anInt4776;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public Class151() {
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!sg;)V")
	public Class151(@OriginalArg(0) Class151 arg0) {
		this.anInt4775 = arg0.anInt4775;
		this.anInt4776 = arg0.anInt4776;
		this.anInt4774 = arg0.anInt4774;
		this.anInt4770 = arg0.anInt4770;
	}
}
