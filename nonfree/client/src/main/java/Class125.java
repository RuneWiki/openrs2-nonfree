import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class125 {

	@OriginalMember(owner = "client!gaa", name = "h", descriptor = "Lclient!si;")
	private final Class338 aClass338_19 = new Class338(64);

	@OriginalMember(owner = "client!gaa", name = "g", descriptor = "Lclient!lb;")
	private final Class221 aClass221_56;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
	public final int anInt3485;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;)V")
	public Class125(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2) {
		this.aClass221_56 = arg2;
		if (this.aClass221_56 == null) {
			this.anInt3485 = 0;
		} else {
			this.anInt3485 = this.aClass221_56.method5065(47);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
	public void method2980() {
		@Pc(2) Class338 local2 = this.aClass338_19;
		synchronized (this.aClass338_19) {
			this.aClass338_19.method8051();
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II)V")
	public void method2981() {
		@Pc(13) Class338 local13 = this.aClass338_19;
		synchronized (this.aClass338_19) {
			this.aClass338_19.method8052(5);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IB)Lclient!qc;")
	public Class299 method2982(@OriginalArg(0) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_19;
		@Pc(21) Class299 local21;
		synchronized (this.aClass338_19) {
			local21 = (Class299) this.aClass338_19.method8049((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(35) Class221 local35 = this.aClass221_56;
		@Pc(44) byte[] local44;
		synchronized (this.aClass221_56) {
			local44 = this.aClass221_56.method5089(arg0, 47);
		}
		local21 = new Class299();
		if (local44 != null) {
			local21.method7260(new Class3_Sub28(local44));
		}
		@Pc(68) Class338 local68 = this.aClass338_19;
		synchronized (this.aClass338_19) {
			this.aClass338_19.method8044((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)V")
	public void method2987() {
		@Pc(2) Class338 local2 = this.aClass338_19;
		synchronized (this.aClass338_19) {
			this.aClass338_19.method8047();
		}
	}
}
