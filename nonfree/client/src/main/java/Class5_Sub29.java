import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public final class Class5_Sub29 extends Class5 {

	@OriginalMember(owner = "client!kha", name = "j", descriptor = "I")
	public int anInt5492;

	@OriginalMember(owner = "client!kha", name = "<init>", descriptor = "()V")
	private Class5_Sub29() {
	}

	@OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(I)V")
	public Class5_Sub29(@OriginalArg(0) int arg0) {
		this.anInt5492 = arg0;
	}
}
