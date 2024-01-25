import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class179 {

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
	public int anInt4983 = 0;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
	public int anInt4986 = 0;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "Lclient!of;")
	private final Class188 aClass188_41 = new Class188(64);

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "Lclient!cb;")
	private Interface1 anInterface1_1 = null;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "Lclient!mn;")
	private final Class171 aClass171_65;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "Lclient!mn;")
	private final Class171 aClass171_66;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(ILclient!mn;Lclient!mn;Lclient!cb;)V")
	public Class179(@OriginalArg(0) int arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Interface1 arg3) {
		this.aClass171_65 = arg2;
		this.anInterface1_1 = arg3;
		this.aClass171_66 = arg1;
		if (this.aClass171_66 != null) {
			this.anInt4983 = this.aClass171_66.method3662(1);
		}
		if (this.aClass171_65 != null) {
			this.anInt4986 = this.aClass171_65.method3662(1);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B[IJLclient!cg;)Ljava/lang/String;")
	public String method3926(@OriginalArg(1) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class37 arg2) {
		if (this.anInterface1_1 != null) {
			@Pc(24) String local24 = this.anInterface1_1.method6030(arg1, arg2, arg0);
			if (local24 != null) {
				return local24;
			}
		}
		return Long.toString(arg1);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZI)Lclient!ac;")
	public Class2_Sub1_Sub2 method3930(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub1_Sub2 local11 = (Class2_Sub1_Sub2) this.aClass188_41.method4158((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(33) byte[] local33;
		if (arg0 < 32768) {
			local33 = this.aClass171_66.method3658(1, arg0);
		} else {
			local33 = this.aClass171_65.method3658(1, arg0 & 0x7FFF);
		}
		local11 = new Class2_Sub1_Sub2();
		local11.aClass179_1 = this;
		if (local33 != null) {
			local11.method46(new Class2_Sub17(local33));
		}
		if (arg0 >= 32768) {
			local11.method48();
		}
		this.aClass188_41.method4155((long) arg0, local11);
		return local11;
	}
}
