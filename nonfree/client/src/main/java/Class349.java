import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public final class Class349 {

	@OriginalMember(owner = "client!v", name = "f", descriptor = "J")
	public final long aLong260;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "Lclient!ac;")
	private final Class5_Sub1 aClass5_Sub1_39;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!ac;JI)V")
	public Class349(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong260 = arg1;
		this.aClass5_Sub1_39 = arg0;
	}

	@OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass5_Sub1_39.method344(this.aLong260);
		super.finalize();
	}
}
