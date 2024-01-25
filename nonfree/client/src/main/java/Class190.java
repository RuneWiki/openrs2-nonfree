import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class190 {

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
	public int anInt5916;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
	public int anInt5917;

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "B")
	private byte aByte70;

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
	public int anInt5919;

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
	public int anInt5921;

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
	public int anInt5922;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	public Class190() {
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!tq;)V")
	public Class190(@OriginalArg(0) Class4_Sub7 arg0) {
		this.aByte70 = arg0.method2393();
		this.anInt5922 = arg0.method2404();
		this.anInt5919 = arg0.method2389();
		this.anInt5921 = arg0.method2389();
		this.anInt5916 = arg0.method2389();
		this.anInt5917 = arg0.method2389();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)I")
	public int method4978() {
		return (this.aByte70 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)I")
	public int method4979() {
		return this.aByte70 & 0x7;
	}
}
