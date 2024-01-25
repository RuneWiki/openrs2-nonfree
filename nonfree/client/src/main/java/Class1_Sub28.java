import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public final class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	private Class1_Sub28() {
	}

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub28(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString37 = arg0;
	}
}
