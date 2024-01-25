import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class371 implements Interface25 {

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
	public final int anInt10505;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
	public Class371(@OriginalArg(0) int arg0) {
		this.anInt10505 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Lclient!hda;")
	@Override
	public Class129 method8540() {
		return Static8.aClass129_1;
	}
}
