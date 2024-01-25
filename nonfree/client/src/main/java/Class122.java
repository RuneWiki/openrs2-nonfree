import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public final class Class122 {

	@OriginalMember(owner = "client!it", name = "c", descriptor = "I")
	public int anInt3356;

	@OriginalMember(owner = "client!it", name = "d", descriptor = "I")
	public int anInt3357;

	@OriginalMember(owner = "client!it", name = "k", descriptor = "Lclient!ia;")
	public Class18 aClass18_4;

	@OriginalMember(owner = "client!it", name = "l", descriptor = "Lclient!it;")
	public Class122 aClass122_1;

	@OriginalMember(owner = "client!it", name = "q", descriptor = "I")
	public int anInt3362;

	@OriginalMember(owner = "client!it", name = "p", descriptor = "I")
	public final int anInt3361;

	@OriginalMember(owner = "client!it", name = "f", descriptor = "I")
	public final int anInt3358;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(II)V")
	public Class122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3361 = arg0;
		this.anInt3358 = arg1;
	}

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!it;I)V")
	public Class122(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1) {
		this.aClass122_1 = arg0;
		this.aClass18_4 = this.aClass122_1.aClass18_4;
		this.anInt3358 = this.aClass122_1.anInt3358 + arg1;
		this.anInt3361 = this.aClass122_1.anInt3361;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)Lclient!e;")
	public Class61 method2819() {
		return Static285.method6078(this.anInt3361);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BI)Lclient!it;")
	public Class122 method2822(@OriginalArg(1) int arg0) {
		return new Class122(this.anInt3361, arg0);
	}
}
