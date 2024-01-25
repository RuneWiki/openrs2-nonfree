import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class75 {

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
	public int anInt2421 = 0;

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
	public int anInt2422 = 0;

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "Lclient!ge;")
	private final Class83 aClass83_19 = new Class83(64);

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "Lclient!ke;")
	private Interface3 anInterface3_1 = null;

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "Lclient!ci;")
	private final Class38 aClass38_25;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "Lclient!ci;")
	private final Class38 aClass38_24;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(ILclient!ci;Lclient!ci;Lclient!ke;)V")
	public Class75(@OriginalArg(0) int arg0, @OriginalArg(1) Class38 arg1, @OriginalArg(2) Class38 arg2, @OriginalArg(3) Interface3 arg3) {
		this.aClass38_25 = arg2;
		this.anInterface3_1 = arg3;
		this.aClass38_24 = arg1;
		if (this.aClass38_24 != null) {
			this.anInt2421 = this.aClass38_24.method1032(1);
		}
		if (this.aClass38_25 != null) {
			this.anInt2422 = this.aClass38_25.method1032(1);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!vr;[IJI)Ljava/lang/String;")
	public String method2198(@OriginalArg(0) Class266 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface3_1 != null) {
			@Pc(24) String local24 = this.anInterface3_1.method6056(arg2, arg0, arg1);
			if (local24 != null) {
				return local24;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)Lclient!bp;")
	public Class4_Sub1_Sub4 method2200(@OriginalArg(1) int arg0) {
		@Pc(11) Class4_Sub1_Sub4 local11 = (Class4_Sub1_Sub4) this.aClass83_19.method2338((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass38_25.method1039(arg0 & 0x7FFF, 1);
		} else {
			local27 = this.aClass38_24.method1039(arg0, 1);
		}
		local11 = new Class4_Sub1_Sub4();
		local11.aClass75_1 = this;
		if (local27 != null) {
			local11.method471(new Class4_Sub20(local27));
		}
		if (arg0 >= 32768) {
			local11.method473();
		}
		this.aClass83_19.method2337(local11, (long) arg0);
		return local11;
	}
}
