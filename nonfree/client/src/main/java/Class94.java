import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class94 {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "Lclient!si;")
	private final Class338 aClass338_8 = new Class338(64);

	@OriginalMember(owner = "client!ek", name = "j", descriptor = "Lclient!lb;")
	private final Class221 aClass221_38;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;)V")
	public Class94(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2) {
		this.aClass221_38 = arg2;
		if (this.aClass221_38 != null) {
			this.aClass221_38.method5065(35);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Lclient!kj;")
	public Class207 method2425(@OriginalArg(0) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_8;
		@Pc(16) Class207 local16;
		synchronized (this.aClass338_8) {
			local16 = (Class207) this.aClass338_8.method8049((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class221 local30 = this.aClass221_38;
		@Pc(39) byte[] local39;
		synchronized (this.aClass221_38) {
			local39 = this.aClass221_38.method5089(arg0, 35);
		}
		local16 = new Class207();
		if (local39 != null) {
			local16.method4989(new Class3_Sub28(local39));
		}
		local16.method4986();
		@Pc(74) Class338 local74 = this.aClass338_8;
		synchronized (this.aClass338_8) {
			this.aClass338_8.method8044((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	public void method2429() {
		@Pc(10) Class338 local10 = this.aClass338_8;
		synchronized (this.aClass338_8) {
			this.aClass338_8.method8051();
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)V")
	public void method2430() {
		@Pc(15) Class338 local15 = this.aClass338_8;
		synchronized (this.aClass338_8) {
			this.aClass338_8.method8052(5);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
	public void method2431() {
		@Pc(12) Class338 local12 = this.aClass338_8;
		synchronized (this.aClass338_8) {
			this.aClass338_8.method8047();
		}
	}
}
