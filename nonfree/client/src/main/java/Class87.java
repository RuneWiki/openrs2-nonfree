import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public final class Class87 {

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "I")
	public int anInt3133;

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
	public int anInt3134;

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "I")
	public int anInt3135;

	@OriginalMember(owner = "client!eca", name = "k", descriptor = "Lclient!eca;")
	public Class87 aClass87_1;

	@OriginalMember(owner = "client!eca", name = "o", descriptor = "Lclient!bca;")
	public Class30 aClass30_4;

	@OriginalMember(owner = "client!eca", name = "h", descriptor = "I")
	public final int anInt3140;

	@OriginalMember(owner = "client!eca", name = "g", descriptor = "I")
	public final int anInt3139;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(II)V")
	public Class87(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3140 = arg0;
		this.anInt3139 = arg1;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)Lclient!po;")
	public Class267 method2909() {
		return Static564.method8459(this.anInt3140);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(BI)Lclient!eca;")
	public Class87 method2911(@OriginalArg(1) int arg0) {
		return new Class87(this.anInt3140, arg0);
	}
}
