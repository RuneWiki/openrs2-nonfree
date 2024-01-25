import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public final class Class146 implements Interface3 {

	@OriginalMember(owner = "client!hha", name = "i", descriptor = "Lclient!uq;")
	private final Class362 aClass362_47;

	@OriginalMember(owner = "client!hha", name = "h", descriptor = "Ljava/lang/String;")
	private final String aString52;

	@OriginalMember(owner = "client!hha", name = "<init>", descriptor = "(Lclient!uq;Ljava/lang/String;)V")
	public Class146(@OriginalArg(0) Class362 arg0, @OriginalArg(1) String arg1) {
		this.aClass362_47 = arg0;
		this.aString52 = arg1;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(Z)I")
	@Override
	public int method8319() {
		return this.aClass362_47.method8339(this.aString52) ? 100 : this.aClass362_47.method8352(this.aString52);
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)Lclient!kt;")
	@Override
	public Class201 method8318() {
		return Static322.aClass201_3;
	}
}
