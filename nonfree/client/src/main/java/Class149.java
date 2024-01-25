import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class149 {

	@OriginalMember(owner = "client!im", name = "o", descriptor = "I")
	public int anInt4021 = 0;

	@OriginalMember(owner = "client!im", name = "n", descriptor = "I")
	public int anInt4020 = 0;

	@OriginalMember(owner = "client!im", name = "j", descriptor = "Lclient!ad;")
	private final Class6 aClass6_23 = new Class6(64);

	@OriginalMember(owner = "client!im", name = "q", descriptor = "Lclient!te;")
	private Interface20 anInterface20_1 = null;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "Lclient!tf;")
	private final Class322 aClass322_80;

	@OriginalMember(owner = "client!im", name = "b", descriptor = "Lclient!tf;")
	private final Class322 aClass322_81;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(ILclient!tf;Lclient!tf;Lclient!te;)V")
	public Class149(@OriginalArg(0) int arg0, @OriginalArg(1) Class322 arg1, @OriginalArg(2) Class322 arg2, @OriginalArg(3) Interface20 arg3) {
		this.aClass322_80 = arg1;
		this.aClass322_81 = arg2;
		this.anInterface20_1 = arg3;
		if (this.aClass322_80 != null) {
			this.anInt4020 = this.aClass322_80.method6831(1);
		}
		if (this.aClass322_81 != null) {
			this.anInt4021 = this.aClass322_81.method6831(1);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(JLclient!wd;I[I)Ljava/lang/String;")
	public String method3565(@OriginalArg(0) long arg0, @OriginalArg(1) Class358 arg1, @OriginalArg(3) int[] arg2) {
		if (this.anInterface20_1 != null) {
			@Pc(22) String local22 = this.anInterface20_1.method314(arg1, arg2, arg0);
			if (local22 != null) {
				return local22;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Lclient!fn;")
	public Class3_Sub7_Sub10 method3568(@OriginalArg(0) int arg0) {
		@Pc(21) Class3_Sub7_Sub10 local21 = (Class3_Sub7_Sub10) this.aClass6_23.method92((long) arg0);
		if (local21 != null) {
			return local21;
		}
		@Pc(37) byte[] local37;
		if (arg0 < 32768) {
			local37 = this.aClass322_80.method6802(1, arg0);
		} else {
			local37 = this.aClass322_81.method6802(1, arg0 & 0x7FFF);
		}
		local21 = new Class3_Sub7_Sub10();
		local21.aClass149_4 = this;
		if (local37 != null) {
			local21.method2879(new Class3_Sub11(local37));
		}
		if (arg0 >= 32768) {
			local21.method2884();
		}
		this.aClass6_23.method106((long) arg0, local21);
		return local21;
	}
}
