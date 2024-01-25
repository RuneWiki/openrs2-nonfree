import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class278 {

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
	public int anInt7948 = 0;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
	public int anInt7947 = 0;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_61 = new Class288(64);

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "Lclient!wh;")
	private Interface20 anInterface20_1 = null;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "Lclient!gp;")
	private final Class117 aClass117_196;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "Lclient!gp;")
	private final Class117 aClass117_195;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(ILclient!gp;Lclient!gp;Lclient!wh;)V")
	public Class278(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) Interface20 arg3) {
		this.aClass117_196 = arg2;
		this.aClass117_195 = arg1;
		this.anInterface20_1 = arg3;
		if (this.aClass117_195 != null) {
			this.anInt7948 = this.aClass117_195.method2951(1);
		}
		if (this.aClass117_196 != null) {
			this.anInt7947 = this.aClass117_196.method2951(1);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([ILclient!io;JZ)Ljava/lang/String;")
	public String method6454(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class148 arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface20_1 != null) {
			@Pc(19) String local19 = this.anInterface20_1.method7291(arg0, arg1, arg2);
			if (local19 != null) {
				return local19;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Lclient!dm;")
	public Class5_Sub2_Sub10 method6455(@OriginalArg(1) int arg0) {
		@Pc(11) Class5_Sub2_Sub10 local11 = (Class5_Sub2_Sub10) this.aClass288_61.method6745((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = this.aClass117_195.method2962(arg0, 1);
		} else {
			local25 = this.aClass117_196.method2962(arg0 & 0x7FFF, 1);
		}
		local11 = new Class5_Sub2_Sub10();
		local11.aClass278_1 = this;
		if (local25 != null) {
			local11.method1996(new Class5_Sub3(local25));
		}
		if (arg0 >= 32768) {
			local11.method2000();
		}
		this.aClass288_61.method6746(local11, (long) arg0);
		return local11;
	}
}
