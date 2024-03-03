import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class Class2 {

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Lclient!h;")
	public static final Class89 aClass89_257 = new Class89(90, 12);

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "Lclient!ad;")
	public static final Class4 aClass4_151 = new Class4(16);

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_267 = new Class145(39, 3);

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Lclient!ag;")
	public Class2 aClass2_243;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "J")
	public long aLong232;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Lclient!ag;")
	public Class2 aClass2_244;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Z", line = 6)
	public final boolean method6463() {
		return this.aClass2_244 != null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V", line = 640)
	public final void method6469() {
		if (this.aClass2_244 != null) {
			this.aClass2_244.aClass2_243 = this.aClass2_243;
			this.aClass2_243.aClass2_244 = this.aClass2_244;
			this.aClass2_244 = null;
			this.aClass2_243 = null;
		}
	}
}
