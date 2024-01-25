import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class307 {

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
	public int anInt8965;

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "Lclient!si;")
	private final Class338 aClass338_45 = new Class338(64);

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "Lclient!si;")
	public final Class338 aClass338_46 = new Class338(60);

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "Lclient!lb;")
	private final Class221 aClass221_135;

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "Lclient!lb;")
	public final Class221 aClass221_136;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;Lclient!lb;)V")
	public Class307(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2, @OriginalArg(3) Class221 arg3) {
		this.aClass221_135 = arg2;
		this.aClass221_136 = arg3;
		@Pc(26) int local26 = this.aClass221_135.method5080() - 1;
		this.aClass221_135.method5065(local26);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)V")
	public void method7488(@OriginalArg(0) int arg0) {
		this.anInt8965 = arg0;
		@Pc(14) Class338 local14 = this.aClass338_46;
		synchronized (this.aClass338_46) {
			this.aClass338_46.method8051();
		}
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)V")
	public void method7489() {
		@Pc(2) Class338 local2 = this.aClass338_45;
		synchronized (this.aClass338_45) {
			this.aClass338_45.method8051();
		}
		local2 = this.aClass338_46;
		synchronized (this.aClass338_46) {
			this.aClass338_46.method8051();
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	public void method7491() {
		@Pc(6) Class338 local6 = this.aClass338_45;
		synchronized (this.aClass338_45) {
			this.aClass338_45.method8047();
		}
		local6 = this.aClass338_46;
		synchronized (this.aClass338_46) {
			this.aClass338_46.method8047();
		}
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(II)V")
	public void method7492() {
		@Pc(14) Class338 local14 = this.aClass338_45;
		synchronized (this.aClass338_45) {
			this.aClass338_45.method8052(5);
		}
		local14 = this.aClass338_46;
		synchronized (this.aClass338_46) {
			this.aClass338_46.method8052(5);
		}
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(II)Lclient!qr;")
	public Class310 method7493(@OriginalArg(1) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_45;
		@Pc(16) Class310 local16;
		synchronized (this.aClass338_45) {
			local16 = (Class310) this.aClass338_45.method8049((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class221 local30 = this.aClass221_135;
		@Pc(43) byte[] local43;
		synchronized (this.aClass221_135) {
			local43 = this.aClass221_135.method5089(Static546.method7735(arg0), Static516.method8181(arg0));
		}
		local16 = new Class310();
		local16.aClass307_1 = this;
		local16.anInt8988 = arg0;
		if (local43 != null) {
			local16.method7509(new Class3_Sub28(local43));
		}
		@Pc(73) Class338 local73 = this.aClass338_45;
		synchronized (this.aClass338_45) {
			this.aClass338_45.method8044((long) arg0, local16);
			return local16;
		}
	}
}
