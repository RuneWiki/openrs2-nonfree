import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class137 {

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "Lclient!mg;")
	private Class1 aClass1_161;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
	private int anInt4152 = 0;

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "Lclient!s;")
	private Class156 aClass156_21;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!s;)V")
	public Class137(@OriginalArg(0) Class156 arg0) {
		this.aClass156_21 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)Lclient!mg;")
	public Class1 method3328() {
		@Pc(26) Class1 local26;
		if (this.anInt4152 > 0 && this.aClass1_161 != this.aClass156_21.aClass1Array1[this.anInt4152 - 1]) {
			local26 = this.aClass1_161;
			this.aClass1_161 = local26.aClass1_233;
			return local26;
		}
		do {
			if (this.anInt4152 >= this.aClass156_21.anInt4917) {
				return null;
			}
			local26 = this.aClass156_21.aClass1Array1[this.anInt4152++].aClass1_233;
		} while (local26 == this.aClass156_21.aClass1Array1[this.anInt4152 - 1]);
		this.aClass1_161 = local26.aClass1_233;
		return local26;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)Lclient!mg;")
	public Class1 method3329() {
		this.anInt4152 = 0;
		return this.method3328();
	}
}
