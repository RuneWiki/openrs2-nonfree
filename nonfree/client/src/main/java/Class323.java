import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rka")
public final class Class323 {

	@OriginalMember(owner = "client!rka", name = "p", descriptor = "I")
	public int anInt9267;

	@OriginalMember(owner = "client!rka", name = "w", descriptor = "Z")
	public boolean aBoolean679 = false;

	@OriginalMember(owner = "client!rka", name = "m", descriptor = "Lclient!si;")
	private Class338 aClass338_50 = new Class338(64);

	@OriginalMember(owner = "client!rka", name = "a", descriptor = "Lclient!si;")
	public final Class338 aClass338_51 = new Class338(500);

	@OriginalMember(owner = "client!rka", name = "f", descriptor = "Lclient!si;")
	public final Class338 aClass338_52 = new Class338(30);

	@OriginalMember(owner = "client!rka", name = "c", descriptor = "Lclient!si;")
	public final Class338 aClass338_53 = new Class338(50);

	@OriginalMember(owner = "client!rka", name = "y", descriptor = "Z")
	public boolean aBoolean680;

	@OriginalMember(owner = "client!rka", name = "u", descriptor = "I")
	private final int anInt9263;

	@OriginalMember(owner = "client!rka", name = "g", descriptor = "Lclient!lb;")
	public final Class221 aClass221_142;

	@OriginalMember(owner = "client!rka", name = "n", descriptor = "Lclient!iga;")
	private final Class169 aClass169_6;

	@OriginalMember(owner = "client!rka", name = "b", descriptor = "Lclient!lb;")
	private final Class221 aClass221_141;

	@OriginalMember(owner = "client!rka", name = "d", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray36;

	@OriginalMember(owner = "client!rka", name = "<init>", descriptor = "(Lclient!iga;IZLclient!lb;Lclient!lb;)V")
	public Class323(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class221 arg3, @OriginalArg(4) Class221 arg4) {
		this.aBoolean680 = arg2;
		this.anInt9263 = arg1;
		this.aClass221_142 = arg4;
		this.aClass169_6 = arg0;
		this.aClass221_141 = arg3;
		if (this.aClass221_141 != null) {
			@Pc(53) int local53 = this.aClass221_141.method5080() - 1;
			this.aClass221_141.method5065(local53);
		}
		if (this.aClass169_6 == Static615.aClass169_7) {
			this.aStringArray36 = new String[] { null, null, null, null, null, Static476.aClass279_22.method6992(this.anInt9263) };
		} else {
			this.aStringArray36 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!rka", name = "b", descriptor = "(II)Lclient!hca;")
	public Class144 method7792(@OriginalArg(0) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_50;
		@Pc(16) Class144 local16;
		synchronized (this.aClass338_50) {
			local16 = (Class144) this.aClass338_50.method8049((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class221 local30 = this.aClass221_141;
		@Pc(43) byte[] local43;
		synchronized (this.aClass221_141) {
			local43 = this.aClass221_141.method5089(Static273.method4190(arg0), Static124.method2115(arg0));
		}
		local16 = new Class144();
		local16.aClass323_2 = this;
		local16.anInt4397 = arg0;
		local16.aStringArray15 = (String[]) this.aStringArray36.clone();
		if (local43 != null) {
			local16.method3625(new Class3_Sub28(local43));
		}
		local16.method3627();
		if (!this.aBoolean680 && local16.aBoolean385) {
			local16.aStringArray15 = null;
			local16.anIntArray238 = null;
		}
		if (local16.aBoolean376) {
			local16.aBoolean374 = false;
			local16.anInt4411 = 0;
		}
		@Pc(109) Class338 local109 = this.aClass338_50;
		synchronized (this.aClass338_50) {
			this.aClass338_50.method8044((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rka", name = "a", descriptor = "(I)V")
	public void method7793() {
		@Pc(6) Class338 local6 = this.aClass338_50;
		synchronized (this.aClass338_50) {
			this.aClass338_50.method8051();
		}
		local6 = this.aClass338_51;
		synchronized (this.aClass338_51) {
			this.aClass338_51.method8051();
		}
		local6 = this.aClass338_52;
		synchronized (this.aClass338_52) {
			this.aClass338_52.method8051();
		}
		local6 = this.aClass338_53;
		synchronized (this.aClass338_53) {
			this.aClass338_53.method8051();
		}
	}

	@OriginalMember(owner = "client!rka", name = "a", descriptor = "(B)V")
	public void method7794() {
		@Pc(2) Class338 local2 = this.aClass338_50;
		synchronized (this.aClass338_50) {
			this.aClass338_50.method8047();
		}
		local2 = this.aClass338_51;
		synchronized (this.aClass338_51) {
			this.aClass338_51.method8047();
		}
		local2 = this.aClass338_52;
		synchronized (this.aClass338_52) {
			this.aClass338_52.method8047();
		}
		local2 = this.aClass338_53;
		synchronized (this.aClass338_53) {
			this.aClass338_53.method8047();
		}
	}

	@OriginalMember(owner = "client!rka", name = "a", descriptor = "(ZZ)V")
	public void method7795(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean680 != arg0) {
			this.aBoolean680 = arg0;
			this.method7793();
		}
	}

	@OriginalMember(owner = "client!rka", name = "a", descriptor = "(IB)V")
	public void method7796(@OriginalArg(0) int arg0) {
		this.anInt9267 = arg0;
		@Pc(14) Class338 local14 = this.aClass338_51;
		synchronized (this.aClass338_51) {
			this.aClass338_51.method8051();
		}
		local14 = this.aClass338_52;
		synchronized (this.aClass338_52) {
			this.aClass338_52.method8051();
		}
		local14 = this.aClass338_53;
		synchronized (this.aClass338_53) {
			this.aClass338_53.method8051();
		}
	}

	@OriginalMember(owner = "client!rka", name = "a", descriptor = "(II)V")
	public void method7798() {
		@Pc(6) Class338 local6 = this.aClass338_50;
		synchronized (this.aClass338_50) {
			this.aClass338_50.method8052(5);
		}
		local6 = this.aClass338_51;
		synchronized (this.aClass338_51) {
			this.aClass338_51.method8052(5);
		}
		local6 = this.aClass338_52;
		synchronized (this.aClass338_52) {
			this.aClass338_52.method8052(5);
		}
		local6 = this.aClass338_53;
		synchronized (this.aClass338_53) {
			this.aClass338_53.method8052(5);
		}
	}

	@OriginalMember(owner = "client!rka", name = "c", descriptor = "(II)V")
	public void method7799(@OriginalArg(0) int arg0) {
		this.aClass338_50 = new Class338(arg0);
	}

	@OriginalMember(owner = "client!rka", name = "b", descriptor = "(ZZ)V")
	public void method7800(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean679 != arg0) {
			this.aBoolean679 = arg0;
			this.method7793();
		}
	}
}
