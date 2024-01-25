import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public final class Class2_Sub47 extends Class2 {

	@OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
	public volatile int anInt10143 = -1;

	@OriginalMember(owner = "client!vr", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString110;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub47(@OriginalArg(0) String arg0) {
		this.aString110 = arg0;
	}
}
