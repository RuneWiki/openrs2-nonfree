import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class162 {

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "Lclient!qk;")
	private Class2 aClass2_203;

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
	private int anInt5148 = 0;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "Lclient!l;")
	private Class101 aClass101_21;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!l;)V")
	public Class162(@OriginalArg(0) Class101 arg0) {
		this.aClass101_21 = arg0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)Lclient!qk;")
	public Class2 method4097() {
		this.anInt5148 = 0;
		return this.method4098();
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)Lclient!qk;")
	public Class2 method4098() {
		@Pc(26) Class2 local26;
		if (this.anInt5148 > 0 && this.aClass2_203 != this.aClass101_21.aClass2Array1[this.anInt5148 - 1]) {
			local26 = this.aClass2_203;
			this.aClass2_203 = local26.aClass2_232;
			return local26;
		}
		do {
			if (this.anInt5148 >= this.aClass101_21.anInt3494) {
				return null;
			}
			local26 = this.aClass101_21.aClass2Array1[this.anInt5148++].aClass2_232;
		} while (local26 == this.aClass101_21.aClass2Array1[this.anInt5148 - 1]);
		this.aClass2_203 = local26.aClass2_232;
		return local26;
	}
}
