import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.audio.AudioPlayer;

@OriginalClass("client!vd")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "Lclient!sa;")
	private final InputStream_Sub1 anInputStream_Sub1_1 = new InputStream_Sub1();

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class15_Sub2() {
		AudioPlayer.player.start(this.anInputStream_Sub1_1);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "()V")
	@Override
	public void method1904() {
		AudioPlayer.player.stop(this.anInputStream_Sub1_1);
		@Pc(6) InputStream_Sub1 local6 = this.anInputStream_Sub1_1;
		synchronized (this.anInputStream_Sub1_1) {
			this.anInputStream_Sub1_1.aBoolean121 = true;
		}
	}
}
