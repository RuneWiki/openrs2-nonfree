import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.audio.AudioPlayer;

@OriginalClass("client!ma")
public final class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!ma", name = "C", descriptor = "Lclient!vc;")
	private final InputStream_Sub1 anInputStream_Sub1_1 = new InputStream_Sub1();

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	public Class31_Sub2() {
		super(8000);
		AudioPlayer.player.start(this.anInputStream_Sub1_1);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
	@Override
	public void method1180() {
		AudioPlayer.player.stop(this.anInputStream_Sub1_1);
		@Pc(6) InputStream_Sub1 local6 = this.anInputStream_Sub1_1;
		synchronized (this.anInputStream_Sub1_1) {
			this.anInputStream_Sub1_1.aBoolean153 = true;
		}
	}
}
