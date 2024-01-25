import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class Class212 {

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "Lclient!uja;")
	private final Class145_Sub3 aClass145_Sub3_28;

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "J")
	public final long aLong162;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!uja;J[Lclient!dma;)V")
	public Class212(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class87[] arg2) {
		this.aClass145_Sub3_28 = arg0;
		this.aLong162 = arg1;
	}

	@OriginalMember(owner = "client!kj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass145_Sub3_28.method8878(this.aLong162);
		super.finalize();
	}
}
