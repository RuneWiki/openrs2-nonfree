import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ema")
public final class Class98 {

	@OriginalMember(owner = "client!ema", name = "h", descriptor = "Lclient!si;")
	private Class338 aClass338_9 = new Class338(128);

	@OriginalMember(owner = "client!ema", name = "e", descriptor = "Lclient!si;")
	public Class338 aClass338_10 = new Class338(64);

	@OriginalMember(owner = "client!ema", name = "n", descriptor = "Lclient!lb;")
	private final Class221 aClass221_40;

	@OriginalMember(owner = "client!ema", name = "b", descriptor = "Lclient!lb;")
	public final Class221 aClass221_41;

	@OriginalMember(owner = "client!ema", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;Lclient!lb;)V")
	public Class98(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2, @OriginalArg(3) Class221 arg3) {
		this.aClass221_40 = arg2;
		this.aClass221_41 = arg3;
		this.aClass221_40.method5065(36);
	}

	@OriginalMember(owner = "client!ema", name = "a", descriptor = "(BII)V")
	public void method2446(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass338_9 = new Class338(arg1);
		this.aClass338_10 = new Class338(arg0);
	}

	@OriginalMember(owner = "client!ema", name = "a", descriptor = "(IZ)V")
	public void method2447() {
		@Pc(2) Class338 local2 = this.aClass338_9;
		synchronized (this.aClass338_9) {
			this.aClass338_9.method8052(5);
		}
		local2 = this.aClass338_10;
		synchronized (this.aClass338_10) {
			this.aClass338_10.method8052(5);
		}
	}

	@OriginalMember(owner = "client!ema", name = "a", descriptor = "(B)V")
	public void method2449() {
		@Pc(6) Class338 local6 = this.aClass338_9;
		synchronized (this.aClass338_9) {
			this.aClass338_9.method8051();
		}
		local6 = this.aClass338_10;
		synchronized (this.aClass338_10) {
			this.aClass338_10.method8051();
		}
	}

	@OriginalMember(owner = "client!ema", name = "a", descriptor = "(II)Lclient!faa;")
	public Class105 method2452(@OriginalArg(0) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_9;
		@Pc(21) Class105 local21;
		synchronized (this.aClass338_9) {
			local21 = (Class105) this.aClass338_9.method8049((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(35) Class221 local35 = this.aClass221_40;
		@Pc(44) byte[] local44;
		synchronized (this.aClass221_40) {
			local44 = this.aClass221_40.method5089(arg0, 36);
		}
		local21 = new Class105();
		local21.aClass98_1 = this;
		local21.anInt3088 = arg0;
		if (local44 != null) {
			local21.method2659(new Class3_Sub28(local44));
		}
		local21.method2657();
		@Pc(77) Class338 local77 = this.aClass338_9;
		synchronized (this.aClass338_9) {
			this.aClass338_9.method8044((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ema", name = "b", descriptor = "(B)V")
	public void method2453() {
		@Pc(2) Class338 local2 = this.aClass338_9;
		synchronized (this.aClass338_9) {
			this.aClass338_9.method8047();
		}
		local2 = this.aClass338_10;
		synchronized (this.aClass338_10) {
			this.aClass338_10.method8047();
		}
	}
}
