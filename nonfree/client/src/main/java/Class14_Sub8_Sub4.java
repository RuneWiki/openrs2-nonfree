import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public final class Class14_Sub8_Sub4 extends Class14_Sub8 {

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "B")
	private byte aByte136;

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "B")
	private byte aByte137;

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "Ljava/lang/String;")
	private String aString110;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!so;I)V")
	@Override
	public void method8405(@OriginalArg(0) Class14_Sub29 arg0) {
		this.aString110 = arg0.method5886();
		if (this.aString110 != null) {
			arg0.method5866();
			this.aByte136 = arg0.method5845();
			this.aByte137 = arg0.method5845();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!hs;Z)V")
	@Override
	public void method8406(@OriginalArg(0) Class14_Sub25 arg0) {
		if (this.aString110 != null) {
			arg0.aByte81 = this.aByte136;
			arg0.aByte80 = this.aByte137;
		}
		arg0.aString48 = this.aString110;
	}
}
