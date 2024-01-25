import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class209 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "Lclient!pp;")
	private Class2_Sub3 aClass2_Sub3_27 = new Class2_Sub3();

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "Lclient!je;")
	private final Class171 aClass171_4 = new Class171();

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
	private final int anInt5502;

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
	private int anInt5503;

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "Lclient!il;")
	private final Class162 aClass162_25;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(I)V")
	public Class209(@OriginalArg(0) int arg0) {
		this.anInt5502 = arg0;
		this.anInt5503 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass162_25 = new Class162(local19);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!pp;ZJ)V")
	public void method4596(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt5503 == 0) {
			@Pc(22) Class2_Sub3 local22 = this.aClass171_4.method3787();
			local22.method7966();
			local22.method7767();
			if (local22 == this.aClass2_Sub3_27) {
				local22 = this.aClass171_4.method3787();
				local22.method7966();
				local22.method7767();
			}
		} else {
			this.anInt5503--;
		}
		this.aClass162_25.method3522(arg0, arg1);
		this.aClass171_4.method3791(arg0);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BJ)Lclient!pp;")
	public Class2_Sub3 method4599(@OriginalArg(1) long arg0) {
		@Pc(18) Class2_Sub3 local18 = (Class2_Sub3) this.aClass162_25.method3519(arg0);
		if (local18 != null) {
			this.aClass171_4.method3791(local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
	public void method4600() {
		this.aClass171_4.method3790();
		this.aClass162_25.method3518();
		this.aClass2_Sub3_27 = new Class2_Sub3();
		this.anInt5503 = this.anInt5502;
	}
}
