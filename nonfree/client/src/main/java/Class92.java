import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class92 implements Runnable {

	@OriginalMember(owner = "client!im", name = "e", descriptor = "Lclient!pm;")
	public Class139 aClass139_2;

	@OriginalMember(owner = "client!im", name = "f", descriptor = "[Lclient!tj;")
	public volatile Class103[] aClass103Array1 = new Class103[2];

	@OriginalMember(owner = "client!im", name = "c", descriptor = "Z")
	public volatile boolean aBoolean170 = false;

	@OriginalMember(owner = "client!im", name = "j", descriptor = "Z")
	public volatile boolean aBoolean171 = false;

	@OriginalMember(owner = "client!im", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean171 = true;
		try {
			while (!this.aBoolean170) {
				for (@Pc(13) int local13 = 0; local13 < 2; local13++) {
					@Pc(23) Class103 local23 = this.aClass103Array1[local13];
					if (local23 != null) {
						local23.method3011();
					}
				}
				Static303.method4677(10L);
				Static62.method1013(this.aClass139_2, null);
			}
		} catch (@Pc(48) Exception local48) {
			Static193.method3072(local48, null);
		} finally {
			this.aBoolean171 = false;
		}
	}
}
