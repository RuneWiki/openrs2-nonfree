import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public final class Class103_Sub1 extends Class103 implements Runnable {

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "Z")
	private boolean aBoolean213 = true;

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
	public int anInt3028 = -1;

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "Lclient!t;")
	private final Class19_Sub2 aClass19_Sub2_1;

	static {
		new Class62("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!t;)V")
	public Class103_Sub1(@OriginalArg(0) Class19_Sub2 arg0) {
		this.aClass19_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
	public void method2436() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!ia", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean213) {
			this.aClass19_Sub2_1.method5312(this);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public void method2437() {
		this.aBoolean213 = false;
	}
}
