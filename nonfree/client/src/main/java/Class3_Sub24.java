import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public final class Class3_Sub24 extends Class3 {

	@OriginalMember(owner = "client!fia", name = "k", descriptor = "I")
	public int anInt3131;

	@OriginalMember(owner = "client!fia", name = "j", descriptor = "Ljava/lang/String;")
	public String aString49;

	@OriginalMember(owner = "client!fia", name = "<init>", descriptor = "()V")
	private Class3_Sub24() {
	}

	@OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub24(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3131 = arg1;
		this.aString49 = arg0;
	}
}
