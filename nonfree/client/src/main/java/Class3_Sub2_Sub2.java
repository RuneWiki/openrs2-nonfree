import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public final class Class3_Sub2_Sub2 extends Class3_Sub2 {

	@OriginalMember(owner = "client!av", name = "n", descriptor = "B")
	private byte aByte1;

	@OriginalMember(owner = "client!av", name = "o", descriptor = "B")
	private byte aByte2;

	@OriginalMember(owner = "client!av", name = "r", descriptor = "B")
	private byte aByte3;

	@OriginalMember(owner = "client!av", name = "s", descriptor = "B")
	private byte aByte4;

	@OriginalMember(owner = "client!av", name = "t", descriptor = "Z")
	private boolean aBoolean49;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!tn;I)V")
	@Override
	public void method8290(@OriginalArg(0) Class342 arg0) {
		arg0.aByte129 = this.aByte4;
		arg0.aByte128 = this.aByte1;
		arg0.aByte127 = this.aByte3;
		arg0.aBoolean659 = this.aBoolean49;
		arg0.aByte130 = this.aByte2;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(BLclient!dt;)V")
	@Override
	public void method8291(@OriginalArg(1) Class3_Sub4 arg0) {
		this.aBoolean49 = arg0.method7954() == 1;
		this.aByte2 = arg0.method7960();
		this.aByte3 = arg0.method7960();
		this.aByte1 = arg0.method7960();
		this.aByte4 = arg0.method7960();
	}
}
