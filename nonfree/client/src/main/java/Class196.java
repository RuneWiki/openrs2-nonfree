import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kia")
public final class Class196 {

	@OriginalMember(owner = "client!kia", name = "s", descriptor = "I")
	public int anInt5210;

	@OriginalMember(owner = "client!kia", name = "f", descriptor = "Lclient!qj;")
	private final Class295 aClass295_24 = new Class295(64);

	@OriginalMember(owner = "client!kia", name = "q", descriptor = "Lclient!qj;")
	public final Class295 aClass295_25 = new Class295(50);

	@OriginalMember(owner = "client!kia", name = "r", descriptor = "Lclient!qj;")
	public final Class295 aClass295_26 = new Class295(5);

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "Lclient!kw;")
	public final Class203 aClass203_5;

	@OriginalMember(owner = "client!kia", name = "d", descriptor = "Lclient!uq;")
	private final Class362 aClass362_62;

	@OriginalMember(owner = "client!kia", name = "i", descriptor = "Z")
	public boolean aBoolean344;

	@OriginalMember(owner = "client!kia", name = "o", descriptor = "Lclient!uq;")
	public final Class362 aClass362_63;

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lclient!kw;IZLclient!uq;Lclient!uq;)V")
	public Class196(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class362 arg3, @OriginalArg(4) Class362 arg4) {
		this.aClass203_5 = arg0;
		this.aClass362_62 = arg3;
		this.aBoolean344 = arg2;
		this.aClass362_63 = arg4;
		if (this.aClass362_62 != null) {
			@Pc(41) int local41 = this.aClass362_62.method8373() - 1;
			this.aClass362_62.method8355(local41);
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(I)V")
	public void method4471() {
		@Pc(2) Class295 local2 = this.aClass295_24;
		synchronized (this.aClass295_24) {
			this.aClass295_24.method6474();
		}
		local2 = this.aClass295_25;
		synchronized (this.aClass295_25) {
			this.aClass295_25.method6474();
		}
		local2 = this.aClass295_26;
		synchronized (this.aClass295_26) {
			this.aClass295_26.method6474();
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(II)V")
	public void method4472() {
		@Pc(6) Class295 local6 = this.aClass295_24;
		synchronized (this.aClass295_24) {
			this.aClass295_24.method6462(5);
		}
		local6 = this.aClass295_25;
		synchronized (this.aClass295_25) {
			this.aClass295_25.method6462(5);
		}
		local6 = this.aClass295_26;
		synchronized (this.aClass295_26) {
			this.aClass295_26.method6462(5);
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(BZ)V")
	public void method4473(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean344) {
			this.aBoolean344 = arg0;
			this.method4477();
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(B)V")
	public void method4475() {
		@Pc(2) Class295 local2 = this.aClass295_25;
		synchronized (this.aClass295_25) {
			this.aClass295_25.method6464();
		}
		local2 = this.aClass295_26;
		synchronized (this.aClass295_26) {
			this.aClass295_26.method6464();
		}
	}

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "(II)V")
	public void method4476(@OriginalArg(0) int arg0) {
		this.anInt5210 = arg0;
		@Pc(9) Class295 local9 = this.aClass295_25;
		synchronized (this.aClass295_25) {
			this.aClass295_25.method6464();
		}
		local9 = this.aClass295_26;
		synchronized (this.aClass295_26) {
			this.aClass295_26.method6464();
		}
	}

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "(I)V")
	public void method4477() {
		@Pc(8) Class295 local8 = this.aClass295_24;
		synchronized (this.aClass295_24) {
			this.aClass295_24.method6464();
		}
		local8 = this.aClass295_25;
		synchronized (this.aClass295_25) {
			this.aClass295_25.method6464();
		}
		local8 = this.aClass295_26;
		synchronized (this.aClass295_26) {
			this.aClass295_26.method6464();
		}
	}

	@OriginalMember(owner = "client!kia", name = "c", descriptor = "(II)Lclient!oaa;")
	public Class261 method4478(@OriginalArg(0) int arg0) {
		@Pc(6) Class295 local6 = this.aClass295_24;
		@Pc(16) Class261 local16;
		synchronized (this.aClass295_24) {
			local16 = (Class261) this.aClass295_24.method6470((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class362 local29 = this.aClass362_62;
		@Pc(42) byte[] local42;
		synchronized (this.aClass362_62) {
			local42 = this.aClass362_62.method8368(Static610.method8275(arg0), Static436.method5967(arg0));
		}
		local16 = new Class261();
		local16.aClass196_2 = this;
		local16.anInt6794 = arg0;
		if (local42 != null) {
			local16.method5768(new Class3_Sub4(local42));
		}
		local16.method5771();
		@Pc(79) Class295 local79 = this.aClass295_24;
		synchronized (this.aClass295_24) {
			this.aClass295_24.method6469((long) arg0, local16);
			return local16;
		}
	}
}
