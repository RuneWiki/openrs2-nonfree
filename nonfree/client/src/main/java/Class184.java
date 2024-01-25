import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class184 {

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "Lclient!dia;")
	private final Class13_Sub2 aClass13_Sub2_16;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "J")
	public final long aLong158;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!dia;JI)V")
	public Class184(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass13_Sub2_16 = arg0;
		this.aLong158 = arg1;
	}

	@OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass13_Sub2_16.method1994(this.aLong158);
		super.finalize();
	}
}
