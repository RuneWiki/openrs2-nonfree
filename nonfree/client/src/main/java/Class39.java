import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class39 {

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "Lclient!mh;")
	private Class1 aClass1_65;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
	private int anInt1359 = 0;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "Lclient!br;")
	private final Class26 aClass26_5;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!br;)V")
	public Class39(@OriginalArg(0) Class26 arg0) {
		this.aClass26_5 = arg0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)Lclient!mh;")
	public Class1 method1320() {
		this.anInt1359 = 0;
		return this.method1321();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)Lclient!mh;")
	public Class1 method1321() {
		@Pc(23) Class1 local23;
		if (this.anInt1359 > 0 && this.aClass1_65 != this.aClass26_5.aClass1Array1[this.anInt1359 - 1]) {
			local23 = this.aClass1_65;
			this.aClass1_65 = local23.aClass1_247;
			return local23;
		}
		while (this.anInt1359 < this.aClass26_5.anInt794) {
			local23 = this.aClass26_5.aClass1Array1[this.anInt1359++].aClass1_247;
			if (this.aClass26_5.aClass1Array1[this.anInt1359 - 1] != local23) {
				this.aClass1_65 = local23.aClass1_247;
				return local23;
			}
		}
		return null;
	}
}
