import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public final class Class144 {

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "Lclient!nf;")
	private final Class105_Sub1 aClass105_Sub1_27;

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
	public final int anInt4211;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!nf;I[Lclient!bf;)V")
	public Class144(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class21[] arg2) {
		this.aClass105_Sub1_27 = arg0;
		this.anInt4211 = arg1;
	}

	@OriginalMember(owner = "client!ng", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass105_Sub1_27.method3575(this.anInt4211);
		super.finalize();
	}
}
