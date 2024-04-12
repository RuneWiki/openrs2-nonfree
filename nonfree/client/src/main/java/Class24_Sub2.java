import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.audio.AudioPlayer;

@OriginalClass("client!w")
public final class Class24_Sub2 extends Class24 {

	@OriginalMember(owner = "client!w", name = "y", descriptor = "Lclient!da;")
	private final InputStream_Sub1 anInputStream_Sub1_1 = new InputStream_Sub1();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()V", line = 4)
	@Override
	public void method1656() {
		AudioPlayer.player.stop(this.anInputStream_Sub1_1);
		@Pc(6) InputStream_Sub1 local6 = this.anInputStream_Sub1_1;
		synchronized (this.anInputStream_Sub1_1) {
			this.anInputStream_Sub1_1.aBoolean36 = true;
		}
	}

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V", line = 15)
	public Class24_Sub2() {
		super(8000);
		AudioPlayer.player.start(this.anInputStream_Sub1_1);
	}
}
