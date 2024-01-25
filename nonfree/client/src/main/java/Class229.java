import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public final class Class229 {

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "I")
	public int anInt6928;

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "I")
	public int anInt6929;

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "I")
	public int anInt6930;

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "I")
	public int anInt6931;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "()V")
	public Class229() {
	}

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lclient!pda;)V")
	public Class229(@OriginalArg(0) Class229 arg0) {
		this.anInt6931 = arg0.anInt6931;
		this.anInt6928 = arg0.anInt6928;
		this.anInt6930 = arg0.anInt6930;
		this.anInt6929 = arg0.anInt6929;
	}
}
