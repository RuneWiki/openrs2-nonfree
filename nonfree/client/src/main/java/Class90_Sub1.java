import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class90_Sub1 extends Class90 implements Runnable {

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
	public static int anInt7104 = 0;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "Z")
	public static boolean aBoolean482 = false;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "Z")
	private boolean aBoolean483 = true;

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
	public int anInt7102 = -1;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "Lclient!bb;")
	private final Class15_Sub1 aClass15_Sub1_1;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!bb;)V", line = 158)
	public Class90_Sub1(@OriginalArg(0) Class15_Sub1 arg0) {
		this.aClass15_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V", line = 6)
	public void method6346() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V", line = 18)
	public void method6347() {
		this.aBoolean483 = false;
	}

	@OriginalMember(owner = "client!wd", name = "run", descriptor = "()V", line = 131)
	@Override
	public void run() {
		while (this.aBoolean483) {
			this.aClass15_Sub1_1.method553(this);
		}
	}
}
