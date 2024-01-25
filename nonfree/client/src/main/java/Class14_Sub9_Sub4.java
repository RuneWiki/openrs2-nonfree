import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public final class Class14_Sub9_Sub4 extends Class14_Sub9 {

	@OriginalMember(owner = "client!uu", name = "m", descriptor = "B")
	private byte aByte137;

	@OriginalMember(owner = "client!uu", name = "s", descriptor = "Ljava/lang/String;")
	private String aString120;

	@OriginalMember(owner = "client!uu", name = "r", descriptor = "B")
	private byte aByte138;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8846(@OriginalArg(0) Class14_Sub21 arg0) {
		this.aString120 = arg0.method7706();
		if (this.aString120 != null) {
			arg0.method7695(99);
			this.aByte138 = arg0.method7720();
			this.aByte137 = arg0.method7720();
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZLclient!uq;)V")
	@Override
	public void method8845(@OriginalArg(1) Class14_Sub48 arg0) {
		if (this.aString120 != null) {
			arg0.aByte135 = this.aByte138;
			arg0.aByte136 = this.aByte137;
		}
		arg0.aString118 = this.aString120;
	}
}
