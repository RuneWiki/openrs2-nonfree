import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public final class Class239 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
	public int anInt6758;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "Lclient!n;")
	public Class72 aClass72_6;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
	public int anInt6761;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "Lclient!tb;")
	public Class239 aClass239_2;

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
	public int anInt6765;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
	public final int anInt6760;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
	public final int anInt6763;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(II)V")
	public Class239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6760 = arg0;
		this.anInt6763 = arg1;
	}

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!tb;I)V")
	public Class239(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1) {
		this.aClass239_2 = arg0;
		this.anInt6763 = this.aClass239_2.anInt6763 + arg1;
		this.anInt6760 = this.aClass239_2.anInt6760;
		this.aClass72_6 = this.aClass239_2.aClass72_6;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)Lclient!lr;")
	public Class150 method5453() {
		return Static25.method395(this.anInt6760);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)Lclient!tb;")
	public Class239 method5454(@OriginalArg(1) int arg0) {
		return new Class239(this.anInt6760, arg0);
	}
}
