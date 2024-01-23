import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class104 implements Runnable {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "Lclient!wa;")
	public Class175 aClass175_1;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "[Lclient!vi;")
	public volatile Class52[] aClass52Array1 = new Class52[2];

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "Z")
	public volatile boolean aBoolean254 = false;

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "Z")
	public volatile boolean aBoolean253 = false;

	@OriginalMember(owner = "client!mh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean253 = true;
		try {
			while (!this.aBoolean254) {
				for (@Pc(13) int local13 = 0; local13 < 2; local13++) {
					@Pc(21) Class52 local21 = this.aClass52Array1[local13];
					if (local21 != null) {
						local21.method4077();
					}
				}
				Static48.method934(10L);
				Static199.method3244(null, this.aClass175_1);
			}
		} catch (@Pc(44) Exception local44) {
			Static3.method136(null, local44);
		} finally {
			this.aBoolean253 = false;
		}
	}
}
