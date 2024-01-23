import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public final class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
	public int anInt1237;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class3_Sub8() {
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(I)V")
	public Class3_Sub8(@OriginalArg(0) int arg0) {
		this.anInt1237 = arg0;
	}
}
