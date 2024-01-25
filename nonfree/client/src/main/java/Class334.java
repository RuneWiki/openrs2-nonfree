import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class334 {

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "Lclient!rl;")
	private Class317 aClass317_62 = new Class317(64);

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "Lclient!rl;")
	public Class317 aClass317_63 = new Class317(64);

	@OriginalMember(owner = "client!sl", name = "n", descriptor = "Lclient!rg;")
	public final Class310 aClass310_110;

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "Lclient!rg;")
	private final Class310 aClass310_109;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;Lclient!rg;)V")
	public Class334(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2, @OriginalArg(3) Class310 arg3) {
		this.aClass310_110 = arg3;
		this.aClass310_109 = arg2;
		this.aClass310_109.method7773(34);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IB)Lclient!hc;")
	public Class146 method8127(@OriginalArg(0) int arg0) {
		@Pc(13) Class317 local13 = this.aClass317_62;
		@Pc(25) Class146 local25;
		synchronized (this.aClass317_62) {
			local25 = (Class146) this.aClass317_62.method7882((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(39) Class310 local39 = this.aClass310_109;
		@Pc(48) byte[] local48;
		synchronized (this.aClass310_109) {
			local48 = this.aClass310_109.method7803(arg0, 34);
		}
		local25 = new Class146();
		local25.aClass334_4 = this;
		if (local48 != null) {
			local25.method3246(new Class14_Sub21(local48));
		}
		@Pc(75) Class317 local75 = this.aClass317_62;
		synchronized (this.aClass317_62) {
			this.aClass317_62.method7875((long) arg0, local25);
			return local25;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZI)V")
	public void method8128() {
		@Pc(2) Class317 local2 = this.aClass317_62;
		synchronized (this.aClass317_62) {
			this.aClass317_62.method7870(5);
		}
		local2 = this.aClass317_63;
		synchronized (this.aClass317_63) {
			this.aClass317_63.method7870(5);
		}
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V")
	public void method8129() {
		@Pc(6) Class317 local6 = this.aClass317_62;
		synchronized (this.aClass317_62) {
			this.aClass317_62.method7874();
		}
		local6 = this.aClass317_63;
		synchronized (this.aClass317_63) {
			this.aClass317_63.method7874();
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIB)V")
	public void method8131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass317_62 = new Class317(arg1);
		this.aClass317_63 = new Class317(arg0);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
	public void method8134() {
		@Pc(2) Class317 local2 = this.aClass317_62;
		synchronized (this.aClass317_62) {
			this.aClass317_62.method7873();
		}
		local2 = this.aClass317_63;
		synchronized (this.aClass317_63) {
			this.aClass317_63.method7873();
		}
	}
}
