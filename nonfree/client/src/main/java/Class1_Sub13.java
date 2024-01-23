import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
	public int anInt2852;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
	public Class1_Sub13() {
	}

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I)V")
	public Class1_Sub13(@OriginalArg(0) int arg0) {
		this.anInt2852 = arg0;
	}
}
