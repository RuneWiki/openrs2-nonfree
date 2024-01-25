import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public final class Class4_Sub9_Sub4 extends Class4_Sub9 {

	@OriginalMember(owner = "client!uca", name = "i", descriptor = "Ljava/lang/String;")
	private String aString114;

	@OriginalMember(owner = "client!uca", name = "j", descriptor = "B")
	private byte aByte137;

	@OriginalMember(owner = "client!uca", name = "m", descriptor = "B")
	private byte aByte138;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!es;I)V")
	@Override
	public void method7843(@OriginalArg(0) Class4_Sub11 arg0) {
		this.aString114 = arg0.method8852();
		if (this.aString114 != null) {
			arg0.method8865();
			this.aByte138 = arg0.method8861();
			this.aByte137 = arg0.method8861();
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!wt;I)V")
	@Override
	public void method7845(@OriginalArg(0) Class4_Sub55 arg0) {
		if (this.aString114 != null) {
			arg0.aByte150 = this.aByte138;
			arg0.aByte149 = this.aByte137;
		}
		arg0.aString124 = this.aString114;
	}
}
