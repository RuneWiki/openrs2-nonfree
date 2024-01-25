import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public final class Class14_Sub2_Sub1 extends Class14_Sub2 {

	@OriginalMember(owner = "client!aja", name = "p", descriptor = "B")
	private byte aByte2;

	@OriginalMember(owner = "client!aja", name = "r", descriptor = "B")
	private byte aByte3;

	@OriginalMember(owner = "client!aja", name = "t", descriptor = "Z")
	private boolean aBoolean14;

	@OriginalMember(owner = "client!aja", name = "u", descriptor = "B")
	private byte aByte4;

	@OriginalMember(owner = "client!aja", name = "w", descriptor = "B")
	private byte aByte5;

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(BLclient!mda;)V")
	@Override
	public void method9307(@OriginalArg(1) Class229 arg0) {
		arg0.aBoolean467 = this.aBoolean14;
		arg0.aByte104 = this.aByte3;
		arg0.aByte102 = this.aByte4;
		arg0.aByte101 = this.aByte5;
		arg0.aByte103 = this.aByte2;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILclient!so;)V")
	@Override
	public void method9310(@OriginalArg(1) Class14_Sub29 arg0) {
		this.aBoolean14 = arg0.method5866() == 1;
		this.aByte3 = arg0.method5845();
		this.aByte2 = arg0.method5845();
		this.aByte4 = arg0.method5845();
		this.aByte5 = arg0.method5845();
	}
}
