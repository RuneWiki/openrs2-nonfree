import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public final class Class55_Sub1 extends Class55 {

	@OriginalMember(owner = "client!e", name = "F", descriptor = "I")
	private final int anInt1916;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!ul;I)V")
	public Class55_Sub1(@OriginalArg(0) Class255 arg0, @OriginalArg(1) int arg1) {
		Static79.anInterface6_1 = arg0.method5819();
		this.anInt1916 = arg1;
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()V")
	@Override
	protected void method5671() {
		Static79.anInterface6_1.method4166(this.anInt1916);
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "()V")
	@Override
	protected void method5675() {
		Static79.anInterface6_1.method4169(this.anInt1916);
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "()V")
	@Override
	protected void method5677() {
		Static79.anInterface6_1.method4170(this.anInt1916, super.anIntArray577);
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
	@Override
	protected int method5669() {
		return Static79.anInterface6_1.method4168(this.anInt1916);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5670(@OriginalArg(0) Component arg0) throws Exception {
		Static79.anInterface6_1.method4167(arg0, Static88.anInt6642, Static3.aBoolean91);
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	@Override
	public void method5673(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static79.anInterface6_1.method4171(this.anInt1916, arg0);
	}
}
