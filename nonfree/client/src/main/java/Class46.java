import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class46 {

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
	public int anInt853 = 0;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
	public int anInt855 = 0;

	@OriginalMember(owner = "client!bn", name = "k", descriptor = "Lclient!rl;")
	private final Class317 aClass317_2 = new Class317(64);

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "Lclient!tfa;")
	private Interface23 anInterface23_1 = null;

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "Lclient!rg;")
	private final Class310 aClass310_11;

	@OriginalMember(owner = "client!bn", name = "j", descriptor = "Lclient!rg;")
	private final Class310 aClass310_10;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(ILclient!rg;Lclient!rg;Lclient!tfa;)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class310 arg2, @OriginalArg(3) Interface23 arg3) {
		this.aClass310_11 = arg2;
		this.anInterface23_1 = arg3;
		this.aClass310_10 = arg1;
		if (this.aClass310_10 != null) {
			this.anInt853 = this.aClass310_10.method7773(1);
		}
		if (this.aClass310_11 != null) {
			this.anInt855 = this.aClass310_11.method7773(1);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!vq;I[IJ)Ljava/lang/String;")
	public String method895(@OriginalArg(0) Class382 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2) {
		if (this.anInterface23_1 != null) {
			@Pc(20) String local20 = this.anInterface23_1.method1002(arg2, arg0, arg1);
			if (local20 != null) {
				return local20;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZI)Lclient!de;")
	public Class14_Sub2_Sub8 method897(@OriginalArg(1) int arg0) {
		@Pc(11) Class14_Sub2_Sub8 local11 = (Class14_Sub2_Sub8) this.aClass317_2.method7882((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(28) byte[] local28;
		if (arg0 < 32768) {
			local28 = this.aClass310_10.method7803(arg0, 1);
		} else {
			local28 = this.aClass310_11.method7803(arg0 & 0x7FFF, 1);
		}
		local11 = new Class14_Sub2_Sub8();
		local11.aClass46_1 = this;
		if (local28 != null) {
			local11.method1675(new Class14_Sub21(local28));
		}
		if (arg0 >= 32768) {
			local11.method1672();
		}
		this.aClass317_2.method7875((long) arg0, local11);
		return local11;
	}
}
