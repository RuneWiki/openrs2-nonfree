import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class389 {

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!rl;")
	private final Class317 aClass317_70 = new Class317(64);

	@OriginalMember(owner = "client!we", name = "a", descriptor = "I")
	public int anInt10948 = 0;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Lclient!rg;")
	private final Class310 aClass310_136;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "I")
	public final int anInt10941;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;)V")
	public Class389(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2) {
		this.aClass310_136 = arg2;
		this.anInt10941 = this.aClass310_136.method7773(4);
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(II)Lclient!ada;")
	public Class8 method9284(@OriginalArg(1) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_70;
		@Pc(16) Class8 local16;
		synchronized (this.aClass317_70) {
			local16 = (Class8) this.aClass317_70.method7882((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class310 local30 = this.aClass310_136;
		@Pc(41) byte[] local41;
		synchronized (this.aClass310_136) {
			local41 = this.aClass310_136.method7803(arg0, 4);
		}
		local16 = new Class8();
		local16.aClass389_1 = this;
		local16.anInt70 = arg0;
		if (local41 != null) {
			local16.method94(new Class14_Sub21(local41));
		}
		local16.method95();
		@Pc(82) Class317 local82 = this.aClass317_70;
		synchronized (this.aClass317_70) {
			this.aClass317_70.method7875((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
	public void method9285() {
		@Pc(6) Class317 local6 = this.aClass317_70;
		synchronized (this.aClass317_70) {
			this.aClass317_70.method7873();
		}
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(II)V")
	public void method9286() {
		@Pc(2) Class317 local2 = this.aClass317_70;
		synchronized (this.aClass317_70) {
			this.aClass317_70.method7870(5);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public void method9287() {
		@Pc(6) Class317 local6 = this.aClass317_70;
		synchronized (this.aClass317_70) {
			this.aClass317_70.method7874();
		}
	}
}
