import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
	public int anInt1474;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	private Class1_Sub14() {
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(I)V")
	public Class1_Sub14(@OriginalArg(0) int arg0) {
		this.anInt1474 = arg0;
	}
}
