import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class64 {

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "Lclient!qj;")
	private final Class295 aClass295_5 = new Class295(16);

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "Lclient!uq;")
	private final Class362 aClass362_18;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;)V")
	public Class64(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2) {
		this.aClass362_18 = arg2;
		this.aClass362_18.method8355(29);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
	public void method1498() {
		@Pc(6) Class295 local6 = this.aClass295_5;
		synchronized (this.aClass295_5) {
			this.aClass295_5.method6474();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BI)Lclient!bh;")
	private Class32 method1500(@OriginalArg(1) int arg0) {
		@Pc(6) Class295 local6 = this.aClass295_5;
		@Pc(16) Class32 local16;
		synchronized (this.aClass295_5) {
			local16 = (Class32) this.aClass295_5.method6470((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class362 local35 = this.aClass362_18;
		@Pc(44) byte[] local44;
		synchronized (this.aClass362_18) {
			local44 = this.aClass362_18.method8368(29, arg0);
		}
		local16 = new Class32();
		if (local44 != null) {
			local16.method799(new Class3_Sub4(local44));
		}
		@Pc(66) Class295 local66 = this.aClass295_5;
		synchronized (this.aClass295_5) {
			this.aClass295_5.method6469((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V")
	public void method1501() {
		@Pc(6) Class295 local6 = this.aClass295_5;
		synchronized (this.aClass295_5) {
			this.aClass295_5.method6462(5);
		}
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)V")
	public void method1502() {
		@Pc(6) Class295 local6 = this.aClass295_5;
		synchronized (this.aClass295_5) {
			this.aClass295_5.method6464();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!tc;IBII)Lclient!fp;")
	public Class118 method1503(@OriginalArg(0) int arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class121[] local7 = null;
		@Pc(12) Class32 local12 = this.method1500(arg2);
		if (local12.anIntArray53 != null) {
			local7 = new Class121[local12.anIntArray53.length];
			for (@Pc(22) int local22 = 0; local22 < local7.length; local22++) {
				@Pc(32) Class228 local32 = arg1.method7478(local12.anIntArray53[local22]);
				local7[local22] = new Class121(local32.anInt6251, local32.anInt6254, local32.anInt6250, local32.anInt6253, local32.anInt6258, local32.anInt6257, local32.anInt6252, local32.aBoolean437);
			}
		}
		return new Class118(local12.anInt894, local7, local12.anInt893, arg3, arg0, arg4);
	}
}
