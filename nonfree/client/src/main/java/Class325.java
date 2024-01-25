import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class325 {

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "Lclient!rl;")
	private final Class317 aClass317_59 = new Class317(64);

	@OriginalMember(owner = "client!rw", name = "i", descriptor = "Lclient!rg;")
	private final Class310 aClass310_107;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;)V")
	public Class325(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2) {
		this.aClass310_107 = arg2;
		if (this.aClass310_107 != null) {
			this.aClass310_107.method7773(35);
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Z)V")
	public void method7955() {
		@Pc(13) Class317 local13 = this.aClass317_59;
		synchronized (this.aClass317_59) {
			this.aClass317_59.method7874();
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V")
	public void method7956() {
		@Pc(6) Class317 local6 = this.aClass317_59;
		synchronized (this.aClass317_59) {
			this.aClass317_59.method7873();
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IZ)V")
	public void method7957() {
		@Pc(2) Class317 local2 = this.aClass317_59;
		synchronized (this.aClass317_59) {
			this.aClass317_59.method7870(5);
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)Lclient!ae;")
	public Class9 method7960(@OriginalArg(0) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_59;
		@Pc(16) Class9 local16;
		synchronized (this.aClass317_59) {
			local16 = (Class9) this.aClass317_59.method7882((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class310 local30 = this.aClass310_107;
		@Pc(39) byte[] local39;
		synchronized (this.aClass310_107) {
			local39 = this.aClass310_107.method7803(arg0, 35);
		}
		local16 = new Class9();
		if (local39 != null) {
			local16.method98(new Class14_Sub21(local39));
		}
		local16.method99();
		@Pc(74) Class317 local74 = this.aClass317_59;
		synchronized (this.aClass317_59) {
			this.aClass317_59.method7875((long) arg0, local16);
			return local16;
		}
	}
}
