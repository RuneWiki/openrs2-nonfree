import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class66 {

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
	public int anInt1729 = 0;

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
	public int anInt1725 = 0;

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "Lclient!jk;")
	private final Class137 aClass137_15 = new Class137(64);

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "Lclient!tp;")
	private Interface11 anInterface11_1 = null;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "Lclient!qn;")
	private final Class211 aClass211_26;

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "Lclient!qn;")
	private final Class211 aClass211_27;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(ILclient!qn;Lclient!qn;Lclient!tp;)V")
	public Class66(@OriginalArg(0) int arg0, @OriginalArg(1) Class211 arg1, @OriginalArg(2) Class211 arg2, @OriginalArg(3) Interface11 arg3) {
		this.aClass211_26 = arg2;
		this.aClass211_27 = arg1;
		this.anInterface11_1 = arg3;
		if (this.aClass211_27 != null) {
			this.anInt1729 = this.aClass211_27.method4365(1);
		}
		if (this.aClass211_26 != null) {
			this.anInt1725 = this.aClass211_26.method4365(1);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "([IIJLclient!ud;)Ljava/lang/String;")
	public String method1410(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class245 arg2) {
		if (this.anInterface11_1 != null) {
			@Pc(14) String local14 = this.anInterface11_1.method273(arg2, arg1, arg0);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg1);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)Lclient!uj;")
	public Class4_Sub2_Sub18 method1411(@OriginalArg(0) int arg0) {
		@Pc(11) Class4_Sub2_Sub18 local11 = (Class4_Sub2_Sub18) this.aClass137_15.method2744((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29;
		if (arg0 >= 32768) {
			local29 = this.aClass211_26.method4377(1, arg0 & 0x7FFF);
		} else {
			local29 = this.aClass211_27.method4377(1, arg0);
		}
		local11 = new Class4_Sub2_Sub18();
		local11.aClass66_2 = this;
		if (local29 != null) {
			local11.method5546(new Class4_Sub9(local29));
		}
		if (arg0 >= 32768) {
			local11.method5550();
		}
		this.aClass137_15.method2732((long) arg0, local11);
		return local11;
	}
}
