import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iia")
public final class Class175 {

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "Lclient!rl;")
	private final Class317 aClass317_26 = new Class317(64);

	@OriginalMember(owner = "client!iia", name = "i", descriptor = "Lclient!rg;")
	private final Class310 aClass310_58;

	@OriginalMember(owner = "client!iia", name = "e", descriptor = "Lclient!wv;")
	public final Class400 aClass400_1;

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;Lclient!wv;)V")
	public Class175(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2, @OriginalArg(3) Class400 arg3) {
		this.aClass310_58 = arg2;
		this.aClass310_58.method7773(32);
		this.aClass400_1 = arg3;
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(II)V")
	public void method4253() {
		@Pc(2) Class317 local2 = this.aClass317_26;
		synchronized (this.aClass317_26) {
			this.aClass317_26.method7870(5);
		}
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)V")
	public void method4254() {
		@Pc(2) Class317 local2 = this.aClass317_26;
		synchronized (this.aClass317_26) {
			this.aClass317_26.method7874();
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(B)V")
	public void method4256() {
		@Pc(2) Class317 local2 = this.aClass317_26;
		synchronized (this.aClass317_26) {
			this.aClass317_26.method7873();
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(II)Lclient!gs;")
	public Class141 method4257(@OriginalArg(1) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_26;
		@Pc(16) Class141 local16;
		synchronized (this.aClass317_26) {
			local16 = (Class141) this.aClass317_26.method7882((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class310 local30 = this.aClass310_58;
		@Pc(39) byte[] local39;
		synchronized (this.aClass310_58) {
			local39 = this.aClass310_58.method7803(arg0, 32);
		}
		local16 = new Class141();
		local16.aClass175_2 = this;
		if (local39 != null) {
			local16.method3040(new Class14_Sub21(local39));
		}
		@Pc(66) Class317 local66 = this.aClass317_26;
		synchronized (this.aClass317_26) {
			this.aClass317_26.method7875((long) arg0, local16);
			return local16;
		}
	}
}
