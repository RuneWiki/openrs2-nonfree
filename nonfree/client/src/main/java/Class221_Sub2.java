import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class221_Sub2 extends Class221 {

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
	private final int anInt7091;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!ml;I)V", line = 12)
	public Class221_Sub2(@OriginalArg(0) Class152 arg0, @OriginalArg(1) int arg1) {
		Static353.anInterface3_2 = arg0.method3765();
		this.anInt7091 = arg1;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 3)
	@Override
	public void method6328(@OriginalArg(0) Component arg0) throws Exception {
		Static353.anInterface3_2.method1995(Static331.anInt6630, arg0, Static329.aBoolean93);
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "()V", line = 10)
	@Override
	protected void method6325() {
		Static353.anInterface3_2.method1998(this.anInt7091);
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "()V", line = 17)
	@Override
	protected void method6330() {
		Static353.anInterface3_2.method1996(this.anInt7091, super.anIntArray485);
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V", line = 21)
	@Override
	public void method6333(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static353.anInterface3_2.method1994(this.anInt7091, arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()I", line = 27)
	@Override
	protected int method6322() {
		return Static353.anInterface3_2.method1997(this.anInt7091);
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "()V", line = 30)
	@Override
	protected void method6323() {
		Static353.anInterface3_2.method1999(this.anInt7091);
	}
}
