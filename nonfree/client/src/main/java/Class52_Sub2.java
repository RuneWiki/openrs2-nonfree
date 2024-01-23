import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public final class Class52_Sub2 extends Class52 {

	@OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
	private int anInt5272;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!wa;I)V")
	public Class52_Sub2(@OriginalArg(0) Class175 arg0, @OriginalArg(1) int arg1) {
		Static269.anInterface5_1 = arg0.method4319();
		this.anInt5272 = arg1;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	@Override
	public void method4082(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static269.anInterface5_1.method4014(arg0, this.anInt5272);
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "()V")
	@Override
	protected void method4071() {
		Static269.anInterface5_1.method4012(this.anInt5272);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "()I")
	@Override
	protected int method4069() {
		return Static269.anInterface5_1.method4010(this.anInt5272);
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "()V")
	@Override
	protected void method4073() {
		Static269.anInterface5_1.method4011(this.anInt5272);
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "()V")
	@Override
	protected void method4081() {
		Static269.anInterface5_1.method4015(this.anInt5272, this.anIntArray462);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method4079(@OriginalArg(0) Component arg0) throws Exception {
		Static269.anInterface5_1.method4013(Static13.anInt256, Static166.aBoolean261, arg0);
	}
}
