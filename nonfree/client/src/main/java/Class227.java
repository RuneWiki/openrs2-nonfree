import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class227 {

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "Lclient!mh;")
	private final Class4_Sub3 aClass4_Sub3_33;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "J")
	public final long aLong185;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!mh;J[Lclient!nt;)V")
	public Class227(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class205[] arg2) {
		this.aClass4_Sub3_33 = arg0;
		this.aLong185 = arg1;
	}

	@OriginalMember(owner = "client!pi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass4_Sub3_33.method5255(this.aLong185);
		super.finalize();
	}
}
