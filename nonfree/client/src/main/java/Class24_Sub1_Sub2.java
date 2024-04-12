import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class24_Sub1_Sub2 extends Class24_Sub1 {

	@OriginalMember(owner = "client!me", name = "e", descriptor = "()I", line = 3)
	@Override
	protected int method1090() {
		return Static60.anInterface1_2.method236();
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V", line = 9)
	@Override
	protected void method1089(@OriginalArg(0) int arg0) throws Exception {
		Static60.anInterface1_2.method240(arg0);
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "()V", line = 12)
	@Override
	protected void method1087() {
		Static60.anInterface1_2.method239();
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!bb;Ljava/awt/Component;)V", line = 15)
	public Class24_Sub1_Sub2(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Component arg1) throws Exception {
		super(22050);
		Static60.anInterface1_2 = arg0.method198();
		Static60.anInterface1_2.method238(arg1);
		this.method1088(arg0, 16384);
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "()V", line = 21)
	@Override
	protected void method1083() {
		Static60.anInterface1_2.method237(Class24_Sub1.anIntArray337);
	}
}
