import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public final class Class190 {

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "Lclient!lea;")
	private final Class101_Sub2 aClass101_Sub2_19;

	@OriginalMember(owner = "client!kba", name = "f", descriptor = "J")
	public final long aLong151;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lclient!lea;J[Lclient!ck;)V")
	public Class190(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class57[] arg2) {
		this.aClass101_Sub2_19 = arg0;
		this.aLong151 = arg1;
	}

	@OriginalMember(owner = "client!kba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass101_Sub2_19.method5634(this.aLong151);
		super.finalize();
	}
}
