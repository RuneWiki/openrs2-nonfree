import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class2_Sub28_Sub2 extends Class2_Sub28 {

	@OriginalMember(owner = "client!uq", name = "u", descriptor = "B")
	private byte aByte139;

	@OriginalMember(owner = "client!uq", name = "w", descriptor = "I")
	private int anInt10767;

	@OriginalMember(owner = "client!uq", name = "t", descriptor = "J")
	private long aLong288 = -1L;

	@OriginalMember(owner = "client!uq", name = "r", descriptor = "Ljava/lang/String;")
	private String aString126 = null;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!ol;I)V")
	@Override
	public void method9519(@OriginalArg(0) Class2_Sub8 arg0) {
		if (arg0.method5203() != 255) {
			arg0.anInt5725--;
			this.aLong288 = arg0.method5213();
		}
		this.aString126 = arg0.method5224();
		this.anInt10767 = arg0.method5211();
		this.aByte139 = arg0.method5175();
		arg0.method5213();
		if (Static40.aBoolean36) {
			System.out.println("memberhash:" + this.aLong288 + " membername:" + this.aString126);
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!hi;B)V")
	@Override
	public void method9518(@OriginalArg(0) Class2_Sub30 arg0) {
		@Pc(7) Class11 local7 = new Class11();
		local7.aByte1 = this.aByte139;
		local7.anInt172 = this.anInt10767;
		local7.aString1 = this.aString126;
		arg0.method4111(local7);
	}
}
