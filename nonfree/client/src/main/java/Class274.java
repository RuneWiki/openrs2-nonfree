import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class274 {

	@OriginalMember(owner = "client!om", name = "e", descriptor = "Lclient!rl;")
	private Class317 aClass317_48 = new Class317(128);

	@OriginalMember(owner = "client!om", name = "f", descriptor = "Lclient!rl;")
	public Class317 aClass317_49 = new Class317(64);

	@OriginalMember(owner = "client!om", name = "k", descriptor = "Lclient!rg;")
	public final Class310 aClass310_94;

	@OriginalMember(owner = "client!om", name = "i", descriptor = "Lclient!rg;")
	private final Class310 aClass310_95;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;Lclient!rg;)V")
	public Class274(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2, @OriginalArg(3) Class310 arg3) {
		this.aClass310_94 = arg3;
		this.aClass310_95 = arg2;
		this.aClass310_95.method7773(36);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
	public void method6611() {
		@Pc(6) Class317 local6 = this.aClass317_48;
		synchronized (this.aClass317_48) {
			this.aClass317_48.method7874();
		}
		local6 = this.aClass317_49;
		synchronized (this.aClass317_49) {
			this.aClass317_49.method7874();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZI)V")
	public void method6612(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass317_48 = new Class317(arg0);
		this.aClass317_49 = new Class317(arg1);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
	public void method6613() {
		@Pc(15) Class317 local15 = this.aClass317_48;
		synchronized (this.aClass317_48) {
			this.aClass317_48.method7870(5);
		}
		local15 = this.aClass317_49;
		synchronized (this.aClass317_49) {
			this.aClass317_49.method7870(5);
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)Lclient!hga;")
	public Class152 method6614(@OriginalArg(0) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_48;
		@Pc(16) Class152 local16;
		synchronized (this.aClass317_48) {
			local16 = (Class152) this.aClass317_48.method7882((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class310 local30 = this.aClass310_95;
		@Pc(39) byte[] local39;
		synchronized (this.aClass310_95) {
			local39 = this.aClass310_95.method7803(arg0, 36);
		}
		local16 = new Class152();
		local16.anInt4300 = arg0;
		local16.aClass274_5 = this;
		if (local39 != null) {
			local16.method3802(new Class14_Sub21(local39));
		}
		local16.method3797();
		@Pc(72) Class317 local72 = this.aClass317_48;
		synchronized (this.aClass317_48) {
			this.aClass317_48.method7875((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V")
	public void method6615() {
		@Pc(2) Class317 local2 = this.aClass317_48;
		synchronized (this.aClass317_48) {
			this.aClass317_48.method7873();
		}
		local2 = this.aClass317_49;
		synchronized (this.aClass317_49) {
			this.aClass317_49.method7873();
		}
	}
}
