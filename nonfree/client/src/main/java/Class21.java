import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public final class Class21 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Lclient!nf;")
	private final Class105_Sub1 aClass105_Sub1_5;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
	public final int anInt434;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!nf;II)V")
	public Class21(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass105_Sub1_5 = arg0;
		this.anInt434 = arg1;
	}

	@OriginalMember(owner = "client!bf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass105_Sub1_5.method3575(this.anInt434);
		super.finalize();
	}
}
