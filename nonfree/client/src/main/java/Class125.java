import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public final class Class125 implements Interface3 {

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "Lclient!uq;")
	private final Class362 aClass362_39;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lclient!uq;)V")
	public Class125(@OriginalArg(0) Class362 arg0) {
		this.aClass362_39 = arg0;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)Lclient!kt;")
	@Override
	public Class201 method8318() {
		return Static322.aClass201_1;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Z)I")
	@Override
	public int method8319() {
		return this.aClass362_39.method8341() ? 100 : this.aClass362_39.method8358();
	}
}
