import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class6 implements Runnable {

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "Z")
	public boolean aBoolean24 = true;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "Ljava/lang/Object;")
	public final Object anObject1 = new Object();

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "[I")
	public final int[] anIntArray38 = new int[500];

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "[I")
	public final int[] anIntArray39 = new int[500];

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
	public int anInt308 = 0;

	@OriginalMember(owner = "client!bb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean24) {
			@Pc(10) Object local10 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt308 < 500) {
					this.anIntArray39[this.anInt308] = Static16.anInt480;
					this.anIntArray38[this.anInt308] = Static85.anInt2459;
					this.anInt308++;
				}
			}
			Static34.method698(50L);
		}
	}
}
