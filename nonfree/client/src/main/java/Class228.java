import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public final class Class228 {

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "Lclient!ug;")
	private final Class135_Sub2 aClass135_Sub2_33;

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "J")
	public final long aLong185;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!ug;JI)V")
	public Class228(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass135_Sub2_33 = arg0;
		this.aLong185 = arg1;
	}

	@OriginalMember(owner = "client!sl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass135_Sub2_33.method5456(this.aLong185);
		super.finalize();
	}
}
