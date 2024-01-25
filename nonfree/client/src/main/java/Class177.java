import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class177 {

	@OriginalMember(owner = "client!io", name = "f", descriptor = "Lclient!si;")
	private final Class338 aClass338_25 = new Class338(64);

	@OriginalMember(owner = "client!io", name = "k", descriptor = "Lclient!si;")
	private final Class338 aClass338_26 = new Class338(100);

	@OriginalMember(owner = "client!io", name = "j", descriptor = "Lclient!lb;")
	private final Class221 aClass221_85;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;Lclient!lb;Lclient!lb;)V")
	public Class177(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2, @OriginalArg(3) Class221 arg3, @OriginalArg(4) Class221 arg4) {
		this.aClass221_85 = arg2;
		if (this.aClass221_85 != null) {
			@Pc(26) int local26 = this.aClass221_85.method5080() - 1;
			this.aClass221_85.method5065(local26);
		}
		Static667.method8876(arg3, arg4);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(II)Lclient!bg;")
	public Class26 method4259(@OriginalArg(0) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_25;
		@Pc(16) Class26 local16;
		synchronized (this.aClass338_25) {
			local16 = (Class26) this.aClass338_25.method8049((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class221 local30 = this.aClass221_85;
		@Pc(45) byte[] local45;
		synchronized (this.aClass221_85) {
			local45 = this.aClass221_85.method5089(Static78.method1014(arg0), Static316.method5356(arg0));
		}
		local16 = new Class26();
		local16.anInt777 = arg0;
		if (local45 != null) {
			local16.method611(new Class3_Sub28(local45));
		}
		local16.method609();
		@Pc(81) Class338 local81 = this.aClass338_25;
		synchronized (this.aClass338_25) {
			this.aClass338_25.method8044((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V")
	public void method4260() {
		@Pc(2) Class338 local2 = this.aClass338_25;
		synchronized (this.aClass338_25) {
			this.aClass338_25.method8051();
		}
		local2 = this.aClass338_26;
		synchronized (this.aClass338_26) {
			this.aClass338_26.method8051();
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V")
	public void method4261() {
		@Pc(6) Class338 local6 = this.aClass338_25;
		synchronized (this.aClass338_25) {
			this.aClass338_25.method8052(5);
		}
		local6 = this.aClass338_26;
		synchronized (this.aClass338_26) {
			this.aClass338_26.method8052(5);
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	public void method4262() {
		@Pc(14) Class338 local14 = this.aClass338_25;
		synchronized (this.aClass338_25) {
			this.aClass338_25.method8047();
		}
		local14 = this.aClass338_26;
		synchronized (this.aClass338_26) {
			this.aClass338_26.method8047();
		}
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(II)Lclient!pha;")
	public Class3_Sub4_Sub15 method4265(@OriginalArg(1) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_26;
		synchronized (this.aClass338_26) {
			@Pc(16) Class3_Sub4_Sub15 local16 = (Class3_Sub4_Sub15) this.aClass338_26.method8049((long) arg0);
			if (local16 == null) {
				local16 = new Class3_Sub4_Sub15(arg0);
				this.aClass338_26.method8044((long) arg0, local16);
			}
			return local16.method7090() ? local16 : null;
		}
	}
}
