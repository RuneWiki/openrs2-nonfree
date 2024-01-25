import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public final class Class213 {

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "Lclient!gk;")
	private final Class75_Sub2 aClass75_Sub2_40;

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "J")
	public final long aLong194;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lclient!gk;J[Lclient!go;)V")
	public Class213(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class86[] arg2) {
		this.aClass75_Sub2_40 = arg0;
		this.aLong194 = arg1;
	}

	@OriginalMember(owner = "client!ss", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass75_Sub2_40.method2474(this.aLong194);
		super.finalize();
	}
}
