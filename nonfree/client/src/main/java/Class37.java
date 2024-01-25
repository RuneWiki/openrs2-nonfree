import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class37 {

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "Lclient!qj;")
	private final Class295 aClass295_3 = new Class295(64);

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
	public int anInt1155 = 0;

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "Lclient!uq;")
	private final Class362 aClass362_11;

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
	public final int anInt1150;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;)V")
	public Class37(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2) {
		this.aClass362_11 = arg2;
		this.anInt1150 = this.aClass362_11.method8355(4);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZ)V")
	public void method1026() {
		@Pc(6) Class295 local6 = this.aClass295_3;
		synchronized (this.aClass295_3) {
			this.aClass295_3.method6462(5);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V")
	public void method1028() {
		@Pc(2) Class295 local2 = this.aClass295_3;
		synchronized (this.aClass295_3) {
			this.aClass295_3.method6474();
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)Lclient!mea;")
	public Class225 method1029(@OriginalArg(0) int arg0) {
		@Pc(6) Class295 local6 = this.aClass295_3;
		@Pc(16) Class225 local16;
		synchronized (this.aClass295_3) {
			local16 = (Class225) this.aClass295_3.method6470((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class362 local37 = this.aClass362_11;
		@Pc(46) byte[] local46;
		synchronized (this.aClass362_11) {
			local46 = this.aClass362_11.method8368(4, arg0);
		}
		local16 = new Class225();
		local16.aClass37_4 = this;
		local16.anInt6214 = arg0;
		if (local46 != null) {
			local16.method5250(new Class3_Sub4(local46));
		}
		local16.method5242();
		@Pc(77) Class295 local77 = this.aClass295_3;
		synchronized (this.aClass295_3) {
			this.aClass295_3.method6469((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V")
	public void method1030() {
		@Pc(2) Class295 local2 = this.aClass295_3;
		synchronized (this.aClass295_3) {
			this.aClass295_3.method6464();
		}
	}
}
