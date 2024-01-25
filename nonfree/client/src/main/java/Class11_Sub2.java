import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
	private final int anInt7649;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!qj;I)V")
	public Class11_Sub2(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1) {
		Static442.anInterface22_1 = (Interface22) arg0.method6126();
		this.anInt7649 = arg1;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "()I")
	@Override
	protected int method6284() {
		return Static442.anInterface22_1.method7830(this.anInt7649);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method6289(@OriginalArg(0) Component arg0) throws Exception {
		Static442.anInterface22_1.method7826(Static330.anInt6003, arg0, Static341.aBoolean438);
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "()V")
	@Override
	protected void method6296() {
		Static442.anInterface22_1.method7829(this.anInt7649, super.anIntArray550);
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
	@Override
	public void method6293(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static442.anInterface22_1.method7827(this.anInt7649, arg0);
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "()V")
	@Override
	protected void method6292() {
		Static442.anInterface22_1.method7828(this.anInt7649);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "()V")
	@Override
	protected void method6281() {
		Static442.anInterface22_1.method7831(this.anInt7649);
	}
}
