import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public final class Class356 {

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "Lclient!pi;")
	private final Class144_Sub3 aClass144_Sub3_37;

	@OriginalMember(owner = "client!tw", name = "f", descriptor = "J")
	public final long aLong275;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!pi;J[Lclient!ei;)V")
	public Class356(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class95[] arg2) {
		this.aClass144_Sub3_37 = arg0;
		this.aLong275 = arg1;
	}

	@OriginalMember(owner = "client!tw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass144_Sub3_37.method6980(this.aLong275);
		super.finalize();
	}
}
