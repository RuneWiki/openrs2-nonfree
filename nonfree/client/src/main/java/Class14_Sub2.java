import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.audio.AudioPlayer;

@OriginalClass("client!wc")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "Lclient!td;")
	private final InputStream_Sub1 anInputStream_Sub1_1 = new InputStream_Sub1();

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public Class14_Sub2() {
		super(8000);
		AudioPlayer.player.start(this.anInputStream_Sub1_1);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "()V")
	@Override
	public void method1866() {
		AudioPlayer.player.stop(this.anInputStream_Sub1_1);
		@Pc(6) InputStream_Sub1 local6 = this.anInputStream_Sub1_1;
		synchronized (this.anInputStream_Sub1_1) {
			this.anInputStream_Sub1_1.aBoolean159 = true;
		}
	}
}
