import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public final class Class14_Sub11_Sub8 extends Class14_Sub11 {

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "B")
	private byte aByte102;

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "Z")
	private boolean aBoolean586;

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "B")
	private byte aByte103;

	@OriginalMember(owner = "client!pq", name = "A", descriptor = "B")
	private byte aByte104;

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "B")
	private byte aByte105;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BLclient!jc;)V")
	@Override
	public void method9160(@OriginalArg(1) Class14_Sub21 arg0) {
		this.aBoolean586 = arg0.method7695(119) == 1;
		this.aByte104 = arg0.method7720();
		this.aByte102 = arg0.method7720();
		this.aByte103 = arg0.method7720();
		this.aByte105 = arg0.method7720();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!aq;I)V")
	@Override
	public void method9161(@OriginalArg(0) Class23 arg0) {
		arg0.aByte2 = this.aByte103;
		arg0.aByte1 = this.aByte102;
		arg0.aByte3 = this.aByte105;
		arg0.aByte4 = this.aByte104;
		arg0.aBoolean24 = this.aBoolean586;
	}
}
