import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Class2_Sub3_Sub4 extends Class2_Sub3 {

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "B")
	private byte aByte42;

	@OriginalMember(owner = "client!fk", name = "u", descriptor = "B")
	private byte aByte43;

	@OriginalMember(owner = "client!fk", name = "w", descriptor = "B")
	private byte aByte44;

	@OriginalMember(owner = "client!fk", name = "y", descriptor = "Z")
	private boolean aBoolean269;

	@OriginalMember(owner = "client!fk", name = "C", descriptor = "B")
	private byte aByte45;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!lm;)V")
	@Override
	public void method9472(@OriginalArg(1) Class219 arg0) {
		arg0.aByte92 = this.aByte43;
		arg0.aByte91 = this.aByte45;
		arg0.aByte94 = this.aByte42;
		arg0.aBoolean511 = this.aBoolean269;
		arg0.aByte93 = this.aByte44;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZLclient!ol;)V")
	@Override
	public void method9470(@OriginalArg(1) Class2_Sub8 arg0) {
		this.aBoolean269 = arg0.method5203() == 1;
		this.aByte43 = arg0.method5175();
		this.aByte44 = arg0.method5175();
		this.aByte45 = arg0.method5175();
		this.aByte42 = arg0.method5175();
	}
}
