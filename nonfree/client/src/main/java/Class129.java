import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class129 {

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "Lclient!hh;")
	private Class2 aClass2_95;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "Lclient!lba;")
	private Class218 aClass218_12;

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
	private int anInt3072 = 0;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V")
	private Class129() {
	}

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!lba;)V")
	public Class129(@OriginalArg(0) Class218 arg0) {
		this.aClass218_12 = arg0;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)Lclient!hh;")
	public Class2 method2681() {
		if (this.anInt3072 > 0 && this.aClass2_95 != this.aClass218_12.aClass2Array1[this.anInt3072 - 1]) {
			@Pc(24) Class2 local24 = this.aClass2_95;
			this.aClass2_95 = local24.aClass2_345;
			return local24;
		}
		while (this.aClass218_12.anInt5661 > this.anInt3072) {
			@Pc(53) Class2 local53 = this.aClass218_12.aClass2Array1[this.anInt3072++].aClass2_345;
			if (local53 != this.aClass218_12.aClass2Array1[this.anInt3072 - 1]) {
				this.aClass2_95 = local53.aClass2_345;
				return local53;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)Lclient!hh;")
	public Class2 method2682() {
		this.anInt3072 = 0;
		return this.method2681();
	}
}
