import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class66 implements Runnable {

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "[I")
	public static int[] anIntArray350 = new int[32];

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "[Lclient!ha;")
	public final Class29[] aClass29Array1 = new Class29[2];

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Z")
	public volatile boolean aBoolean200 = false;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "Z")
	public volatile boolean aBoolean201 = false;

	static {
		@Pc(8) int local8 = 2;
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			anIntArray350[local10] = local8 - 1;
			local8 += local8;
		}
	}

	@OriginalMember(owner = "client!sc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean201 = true;
		try {
			while (!this.aBoolean200) {
				for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
					@Pc(15) Class29 local15 = this.aClass29Array1[local8];
					if (local15 != null) {
						local15.method1272();
					}
				}
				Static62.method1070(10L);
				Static60.method1051(false);
			}
		} catch (@Pc(37) Exception local37) {
			Static53.method953(null, local37);
		}
		this.aBoolean201 = false;
	}
}
