import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class26 implements Runnable {

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "Z")
	public boolean aBoolean28 = true;

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "[I")
	public int[] anIntArray46 = new int[500];

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "[I")
	public int[] anIntArray47 = new int[500];

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
	public int anInt711 = 0;

	@OriginalMember(owner = "client!ck", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean28) {
			@Pc(6) Object local6 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt711 < 500) {
					this.anIntArray46[this.anInt711] = Static205.anInt4361;
					this.anIntArray47[this.anInt711] = Static15.anInt373;
					this.anInt711++;
				}
			}
			Static186.method3115(50L);
		}
	}
}
