import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public final class Class372 implements Interface15 {

	@OriginalMember(owner = "client!vaa", name = "f", descriptor = "I")
	public final int anInt9924;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(I)V")
	public Class372(@OriginalArg(0) int arg0) {
		this.anInt9924 = arg0;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)Lclient!uu;")
	@Override
	public Class369 method8734() {
		return Static9.aClass369_1;
	}
}
