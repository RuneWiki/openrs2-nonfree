import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class213 {

	@OriginalMember(owner = "client!od", name = "c", descriptor = "Lclient!uj;")
	private Class3 aClass3_194;

	@OriginalMember(owner = "client!od", name = "k", descriptor = "Lclient!sd;")
	private Class267 aClass267_29;

	@OriginalMember(owner = "client!od", name = "i", descriptor = "I")
	private int anInt6594 = 0;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	private Class213() {
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!sd;)V")
	public Class213(@OriginalArg(0) Class267 arg0) {
		this.aClass267_29 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)Lclient!uj;")
	public Class3 method5504() {
		this.anInt6594 = 0;
		return this.method5505();
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)Lclient!uj;")
	public Class3 method5505() {
		@Pc(25) Class3 local25;
		if (this.anInt6594 > 0 && this.aClass3_194 != this.aClass267_29.aClass3Array1[this.anInt6594 - 1]) {
			local25 = this.aClass3_194;
			this.aClass3_194 = local25.aClass3_284;
			return local25;
		}
		while (this.aClass267_29.anInt8036 > this.anInt6594) {
			local25 = this.aClass267_29.aClass3Array1[this.anInt6594++].aClass3_284;
			if (local25 != this.aClass267_29.aClass3Array1[this.anInt6594 - 1]) {
				this.aClass3_194 = local25.aClass3_284;
				return local25;
			}
		}
		return null;
	}
}
