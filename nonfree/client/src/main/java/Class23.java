import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MWZVGOTL")
public final class Class23 implements Runnable {

	@OriginalMember(owner = "client!MWZVGOTL", name = "a", descriptor = "I")
	public int anInt245;

	@OriginalMember(owner = "client!MWZVGOTL", name = "b", descriptor = "[I")
	public int[] anIntArray103 = new int[500];

	@OriginalMember(owner = "client!MWZVGOTL", name = "c", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!MWZVGOTL", name = "e", descriptor = "Z")
	public boolean aBoolean98 = true;

	@OriginalMember(owner = "client!MWZVGOTL", name = "f", descriptor = "[I")
	public int[] anIntArray104 = new int[500];

	@OriginalMember(owner = "client!MWZVGOTL", name = "d", descriptor = "Lclient!client;")
	private client aClient3;

	@OriginalMember(owner = "client!MWZVGOTL", name = "<init>", descriptor = "(Lclient!client;Z)V")
	public Class23(@OriginalArg(0) client arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aClient3 = arg0;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("98708, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MWZVGOTL", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean98) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt245 < 500) {
					this.anIntArray103[this.anInt245] = this.aClient3.anInt803;
					this.anIntArray104[this.anInt245] = this.aClient3.anInt804;
					this.anInt245++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
