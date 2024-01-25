import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public final class Class5_Sub1_Sub5 extends Class5_Sub1 {

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "Ljava/lang/String;")
	private String aString32 = null;

	@OriginalMember(owner = "client!hn", name = "s", descriptor = "J")
	private long aLong104 = -1L;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLclient!mc;)V")
	@Override
	public void method8507(@OriginalArg(1) Class5_Sub41 arg0) {
		if (arg0.method7816() != 255) {
			arg0.anInt9230--;
			this.aLong104 = arg0.method7823();
		}
		this.aString32 = arg0.method7815();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!im;B)V")
	@Override
	public void method8505(@OriginalArg(0) Class166 arg0) {
		arg0.method4101(this.aString32, this.aLong104);
	}
}
