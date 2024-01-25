import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public final class Class57 {

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "Lclient!dv;")
	public Class57 aClass57_1;

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
	public int anInt1828;

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
	public int anInt1830;

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
	public int anInt1831;

	@OriginalMember(owner = "client!dv", name = "j", descriptor = "Lclient!c;")
	public Class33 aClass33_1;

	@OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
	public final int anInt1834;

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
	public final int anInt1829;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(II)V")
	public Class57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1834 = arg1;
		this.anInt1829 = arg0;
	}

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lclient!dv;I)V")
	public Class57(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1) {
		this.aClass57_1 = arg0;
		this.anInt1829 = this.aClass57_1.anInt1829;
		this.anInt1834 = arg1 + this.aClass57_1.anInt1834;
		this.aClass33_1 = this.aClass57_1.aClass33_1;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)Lclient!hf;")
	public Class102 method1591() {
		return Static173.method2785(this.anInt1829);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)Lclient!dv;")
	public Class57 method1593(@OriginalArg(0) int arg0) {
		return new Class57(this.anInt1829, arg0);
	}
}
