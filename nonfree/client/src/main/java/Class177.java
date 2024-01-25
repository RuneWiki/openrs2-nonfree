import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public final class Class177 implements Interface25 {

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
	public final int anInt6141;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(I)V")
	public Class177(@OriginalArg(0) int arg0) {
		this.anInt6141 = arg0;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Lclient!hda;")
	@Override
	public Class129 method8540() {
		return Static180.aClass129_5;
	}
}
