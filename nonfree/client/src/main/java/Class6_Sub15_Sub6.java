import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class6_Sub15_Sub6 extends Class6_Sub15 {

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "J")
	private long aLong163;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
	private int anInt5459;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!gga;)V")
	@Override
	public void method8714(@OriginalArg(1) Class6_Sub23 arg0) {
		this.anInt5459 = arg0.method8369();
		this.aLong163 = arg0.method8381();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLclient!hia;)V")
	@Override
	public void method8716(@OriginalArg(1) Class145 arg0) {
		arg0.method3152(this.anInt5459, this.aLong163);
	}
}
