import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZRJULOYY")
public final class Class48 implements Runnable {

	@OriginalMember(owner = "client!ZRJULOYY", name = "b", descriptor = "I")
	public int anInt802;

	@OriginalMember(owner = "client!ZRJULOYY", name = "a", descriptor = "Z")
	private boolean aBoolean208 = true;

	@OriginalMember(owner = "client!ZRJULOYY", name = "c", descriptor = "[I")
	public int[] anIntArray207 = new int[500];

	@OriginalMember(owner = "client!ZRJULOYY", name = "e", descriptor = "[I")
	public int[] anIntArray208 = new int[500];

	@OriginalMember(owner = "client!ZRJULOYY", name = "f", descriptor = "Z")
	public boolean aBoolean209 = true;

	@OriginalMember(owner = "client!ZRJULOYY", name = "g", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!ZRJULOYY", name = "d", descriptor = "Lclient!client;")
	private client aClient5;

	@OriginalMember(owner = "client!ZRJULOYY", name = "<init>", descriptor = "(ILclient!client;)V")
	public Class48(@OriginalArg(0) int arg0, @OriginalArg(1) client arg1) {
		try {
			this.aClient5 = arg1;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("91591, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZRJULOYY", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean209) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt802 < 500) {
					this.anIntArray207[this.anInt802] = this.aClient5.anInt818;
					this.anIntArray208[this.anInt802] = this.aClient5.anInt819;
					this.anInt802++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
