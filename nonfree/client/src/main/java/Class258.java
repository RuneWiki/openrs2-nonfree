import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class258 {

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "Lclient!um;")
	private Class5 aClass5_228;

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "Lclient!cb;")
	private Class42 aClass42_32;

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
	private int anInt7561 = 0;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
	private Class258() {
	}

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!cb;)V")
	public Class258(@OriginalArg(0) Class42 arg0) {
		this.aClass42_32 = arg0;
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)Lclient!um;")
	public Class5 method6134() {
		this.anInt7561 = 0;
		return this.method6135();
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)Lclient!um;")
	public Class5 method6135() {
		@Pc(25) Class5 local25;
		if (this.anInt7561 > 0 && this.aClass42_32.aClass5Array1[this.anInt7561 - 1] != this.aClass5_228) {
			local25 = this.aClass5_228;
			this.aClass5_228 = local25.aClass5_284;
			return local25;
		}
		while (this.aClass42_32.anInt1143 > this.anInt7561) {
			local25 = this.aClass42_32.aClass5Array1[this.anInt7561++].aClass5_284;
			if (local25 != this.aClass42_32.aClass5Array1[this.anInt7561 - 1]) {
				this.aClass5_228 = local25.aClass5_284;
				return local25;
			}
		}
		return null;
	}
}
