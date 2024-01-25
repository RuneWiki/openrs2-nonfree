import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class379 {

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "Lclient!rl;")
	private final Class317 aClass317_69 = new Class317(64);

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "Lclient!rg;")
	private final Class310 aClass310_130;

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
	public final int anInt10685;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;)V")
	public Class379(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2) {
		this.aClass310_130 = arg2;
		if (this.aClass310_130 == null) {
			this.anInt10685 = 0;
		} else {
			this.anInt10685 = this.aClass310_130.method7773(16);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)Lclient!hea;")
	public Class149 method9125(@OriginalArg(0) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_69;
		@Pc(16) Class149 local16;
		synchronized (this.aClass317_69) {
			local16 = (Class149) this.aClass317_69.method7882((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class310 local30 = this.aClass310_130;
		@Pc(39) byte[] local39;
		synchronized (this.aClass310_130) {
			local39 = this.aClass310_130.method7803(arg0, 16);
		}
		local16 = new Class149();
		if (local39 != null) {
			local16.method3743(new Class14_Sub21(local39));
		}
		@Pc(63) Class317 local63 = this.aClass317_69;
		synchronized (this.aClass317_69) {
			this.aClass317_69.method7875((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	public void method9126() {
		@Pc(6) Class317 local6 = this.aClass317_69;
		synchronized (this.aClass317_69) {
			this.aClass317_69.method7873();
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
	public void method9127() {
		@Pc(6) Class317 local6 = this.aClass317_69;
		synchronized (this.aClass317_69) {
			this.aClass317_69.method7874();
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)V")
	public void method9128() {
		@Pc(2) Class317 local2 = this.aClass317_69;
		synchronized (this.aClass317_69) {
			this.aClass317_69.method7870(5);
		}
	}
}
