import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public final class Class105_Sub2 extends Class105 {

	@OriginalMember(owner = "client!sn", name = "I", descriptor = "I")
	private final int anInt6197;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!hf;I)V")
	public Class105_Sub2(@OriginalArg(0) Class103 arg0, @OriginalArg(1) int arg1) {
		Static372.anInterface9_2 = arg0.method2352();
		this.anInt6197 = arg1;
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)V")
	@Override
	public void method5169(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static372.anInterface9_2.method5238(arg0, this.anInt6197);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "()I")
	@Override
	protected int method5160() {
		return Static372.anInterface9_2.method5233(this.anInt6197);
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "()V")
	@Override
	protected void method5164() {
		Static372.anInterface9_2.method5235(this.anInt6197, super.anIntArray542);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5172(@OriginalArg(0) Component arg0) throws Exception {
		Static372.anInterface9_2.method5236(Static24.aBoolean29, arg0, Static203.anInt3580);
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "()V")
	@Override
	protected void method5168() {
		Static372.anInterface9_2.method5234(this.anInt6197);
	}

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "()V")
	@Override
	protected void method5170() {
		Static372.anInterface9_2.method5237(this.anInt6197);
	}
}
