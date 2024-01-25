import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public final class Class391 {

	@OriginalMember(owner = "client!wja", name = "c", descriptor = "J")
	public final long aLong305;

	@OriginalMember(owner = "client!wja", name = "b", descriptor = "Lclient!oia;")
	private final Class16_Sub1_Sub2 aClass16_Sub1_Sub2_12;

	@OriginalMember(owner = "client!wja", name = "<init>", descriptor = "(Lclient!oia;JI)V")
	public Class391(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong305 = arg1;
		this.aClass16_Sub1_Sub2_12 = arg0;
	}

	@OriginalMember(owner = "client!wja", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass16_Sub1_Sub2_12.method6333(this.aLong305);
		super.finalize();
	}
}
