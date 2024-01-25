import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class3_Sub42 extends Class3 {

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
	public int anInt8429;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	private Class3_Sub42() {
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I)V")
	public Class3_Sub42(@OriginalArg(0) int arg0) {
		this.anInt8429 = arg0;
	}
}
