import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class106 {

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Lclient!si;")
	private final Class338 aClass338_11 = new Class338(64);

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Lclient!lb;")
	private final Class221 aClass221_44;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;)V")
	public Class106(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2) {
		this.aClass221_44 = arg2;
		if (this.aClass221_44 != null) {
			this.aClass221_44.method5065(11);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public void method2675() {
		@Pc(2) Class338 local2 = this.aClass338_11;
		synchronized (this.aClass338_11) {
			this.aClass338_11.method8051();
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V")
	public void method2676() {
		@Pc(6) Class338 local6 = this.aClass338_11;
		synchronized (this.aClass338_11) {
			this.aClass338_11.method8052(5);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Lclient!ria;")
	public Class319 method2677(@OriginalArg(1) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_11;
		@Pc(16) Class319 local16;
		synchronized (this.aClass338_11) {
			local16 = (Class319) this.aClass338_11.method8049((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class221 local30 = this.aClass221_44;
		@Pc(41) byte[] local41;
		synchronized (this.aClass221_44) {
			local41 = this.aClass221_44.method5089(arg0, 11);
		}
		local16 = new Class319();
		if (local41 != null) {
			local16.method7776(new Class3_Sub28(local41));
		}
		@Pc(65) Class338 local65 = this.aClass338_11;
		synchronized (this.aClass338_11) {
			this.aClass338_11.method8044((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public void method2679() {
		@Pc(2) Class338 local2 = this.aClass338_11;
		synchronized (this.aClass338_11) {
			this.aClass338_11.method8047();
		}
	}
}
