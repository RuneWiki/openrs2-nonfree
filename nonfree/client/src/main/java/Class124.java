import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class124 {

	@OriginalMember(owner = "client!g", name = "f", descriptor = "Lclient!si;")
	private final Class338 aClass338_18 = new Class338(128);

	@OriginalMember(owner = "client!g", name = "g", descriptor = "Lclient!lb;")
	private final Class221 aClass221_53;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;)V")
	public Class124(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2) {
		this.aClass221_53 = arg2;
		this.aClass221_53.method5065(1);
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public void method2960() {
		@Pc(2) Class338 local2 = this.aClass338_18;
		synchronized (this.aClass338_18) {
			this.aClass338_18.method8047();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lclient!hr;")
	public Class159 method2963(@OriginalArg(1) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_18;
		@Pc(16) Class159 local16;
		synchronized (this.aClass338_18) {
			local16 = (Class159) this.aClass338_18.method8049((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class221 local30 = this.aClass221_53;
		@Pc(39) byte[] local39;
		synchronized (this.aClass221_53) {
			local39 = this.aClass221_53.method5089(arg0, 1);
		}
		local16 = new Class159();
		if (local39 != null) {
			local16.method3965(new Class3_Sub28(local39));
		}
		@Pc(63) Class338 local63 = this.aClass338_18;
		synchronized (this.aClass338_18) {
			this.aClass338_18.method8044((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	public void method2964() {
		@Pc(6) Class338 local6 = this.aClass338_18;
		synchronized (this.aClass338_18) {
			this.aClass338_18.method8051();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)V")
	public void method2965() {
		@Pc(2) Class338 local2 = this.aClass338_18;
		synchronized (this.aClass338_18) {
			this.aClass338_18.method8052(5);
		}
	}
}
