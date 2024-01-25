import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class208 {

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "Lclient!qj;")
	private Class295 aClass295_31 = new Class295(64);

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "Lclient!qj;")
	public Class295 aClass295_32 = new Class295(64);

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "Lclient!uq;")
	public final Class362 aClass362_70;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "Lclient!uq;")
	private final Class362 aClass362_69;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;Lclient!uq;)V")
	public Class208(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2, @OriginalArg(3) Class362 arg3) {
		this.aClass362_70 = arg3;
		this.aClass362_69 = arg2;
		this.aClass362_69.method8355(34);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	public void method4943() {
		@Pc(6) Class295 local6 = this.aClass295_31;
		synchronized (this.aClass295_31) {
			this.aClass295_31.method6464();
		}
		local6 = this.aClass295_32;
		synchronized (this.aClass295_32) {
			this.aClass295_32.method6464();
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
	public void method4944() {
		@Pc(2) Class295 local2 = this.aClass295_31;
		synchronized (this.aClass295_31) {
			this.aClass295_31.method6462(5);
		}
		local2 = this.aClass295_32;
		synchronized (this.aClass295_32) {
			this.aClass295_32.method6462(5);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)Lclient!nea;")
	public Class245 method4945(@OriginalArg(1) int arg0) {
		@Pc(11) Class295 local11 = this.aClass295_31;
		@Pc(21) Class245 local21;
		synchronized (this.aClass295_31) {
			local21 = (Class245) this.aClass295_31.method6470((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class362 local34 = this.aClass362_69;
		@Pc(43) byte[] local43;
		synchronized (this.aClass362_69) {
			local43 = this.aClass362_69.method8368(34, arg0);
		}
		local21 = new Class245();
		local21.aClass208_6 = this;
		if (local43 != null) {
			local21.method5494(new Class3_Sub4(local43));
		}
		@Pc(70) Class295 local70 = this.aClass295_31;
		synchronized (this.aClass295_31) {
			this.aClass295_31.method6469((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	public void method4946() {
		@Pc(6) Class295 local6 = this.aClass295_31;
		synchronized (this.aClass295_31) {
			this.aClass295_31.method6474();
		}
		local6 = this.aClass295_32;
		synchronized (this.aClass295_32) {
			this.aClass295_32.method6474();
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)V")
	public void method4948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass295_31 = new Class295(arg1);
		this.aClass295_32 = new Class295(arg0);
	}
}
