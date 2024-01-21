import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.audio.AudioPlayer;

@OriginalClass("client!db")
public final class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!db", name = "u", descriptor = "Lclient!cc;")
	private final InputStream_Sub1 anInputStream_Sub1_1 = new InputStream_Sub1();

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	public Class9_Sub1() {
		super(8000);
		AudioPlayer.player.start(this.anInputStream_Sub1_1);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
	@Override
	public void method1549() {
		AudioPlayer.player.stop(this.anInputStream_Sub1_1);
		@Pc(6) InputStream_Sub1 local6 = this.anInputStream_Sub1_1;
		synchronized (this.anInputStream_Sub1_1) {
			this.anInputStream_Sub1_1.aBoolean22 = true;
		}
	}
}
