import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class15 {

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "Lclient!bn;")
	public Class23 aClass23_1;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
	public int anInt237;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(II)V")
	public Class15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass23_1 = Static20.method399(arg0);
		this.anInt237 = arg1;
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!bn;I)V")
	public Class15(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1) {
		this.aClass23_1 = arg0;
		this.anInt237 = arg1;
	}
}
