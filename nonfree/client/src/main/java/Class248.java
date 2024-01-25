import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class248 {

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
	public int anInt6843 = 0;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
	public int anInt6844 = 0;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "Lclient!wm;")
	private final Class267 aClass267_76 = new Class267(64);

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "Lclient!jm;")
	private Interface6 anInterface6_1 = null;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Lclient!ph;")
	private final Class187 aClass187_119;

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "Lclient!ph;")
	private final Class187 aClass187_120;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(ILclient!ph;Lclient!ph;Lclient!jm;)V")
	public Class248(@OriginalArg(0) int arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) Class187 arg2, @OriginalArg(3) Interface6 arg3) {
		this.aClass187_119 = arg1;
		this.aClass187_120 = arg2;
		this.anInterface6_1 = arg3;
		if (this.aClass187_119 != null) {
			this.anInt6843 = this.aClass187_119.method4306(1);
		}
		if (this.aClass187_120 != null) {
			this.anInt6844 = this.aClass187_120.method4306(1);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(JILclient!je;[I)Ljava/lang/String;")
	public String method5370(@OriginalArg(0) long arg0, @OriginalArg(2) Class127 arg1, @OriginalArg(3) int[] arg2) {
		if (this.anInterface6_1 != null) {
			@Pc(21) String local21 = this.anInterface6_1.method337(arg1, arg0, arg2);
			if (local21 != null) {
				return local21;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Lclient!nl;")
	public Class10_Sub1_Sub12 method5371(@OriginalArg(0) int arg0) {
		@Pc(13) Class10_Sub1_Sub12 local13 = (Class10_Sub1_Sub12) this.aClass267_76.method6014((long) arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(31) byte[] local31;
		if (arg0 >= 32768) {
			local31 = this.aClass187_120.method4300(1, arg0 & 0x7FFF);
		} else {
			local31 = this.aClass187_119.method4300(1, arg0);
		}
		local13 = new Class10_Sub1_Sub12();
		local13.aClass248_2 = this;
		if (local31 != null) {
			local13.method3861(new Class10_Sub8(local31));
		}
		if (arg0 >= 32768) {
			local13.method3856();
		}
		this.aClass267_76.method6008(local13, (long) arg0);
		return local13;
	}
}
