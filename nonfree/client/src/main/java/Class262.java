import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class262 {

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
	public int anInt7398 = 0;

	@OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
	public int anInt7399 = 0;

	@OriginalMember(owner = "client!vu", name = "j", descriptor = "Lclient!jv;")
	private final Class126 aClass126_61 = new Class126(64);

	@OriginalMember(owner = "client!vu", name = "k", descriptor = "Lclient!im;")
	private Interface3 anInterface3_1 = null;

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "Lclient!bu;")
	private final Class32 aClass32_89;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "Lclient!bu;")
	private final Class32 aClass32_88;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(ILclient!bu;Lclient!bu;Lclient!im;)V")
	public Class262(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) Interface3 arg3) {
		this.anInterface3_1 = arg3;
		this.aClass32_89 = arg1;
		this.aClass32_88 = arg2;
		if (this.aClass32_89 != null) {
			this.anInt7399 = this.aClass32_89.method790(1);
		}
		if (this.aClass32_88 != null) {
			this.anInt7398 = this.aClass32_88.method790(1);
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(J[IILclient!ef;)Ljava/lang/String;")
	public String method5747(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class61 arg2) {
		if (this.anInterface3_1 != null) {
			@Pc(20) String local20 = this.anInterface3_1.method4540(arg0, arg2, arg1);
			if (local20 != null) {
				return local20;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZI)Lclient!uc;")
	public Class3_Sub4_Sub15 method5748(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub4_Sub15 local11 = (Class3_Sub4_Sub15) this.aClass126_61.method3141((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = this.aClass32_89.method785(arg0, 1);
		} else {
			local25 = this.aClass32_88.method785(arg0 & 0x7FFF, 1);
		}
		local11 = new Class3_Sub4_Sub15();
		local11.aClass262_2 = this;
		if (local25 != null) {
			local11.method5176(new Class3_Sub7(local25));
		}
		if (arg0 >= 32768) {
			local11.method5184();
		}
		this.aClass126_61.method3132((long) arg0, local11);
		return local11;
	}
}
