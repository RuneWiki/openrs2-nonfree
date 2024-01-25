import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public final class Class91 {

	@OriginalMember(owner = "client!et", name = "b", descriptor = "J")
	public final long aLong84;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "Lclient!ai;")
	private final Class16_Sub1_Sub1 aClass16_Sub1_Sub1_5;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!ai;JI)V")
	public Class91(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong84 = arg1;
		this.aClass16_Sub1_Sub1_5 = arg0;
	}

	@OriginalMember(owner = "client!et", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass16_Sub1_Sub1_5.method754(this.aLong84);
		super.finalize();
	}
}
