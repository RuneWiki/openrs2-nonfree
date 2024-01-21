import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.audio.AudioPlayer;

@OriginalClass("client!vb")
public final class Class21_Sub2 extends Class21 {

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "Lclient!da;")
	private final InputStream_Sub1 anInputStream_Sub1_1 = new InputStream_Sub1();

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public Class21_Sub2() {
		AudioPlayer.player.start(this.anInputStream_Sub1_1);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
	@Override
	public void method2024() {
		AudioPlayer.player.stop(this.anInputStream_Sub1_1);
		@Pc(6) InputStream_Sub1 local6 = this.anInputStream_Sub1_1;
		synchronized (this.anInputStream_Sub1_1) {
			this.anInputStream_Sub1_1.aBoolean40 = true;
		}
	}
}
