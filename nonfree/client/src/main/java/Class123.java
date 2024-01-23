import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class123 {

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Lclient!lh;")
	private Class1_Sub2 aClass1_Sub2_53 = new Class1_Sub2();

	@OriginalMember(owner = "client!w", name = "o", descriptor = "Lclient!uh;")
	private Class116 aClass116_6 = new Class116();

	@OriginalMember(owner = "client!w", name = "r", descriptor = "I")
	private int anInt4659;

	@OriginalMember(owner = "client!w", name = "p", descriptor = "I")
	private int anInt4658;

	@OriginalMember(owner = "client!w", name = "q", descriptor = "Lclient!sc;")
	private Class102 aClass102_22;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(I)V")
	public Class123(@OriginalArg(0) int arg0) {
		this.anInt4659 = arg0;
		this.anInt4658 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass102_22 = new Class102(local19);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)Lclient!dh;")
	public Class1 method3638() {
		return this.aClass102_22.method3087();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public void method3639() {
		this.aClass116_6.method3458();
		this.aClass102_22.method3090();
		this.aClass1_Sub2_53 = new Class1_Sub2();
		this.anInt4658 = this.anInt4659;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZJ)Lclient!lh;")
	public Class1_Sub2 method3640(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub2 local10 = (Class1_Sub2) this.aClass102_22.method3093(arg0);
		if (local10 != null) {
			this.aClass116_6.method3454(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(B)Lclient!dh;")
	public Class1 method3641() {
		return this.aClass102_22.method3086();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BLclient!lh;J)V")
	public void method3644(@OriginalArg(1) Class1_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt4658 == 0) {
			@Pc(10) Class1_Sub2 local10 = this.aClass116_6.method3464();
			local10.method3758();
			local10.method3318();
			if (local10 == this.aClass1_Sub2_53) {
				local10 = this.aClass116_6.method3464();
				local10.method3758();
				local10.method3318();
			}
		} else {
			this.anInt4658--;
		}
		this.aClass102_22.method3083(arg0, arg1);
		this.aClass116_6.method3454(arg0);
	}
}
