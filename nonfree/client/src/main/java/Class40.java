import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class40 {

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "Lclient!lh;")
	private Class4_Sub3 aClass4_Sub3_18 = new Class4_Sub3();

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "Lclient!uk;")
	private Class178 aClass178_3 = new Class178();

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "Lclient!ic;")
	private Class85 aClass85_4;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(I)V")
	public Class40(@OriginalArg(0) int arg0) {
		this.anInt1044 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.anInt1045 = arg0;
		this.aClass85_4 = new Class85(local16);
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)Lclient!ni;")
	public Class4 method886() {
		return this.aClass85_4.method1843();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(JILclient!lh;)V")
	public void method888(@OriginalArg(0) long arg0, @OriginalArg(2) Class4_Sub3 arg1) {
		if (this.anInt1044 == 0) {
			@Pc(15) Class4_Sub3 local15 = this.aClass178_3.method4373();
			local15.method4854();
			local15.method4856();
			if (this.aClass4_Sub3_18 == local15) {
				local15 = this.aClass178_3.method4373();
				local15.method4854();
				local15.method4856();
			}
		} else {
			this.anInt1044--;
		}
		this.aClass85_4.method1841(arg1, arg0);
		this.aClass178_3.method4370(arg1);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IJ)Lclient!lh;")
	public Class4_Sub3 method889(@OriginalArg(1) long arg0) {
		@Pc(18) Class4_Sub3 local18 = (Class4_Sub3) this.aClass85_4.method1845(arg0);
		if (local18 != null) {
			this.aClass178_3.method4370(local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)Lclient!ni;")
	public Class4 method890() {
		return this.aClass85_4.method1844();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
	public void method893() {
		this.aClass178_3.method4374();
		this.aClass85_4.method1848();
		this.aClass4_Sub3_18 = new Class4_Sub3();
		this.anInt1044 = this.anInt1045;
	}
}
