import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class95 {

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "J")
	public final long aLong90;

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "Lclient!pi;")
	private final Class144_Sub3 aClass144_Sub3_6;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!pi;JI)V")
	public Class95(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong90 = arg1;
		this.aClass144_Sub3_6 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass144_Sub3_6.method6980(this.aLong90);
		super.finalize();
	}
}
