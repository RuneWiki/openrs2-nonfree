import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class66 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "J")
	public final long aLong62;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!tk;")
	private final Class13_Sub3_Sub1 aClass13_Sub3_Sub1_2;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!tk;JI)V")
	public Class66(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong62 = arg1;
		this.aClass13_Sub3_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass13_Sub3_Sub1_2.method7818(this.aLong62);
		super.finalize();
	}
}
