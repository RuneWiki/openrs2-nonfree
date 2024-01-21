import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class38 implements Runnable {

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "Z")
	public boolean aBoolean86 = true;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "Ljava/lang/Object;")
	public final Object anObject1 = new Object();

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "[I")
	public final int[] anIntArray215 = new int[500];

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
	public int anInt1431 = 0;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "[I")
	public final int[] anIntArray216 = new int[500];

	@OriginalMember(owner = "client!lb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean86) {
			@Pc(6) Object local6 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt1431 < 500) {
					this.anIntArray215[this.anInt1431] = Static73.anInt1884;
					this.anIntArray216[this.anInt1431] = Static38.anInt948;
					this.anInt1431++;
				}
			}
			Static9.method179(50L);
		}
	}
}
