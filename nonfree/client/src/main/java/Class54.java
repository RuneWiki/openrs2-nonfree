import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class54 implements Interface17 {

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "Z")
	private boolean aBoolean172;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Ljava/lang/String;")
	private final String aString14;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class54(@OriginalArg(0) String arg0) {
		this.aString14 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)I")
	@Override
	public int method8981() {
		@Pc(16) int local16 = Static271.method9048(this.aString14);
		if (local16 >= 0 && local16 <= 100) {
			return local16;
		} else {
			this.aBoolean172 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)Lclient!kea;")
	@Override
	public Class176 method8982() {
		return Static288.aClass176_4;
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)Z")
	public boolean method2081() {
		return this.aBoolean172;
	}
}
