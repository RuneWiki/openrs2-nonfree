import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public final class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "Ljava/lang/String;")
	public String aString122;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub21(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString122 = arg0;
	}
}
