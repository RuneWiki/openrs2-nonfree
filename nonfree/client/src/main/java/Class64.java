import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class64 {

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "Lclient!pa;")
	private final Class265 aClass265_3 = new Class265(16);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "Lclient!cb;")
	private final Class50 aClass50_22;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;)V")
	public Class64(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2) {
		this.aClass50_22 = arg2;
		this.aClass50_22.method913(29);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)Lclient!vk;")
	private Class377 method1288(@OriginalArg(1) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_3;
		@Pc(16) Class377 local16;
		synchronized (this.aClass265_3) {
			local16 = (Class377) this.aClass265_3.method6577((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class50 local29 = this.aClass50_22;
		@Pc(38) byte[] local38;
		synchronized (this.aClass50_22) {
			local38 = this.aClass50_22.method916(arg0, 29);
		}
		local16 = new Class377();
		if (local38 != null) {
			local16.method8432(new Class5_Sub15(local38));
		}
		@Pc(60) Class265 local60 = this.aClass265_3;
		synchronized (this.aClass265_3) {
			this.aClass265_3.method6566(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V")
	public void method1289() {
		@Pc(8) Class265 local8 = this.aClass265_3;
		synchronized (this.aClass265_3) {
			this.aClass265_3.method6570(5);
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V")
	public void method1291() {
		@Pc(11) Class265 local11 = this.aClass265_3;
		synchronized (this.aClass265_3) {
			this.aClass265_3.method6573();
		}
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V")
	public void method1292() {
		@Pc(2) Class265 local2 = this.aClass265_3;
		synchronized (this.aClass265_3) {
			this.aClass265_3.method6568();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIILclient!qh;II)Lclient!fj;")
	public Class116 method1294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class286 arg3, @OriginalArg(5) int arg4) {
		@Pc(5) Class336[] local5 = null;
		@Pc(15) Class377 local15 = this.method1288(arg0);
		if (local15.anIntArray579 != null) {
			local5 = new Class336[local15.anIntArray579.length];
			for (@Pc(25) int local25 = 0; local25 < local5.length; local25++) {
				@Pc(34) Class266 local34 = arg3.method7024(local15.anIntArray579[local25]);
				local5[local25] = new Class336(local34.anInt7756, local34.anInt7754, local34.anInt7755, local34.anInt7752, local34.anInt7748, local34.anInt7758, local34.anInt7757, local34.aBoolean566);
			}
		}
		return new Class116(local15.anInt10116, local5, local15.anInt10115, arg4, arg2, arg1);
	}
}
