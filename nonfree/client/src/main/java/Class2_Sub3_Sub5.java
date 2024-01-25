import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public final class Class2_Sub3_Sub5 extends Class2_Sub3 {

	@OriginalMember(owner = "client!il", name = "v", descriptor = "J")
	private long aLong133 = -1L;

	@OriginalMember(owner = "client!il", name = "u", descriptor = "Ljava/lang/String;")
	private String aString60 = null;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!lm;)V")
	@Override
	public void method9472(@OriginalArg(1) Class219 arg0) {
		arg0.method6012(this.aLong133, this.aString60);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZLclient!ol;)V")
	@Override
	public void method9470(@OriginalArg(1) Class2_Sub8 arg0) {
		if (arg0.method5203() != 255) {
			arg0.anInt5725--;
			this.aLong133 = arg0.method5213();
		}
		this.aString60 = arg0.method5224();
	}
}
