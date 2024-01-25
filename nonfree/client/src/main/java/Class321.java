import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rja")
public final class Class321 {

	@OriginalMember(owner = "client!rja", name = "e", descriptor = "Lclient!si;")
	private final Class338 aClass338_49 = new Class338(256);

	@OriginalMember(owner = "client!rja", name = "b", descriptor = "Lclient!lb;")
	private final Class221 aClass221_139;

	@OriginalMember(owner = "client!rja", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;)V")
	public Class321(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2) {
		this.aClass221_139 = arg2;
		this.aClass221_139.method5065(26);
	}

	@OriginalMember(owner = "client!rja", name = "b", descriptor = "(II)V")
	public void method7783() {
		@Pc(12) Class338 local12 = this.aClass338_49;
		synchronized (this.aClass338_49) {
			this.aClass338_49.method8052(5);
		}
	}

	@OriginalMember(owner = "client!rja", name = "b", descriptor = "(B)V")
	public void method7785() {
		@Pc(2) Class338 local2 = this.aClass338_49;
		synchronized (this.aClass338_49) {
			this.aClass338_49.method8047();
		}
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(II)Lclient!ho;")
	public Class3_Sub4_Sub11 method7786(@OriginalArg(0) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_49;
		@Pc(16) Class3_Sub4_Sub11 local16;
		synchronized (this.aClass338_49) {
			local16 = (Class3_Sub4_Sub11) this.aClass338_49.method8049((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class221 local30 = this.aClass221_139;
		@Pc(39) byte[] local39;
		synchronized (this.aClass221_139) {
			local39 = this.aClass221_139.method5089(arg0, 26);
		}
		local16 = new Class3_Sub4_Sub11();
		if (local39 != null) {
			local16.method3931(new Class3_Sub28(local39));
		}
		@Pc(70) Class338 local70 = this.aClass338_49;
		synchronized (this.aClass338_49) {
			this.aClass338_49.method8044((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(B)V")
	public void method7787() {
		@Pc(2) Class338 local2 = this.aClass338_49;
		synchronized (this.aClass338_49) {
			this.aClass338_49.method8051();
		}
	}
}
