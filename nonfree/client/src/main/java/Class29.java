import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class29 implements Runnable {

	@OriginalMember(owner = "client!g", name = "m", descriptor = "Lclient!df;")
	public Class20 aClass20_3;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "[Lclient!ac;")
	public final Class4[] aClass4Array1 = new Class4[2];

	@OriginalMember(owner = "client!g", name = "k", descriptor = "Z")
	public volatile boolean aBoolean35 = false;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "Z")
	public volatile boolean aBoolean34 = false;

	@OriginalMember(owner = "client!g", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean34 = true;
		try {
			while (!this.aBoolean35) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class4 local19 = this.aClass4Array1[local12];
					if (local19 != null) {
						local19.method857();
					}
				}
				Static81.method1325(10L);
				Static79.method1303(this.aClass20_3, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static93.method1535(null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean34 = false;
		}
	}
}
