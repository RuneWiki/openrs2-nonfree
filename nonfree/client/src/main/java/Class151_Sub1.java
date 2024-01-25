import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class151_Sub1 extends Class151 implements Runnable {

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
	public int anInt6719 = -1;

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "Z")
	private boolean aBoolean584 = true;

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "Lclient!wr;")
	private final Class80_Sub2 aClass80_Sub2_1;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!wr;)V")
	public Class151_Sub1(@OriginalArg(0) Class80_Sub2 arg0) {
		this.aClass80_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
	public void method5586() {
		this.aBoolean584 = false;
	}

	@OriginalMember(owner = "client!wb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean584) {
			this.aClass80_Sub2_1.method5716(this);
		}
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
	public void method5588() {
		(new Thread(this, "a")).start();
	}
}
