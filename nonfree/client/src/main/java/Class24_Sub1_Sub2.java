import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class24_Sub1_Sub2 extends Class24_Sub1 {

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!bb;Ljava/awt/Component;)V")
	public Class24_Sub1_Sub2(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Component arg1) throws Exception {
		super(22050);
		Static65.anInterface1_2 = arg0.method198();
		Static65.anInterface1_2.method238(arg1);
		this.method1088(arg0, 16384);
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "()I")
	@Override
	protected int method1090() {
		return Static65.anInterface1_2.method236();
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	@Override
	protected void method1089(@OriginalArg(0) int arg0) throws Exception {
		Static65.anInterface1_2.method240(arg0);
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "()V")
	@Override
	protected void method1087() {
		Static65.anInterface1_2.method239();
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "()V")
	@Override
	protected void method1083() {
		Static65.anInterface1_2.method237(Static40.anIntArray337);
	}
}
