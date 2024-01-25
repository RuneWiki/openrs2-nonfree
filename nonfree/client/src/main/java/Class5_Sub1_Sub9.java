import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public final class Class5_Sub1_Sub9 extends Class5_Sub1 {

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "B")
	private byte aByte110;

	@OriginalMember(owner = "client!oj", name = "q", descriptor = "B")
	private byte aByte111;

	@OriginalMember(owner = "client!oj", name = "r", descriptor = "B")
	private byte aByte112;

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "B")
	private byte aByte113;

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "Z")
	private boolean aBoolean642;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLclient!mc;)V")
	@Override
	public void method8507(@OriginalArg(1) Class5_Sub41 arg0) {
		this.aBoolean642 = arg0.method7816() == 1;
		this.aByte110 = arg0.method7861();
		this.aByte113 = arg0.method7861();
		this.aByte112 = arg0.method7861();
		this.aByte111 = arg0.method7861();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!im;B)V")
	@Override
	public void method8505(@OriginalArg(0) Class166 arg0) {
		arg0.aByte71 = this.aByte112;
		arg0.aByte73 = this.aByte111;
		arg0.aBoolean414 = this.aBoolean642;
		arg0.aByte72 = this.aByte110;
		arg0.aByte70 = this.aByte113;
	}
}
