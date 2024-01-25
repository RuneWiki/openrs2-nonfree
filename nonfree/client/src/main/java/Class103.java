import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class103 {

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "Lclient!fb;")
	private Class1 aClass1_73;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
	private int anInt2443 = 0;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "Lclient!vk;")
	private final Class207 aClass207_16;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!vk;)V")
	public Class103(@OriginalArg(0) Class207 arg0) {
		this.aClass207_16 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Lclient!fb;")
	public Class1 method2002() {
		this.anInt2443 = 0;
		return this.method2003();
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)Lclient!fb;")
	public Class1 method2003() {
		@Pc(23) Class1 local23;
		if (this.anInt2443 > 0 && this.aClass207_16.aClass1Array1[this.anInt2443 - 1] != this.aClass1_73) {
			local23 = this.aClass1_73;
			this.aClass1_73 = local23.aClass1_247;
			return local23;
		}
		while (this.aClass207_16.anInt6462 > this.anInt2443) {
			local23 = this.aClass207_16.aClass1Array1[this.anInt2443++].aClass1_247;
			if (local23 != this.aClass207_16.aClass1Array1[this.anInt2443 - 1]) {
				this.aClass1_73 = local23.aClass1_247;
				return local23;
			}
		}
		return null;
	}
}
