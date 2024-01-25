import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class237 {

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "Lclient!qj;")
	private final Class295 aClass295_41 = new Class295(64);

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "Lclient!uq;")
	private final Class362 aClass362_82;

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
	public final int anInt6393;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;)V")
	public Class237(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2) {
		this.aClass362_82 = arg2;
		if (this.aClass362_82 == null) {
			this.anInt6393 = 0;
		} else {
			this.anInt6393 = this.aClass362_82.method8355(16);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V")
	public void method5371() {
		@Pc(6) Class295 local6 = this.aClass295_41;
		synchronized (this.aClass295_41) {
			this.aClass295_41.method6462(5);
		}
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
	public void method5373() {
		@Pc(6) Class295 local6 = this.aClass295_41;
		synchronized (this.aClass295_41) {
			this.aClass295_41.method6474();
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BI)Lclient!no;")
	public Class253 method5374(@OriginalArg(1) int arg0) {
		@Pc(6) Class295 local6 = this.aClass295_41;
		@Pc(16) Class253 local16;
		synchronized (this.aClass295_41) {
			local16 = (Class253) this.aClass295_41.method6470((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class362 local29 = this.aClass362_82;
		@Pc(38) byte[] local38;
		synchronized (this.aClass362_82) {
			local38 = this.aClass362_82.method8368(16, arg0);
		}
		local16 = new Class253();
		if (local38 != null) {
			local16.method5608(new Class3_Sub4(local38));
		}
		@Pc(67) Class295 local67 = this.aClass295_41;
		synchronized (this.aClass295_41) {
			this.aClass295_41.method6469((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V")
	public void method5377() {
		@Pc(2) Class295 local2 = this.aClass295_41;
		synchronized (this.aClass295_41) {
			this.aClass295_41.method6464();
		}
	}
}
