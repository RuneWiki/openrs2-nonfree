import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class245 {

	@OriginalMember(owner = "client!us", name = "l", descriptor = "I")
	public int anInt7195 = 0;

	@OriginalMember(owner = "client!us", name = "m", descriptor = "I")
	public int anInt7196 = 0;

	@OriginalMember(owner = "client!us", name = "g", descriptor = "Lclient!ff;")
	private final Class83 aClass83_60 = new Class83(64);

	@OriginalMember(owner = "client!us", name = "o", descriptor = "Lclient!eg;")
	private Interface4 anInterface4_1 = null;

	@OriginalMember(owner = "client!us", name = "n", descriptor = "Lclient!vh;")
	private final Class250 aClass250_85;

	@OriginalMember(owner = "client!us", name = "e", descriptor = "Lclient!vh;")
	private final Class250 aClass250_84;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(ILclient!vh;Lclient!vh;Lclient!eg;)V")
	public Class245(@OriginalArg(0) int arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) Interface4 arg3) {
		this.aClass250_85 = arg2;
		this.aClass250_84 = arg1;
		this.anInterface4_1 = arg3;
		if (this.aClass250_84 != null) {
			this.anInt7196 = this.aClass250_84.method5653(1);
		}
		if (this.aClass250_85 != null) {
			this.anInt7195 = this.aClass250_85.method5653(1);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BI)Lclient!pm;")
	public Class1_Sub2_Sub14 method5566(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub2_Sub14 local11 = (Class1_Sub2_Sub14) this.aClass83_60.method1658((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(32) byte[] local32;
		if (arg0 < 32768) {
			local32 = this.aClass250_84.method5667(arg0, 1);
		} else {
			local32 = this.aClass250_85.method5667(arg0 & 0x7FFF, 1);
		}
		local11 = new Class1_Sub2_Sub14();
		local11.aClass245_2 = this;
		if (local32 != null) {
			local11.method4413(new Class1_Sub1(local32));
		}
		if (arg0 >= 32768) {
			local11.method4410();
		}
		this.aClass83_60.method1675((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BJLclient!tk;[I)Ljava/lang/String;")
	public String method5568(@OriginalArg(1) long arg0, @OriginalArg(2) Class225 arg1, @OriginalArg(3) int[] arg2) {
		if (this.anInterface4_1 != null) {
			@Pc(22) String local22 = this.anInterface4_1.method3893(arg0, arg1, arg2);
			if (local22 != null) {
				return local22;
			}
		}
		return Long.toString(arg0);
	}
}
