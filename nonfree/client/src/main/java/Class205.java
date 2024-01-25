import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public final class Class205 {

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "Lclient!mh;")
	private final Class4_Sub3 aClass4_Sub3_31;

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "J")
	public final long aLong163;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!mh;JI)V")
	public Class205(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub3_31 = arg0;
		this.aLong163 = arg1;
	}

	@OriginalMember(owner = "client!nt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass4_Sub3_31.method5255(this.aLong163);
		super.finalize();
	}
}
