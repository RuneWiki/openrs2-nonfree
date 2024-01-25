import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public final class Class359 implements Interface3 {

	@OriginalMember(owner = "client!um", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString110;

	@OriginalMember(owner = "client!um", name = "f", descriptor = "Lclient!uq;")
	private final Class362 aClass362_145;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!uq;Ljava/lang/String;)V")
	public Class359(@OriginalArg(0) Class362 arg0, @OriginalArg(1) String arg1) {
		this.aString110 = arg1;
		this.aClass362_145 = arg0;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)I")
	@Override
	public int method8319() {
		return this.aClass362_145.method8366(this.aString110) ? 100 : 0;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)Lclient!kt;")
	@Override
	public Class201 method8318() {
		return Static322.aClass201_2;
	}
}
