import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lea")
public final class Class227 {

	@OriginalMember(owner = "client!lea", name = "g", descriptor = "Lclient!si;")
	private final Class338 aClass338_33 = new Class338(64);

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "Lclient!lb;")
	private final Class221 aClass221_101;

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;)V")
	public Class227(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2) {
		this.aClass221_101 = arg2;
		if (this.aClass221_101 != null) {
			this.aClass221_101.method5065(54);
		}
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)V")
	public void method5134() {
		@Pc(6) Class338 local6 = this.aClass338_33;
		synchronized (this.aClass338_33) {
			this.aClass338_33.method8051();
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(II)V")
	public void method5135() {
		@Pc(6) Class338 local6 = this.aClass338_33;
		synchronized (this.aClass338_33) {
			this.aClass338_33.method8052(5);
		}
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "(I)V")
	public void method5138() {
		@Pc(6) Class338 local6 = this.aClass338_33;
		synchronized (this.aClass338_33) {
			this.aClass338_33.method8047();
		}
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(II)Lclient!nga;")
	public Class253 method5139(@OriginalArg(1) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_33;
		@Pc(25) Class253 local25;
		synchronized (this.aClass338_33) {
			local25 = (Class253) this.aClass338_33.method8049((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(39) Class221 local39 = this.aClass221_101;
		@Pc(50) byte[] local50;
		synchronized (this.aClass221_101) {
			local50 = this.aClass221_101.method5089(arg0, 54);
		}
		local25 = new Class253();
		if (local50 != null) {
			local25.method6221(new Class3_Sub28(local50));
		}
		local6 = this.aClass338_33;
		synchronized (this.aClass338_33) {
			this.aClass338_33.method8044((long) arg0, local25);
			return local25;
		}
	}
}
