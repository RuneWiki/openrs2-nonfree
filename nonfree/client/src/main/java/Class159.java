import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hia")
public final class Class159 implements Interface5 {

	@OriginalMember(owner = "client!hia", name = "k", descriptor = "Z")
	private boolean aBoolean241;

	@OriginalMember(owner = "client!hia", name = "e", descriptor = "Ljava/lang/String;")
	private final String aString55;

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class159(@OriginalArg(0) String arg0) {
		this.aString55 = arg0;
	}

	@OriginalMember(owner = "client!hia", name = "c", descriptor = "(I)Z")
	public boolean method3491() {
		return this.aBoolean241;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)I")
	@Override
	public int method9564() {
		if (this.aBoolean241) {
			return 100;
		}
		@Pc(14) int local14 = Static723.method9562(this.aString55);
		if (local14 >= 0 && local14 <= 100) {
			return local14;
		} else {
			this.aBoolean241 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "(I)Lclient!bq;")
	@Override
	public Class46 method9563() {
		return Static59.aClass46_5;
	}
}
