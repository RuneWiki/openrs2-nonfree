import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class52 implements Runnable {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
	public static int anInt1971 = -1;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
	public static int anInt1973 = 0;

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
	public static int anInt1978 = 0;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "[J")
	public static long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
	public static int anInt1974 = 0;

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
	public static int anInt1977 = -1;

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "Lclient!o;")
	public static Class40 aClass40_570 = Static12.method257("Please use a different world)3");

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "Lclient!o;")
	public static Class40 aClass40_569 = Static12.method257("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
	public static int anInt1979 = -1;

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "Z")
	public boolean aBoolean157 = true;

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "Ljava/lang/Object;")
	public final Object anObject5 = new Object();

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "[I")
	public final int[] anIntArray432 = new int[500];

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "[I")
	public final int[] anIntArray433 = new int[500];

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
	public int anInt1982 = 0;

	@OriginalMember(owner = "client!rd", name = "run", descriptor = "()V", line = 183)
	@Override
	public void run() {
		while (this.aBoolean157) {
			@Pc(6) Object local6 = this.anObject5;
			synchronized (this.anObject5) {
				if (this.anInt1982 < 500) {
					this.anIntArray432[this.anInt1982] = Class2_Sub5.anInt742;
					this.anIntArray433[this.anInt1982] = Class2_Sub2_Sub15.anInt2394;
					this.anInt1982++;
				}
			}
			Static86.method1494(50L);
		}
	}
}
