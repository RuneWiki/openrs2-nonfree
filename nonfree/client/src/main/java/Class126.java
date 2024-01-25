import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class126 {

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "Lclient!si;")
	private final Class338 aClass338_20 = new Class338(16);

	@OriginalMember(owner = "client!gba", name = "d", descriptor = "Lclient!lb;")
	private final Class221 aClass221_57;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;)V")
	public Class126(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2) {
		this.aClass221_57 = arg2;
		this.aClass221_57.method5065(30);
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(II)Lclient!fma;")
	public Class119 method2988(@OriginalArg(0) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_20;
		@Pc(16) Class119 local16;
		synchronized (this.aClass338_20) {
			local16 = (Class119) this.aClass338_20.method8049((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) Class221 local38 = this.aClass221_57;
		@Pc(47) byte[] local47;
		synchronized (this.aClass221_57) {
			local47 = this.aClass221_57.method5089(arg0, 30);
		}
		local16 = new Class119();
		if (local47 != null) {
			local16.method2830(new Class3_Sub28(local47));
		}
		@Pc(71) Class338 local71 = this.aClass338_20;
		synchronized (this.aClass338_20) {
			this.aClass338_20.method8044((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V")
	public void method2989() {
		@Pc(6) Class338 local6 = this.aClass338_20;
		synchronized (this.aClass338_20) {
			this.aClass338_20.method8051();
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)V")
	public void method2991() {
		@Pc(2) Class338 local2 = this.aClass338_20;
		synchronized (this.aClass338_20) {
			this.aClass338_20.method8052(5);
		}
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V")
	public void method2992() {
		@Pc(6) Class338 local6 = this.aClass338_20;
		synchronized (this.aClass338_20) {
			this.aClass338_20.method8047();
		}
	}
}
