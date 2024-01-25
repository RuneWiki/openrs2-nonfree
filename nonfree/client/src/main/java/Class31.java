import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class31 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "Lclient!m;")
	private Class6_Sub2 aClass6_Sub2_11 = new Class6_Sub2();

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!nk;")
	private final Class143 aClass143_4 = new Class143();

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
	private int anInt705;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
	private final int anInt703;

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "Lclient!jj;")
	private final Class108 aClass108_4;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(I)V")
	public Class31(@OriginalArg(0) int arg0) {
		this.anInt705 = arg0;
		this.anInt703 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass108_4 = new Class108(local19);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(JLclient!m;B)V")
	public void method632(@OriginalArg(0) long arg0, @OriginalArg(1) Class6_Sub2 arg1) {
		if (this.anInt705 == 0) {
			@Pc(13) Class6_Sub2 local13 = this.aClass143_4.method3759();
			local13.method5756();
			local13.method5761();
			if (this.aClass6_Sub2_11 == local13) {
				local13 = this.aClass143_4.method3759();
				local13.method5756();
				local13.method5761();
			}
		} else {
			this.anInt705--;
		}
		this.aClass108_4.method2898(arg0, arg1);
		this.aClass143_4.method3765(arg1);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IJ)Lclient!m;")
	public Class6_Sub2 method634(@OriginalArg(1) long arg0) {
		@Pc(10) Class6_Sub2 local10 = (Class6_Sub2) this.aClass108_4.method2900(arg0);
		if (local10 != null) {
			this.aClass143_4.method3765(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public void method636() {
		this.aClass143_4.method3758();
		this.aClass108_4.method2909();
		this.aClass6_Sub2_11 = new Class6_Sub2();
		this.anInt705 = this.anInt703;
	}
}
