import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public final class Class155 {

	@OriginalMember(owner = "client!jfa", name = "f", descriptor = "Lclient!ai;")
	private final Class16_Sub1_Sub1 aClass16_Sub1_Sub1_7;

	@OriginalMember(owner = "client!jfa", name = "g", descriptor = "J")
	public final long aLong140;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lclient!ai;J[Lclient!et;)V")
	public Class155(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class91[] arg2) {
		this.aClass16_Sub1_Sub1_7 = arg0;
		this.aLong140 = arg1;
	}

	@OriginalMember(owner = "client!jfa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass16_Sub1_Sub1_7.method754(this.aLong140);
		super.finalize();
	}
}
