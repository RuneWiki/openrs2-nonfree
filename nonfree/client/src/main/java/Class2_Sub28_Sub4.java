import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class2_Sub28_Sub4 extends Class2_Sub28 {

	@OriginalMember(owner = "client!vq", name = "s", descriptor = "B")
	private byte aByte145;

	@OriginalMember(owner = "client!vq", name = "x", descriptor = "Ljava/lang/String;")
	private String aString128;

	@OriginalMember(owner = "client!vq", name = "z", descriptor = "I")
	private int anInt11139;

	@OriginalMember(owner = "client!vq", name = "A", descriptor = "I")
	private int anInt11140 = -1;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!hi;B)V")
	@Override
	public void method9518(@OriginalArg(0) Class2_Sub30 arg0) {
		@Pc(17) Class11 local17 = arg0.aClass11Array1[this.anInt11140];
		local17.anInt172 = this.anInt11139;
		local17.aString1 = this.aString128;
		local17.aByte1 = this.aByte145;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!ol;I)V")
	@Override
	public void method9519(@OriginalArg(0) Class2_Sub8 arg0) {
		this.anInt11140 = arg0.method5211();
		this.aByte145 = arg0.method5175();
		this.anInt11139 = arg0.method5211();
		arg0.method5213();
		this.aString128 = arg0.method5178();
	}
}
